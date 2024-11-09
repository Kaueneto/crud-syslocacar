package org.crudsyslocacar.model.entity;

import java.util.Date;
import java.util.List;

public class Veiculo {

    private Long id;
    private String placa;
    private String chassis;
    private Date anoFabricacao;
    private String Cor;
    private String Status;
    private String Mmrca;
    private String modelo;
    private List<Manutencao> manutencaoList;

}
