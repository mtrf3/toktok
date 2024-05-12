package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEMatrix {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_NLEMatrix(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final String toString() {
        return NLEEditorJniJNI.NLEMatrix_toString(this.LIZ, this);
    }

    public NLEMatrix() {
        this(NLEEditorJniJNI.new_NLEMatrix());
    }

    public NLEMatrix(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
