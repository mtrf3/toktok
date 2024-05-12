package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EffectMessageCenter {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EffectMessageCenter(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EffectMessageCenter effectMessageCenter) {
        if (effectMessageCenter == null) {
            return 0L;
        }
        return effectMessageCenter.swigCPtr;
    }

    public EffectMessageCenter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void dispatchEffectMessage(long j, int i, int i2, String str) {
        EffectCreatorJniJNI.EffectMessageCenter_dispatchEffectMessage(j, i, i2, str);
    }
}
