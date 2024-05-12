package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class VecNLECommitSPtr {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_VecNLECommitSPtr(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public VecNLECommitSPtr() {
        long new_VecNLECommitSPtr__SWIG_0 = NLEEditorJniJNI.new_VecNLECommitSPtr__SWIG_0();
        this.LIZIZ = true;
        this.LIZ = new_VecNLECommitSPtr__SWIG_0;
    }
}
