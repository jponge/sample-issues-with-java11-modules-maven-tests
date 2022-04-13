module sample.maven.and.tests {

    requires java.logging;

    exports sample;

    requires transitive org.junit.jupiter.api;
}