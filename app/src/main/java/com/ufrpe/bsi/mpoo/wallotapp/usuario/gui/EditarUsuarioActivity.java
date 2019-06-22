package com.ufrpe.bsi.mpoo.wallotapp.usuario.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ufrpe.bsi.mpoo.wallotapp.R;
import com.ufrpe.bsi.mpoo.wallotapp.infra.gui.ConfiguracaoActivity;
import com.ufrpe.bsi.mpoo.wallotapp.infra.negocio.SessaoUsuario;
import com.ufrpe.bsi.mpoo.wallotapp.usuario.dominio.Usuario;
import com.ufrpe.bsi.mpoo.wallotapp.usuario.negocio.UsuarioServices;

public class EditarUsuarioActivity extends AppCompatActivity {
    EditText editNome,editEmail,editSenha;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_usuario);
        final Usuario usuario = SessaoUsuario.instance.getUsuario();
        getSupportActionBar().setTitle("Editar Usuário");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        editNome = findViewById(R.id.edit_nome_alterar);
        editEmail = findViewById(R.id.edit_email_alterar);
        editSenha = findViewById(R.id.edit_senha_alterar);
        btnSalvar = findViewById(R.id.buttonSalvar);

        editNome.setHint(usuario.getNome());
        editEmail.setHint(usuario.getEmail());

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editaSalvaDados();
            }
        });

    }
    private void editaSalvaDados() {
        String nome = editNome.getText().toString();
        String email = editEmail.getText().toString();
        String senha = editSenha.getText().toString();

        if(validateFieldsUsuario(nome, email, senha)){
            UsuarioServices usuarioServices = new UsuarioServices();
            Usuario userEditado = new Usuario(nome, email, senha);
            if(usuarioServices.emailCadastrado(userEditado) == null){
                usuarioServices.alterarDados(userEditado);
                startActivity(new Intent(EditarUsuarioActivity.this, EditarUsuarioActivity.class));
                Toast.makeText(EditarUsuarioActivity.this, "Dados editados", Toast.LENGTH_LONG).show();
                //this.recreate();
            } else{
                Toast.makeText(EditarUsuarioActivity.this, "Email já cadastrado", Toast.LENGTH_LONG).show();
            }
        }

    }

    private boolean validateFieldsUsuario(String nome, String email, String senha){
        boolean res = true;
        editEmail.setError(null);
        editSenha.setError(null);
        editSenha.setError(null);
        View focusView = null;
        if (!validateName(nome) ){
            editNome.setError("Nome inválido, não aceito caracteres especiais");
            focusView = editNome;
            res = false;
        }
        if(!validateLenght(senha, 5) && !senha.isEmpty()) {
            editSenha.setError("Senha inválida(menor que 5 caracteres");
            focusView = editSenha;
            res = false;
        }
        if(!validateEmail(email) && !email.isEmpty()){
            editEmail.setError("Email inválido");
            focusView = editEmail;
            res = false;
        }
        return res;
    }

    private boolean validateEmail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean validateLenght(String str, int tam) {
        return str.length() > tam;
    }

    private boolean validateName (String nome) {
        return nome.matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü ]*$");
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(EditarUsuarioActivity.this, ConfiguracaoActivity.class));
    }

}
