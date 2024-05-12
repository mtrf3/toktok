package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class CanvasAnimationListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_CanvasAnimationListener(j);
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
        EffectCreatorJniJNI.CanvasAnimationListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        EffectCreatorJniJNI.CanvasAnimationListener_change_ownership(this, this.swigCPtr, true);
    }

    public CanvasAnimationListener() {
        this(EffectCreatorJniJNI.new_CanvasAnimationListener(), true);
        EffectCreatorJniJNI.CanvasAnimationListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(CanvasAnimationListener canvasAnimationListener) {
        if (canvasAnimationListener == null) {
            return 0L;
        }
        return canvasAnimationListener.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public CanvasAnimationListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void animationStatusChanged(Feature feature, boolean z) {
        EffectCreatorJniJNI.CanvasAnimationListener_animationStatusChanged(this.swigCPtr, this, Feature.getCPtr(feature), feature, z);
    }
}
