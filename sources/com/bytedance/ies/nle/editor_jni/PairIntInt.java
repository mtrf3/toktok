package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class PairIntInt {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_PairIntInt(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final int LIZ() {
        return NLEEditorJniJNI.PairIntInt_first_get(this.LIZ, this);
    }

    public final int LIZIZ() {
        return NLEEditorJniJNI.PairIntInt_second_get(this.LIZ, this);
    }

    public PairIntInt() {
        this(NLEEditorJniJNI.new_PairIntInt__SWIG_0());
    }

    public PairIntInt(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public PairIntInt(int i, int i2) {
        this(NLEEditorJniJNI.new_PairIntInt__SWIG_1(i, i2));
    }
}
