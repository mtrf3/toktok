package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EEVec3f {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEVec3f(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double getX() {
        return EffectCreatorJniJNI.EEVec3f_x_get(this.swigCPtr, this);
    }

    public double getY() {
        return EffectCreatorJniJNI.EEVec3f_y_get(this.swigCPtr, this);
    }

    public double getZ() {
        return EffectCreatorJniJNI.EEVec3f_z_get(this.swigCPtr, this);
    }

    public EEVec3f() {
        this(EffectCreatorJniJNI.new_EEVec3f(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EEVec3f eEVec3f) {
        if (eEVec3f == null) {
            return 0L;
        }
        return eEVec3f.swigCPtr;
    }

    public void setX(double d) {
        EffectCreatorJniJNI.EEVec3f_x_set(this.swigCPtr, this, d);
    }

    public void setY(double d) {
        EffectCreatorJniJNI.EEVec3f_y_set(this.swigCPtr, this, d);
    }

    public void setZ(double d) {
        EffectCreatorJniJNI.EEVec3f_z_set(this.swigCPtr, this, d);
    }

    public EEVec3f(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
