package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class PairUIntUInt {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_PairUIntUInt(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public PairUIntUInt() {
        long new_PairUIntUInt__SWIG_0 = NLEEditorJniJNI.new_PairUIntUInt__SWIG_0();
        this.LIZIZ = true;
        this.LIZ = new_PairUIntUInt__SWIG_0;
    }
}
