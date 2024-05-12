package com.ss.ugc.android.davinciresource.jni;

/* loaded from: classes16.dex */
public class MusicResourceHandler {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_MusicResourceHandler(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public MusicResourceHandler(MusicResourceConfig musicResourceConfig) {
        this(DavinciResourceJniJNI.new_MusicResourceHandler(MusicResourceConfig.getCPtr(musicResourceConfig), musicResourceConfig), true);
    }

    public static long getCPtr(MusicResourceHandler musicResourceHandler) {
        if (musicResourceHandler == null) {
            return 0L;
        }
        return musicResourceHandler.swigCPtr;
    }

    public boolean canHandle(DAVResource dAVResource) {
        return DavinciResourceJniJNI.MusicResourceHandler_canHandle(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource);
    }

    public DAVResource fetchResourceFromCache(String str) {
        long MusicResourceHandler_fetchResourceFromCache__SWIG_1 = DavinciResourceJniJNI.MusicResourceHandler_fetchResourceFromCache__SWIG_1(this.swigCPtr, this, str);
        if (MusicResourceHandler_fetchResourceFromCache__SWIG_1 == 0) {
            return null;
        }
        return new DAVResource(MusicResourceHandler_fetchResourceFromCache__SWIG_1, true);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public MusicResourceHandler(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public DAVResource fetchResourceFromCache(String str, MapStringString mapStringString) {
        long MusicResourceHandler_fetchResourceFromCache__SWIG_0 = DavinciResourceJniJNI.MusicResourceHandler_fetchResourceFromCache__SWIG_0(this.swigCPtr, this, str, MapStringString.getCPtr(mapStringString), mapStringString);
        if (MusicResourceHandler_fetchResourceFromCache__SWIG_0 == 0) {
            return null;
        }
        return new DAVResource(MusicResourceHandler_fetchResourceFromCache__SWIG_0, true);
    }

    public long fetchResource(DAVResource dAVResource, MapStringString mapStringString, DAVResourceFetchCallback dAVResourceFetchCallback) {
        return DavinciResourceJniJNI.MusicResourceHandler_fetchResource(this.swigCPtr, this, DAVResource.getCPtr(dAVResource), dAVResource, MapStringString.getCPtr(mapStringString), mapStringString, DAVResourceFetchCallback.getCPtr(dAVResourceFetchCallback), dAVResourceFetchCallback);
    }
}
