package com.ufrpe.bsi.mpoo.wallotapp.infra.persistencia;

import com.ufrpe.bsi.mpoo.wallotapp.R;
import com.ufrpe.bsi.mpoo.wallotapp.categoria.dominio.Categoria;
import com.ufrpe.bsi.mpoo.wallotapp.categoria.negocio.CategoriaServices;
import com.ufrpe.bsi.mpoo.wallotapp.subcategoria.dominio.SubCategoria;
import com.ufrpe.bsi.mpoo.wallotapp.subcategoria.negocio.SubCategoriaServices;

public class DBFill {
    private CategoriaServices categoriaServices = new CategoriaServices();
    private SubCategoriaServices subCategoriaServices = new SubCategoriaServices();
    public void start() {
        cadastraCategorias();
        cadastraSubCategorias();
    }
    private void cadastraCategorias(){
        Categoria categoria;


        categoria = new Categoria();
        categoria.setNome("Sem Categoria");
        categoria.setIcone(categoriaServices.bitmapToByteArray(R.drawable.icone_custom));
        categoria.setFkUsuario(0);
        categoriaServices.cadastrar(categoria);

        //Categoria Alimentação
        categoria = new Categoria();
        categoria.setNome("Alimentação");
        categoria.setIcone(categoriaServices.bitmapToByteArray(R.drawable.icone_alimentacao));
        categoriaServices.cadastroInicial(categoria);

        //Categoria Casa
        categoria = new Categoria();
        categoria.setNome("Casa");
        categoria.setIcone(categoriaServices.bitmapToByteArray(R.drawable.icone_casa));
        categoriaServices.cadastroInicial(categoria);


        //Categoria Compras
        categoria = new Categoria();
        categoria.setNome("Compras");
        categoria.setIcone(categoriaServices.bitmapToByteArray(R.drawable.icone_compras));
        categoriaServices.cadastroInicial(categoria);

        //Categoria Comunicação
        categoria = new Categoria();
        categoria.setNome("Comunicação");
        categoria.setIcone(categoriaServices.bitmapToByteArray(R.drawable.icone_comunicacao));
        categoriaServices.cadastroInicial(categoria);

        //Categoria Transporte
        categoria = new Categoria();
        categoria.setNome("Transporte");
        categoria.setIcone(categoriaServices.bitmapToByteArray(R.drawable.icone_transporte));
        categoriaServices.cadastroInicial(categoria);


        //Categoria Veículo
        categoria = new Categoria();
        categoria.setNome("Veículo");
        categoria.setIcone(categoriaServices.bitmapToByteArray(R.drawable.icone_veiculo));
        categoriaServices.cadastroInicial(categoria);

        //Categoria Vida e Lazer
        categoria = new Categoria();
        categoria.setNome("Vida e Lazer");
        categoria.setIcone(categoriaServices.bitmapToByteArray(R.drawable.icone_vida_lazer));
        categoriaServices.cadastroInicial(categoria);

        //Categoria Outros
        categoria = new Categoria();
        categoria.setNome("Outros");
        categoria.setIcone(categoriaServices.bitmapToByteArray(R.drawable.icone_custom));
        categoriaServices.cadastroInicial(categoria);
    }

    public void cadastraSubCategorias() {
        SubCategoria subCategoria;

        //Subcategoria Sem Subcategoria (Sem Categoria)

        subCategoria = new SubCategoria();

        subCategoria.setId(1);
        subCategoria.setNome("Sem SubCategoria");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_custom));
        subCategoria.setFkCategoria(1);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Fast Food (Alimentação)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Fast Food");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_fast_food));
        subCategoria.setFkCategoria(2);;

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Feira (Alimentação)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Feira");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_feira));
        subCategoria.setFkCategoria(2);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Restaurante (Alimentação)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Restaurante");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_restaurante));
        subCategoria.setFkCategoria(2);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Água (Casa)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Água");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_agua));
        subCategoria.setFkCategoria(3);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Aluguel (Casa)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Aluguel");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_aluguel));
        subCategoria.setFkCategoria(3);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Gás (Casa)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Gás");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_gas));
        subCategoria.setFkCategoria(3);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Luz (Casa)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Luz");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_luz));
        subCategoria.setFkCategoria(3);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Manuntenção (Casa)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Manuntenção");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_manuntencao_casa));
        subCategoria.setFkCategoria(3);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Animais (Compras)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Animais");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_animais));
        subCategoria.setFkCategoria(4);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Beleza (Compras)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Beleza");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_beleza));
        subCategoria.setFkCategoria(4);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Eletrônicos (Compras)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Eletrônicos");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_eletronicos));
        subCategoria.setFkCategoria(4);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Farmácia (Compras)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Farmácia");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_farmacia));
        subCategoria.setFkCategoria(4);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Vestuário (Compras)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Vestuário");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_vestuario));
        subCategoria.setFkCategoria(4);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Internet (Comunicação)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Internet");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_internet));
        subCategoria.setFkCategoria(5);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Serviços Postais (Comunicação)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Serviços Postais");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_servicos_postais));
        subCategoria.setFkCategoria(5);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Telefone (Comunicação)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Telefone");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_telefone));
        subCategoria.setFkCategoria(5);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Longas Distâncias (Transportes)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Longas Distâncias");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_longas_distancias));
        subCategoria.setFkCategoria(6);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Particular (Transportes)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Particular");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_transporte_particular));
        subCategoria.setFkCategoria(6);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Público (Transportes)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Público");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_transporte_publico));
        subCategoria.setFkCategoria(6);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Combustível (Veículo)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Combustível");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_combustivel));
        subCategoria.setFkCategoria(7);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Estacionamento (Veículo)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Estacionamento");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_estacionamento));
        subCategoria.setFkCategoria(7);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Manuntenção (Veículo)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Manuntenção");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_manuntencao_carro));
        subCategoria.setFkCategoria(7);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Seguro (Veículo)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Seguro");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_seguro));
        subCategoria.setFkCategoria(7);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Bebida e Cigarro (Vida e Lazer)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Bebida e Cigarro");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_bebida_cigarro));
        subCategoria.setFkCategoria(8);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Educação (Vida e Lazer)

        subCategoria = new SubCategoria();;
        subCategoria.setNome("Educação");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_educacao));
        subCategoria.setFkCategoria(8);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Fitness (Vida e Lazer)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Fitness");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_fitness));
        subCategoria.setFkCategoria(8);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Saúde (Vida e Lazer)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Saúde");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_saude));
        subCategoria.setFkCategoria(8);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Software e Jogos (Vida e Lazer)

        subCategoria = new SubCategoria();
        subCategoria.setNome("Software e Jogos");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_software));
        subCategoria.setFkCategoria(8);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria TV e Streaming (Vida e Lazer)

        subCategoria = new SubCategoria();
        subCategoria.setNome("TV e Streaming");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_tv_streaming));
        subCategoria.setFkCategoria(8);

        subCategoriaServices.cadastrarInicial(subCategoria);

        //Subcategoria Viagens (Vida e Lazer)
        subCategoria = new SubCategoria();
        subCategoria.setNome("Viagens");
        subCategoria.setIcone(subCategoriaServices.bitmapToByteArray(R.drawable.icone_viagens));
        subCategoria.setFkCategoria(8);

        subCategoriaServices.cadastrarInicial(subCategoria);
    }
}
