package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class UIAnnotationAnchorAlignment extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationAnchorAlignment(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public UIAnnotationAnchorType getAnchorType() {
        return UIAnnotationAnchorType.swigToEnum(EffectCreatorJniJNI.UIAnnotationAnchorAlignment_getAnchorType(this.swigCPtr, this));
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationAnchorAlignment_getClassName(this.swigCPtr, this);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationAnchorAlignment_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public static UIAnnotationAnchorAlignment dynamicCast(Element element) {
        long UIAnnotationAnchorAlignment_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationAnchorAlignment_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (UIAnnotationAnchorAlignment_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationAnchorAlignment(UIAnnotationAnchorAlignment_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationAnchorAlignment uIAnnotationAnchorAlignment) {
        if (uIAnnotationAnchorAlignment == null) {
            return 0L;
        }
        return uIAnnotationAnchorAlignment.swigCPtr;
    }

    public static String stringFromType(UIAnnotationAnchorType uIAnnotationAnchorType) {
        return EffectCreatorJniJNI.UIAnnotationAnchorAlignment_stringFromType(uIAnnotationAnchorType.swigValue());
    }

    public static UIAnnotationAnchorType typeFromString(String str) {
        return UIAnnotationAnchorType.swigToEnum(EffectCreatorJniJNI.UIAnnotationAnchorAlignment_typeFromString(str));
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationAnchorAlignment(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationAnchorAlignment_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
