package com.bytedance.ies.smartmovie.jni;

/* loaded from: classes8.dex */
public class IMetaInfoDelegate {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_IMetaInfoDelegate(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        SmartMovieJniJNI.IMetaInfoDelegate_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.IMetaInfoDelegate_change_ownership(this, this.swigCPtr, true);
    }

    public IMetaInfoDelegate() {
        this(SmartMovieJniJNI.new_IMetaInfoDelegate(), true);
        SmartMovieJniJNI.IMetaInfoDelegate_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(IMetaInfoDelegate iMetaInfoDelegate) {
        if (iMetaInfoDelegate == null) {
            return 0L;
        }
        return iMetaInfoDelegate.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public IMetaInfoDelegate(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public PictureInfo extractorFrame(UploadInfo uploadInfo, String str) {
        long j;
        long j2 = this.swigCPtr;
        if (uploadInfo == null) {
            j = 0;
        } else {
            j = uploadInfo.LIZ;
        }
        long IMetaInfoDelegate_extractorFrame = SmartMovieJniJNI.IMetaInfoDelegate_extractorFrame(j2, this, j, uploadInfo, str);
        if (IMetaInfoDelegate_extractorFrame == 0) {
            return null;
        }
        return new PictureInfo(IMetaInfoDelegate_extractorFrame);
    }

    public Meta getCompressMetaInfo(Meta meta, String str) {
        long IMetaInfoDelegate_getCompressMetaInfo = SmartMovieJniJNI.IMetaInfoDelegate_getCompressMetaInfo(this.swigCPtr, this, Meta.LIZ(meta), meta, str);
        if (IMetaInfoDelegate_getCompressMetaInfo == 0) {
            return null;
        }
        return new Meta(IMetaInfoDelegate_getCompressMetaInfo);
    }

    public VecPairBoolLong getFrameTimeStamps(long j, VecMeta vecMeta) {
        long IMetaInfoDelegate_getFrameTimeStamps = SmartMovieJniJNI.IMetaInfoDelegate_getFrameTimeStamps(this.swigCPtr, this, j, VecMeta.LJFF(vecMeta), vecMeta);
        if (IMetaInfoDelegate_getFrameTimeStamps == 0) {
            return null;
        }
        return new VecPairBoolLong(IMetaInfoDelegate_getFrameTimeStamps);
    }

    public void compressMeta(Meta meta, String str, boolean z, CommonRequestCallback commonRequestCallback) {
        SmartMovieJniJNI.IMetaInfoDelegate_compressMeta(this.swigCPtr, this, Meta.LIZ(meta), meta, str, z, CommonRequestCallback.getCPtr(commonRequestCallback), commonRequestCallback);
    }
}
