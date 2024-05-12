package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes8.dex */
public final class NLEMediaRemoteConfig {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaRemoteJniJNI.delete_NLEMediaRemoteConfig(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMediaRemoteConfig() {
        long new_NLEMediaRemoteConfig = NLEMediaRemoteJniJNI.new_NLEMediaRemoteConfig();
        this.LIZIZ = true;
        this.LIZ = new_NLEMediaRemoteConfig;
    }
}
