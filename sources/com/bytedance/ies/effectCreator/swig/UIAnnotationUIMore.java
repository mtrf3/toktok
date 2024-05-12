package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationUIMore {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_UIAnnotationUIMore(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationUIMore_getClassName(this.swigCPtr, this);
    }

    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectCreatorJniJNI.UIAnnotationUIMore_getUIType(this.swigCPtr, this));
    }

    public UIAnnotationUIMore() {
        this(EffectCreatorJniJNI.new_UIAnnotationUIMore(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationUIMore_className();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(UIAnnotationUIMore uIAnnotationUIMore) {
        if (uIAnnotationUIMore == null) {
            return 0L;
        }
        return uIAnnotationUIMore.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public UIAnnotationUIMore(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
