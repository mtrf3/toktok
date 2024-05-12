package com.bytedance.ies.smartmovie.jni;

/* loaded from: classes8.dex */
public final class DavinciResourceConfig {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_DavinciResourceConfig(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public DavinciResourceConfig() {
        long new_DavinciResourceConfig = SmartMovieJniJNI.new_DavinciResourceConfig();
        this.LIZIZ = true;
        this.LIZ = new_DavinciResourceConfig;
    }
}
