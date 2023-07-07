import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<Cliente> clienteClass = Cliente.class;

        Annotation[] annotations = clienteClass.getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation instanceof Tabela) {
                Tabela tabela = (Tabela) annotation;
                String nomeTabela = tabela.value();
                System.out.println("Nome da tabela: " + nomeTabela);
            }
        }
    }
}