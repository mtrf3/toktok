package com.bytedance.ies.smartmovie.jni;

/* loaded from: classes8.dex */
public final class PairBoolLong {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_PairBoolLong(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public PairBoolLong() {
        this(SmartMovieJniJNI.new_PairBoolLong__SWIG_0(), true);
    }

    public PairBoolLong(boolean z, long j) {
        this(SmartMovieJniJNI.new_PairBoolLong__SWIG_1(z, j), true);
    }

    public PairBoolLong(long j, boolean z) {
        this.LIZIZ = z;
        this.LIZ = j;
    }
}
