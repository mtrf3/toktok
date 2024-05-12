package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class ElementIdEqual {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_ElementIdEqual(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ElementIdEqual() {
        this(EffectCreatorJniJNI.new_ElementIdEqual(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ElementIdEqual elementIdEqual) {
        if (elementIdEqual == null) {
            return 0L;
        }
        return elementIdEqual.swigCPtr;
    }

    public ElementIdEqual(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
