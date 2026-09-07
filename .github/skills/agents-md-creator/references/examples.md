# Exemplos de uso (inspiracao)

Este arquivo mostra exemplos de saida esperada para `AGENTS.md` minimalista com progressive disclosure.
Use como referencia de estrutura, nunca como texto para copia literal.

## Exemplo 1: Repositorio backend (API)

### Contexto observado
- Projeto backend com testes automatizados e CI.
- Convencoes de commit e padrao de pastas ja definidos no repositorio.
- Documentacao tecnica separada por assunto.

### AGENTS.md (exemplo)

```markdown
# AGENTS.md

## Proposito
Manter e evoluir a API com seguranca de mudanca, previsibilidade e foco em regressao baixa.

## Comportamento global do agente (Do / Don't)

### Do
- Antes de alterar codigo, explicar em uma frase o motivo da mudanca.
- Priorizar alteracoes pequenas, com impacto limitado e verificavel.
- Validar mudancas com os testes relevantes antes de concluir.
- Seguir convencoes ja existentes no repositorio.

### Don't
- Nao introduzir frameworks, estilos ou padroes sem evidencia na codebase.
- Nao expandir escopo sem necessidade da tarefa.
- Nao alterar comportamento publico sem explicitar impacto.

## Limites do agente
- Nao executar acoes destrutivas sem necessidade clara e justificativa.
- Nao documentar como regra algo que nao esteja comprovado no projeto.
- Nao transformar este arquivo em guia detalhado de implementacao.

## Arquivos especializados
- `docs/testing.md` - Estrategia de testes, escopo e criterios de validacao
- `docs/refactoring.md` - Regras para refatoracoes seguras e incrementais
- `docs/architecture.md` - Decisoes arquiteturais e fronteiras tecnicas
- `docs/conventions.md` - Convencoes de codigo observadas no repositorio
```

## Exemplo 2: Repositorio fullstack

### Contexto observado
- Backend + frontend no mesmo repo.
- Padroes de revisao e validacao diferentes por area.
- Diretrizes de UX e integracao com API em documentos separados.

### AGENTS.md (exemplo)

```markdown
# AGENTS.md

## Proposito
Evoluir backend e frontend de forma coerente, mantendo consistencia funcional e baixo risco de regressao.

## Comportamento global do agente (Do / Don't)

### Do
- Explicar a intencao da mudanca antes de editar arquivos.
- Preservar padroes ja adotados no projeto em cada area.
- Garantir que mudancas em contrato entre frontend/backend estejam alinhadas.
- Preferir mudancas incrementais com validacao objetiva.

### Don't
- Nao criar novas convencoes sem evidencias no repositorio.
- Nao misturar regras especificas de frontend/backend no arquivo raiz.
- Nao incluir detalhes profundos de estrutura interna neste documento.

## Limites do agente
- Nao assumir comportamento de componentes/servicos sem confirmar no codigo.
- Nao usar este arquivo para descrever implementacao passo a passo.
- Nao manter regras duplicadas entre raiz e arquivos especializados.

## Arquivos especializados
- `docs/testing.md` - Testes por camada e criterios de aceite
- `docs/code-review.md` - Checklist de revisao assistida por agentes
- `docs/architecture.md` - Fronteiras, integracoes e contratos entre camadas
- `docs/conventions.md` - Convencoes existentes por stack
```

## Checklist rapido para validar os exemplos

- O arquivo raiz esta curto e estavel.
- As regras sao acionaveis e valem para todo o repo.
- Nao ha padroes inventados.
- O detalhamento especializado foi delegado para `docs/*`.
