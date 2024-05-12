package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class DataEventReceiver {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_DataEventReceiver(j);
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
        EffectCreatorJniJNI.DataEventReceiver_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        EffectCreatorJniJNI.DataEventReceiver_change_ownership(this, this.swigCPtr, true);
    }

    public DataEventReceiver() {
        this(EffectCreatorJniJNI.new_DataEventReceiver(), true);
        EffectCreatorJniJNI.DataEventReceiver_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DataEventReceiver dataEventReceiver) {
        if (dataEventReceiver == null) {
            return 0L;
        }
        return dataEventReceiver.swigCPtr;
    }

    public void onDataEventReceived(DataEvent dataEvent) {
        EffectCreatorJniJNI.DataEventReceiver_onDataEventReceived(this.swigCPtr, this, DataEvent.getCPtr(dataEvent), dataEvent);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DataEventReceiver(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
