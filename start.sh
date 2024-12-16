#!/bin/bash

echo "Cleaning target and building application with Maven..."
docker-compose run --rm prepare-app

echo "Starting application with Docker Compose..."
docker-compose up -d --build
