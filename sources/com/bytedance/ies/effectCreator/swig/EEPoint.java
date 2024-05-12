package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EEPoint {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEPoint(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double getX() {
        return EffectCreatorJniJNI.EEPoint_x_get(this.swigCPtr, this);
    }

    public double getY() {
        return EffectCreatorJniJNI.EEPoint_y_get(this.swigCPtr, this);
    }

    public EEPoint() {
        this(EffectCreatorJniJNI.new_EEPoint(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EEPoint eEPoint) {
        if (eEPoint == null) {
            return 0L;
        }
        return eEPoint.swigCPtr;
    }

    public void setX(double d) {
        EffectCreatorJniJNI.EEPoint_x_set(this.swigCPtr, this, d);
    }

    public void setY(double d) {
        EffectCreatorJniJNI.EEPoint_y_set(this.swigCPtr, this, d);
    }

    public EEPoint(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
