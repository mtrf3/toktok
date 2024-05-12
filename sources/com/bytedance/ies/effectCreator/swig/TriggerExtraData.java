package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class TriggerExtraData {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_TriggerExtraData(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double getDelayTime() {
        return EffectCreatorJniJNI.TriggerExtraData_delayTime_get(this.swigCPtr, this);
    }

    public double getFps() {
        return EffectCreatorJniJNI.TriggerExtraData_fps_get(this.swigCPtr, this);
    }

    public ElementId getObjectId() {
        return new ElementId(EffectCreatorJniJNI.TriggerExtraData_objectId_get(this.swigCPtr, this), true);
    }

    public ElementId getSequenceId() {
        return new ElementId(EffectCreatorJniJNI.TriggerExtraData_sequenceId_get(this.swigCPtr, this), true);
    }

    public TriggerExtraData() {
        this(EffectCreatorJniJNI.new_TriggerExtraData(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(TriggerExtraData triggerExtraData) {
        if (triggerExtraData == null) {
            return 0L;
        }
        return triggerExtraData.swigCPtr;
    }

    public void setDelayTime(double d) {
        EffectCreatorJniJNI.TriggerExtraData_delayTime_set(this.swigCPtr, this, d);
    }

    public void setFps(double d) {
        EffectCreatorJniJNI.TriggerExtraData_fps_set(this.swigCPtr, this, d);
    }

    public void setObjectId(ElementId elementId) {
        EffectCreatorJniJNI.TriggerExtraData_objectId_set(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void setSequenceId(ElementId elementId) {
        EffectCreatorJniJNI.TriggerExtraData_sequenceId_set(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public TriggerExtraData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
