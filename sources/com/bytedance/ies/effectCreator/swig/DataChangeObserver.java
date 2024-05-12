package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class DataChangeObserver {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_DataChangeObserver(j);
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
        EffectCreatorJniJNI.DataChangeObserver_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        EffectCreatorJniJNI.DataChangeObserver_change_ownership(this, this.swigCPtr, true);
    }

    public DataChangeObserver() {
        this(EffectCreatorJniJNI.new_DataChangeObserver(), true);
        EffectCreatorJniJNI.DataChangeObserver_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DataChangeObserver dataChangeObserver) {
        if (dataChangeObserver == null) {
            return 0L;
        }
        return dataChangeObserver.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DataChangeObserver(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onDataChanged(DataChanges dataChanges, Error error) {
        EffectCreatorJniJNI.DataChangeObserver_onDataChanged(this.swigCPtr, this, DataChanges.getCPtr(dataChanges), dataChanges, Error.getCPtr(error), error);
    }
}
