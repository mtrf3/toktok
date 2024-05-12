package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EESize {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EESize(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double getHeight() {
        return EffectCreatorJniJNI.EESize_height_get(this.swigCPtr, this);
    }

    public double getWidth() {
        return EffectCreatorJniJNI.EESize_width_get(this.swigCPtr, this);
    }

    public EESize() {
        this(EffectCreatorJniJNI.new_EESize(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EESize eESize) {
        if (eESize == null) {
            return 0L;
        }
        return eESize.swigCPtr;
    }

    public void setHeight(double d) {
        EffectCreatorJniJNI.EESize_height_set(this.swigCPtr, this, d);
    }

    public void setWidth(double d) {
        EffectCreatorJniJNI.EESize_width_set(this.swigCPtr, this, d);
    }

    public EESize(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
