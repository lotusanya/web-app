def call (String goal){
	if ("${goal}" == "Build"){
	sh "mvn package"
	}
	else if ("${goal}" == "Test"){
	sh "mvn sonar:sonar"
	}
	else if ("${goal}" == "Artifact"){
	sh "mvn deploy"
	}
}
