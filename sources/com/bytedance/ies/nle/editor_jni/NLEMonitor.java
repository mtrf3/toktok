package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEMonitor {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_NLEMonitor(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEMonitor() {
        this(NLEEditorJniJNI.new_NLEMonitor(), true);
    }

    public NLEMonitor(long j, boolean z) {
        this.LIZIZ = z;
        this.LIZ = j;
    }
}
