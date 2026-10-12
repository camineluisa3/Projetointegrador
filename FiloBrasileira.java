import java.util.Scanner; 
import java.util.ArrayList;

class FiloBraAu {
	
	String autorBrasileiro;
	ArrayList <String> autoresEstrangeiros;
	ArrayList <String> ideais;
	String bio;

	public FiloBraAu(String autorBrasileiro, String bio) {

		this.autorBrasileiro = autorBrasileiro;
		autoresEstrangeiros = new ArrayList<>();
		this.bio = bio;
		ideais = new ArrayList<>();
	}
	
}

public class FiloBrasileira {
	
	public static void main (String args []) {
		
		ArrayList<FiloBraAu> bancoAutores = new ArrayList<>();
		
		FiloBraAu djamila = new FiloBraAu ("Djamila Ribeiro", "Djamila Ribeiro é uma filósofa, professora e ativista do movimento negro, que em seus trabalhos foca principalmente no gênero e no feminismo negro. Jamila desde jovem frequentava ONGs, por influência de seu pai, e trabalhava meio período para pagar sua faculdade de jornalismo, que após engravidar, teve que largar para se dedicar a família. Mas alguns anos depois, Ribeiro voltou a universidade e se graduou em Filosofia pela EFLCH, se tornando mestra em Filosofia política em 2015 na mesma instituição. Djamila utiliza as redes sociais para divulgar seu trabalho, possuindo um grande público que consome seu conteúdo sobre feministas negras, enquanto ao mesmo tempo era colunista online de revistas e publicava seus primeiros livros. A filósofa também ocupou cargos no governo, sendo uma voz ativa sobre o feminismo negro, garantindo cada vez mais sucesso na sua área");
		
		djamila.autoresEstrangeiros.add("bell hooks");
		djamila.autoresEstrangeiros.add("Angela Davis");
		djamila.autoresEstrangeiros.add("Frantz Fanon");
		djamila.autoresEstrangeiros.add("Judith Butler");
		
		djamila.ideais.add("Feminismo");
		djamila.ideais.add("Racismo");
		djamila.ideais.add("Desigualdade");
		djamila.ideais.add("Gênero");
		djamila.ideais.add("Identidade");
		djamila.ideais.add("Opressão");
		
		bancoAutores.add(djamila);
		
		FiloBraAu ponde = new FiloBraAu ("Luiz Felipe Pondé", "Pondé é um pernambucano que iniciou sua carreira na medicina, mas acabou abandonando o curso e seguiu para a área da filosofia, onde se graduou e se tornou mestre na USP, fazendo mais tarde pós-doutorado em Tel Aviv, Israel. Atualmente é vice-diretor e coordenador de curso na FAAP e professor de ciência da religião na PUC-SP. A filosofia de Luiz Felipe Pondé se baseia no pessimismo, no existencialismo, em Nietzsche e em Blaise Pascal (jansenismo), defendendo as tradições religiosas e combatendo o politicamente correto universitário.");
		
		ponde.autoresEstrangeiros.add("Friedrich Nietzsche");
		ponde.autoresEstrangeiros.add("Arthur Schopenhauer");
		ponde.autoresEstrangeiros.add("Blaise Pascal");
		ponde.autoresEstrangeiros.add("Søren Kierkegaard");
		
		ponde.ideais.add("Pessimismo");
		ponde.ideais.add("Crítica dos valores sociais");
		ponde.ideais.add("Existência humana");
		ponde.ideais.add("Ressentimento");
		
		bancoAutores.add(ponde);
		
		FiloBraAu schuler = new FiloBraAu ("Fernando Schuler", "Fernando Luís Schuler é um filósofo, professor universitário, articulista, cientista político e consultor de empresas e organizações civis nas áreas de cultura e ciências políticas. Ele é curador do projeto Fronteiras do Pensamento, que promove debates com pensadores internacionais a fim de abordar temáticas contemporâneas.");

		schuler.autoresEstrangeiros.add("Hannah Arendt");
		schuler.autoresEstrangeiros.add("Alexis de Tocqueville");
		schuler.autoresEstrangeiros.add("Jürgen Habermas");
		schuler.autoresEstrangeiros.add("Norberto Bobbio");
		
		schuler.ideais.add("Democracia");
		schuler.ideais.add("Política");
		schuler.ideais.add("sociedade");
		schuler.ideais.add("cultura");
		
		bancoAutores.add(schuler);
		
		FiloBraAu giannetti = new FiloBraAu ("Eduardo Giannetti", "Eduardo Giannetti da Fonseca é um economista, professor, autor e palestrante brasileiro, formado na faculdade de Economia, Administração e Contabilidade (FEA) e em Ciências Sociais. Participou do movimento estudantil como militante da organização trotskista Liberdade e Luta, quando era estudante de graduação na Universidade de São Paulo. É o sexto ocupante da Cadeira nª 2 da Academia Brasileira de Letras, eleito em 16 de dezembro de 2021, na sucessão de Tarcísio Padilha.");
		
		giannetti.autoresEstrangeiros.add("David Hume");
		giannetti.autoresEstrangeiros.add("Adam Smith");
		giannetti.autoresEstrangeiros.add("John Stuart Mill");
		giannetti.autoresEstrangeiros.add("Jeremy Bentham");
		
		giannetti.ideais.add("Comportamento humano");
		giannetti.ideais.add("Ética");
		giannetti.ideais.add("Relação entre indivíduo e sociedade");
		giannetti.ideais.add("Racionalidade");
		
		bancoAutores.add(giannetti);
		
		FiloBraAu krenak = new FiloBraAu ("Ailton Krenak", "Líder indígena, ambientalista, filósofo, poeta e escritor brasileiro da etnia indígena krenak. É o primeiro indígena eleito para a Academia Brasileira de Letras. Ailton também é professor honoris causa pela UFJF (Universidade Federal de Juiz de Fora) e é considerado uma das maiores lideranças do movimento indígena brasileiro, defendendo os direitos dos povos indígenas e a preservação das florestas brasileiras. Sendo a favor da sustentabilidade e contrário à exploração desenfreada dos recursos naturais.");
		
		krenak.autoresEstrangeiros.add("Bruno Latour");
		krenak.autoresEstrangeiros.add("Arne Naess");
		krenak.autoresEstrangeiros.add("Vandana Shiva");
		krenak.autoresEstrangeiros.add("Hans Jonas");
		
		krenak.ideais.add("Crise ambiental");
		krenak.ideais.add("Povos tradicionais");
		krenak.ideais.add("Crítica ao capitalismo");
		krenak.ideais.add("Relação entre humanidade e natureza");
		
		bancoAutores.add(krenak);
		
		FiloBraAu safatle = new FiloBraAu ("Vladimir Safatle", "Vladimir é um filósofo chileno-brasileiro, psicanalista e escritor: é uma figura de destaque nos estudos contemporâneos sobre a relação entre filosofia, filosofia da música, psicanálise e política — reconhecido por seu ativismo e pensamento político de vertente marxsista. Professor na USP e colunista da Folha de São Paulo por 10 anos, colunista do El País por 3 anos, escreve para os principais jornais do país.");
		
		safatle.autoresEstrangeiros.add("Karl Marx");
		safatle.autoresEstrangeiros.add("Theodor Adorno");
		safatle.autoresEstrangeiros.add("Jacques Lacan");
		safatle.autoresEstrangeiros.add("Slavoj Žižek");
		
		safatle.ideais.add("Marxismo");
		safatle.ideais.add("Capitalismo");
		safatle.ideais.add("Ideologia");
		safatle.ideais.add("Psicanálise");
		
		bancoAutores.add(safatle);
		
		FiloBraAu chaui = new FiloBraAu("Marilena Chaui", "Marilena de Souza Chauí é uma filósofa e escritora brasileira, especialista na obra de Baruch Espinoza e professora emérita de História Moderna na Faculdade de Filosofia. É descrita como uma das principais filósofas e intelectuais brasileiras contemporâneas. Também é conhecida por sua atuação política, tendo combatido a ditadura militar e tendo sido uma das fundadoras do Partido dos Trabalhadores. Foi secretária de Cultura do Município de São Paulo durante a gestão da prefeita Luiza Erundina. Marilena possuí Graduação (1965), mestrado(1967) e doutorado(1971).");

		chaui.autoresEstrangeiros.add("Karl Marx");
		chaui.autoresEstrangeiros.add("Baruch Spinoza");
		chaui.autoresEstrangeiros.add("Hannah Arendt");
		chaui.autoresEstrangeiros.add("Louis Althusser");

		chaui.ideais.add("Ideologia");
		chaui.ideais.add("Politica");
		chaui.ideais.add("Democracia");
		chaui.ideais.add("Autoritarismo");
		chaui.ideais.add("Marxismo");
		chaui.ideais.add("Liberdade");

		bancoAutores.add(chaui);
		
		FiloBraAu sueli = new FiloBraAu("Sueli Carneiro", "Sueli Carneiro é uma filósofa, escritora e ativista antirracista, amplamente reconhecida como uma das principais teóricas do feminismo negro no Brasil e fundadora do Geledés — Instituto da Mulher Negra. Em sua formulação teórica, destaca-se o conceito de epistemicídio, que descreve o processo colonial de negação, desvalorização e apagamento dos saberes e da cultura produzidos por povos negros e marginalizados. Sua atuação política e intelectual foi decisiva para a implementação de recortes de raça e gênero em políticas públicas e para a consolidação das cotas raciais nas universidades. Autora de livros essenciais como Racismo, Sexismo e Desigualdade no Brasil e Dispositivo de Racialidade, ela recebeu o título de Doutora Honoris Causa por grandes universidades brasileiras devido ao seu impacto social.");

		sueli.autoresEstrangeiros.add("Angela Davis");
		sueli.autoresEstrangeiros.add("bell hooks");
		sueli.autoresEstrangeiros.add("Frantz Fanon");
		sueli.autoresEstrangeiros.add("Judith Butler");

		sueli.ideais.add("Feminismo Negro");
		sueli.ideais.add("Racismo");
		sueli.ideais.add("Sexismo");
		sueli.ideais.add("Epistemicidio");
		sueli.ideais.add("Desigualdade");

		bancoAutores.add(sueli);
		
		FiloBraAu mario = new FiloBraAu("Mario Ferreira dos Santos", "Mário Ferreira dos Santos foi um filósofo e tradutor conhecido por suas contribuições à filosofia, e principalmente por ter introduzido a venda de livros a crédito e pela divulgação de novos autores pelo Brasil. Formado na UFRGS em direito e ciências sociais, Mário foi muito ativo na política, promovendo projetos de escolas de alfabetização e teve participação na revolução de 1930. Mário também, no período da segunda guerra mundial, começou a traduzir livros de grandes filósofos estrangeiros e desenvolveu seu próprio sistema denominado de Filosofia Concreta.");

		mario.autoresEstrangeiros.add("Aristoteles");
		mario.autoresEstrangeiros.add("Tomas de Aquino");
		mario.autoresEstrangeiros.add("Immanuel Kant");
		mario.autoresEstrangeiros.add("Gottfried Leibniz");

		mario.ideais.add("Metafisica");
		mario.ideais.add("Ontologia");
		mario.ideais.add("Epistemologia");
		mario.ideais.add("Logica");
		mario.ideais.add("Etica");
		mario.ideais.add("Axiologia");

		bancoAutores.add(mario);
		
		FiloBraAu newton = new FiloBraAu("Newton da Costa", "Newton da Costa foi um matemático, lógico e filósofo, sendo um dos pensadores brasileiros mais reconhecidos internacionalmente. O matemático ficou conhecido pela formulação da lógica paraconsistente, um sistema formal no qual se podem verificar, de modo controlado, exceções ao princípio da não contradição, isto é, no qual podem se apresentar contradições sem que, com isso, seja possível derivar uma proposição qualquer, dentro do sistema, evitando-se assim o princípio de explosão. Costa se formou na universidade federal do paraná, obtendo três graduações e bacharelado em matemática, e após alguns anos se tornou professor de filosofia e matemática na universidade USP E UNICAMP.");

		newton.autoresEstrangeiros.add("Graham Priest");
		newton.autoresEstrangeiros.add("Bertrand Russell");
		newton.autoresEstrangeiros.add("Alfred Tarski");
		newton.autoresEstrangeiros.add("Saul Kripke");

		newton.ideais.add("Logica");
		newton.ideais.add("Contradicao");
		newton.ideais.add("Matematica");
		newton.ideais.add("Verdade");
		newton.ideais.add("Filosofia da Ciencia");

		bancoAutores.add(newton);
		
		FiloBraAu franklin = new FiloBraAu("Franklin Leopoldo e Silva", "Nascido em 31 de Dezembro de 1947, em São Paulo. Franklin possui graduação em Filosofia, Graduação em Filosofia e Doutorado em Filosofia, todos pela Universidade de São Paulo. Atualmente é professor titular da Universidade de São Paulo, ele tem experiência na área de Filosofia, principalmente na História da Filosofia, atuando nos seguintes temas: histórias, crítica, ética, existência e conhecimento.");

		franklin.autoresEstrangeiros.add("Rene Descartes");
		franklin.autoresEstrangeiros.add("Henri Bergson");
		franklin.autoresEstrangeiros.add("Jean Paul Sartre");
		franklin.autoresEstrangeiros.add("Maurice Merleau Ponty");

		franklin.ideais.add("Etica");
		franklin.ideais.add("Existencia");
		franklin.ideais.add("Conhecimento");
		franklin.ideais.add("Consciencia");
		franklin.ideais.add("Historia da Filosofia");

		bancoAutores.add(franklin);
		
		FiloBraAu marcondes = new FiloBraAu("Danilo Marcondes", "Danilo Marcondes de Souza Filho nasceu em 1943 no Rio de Janeiro. Danilo possui graduação e mestrado em Filosofia pela Pontifícia Universidade Católica do Rio de Janeiro, e Doutorado em Filosofia pela University of St Andrews. Em 2008 foi Directeur d’études associé na Maison des Sciences de l’Homme, na França. Em 2009 foi “Visiting Researcher” na Brown University, Providence, nos EUA, e em 2011 foi Professeur invité na Université de Paris-X. Com mais de trinta anos de experiência no magistério, atualmente é professor associado na Universidade Federal Fluminense e professor titular da PUC-Rio. Coordena o projeto interdisciplinar de ética e realidade atual. Ele atua também na área de ética aplicada com palestras, consultorias, artigos para jornais e vídeos no Youtube.");

		marcondes.autoresEstrangeiros.add("Ludwig Wittgenstein");
		marcondes.autoresEstrangeiros.add("J L Austin");
		marcondes.autoresEstrangeiros.add("Bertrand Russell");
		marcondes.autoresEstrangeiros.add("Charles Peirce");

		marcondes.ideais.add("Linguagem");
		marcondes.ideais.add("Significado");
		marcondes.ideais.add("Etica");
		marcondes.ideais.add("Pragmatismo");
		marcondes.ideais.add("Filosofia Analitica");

		bancoAutores.add(marcondes);
		
		FiloBraAu gallo = new FiloBraAu("Silvio Gallo", "Silvio Donizetti de Oliveira Gallo, é um filósofo, pedagogo e filósofo anarquista brasileiro, autor de uma série de publicações fundamentais que tornaram ele um dos principais expoentes da pedagogia libertária no Brasil. Silvio é membro de várias associações científicas do campo da filosofia da Educação no Brasil e no exterior. Em 1986 se formou no curso de filosofia e em 1990 tornou-se mestre em Educação, e em 1993 recebeu o título de doutor e livre docente em Educação.Possui uma ampla atuação na área da Educação e especificamente na área da Filosofia da Educação, com os temas filosofia francesa contemporânea e educação, ensino de filosofia, ensino médio, filosofia e transversalidade, anarquismo e educação, e pedagogia libertária.");

		gallo.autoresEstrangeiros.add("Mikhail Bakunin");
		gallo.autoresEstrangeiros.add("Pierre Joseph Proudhon");
		gallo.autoresEstrangeiros.add("Michel Foucault");
		gallo.autoresEstrangeiros.add("John Dewey");

		gallo.ideais.add("Anarquismo");
		gallo.ideais.add("Educacao");
		gallo.ideais.add("Liberdade");
		gallo.ideais.add("Autonomia");
		gallo.ideais.add("Pedagogia Libertaria");

		bancoAutores.add(gallo);
		
		FiloBraAu cruzCosta = new FiloBraAu("Joao Cruz Costa", "João Cruz Costa foi um influente filósofo paulista, nascido em 1904. Embora tenha tentado seguir a Medicina e estudado em Paris, consagrou-se como o aluno número um de Filosofia da USP em 1934. Sob a influência de mestres franceses como Jean Maugüé, tornou-se professor da instituição e defendeu sua tese de doutorado em 1940, consolidando-se posteriormente como professor catedrático e um dos maiores nomes no estudo do pensamento filosófico brasileiro.");

		cruzCosta.autoresEstrangeiros.add("Georg Hegel");
		cruzCosta.autoresEstrangeiros.add("Auguste Comte");
		cruzCosta.autoresEstrangeiros.add("Michel Foucault");
		cruzCosta.autoresEstrangeiros.add("Antonio Gramsci");

		cruzCosta.ideais.add("Historia");
		cruzCosta.ideais.add("Sociedade");
		cruzCosta.ideais.add("Cultura");
		cruzCosta.ideais.add("Pensamento");
		cruzCosta.ideais.add("Brasil");

		bancoAutores.add(cruzCosta);
		
		FiloBraAu vaz = new FiloBraAu("Henrique Claudio de Lima Vaz", "Padre Henrique Cláudio de Lima Vaz foi um importante filósofo, jesuíta e professor brasileiro. Doutor pela Universidade Gregoriana de Roma, uniu a metafísica clássica ao pensamento moderno, destacando-se como profundo conhecedor da obra de Hegel. Sua vasta produção intelectual e seu legado humanista são hoje preservados e divulgados pelo memorial da Faculdade Jesuíta de Filosofia e Teologia (FAJE).");

		vaz.autoresEstrangeiros.add("Aristoteles");
		vaz.autoresEstrangeiros.add("Tomas de Aquino");
		vaz.autoresEstrangeiros.add("Platao");
		vaz.autoresEstrangeiros.add("Hegel");

		vaz.ideais.add("Antropologia Filosofica");
		vaz.ideais.add("Etica");
		vaz.ideais.add("Liberdade");
		vaz.ideais.add("Metafisica");
		vaz.ideais.add("Modernidade");

		bancoAutores.add(vaz);
		
		FiloBraAu vieiraPinto = new FiloBraAu("Alvaro Vieira Pinto", "Álvaro Borges Vieira Pinto foi um polímata, filósofo e intelectual brasileiro que se destacou pela defesa do desenvolvimento autônomo do país por meio de uma visão materialista e dialética. Com formação plural em medicina, física e matemática, estruturou seu pensamento filosófico em torno do conceito de trabalho como essência humana. Embora tenha integrado brevemente a Ação Integralista Brasileira na juventude, afastou-se do movimento para se dedicar à pesquisa e à atividade político-intelectual em prol da soberania nacional.");

		vieiraPinto.autoresEstrangeiros.add("Karl Marx");
		vieiraPinto.autoresEstrangeiros.add("Paulo Freire");
		vieiraPinto.autoresEstrangeiros.add("Herbert Marcuse");
		vieiraPinto.autoresEstrangeiros.add("Martin Heidegger");

		vieiraPinto.ideais.add("Desenvolvimento");
		vieiraPinto.ideais.add("Consciencia");
		vieiraPinto.ideais.add("Educacao");
		vieiraPinto.ideais.add("Tecnologia");
		vieiraPinto.ideais.add("Trabalho");

		bancoAutores.add(vieiraPinto);
		
		FiloBraAu merquior = new FiloBraAu("Jose Guilherme Merquior", "Merquior foi um crítico literário, cientista político brasileiro e membro da Academia Brasileira de Letras. Reconhecido por seu criticismo ao marxismo, foi um grande defensor do liberalismo, não apenas como um sistema de valorização ao mercado, mas como um “estilo de vida”. Além disso, trabalhou juntamente ao governo Collor, colaborando na redação do discurso de posse do presidente eleito.");

		merquior.autoresEstrangeiros.add("Karl Popper");
		merquior.autoresEstrangeiros.add("Friedrich Hayek");
		merquior.autoresEstrangeiros.add("Isaiah Berlin");
		merquior.autoresEstrangeiros.add("Raymond Aron");

		merquior.ideais.add("Liberalismo");
		merquior.ideais.add("Liberdade");
		merquior.ideais.add("Cultura");
		merquior.ideais.add("Politica");
		
		bancoAutores.add(merquior);
		
		FiloBraAu tobias = new FiloBraAu("Tobias Barreto", "Barreto foi um filósofo, poeta, crítico e jurista brasileiro. Fundador do condoreirismo brasileiro, foi designado Patrono da cadeira 38 da Academia Brasileira de Letras. Barreto, influenciado pelo espiritualismo francês, passou a defender o germanismo contra o predomínio da cultura francesa no Brasil, e também a estudar a língua alemã e alguns autores a fim de reformar as suas ideias filosóficas, políticas e literárias. Chegando então a escrever obras dedicadas à estes autores alemães e seus ideais.");

		tobias.autoresEstrangeiros.add("Immanuel Kant");
		tobias.autoresEstrangeiros.add("Georg Hegel");
		tobias.autoresEstrangeiros.add("Arthur Schopenhauer");
		tobias.autoresEstrangeiros.add("Friedrich Nietzsche");

		tobias.ideais.add("Direito");
		tobias.ideais.add("Cultura");
		tobias.ideais.add("Filosofia Alema");
		tobias.ideais.add("Politica");
		tobias.ideais.add("Racionalidade");

		bancoAutores.add(tobias);
		
		FiloBraAu fariasBrito = new FiloBraAu("Raimundo de Farias Brito", "Raimundo foi um escritor e filósofo brasileiro, tendo como suas principais ideias o espiritualismo e o antimaterialismo. Atuou como promotor e por duas vezes como secretário no governo do estado do Ceará, futuramente tornando-se um advogado e promotor no estado do Pará. Raimundo sempre teve como preocupação filosófica o materialismo e suas vertentes, crendo que sua cosmovisão espiritualista servia como um meio de combate a este conceito. Além disso, também foi um crítico à Revolução Francesa e outras ideologias políticas, e um árduo defensor da religião como ‘o governo real dos homens pela lei moral’.");

		fariasBrito.autoresEstrangeiros.add("Henri Bergson");
		fariasBrito.autoresEstrangeiros.add("Soren Kierkegaard");
		fariasBrito.autoresEstrangeiros.add("Rene Descartes");
		fariasBrito.autoresEstrangeiros.add("Tomas de Aquino");

		fariasBrito.ideais.add("Espiritualismo");
		fariasBrito.ideais.add("Religiao");
		fariasBrito.ideais.add("Consciencia");
		fariasBrito.ideais.add("Moral");
		fariasBrito.ideais.add("Metafisica");

		bancoAutores.add(fariasBrito);
		
		FiloBraAu casanova = new FiloBraAu("Marco Antonio Casanova", "Marco Antonio dos Santos Casa Nova foi um filósofo e professor brasileiro, reconhecido por sua atuação na área de filosofia contemporânea. Desenvolveu pesquisas voltadas principalmente à fenomenologia, hermenêutica e à obra de pensadores como Heidegger. Atuou como docente em universidades brasileiras, contribuindo para a formação acadêmica e para o debate filosófico no país. Seu trabalho teve destaque na filosofia brasileira recente, especialmente pelo aprofundamento de temas ligados à tradição continental.");

		casanova.autoresEstrangeiros.add("Martin Heidegger");
		casanova.autoresEstrangeiros.add("Edmund Husserl");
		casanova.autoresEstrangeiros.add("Hans Georg Gadamer");
		casanova.autoresEstrangeiros.add("Paul Ricoeur");

		casanova.ideais.add("Metafisica");
		casanova.ideais.add("Fenomenologia");
		casanova.ideais.add("Hermeneutica");
		casanova.ideais.add("Critica da Cultura");

		bancoAutores.add(casanova);
		
		FiloBraAu werle = new FiloBraAu("Marco Aurelio Werle", "É um filósofo e professor brasileiro, reconhecido por sua atuação na área de filosofia moderna e contemporânea. Desenvolve pesquisas principalmente em estética e filosofia alemã, com destaque para autores como Hegel, Kant e Heidegger. Atua como docente na USP, contribuindo para a formação de estudantes e para o desenvolvimento do pensamento filosófico no Brasil. Também trabalhou como tradutor e estudioso de obras clássicas da filosofia.");

		werle.autoresEstrangeiros.add("Georg Hegel");
		werle.autoresEstrangeiros.add("Immanuel Kant");
		werle.autoresEstrangeiros.add("Martin Heidegger");
		werle.autoresEstrangeiros.add("Theodor Adorno");

		werle.ideais.add("Estetica");
		werle.ideais.add("Filosofia da Arte");
		werle.ideais.add("Poesia");
		werle.ideais.add("Fenomenologia");
		werle.ideais.add("Idealismo Alemao");

		bancoAutores.add(werle);
		
		FiloBraAu terra = new FiloBraAu("Ricardo Terra", "É um filósofo e professor brasileiro, reconhecido por seus estudos sobre Immanuel Kant, filosofia política, ética e Teoria Crítica. É professor titular na USP e pesquisador do CEBRAP. Formou-se e doutorou-se em Filosofia pela USP, com pesquisa voltada à filosofia kantiana, e realizou pós-doutorado na Universidade de Frankfurt. Teve papel importante na consolidação dos estudos kantianos no Brasil, e também foi membro fundador e presidente da Sociedade Kant Brasileira, contribuindo significativamente para o desenvolvimento da filosofia no país.");

		terra.autoresEstrangeiros.add("Immanuel Kant");
		terra.autoresEstrangeiros.add("Jurgen Habermas");
		terra.autoresEstrangeiros.add("John Rawls");
		terra.autoresEstrangeiros.add("Theodor Adorno");

		terra.ideais.add("Etica");
		terra.ideais.add("Politica");
		terra.ideais.add("Liberdade");
		terra.ideais.add("Racionalidade");
		terra.ideais.add("Teoria Critica");

		bancoAutores.add(terra);
		
		FiloBraAu reale = new FiloBraAu("Miguel Reale", "Miguel Reale foi um dos mais influentes juristas e filósofos do Direito no Brasil. Ele lecionou na Universidade de São Paulo, instituição da qual foi reitor, e ocupou uma cadeira na Academia Brasileira de Letras. Sua grande contribuição teórica foi a formulação da Teoria Tridimensional do Direito, que propõe que o fenômeno jurídico é composto pela integração dinâmica e simultânea de fato, valor e norma. Além de sua vasta produção acadêmica, que inclui as obras Lições Preliminares de Direito e Filosofia do Direito, ele teve um papel prático fundamental na história do país ao presidir a comissão encarregada de elaborar o Código Civil de 2002.");

		reale.autoresEstrangeiros.add("Hans Kelsen");
		reale.autoresEstrangeiros.add("H L A Hart");
		reale.autoresEstrangeiros.add("Gustav Radbruch");
		reale.autoresEstrangeiros.add("Lon Fuller");

		reale.ideais.add("Direito");
		reale.ideais.add("Normas");
		reale.ideais.add("Valores");
		reale.ideais.add("Justica");
		reale.ideais.add("Sociedade");

		bancoAutores.add(reale);

		FiloBraAu bento = new FiloBraAu("Bento Prado Junior", "Bento Prado Júnior destacou-se como filósofo, crítico literário e tradutor, sendo uma das mentes mais brilhantes de sua geração na Universidade de São Paulo e, posteriormente, na Universidade Federal de São Carlos. Ele desempenhou um papel crucial na introdução e no aprofundamento dos estudos da filosofia francesa contemporânea no Brasil, com foco especial no pensamento de Henri Bergson, Jean-Paul Sartre e Michel Foucault. Durante a ditadura militar, foi cassado pelo regime e se exilou na França, onde lecionou na Universidade de Paris. Sua escrita, eternizada em livros como Alguns Ensaios e Erro, Ilusão, Loucura, transitava com maestria entre o rigor filosófico e a sensibilidade poética.");

		bento.autoresEstrangeiros.add("Jean Paul Sartre");
		bento.autoresEstrangeiros.add("Henri Bergson");
		bento.autoresEstrangeiros.add("Michel Foucault");
		bento.autoresEstrangeiros.add("Gilles Deleuze");

		bento.ideais.add("Existencialismo");
		bento.ideais.add("Fenomenologia");
		bento.ideais.add("Subjetividade");
		bento.ideais.add("Literatura");
		bento.ideais.add("Critica Social");

		bancoAutores.add(bento);
		
		FiloBraAu vicente = new FiloBraAu("Vicente Ferreira da Silva", "Vicente Ferreira da Silva foi um pensador paulista reconhecido por sua originalidade e por uma trajetória intelectual enigmática. No início de sua carreira, dedicou-se à lógica matemática e escreveu o primeiro tratado de lógica simbólica do país, chegando a trabalhar com o influente lógico americano Willard Van Orman Quine. Mais tarde, impactado pelo pensamento de Martin Heidegger, ele abandonou a lógica para fundar uma filosofia do mito ou teologia filosofante, argumentando que a civilização ocidental havia fracassado ao se guiar estritamente pela razão técnica. Deixou obras marcantes como Elementos de Lógica Simbólica e Dialética das Consciências antes de falecer precocemente em um acidente automobilístico.");

		vicente.autoresEstrangeiros.add("Martin Heidegger");
		vicente.autoresEstrangeiros.add("Friedrich Nietzsche");
		vicente.autoresEstrangeiros.add("Ernst Cassirer");
		vicente.autoresEstrangeiros.add("Mircea Eliade");

		vicente.ideais.add("Mito");
		vicente.ideais.add("Existencia");
		vicente.ideais.add("Razao Tecnica");
		vicente.ideais.add("Critica do Racionalismo");

		bancoAutores.add(vicente);
		
		FiloBraAu zingano = new FiloBraAu("Marco Zingano", "Marco Zingano é um renomado filósofo, tradutor e professor titular de filosofia antiga na Universidade de São Paulo, com amplo prestígio internacional como especialista na obra de Aristóteles. Ele obteve seu doutorado na França e dedica sua carreira de pesquisa à investigação detalhada da ética, da deliberação moral e da teoria do conhecimento na Antiguidade Clássica, explorando profundamente conceitos como a fraqueza da vontade. Suas traduções e extensos comentários analíticos dos textos aristotélicos tornaram-se referências obrigatórias e fundamentais para a comunidade acadêmica, destacando-se publicações como Estudos de Ética Antiga e sua edição comentada da Ethica Nicomachea.");

		zingano.autoresEstrangeiros.add("Aristoteles");
		zingano.autoresEstrangeiros.add("Platao");
		zingano.autoresEstrangeiros.add("Socrates");
		zingano.autoresEstrangeiros.add("Alasdair MacIntyre");

		zingano.ideais.add("Etica");
		zingano.ideais.add("Virtude");
		zingano.ideais.add("Deliberacao Moral");
		zingano.ideais.add("Conhecimento");
		zingano.ideais.add("Acao Humana");

		bancoAutores.add(zingano);
		
		FiloBraAu bornheim = new FiloBraAu("Gerd Bornheim", "Gerd Alberto Bornheim foi um importante filósofo, professor e crítico de teatro brasileiro. Cassado pela ditadura militar em 1969, exilou-se na Europa e retornou com a Lei da Anistia, lecionando na UFRJ e na UERJ com foco em filosofia moderna e contemporânea. Reconhecido por introduzir o pensamento de Heidegger no Brasil, ele também se destacou na crítica teatral e dá nome à galeria de arte da Casa de Cultura de Caxias do Sul.");

		bornheim.autoresEstrangeiros.add("Martin Heidegger");
		bornheim.autoresEstrangeiros.add("Jean Paul Sartre");
		bornheim.autoresEstrangeiros.add("Maurice Merleau Ponty");
		bornheim.autoresEstrangeiros.add("Georg Hegel");

		bornheim.ideais.add("Existencialismo");
		bornheim.ideais.add("Fenomenologia");
		bornheim.ideais.add("Dialetica");
		bornheim.ideais.add("Arte");
		bornheim.ideais.add("Estetica");

		bancoAutores.add(bornheim);
		
		FiloBraAu unger = new FiloBraAu("Roberto Mangabeira Unger", "Roberto é um filósofo brasileiro reconhecido por seu ideal pragmatista radical e por suas ocupações como professor universitário de Harvard e político economista. Atuou temporariamente em cargos políticos mas sempre visou dar mais importância a sua vida acadêmica. Ele crê que há uma maneira de tornar mais abrangente uma alternativa às teorias criadas por Marx, radicalizando a visão da teoria sobre a natureza da ordem social. O mesmo afirma que Marx não foi longe o suficiente com suas ideias.");

		unger.autoresEstrangeiros.add("John Dewey");
		unger.autoresEstrangeiros.add("William James");
		unger.autoresEstrangeiros.add("Richard Rorty");
		unger.autoresEstrangeiros.add("Karl Marx");

		unger.ideais.add("Pragmatismo");
		unger.ideais.add("Transformacao Social");
		unger.ideais.add("Politica");
		unger.ideais.add("Democracia");
		unger.ideais.add("Critica Social");

		bancoAutores.add(unger);
		
		FiloBraAu silvioRomero = new FiloBraAu("Silvio Romero", "Romero foi um filósofo, literato e político brasileiro, que buscou trabalhar a crítica literária e a historiografia literária brasileira sob a luz da “teoria spenceriana”.  No Rio de Janeiro, onde radicou-se, foi um ativo polemista, o qual criticou em suas obras o espiritualismo e o positivismo.");

		silvioRomero.autoresEstrangeiros.add("Herbert Spencer");
		silvioRomero.autoresEstrangeiros.add("Auguste Comte");
		silvioRomero.autoresEstrangeiros.add("Charles Darwin");
		silvioRomero.autoresEstrangeiros.add("Hippolyte Taine");

		silvioRomero.ideais.add("Evolucionismo");
		silvioRomero.ideais.add("Sociedade");
		silvioRomero.ideais.add("Cultura");
		silvioRomero.ideais.add("Literatura");

		bancoAutores.add(silvioRomero);
		
		FiloBraAu bomfim = new FiloBraAu("Manoel Bomfim", "Bomfim foi um médico, psicólogo, pedagogo, sociólogo e historiador brasileiro, escreveu diversas obras didáticas tratando de assuntos como a história do Brasil e da América Latina, além disso, na área da psicologia, escreveu obras que auxiliassem e servissem como suporte as suas aulas na Escola Normal. Bomfim também exerceu durante muitos anos uma notável atividade jornalística; Criticava a pesquisa de laboratório e propôs método interpretativo para o estudo do psiquismo.");

		bomfim.autoresEstrangeiros.add("Frantz Fanon");
		bomfim.autoresEstrangeiros.add("Paulo Freire");
		bomfim.autoresEstrangeiros.add("Jose Marti");
		bomfim.autoresEstrangeiros.add("Enrique Dussel");

		bomfim.ideais.add("Colonialismo");
		bomfim.ideais.add("Educacao");
		bomfim.ideais.add("America Latina");
		bomfim.ideais.add("Sociedade");

		bancoAutores.add(bomfim);

		FiloBraAu matias = new FiloBraAu("Matias Aires", "Foi um filósofo e escritor luso-brasileiro, reconhecido por alguns como o maior filósofo da língua portuguesa. Sua principal obra, Reflexões sobre a Vaidade dos Homens, discute a vaidade enquanto motor tanto das virtudes quanto dos vícios humanos. O conjunto de sua obra literária é situada no período barroco, sob expressiva influência dos jansenistas franceses.");

		matias.autoresEstrangeiros.add("Blaise Pascal");
		matias.autoresEstrangeiros.add("La Rochefoucauld");
		matias.autoresEstrangeiros.add("Arthur Schopenhauer");
		matias.autoresEstrangeiros.add("Jean de La Bruyere");

		matias.ideais.add("Vaidade");
		matias.ideais.add("Egoismo");
		matias.ideais.add("Moral");
		matias.ideais.add("Natureza Humana");

		bancoAutores.add(matias);

		FiloBraAu gonzaga = new FiloBraAu("Tomas Antonio Gonzaga", "Gonzaga foi um jurista, poeta e ativista político participante da Inconfidência Mineira. Em fins do século XVIII, ao formar-se bacharel em Direito em Coimbra, Tomás Antônio Gonzaga escreveu o Tratado de Direito Natural, com a pretensão de escrever o primeiro livro em português sobre as disposições então recentes do direito natural, conjugando-as aos princípios teológicos cristãos de ordenação da sociedade.");

		gonzaga.autoresEstrangeiros.add("John Locke");
		gonzaga.autoresEstrangeiros.add("Hugo Grotius");
		gonzaga.autoresEstrangeiros.add("Thomas Hobbes");
		gonzaga.autoresEstrangeiros.add("Samuel Pufendorf");

		gonzaga.ideais.add("Direito Natural");
		gonzaga.ideais.add("Estado");
		gonzaga.ideais.add("Politica");
		gonzaga.ideais.add("Sociedade");

		bancoAutores.add(gonzaga);

		FiloBraAu caioPrado = new FiloBraAu("Caio Prado Junior", "Prado Júnior foi um sociólogo, historiador, geógrafo, escritor, filósofo, político e editor brasileiro, o qual trouxe ao brasil uma tradição historiográfica identificada com o marxismo, buscando uma explicação que se diferencia da sociedade colonial brasileira. Como intelectual, teve importante atuação política em sua época e teve participação nas articulações para a revolução de 1930. Filiou-se ao Partido Comunista Brasileiro. Em sua primeira obra, trouxe uma tentativa de interpretação da história política e social do país, após uma viagem à União Soviética.");

		caioPrado.autoresEstrangeiros.add("Karl Marx");
		caioPrado.autoresEstrangeiros.add("Antonio Gramsci");
		caioPrado.autoresEstrangeiros.add("Georg Lukacs");
		caioPrado.autoresEstrangeiros.add("Immanuel Wallerstein");

		caioPrado.ideais.add("Marxismo");
		caioPrado.ideais.add("Capitalismo");
		caioPrado.ideais.add("Colonialismo");
		caioPrado.ideais.add("Historia");

		bancoAutores.add(caioPrado);

		FiloBraAu mortari = new FiloBraAu("Cezar Mortari", "Possui graduação em Filosofia (Licenciatura) pela Universidade Federal de Santa Catarina (1978), mestrado em Lógica e Filosofia da Ciência pela Universidade Estadual de Campinas (1982) e doutorado em Filosofia pela Eberhard-Karls-Universität Tübingen (1991). Atualmente é professor titular (aposentado, agora em serviço voluntário) do Departamento de Filosofia da Universidade Federal de Santa Catarina. Tem experiência na área de Filosofia, com ênfase em lógica modal e semântica de mundos possíveis.");

		mortari.autoresEstrangeiros.add("Saul Kripke");
		mortari.autoresEstrangeiros.add("David Lewis");
		mortari.autoresEstrangeiros.add("Rudolf Carnap");
		mortari.autoresEstrangeiros.add("Alvin Plantinga");

		mortari.ideais.add("Logica");
		mortari.ideais.add("Semantica");
		mortari.ideais.add("Mundos Possiveis");
		mortari.ideais.add("Epistemologia");

		bancoAutores.add(mortari);

		FiloBraAu rohden = new FiloBraAu("Huberto Rohden", "Huberto Rohden, descendente de imigrantes alemães, foi um filósofo brasileiro que escreveu mais de 100 obras sobre espiritualidade, filosofia e educação, destacando o autoconhecimento e a autorrealização. Criador da Filosofia Univérsica, defendia a harmonia cósmica, a responsabilidade individual pelos próprios atos e a conexão do ser humano com a consciência universal, sem depender de instituições religiosas. Seu pensamento marcou a filosofia brasileira do século XX, especialmente nas áreas de ética, pedagogia e metafísica, com base na comparação entre tradições do Oriente e do Ocidente.");

		rohden.autoresEstrangeiros.add("Jiddu Krishnamurti");
		rohden.autoresEstrangeiros.add("Aldous Huxley");
		rohden.autoresEstrangeiros.add("Swami Vivekananda");
		rohden.autoresEstrangeiros.add("Alan Watts");

		rohden.ideais.add("Espiritualidade");
		rohden.ideais.add("Autoconhecimento");
		rohden.ideais.add("Consciencia");
		rohden.ideais.add("Autorrealizacao");

		bancoAutores.add(rohden);

		FiloBraAu giannotti = new FiloBraAu("Jose Arthur Giannotti", "José Arthur Giannotti foi um influente filósofo, professor e intelectual brasileiro, formado e doutorado pela USP. Afastado da universidade pela ditadura militar, ajudou a fundar o CEBRAP, importante centro de estudos sociais e políticos. Destacou-se como um dos principais estudiosos de Karl Marx no Brasil, com forte atuação no pensamento crítico e na política nacional (participando da fundação do PT e, posteriormente, aproximando-se do PSDB), além de marcar a filosofia do século XX nas áreas de lógica e filosofia política.");

		giannotti.autoresEstrangeiros.add("Karl Marx");
		giannotti.autoresEstrangeiros.add("Georg Hegel");
		giannotti.autoresEstrangeiros.add("Ludwig Wittgenstein");
		giannotti.autoresEstrangeiros.add("Theodor Adorno");

		giannotti.ideais.add("Dialetica");
		giannotti.ideais.add("Capitalismo");
		giannotti.ideais.add("Linguagem");
		giannotti.ideais.add("Politica");

		bancoAutores.add(giannotti);

		FiloBraAu benedito = new FiloBraAu("Benedito Nunes", "Benedito Nunes foi um importante filósofo, crítico literário e professor brasileiro, nascido em Belém (PA). Atuou como docente na Universidade Federal do Pará (UFPA), onde ajudou a fundar a Faculdade de Filosofia e recebeu o título de professor emérito. Destacou-se por seus estudos que relacionam filosofia e literatura, especialmente a obra de Martin Heidegger. Lecionou também em universidades no Brasil e no exterior, como na França e nos Estados Unidos. Recebeu grande reconhecimento por sua produção intelectual, incluindo dois Prêmios Jabuti e o Prêmio Machado de Assis pelo conjunto da obra. Sua trajetória teve forte impacto nos estudos filosóficos e literários no Brasil.");

		benedito.autoresEstrangeiros.add("Martin Heidegger");
		benedito.autoresEstrangeiros.add("Jean Paul Sartre");
		benedito.autoresEstrangeiros.add("Hans Georg Gadamer");
		benedito.autoresEstrangeiros.add("Paul Ricoeur");

		benedito.ideais.add("Existencia");
		benedito.ideais.add("Linguagem");
		benedito.ideais.add("Literatura");
		benedito.ideais.add("Hermenêutica");

		bancoAutores.add(benedito);

		FiloBraAu castilho = new FiloBraAu("Fausto Castilho", "Fausto Castilho foi um filósofo e professor brasileiro, nascido no Paraná. Estudou Filosofia na França e na Alemanha, onde foi aluno de importantes pensadores como Merleau-Ponty, Piaget, Bachelard e Heidegger. No Brasil, atuou como professor em diversas instituições, como UFPR, USP e Unicamp, sendo um dos principais responsáveis pela criação e desenvolvimento de áreas importantes da Unicamp, como o Instituto de Filosofia e Ciências Humanas. Teve papel relevante na difusão da filosofia no país, participando de eventos acadêmicos e contribuindo para a formação universitária. Se destacou também por sua tradução de “Ser e Tempo”, de Heidegger, publicada em 2012.");

		castilho.autoresEstrangeiros.add("Martin Heidegger");
		castilho.autoresEstrangeiros.add("Edmund Husserl");
		castilho.autoresEstrangeiros.add("Maurice Merleau Ponty");
		castilho.autoresEstrangeiros.add("Gaston Bachelard");

		castilho.ideais.add("Ontologia");
		castilho.ideais.add("Fenomenologia");
		castilho.ideais.add("Logica");
		castilho.ideais.add("Cosmologia");

		bancoAutores.add(castilho);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Olá, bem vindos ao código, gostaria de começar as buscar utilizando: \n");
		System.out.printf("1 - Autor estrangeiro\n");
		System.out.printf("2 - Ideais \n");
		System.out.printf("Escolha escrevendo o número: \n");
		
		int opcao = sc.nextInt();
		sc.nextLine();
		
		if (opcao == 1) {
			
			System.out.printf("Digite um autor estrangeiro: \n");
			String pesquisa = sc.nextLine();
			
			boolean existe = false;
			
			for (FiloBraAu autor : bancoAutores) {
				
				if (autor.autoresEstrangeiros.contains(pesquisa)) {
				
					System.out.println ("Autor encontrado: " + autor.autorBrasileiro + "\n");
					System.out.println ("Biografia: " + autor.bio + "\n");
				
					existe = true;
				}
			}
			
			if (!existe) {
				System.out.printf("Não possuí nenhum autor com esse nome no nosso banco de dados. Tente novamente ou tente achar pelos Ideais.");
			}
			
		} else if (opcao == 2) {
			System.out.print("Digite um ideal: ");
			String pesquisa = sc.nextLine();
			
			boolean existe = false;
			
			for (FiloBraAu autor : bancoAutores) {
				
				if (autor.ideais.contains(pesquisa)) {
					
					System.out.println("Autor encontrado: " + autor.autorBrasileiro + "\n");
					System.out.println("Biografia: " + autor.bio + "\n");
					
					existe = true;
				}
				
				if (!existe) {
					System.out.printf("Nenhum autor encontrado. Tente novamente ou pesquisa pelos autores estrangeiros.");
				}
			}
		}
		
		sc.close();
	}	
}
