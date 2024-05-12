package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class ChangeBits {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_ChangeBits(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final String toString() {
        return NLEEditorJniJNI.ChangeBits_toString(this.LIZ, this);
    }

    public ChangeBits() {
        this(NLEEditorJniJNI.new_ChangeBits());
    }

    public ChangeBits(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
