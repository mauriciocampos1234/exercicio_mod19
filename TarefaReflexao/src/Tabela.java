/**
 * @author MauricioCampos
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Definindo a anotação
@Target(ElementType.TYPE) // Pode ser aplicada a classes
@Retention(RetentionPolicy.RUNTIME) // A anotação estará disponível em tempo de execução
public @interface Tabela {
    String value(); // Definindo o valor para armazenar o nome da tabela
}

class Main {
    public static void main(String[] args) {
        // Verifica se a classe MinhaClasse possui a anotação Tabela
        if (MinhaClasse.class.isAnnotationPresent(Tabela.class)) {
            // Obtém a anotação Tabela da classe
            Tabela tabela = MinhaClasse.class.getAnnotation(Tabela.class);

            // Imprime o valor do nome da tabela no console
            System.out.println("Nome da Tabela: " + tabela.value());
        } else {
            System.out.println("A anotação Tabela não está presente na classe.");
        }
    }
}






