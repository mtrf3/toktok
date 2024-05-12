package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EventManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EventManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Error afterLoad() {
        return new Error(EffectCreatorJniJNI.EventManager_afterLoad(this.swigCPtr, this), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EventManager eventManager) {
        if (eventManager == null) {
            return 0L;
        }
        return eventManager.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public EventManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
