package com.github.osvaldsoza

class Departamento {

    String nome

    static hasMany = [empregados: Empregado]

    static constraints = {
    }
}
