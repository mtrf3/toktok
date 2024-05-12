package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEMediaResourceManager {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaPublicJniJNI.delete_NLEMediaResourceManager(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMediaResourceManager() {
        this(NLEMediaPublicJniJNI.new_NLEMediaResourceManager(), true);
    }

    public NLEMediaResourceManager(long j, boolean z) {
        this.LIZIZ = z;
        this.LIZ = j;
    }
}
