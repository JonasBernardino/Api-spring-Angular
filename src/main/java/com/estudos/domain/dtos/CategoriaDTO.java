package com.estudos.domain.dtos;

import com.estudos.domain.Categoria;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CategoriaDTO {
    private Long id;
    private String name;
    private String descricao;

    public CategoriaDTO(Categoria obj){
        this.id = obj.getId();
        this.name = obj.getName();
        this.descricao = obj.getDescricao();
    }
}
