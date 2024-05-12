package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLESize {
    public transient long LIZ;
    public transient boolean LIZIZ = true;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_NLESize(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLESize(long j) {
        this.LIZ = j;
    }
}
