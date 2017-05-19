var ajaxObj = {
		url: "/hola",
		success: function(data) {
			window.alert(data);
		}
};
$.ajax(ajaxObj);