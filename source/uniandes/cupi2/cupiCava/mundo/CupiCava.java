/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_cupiCava
 * Autor: Equipo Cupi2 2020
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.cupiCava.mundo;

import java.util.ArrayList;

/**
 * Clase que representa la Cupi-Cava. <br>
 * <b>inv: </b> <br>
 * TODO Parte1 PuntoC: Declare la invariante de la clase.
 */
public class CupiCava
{
    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * Lista de vinos en la cava.
     */
    private ArrayList<Vino> vinos;

    // -------------------------------------------------------------
    // M�todo Constructor
    // -------------------------------------------------------------

    /**
     * Construye una nueva cava sin vinos. <br>
     * <b>post:</b> La lista de vinos ha sido inicializada.
     */
    public CupiCava( )
    {
        vinos = new ArrayList<Vino>( );
    }

    // -------------------------------------------------------------
    // M�todos
    // -------------------------------------------------------------

    /**
     * Retorna la lista de vinos.
     * @return Lista de vinos.
     */
    public ArrayList<Vino> darVinos( )
    {
        return vinos;
    }

    /**
     * Busca un vino con el nombre dado por par�metro. <br>
     * <b>pre:</b> La lista de vinos est� inicializada.
     * @param pNombre Nombre del vino. pNombre != null && pNombre != ""
     * @return Vino con el nombre dado, null en caso de no encontrarlo.
     */
    public Vino buscarVino( String pNombre )
    {
        Vino buscado = null;
        boolean encontre = false;

        for( int i = 0; i < vinos.size( ) && !encontre; i++ )
        {
            Vino vinoActual = ( Vino )vinos.get( i );
            if( vinoActual.darNombre( ).equalsIgnoreCase( pNombre ) )
            {
                buscado = vinoActual;
                encontre = true;
            }
        }

        return buscado;
    }
    
    /**
     * Agrega un nuevo vino a la cava si no existe actualmente un vino en la cava con el mismo nombre.<br>
     * <b>pre:</b> La lista de vinos est� inicializada.<br>
     * <b>post:</b> Se agreg� un nuevo vino a la lista de vinos.<br>
     * @param pNombre Nombre del vino. pNombre != null && pNombre != "".
     * @param pPresentacion Presentaci�n del vino. pPresentacion != null && pPresentacion != "" && (pPresentacion == BOTELLA || pPresentacion == BARRIL).
     * @param pAnhoElaboracion A�o de elaboraci�n del vino. pAnhoElaboracion > 0.
     * @param pContenidoAzucar Contenido en az�car del vino. pContenidoAzucar >= 0
     * @param pTipo Tipo de vino de acuerdo a su contenido en az�car. pTipo != null && pTipo != "" && (pTipo == SECO || pTipo == ABOCADO || pTipo == SEMI_SECO || pTipo ==
     *        SEMI_DULCE || pTipo == DULCE).
     * @param pColor Color del vino. pColor != null && pColor != "" && (pColor == TINTO || pColor == ROSADO || pColor == BLANCO).
     * @param pLugarOrigen Lugar de origen del vino. lugarElaboracion != null y lugarElaboracion != "".
     * @param pImagen Imagen del vino. pImagen != null && pImagen != "".
     * @return True si el vino es agregado, false de lo contrario.
     */
    public boolean agregarVino( String pNombre, String pPresentacion, int pAnhoElaboracion, double pContenidoAzucar, String pTipo, String pColor, String pLugarOrigen, String pImagen )
    {
        Vino buscado = buscarVino( pNombre );
        boolean agregada = false;

        if( buscado == null )
        {
            Vino vino = new Vino( pNombre, pPresentacion, pAnhoElaboracion, pContenidoAzucar, pTipo, pColor, pLugarOrigen, pImagen );
            vinos.add( vino );
            agregada = true;
        }

        return agregada;
    }
    
