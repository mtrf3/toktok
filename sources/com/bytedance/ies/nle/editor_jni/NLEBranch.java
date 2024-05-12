package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEBranch {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_NLEBranch(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final NLECommit LIZ() {
        long NLEBranch_getHead = NLEEditorJniJNI.NLEBranch_getHead(this.LIZ, this);
        if (NLEBranch_getHead == 0) {
            return null;
        }
        return new NLECommit(NLEBranch_getHead);
    }

    public NLEBranch() {
        this(NLEEditorJniJNI.new_NLEBranch());
    }

    public NLEBranch(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
