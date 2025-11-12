package com.example;

/**
 * Intentionally contains a hardcoded credential for testing.
 * This should be flagged by static analyzers (hardcoded password / secret).
 */
public class HardcodedCreds {
    // Fake API key / password for testing only — do NOT use real keys
    private static final String DB_PASSWORD = "P@ssw0rd12345!";   // <<-- should be detected

    public static String getPassword() {
        return DB_PASSWORD;
    }
}
