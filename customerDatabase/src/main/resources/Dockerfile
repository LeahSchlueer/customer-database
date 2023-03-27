FROM golang:1
WORKDIR /app
COPY * ./
RUN go build -o cloud-deploy-tutorial
CMD ["/app/cloud-deploy-tutorial"]