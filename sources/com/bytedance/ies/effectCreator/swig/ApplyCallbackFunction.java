package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class ApplyCallbackFunction {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_ApplyCallbackFunction(j);
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
        EffectCreatorJniJNI.ApplyCallbackFunction_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        EffectCreatorJniJNI.ApplyCallbackFunction_change_ownership(this, this.swigCPtr, true);
    }

    public ApplyCallbackFunction() {
        this(EffectCreatorJniJNI.new_ApplyCallbackFunction(), true);
        EffectCreatorJniJNI.ApplyCallbackFunction_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ApplyCallbackFunction applyCallbackFunction) {
        if (applyCallbackFunction == null) {
            return 0L;
        }
        return applyCallbackFunction.swigCPtr;
    }

    public void onApplied(Error error) {
        EffectCreatorJniJNI.ApplyCallbackFunction_onApplied(this.swigCPtr, this, Error.getCPtr(error), error);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ApplyCallbackFunction(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
