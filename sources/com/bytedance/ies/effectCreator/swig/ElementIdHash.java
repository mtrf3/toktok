package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class ElementIdHash {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_ElementIdHash(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ElementIdHash() {
        this(EffectCreatorJniJNI.new_ElementIdHash(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ElementIdHash elementIdHash) {
        if (elementIdHash == null) {
            return 0L;
        }
        return elementIdHash.swigCPtr;
    }

    public ElementIdHash(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
