package com.bytedance.ies.smartmovie.jni;

/* loaded from: classes8.dex */
public final class Meta {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_Meta(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final long LIZIZ() {
        return SmartMovieJniJNI.Meta_getDuration(this.LIZ, this);
    }

    public final long LIZJ() {
        return SmartMovieJniJNI.Meta_getHeight(this.LIZ, this);
    }

    public final String LIZLLL() {
        return SmartMovieJniJNI.Meta_getPath(this.LIZ, this);
    }

    public final long LJ() {
        return SmartMovieJniJNI.Meta_getWidth(this.LIZ, this);
    }

    public final boolean LJFF() {
        return SmartMovieJniJNI.Meta_isVideoType(this.LIZ, this);
    }

    public Meta() {
        this(SmartMovieJniJNI.new_Meta());
    }

    public Meta(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(Meta meta) {
        if (meta == null) {
            return 0L;
        }
        return meta.LIZ;
    }

    public final void LJI(long j) {
        SmartMovieJniJNI.Meta_setDuration(this.LIZ, this, j);
    }

    public final void LJII(long j) {
        SmartMovieJniJNI.Meta_setHeight(this.LIZ, this, j);
    }

    public final void LJIIIIZZ(long j) {
        SmartMovieJniJNI.Meta_setWidth(this.LIZ, this, j);
    }
}
