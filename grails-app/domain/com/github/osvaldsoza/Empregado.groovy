package com.github.osvaldsoza

class Empregado {

    String nome
    String sobreNome

    static belongsTo = [departamento: Departamento]

    static constraints = {
    }
}
