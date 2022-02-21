function updateEscada(){
    $.ajax({
        url: "http://localhost:8090/escada"
    }).then(function (data){
        // limpa o formulário
        $("#escada-form").find("input[name='altura']")
        .val("");
    });
}

$(document).ready(function(){


    $("#botao").click(function(event){
        // não submit o form normalmente
        event.preventDefault();

        var $form = $("#escada-form"),
            altura = $form.find("input[name='altura']").val();

        // compor os dados no formato que a API está esperando

        var data = {nivel: altura};



        // envia os dados usando POST
        $.ajax ({
            url: '/escada',
            type: 'POST',
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function(result){
                if(result){
                    $('.result-message').empty().append("Degraus:"+ altura);
                }else {
                    $('.result-message').empty().append("Escada não construida");
                }
            }
        }).then(function (data){
                  // limpa o formulário
                  $("#escada-form").find("input[name='altura']")
                  .val("");

                  $('.desenho').empty().append(data.desenho);

              });



        });
})