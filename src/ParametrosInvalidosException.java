//classe para definir a exceção personalizada e adicionar mensagem detalhada a ela para ser usada depois

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
