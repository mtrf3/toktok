package com.bytedance.ies.effecteditor.swig;

/* loaded from: classes16.dex */
public class EffectHandleGetter {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectEditorJniJNI.delete_EffectHandleGetter(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        EffectEditorJniJNI.EffectHandleGetter_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        EffectEditorJniJNI.EffectHandleGetter_change_ownership(this, this.swigCPtr, true);
    }

    public long getEffectHandle() {
        return EffectEditorJniJNI.EffectHandleGetter_getEffectHandle(this.swigCPtr, this);
    }

    public EffectHandleGetter() {
        this(EffectEditorJniJNI.new_EffectHandleGetter(), true);
        EffectEditorJniJNI.EffectHandleGetter_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EffectHandleGetter effectHandleGetter) {
        if (effectHandleGetter == null) {
            return 0L;
        }
        return effectHandleGetter.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public EffectHandleGetter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
