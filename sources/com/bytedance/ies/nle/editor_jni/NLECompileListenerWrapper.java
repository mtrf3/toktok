package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public class NLECompileListenerWrapper {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLECompileListenerWrapper(j);
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
        NLEMediaPublicJniJNI.NLECompileListenerWrapper_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        NLEMediaPublicJniJNI.NLECompileListenerWrapper_change_ownership(this, this.swigCPtr, true);
    }

    public NLECompileListenerWrapper() {
        this(NLEMediaPublicJniJNI.new_NLECompileListenerWrapper(), true);
        NLEMediaPublicJniJNI.NLECompileListenerWrapper_director_connect(this, this.swigCPtr, true, true);
    }

    public void onCompileDone() {
        if (getClass() == NLECompileListenerWrapper.class) {
            NLEMediaPublicJniJNI.NLECompileListenerWrapper_onCompileDone(this.swigCPtr, this);
        } else {
            NLEMediaPublicJniJNI.NLECompileListenerWrapper_onCompileDoneSwigExplicitNLECompileListenerWrapper(this.swigCPtr, this);
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLECompileListenerWrapper nLECompileListenerWrapper) {
        if (nLECompileListenerWrapper == null) {
            return 0L;
        }
        return nLECompileListenerWrapper.swigCPtr;
    }

    public void onCompileProgress(float f) {
        if (getClass() == NLECompileListenerWrapper.class) {
            NLEMediaPublicJniJNI.NLECompileListenerWrapper_onCompileProgress(this.swigCPtr, this, f);
        } else {
            NLEMediaPublicJniJNI.NLECompileListenerWrapper_onCompileProgressSwigExplicitNLECompileListenerWrapper(this.swigCPtr, this, f);
        }
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLECompileListenerWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onCompileError(int i, int i2, float f, String str) {
        if (getClass() == NLECompileListenerWrapper.class) {
            NLEMediaPublicJniJNI.NLECompileListenerWrapper_onCompileError(this.swigCPtr, this, i, i2, f, str);
        } else {
            NLEMediaPublicJniJNI.NLECompileListenerWrapper_onCompileErrorSwigExplicitNLECompileListenerWrapper(this.swigCPtr, this, i, i2, f, str);
        }
    }
}
