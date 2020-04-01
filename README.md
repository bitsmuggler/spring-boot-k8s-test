# spring-boot app for testing k8s deployment

## Prerequisites

* minikube cluster
* (local) Docker-Registry which is accessible from your minikube cluster

## Preparations

1. Build this app (``./mvnw install``)
1. Build the docker image (``docker build -t techtopics/notesapp .``)
1.  Tag your image (``docker tag techtopics/notesapp:latest registry.me/notesapp:0.0.1``)
1. Push it to your (local) registry (``docker push registry.me/notesapp:0.0.1``)


## Deploy to k8s
1. Go to the k8s folder (``cd ./k8s``)
1. Apply the deployement  (`kubectl apply -f deployment.config.yaml`)
1. Apply the service (``kubectl apply -f service.config.yaml``)
1. Expose the service via minikube (``minikube service notes-api``)
1. Call the test api `/notes`