    /**
     * Ordena ascendentemente la lista de vinos por nombre usando el algoritmo de burbuja. <br>
     * <b>pre:</b> La lista de vinos est� inicializada. <br>
     * <b>post:</b> La lista de vinos est� ordenada por nombre (orden ascendente).
     */
    public void ordenarVinosPorNombre( )
    {
   	 // TODO Parte2 PuntoL: Implemente el m�todo seg�n la documentaci�n dada.
    	for (int i = 0; i < vinos.size() - 1; i++) {
			for (int j = 0; j < vinos.size() - 1 - i; j++) {
				if (vinos.get(j).darNombre().compareToIgnoreCase(vinos.get(j + 1).darNombre()) > 0) {
					// Intercambiar los vinos
					Vino temp = vinos.get(j);
					vinos.set(j, vinos.get(j + 1));
					vinos.set(j + 1, temp);
				}
			}
		}
    }

    /**
     * Ordena descendentemente la lista de vinos por a�o de elaboraci�n usando el algoritmo de selecci�n. <br>
     * <b>pre:</b> La lista de vinos est� inicializada. <br>
     * <b>post:</b> La lista de vinos est� ordenada por a�o de elaboraci�n (orden descendente).
     */
    public void ordenarVinosPorAnhoElaboracion( )
    {
   	 // TODO Parte2 PuntoM: Implemente el m�todo seg�n la documentaci�n dada.
    }
    
    /**
     * 
     */
    public void ordenarVinosPorPresentacion( )
	{
   	 // TODO Parte2 PuntoO: Implemente el m�todo seg�n la documentaci�n dada.
	}
    
    /**
     * 
     */
    public void ordenarVinosPorContenidoAzucar()
	{
   	 // TODO Parte2 PuntoP: Implemente el m�todo seg�n la documentaci�n dada.
	}
    
    /**
     * 
     */
    public void ordenarVinosPorTipo() {
   	 // TODO Parte2 PuntoQ: Implemente el m�todo seg�n la documentaci�n dada.
    }
    
    /**
     * 
     */
    public void ordenarVinosPorColor() {
   	 // TODO Parte2 PuntoR: Implemente el m�todo seg�n la documentaci�n dada.
	}
    
    /**
     * Ordena ascendentemente la lista de vinos por lugar de origen usando el algoritmo de inserci�n. <br>
     * <b>pre:</b> La lista de vinos est� inicializada.<br>
     * <b> post: </b>La lista de vinos est� ordenada por lugar de origen (orden ascendente).
     */
    public void ordenarVinosPorLugarOrigen( )
    {
   	 // TODO Parte2 PuntoN: Implemente el m�todo seg�n la documentaci�n dada.
    }

    /**
     * Busca un vino utilizando una b�squeda binaria. <br>
     * <b>pre: </b> La lista de vinos est� inicializada y se encuentra ordenada por nombre.
     * @param pNombre Nombre del vino que se va a buscar. pNombre != null && pNombre != "".
     * @return Vino con el nombre dado, null en caso de no encontrarlo.
     */
    public Vino buscarBinarioPorNombre( String pNombre )
    {
   	 // TODO Parte2 PuntoH: Implemente el m�todo seg�n la documentaci�n dada.
    			int inicio = 0;
		int fin = vinos.size() - 1;
		Vino encontrado = null;

		while (inicio <= fin) {
			int medio = (inicio + fin) / 2;
			Vino vinoActual = vinos.get(medio);

			if (vinoActual.darNombre().equalsIgnoreCase(pNombre)) {
				encontrado = vinoActual;
				break;
			} else if (vinoActual.darNombre().compareToIgnoreCase(pNombre) < 0) {
				inicio = medio + 1;
			} else {
				fin = medio - 1;
			}
		}

		return encontrado;
    }

