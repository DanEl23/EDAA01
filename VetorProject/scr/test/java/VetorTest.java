package scr.test.java;
import scr.main.java.Vetor;

public class VetorTest {

    public static void main(String[] args) {
        testAdicionarElemento();
        testVerificarQuantidadeElementos();
        testImprimirElementos();
        testObterElementoPosicao();
        testVerificarElementoExiste();
        testAdicionarElementoQualquerPosicao();
        testDuplicarTamanhoVetor();
        testRemoverElemento();
    }

    // 1. Adicionar elemento ao final do vetor
    public static void testAdicionarElemento() {
        Vetor<String> vetor = new Vetor<>(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        System.out.println("Teste Adicionar Elemento: " + vetor.toString());
        // Esperado: [Elemento 1, Elemento 2, Elemento 3]
    }

    // 2. Verificar a quantidade de elementos do vetor
    public static void testVerificarQuantidadeElementos() {
        Vetor<String> vetor = new Vetor<>(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        System.out.println("Teste Verificar Quantidade Elementos: " + vetor.tamanho());
        // Esperado: 2
    }

    // 3. Imprimir elementos do vetor
    public static void testImprimirElementos() {
        Vetor<String> vetor = new Vetor<>(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        System.out.println("Teste Imprimir Elementos: " + vetor.toString());
        // Esperado: [Elemento 1, Elemento 2, Elemento 3]
    }

    // 4. Obter elemento de uma posição do vetor
    public static void testObterElementoPosicao() {
        Vetor<String> vetor = new Vetor<>(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        System.out.println("Teste Obter Elemento Posição: " + vetor.busca(1));
        // Esperado: Elemento 2
    }

    // 5. Verificar se elemento existe no vetor
    public static void testVerificarElementoExiste() {
        Vetor<String> vetor = new Vetor<>(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        System.out.println("Teste Verificar Elemento Existe: " + vetor.busca("Elemento 2"));
        // Esperado: 1 (posição do elemento)
    }

    // 6. Adicionar elemento em qualquer posição do vetor
    public static void testAdicionarElementoQualquerPosicao() {
        Vetor<String> vetor = new Vetor<>(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 3");
        vetor.adiciona(1, "Elemento 2");
        System.out.println("Teste Adicionar Elemento Qualquer Posição: " + vetor.toString());
        // Esperado: [Elemento 1, Elemento 2, Elemento 3]
    }

    // 7. Duplicar o tamanho do vetor
    public static void testDuplicarTamanhoVetor() {
        Vetor<String> vetor = new Vetor<>(2);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3"); // Deve disparar o aumento de capacidade
        System.out.println("Teste Duplicar Tamanho Vetor: " + vetor.toString() + " | Tamanho do vetor: " + vetor.tamanho());
        // Esperado: [Elemento 1, Elemento 2, Elemento 3] | Tamanho do vetor: 3
    }

    // 8. Remover elemento do vetor
    public static void testRemoverElemento() {
        Vetor<String> vetor = new Vetor<>(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.remove(1);
        System.out.println("Teste Remover Elemento: " + vetor.toString());
        // Esperado: [Elemento 1, Elemento 3]
    }
}
