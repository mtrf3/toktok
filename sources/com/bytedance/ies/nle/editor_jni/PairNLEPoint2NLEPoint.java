package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class PairNLEPoint2NLEPoint {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_PairNLEPoint2NLEPoint(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public PairNLEPoint2NLEPoint() {
        long new_PairNLEPoint2NLEPoint__SWIG_0 = NLEEditorJniJNI.new_PairNLEPoint2NLEPoint__SWIG_0();
        this.LIZIZ = true;
        this.LIZ = new_PairNLEPoint2NLEPoint__SWIG_0;
    }
}