    /**
     * Busca el vino m�s dulce (con mayor contenido en az�car) de la cava. <br>
     * <b>pre:</b> La lista de vinos est� inicializada.
     * @return Vino m�s dulce de la cava. Si la cava no tiene vinos se retorna null. Si existen varios vinos con el contenido en az�car m�s alto, se retorna el primer vino
     *         encontrado.
     */
    public Vino buscarVinoMasDulce( )
    {
   	 // TODO Parte2 PuntoI: Implemente el m�todo seg�n la documentaci�n dada.
    			if (vinos.isEmpty()) {
			return null;
		}

		Vino vinoMasDulce = vinos.get(0);
		for (Vino vino : vinos) {
			if (vino.darContenidoAzucar() > vinoMasDulce.darContenidoAzucar()) {
				vinoMasDulce = vino;
			}
		}
		return vinoMasDulce;
    }

    /**
     * Busca el vino m�s seco (con menor contenido en az�car) de la cava. <br>
     * <b>pre:</b> La lista de vinos est� inicializada.
     * @return Vino m�s seco de la cava. Si la cava no tiene vinos se retorna null. Si existen varios vinos con el contenido en az�car m�s bajo, se retorna el primer vino
     *         encontrado.
     */
    public Vino buscarVinoMasSeco( )
    {
   	 // TODO Parte2 PuntoJ: Implemente el m�todo seg�n la documentaci�n dada.
    			if (vinos.isEmpty()) {
			return null;
		}

		Vino vinoMasSeco = vinos.get(0);
		for (Vino vino : vinos) {
			if (vino.darContenidoAzucar() < vinoMasSeco.darContenidoAzucar()) {
				vinoMasSeco = vino;
			}
		}
		return vinoMasSeco;
   }

    /**
     * Busca los vinos del tipo dado por par�metro. <br>
     * <b>pre:</b> La lista de vinos est� inicializada.
     * @param pTipo Tipo de vino de acuerdo a su contenido en az�car.pTipo != null && pTipo != "" && (pTipo == SECO || pTipo == ABOCADO || pTipo == SEMI_SECO || pTipo ==
     *        SEMI_DULCE || pTipo == DULCE).
     * @return Lista de vinos del tipo dado.
     */
    public ArrayList<Vino> buscarVinosDeTipo( String pTipo )
    {
   	 // TODO Parte2 PuntoK: Implemente el m�todo seg�n la documentaci�n dada.
    			ArrayList<Vino> vinosDeTipo = new ArrayList<Vino>( );
		
		for (Vino vino : vinos) {
			if (vino.darTipo().equalsIgnoreCase(pTipo)) {
				vinosDeTipo.add(vino);
			}
		}
		
		return vinosDeTipo;
   }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------

    /**
     * Verifica la invariante de la clase
     * @throws RuntimeException si la invariante no se cumple
     */
    public void verificarInvariante() {
        // Verificar que la lista no sea nula
        if (vinos == null) {
            throw new RuntimeException("La lista de vinos no puede ser nula");
        }
        
        // Verificar que no haya elementos nulos
        for (Vino vino : vinos) {
            if (vino == null) {
                throw new RuntimeException("No pueden existir vinos nulos");
            }
            // Verificar invariante de cada vino
            if (vino.verficarInvariante() == -1) {
                throw new RuntimeException("La invariante del vino no se cumple");
            }
        }
    }
    
    /**
     * 
     */
    public boolean buscarVinosConNombreRepetido()
	{
   	 // TODO Parte2 PuntoG: Implemente el m�todo seg�n la documentaci�n dada.
   	 // Retorna true si existe un vino con el nombre dado, false de lo contrario.
    	for (int i = 0; i < vinos.size(); i++) {
            for (int j = i + 1; j < vinos.size(); j++) {
                if (vinos.get(i).darNombre().equals(vinos.get(j).darNombre())) {
                    return true;
                }
            }
        }
        return false;
	}
    
    

    // TODO Parte1 PuntoD: Documente e implemente el m�todo verificarInvariante. Si lo desea puede crear m�todos privados en esta parte.

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1.
     * @return Respuesta 1.
     */
    public String metodo1( )
    {
        return "Respuesta 1.";
    }

    /**
     * M�todo para la extensi�n 2.
     * @return Respuesta 2.
     */
    public String metodo2( )
    {
        return "Respuesta 2.";
    }
}