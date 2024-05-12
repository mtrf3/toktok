package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLELogger {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_NLELogger(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLELogger() {
        this(NLEEditorJniJNI.new_NLELogger(), true);
    }

    public static NLELogger LIZ() {
        long NLELogger_obtain = NLEEditorJniJNI.NLELogger_obtain();
        if (NLELogger_obtain == 0) {
            return null;
        }
        return new NLELogger(NLELogger_obtain, false);
    }

    public NLELogger(long j, boolean z) {
        this.LIZIZ = z;
        this.LIZ = j;
    }
}
