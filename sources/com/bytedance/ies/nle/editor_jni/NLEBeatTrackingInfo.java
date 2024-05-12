package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEBeatTrackingInfo {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEBeatTrackingInfo(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEBeatTrackingInfo() {
        this(NLEMediaJniJNI.new_NLEBeatTrackingInfo(), true);
    }

    public NLEBeatTrackingInfo(long j, boolean z) {
        this.LIZIZ = z;
        this.LIZ = j;
    }
}
