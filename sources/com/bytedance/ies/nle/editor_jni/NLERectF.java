package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLERectF {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLERectF(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLERectF() {
        this(NLEMediaJniJNI.new_NLERectF__SWIG_0());
    }

    public NLERectF(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}