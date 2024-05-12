package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes8.dex */
public class NLEMediaCloudEdit {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaRemoteJniJNI.delete_NLEMediaCloudEdit(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMediaCloudEdit(NLEMediaRemoteConfig nLEMediaRemoteConfig) {
        long new_NLEMediaCloudEdit = NLEMediaRemoteJniJNI.new_NLEMediaCloudEdit(nLEMediaRemoteConfig.LIZ, nLEMediaRemoteConfig);
        this.LIZIZ = true;
        this.LIZ = new_NLEMediaCloudEdit;
    }
}
