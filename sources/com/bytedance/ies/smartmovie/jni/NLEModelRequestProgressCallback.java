package com.bytedance.ies.smartmovie.jni;

import X.V0N;
import com.bytedance.ies.nle.editor_jni.NLEModel;

/* loaded from: classes8.dex */
public class NLEModelRequestProgressCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_NLEModelRequestProgressCallback(j);
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
        SmartMovieJniJNI.NLEModelRequestProgressCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.NLEModelRequestProgressCallback_change_ownership(this, this.swigCPtr, true);
    }

    public NLEModelRequestProgressCallback() {
        this(SmartMovieJniJNI.new_NLEModelRequestProgressCallback(), true);
        SmartMovieJniJNI.NLEModelRequestProgressCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEModelRequestProgressCallback nLEModelRequestProgressCallback) {
        if (nLEModelRequestProgressCallback == null) {
            return 0L;
        }
        return nLEModelRequestProgressCallback.swigCPtr;
    }

    public void onCompressDone(VecMeta vecMeta) {
        SmartMovieJniJNI.NLEModelRequestProgressCallback_onCompressDone(this.swigCPtr, this, VecMeta.LJFF(vecMeta), vecMeta);
    }

    public void onCompressProgress(float f) {
        SmartMovieJniJNI.NLEModelRequestProgressCallback_onCompressProgress(this.swigCPtr, this, f);
    }

    public void onFetchProgress(float f) {
        SmartMovieJniJNI.NLEModelRequestProgressCallback_onFetchProgress(this.swigCPtr, this, f);
    }

    public void onNeedFetch(VecStr vecStr) {
        long j;
        long j2 = this.swigCPtr;
        if (vecStr == null) {
            j = 0;
        } else {
            j = vecStr.LJLIL;
        }
        SmartMovieJniJNI.NLEModelRequestProgressCallback_onNeedFetch(j2, this, j, vecStr);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEModelRequestProgressCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        SmartMovieJniJNI.NLEModelRequestProgressCallback_onResponse(this.swigCPtr, this, V0N.LJIJI(nLEModel), UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
    }

    public void onSuccess(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        SmartMovieJniJNI.NLEModelRequestProgressCallback_onSuccess(this.swigCPtr, this, V0N.LJIJI(nLEModel), UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
    }

    public void onFailure(String str, int i, String str2, UnorderedMapStrStr unorderedMapStrStr) {
        SmartMovieJniJNI.NLEModelRequestProgressCallback_onFailure(this.swigCPtr, this, str, i, str2, UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
    }
}
