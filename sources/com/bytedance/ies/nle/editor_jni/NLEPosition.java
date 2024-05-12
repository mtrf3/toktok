package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEPosition {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEPosition(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEPosition() {
        this(NLEMediaJniJNI.new_NLEPosition__SWIG_0());
    }

    public NLEPosition(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
