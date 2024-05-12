package com.bytedance.ies.effecteditor.swig;

/* loaded from: classes3.dex */
public class UIAnnotationNumberDisplayModeUtils {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        if (this.swigCPtr != 0) {
            if (!this.swigCMemOwn) {
                this.swigCPtr = 0L;
            } else {
                this.swigCMemOwn = false;
                throw new UnsupportedOperationException("C++ destructor does not have public access");
            }
        }
    }

    public static long getCPtr(UIAnnotationNumberDisplayModeUtils uIAnnotationNumberDisplayModeUtils) {
        if (uIAnnotationNumberDisplayModeUtils == null) {
            return 0L;
        }
        return uIAnnotationNumberDisplayModeUtils.swigCPtr;
    }

    public static String stringFromType(UIAnnotationNumberDisplayMode uIAnnotationNumberDisplayMode) {
        return EffectEditorJniJNI.UIAnnotationNumberDisplayModeUtils_stringFromType(uIAnnotationNumberDisplayMode.swigValue());
    }

    public static UIAnnotationNumberDisplayMode typeFromString(String str) {
        return UIAnnotationNumberDisplayMode.swigToEnum(EffectEditorJniJNI.UIAnnotationNumberDisplayModeUtils_typeFromString(str));
    }

    public UIAnnotationNumberDisplayModeUtils(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
