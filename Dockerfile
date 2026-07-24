# Production Container Definition for ai-data-pipeline-kotlin-spring-v7
FROM alpine:3.19
RUN apk add --no-cache bash curl
WORKDIR /app
COPY . /app
CMD ["echo", "ai-data-pipeline-kotlin-spring-v7 container active"]
