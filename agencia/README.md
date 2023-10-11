# Build
mvn clean package && docker build -t com.ccastano/agencia .

# RUN

docker rm -f agencia || true && docker run -d -p 8080:8080 -p 4848:4848 --name agencia com.ccastano/agencia 