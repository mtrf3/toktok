package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes8.dex */
public final class NLEModelExporterListenerParamBody {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEModelExporterListenerParamBody(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEModelExporterListenerParamBody() {
        this(NLEMediaJniJNI.new_NLEModelExporterListenerParamBody());
    }

    public NLEModelExporterListenerParamBody(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
