package com.bytedance.ies.smartmovie.jni;

/* loaded from: classes8.dex */
public class UploadInfo {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public synchronized void LIZ() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                SmartMovieJniJNI.delete_UploadInfo(j);
            }
            this.LIZ = 0L;
        }
    }

    public final String LIZIZ() {
        return SmartMovieJniJNI.UploadInfo_path_get(this.LIZ, this);
    }

    public UploadInfo() {
        this(SmartMovieJniJNI.new_UploadInfo());
    }

    public void finalize() {
        LIZ();
    }

    public UploadInfo(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
