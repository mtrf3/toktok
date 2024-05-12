package com.bytedance.ies.smartmovie.jni;

/* loaded from: classes8.dex */
public final class SmartMovieConfig {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_SmartMovieConfig(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public SmartMovieConfig() {
        long new_SmartMovieConfig = SmartMovieJniJNI.new_SmartMovieConfig();
        this.LIZIZ = true;
        this.LIZ = new_SmartMovieConfig;
    }
}