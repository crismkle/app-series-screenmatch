package com.aluracursos.screenmatch.service;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);     //<T> T Indicando un tipo de dato genérico
}
