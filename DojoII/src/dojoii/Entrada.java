package dojoii;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pablo e ricardo
 */
public class Entrada {

    private String entrada;
    private String ultimo = "";
    private int tamanho;
    private List saida = new ArrayList<String>();

    //---------------------------TRATAMENTO DE ENTRADA--------------------------
    /**
      Recebe uma cadeia de caracteres e transforma em um array
      em seguida, destina o array para metodos de verificação, identificação e
      formatação
    */
    public void lerEntrada() {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] caracteres = entrada.split("");
        
        //chamada dos métodos de verificação
        isString(caracteres);
        identificacaoDasLetras(caracteres);
        
        if (verificarTamanho(caracteres)) {
            exit(0);
        }
        
        //exiir saida formatada
        formatarSaida();
    }

    //Verifica se todos os caracteres do array são váldos
    public void isString(String[] entrada) {
        for (String caractere : entrada) {
            if (caractere instanceof String) {
                continue;
            } else {
                excecaoEntradaInvalida();
                exit(0);
            }
        }
    }

    //Verifica os caracteres do array e salva em outro array os valores numéricos
    public void identificacaoDasLetras(String[] entrada) {
        isString(entrada);
        for (String entrada1 : entrada) {
            if ("A".equals(entrada1)) {
                if (!"2".equals(ultimo)) {
                    saida.add("2");
                    setLast("2");
                } else {
                    addUnderscorre(saida, "2");
                    setLast("2");
                }
            }
            if ("B".equals(entrada1)) {
                if (!"2".equals(ultimo)) {
                    saida.add("22");
                    setLast("2");
                } else {
                    addUnderscorre(saida, "22");
                    setLast("2");
                }
            }
            if ("C".equals(entrada1)) {
                if (!"2".equals(ultimo)) {
                    saida.add("222");
                    setLast("2");
                } else {
                    addUnderscorre(saida, "222");
                    setLast("2");
                }
            }
            if ("D".equals(entrada1)) {
                if (!"3".equals(ultimo)) {
                    saida.add("3");
                    setLast("3");
                } else {
                    addUnderscorre(saida, "3");
                    setLast("3");
                }
            }
            if ("E".equals(entrada1)) {
                if (!"3".equals(ultimo)) {
                    saida.add("33");
                    setLast("3");
                } else {
                    addUnderscorre(saida, "33");
                    setLast("3");
                }
            }
            if ("F".equals(entrada1)) {
                if (!"3".equals(ultimo)) {
                    saida.add("333");
                    setLast("3");
                } else {
                    addUnderscorre(saida, "333");
                    setLast("3");
                }
            }
            if ("G".equals(entrada1)) {
                if (!"4".equals(ultimo)) {
                    saida.add("4");
                    setLast("4");
                } else {
                    addUnderscorre(saida, "4");
                    setLast("4");
                }
            }
            if ("H".equals(entrada1)) {
                if (!"4".equals(ultimo)) {
                    saida.add("44");
                    setLast("4");
                } else {
                    addUnderscorre(saida, "44");
                    setLast("4");
                }
            }
            if ("I".equals(entrada1)) {
                if (!"4".equals(ultimo)) {
                    saida.add("444");
                    setLast("4");
                } else {
                    addUnderscorre(saida, "444");
                    setLast("4");
                }
            }
            if ("J".equals(entrada1)) {
                if (!"5".equals(ultimo)) {
                    saida.add("5");
                    setLast("5");
                } else {
                    addUnderscorre(saida, "5");
                    setLast("5");
                }
            }
            if ("K".equals(entrada1)) {
                if (!"5".equals(ultimo)) {
                    saida.add("55");
                    setLast("5");
                } else {
                    addUnderscorre(saida, "55");
                    setLast("5");
                }
            }
            if ("L".equals(entrada1)) {
                if (!"5".equals(ultimo)) {
                    saida.add("555");
                    setLast("5");
                } else {
                    addUnderscorre(saida, "555");
                    setLast("5");
                }
            }
            if ("M".equals(entrada1)) {
                if (!"6".equals(ultimo)) {
                    saida.add("6");
                    setLast("6");
                } else {
                    addUnderscorre(saida, "6");
                    setLast("6");
                }
            }
            if ("N".equals(entrada1)) {
                if (!"6".equals(ultimo)) {
                    saida.add("66");
                    setLast("6");
                } else {
                    addUnderscorre(saida, "66");
                    setLast("6");
                }
            }
            if ("O".equals(entrada1)) {
                if (!"6".equals(ultimo)) {
                    saida.add("666");
                    setLast("6");
                } else {
                    addUnderscorre(saida, "666");
                    setLast("6");
                }
            }
            if ("P".equals(entrada1)) {
                if (!"7".equals(ultimo)) {
                    saida.add("7");
                    setLast("7");
                } else {
                    addUnderscorre(saida, "7");
                    setLast("7");
                }
            }
            if ("Q".equals(entrada1)) {
                if (!"7".equals(ultimo)) {
                    saida.add("77");
                    setLast("7");
                } else {
                    addUnderscorre(saida, "77");
                    setLast("7");
                }
            }
            if ("R".equals(entrada1)) {
                if (!"7".equals(ultimo)) {
                    saida.add("777");
                    setLast("7");
                } else {
                    addUnderscorre(saida, "777");
                    setLast("7");
                }
            }
            if ("S".equals(entrada1)) {
                if (!"7".equals(ultimo)) {
                    saida.add("7777");
                    setLast("7");
                } else {
                    addUnderscorre(saida, "7777");
                    setLast("7");
                }
            }
            if ("T".equals(entrada1)) {
                if (!"8".equals(ultimo)) {
                    saida.add("8");
                    setLast("8");
                } else {
                    addUnderscorre(saida, "8");
                    setLast("8");
                }
            }
            if ("U".equals(entrada1)) {
                if (!"8".equals(ultimo)) {
                    saida.add("88");
                    setLast("8");
                } else {
                    addUnderscorre(saida, "88");
                    setLast("8");
                }
            }
            if ("V".equals(entrada1)) {
                if (!"8".equals(ultimo)) {
                    saida.add("888");
                    setLast("8");
                } else {
                    addUnderscorre(saida, "888");
                    setLast("8");
                }
            }
            if ("W".equals(entrada1)) {
                if (!"9".equals(ultimo)) {
                    saida.add("9");
                    setLast("9");
                } else {
                    addUnderscorre(saida, "9");
                    setLast("9");
                }
            }
            if ("X".equals(entrada1)) {
                if (!"9".equals(ultimo)) {
                    saida.add("99");
                    setLast("9");
                } else {
                    addUnderscorre(saida, "99");
                    setLast("9");
                }
            }
            if ("Y".equals(entrada1)) {
                if (!"9".equals(ultimo)) {
                    saida.add("999");
                    setLast("9");
                } else {
                    addUnderscorre(saida, "999");
                    setLast("9");
                }
            }
            if ("Z".equals(entrada1)) {
                if (!"9".equals(ultimo)) {
                    saida.add("9999");
                    setLast("9");
                } else {
                    addUnderscorre(saida, "9999");
                    setLast("9");
                }
            }
            if (" ".equals(entrada1)) {
                if (!"0".equals(ultimo)) {
                    saida.add("0");
                    setLast("0");
                } else {
                    addUnderscorre(saida, "0");
                    setLast("0");
                }
            }
        }
        tamanho++;
    }

    //Metodo responsável por identificar qual foi o ultimo caractere manipulado
    public void setLast(String ultimo) {
        this.ultimo = ultimo;
    }

    //Metodo responsável por verificar o tamanho da entrada
    public boolean verificarTamanho(String[] caracteres) {
        if (caracteres.length >= 256) {
            excecaoLimiteCaracteres();
            return true;
        }
        return false;
    }

    //---------------------------TRATAMENTO DA SAIDA----------------------------
    /**
     * Para o caso de repetição de tecla é adicionado um traço inferior para citar
     * que a sequencia numeroa seguinte pertence a outro caractere
     */
    public void addUnderscorre(List l, String c) {
        l.add("_" + c);
    }
    
    //Formata a saida de modo a remover os colchetes e virguas da saida em array
    public void formatarSaida() {
        StringBuilder builder = new StringBuilder();
        for (Object s : saida) {
            builder.append(s);
        }
        String saidaFinal = builder.toString();
        System.out.println(saidaFinal);
    }

    //---------------------------EXCEÇÕES---------------------------------------
    //Mensagem para entrada de dados com tipo diferente de String
    public void excecaoEntradaInvalida() {
        System.out.println("A entrada não é válida, insira caracteres de texto.");
    }

    //Exceção para o caso de mensagem que exceda 255 caracteres
    public void excecaoLimiteCaracteres() {
        System.out.println("A entrada não é válida, o texto não pode exceder "
                + "255 caracteres.");
    }

    //---------------------------MISCELANEOUS-----------------------------------    
    /**
     * Metodos de teste com uma palavra de tamanho indefinido que pode ser usada com tamanho 
     * maior que 255 para lançar exceção de tamanho excedido
    */
    public String[] palavraTesteTamanho() {
        String[] textoTexte = new String[260];
        for (int i = 0; i <= 256; i++) {
            textoTexte[i] = "a";
        }
        return textoTexte;
    }

    public void teste() {
        if (verificarTamanho(palavraTesteTamanho())) {
            exit(0);
        }
        formatarSaida();
    }
}
