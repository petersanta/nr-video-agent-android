package com.newrelic.videoagent;

import com.google.android.exoplayer2.*;
import com.newrelic.videoagent.utils.NRLog;

public class NewRelicVideoAgent {

    static {
        System.loadLibrary("test-jni");
    }

    public static native String testHello(String name);

    public static void startWithPlayer(SimpleExoPlayer player) {
        NRLog.d("Starting Video Agent with player");
        NRLog.d(testHello("Joanet"));
    }
}
