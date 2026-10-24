import java.util.Scanner;
import java.util.ArrayList;

class FiloBraObras {

	String obraBrasileira;
	ArrayList <String> obraEstrangeira;

	public FiloBraObras(String obraBrasileira) {
		
		this.obraBrasileira = obraBrasileira;
		obraEstrangeira = new ArrayList<>();
			
	}
}

public class ObraBrasileira {
	
	public static void main (String args[]) {
		
		ArrayList<FiloBraObras> bancoObras = new ArrayList<>();
		
		FiloBraObras pequenomanual = new FiloBraObras ("Pequeno Manual Antirracista (Djamila Ribeiro) - Neste pequeno manual, a filósofa e ativista Djamila Ribeiro trata de temas como atualidade do racismo, negritude, branquitude, " +
		"violência racial, cultura, desejos e afetos. Em onze capítulos curtos e contundentes, a autora apresenta caminhos de reflexão para aqueles que queiram aprofundar sua percepção sobre " +
		"discriminações racistas estruturais e assumir a responsabilidade pela transformação do estado das coisas.");
		
		pequenomanual.obraEstrangeira.add("As Almas da Gente Negra");
		pequenomanual.obraEstrangeira.add("The Souls of Black Folk");
		
		bancoObras.add(pequenomanual);
		
		//
		
		FiloBraObras lugardefala = new FiloBraObras("Lugar de Fala (Djamila Ribeiro) - "
		+ "Em  Lugar de fala , Djamila Ribeiro discute e desmistifica um conceito que ganhou projeção no debate público desde a década de 2010, " +
		"segundo o qual todas as pessoas ocupam posições sociais que influenciam o que dizem e como suas palavras são recebidas, legitimando ou deslegitimando vozes. " +
		"A autora demonstra que é essencial compreender essas diferentes posições e o devido lugar de fala de cada indivíduo, não para censurar ou podar o debate, mas para enriquecê-lo.");
		
		lugardefala.obraEstrangeira.add("Irma Outsider");
		lugardefala.obraEstrangeira.add("Sister Outsider");
		
		bancoObras.add(lugardefala);
		
		//
		
		FiloBraObras cartasparaminhavo = new FiloBraObras("Cartas Para Minha Avó (Djamila Ribeiro) - " + 
		"No mais pessoal e delicado de seus livros, a filósofa Djamila Ribeiro revisita sua infância e adolescência para discutir temas como ancestralidade negra e os desafios de criar filhos numa sociedade racista. " + "O relato se dá na forma de cartas a sua saudosa avó Antônia - carinhosa e amorosa, conhecedora de ervas curativas e benzedeira muito requisitada.");
		
		cartasparaminhavo.obraEstrangeira.add("Beloved");
		cartasparaminhavo.obraEstrangeira.add("Amada");
		
		bancoObras.add(cartasparaminhavo);
		
		//
		
		FiloBraObras quemtem  = new FiloBraObras("Quem Tem Medo Do Feminismo Negro? (Djamila Ribeiro) - " +
		"Quem tem medo do feminismo negro? reúne um longo ensaio autobiográfico inédito e uma seleção de artigos publicados por Djamila Ribeiro no blog da revista Carta Capital , entre 2014 e 2017. No texto de abertura, " +
		"a filósofa e militante recupera memórias de seus anos de infância e adolescência para discutir o que chama de 'silenciamento', processo de apagamento da personalidade por que passou e que é um dos muitos resultados perniciosos da discriminação.");
		
		quemtem.obraEstrangeira.add("Feminism Is for Everybody");
		quemtem.obraEstrangeira.add("O feminismo e para todo mundo");
		
		bancoObras.add(quemtem);
		
		//
		
		FiloBraObras travessias = new FiloBraObras("Travessias (Djamila Ribeiro) - " + "Nesta coletânea de crônicas escritas entre 2019 e 2020, Djamila Ribeiro, autora de Cartas para a Minha Avó, reflete sobre temas centrais da sociedade brasileira contemporânea: do racismo à condição da mulher negra, da igualdade de gênero, à saúde e à educação. Com uma escrita firme e documentada, a autora revisita acontecimentos marcantes desses anos, apoiando-se em leituras, dados e referências que conferem universalidade e força às suas observações. Um convite lúcido e necessário à reflexão sobre o Brasil - e sobre o mundo -, onde, apesar dos primeiros sinais de mudança, ainda há muito por fazer para alcançarmos um amanhã mais justo. ");
		
		travessias.obraEstrangeira.add("Mulheres, Raça e Classe");
		
		bancoObras.add(travessias);
		
		//
		
		FiloBraObras guiaincorreto = new FiloBraObras("Guia Politicamente Incorreto da Filosofia (Luiz Felipe Pondé) - " +
		"Mais um livro da coleção que dá o que falar combatendo o politicamente correto e suas bobagens. Não importa o quanto você acha que é bom, leitor. Você não é. Separar o lixo reciclável, chamar um negro de não caucasiano e não rir das piadas preconceituosas daquele amigo que no fundo, tem mais caráter que você, não te torna uma pessoa boa. Na verdade, te transforma em um chato com fortes tendências autoritárias. No terceiro livro da coleção Politicamente Incorreto, o filósofo Luiz Felipe Pondé desbrava, com a ironia costumeira, a história do politicamente correto através do pensamento de grandes filósofos, como Nietzsche, Darwin e o escritor Nelson Rodrigues, entre muitos outros. ");
		
		guiaincorreto.obraEstrangeira.add("Alem do bem e do mal");
		guiaincorreto.obraEstrangeira.add("Beyond Good and Evil");
		
		bancoObras.add(guiaincorreto);
		
		//
		
		FiloBraObras paracorajosos = new FiloBraObras("Filosofia para corajosos: Pense com a própria cabeça (Luiz Felipe Pondé) - " + "O objetivo deste livro é ajudar o leitor a pensar com a sua própria cabeça. Para tal, o filósofo " +
		"e escritor Luiz Felipe Pondé, autor de vários best-sellers, se apoia na história da filosofia para apresentar argumentos para quem quer discutir todo e qualquer tipo de assunto com embasamento. " +
		"Afinal, os grandes filósofos estudaram, pensaram e escreveram sobre os temas essenciais com os quais ainda lidamos no mundo contemporâneo. O livro está dividido em três partes: 'Uma filosofia em primeira pessoa', " +
		"onde o autor conta como ele entende a filosofia, 'Grandes tópicos da filosofia ao longo do tempo', que traz um repertório básico dos temas que " +
		"todo mundo precisa conhecer mais a fundo, e 'Por que acho o mundo contemporâneo ridículo?', uma análise ferina da sociedade atual.");
		
		paracorajosos.obraEstrangeira.add("Os problemas da Filosofia");
		paracorajosos.obraEstrangeira.add("The Problems of Philosophy");
		
		
		bancoObras.add(paracorajosos);
		
		//
		
		FiloBraObras comoaprendi = new FiloBraObras("Como aprendi a pensar: Os filósofos que me formaram (Luiz Felipe Pondé) - "
		+ "Um passeio pela história da filosofia Um dos pensadores pop mais respeitados pelo público e pela crítica, Luiz Felipe Pondé apresenta neste livro uma história da filosofia diferente - a história dele com a filosofia. E não só: ele cita romancistas como Nelson Rodrigues, cientistas como Charles Darwin, economistas como Karl Marx e os psicanalistas Sigmund Freud e Carl Jung. Todos foram importantes na formação deste intelectual que, semanalmente, através de artigos, aulas e vídeos, nos questiona e nos ajuda a pensar e a entender o mundo em que vivemos.");
		
		comoaprendi.obraEstrangeira.add("A Historia da Filosofia");
		comoaprendi.obraEstrangeira.add("The Story of Philosophy");
		
		bancoObras.add(comoaprendi);
		
		FiloBraObras ressentimento = new FiloBraObras("A Era do Ressentimento (Luiz Felipe Pondé) - "
		+ "Para o polêmico filósofo Luiz Felipe Pondé, é urgente sobrevivermos ao ridículo do mundo contemporâneo. E, para isso, devemos desprezá-lo de alguma forma. O livro, que foi escrito em 2014, adquire novas interpretações. 'De lá pra cá o ressentimento piorou, sua mentira característica assumiu formas gourmet. Ressentimento gourmet é a mentira da mentira, uma espécie de meta mentira.'");
		
		ressentimento.obraEstrangeira.add("A Genealogia da Moral");
		ressentimento.obraEstrangeira.add("On the Genealogy of Morality");
		
		bancoObras.add(ressentimento);
		
		//
		
		FiloBraObras cotidiano  = new FiloBraObras("Filosofia do Cotidiano: Um pequeno tratado sobre questões menores (Luiz Felipe Pondé) - "
		+ "'Filosofar nunca foi sobre deixar você feliz. É que andam mentindo muito por aí. Filosofar está mais ligado ao despertar do sonambulismo. Essa é minha proposta nesta conversa com você.'");
		
		cotidiano.obraEstrangeira.add("The Myth of Sisyphus");
		cotidiano.obraEstrangeira.add("O Mito de Sisifo");
		
		bancoObras.add(cotidiano);
		
		//
		
		FiloBraObras politica = new FiloBraObras("Política no Cotidiano: A Ironia Como Método de Sobrevivência (Luíz Felipe Pondé) - "
		+ "'Refletir sobre a política do cotidiano é olhar de perto o modo como distintas formas de poder se espalham e inundam o mundo para além das próprias instituições políticas e seus profissionais e não apenas pensar no cotidiano como um dia atrás do outro. Num arroubo epistemológico, fazer o percurso da política do cotidiano pode ser uma investigação do cosmos desse cotidiano a partir das formas distintas de como ele é objeto do poder. Olhar o mundo deste lugar pode se constituir num sério convite ao niilismo.'");
		
		politica.obraEstrangeira.add("Discipline and Punish");
		politica.obraEstrangeira.add("Vigiar e Punir");
		
		bancoObras.add(politica);
		
		//
		
		FiloBraObras comtemporaneo = new FiloBraObras("Brasil Contemporâneo: Crônicas de um País Incógnito (Fernando Luiz Schuler) - "
		+ "Esta obra reúne 30 ensaios sobre o Brasil contemporâneo. Da política às artes plásticas diversos são os temas aqui tratados e diversas as abordagens propostas. Ora convergentes e ora divergentes, estas múltiplas interpretações já traduzem o grau de complexidade alcançado pela sociedade brasileira do século XXI, aspecto recorrente nos textos hora compilados.");
		
		comtemporaneo.obraEstrangeira.add("A Sociedade em Rede");
		comtemporaneo.obraEstrangeira.add("The Rise of the Network Society");
		
		bancoObras.add(comtemporaneo);
		
		//
		
		FiloBraObras imortalidades = new FiloBraObras("Imortalidades (Eduardo Giannetti) - "
		+ "Reunindo microensaios finamente articulados que transitam do pensamento à literatura e da narrativa à reflexão, Imortalidades analisa os méritos e limites da busca pela vida eterna.");
		
		imortalidades.obraEstrangeira.add("Being and Nothingness");
		imortalidades.obraEstrangeira.add("O Ser e o Nada");
		
		bancoObras.add(imortalidades);
		
		//
		
		FiloBraObras topicos = new FiloBraObras("Tópicos Utópicos (Eduardo Giannetti) - " +
		" Eduardo Giannetti é conhecido por tratar de temas éticos e econômicos com clareza e precisão. A argumentação rigorosa e o texto límpido são as marcas de Tópicos utópicos. Aqui o assunto central é o da identidade nacional, ao qual o leitor é conduzido depois de passar por reflexões sobre a ciência, a tecnologia e o crescimento econômico. Organizado em aforismos ou, como prefere chamar o autor, seções ou microensaios, o livro propõe uma abordagem original e inovadora da questão da identidade, que olha antes para o futuro que para o passado: É possível unir o Brasil em torno de um projeto próprio no mundo globalizado? Um livro para redescobrir o país e pensar em seus possíveis futuros. ");
		
		topicos.obraEstrangeira.add("Imagined Communities");
		topicos.obraEstrangeira.add("Comunidades Imaginadas");
		
		bancoObras.add(topicos);
		
		//
		
		FiloBraObras autoengano = new FiloBraObras("Autoengano (Eduardo Giannetti) - " +
		"Reflexão profunda e original sobre a necessidade que tem o ser humano de se iludir a si mesmo, bem como sobre as implicações éticas dessa tendência na vida pública e na vida pessoal." + 
		"Este é um livro sobre as mentiras que contamos a nós mesmos. Mentimos para nós o tempo todo: adiantamos o despertador para não perder a hora, acreditamos nas juras da pessoa amada, só levamos realmente a sério os argumentos que sustentam nossas crenças. Além disso, temos a nosso próprio respeito uma opinião que quase nunca coincide com a extensão de nossos defeitos e qualidades. " +
		"Sem o autoengano, a vida seria excessivamente dolorosa e desprovida de encanto. Abandonados a ele, entretanto, perdemos a dimensão que nos reúne às outras pessoas e possibilita a convivência social. " +
		"O problema é que as mentiras que nos contamos não trazem seu nome verdadeiro estampado na fronte. É preciso, por isso, analisar os caminhos que nos levam até elas: encontraremos aí a origem de grandes conquistas e alegrias, mas também dos sofrimentos que muitas vezes causamos a nós mesmos e às pessoas que nos cercam.");
		
		autoengano.obraEstrangeira.add("Rapido e devagar: duas formas de pensar");
		autoengano.obraEstrangeira.add("Thinking, Fast and Slow");
		
		bancoObras.add(autoengano);
		
		//
		
		FiloBraObras vicios = new FiloBraObras("Vícios privados, benefícios públicos? (Eduardo Giannetti) - " +
		"Ganância, inveja, egoísmo, esperteza: o que tudo isso tem a ver com a riqueza das nações? Qual a relação entre ética e racionalidade? Até que ponto a 'mão invisível' do mercado é suficiente para levar uma sociedade da pobreza ao máximo de prosperidade? Ou será que o próprio progresso científico, tecnológico e material do mundo moderno é a causa da decadência moral do homem? Examinando a evolução do pensamento filosófico e econômico da Antiguidade clássica aos nossos dias, este livro busca a resposta para estas e outras questões que envolvem as relações entre ética e economia. Sem cair no moralismo fácil nem na pura engenharia econômica, Eduardo Giannetti da Fonseca recupera o papel das virtudes privadas para a vida comunitária organizada e o progresso das nações. Prêmio Jabuti 1994 de Melhor Ensaio e Biografia.");
		
		vicios.obraEstrangeira.add("Teoria dos Sentimentos Morais");
		vicios.obraEstrangeira.add("The Theory of Moral Sentiments");
		
		bancoObras.add(vicios);
		
		//
		
		FiloBraObras felicidade = new FiloBraObras("Felicidade (Eduardo Giannetti) - " +
		"Os personagens são bem brasileiros e contemporâneos: uma jornalista estudiosa de ética clássica, um economista liberal, um roteirista de documentários que abandonou o marxismo pela filosofia analítica e um erudito desempregado. Em Felicidade, eles se encontram periodicamente para discutir um tema por eles determinado. Nessas reuniões, um deles faz uma breve exposição inicial seguida de um debate. A forma do novo livro de Eduardo Giannetti casa-se perfeitamente aos propósitos do autor. Não se trata de defender um ponto de vista, mas de colocar determinadas questões em relevo - questões fundamentais, mas frequentemente esquecidas pelos cadernos de economia.");
		
		felicidade.obraEstrangeira.add("O utilitarismo");
		felicidade.obraEstrangeira.add("Utilitarianism");
		
		bancoObras.add(felicidade);
		
		//
		
		FiloBraObras ilusao = new FiloBraObras("A Ilusão da Alma (Eduardo Giannetti) - " +
		"A ilusão da alma é o relato em primeira pessoa de uma perturbadora conversão filosófica. Após a retirada de um tumor cerebral que o deixa parcialmente surdo, um jovem professor de literatura, especialista em Machado de Assis, isola-se do mundo e passa a viver, entre livros e livros, absorvido por uma paixão intelectual: o estudo da relação entre o cérebro e a mente. Do embate entre Sócrates e Demócrito no iluminismo grego do século V a.C. aos achados e espantos da moderna neurociência, a trama do livro descreve passo a passo, com detalhe e precisão, mas sem perder a visão de conjunto, a viagem de descoberta do narrador pela história das ideias.");
		
		ilusao.obraEstrangeira.add("The Conscious Mind");
		
		bancoObras.add(ilusao);
		
		//
		
		FiloBraObras mercado = new FiloBraObras("O Mercado das Crenças (Eduardo Giannetti) - " +
		"Publicado originalmente nos Estados Unidos, em 1991, O mercado das crenças, de Eduardo Giannetti, ganha sua primeira edição brasileira. Livro de estréia do autor, o ensaio trata do papel da filosofia política e econômica (as 'idéias') nos processos de formação das crenças e de mudança social. A intenção principal é entender o comportamento da economia pelo exame das motivações não-racionais (as 'paixões'). O livro parte das concepções de pensadores como David Hume e Adam Smith para entender o modo como as paixões acabam por afetar nossa conduta como consumidores, produtores e tomadores de decisão.");
		
		mercado.obraEstrangeira.add("A Treatise of Human Nature");
		mercado.obraEstrangeira.add("Tratado da Natureza Humana");
		
		bancoObras.add(mercado);
		
		//
		
		FiloBraObras ideias = new FiloBraObras("Ideias Para Adiar o Fim do Mundo (Ailton Krenak) - " +
		"Uma parábola sobre os tempos atuais, por um de nossos maiores pensadores indígenas. " +
		"Ailton Krenak nasceu na região do vale do rio Doce, um lugar cuja ecologia se encontra profundamente afetada pela atividade de extração mineira. Neste livro, o líder indígena critica a ideia de humanidade como algo separado da natureza, uma 'humanidade que não reconhece que aquele rio que está em coma é também o nosso avô'. " +
		"Essa premissa estaria na origem do desastre socioambiental de nossa era, o chamado Antropoceno. Daí que a resistência indígena se dê pela não aceitação da ideia de que somos todos iguais. Somente o reconhecimento da diversidade e a recusa da ideia do humano como superior aos demais seres podem ressignificar nossas existências e refrear nossa marcha insensata em direção ao abismo.");
		
		ideias.obraEstrangeira.add("Braiding Sweetgrass");
		ideias.obraEstrangeira.add("A maravilhosa trama das coisas");
		
		bancoObras.add(ideias);
		
		//
		
		FiloBraObras amanha = new FiloBraObras("O Amanhã Não Está à Venda (Ailton Krenak) - " +
		"As reflexões de um de nossos maiores pensadores indígenas sobre a pandemia que parou o mundo. " +
		"Há vários séculos que os povos indígenas do Brasil enfrentam bravamente ameaças que podem levá-los à aniquilação total e, diante de condições extremamente adversas, reinventam seu cotidiano e suas comunidades. Quando a pandemia da Covid-19 obriga o mundo a reconsiderar seu estilo de vida, o pensamento de Ailton Krenak emerge com lucidez e pertinência ainda mais impactantes.");
		
		amanha.obraEstrangeira.add("Walden");
		amanha.obraEstrangeira.add("A vida nos bosques");
		
		bancoObras.add(amanha);
		
		//
		
		FiloBraObras util = new FiloBraObras("A Vida Não é Útil (Ailton Krenak) - " +
		"Em reflexões provocadas pela pandemia de covid-19, o pensador e líder indígena Ailton Krenak volta a apontar as tendências destrutivas da chamada \"civilização\": consumismo desenfreado, devastação ambiental e uma visão estreita e excludente do que é a humanidade. " +
		"Um dos mais influentes pensadores da atualidade, Ailton Krenak vem trazendo contribuições fundamentais para lidarmos com os principais desafios que se apresentam hoje no mundo: a terrível evolução de uma pandemia, a ascensão de governos de extrema-direita e os danos causados pelo aquecimento global.");
		
		util.obraEstrangeira.add("Silent Spring");
		util.obraEstrangeira.add("Primavera Silenciosa");
		
		bancoObras.add(util);
		
		//
		
		FiloBraObras esquerda = new FiloBraObras("A Esquerda Que Não Teme Dizer Seu Nome (Vladimir Safatle) - " + 
		"Os comentários sobre o filósofo Vladimir Safatle - a exemplo dos selecionados pelo próprio autor - evidenciam a comoção gerada, ao longo dos anos, por suas ideias, algumas das quais estão presentes em A esquerda que não teme dizer seu nome, sua obra mais polêmica. Nestas páginas, Safatle argumenta que, nas últimas décadas, a esquerda abandonou os fundamentos da luta política, limitando-se a gerenciar as crises políticas e econômicas geradas pelo capitalismo neoliberal e perdendo seu ímpeto revolucionário. " +
		"Para o filósofo, ao renunciar ao que era essencial em suas teorias e em sua história - a defesa radical do igualitarismo em todas as suas dimensões e da soberania popular -, a esquerda morreu. Revivê-la exigiria romper com a gestão de crises conexas inerentes ao sistema e unir os oprimidos contra seus opressores.");
		
		esquerda.obraEstrangeira.add("O Capital");
		esquerda.obraEstrangeira.add("Das Kapital");
		
		bancoObras.add(esquerda);
		
		//
		
		FiloBraObras cinismo = new FiloBraObras("Cinismo e a Falência da Crítica (Vladimir Safatle) - " + 
		"Durante algum tempo acreditou-se que o esgotamento de modos de pensar e de formas de vida nos levaria, necessariamente, a realidades sociais renovadas. Como se após a queda viesse a redenção." +
		"Mas o que dizer quando nenhum acontecimento vem após a crise, quando certa estabilidade parece desenhar-se em meio à desagregação de padrões normativos? Neste livro, Vladimir Safatle oferece uma interpretação original desse fenômeno de 'estabilização na decomposição'. O filósofo propõe tirar as consequências da ideia de que nossas sociedades capitalistas avançadas conseguiram organizar-se a partir de uma racionalidade cínica. O resultado é uma obra que repensa as bases do que significa fazer crítica no século XXI. Afinal, se 'cinismo'" +
		"é o nome da decomposição de valores e critérios normativos que pareciam ser o saldo mais valioso de nossas expectativas modernas de racionalização social, então ele traz necessariamente consigo a falência de certa forma de crítica.");
		
		cinismo.obraEstrangeira.add("Critica da Razao Cinica");
		cinismo.obraEstrangeira.add("Critique of Cynical Reason");
		
		bancoObras.add(cinismo);
		
		//
		
		FiloBraObras paixao = new FiloBraObras("A Paixão do Negativo: Lacan e a dialética (Vladimir Safatle) - " + 
		"Construindo o espaço conceitual comum a dois pensamentos que se ignoraram durante meio século, o de Lacan e o de Adorno, Vladimir Safatle faz muito mais que uma aproximação interessante. Ele confronta duas filosofias apoiadas, cada uma, em uma prática: a cura psicanalítica para um, a criação artística para outro; assim como obriga o pensamento a se interrogar sobre o que um sistema, que tem sua densidade própria de teoria, deve à prática ou à experiência que ele privilegia.");
		
		paixao.obraEstrangeira.add("Dialetica Negativa");
		paixao.obraEstrangeira.add("Negative Dialectics");
		
		bancoObras.add(paixao);
		
		//
		
		FiloBraObras concreta = new FiloBraObras("Filosofia Concreta (Mário Ferreira dos Santos) - " +
		"Pela primeira vez, a obra-prima de Mário Ferreira dos Santos chega ao público em edição crítica - com texto minuciosamente revisado, farto material iconográfico e ensaios que iluminam o projeto intelectual desse que foi um dos maiores pensadores brasileiros. Filosofia Concreta apresenta o seu próprio sistema filosófico, que propõe uma compreensão unificada da realidade, formulada com rigor matemático, em diálogo com os achados da ciência contemporânea e fundamentando as positividades concebidas pela tradição. Além de mantidas as notas explicativas de Luís Mauro Sá Martino, presentes desde a publicação anterior pela É Realizações Editora, foram acrescentadas notas que dão a localização bibliográfica de quase todas as fontes e citações empregadas pelo autor. Inaugurando a Biblioteca Mário Ferreira dos Santos, a Editora Filocalia oferece este volume em acabamento de luxo, com capa dura revestida por tecido e sob projeto gráfico de um dos maiores designers modernos, Alexandre Wollner. ");
		
		concreta.obraEstrangeira.add("Metafisica");
		concreta.obraEstrangeira.add("Metaphysics");
		
		bancoObras.add(concreta);
		
		//
		
		FiloBraObras sabedoria = new FiloBraObras("A Sabedoria das Leis Eternas (Mário Ferreira dos Santos) - " +
		"'A Sabedoria das Leis Eternas' propõe que o universo não é caótico, mas governado por leis universais imutáveis e inteligíveis. Através de uma abordagem que une a tradição pitagórica e a lógica, Mário Ferreira dos Santos demonstra como essas leis operam desde a metafísica abstrata até as ciências práticas e a vida humana.");
		
		sabedoria.obraEstrangeira.add("Timeu");
		sabedoria.obraEstrangeira.add("Timaeus");
		
		bancoObras.add(sabedoria);
		
		//
		
		FiloBraObras franklin = new FiloBraObras("A Ética (Franklin Leopoldo e Silva e Joel Gracioso) - " +
		"Neste volume, os autores apresentam três momentos incontornáveis da história da Ética, em diálogo com os quais deve dialogar toda reflexão sobre o agir livre e responsável: a ética dos hábitos segundo Aristóteles; a ética filosófico-religiosa de Tomás de Aquino e a ética universal e laica de Immanuel Kant. ");
		
		franklin.obraEstrangeira.add("Nicomachean Ethics");
		franklin.obraEstrangeira.add("Etica a Nicomaco");
		franklin.obraEstrangeira.add("A Fundamentacao da Metafisica dos Costumes");
		franklin.obraEstrangeira.add("Groundwork of the Metaphysics of Morals");
		
		bancoObras.add(franklin);
		
		//
		
		FiloBraObras descartes = new FiloBraObras("Descartes: a metafísica da modernidade (Franklin Leopoldo e Silva e Joel Gracioso) - " +
		"É uma análise rigorosa e acessível sobre a obra de René Descartes e a fundação do pensamento moderno.");
		
		descartes.obraEstrangeira.add("Meditacoes sobre Filosofia Primeira");
		descartes.obraEstrangeira.add("Meditations on First Philosophy");
		
		bancoObras.add(descartes);
		
		//
		
		FiloBraObras bergson = new FiloBraObras("Bergson: Intuição e Discurso Filosófico (Franklin Leopoldo e Silva e Joel Gracioso) - " +
		"O livro Bergson: Intuição e Discurso Filosófico, escrito pelo filósofo brasileiro Franklin Leopoldo e Silva, analisa detalhadamente como Henri Bergson estruturou a intuição como o método central de sua filosofia, investigando o profundo desafio de expressar uma experiência imediata e fluida por meio de uma linguagem inerentemente rígida. Dividida em três partes, a obra examina a crítica de Bergson aos métodos racionalistas tradicionais e reflete sobre o paradoxo de traduzir a pura duração do tempo vivo em conceitos estáticos e espaciais. O livro demonstra que, para Bergson, o discurso filosófico não deve imitar o rigor geométrico das ciências, mas sim valer-se de uma multiplicidade de imagens e metáforas para contornar as limitações da inteligência prática e reconectar o leitor diretamente com o fluxo contínuo da realidade.");
		
		bergson.obraEstrangeira.add("Ensaio sobre os dados imediatos da consciencia");
		bergson.obraEstrangeira.add("Essays on the Immediate Data of Consciousness");
		
		bancoObras.add(bergson);
		
		//
		
		FiloBraObras marcondes = new FiloBraObras("A Filosofia: O que é? Para que serve? (Danilo Marcondes e Irley Franco) - " +
		"Todo filósofo enfrentou ou enfrentará, em algum momento, dúvidas quanto a o que é filosofia, qual vertente escolher, para que serve sua matéria, qual o melhor caminho a seguir. A própria filosofia conduz naturalmente a estas perguntas, já que tem como característica colocar a si mesma em questão. Por isso, Danilo Marcondes e Irley Franco levam o leitor a pensar sobre o tema de forma geral, percebendo também como as respostas para questões como essas podem variar ao longo do tempo. Os capítulos tratam do que é filosofia, sua utilidade, tipos de filósofos (crítico, metafísico, político, comentador...)," +
		"formas de conceber a matéria (como meio de buscar conhecimento, como meio de questionamento, como sistema de pensamento...) e as peculiaridades de cada estilo de escrita filosófica (diálogo, aforismo, ensaio, confissão...). O livro traz também um glossário dos principais conceitos em sua origem e um quadro cronológico da filosofia antiga, agrupando lado a lado eventos filosóficos e científicos, artísticos e culturais, históricos e políticos.");
		
		marcondes.obraEstrangeira.add("O Valor da Filosofia");
		marcondes.obraEstrangeira.add("The Value of Philosophy");
		
		bancoObras.add(marcondes);
		
		//
		
		FiloBraObras analitica = new FiloBraObras("Filosofia Analítica (Danilo Marcondes) - " +
		"A filosofia analítica surgiu no século XIX e é desde então campo de intensos debates. O autor discute a contribuição de alguns dos mais influentes filósofos do que podemos considerar a 'tradição analítica' na filosofia contemporânea, de Frege e Wittgenstein à Escola de Oxford. ");
		
		analitica.obraEstrangeira.add("Investigacoes Filosoficas");
		analitica.obraEstrangeira.add("Philosophical Investigations");
		
		bancoObras.add(analitica);
		
		//
		
		FiloBraObras language = new FiloBraObras("Language and Action: A Reassessment of Speech Act Theory (Danilo Marcondes) - " +
		"Este trabalho consiste em um exame e uma revisão de algumas das principais teses da Teoria dos Atos de Fala em relação ao problema da ideologia e da linguagem orientadora da ação. Partindo da ideia de que a filosofia da linguagem deve levar em conta como a estrutura social da comunidade linguística pode influenciar e direcionar a maneira como sua linguagem é utilizada, propõe-se um método crítico de análise, desenvolvendo a Teoria dos Atos de Fala de modo adequado a esse propósito. A diretriz principal dessa proposta é a consideração de que uma teoria da ação - e não uma teoria do significado - deve ser tomada como central na análise da linguagem. Discutem-se, então, a noção de força ilocucionária, o problema das intenções e convenções na constituição dos atos de fala, a definição de contexto e a classificação dos atos de fala. Com base nas conclusões dessa discussão, formula-se um método pragmático para a análise da linguagem.");
		
		language.obraEstrangeira.add("Quando dizer e fazer");
		language.obraEstrangeira.add("How to Do Things with Words");
		language.obraEstrangeira.add("Atos de Fala: Um Ensaio sobre a Filosofia da Linguagem");
		language.obraEstrangeira.add("Speech Acts");
		
		bancoObras.add(language);
		
		//
		
		FiloBraObras crista = new FiloBraObras("O surgimento da filosofia cristã (Danilo Marcondes) - " +
		"Nesse guia de leitura através da história da filosofia, Danilo Marcondes seleciona os períodos, pensadores e temas mais representativos dessa tradição, de seu desenvolvimento e de suas crises. Situa pensadores e correntes filosóficas em seu contexto histórico, discute ideias e conceitos e, quando necessário, apresenta os textos mais relevantes dos filósofos em questão. ");
		
		crista.obraEstrangeira.add("Confissoes");
		crista.obraEstrangeira.add("Confessions");
		
		bancoObras.add(crista);
		
		//
		
		FiloBraObras introducao = new FiloBraObras("Ideologia: uma introdução (Marilena Chauí) - " +
		"A ideologia nos permite tomar o falso por verdadeiro e o injusto por justo. Mas de que maneira essa miragem se manifesta? Pela política, pela cultura, pela educação, pela tecnologia? Quais são seus mecanismos e quais os impactos sociais e econômicos desse processo? De forma introdutória, mas sem perder a contundência de suas reflexões, a filósofa Marilena Chaui esclarece que a ideologia não é apenas um conjunto encadeado de ideias, como sugere o senso comum. Trata-se, na verdade, de um sistema histórico, social e político que não apenas estrutura a percepção da realidade, mas também a oculta, com o propósito de perpetuar a desigualdade social e a dominação política.");
		
		introducao.obraEstrangeira.add("A Ideologia Alema");
		introducao.obraEstrangeira.add("Die Deutsche Ideologie");
		introducao.obraEstrangeira.add("The German Ideology");
		
		bancoObras.add(introducao);
		
		//
		
		FiloBraObras democracia = new FiloBraObras("Cultura e Democracia: o discurso competente e outras falas (Marilena Chauí) - " +
		"Este livro mostra que a luta pela democracia revelou-se muito difícil. É o que atesta o ensaio inédito sobre as relações entre ética, política e os problemas da moralização da política como substituto para a moralidade institucional ou pública.");
		
		democracia.obraEstrangeira.add("Da Democracia na America");
		democracia.obraEstrangeira.add("Democracy in America");
		
		bancoObras.add(democracia);
		
		//
		
		FiloBraObras deleuze = new FiloBraObras("Deleuze & a educação (Sílvio Gallo) - " +
		"Neste livro, Silvio Gallo analisa o pensamento do filósofo francês Gilles Deleuze, principalmente nos pontos em que ele é mais importante e produtivo para compreendermos o mundo contemporâneo e o papel da Educação no estabelecimento das novas práticas de controle e de subjetivação que hoje estão em curso.");
		
		deleuze.obraEstrangeira.add("Diferenca e repeticao");
		deleuze.obraEstrangeira.add("Difference and Repetition");
		
		bancoObras.add(deleuze);
		
		//
		
		FiloBraObras cidadania = new FiloBraObras("Ética e Cidadania: Caminhos da filosofia (Sílvio Gallo) - " +
		"A filosofia não tem uma 'fórmula mágica' para resolver os problemas da vida de ninguém, mas pode ser um instrumento interessante para entender melhor situações de nosso cotidiano, possibilitando que façamos escolhas melhores, mais conscientes. Pensando nisso, alguns professores do Grupo de Estudos sobre Ensino de Filosofia (Gesef) dedicaram-se à tarefa de organizar uma viagem pela filosofia, tendo por bússola a temática Ética e Cidadania." +
		"Essa obra, que recebeu o prêmio Jabuti em 1998, pretende despertar a curiosidade, provocar o questionamento, diante de fatos e informações que passam despercebidos no dia a dia. Trata-se de um caminho proposto, de um roteiro de viagem. O professor tem a liberdade de alterar a rota e programar a viagem como preferir. Sendo assim, esse livro foi pensado como um ponto de partida que viabilize um exercício de reflexão para professores e alunos, uma produção coletiva de saber, como é a própria filosofia. ");
		
		cidadania.obraEstrangeira.add("O Basico da Filosofia");
		cidadania.obraEstrangeira.add("Philosophy: The Basics");
		
		bancoObras.add(cidadania);
		
		//
		
		FiloBraObras brasil = new FiloBraObras("Contribuição à História das Ideias no Brasil (João Cruz Costa) - " +
		"Em 'Contribuição à História das Ideias no Brasil', João Cruz Costa defende que o pensamento nacional não se baseia na criação de sistemas filosóficos originais, mas sim na adaptação e acomodação de correntes intelectuais europeias - como o ecletismo e o positivismo - às realidades históricas, sociais e econômicas do país. O autor examina cronologicamente essa evolução, desde o forte domínio da mentalidade escolástica e jesuítica no período colonial até as transformações políticas e intelectuais que culminaram na Revolução de 1930, evidenciando como essas ideias serviram de ferramenta para as elites locais.");
		
		brasil.obraEstrangeira.add("A Estrutura das Revolucoes Cientificas");
		brasil.obraEstrangeira.add("The Structure of Scientific Revolutions");
		
		bancoObras.add(brasil);
		
		//
		
		FiloBraObras roberto = new FiloBraObras("Conhecimento e política (Roberto Mangabeira Unger) - " +
		"Conhecimento e política, publicado em 1975, foi o primeiro livro de Roberto Mangabeira Unger. A editora LeYa Brasil o publica novamente agora, na tradução primorosa da mãe do autor, a poetisa Edyla Mangabeira Unger, para dar início à reedição de toda a obra de Mangabeira no Brasil, uma obra que se mantém atual e, ao mesmo tempo, visionária.O tema do livro é a superação do mais influente sistema de ideias no pensamento Ocidental desde a Renascença: conjunto de conceitos que abrange o individualismo e o liberalismo na política, o ceticismo e o subjetivismo na ética, e o empiricismo e positivismo na filosofia do conhecimento e da natureza. Desde que saiu da sombra de Aristóteles e do cristianismo, o pensamento ocidental se entregou, argumenta Mangabeira, à construção de uma maneira de pensar que o levou a contradições insolúveis e nos fez perder o rumo do esclarecimento e da emancipação.");
		
		roberto.obraEstrangeira.add("A Sociedade Aberta e Seus Inimigos");
		roberto.obraEstrangeira.add("The Open Society and Its Enemies");
		
		bancoObras.add(roberto);
		
		//
		
		FiloBraObras propor = new FiloBraObras("O que a esquerda deve propor (Roberto Mangabeira Unger) - " +
		"O que a esquerda deve propor é um manifesto que aborda uma questão vital do nosso tempo: o programa que a esquerda deve defender agora que as propostas ideológicas dos últimos duzentos anos se esgotaram. Neste livro, publicado originalmente em 2005, Mangabeira faz uma crítica à social-democracia institucionalmente conservadora e aponta a existência de duas principais esquerdas no mundo hoje. Uma delas busca desacelerar a marcha para a globalização, sem, no entanto, oferecer alternativas ou tampouco se apresentar como portadora dos interesses humanos universais. A outra aceita a economia atual como inevitável ou mesmo benéfica, buscando humanizá-la, porém sem ter um programa em que se basear. Para ele, precisamos de uma terceira esquerda, determinada a democratizar a economia de mercado e aprofundar a democracia - uma esquerda reconstrutora, capaz de, mais do que usar a redistribuição compensatória para encobrir desigualdades, atuar em prol de um crescimento econômico socialmente inclusivo.");
		
		propor.obraEstrangeira.add("The Communist Manifest");
		propor.obraEstrangeira.add("O Manifesto Comunista");
		
		bancoObras.add(propor);
		
		//
		
		FiloBraObras liberalismo = new FiloBraObras("O Liberalismo: Antigo e Moderno (José Guilherme Merquior) - " +
		" José Guilherme Merquior faz uma pesquisa estimulante sobre a história e evolução da teoria liberal desde o século XVII até o tempo presente. Combina uma enorme riqueza de informações - surpreendentemente condensada - com penetrante apresentação dos temas centrais do liberalismo. Esta edição é enriquecida por vasta fortuna crítica e documentos do arquivo pessoal do autor. ");
		
		liberalismo.obraEstrangeira.add("A Liberdade");
		liberalismo.obraEstrangeira.add("On Liberty");
		
		bancoObras.add(liberalismo);
		
		//
		
		FiloBraObras marxismo = new FiloBraObras("O Marxismo Ocidental (José Guilherme Merquior e Raul de Sá Barbosa) - " +
		"Chama-se marxismo ocidental à corrente dos intelectuais de esquerda que expressaram reservas em relação ao socialismo autoritário e que concentraram a aplicação dos conceitos marxistas na análise dos temas da cultura, muito mais que na dos problemas econômicos. Expondo com detalhes as suas fontes - em Hegel e Marx -, os seus fundamentos - em Lukács e Gramsci - e as suas implicações - em Benjamin, Adorno, Horkheimer, Sartre, Althusser, Marcuse, Habermas, entre outros -, José Guilherme Merquior sustenta que a crítica cultural empreendida por tais pensadores foi, com variações de grau, abstrata e generalizante. 'O Marxismo Ocidental' foi elogiado por John Gray, eleito 'livro do ano' no Financial Times e editado em espanhol por Octavio Paz. Esta reedição inclui uma extensa galeria de fac-símiles de reportagens, cartas e manuscritos relacionados à obra.");
		
		marxismo.obraEstrangeira.add("The History of Marxism");
		marxismo.obraEstrangeira.add("A História do Marxismo");
		
		bancoObras.add(marxismo);
		
		//
		
		FiloBraObras estudos = new FiloBraObras("Estudos de Filosofia (Luiz Antonio Barreto) - " +
		"Em momentos pontuais é possível perceber o contexto em que os textos descritos nesta obra, revelam a simpatia de Tobias Barreto, pelo positivismo de Auguste Comte, bem como pelas discursões contra o pensamento tomista de Soriano de Souza. Os textos reunidos neste livro, revelam o vigor do pensamento de Tobias Barreto em matéria de análise filosófica. Crítico mordaz de algumas ideias tradicionais, tanto em matéria de filosofia como de religião, Tobias Barreto realiza, utilizando-se de fontes que revelam, em última instância, seu profundo conhecimento da tradição filosófica, uma exposição argumentativa sobre as questões que ainda permanecem como desafios para o pensamento filosófico. ");
		
		estudos.obraEstrangeira.add("Discourse on the Method");
		estudos.obraEstrangeira.add("Discurso sobre o Metodo");
		
		bancoObras.add(estudos);
		
		//
		
		FiloBraObras social = new FiloBraObras("Crítica Política e Social (Luiz Antonio Barreto) - " +
		"A produção intelectual do pensador Tobias Barreto, não permite que tratemos suas obras como 'Crítica política e social',como um rascunho ou mesmo uma resenha, ela está empregnada de uma magnitude e diversidade, aliada a agressividade provocativa própria aos que se inserem no seu tempo. Tobias Barreto, foi perfeito, eclético sem ser ilusório ou pouco sólido. Refletiu com beleza poética, sobre as questões sociais e políticas sem perder de vista as relações humanas do amor e solidariedade.");
		
		social.obraEstrangeira.add("Do Contrato Social");
		social.obraEstrangeira.add("The Social Contract");
		
		bancoObras.add(social);
		
		//
		
		FiloBraObras religiao = new FiloBraObras("Crítica de Religião (Luiz Antonio Barreto) - " +
		"Como opção de vida Tobias Barreto assumiu um caminho traçado na reflexão filosófica, Ele não poderia ser diferente a alguém que defendia o livre-pensar, opondo-o ao conservadorismo espiritualista. É neste contexto que se pode compreender 'Crítica e religião', no qual Tobias Barreto explica toda sua aversão à filosofia religiosa, marca permanente de suas reflexões e das polêmicas que sustentou. Era, sob a sua maneira de ver, a luta da fé contra a razão. Sustentava que somente a observação nos dá balizas de conhecimento, tanto no mundo material, quanto no mundo espiritual.");
		
		religiao.obraEstrangeira.add("The Antichrist");
		religiao.obraEstrangeira.add("O Anticristo");
		
		bancoObras.add(religiao);
		
		//
		
		FiloBraObras teleologia = new FiloBraObras("Finalidade do mundo: estudos de filosofia e teleologia naturalista (Raimundo de Farias Brito) - " +
		"No primeiro volume, publicado em 1895, Farias Brito (1862-1917) envereda por considerações sobre a moral e a filosofia, assim como analisa as relações entre direito e moral, metafísica e positivismo, a filosofia frente à ciência, poesia, religião, o materialismo e o idealismo, além de outros temas como intuição mecânica ou monismo naturalístico. No segundo tomo, publicado em 1899, faz uma exegese da filosofia dogmática, estuda as origens mesmo da filosofia, discorre sobre o método empírico, o monismo de Spinoza, as teorias de Stuart Mill e Herbert Spencer. Ele próprio assinalou que esta segunda parte dedicaria à filosofia moderna.");
		
		teleologia.obraEstrangeira.add("O Mundo como Vontade e Representacao");
		teleologia.obraEstrangeira.add("The World as Will and Representation");
		
		bancoObras.add(teleologia);
		
		//
		
		FiloBraObras herois = new FiloBraObras("História do Brasil: Ensinada pela biografia de seus heróis (Sílvio Romero) - " +
		"Lembrai-vos também que, como disse o poeta, a pátria somos nós! A nacionalidade não se resume a um território demarcado no mapa. Ela é, antes de tudo, o conjunto de feitos, de lutas, de ideais e de conquistas que moldaram uma pátria ao longo do tempo. O que une um povo não é apenas a terra que habita, mas a memória viva de sua história - a geografia de seus heróis, de suas grandezas morais e de seus altos ideais. Ser brasileiro é conhecer não somente rios, montanhas e fronteiras, mas os homens e mulheres que, com coragem e visão, deram sentido a esta nação. E se a nacionalidade é construída por esses feitos, como conhecê-los verdadeiramente senão voltando às vidas daqueles que os realizaram? Pois amar a pátria exige conhecê-la - e não se ama o que não se conhece. É a essa necessidade que responde História do Brasil: Ensinada pela biografia de seus heróis, de Sílvio Romero. Concebida com finalidade didática e cívica, a obra apresenta a formação do Brasil por meio das biografias daqueles que encarnaram seus ideais mais elevados. Mais do que uma sucessão de fatos, o livro oferece uma narrativa formadora, que revela o Brasil como missão histórica, terra de encontro de raças e culturas, chamada a desempenhar um papel ilustre no progresso da humanidade. Vigorosa e profundamente patriótica, esta obra convida o leitor - jovem ou adulto - a reconhecer-se na continuidade dessa história e a compreender que a grandeza nacional começa quando cada geração decide, consciente de seu passado, elevar ainda mais o ideal da pátria. ");
		
		herois.obraEstrangeira.add("Imagined Communities");
		herois.obraEstrangeira.add("Comunidades Imaginadas");
		
		bancoObras.add(herois);
		
		//
		
		FiloBraObras tomo = new FiloBraObras("História da Literatura Brasileira: Tomo 1 (Sílvio Romero) - " +
		"Mais do que protagonista de um movimento transformador da vida brasileira, a partir da segunda metade do século XIX, Sílvio Romero elaborou uma obra inovadora, abrangente, que inaugurou a bibliografia genuinamente nacional. Os estudos de etnologia ede folclore, de filosofia, de crítica e de história literária foram transformados em livros fundamentais para o Brasil. Se alguém quisesse achar Sílvio Romero, bastava procurar uma polêmica. Era onde ele sempre estava. Conhecido por defenestrar a obra de Machado de Assis, Romero pecou aí mas acertou em tantas outras análises.");
		
		tomo.obraEstrangeira.add("The History of English Literature");
		tomo.obraEstrangeira.add("A Historia da Literatura Inglesa");
		
		bancoObras.add(tomo);
		
		//
		
		FiloBraObras autoritarismo = new FiloBraObras("Manifestações ideológicas do autoritarismo brasileiro: 2 (Marilena Chauín) - " +
		"Este segundo volume da coleção Escritos de Marilena Chaui chega em hora propícia, logo quando o país se surpreende com inúmeras manifestações massivas, intimamente vinculadas ao evidente autoritarismo da política brasileira. Estão reunidos aqui artigos publicados em livros, revistas e jornais nas décadas de 1970, 1980, 1990 e 2000, que oferecem ao leitor uma consistente análise das diversas manifestações ideológicas do autoritarismo já ocorridas e ainda presentes no país, tendo como pano de fundo o contexto dessas décadas. O leitor encontrará nestes textos motivações para investigar as origens do autoritarismo brasileiro e criticar as suas manifestações atuais. Observadora atenta das lutas sociais na sociedade de classes desde a década de 1970, Marilena Chaui oferece aqui um instrumental crítico que compreende desde a visão autoritária das elites dominantes até sua atuação na conformação do Estado." +
		"O livro traz, portanto, questões de fundo da ideologia e do autoritarismo nativo, em um rico conjunto de textos de cunho eminentemente político e que reforçam o fortalecimento, ainda necessário, da democracia brasileira. ");
		
		autoritarismo.obraEstrangeira.add("As Origens do Totalitarismo");
		autoritarismo.obraEstrangeira.add("The Origins of Totalitarianism");
		
		bancoObras.add(autoritarismo);
		
		//
		
		FiloBraObras faculdade = new FiloBraObras("Escritos sobre a universidade (Marilena Chauí) - " +
		"Uma das mais brilhantes intelectuais brasileiras, Marilena Chauí discute em diversos ensaios a questão da universidade pública no Brasil. Temas como o da autonomia universitária cedendo lugar à universidade administrada nos moldes das grandes empresas privadas, a conseqüente con-fusão de critérios na avaliação de sua produtividade e a recente questão dos professores ditos improdutivos da Universidade de São Paulo, são tratados pela autora de forma combativa nesta obra.");
		
		faculdade.obraEstrangeira.add("The Idea of a University");
		faculdade.obraEstrangeira.add("A Ideia De Uma Universidade");
		
		bancoObras.add(faculdade);
		
		//
		
		FiloBraObras deturpacao = new FiloBraObras("O Brasil na História: Deturpação das Tradições e Degradação Política (Manoel Bomfim) - " +
		"Médico, psicólogo, professor e historiador, o sergipano Manoel Bomfim (1868-1932) foi, para o ensaísta Roberto Ventura, 'precursor de sociólogos e historiadores como Gilberto Freyre, Sérgio Buarque de Holanda e Caio Prado Jr. (...). Todos deram ênfase aos fatores sociais e culturais, e não mais étnicos ou climáticos, na interpretação da história e da sociedade'. Dele a Topbooks publicou outras obras importantes - O Brasil Nação (1996), O Brasil na América (1997) e A América Latina: males de origem (2005); todas passaram décadas fora das livrarias, assim como este O Brasil na história, esgotado há 83 anos, e que só agora ganha segunda edição, com prefácio de Ronaldo Conde Aguiar, autor de O rebelde esquecido: tempo, vida e obra de Manoel Bomfim (Topbooks, 2000). Segundo ele, 'Bomfim substituiu o desespero de Euclides da Cunha e a amargura de Sílvio Romero pela esperança de ver o Brasil livre, educado e desenvolvido. Talvez por isso seu nome, como o de tantas figuras que procurou reabilitar em O Brasil na história, tenha sido riscado da história brasileira oficial'. Na apresentação, a historiadora Mary del Priore ressalta que, 'em tempos de revisões historiográficas, em que tantos se perguntam sobre as condições de produção da história, é hora de ler Manoel Bomfim, e de fazê-lo com respeito e atenção'. Em parceria com a Editora PUC Minas.");
		
		deturpacao.obraEstrangeira.add("A Interpretacao das Culturas");
		deturpacao.obraEstrangeira.add("The Interpretation of Cultures");
		
		bancoObras.add(deturpacao);
		
		//
		
		FiloBraObras vaidade = new FiloBraObras("Reflexões Sobre a Vaidade dos Homens (Matias Aires) - " +
		"Vaidade de vaidades, diz o pregador, vaidade de vaidades. Tudo é vaidade\" - Eclesiastes 1:2 A obra Reflexões sobre a Vaidade dos Homens teve sua primeira edição em 1752, na qual Matias Aires Ramos da Silva de Eça faz considerações acerca da vida e do comportamento dos indivíduos, que cuidam mais das aparências que das substâncias, ocupando-se de viver de mentiras e não de verdades. Considerado o primeiro filósofo brasileiro, desenvolveu uma filosofia aforismática e moralista, quase que proverbial ao refletir na sentença do Rei Salomão sobre a vaidade. Ao considerar a vaidade como a grande paixão humana, o autor faz uma análise na qual os sentimentos se incorporam e se unem de tal forma a nós, que vêm a ficar sendo uma parte de nós mesmos. Desse ponto, conclui-se que a mais vã de todas as vaidades é a que resulta do saber, porquanto \"no homem não há pensamento que mais o agrade do que aquele que o representa superior aos demais, que é nele a parte mais sublime.");
		
		vaidade.obraEstrangeira.add("As Maximas");
		vaidade.obraEstrangeira.add("Maxims");
		
		bancoObras.add(vaidade);
		
		//
		
		FiloBraObras pensar = new FiloBraObras("Pensar e dizer: estudo do símbolo no pensamento e na linguagem (Manoel Bomfim) - " +
		"É possível dizer que Bomfim antecipou algumas ideias posteriormente correntes na psicologia, como as de Vigotski e Piaget, assim como as de Ernst Bloch e Antonio Gramsci na interpretação da sociedade. Nesta obra, aborda temas como: simbolização, símbolo, funções na literatura e na linguagem, pensamento e expressão.");
		
		pensar.obraEstrangeira.add("Curso de Linguistica Geral");
		pensar.obraEstrangeira.add("Course in General Linguistics");
		
		bancoObras.add(pensar);
		
		//
		
		FiloBraObras dirceu = new FiloBraObras("Marília de Dirceu (Tomás Antônio Gonzaga) - " +
		"Marília de Dirceu reúne a maior parte da breve produção literária de Tomás Antônio Gonzaga. As liras que compõem esta obra, muito além de um extravasamento amoroso, são um diálogo com os acontecimentos políticos, sociais e artísticos testemunhados pelo poeta e foram compostas, em parte, em seu período de cárcere, que antecedeu o exílio. Marcada pelo dualismo entre o universo imanente que é a arte e a realidade como ponto de partida, entre o presente turbulento do século XVIII e a Antiguidade clássica, 'Marília de Dirceu' influenciou toda a literatura brasileira vindoura, prenunciou o Romantismo e tornou-se um dos mais importantes clássicos de nossa língua. Num período em que o Brasil era parte do Império Português e em que literatura brasileira e portuguesa ainda não se distinguiam, Tomás Antônio Gonzaga deu alguns dos primeiros passos rumo a uma literatura nacional.");
		
		dirceu.obraEstrangeira.add("The Sorrows of Young Werthe");
		dirceu.obraEstrangeira.add("Os sofrimentos do jovem Werther");
		
		bancoObras.add(dirceu);
		
		//
		
		FiloBraObras formacao = new FiloBraObras("Formação do Brasil contemporâneo (Caio Prado Jr) - " +
		"Formação do Brasil contemporâneo é dos textos mais influentes sobre as relações entre nação e colônia no processo histórico que originou o Brasil. E é a ele, sobretudo, que Caio Prado Jr. deve seu lugar como grande intérprete do país. Marxista e militante ligado ao Partido Comunista Brasileiro (PCB), o autor não via, porém, o materialismo histórico como um conjunto de fórmulas a serem aplicadas, sem mediações históricas e analíticas, a qualquer realidade. Isso o levou, aguçado por uma grande sensibilidade em relação ao Brasil, desenvolvida também nas muitas viagens que fez pelo país e pelo gosto em fotografá-lo, a promover uma verdadeira \"nacionalização do marxismo\". Publicado em 1942, Formação do Brasil contemporâneo é um clássico do pensamento social e da historiografia brasileira que vem mobilizando estudiosos e atores políticos, seja para aceitar suas teses, problematizá-las ou mesmo rejeitá-las. Como poucos, o livro conseguiu formar nossa visão das origens coloniais do Brasil e do seu legado à nação. Divergindo daqueles que entendiam o período colonial em termos equivalentes ao feudalismo na Europa, Caio Prado Jr. o situa no processo de expansão ultramarina europeia resultante do capitalismo mercantil. Explicação tão bem-sucedida que dificilmente alguém acreditaria hoje num passado feudal brasileiro. Mas este livro é um clássico também pelo que nos permite entender de certos desafios tenazes, ainda hoje abertos à sociedade. Sua tese fundamental é a de \"sentido da colonização\", que expressa a reiteração, mesmo após a nossa independência política, do papel do Brasil como fornecedor de produtos primários demandados pelo mercado externo. Apesar das mudanças em curso desde então, e das novas configurações da cada vez mais complexa dialética entre centro e periferia, talvez bastasse constatar a importância no Brasil de hoje das commodities agrícolas e minerais para sugerir a atualidade da análise central do livro.");
		
		formacao.obraEstrangeira.add("Capitalismo e Moderna Teoria Social");
		formacao.obraEstrangeira.add("Capitalism and Modern Social Theory");
		
		bancoObras.add(formacao);
		
		//
		
		FiloBraObras logica = new FiloBraObras("Introdução à lógica (Cezar A. Mortari) - " +
		"Ao contrário do que pensam alguns, a lógica é uma ciência apaixonante e viva, fruto de rica história de evolução e transformação. Essa mesma história dinâmica é refletida por este livro, no qual se constrói uma rigorosa e abrangente introdução aos desenvolvimentos recentes e ao conteúdo clássico dessa ciência ilustre. Esta edição, revista e ampliada, traz um novo apêndice com noções de teoria do silogismo.");
		
		logica.obraEstrangeira.add("introduction to logic");
		logica.obraEstrangeira.add("Introducao a Logica");
		
		bancoObras.add(logica);
		
		//
		
		FiloBraObras mascara = new FiloBraObras("O Sentido e a Máscara (Gerd A. Bornheim) - " +
		"O panorama do teatro hoje é de uma riqueza imensa, de uma pluralidade de experiências jamais vista. Às vezes ele se afigura não só extremamente complexo como até caótico. Neste livro, com uma leitura crítica aprofundada, por quem dispõe de conhecimentos e instrumentos, o autor revela, certamente, a sua extraordinária amplitude. Não por outra razão, esta obra já é reconhecida como uma das mais importantes contribuições brasileiras para a preensão e compreensão do fenômeno teatral moderno.");
		
		mascara.obraEstrangeira.add("O Nascimento da Tragedia no Espirito da Musica");
		mascara.obraEstrangeira.add("The Birth of Tragedy");
		
		bancoObras.add(mascara);
		
		//
		
		FiloBraObras conceito = new FiloBraObras("Conceito de Tecnologia (Álvaro Vieira Pinto) - " +
		"É fato raro, no mundo editorial, que livros fundamentais de autores importantes permaneçam inéditos por muitos anos. Foi auspicioso receber a notícia de que a mais extensa obra de Álvaro Vieira Pinto (1909-1987) havia sido recém-descoberta, na forma de 1.410 laudas datilografadas em máquina de escrever, minuciosamente corrigidas a mão. O tema não poderia ser mais atual o conceito de tecnologia e a abordagem, fascinante e rara: aqui é um filósofo quem discorre sobre tecnologia, não um economista.");
		
		conceito.obraEstrangeira.add("The Question Concerning Technology");
		conceito.obraEstrangeira.add("A Questao da Tecnica");
		
		bancoObras.add(conceito);
		
		//
		
		FiloBraObras ciencia = new FiloBraObras("Ciência e Existência: Problemas Filosóficos da Pesquisa Científica (Álvaro Vieira Pinto) - " +
		"A pesquisa científica é o momento culminante de um processo de extrema amplitude e complexidade pelo qual o homem realiza sua suprema possibilidade existencial, aquela que dá conteúdo à sua essência de animal que conquistou a racionalidade: a possibilidade de dominar a natureza, transformá-la, adaptá-la às suas necessidades. Este processo chama-se conhecimento. [...] Para compreender e fundamentar o conhecimento, não partimos de um sujeito absoluto, como é o caso do 'eu penso', simples ideia intemporal, metafísica e de garantia unicamente subjetiva, relativa a um 'eu' que não é ninguém, que não está em situação no espaço e no tempo, mas do fato histórico, social, objetivo de que 'nós pensamos'.");
		
		ciencia.obraEstrangeira.add("A Logica da Pesquisa Cientifica");
		ciencia.obraEstrangeira.add("The Logic of Scientific Discovery");
		
		bancoObras.add(ciencia);
		
		//
		
		FiloBraObras nacional = new FiloBraObras("Consciência e realidade nacional (Álvaro Vieira Pinto) - " +
		"Com a reedição dos dois grandes volumes de \"Consciência e realidade nacional\", publicados pela primeira vez em 1960 e há muitos anos esgotados, a editora Contraponto prossegue o projeto de tornar disponíveis ao público leitor brasileiro as principais obras de um dos nossos maiores filósofos." +
		"Antes, editamos o inédito 'O conceito de tecnologia' também em dois volumes, \"A sociologia dos países subdesenvolvidos\" e 'Ciência e existência: problemas filosóficos da pesquisa científica'. A sequência prosseguirá.");
		
		nacional.obraEstrangeira.add("Pedagogy of the Oppressed");
		nacional.obraEstrangeira.add("Pedagogia do Oprimido");
		
		bancoObras.add(nacional);
		
		//
		
		FiloBraObras hegel = new FiloBraObras("A formação do pensamento de Hegel (Henrique Cláudio de Lima Vaz) - " +
		"O segundo volume da Obra Filosófica Inédita de Henrique Cláudio de Lima Vaz reúne quatro conjuntos de textos introdutórios, que exploram particularmente a formação do pensamento de Hegel até a Fenomenologia do Espírito. O primeiro é um relatório de pesquisa intitulado \"A construção hegeliana: um paradigma da racionalidade sistêmica\", relativo ao biênio 1988-1989 e enviado ao CNPq, do qual ele era então pesquisador-bolsista. O segundo texto é a transcrição da primeira parte do curso \"A dialética da História em Hegel\", ministrado no primeiro semestre de 1982. O terceiro texto é a transcrição de um caderno de apontamentos no qual se encontram o planejamento das aulas e a bibliografia da primeira parte do curso referido acima. O quarto também é a transcrição do manuscrito da primeira parte do planejamento das aulas e da bibliografia de outro curso intitulado \"Introdução ao estudo de Hegel\", ministrado no segundo semestre de 1984. A organização editorial dos textos deve-se ao minucioso trabalho do Prof. Dr. Arnaldo Fortes Drummond, estudioso do pensamento do Pe. Vaz e grande conhecedor da obra de Hegel.");
		
		hegel.obraEstrangeira.add("The Phenomenology of Spirit");
		hegel.obraEstrangeira.add("Fenomenologia do Espirito");
		
		bancoObras.add(hegel);
		
		//
		
		FiloBraObras comtemplacao = new FiloBraObras("Contemplação e dialética nos diálogos platônicos (Henrique Cláudio de Lima Vaz) - " +
		"O itinerário filosófico de Lima Vaz dá testemunho da presença constante de Platão na elaboração de suas ideias. Este livro vai estimular o leitor não somente na investigação do pensamento de Lima Vaz, mas também no debate sobre as questões fundamentais da existência, que ele soube abordar com tanta facilidade, enriquecendo assim o patrimônio filosófico nacional. ");
		
		comtemplacao.obraEstrangeira.add("The Republic");
		comtemplacao.obraEstrangeira.add("A Republica");
		
		bancoObras.add(comtemplacao);
		
		//
		
		FiloBraObras mistica = new FiloBraObras("Experiência mística e filosofia na tradição ocidental (Henrique Cláudio de Lima Vaz) - " +
		"Experiência mística e filosofia na tradição ocidental, escrita por Henrique Cláudio de Lima Vaz, sacerdote jesuíta, que se destacou nacional e internacionalmente por seu volume de produção filosófica.");
		
		mistica.obraEstrangeira.add("As Variedades da Experiencia Religiosa");
		mistica.obraEstrangeira.add("The Varieties of Religious Experience");
		
		bancoObras.add(mistica);
		
		//
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite uma obra estrangeira: ");
		String pesquisa = sc.nextLine();
		
		boolean existe = false;
		
		for (FiloBraObras obra : bancoObras) {
			
			if (obra.obraEstrangeira.stream()
				.anyMatch(titulo -> titulo.equalsIgnoreCase(pesquisa))) {
				
				System.out.println("\nObra brasileira encontrada: " + obra.obraBrasileira + "\n");
				
				existe = true;
			}
		}
		
		if(!existe) {
			System.out.printf("Não possuímos essa obra em nosso banco de dados. Tente pesquisar por outra, ou reescreva sem acentuações.");
		}
		
		sc.close();
	}	
}
