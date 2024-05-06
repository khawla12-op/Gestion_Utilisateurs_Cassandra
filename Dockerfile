FROM ubuntu:latest
LABEL authors="khawl"

ENTRYPOINT ["top", "-b"]