  fun sampleMethod1() {
        val client = LDClient("sdk-key-123abc")
        val flagValue = client.boolVariation("flag-key-123abc", false)
        if (flagValue) {
            // Application code to show the feature
            println("flag-key-123abc is enabled")
        } else {
            // The code to run if the feature is off
            println("flag-key-123abc is disabled")
        }
    }