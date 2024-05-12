package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EEVec4f {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEVec4f(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public double getW() {
        return EffectCreatorJniJNI.EEVec4f_w_get(this.swigCPtr, this);
    }

    public double getX() {
        return EffectCreatorJniJNI.EEVec4f_x_get(this.swigCPtr, this);
    }

    public double getY() {
        return EffectCreatorJniJNI.EEVec4f_y_get(this.swigCPtr, this);
    }

    public double getZ() {
        return EffectCreatorJniJNI.EEVec4f_z_get(this.swigCPtr, this);
    }

    public EEVec4f() {
        this(EffectCreatorJniJNI.new_EEVec4f(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EEVec4f eEVec4f) {
        if (eEVec4f == null) {
            return 0L;
        }
        return eEVec4f.swigCPtr;
    }

    public void setW(double d) {
        EffectCreatorJniJNI.EEVec4f_w_set(this.swigCPtr, this, d);
    }

    public void setX(double d) {
        EffectCreatorJniJNI.EEVec4f_x_set(this.swigCPtr, this, d);
    }

    public void setY(double d) {
        EffectCreatorJniJNI.EEVec4f_y_set(this.swigCPtr, this, d);
    }

    public void setZ(double d) {
        EffectCreatorJniJNI.EEVec4f_z_set(this.swigCPtr, this, d);
    }

    public EEVec4f(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
