def call (String mavengoal){
		if ("${mavengoal}" == "Build"){
	sh "mvn package"
	}
	else if ("${mavengoal}" == "Automated Testing"){
	sh "mvn sonar:sonar" 
	}
	else if ("${mavengoal}" == "Backup"){
	sh "mvn deploy" 
}
}
