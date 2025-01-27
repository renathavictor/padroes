package modelo;

public class EditorTexto extends AppEscritorio {

	public EditorTexto(EditorTexto editorTexto) {
		this.nome = editorTexto.getNome();
		this.path = editorTexto.getPath();
		this.data = editorTexto.getData();
		this.propriet�rio = editorTexto.getPropriet�rio();
		this.email = editorTexto.getEmail();
	}
	
	public EditorTexto() {
		System.out.println("Editor de texto criado");
	}
	
	@Override
	public AppEscritorio clonar() throws Exception {
		if (this.isCopia())
			return new EditorTexto(this);
		throw new Exception("Arquivo n�o pode ser copiado");
	}

}
