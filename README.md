# JettyOTEL


This is my demo project for testing OTEL events on embedded Jetty projects.
Fetch latest javaagent: 

```console
curl -LO \
  https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar
```

```console

export OTEL_SERVICE_NAME=jetty-demo
export OTEL_EXPORTER_OTLP_PROTOCOL=http/protobuf
export OTEL_EXPORTER_OTLP_ENDPOINT=""
export OTEL_EXPORTER_OTLP_HEADERS=""

java -javaagent:opentelemetry-javaagent.jar -jar /path/to/myapp.jar

```

