all: build

build:
	@./gradlew assemble --warning-mode all

test:
	@./gradlew check --warning-mode all
