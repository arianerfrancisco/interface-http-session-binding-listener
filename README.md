# Implementando **HttpSessionBindingListener**

- Faz com que um objeto seja notificado quando estiver vinculado ou desvinculado de uma sessão. 

- O objeto é notificado por um HttpSessionBindingEventobjeto. 

- Isso pode ser resultado de um programador de servlet desvincular explicitamente um atributo de uma sessão, devido à invalidação de uma sessão ou devido ao tempo limite de uma sessão.

**Nota**: É o único _objeto listener_ que não precisa ser configurado nem no arquivo web.xml e nem com @WebListener.

<h1> Objetivo do projeto </h1>

- Instanciar o objeto produto na sessão criada;

- O nome do objeto produto é adicionado a uma sessão através da interface HttpSessionBindingListener;

- Recuperar este atributo via log no container. Vide imagem abaixo:


![sdsdsd](https://user-images.githubusercontent.com/72419533/156922003-8d77b85c-dc67-43b6-8845-d909a8e16734.PNG)


<h1> Repositório criado para fins de estudo 📓 </h1> 
