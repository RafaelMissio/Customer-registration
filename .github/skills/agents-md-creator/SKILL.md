---
name: agents-md-creator
description: Cria e revisa `AGENTS.md` minimalista com progressive disclosure, derivado da codebase atual. Use esta skill sempre que o usuario pedir para criar, ajustar ou padronizar contratos de desenvolvimento e code review assistido por agentes, mesmo sem mencionar `AGENTS.md` explicitamente.
metadata:
  type: documentation
  scope: global
  style: progressive-disclosure
---

# Skill: AGENTS.md Creator

Esta skill cria e mantem um `AGENTS.md` minimalista, estavel e coerente com a codebase atual.
Ela tambem orienta a organizacao de arquivos especializados, formando contratos vivos para desenvolvimento e code review assistido por agentes.

## Objetivo

Gerar um contrato operacional claro para agentes, com economia de contexto:
- O `AGENTS.md` raiz contem apenas regras globais e estaveis.
- Regras especializadas ficam em arquivos secundarios carregados sob demanda.

## Requisitos obrigatorios

1. O `AGENTS.md` deve ser minimalista.
2. O `AGENTS.md` deve refletir apenas o que esta na codebase e documentacao existente.
3. Nao introduzir padroes, frameworks, estilos ou convencoes nao refletidos no projeto.
4. Documentar comportamento, nao implementacao.
5. Aplicar progressive disclosure: raiz enxuta + detalhes em arquivos secundarios.
6. Nao carregar regras desnecessarias no arquivo raiz (economia de context window).
7. Incluir secao obrigatoria `Arquivos especializados` com links para `<SECONDARY_DOCS_DIR>/*`.
8. Seguir o idioma escolhido pelo usuario para o `AGENTS.md` e arquivos especializados.

## Progressive Disclosure (contrato desta skill)

### Camada 1: Metadata (sempre carregada)
- Nome + descricao + quando disparar.

### Camada 2: Corpo do SKILL.md (carregamento padrao)
- Fluxo principal de geracao/revisao.
- Regras globais, guardrails e checklist final.

### Camada 3: Referencias secundarias (carregar sob demanda)
- `references/agents-md-template.md`
- `references/section-guides.md`
- `references/examples.md` (opcional)

Use referencias apenas quando necessario. Nao transformar o fluxo principal em documento monolitico.

## Etapa 0: Pesquisa publica obrigatoria (pre-escrita)

Antes de criar ou revisar `AGENTS.md`, fazer pesquisa curta em referencias publicas para:
- entender finalidade de `AGENTS.md`;
- identificar boas praticas estruturais recorrentes.

### Regras da pesquisa
- Usar referencias publicas somente como inspiracao estrutural.
- Nao copiar texto, regras especificas, politicas internas, guardrails ou nomenclaturas de terceiros.
- Reescrever tudo para o contexto local do projeto.

### Saida minima da etapa 0
Registrar em resumo curto:
1. padroes estruturais uteis observados;
2. boas praticas de escrita acionavel;
3. riscos de copia indevida;
4. decisoes de adaptacao ao repositorio atual.

## Etapa 1: Derivacao da codebase (obrigatoria)

Analisar o repositorio e extrair somente comportamentos comprovaveis:
- fluxos recorrentes;
- restricoes reais;
- tecnologias e frameworks efetivamente utilizados;
- praticas de engenharia ja adotadas no codigo e documentacao;
- comandos reais de build, testes e execucao;
- contratos de API e integracoes observaveis.

Se nao houver evidencia suficiente, nao transformar em regra.

### Catalogo de praticas a investigar

Durante a analise, verificar se a codebase demonstra de forma consistente alguma das praticas abaixo. A lista e um catalogo de deteccao, nao um conjunto de regras obrigatorias.

