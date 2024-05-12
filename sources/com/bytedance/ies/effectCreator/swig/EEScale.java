package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EEScale {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEScale(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double getX() {
        return EffectCreatorJniJNI.EEScale_x_get(this.swigCPtr, this);
    }

    public double getY() {
        return EffectCreatorJniJNI.EEScale_y_get(this.swigCPtr, this);
    }

    public EEScale() {
        this(EffectCreatorJniJNI.new_EEScale(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EEScale eEScale) {
        if (eEScale == null) {
            return 0L;
        }
        return eEScale.swigCPtr;
    }

    public void setX(double d) {
        EffectCreatorJniJNI.EEScale_x_set(this.swigCPtr, this, d);
    }

    public void setY(double d) {
        EffectCreatorJniJNI.EEScale_y_set(this.swigCPtr, this, d);
    }

    public EEScale(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
