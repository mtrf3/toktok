package com.bef.effectsdk;

import X.C05040Hs;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class EffectSDKBuildConfig {
    public static int ENABLE_AUDIO_EFFECT = 1;
    public static int ENABLE_BORINGSSL = 0;
    public static int ENABLE_BYTEBENCH = 1;
    public static int ENABLE_FFMPEG = 1;
    public static int ENABLE_IES_APPLOGGER = 1;
    public static int ENABLE_JAZZ = 1;
    public static int ENABLE_LENS = 0;
    public static int ENABLE_SPEECH_ASR = 0;
    public static int ENABLE_SPEECH_CAPT = 0;
    public static int ENABLE_VC0 = 1;

    public static String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static List<String> getEffectLibs() {
        ArrayList LIZIZ = C05040Hs.LIZIZ("c++_shared");
        if (ENABLE_BYTEBENCH == 1) {
            LIZIZ.add("bytebench");
        }
        if (ENABLE_BORINGSSL == 1 || ENABLE_FFMPEG == 1) {
            LIZIZ.add("ttcrypto");
            LIZIZ.add("ttboringssl");
        }
        if (ENABLE_FFMPEG == 1) {
            LIZIZ.add("ttffmpeg");
        }
        if (ENABLE_IES_APPLOGGER == 1) {
            LIZIZ.add("iesapplogger");
        }
        LIZIZ.add("bytenn");
        if (ENABLE_AUDIO_EFFECT == 1) {
            LIZIZ.add("audioeffect");
        }
        if (ENABLE_SPEECH_CAPT == 1 || ENABLE_SPEECH_ASR == 1) {
            LIZIZ.add("speechsdk");
        }
        LIZIZ.add("gaia_lib");
        LIZIZ.add("AGFX");
        if (ENABLE_LENS == 1) {
            LIZIZ.add("lens");
        }
        if (ENABLE_JAZZ == 1) {
            LIZIZ.add("napi");
            LIZIZ.add("quick");
            LIZIZ.add("jazz");
        }
        if (ENABLE_VC0 == 1) {
            LIZIZ.add("bytevc0");
        }
        LIZIZ.add("effect");
        return LIZIZ;
    }

    public static String getAarVersion() {
        return BuildConfig.FULL_VERSION;
    }
}
