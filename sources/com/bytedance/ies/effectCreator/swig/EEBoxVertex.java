package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EEBoxVertex {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEBoxVertex(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public EEPoint getBack_bottom_left() {
        long EEBoxVertex_back_bottom_left_get = EffectCreatorJniJNI.EEBoxVertex_back_bottom_left_get(this.swigCPtr, this);
        if (EEBoxVertex_back_bottom_left_get == 0) {
            return null;
        }
        return new EEPoint(EEBoxVertex_back_bottom_left_get, false);
    }

    public EEPoint getBack_bottom_right() {
        long EEBoxVertex_back_bottom_right_get = EffectCreatorJniJNI.EEBoxVertex_back_bottom_right_get(this.swigCPtr, this);
        if (EEBoxVertex_back_bottom_right_get == 0) {
            return null;
        }
        return new EEPoint(EEBoxVertex_back_bottom_right_get, false);
    }

    public EEPoint getBack_top_left() {
        long EEBoxVertex_back_top_left_get = EffectCreatorJniJNI.EEBoxVertex_back_top_left_get(this.swigCPtr, this);
        if (EEBoxVertex_back_top_left_get == 0) {
            return null;
        }
        return new EEPoint(EEBoxVertex_back_top_left_get, false);
    }

    public EEPoint getBack_top_right() {
        long EEBoxVertex_back_top_right_get = EffectCreatorJniJNI.EEBoxVertex_back_top_right_get(this.swigCPtr, this);
        if (EEBoxVertex_back_top_right_get == 0) {
            return null;
        }
        return new EEPoint(EEBoxVertex_back_top_right_get, false);
    }

    public EEPoint getFront_bottom_left() {
        long EEBoxVertex_front_bottom_left_get = EffectCreatorJniJNI.EEBoxVertex_front_bottom_left_get(this.swigCPtr, this);
        if (EEBoxVertex_front_bottom_left_get == 0) {
            return null;
        }
        return new EEPoint(EEBoxVertex_front_bottom_left_get, false);
    }

    public EEPoint getFront_bottom_right() {
        long EEBoxVertex_front_bottom_right_get = EffectCreatorJniJNI.EEBoxVertex_front_bottom_right_get(this.swigCPtr, this);
        if (EEBoxVertex_front_bottom_right_get == 0) {
            return null;
        }
        return new EEPoint(EEBoxVertex_front_bottom_right_get, false);
    }

    public EEPoint getFront_top_left() {
        long EEBoxVertex_front_top_left_get = EffectCreatorJniJNI.EEBoxVertex_front_top_left_get(this.swigCPtr, this);
        if (EEBoxVertex_front_top_left_get == 0) {
            return null;
        }
        return new EEPoint(EEBoxVertex_front_top_left_get, false);
    }

    public EEPoint getFront_top_right() {
        long EEBoxVertex_front_top_right_get = EffectCreatorJniJNI.EEBoxVertex_front_top_right_get(this.swigCPtr, this);
        if (EEBoxVertex_front_top_right_get == 0) {
            return null;
        }
        return new EEPoint(EEBoxVertex_front_top_right_get, false);
    }

    public EEBoxVertex() {
        this(EffectCreatorJniJNI.new_EEBoxVertex(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EEBoxVertex eEBoxVertex) {
        if (eEBoxVertex == null) {
            return 0L;
        }
        return eEBoxVertex.swigCPtr;
    }

    public void setBack_bottom_left(EEPoint eEPoint) {
        EffectCreatorJniJNI.EEBoxVertex_back_bottom_left_set(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void setBack_bottom_right(EEPoint eEPoint) {
        EffectCreatorJniJNI.EEBoxVertex_back_bottom_right_set(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void setBack_top_left(EEPoint eEPoint) {
        EffectCreatorJniJNI.EEBoxVertex_back_top_left_set(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void setBack_top_right(EEPoint eEPoint) {
        EffectCreatorJniJNI.EEBoxVertex_back_top_right_set(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void setFront_bottom_left(EEPoint eEPoint) {
        EffectCreatorJniJNI.EEBoxVertex_front_bottom_left_set(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void setFront_bottom_right(EEPoint eEPoint) {
        EffectCreatorJniJNI.EEBoxVertex_front_bottom_right_set(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void setFront_top_left(EEPoint eEPoint) {
        EffectCreatorJniJNI.EEBoxVertex_front_top_left_set(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void setFront_top_right(EEPoint eEPoint) {
        EffectCreatorJniJNI.EEBoxVertex_front_top_right_set(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public EEBoxVertex(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
