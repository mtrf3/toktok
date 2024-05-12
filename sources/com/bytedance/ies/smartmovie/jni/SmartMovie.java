package com.bytedance.ies.smartmovie.jni;

/* loaded from: classes8.dex */
public final class SmartMovie {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_SmartMovie(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public SmartMovie(SmartMovieConfig smartMovieConfig) {
        long j;
        if (smartMovieConfig == null) {
            j = 0;
        } else {
            j = smartMovieConfig.LIZ;
        }
        long new_SmartMovie = SmartMovieJniJNI.new_SmartMovie(j, smartMovieConfig);
        this.LIZIZ = true;
        this.LIZ = new_SmartMovie;
    }
}
