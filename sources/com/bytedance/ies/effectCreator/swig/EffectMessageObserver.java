package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EffectMessageObserver {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EffectMessageObserver(j);
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
        EffectCreatorJniJNI.EffectMessageObserver_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        EffectCreatorJniJNI.EffectMessageObserver_change_ownership(this, this.swigCPtr, true);
    }

    public EffectMessageObserver() {
        this(EffectCreatorJniJNI.new_EffectMessageObserver(), true);
        EffectCreatorJniJNI.EffectMessageObserver_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EffectMessageObserver effectMessageObserver) {
        if (effectMessageObserver == null) {
            return 0L;
        }
        return effectMessageObserver.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public EffectMessageObserver(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onEffectMessageReceived(long j, int i, int i2, String str) {
        EffectCreatorJniJNI.EffectMessageObserver_onEffectMessageReceived(this.swigCPtr, this, j, i, i2, str);
    }
}