#### Principios de design e codigo
- SOLID;
- DRY (Don't Repeat Yourself);
- YAGNI (You Aren't Gonna Need It);
- KISS (Keep It Simple);
- separacao de responsabilidades;
- baixo acoplamento e alta coesao;
- composicao sobre heranca, quando evidenciada;
- imutabilidade, quando adotada pelo projeto;
- convencoes de nomenclatura e organizacao de codigo.

#### APIs e camada web
- API REST e uso consistente dos verbos HTTP;
- convencoes de URI e recursos;
- status HTTP coerentes;
- DTOs de entrada e saida;
- validacao de entrada;
- tratamento padronizado de respostas de erro;
- versionamento de API, quando existente;
- documentacao automatica com OpenAPI/Swagger, quando existente.

#### Arquitetura e dependencias
- injecao de dependencias;
- inversao de dependencias;
- arquitetura em camadas, hexagonal, clean architecture ou outra estrutura comprovada;
- separacao entre controller, aplicacao/servico, dominio e infraestrutura, quando existente;
- uso de interfaces/ports apenas quando refletido na codebase;
- patterns recorrentes, como Factory, Strategy, Adapter, Repository ou Builder, somente quando comprovados.

#### Persistencia e dados
- Repository Pattern;
- consultas com Spring Data JPA ou tecnologia equivalente observada;
- transacoes e limites transacionais;
- migrations de banco;
- convencoes de entidades e relacionamentos;
- paginacao, ordenacao e filtros;
- controle de N+1 ou estrategias de fetch, quando evidenciadas.

#### Qualidade e testes
- testes unitarios;
- testes de integracao;
- testes de API/contrato;
- mocks/stubs/fakes conforme o padrao existente;
- organizacao e nomenclatura dos testes;
- fixtures/builders de teste;
- cobertura minima somente se configurada/documentada;
- ferramentas reais do projeto, como JUnit, Mockito, RestAssured, Testcontainers ou equivalentes.

#### Erros, observabilidade e resiliencia
- exceptions de dominio/aplicacao;
- handler global de erros;
- logs estruturados e convencoes de logging;
- correlation/trace IDs;
- metricas, tracing e health checks;
- retry, timeout, circuit breaker ou fallback quando existentes.

#### Seguranca
- autenticacao e autorizacao;
- validacao/sanitizacao de entrada;
- protecao de secrets e configuracoes sensiveis;
- controles de acesso por roles/scopes;
- praticas de seguranca efetivamente configuradas no projeto.

#### Build, entrega e operacao
- Maven, Gradle ou ferramenta equivalente;
- comandos oficiais para build, teste e execucao;
- Docker/containers;
- CI/CD;
- quality gates, lint e analise estatica;
- configuracao por ambiente/profiles;
- migrations e procedimentos de inicializacao.

### Regra de classificacao de evidencia

Para cada pratica candidata, classificar a evidencia como:

- `CONFIRMADA`: aparece de forma explicita na configuracao, documentacao ou de forma recorrente no codigo;
- `PARCIAL`: ha indicios, mas nao consistencia suficiente para torna-la contrato global;
- `NAO OBSERVADA`: nao ha evidencia suficiente.

Somente praticas `CONFIRMADAS` podem ser convertidas em instrucoes normativas do `AGENTS.md` ou dos arquivos especializados. Praticas `PARCIAIS` podem ser relatadas como observacoes, nunca como obrigacoes. Praticas `NAO OBSERVADAS` devem ser ignoradas.

### Regra pratica: evidencia -> pratica -> instrucao

Toda instrucao derivada deve possuir uma cadeia de justificativa verificavel:

1. `Evidencia`: arquivo, configuracao, teste, documentacao ou padrao recorrente encontrado.
2. `Pratica`: comportamento de engenharia inferido diretamente dessa evidencia.
3. `Instrucao`: regra acionavel para o agente preservar o comportamento existente.

Exemplo:

```text
Evidencia: pom.xml + testes existentes usam JUnit 5 e Mockito.
Pratica: testes unitarios seguem JUnit 5 + Mockito.
Instrucao: ao adicionar testes unitarios, seguir a estrutura e as ferramentas de teste existentes.
```

Nao inferir um principio amplo a partir de um unico exemplo isolado. Por exemplo, uma interface nao e evidencia suficiente para declarar que o projeto segue SOLID; uma classe `Repository` isolada nao comprova Repository Pattern como regra arquitetural global.

## Etapa 2: Pergunta obrigatoria sobre diretorio secundario

Perguntar ao usuario:

"Em qual diretorio voce quer manter os arquivos especializados (ex.: testing, refactoring, architecture, conventions)?"

Regra:
- Se o usuario responder, usar o diretorio informado.
- Se nao responder ou estiver em duvida, usar padrao `docs`.

Definicao:
`SECONDARY_DOCS_DIR = <resposta do usuario ou "docs">`

## Etapa 2.1: Verificar guide de testes existente (obrigatoria)

Perguntar ao usuario:

"No diretorio atual existe algum guide de testes que deve ser referenciado em `Arquivos especializados`? Se sim, qual o caminho exato?"

Regra:
- Se existir guide de testes, referenciar o arquivo existente no `AGENTS.md`.
- Nao mover, renomear, padronizar local ou duplicar o guide existente.
- So usar `<SECONDARY_DOCS_DIR>/testing.md` quando nao houver guide existente indicado.

## Etapa 2.2: Definir idioma dos arquivos (obrigatoria)

Perguntar ao usuario:

"Em qual idioma voce quer que eu escreva o `AGENTS.md` e os arquivos especializados?"

Regra:
- Seguir exatamente o idioma escolhido pelo usuario.
- Se o usuario nao escolher, usar o idioma dominante da conversa atual.
- Manter consistencia no mesmo idioma em `AGENTS.md` e arquivos especializados, salvo pedido explicito para misturar idiomas.

Definicao:
`DOC_LANGUAGE = <idioma escolhido pelo usuario ou idioma dominante da conversa>`

## Etapa 3: Definir escopo do AGENTS.md raiz

O `AGENTS.md` raiz deve conter apenas:

1. Proposito do projeto em uma frase.
2. Comportamento global do agente (`Do / Don't`) aplicavel a qualquer tarefa.
3. Limites claros do agente (seguranca, escopo, previsibilidade).
4. Secao `Arquivos especializados` apontando para `<SECONDARY_DOCS_DIR>/*`.

O conteudo deve ser escrito em `DOC_LANGUAGE`.

Nao incluir:
- arquitetura detalhada;
- estrutura profunda de pastas;
- informacoes instaveis;
- regras especializadas nao universais.

## Etapa 4: Delegar instrucoes especializadas

Todo conteudo nao-global deve ir para arquivos secundarios, por exemplo:
- `<SECONDARY_DOCS_DIR>/testing.md` (somente quando nao houver guide de testes existente)
- `<SECONDARY_DOCS_DIR>/refactoring.md`
- `<SECONDARY_DOCS_DIR>/architecture.md`
- `<SECONDARY_DOCS_DIR>/conventions.md`
- `<SECONDARY_DOCS_DIR>/code-review.md`
- `<SECONDARY_DOCS_DIR>/api.md`
- `<SECONDARY_DOCS_DIR>/persistence.md`
- `<SECONDARY_DOCS_DIR>/observability.md`
- `<SECONDARY_DOCS_DIR>/security.md`
- `<SECONDARY_DOCS_DIR>/build-and-run.md`

Se o usuario indicar um guide de testes ja existente fora de `<SECONDARY_DOCS_DIR>`, apenas referenciar esse caminho na secao `Arquivos especializados`.

Criar somente o que fizer sentido para o repositorio atual.
Escrever os arquivos especializados em `DOC_LANGUAGE`.

## Politica para arquivos secundarios ausentes (modo recomendado)

Quando o `AGENTS.md` referenciar arquivos inexistentes em `<SECONDARY_DOCS_DIR>`:

1. Nao criar automaticamente por padrao.
2. Listar os faltantes.
3. Pedir confirmacao explicita do usuario antes de criar.
4. So criar apos confirmacao.

Isto evita ruido e preserva previsibilidade.

## Modelo minimo sugerido para AGENTS.md

Use este esqueleto curto:

1. `# AGENTS.md`
2. `## Proposito`
3. `## Comportamento global do agente (Do / Don't)`
4. `## Limites do agente`
5. `## Arquivos especializados`
   - links para `<SECONDARY_DOCS_DIR>/*`

## Checklist de validacao final (obrigatorio)

Antes de concluir, validar:

- [ ] O `AGENTS.md` esta minimalista, curto e estavel.
- [ ] Cada regra do raiz vale para todas as tarefas do repositorio.
- [ ] O texto reflete apenas praticas observadas na codebase/documentacao existente.
- [ ] As praticas adotadas foram classificadas por evidencia (`CONFIRMADA`, `PARCIAL`, `NAO OBSERVADA`).
- [ ] Somente praticas `CONFIRMADAS` foram convertidas em regras normativas.
- [ ] Cada regra especializada relevante possui evidencia rastreavel na codebase ou documentacao.
- [ ] Principios como SOLID, DRY, YAGNI e KISS nao foram declarados apenas por suposicao.
- [ ] Tecnologias, comandos de build/teste/execucao e contratos de API refletem o repositorio atual.
- [ ] Nao ha frameworks/padroes inventados.
- [ ] O conteudo documenta comportamento, nao implementacao.
- [ ] Existe secao `Arquivos especializados` com links para `<SECONDARY_DOCS_DIR>/*`.
- [ ] Conteudo especializado foi delegado para arquivos secundarios.
- [ ] Nao ha copia literal de referencias publicas.
- [ ] Arquivos faltantes foram apenas listados, com solicitacao de confirmacao para criacao.
- [ ] Foi perguntado se existe guide de testes no diretorio atual.
- [ ] Quando existe guide de testes, ele foi apenas referenciado (sem mover, duplicar ou padronizar local).
- [ ] Foi perguntado o idioma desejado para os arquivos.
- [ ] `AGENTS.md` e arquivos especializados estao consistentes em `DOC_LANGUAGE`.

## Formato de entrega

Sempre retornar:

1. `AGENTS.md` final.
2. Resumo de decisoes (3-6 bullets).
3. Evidencias de coerencia com a codebase (quais sinais foram usados).
   - incluir uma secao `Praticas adotadas detectadas` com pratica, status da evidencia e origem;
4. Lista de arquivos especializados:
   - existentes;
   - faltantes;
   - proposta de criacao (aguardando confirmacao quando aplicavel).
5. Status do guide de testes:
   - caminho existente referenciado; ou
   - ausencia confirmada e uso de `<SECONDARY_DOCS_DIR>/testing.md` quando aplicavel.
6. Idioma aplicado:
   - idioma escolhido pelo usuario; ou
   - idioma dominante da conversa quando nao houver escolha explicita.

## Guardrails (hard rules)

- Nao criar documento raiz gigante.
- Nao usar instrucoes vagas ("seguir boas praticas modernas").
- Nao inserir conteudo irrelevante para o contexto do projeto.
- Nao assumir convencoes sem evidencia.
- Nao trocar minimalismo por completude enciclopedica.

O `AGENTS.md` e um contrato vivo e enxuto.
Os contratos detalhados vivem em `<SECONDARY_DOCS_DIR>/*` e evoluem com o projeto.
