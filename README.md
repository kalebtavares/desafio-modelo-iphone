iPhone Multifuncional

Este projeto foi desenvolvido em Java e tem como objetivo demonstrar como um dispositivo pode desempenhar múltiplos papéis simultaneamente – no caso, um iPhone que atua como:

Reprodutor Musical

Aparelho Telefônico

Navegador na Internet

A ideia inspira-se no famoso vídeo de lançamento do iPhone e utiliza os conceitos de interfaces, herança e polimorfismo para criar uma estrutura flexível e modular.


Explicação do Diagrama:

Interfaces:

ReprodutorMusical define métodos para operações básicas de reprodução de músicas.

AparelhoTelefonico especifica os comportamentos essenciais de um telefone, como ligar e atender chamadas.

NavegadorInternet apresenta métodos para exibir páginas web e gerenciar abas.

Classe IPhone: Esta classe implementa as três interfaces, integrando os diferentes papéis que o aparelho deve desempenhar. Isso evidencia o uso do polimorfismo, em que um único objeto pode responder a chamados de métodos definidos em diferentes contratos (interfaces).

Estrutura dos Arquivos
O projeto está organizado da seguinte forma:

ReprodutorMusical.java Define a interface para o reprodutor musical.

AparelhoTelefonico.java Define a interface para as funcionalidades telefônicas.

NavegadorInternet.java Define a interface para a navegação na internet.

IPhone.java Classe que implementa todas as três interfaces e contém um método main para testar as funcionalidades.

Como Executar
Clone o repositório:

bash
git clone <URL-do-repositório>
Compile os arquivos Java:

bash
javac *.java
Execute a classe principal:

bash
java IPhone
A execução exibirá mensagens no console que demonstram as funções do iPhone como reprodutor musical, telefone e navegador na internet.

Possíveis Extensões
Este projeto pode ser facilmente expandido. Algumas sugestões incluem:

Adição de classes mais específicas: Crie classes adicionais para representar músicas, contatos ou páginas web, aprofundando e enriquecendo a modelagem do sistema.

Testes unitários: Implemente teste automatizados com frameworks como JUnit para garantir a robustez do código.

Uso de Design Patterns: Explore padrões de projeto como Factory ou Strategy para uma maior flexibilidade e manutenção do código.

Interface Gráfica: Desenvolva uma interface gráfica para interagir com os métodos implementados, aproximando-o de uma simulação real de uso de dispositivo.

Conclusão
Este projeto ilustra de forma prática o uso de interfaces e o polimorfismo em Java, demonstrando como um único objeto pode assumir múltiplos comportamentos. É uma excelente base tanto para iniciantes quanto para desenvolvedores que desejam aprimorar seus conhecimentos em design orientado a objetos e modularização de código.

Este README serve para orientar tanto a visualização do projeto quanto o entendimento da diagramação UML utilizada na modelagem dos papéis do iPhone. Se houver dúvidas ou sugestões para aprimoramento, sinta-se à vontade para contribuir!

Diagrama UML
A modelagem do projeto foi feita utilizando a sintaxe do PlantUML. O diagrama a seguir mostra as três interfaces fundamentais e a classe IPhone, que implementa cada uma delas:


![diagrama UML](https://github.com/user-attachments/assets/ce4de7ee-872b-44df-80bd-a3e5b56e66ea)
