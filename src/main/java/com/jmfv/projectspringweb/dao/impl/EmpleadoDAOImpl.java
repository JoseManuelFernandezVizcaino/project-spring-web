/**
 * 
 */
package com.jmfv.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.jmfv.projectspringweb.dao.EmpleadoDAO;

/**
 * @author jmfer
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Jose Manuel Fernandez Vizcaino";
	}

}
