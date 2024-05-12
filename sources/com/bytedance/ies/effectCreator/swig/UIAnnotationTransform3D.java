package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public class UIAnnotationTransform3D extends UIAnnotationBase {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationTransform3D(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationTransform3D_getClassName(this.swigCPtr, this);
    }

    public UIAnnotationTransform3DData getCurrentValue() {
        long UIAnnotationTransform3D_getCurrentValue = EffectCreatorJniJNI.UIAnnotationTransform3D_getCurrentValue(this.swigCPtr, this);
        if (UIAnnotationTransform3D_getCurrentValue == 0) {
            return null;
        }
        return new UIAnnotationTransform3DData(UIAnnotationTransform3D_getCurrentValue, true);
    }

    public UIAnnotationTransform3DData getNormalizationTransform3DDataPtr() {
        long UIAnnotationTransform3D_getNormalizationTransform3DDataPtr = EffectCreatorJniJNI.UIAnnotationTransform3D_getNormalizationTransform3DDataPtr(this.swigCPtr, this);
        if (UIAnnotationTransform3D_getNormalizationTransform3DDataPtr == 0) {
            return null;
        }
        return new UIAnnotationTransform3DData(UIAnnotationTransform3D_getNormalizationTransform3DDataPtr, true);
    }

    public EEScale getScale() {
        return new EEScale(EffectCreatorJniJNI.UIAnnotationTransform3D_getScale(this.swigCPtr, this), true);
    }

    public Transform3DType getTransform3DType() {
        return Transform3DType.swigToEnum(EffectCreatorJniJNI.UIAnnotationTransform3D_getTransform3DType(this.swigCPtr, this));
    }

    public boolean getVisible() {
        return EffectCreatorJniJNI.UIAnnotationTransform3D_getVisible(this.swigCPtr, this);
    }

    public void onCanvasInputRTChanged() {
        EffectCreatorJniJNI.UIAnnotationTransform3D_onCanvasInputRTChanged(this.swigCPtr, this);
    }

    public Error updateValueFromAMG() {
        return new Error(EffectCreatorJniJNI.UIAnnotationTransform3D_updateValueFromAMG(this.swigCPtr, this), true);
    }

    public UIAnnotationTransform3D() {
        this(EffectCreatorJniJNI.new_UIAnnotationTransform3D(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationTransform3D_className();
    }

    /* loaded from: classes34.dex */
    public enum Transform3DType {
        Transform3DType_Unknown,
        Transform3DType_Plane,
        Transform3DType_Box;

        public final int swigValue;

        /* loaded from: classes34.dex */
        public static class SwigNext {
            public static int next;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        public static Transform3DType swigToEnum(int i) {
            Transform3DType[] transform3DTypeArr = (Transform3DType[]) Transform3DType.class.getEnumConstants();
            if (i < transform3DTypeArr.length && i >= 0) {
                Transform3DType transform3DType = transform3DTypeArr[i];
                if (transform3DType.swigValue == i) {
                    return transform3DType;
                }
            }
            for (Transform3DType transform3DType2 : transform3DTypeArr) {
                if (transform3DType2.swigValue == i) {
                    return transform3DType2;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("No enum ");
            LIZ.append(Transform3DType.class);
            LIZ.append(" with value ");
            LIZ.append(i);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }

        public static Transform3DType valueOf(String str) {
            return (Transform3DType) V0N.LJJJ(Transform3DType.class, str);
        }

        Transform3DType() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        Transform3DType(Transform3DType transform3DType) {
            int i = transform3DType.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        Transform3DType(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }

    public static void initClass() {
        EffectCreatorJniJNI.UIAnnotationTransform3D_initClass();
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public static UIAnnotationTransform3D dynamicCast(Element element) {
        long UIAnnotationTransform3D_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationTransform3D_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (UIAnnotationTransform3D_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationTransform3D(UIAnnotationTransform3D_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationTransform3D uIAnnotationTransform3D) {
        if (uIAnnotationTransform3D == null) {
            return 0L;
        }
        return uIAnnotationTransform3D.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    public void setCurrentValue(UIAnnotationTransform3DData uIAnnotationTransform3DData) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_setCurrentValue__SWIG_1(this.swigCPtr, this, UIAnnotationTransform3DData.getCPtr(uIAnnotationTransform3DData), uIAnnotationTransform3DData);
    }

    public void setVisible(boolean z) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_setVisible__SWIG_1(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public void updateValue(EEPoint eEPoint) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_updateValue__SWIG_1(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    public void updateValue(EESize eESize) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_updateValue__SWIG_3(this.swigCPtr, this, EESize.getCPtr(eESize), eESize);
    }

    public void updateValue(double d) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_updateValue__SWIG_5(this.swigCPtr, this, d);
    }

    public UIAnnotationTransform3D(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationTransform3D_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effectcreator.swig.UIAnnotationBase, com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }

    public void setCurrentValue(UIAnnotationTransform3DData uIAnnotationTransform3DData, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_setCurrentValue__SWIG_0(this.swigCPtr, this, UIAnnotationTransform3DData.getCPtr(uIAnnotationTransform3DData), uIAnnotationTransform3DData, changeFrom.swigValue());
    }

    public void setVisible(boolean z, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_setVisible__SWIG_0(this.swigCPtr, this, z, changeFrom.swigValue());
    }

    public void updateValue(EEPoint eEPoint, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_updateValue__SWIG_0(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint, changeFrom.swigValue());
    }

    public void updateValue(EESize eESize, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_updateValue__SWIG_2(this.swigCPtr, this, EESize.getCPtr(eESize), eESize, changeFrom.swigValue());
    }

    public void updateValue(double d, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_updateValue__SWIG_4(this.swigCPtr, this, d, changeFrom.swigValue());
    }

    public void updateValue(EEPoint eEPoint, EESize eESize, double d) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_updateValue__SWIG_7(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint, EESize.getCPtr(eESize), eESize, d);
    }

    public void updateValue(EEPoint eEPoint, EESize eESize, double d, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationTransform3D_updateValue__SWIG_6(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint, EESize.getCPtr(eESize), eESize, d, changeFrom.swigValue());
    }
}
