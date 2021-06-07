Algoritmo Ejercicio11
	impares <- 0
	pares <- 0
	Cp <- 0
	docena <- 0
	maximo <- 0
	Escribir "cantidad de numeros a ingresar"
	Leer numeros
	Para i<-1 Hasta numeros Hacer
		ruleta <- Aleatorio(0,36)
		par <- ruleta MOD(2)
		Escribir ruleta," ",par
		Si 0<ruleta Entonces
			Si par = 0 Entonces
				pares <- pares+ruleta
				Cp <- Cp+1
			SiNo
				impares <- impares+1
			FinSi
		FinSi
		Si 13<=ruleta & ruleta<=24 Entonces
			docena <- docena+1
		FinSi
		Si ruleta > maximo Entonces
			maximo <- ruleta
		FinSi
	FinPara
	pares <- pares/Cp
	Escribir "impares: ",impares," promedio pares: ",pares," docena: ",docena," maximo: ",maximo 
FinAlgoritmo
