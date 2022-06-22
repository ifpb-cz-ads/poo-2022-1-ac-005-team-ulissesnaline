## Questões de Batista e Moraes

1. Uma lâmpada em um supermecado pode ter uma marca, potência, tempo de vida, tipo (incandencente, fluorescente, LED), e
   cor.
2. Um time de esporte, por exemplo, de futebol, pode ter um nome, bandeira, brasão, jogadores e, especificamente em um
   campeonato, uma pontuação.
3. Implementado em `BMExercise03.java`. Embora a questão diga que o saldo só pode ser negativo se a conta for
   especial, eu como cliente preferiria ver o aviso caso ocorresse um erro no sistema que fizesse o saldo ser negativo
   mesmo
   sem conta especial. Logo deixei essa verificação separada da verificação do tipo da conta.


7. O nome da classe `Registro De Eleitor` não deveria conter espaços. Isso causa erro de sintaxe, já que o compilador
   usa espaços para separar os tokens e encontra os identificadores `De` e `Eleitor não declarados e em posições
   inválidas.
8. O método `maior` retorna um `boolean`, mas está marcado como `int`. E o método `menor` retorna um `int`, mas está
   marcado como `void`.
9. O método `main` não está marcado como `public static void` e está retornando um valor (`true)