# AGENTS.md Template (Minimalista)

Use este template como ponto de partida. Mantenha o arquivo curto, estavel e aplicavel a todo o repositorio.

## Estrutura recomendada

```markdown
# AGENTS.md

## Proposito
<Uma frase: objetivo do projeto, derivado da codebase atual>

## Comportamento global do agente (Do / Don't)
### Do
- <Regra acionavel que vale para toda tarefa>
- <Regra acionavel que vale para toda tarefa>

### Don't
- <Proibicao clara e verificavel>
- <Proibicao clara e verificavel>

## Limites do agente
- <Limite de seguranca/escopo>
- <Limite de previsibilidade/mudanca>

## Arquivos especializados
- `<SECONDARY_DOCS_DIR>/testing.md` - Regras de testes e validacao
- `<SECONDARY_DOCS_DIR>/refactoring.md` - Criterios de refatoracao
- `<SECONDARY_DOCS_DIR>/architecture.md` - Decisoes e limites de arquitetura
- `<SECONDARY_DOCS_DIR>/conventions.md` - Convencoes observadas no projeto
```

## Regras para usar este template

- Nao adicionar secoes que nao tragam valor global.
- Nao incluir detalhes de implementacao ou estrutura profunda de pastas.
- Nao incluir convencoes sem evidencia na codebase.
- Reescrever todo conteudo para o contexto local do projeto.
