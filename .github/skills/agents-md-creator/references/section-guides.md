# Guia de secoes para AGENTS.md e arquivos especializados

Este guia ajuda a decidir o que fica no `AGENTS.md` raiz e o que deve ser delegado para `<SECONDARY_DOCS_DIR>/*`.

## Regra de decisao

- Se a instrucao vale para todas as tarefas do repositorio, pode ficar no `AGENTS.md` raiz.
- Se a instrucao e contextual, tecnica ou rara, delegar para arquivo especializado.

## Idioma dos arquivos

- Perguntar ao usuario o idioma desejado para `AGENTS.md` e arquivos especializados.
- Se nao houver escolha explicita, usar o idioma dominante da conversa.
- Manter consistencia de idioma entre raiz e secundarios, salvo pedido explicito para misturar idiomas.

## AGENTS.md raiz: o que deve conter

1. Proposito em uma frase.
2. Comportamento global (`Do / Don't`) acionavel.
3. Limites claros de seguranca e escopo.
4. Secao `Arquivos especializados` com links para `<SECONDARY_DOCS_DIR>/*`.

## AGENTS.md raiz: o que nao deve conter

- Arquitetura detalhada.
- Caminhos profundos de pasta.
- Processos raros ou altamente especificos.
- Texto generico sem acao observavel.

## Arquivos especializados: contrato vivo

Cada arquivo especializado deve funcionar como contrato vivo para desenvolvimento e code review assistido por agentes.

## Estrutura recomendada para arquivo especializado

```markdown
# <tema>

## Objetivo
<qual problema esta secao resolve>

## Quando aplicar
- <gatilho pratico 1>
- <gatilho pratico 2>

## Regras acionaveis
- <acao observavel e verificavel>
- <acao observavel e verificavel>

## Checklist de review
- [ ] <criterio verificavel>
- [ ] <criterio verificavel>

## Nao fazer
- <anti-pattern claro>
```

## Guardrails de coerencia com a codebase

- Nao introduzir framework/padrao sem evidencia.
- Nao promover estilo nao adotado pelo projeto.
- Nao inventar politicas nao praticadas no repositorio.
- Em caso de duvida, reduzir escopo e pedir confirmacao.

## Politica de arquivos ausentes

Se `AGENTS.md` referenciar arquivo inexistente em `<SECONDARY_DOCS_DIR>`:

Antes de sugerir `<SECONDARY_DOCS_DIR>/testing.md`, perguntar se ja existe guide de testes no diretorio atual.

Se existir guide de testes:
1. Referenciar o caminho existente em `Arquivos especializados`.
2. Nao mover, renomear, padronizar local ou duplicar.

Se nao existir guide de testes:
1. Listar faltantes.
2. Sugerir criacao.
3. Pedir confirmacao explicita antes de criar.

Padrao recomendado: nao criar automaticamente.
