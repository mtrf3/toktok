package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes8.dex */
public final class EpResourceManager {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEResourcesDAVJNI.delete_EpResourceManager(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public EpResourceManager() {
        long new_EpResourceManager = NLEResourcesDAVJNI.new_EpResourceManager();
        this.LIZIZ = true;
        this.LIZ = new_EpResourceManager;
    }
}
