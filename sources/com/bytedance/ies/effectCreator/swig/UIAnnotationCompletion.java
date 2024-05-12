package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationCompletion {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_UIAnnotationCompletion(j);
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
        EffectCreatorJniJNI.UIAnnotationCompletion_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        EffectCreatorJniJNI.UIAnnotationCompletion_change_ownership(this, this.swigCPtr, true);
    }

    public void onSuccess() {
        EffectCreatorJniJNI.UIAnnotationCompletion_onSuccess(this.swigCPtr, this);
    }

    public UIAnnotationCompletion() {
        this(EffectCreatorJniJNI.new_UIAnnotationCompletion(), true);
        EffectCreatorJniJNI.UIAnnotationCompletion_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationCompletion uIAnnotationCompletion) {
        if (uIAnnotationCompletion == null) {
            return 0L;
        }
        return uIAnnotationCompletion.swigCPtr;
    }

    public void onError(Error error) {
        EffectCreatorJniJNI.UIAnnotationCompletion_onError(this.swigCPtr, this, Error.getCPtr(error), error);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationCompletion(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
