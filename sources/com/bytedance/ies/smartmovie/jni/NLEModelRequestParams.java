package com.bytedance.ies.smartmovie.jni;

/* loaded from: classes8.dex */
public final class NLEModelRequestParams {
    public transient long LIZ;
    public transient boolean LIZIZ = true;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_NLEModelRequestParams(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final UnorderedMapStrStr LIZ() {
        return new UnorderedMapStrStr(SmartMovieJniJNI.NLEModelRequestParams_getExtraParams(this.LIZ, this));
    }

    public NLEModelRequestParams(long j) {
        this.LIZ = j;
    }
}
