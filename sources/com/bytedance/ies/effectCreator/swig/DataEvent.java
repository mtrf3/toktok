package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class DataEvent {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_DataEvent(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getClassName() {
        return EffectCreatorJniJNI.DataEvent_getClassName(this.swigCPtr, this);
    }

    public DataEventType getType() {
        return DataEventType.swigToEnum(EffectCreatorJniJNI.DataEvent_type_get(this.swigCPtr, this));
    }

    public DataEvent() {
        this(EffectCreatorJniJNI.new_DataEvent(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.DataEvent_className();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DataEvent dataEvent) {
        if (dataEvent == null) {
            return 0L;
        }
        return dataEvent.swigCPtr;
    }

    public void setType(DataEventType dataEventType) {
        EffectCreatorJniJNI.DataEvent_type_set(this.swigCPtr, this, dataEventType.swigValue());
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DataEvent(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
