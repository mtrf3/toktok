package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class ActionExtraData {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_ActionExtraData(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double getTimeInterval() {
        return EffectCreatorJniJNI.ActionExtraData_timeInterval_get(this.swigCPtr, this);
    }

    public ActionExtraData() {
        this(EffectCreatorJniJNI.new_ActionExtraData(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ActionExtraData actionExtraData) {
        if (actionExtraData == null) {
            return 0L;
        }
        return actionExtraData.swigCPtr;
    }

    public void setTimeInterval(double d) {
        EffectCreatorJniJNI.ActionExtraData_timeInterval_set(this.swigCPtr, this, d);
    }

    public ActionExtraData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
