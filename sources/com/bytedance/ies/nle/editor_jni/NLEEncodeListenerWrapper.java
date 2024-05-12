package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public class NLEEncodeListenerWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEEncodeListenerWrapper(j);
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
        NLEMediaPublicJniJNI.NLEEncodeListenerWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLEEncodeListenerWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLEEncodeListenerWrapper() {
        this(NLEMediaPublicJniJNI.new_NLEEncodeListenerWrapper(), true);
        NLEMediaPublicJniJNI.NLEEncodeListenerWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEEncodeListenerWrapper nLEEncodeListenerWrapper) {
        if (nLEEncodeListenerWrapper == null) {
            return 0L;
        }
        return nLEEncodeListenerWrapper.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEEncodeListenerWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onCompressBuffer(byte[] bArr, long j, int i, boolean z) {
        NLEMediaPublicJniJNI.NLEEncodeListenerWrapper_onCompressBuffer(this.swigCPtr, this, bArr, j, i, z);
    }
}
