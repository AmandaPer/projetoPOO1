import java.util.ArrayList;

public class Fila {
	private ArrayList<Paciente> pacientes;
	
	public Fila(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
		
	}
	
	public ArrayList<Paciente> getPacientes(){
		return this.pacientes;
	}
	
	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public void addPacienteNaFila(ArrayList<Paciente> pacientes) {
		ArrayList<Fila> fila = new ArrayList<Fila>();
		for(Paciente p: this.pacientes) {
			if(p != null) {
				this.pacientes.add(fila);
			}
		}
	}
	
}
