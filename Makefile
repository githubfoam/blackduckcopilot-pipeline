IMAGE := alpine/fio
APP:="app/deploy-openesb.sh"

deploy-app5:
	bash maven-pipeline/app1/deploy-app1.sh

deploy-app4:
	bash app4/deploy-app4.sh

push-image:
	docker push $(IMAGE)
.PHONY: deploy-openesb deploy-dashboard push-image
