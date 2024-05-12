package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEBeatTrackingParam {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEBeatTrackingParam(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEBeatTrackingParam() {
        long new_NLEBeatTrackingParam = NLEMediaJniJNI.new_NLEBeatTrackingParam();
        this.LIZIZ = true;
        this.LIZ = new_NLEBeatTrackingParam;
    }
}
