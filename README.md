# esb-cxf-hello-world
A simple cxf sample for cloudtopo ESB

# build
mvn install

# deploy in ESB
bundle:install -s mvn:com.cloudtopo.esb.test/cxf-rest-test/0.0.1-SNAPSHOT

# test the rest service
http://localhost:8181/cxf/test/rest/hello/myname
