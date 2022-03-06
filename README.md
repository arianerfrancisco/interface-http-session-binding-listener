# Implementando **HttpSessionBindingListener**

- Faz com que um objeto seja notificado quando estiver vinculado ou desvinculado de uma sessão. 
- O objeto é notificado por um HttpSessionBindingEventobjeto. 
- Isso pode ser resultado de um programador de servlet desvincular explicitamente um atributo de uma sessão, devido à invalidação de uma sessão ou devido ao tempo limite de uma sessão.

**Nota**: É o único _objeto listener_ que não precisa ser configurado nem no arquivo web.xml e nem com a annotation @WebListener.