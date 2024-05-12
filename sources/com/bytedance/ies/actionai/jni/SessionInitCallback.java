package com.bytedance.ies.actionai.jni;

/* loaded from: classes17.dex */
public class SessionInitCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_SessionInitCallback(j);
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
        ActionAIJniJNI.SessionInitCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        ActionAIJniJNI.SessionInitCallback_change_ownership(this, this.swigCPtr, true);
    }

    public SessionInitCallback() {
        this(ActionAIJniJNI.new_SessionInitCallback(), true);
        ActionAIJniJNI.SessionInitCallback_director_connect(this, this.swigCPtr, true, false);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(SessionInitCallback sessionInitCallback) {
        if (sessionInitCallback == null) {
            return 0L;
        }
        return sessionInitCallback.swigCPtr;
    }

    public void onSuccess(String str) {
        ActionAIJniJNI.SessionInitCallback_onSuccess(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public SessionInitCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onFail(ActionAIErrorCode actionAIErrorCode, String str, ServerErrorInfo serverErrorInfo) {
        ActionAIJniJNI.SessionInitCallback_onFail(this.swigCPtr, this, actionAIErrorCode.swigValue(), str, ServerErrorInfo.getCPtr(serverErrorInfo), serverErrorInfo);
    }
}
