package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public class UIAnnotationBase extends Element {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_UIAnnotationBase(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getCallbackMoreMethod() {
        return EffectCreatorJniJNI.UIAnnotationBase_getCallbackMoreMethod(this.swigCPtr, this);
    }

    public String getCallbackMoreProperty() {
        return EffectCreatorJniJNI.UIAnnotationBase_getCallbackMoreProperty(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.UIAnnotationBase_getClassName(this.swigCPtr, this);
    }

    public String getFeatureFullPartId() {
        return EffectCreatorJniJNI.UIAnnotationBase_getFeatureFullPartId(this.swigCPtr, this);
    }

    public EEStdStringList getMultiCallbackMoreMethod() {
        return new EEStdStringList(EffectCreatorJniJNI.UIAnnotationBase_getMultiCallbackMoreMethod(this.swigCPtr, this), false);
    }

    public EEStdStringList getMultiCallbackMoreProperty() {
        return new EEStdStringList(EffectCreatorJniJNI.UIAnnotationBase_getMultiCallbackMoreProperty(this.swigCPtr, this), false);
    }

    public EEStdStringList getMultiSuffixPartId() {
        return new EEStdStringList(EffectCreatorJniJNI.UIAnnotationBase_getMultiSuffixPartId(this.swigCPtr, this), false);
    }

    public String getName() {
        return EffectCreatorJniJNI.UIAnnotationBase_getName(this.swigCPtr, this);
    }

    public ElementId getOwnerId() {
        return new ElementId(EffectCreatorJniJNI.UIAnnotationBase_getOwnerId(this.swigCPtr, this), true);
    }

    public String getSuffixPartId() {
        return EffectCreatorJniJNI.UIAnnotationBase_getSuffixPartId(this.swigCPtr, this);
    }

    public UIAnnotationUIMore getUIMore() {
        long UIAnnotationBase_getUIMore = EffectCreatorJniJNI.UIAnnotationBase_getUIMore(this.swigCPtr, this);
        if (UIAnnotationBase_getUIMore == 0) {
            return null;
        }
        return new UIAnnotationUIMore(UIAnnotationBase_getUIMore, true);
    }

    public UIAnnotationUIType getUIType() {
        return UIAnnotationUIType.swigToEnum(EffectCreatorJniJNI.UIAnnotationBase_getUIType(this.swigCPtr, this));
    }

    public UIAnnotationBase() {
        this(EffectCreatorJniJNI.new_UIAnnotationBase(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.UIAnnotationBase_className();
    }

    /* loaded from: classes34.dex */
    public enum ParserFrom {
        Create,
        Reconstruct;

        public final int swigValue;

        /* loaded from: classes34.dex */
        public static class SwigNext {
            public static int next;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        public static ParserFrom swigToEnum(int i) {
            ParserFrom[] parserFromArr = (ParserFrom[]) ParserFrom.class.getEnumConstants();
            if (i < parserFromArr.length && i >= 0) {
                ParserFrom parserFrom = parserFromArr[i];
                if (parserFrom.swigValue == i) {
                    return parserFrom;
                }
            }
            for (ParserFrom parserFrom2 : parserFromArr) {
                if (parserFrom2.swigValue == i) {
                    return parserFrom2;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("No enum ");
            LIZ.append(ParserFrom.class);
            LIZ.append(" with value ");
            LIZ.append(i);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }

        public static ParserFrom valueOf(String str) {
            return (ParserFrom) V0N.LJJJ(ParserFrom.class, str);
        }

        ParserFrom() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        ParserFrom(ParserFrom parserFrom) {
            int i = parserFrom.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        ParserFrom(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public static UIAnnotationBase dynamicCast(Element element) {
        long UIAnnotationBase_dynamicCast__SWIG_0 = EffectCreatorJniJNI.UIAnnotationBase_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (UIAnnotationBase_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new UIAnnotationBase(UIAnnotationBase_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(UIAnnotationBase uIAnnotationBase) {
        if (uIAnnotationBase == null) {
            return 0L;
        }
        return uIAnnotationBase.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.UIAnnotationBase_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    public void getUIAnnotationMultiPartId(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.UIAnnotationBase_getUIAnnotationMultiPartId(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public void setCallbackMoreMethod(String str) {
        EffectCreatorJniJNI.UIAnnotationBase_setCallbackMoreMethod__SWIG_1(this.swigCPtr, this, str);
    }

    public void setCallbackMoreProperty(String str) {
        EffectCreatorJniJNI.UIAnnotationBase_setCallbackMoreProperty__SWIG_1(this.swigCPtr, this, str);
    }

    public void setMultiCallbackMoreMethod(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.UIAnnotationBase_setMultiCallbackMoreMethod__SWIG_1(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public void setMultiCallbackMoreProperty(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.UIAnnotationBase_setMultiCallbackMoreProperty__SWIG_1(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public void setMultiSuffixPartId(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.UIAnnotationBase_setMultiSuffixPartId__SWIG_1(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public void setName(String str) {
        EffectCreatorJniJNI.UIAnnotationBase_setName__SWIG_1(this.swigCPtr, this, str);
    }

    public void setOwnerId(ElementId elementId) {
        EffectCreatorJniJNI.UIAnnotationBase_setOwnerId__SWIG_1(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    public void setSuffixPartId(String str) {
        EffectCreatorJniJNI.UIAnnotationBase_setSuffixPartId__SWIG_1(this.swigCPtr, this, str);
    }

    public void setUIType(UIAnnotationUIType uIAnnotationUIType) {
        EffectCreatorJniJNI.UIAnnotationBase_setUIType__SWIG_1(this.swigCPtr, this, uIAnnotationUIType.swigValue());
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public UIAnnotationBase(long j, boolean z) {
        super(EffectCreatorJniJNI.UIAnnotationBase_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.UIAnnotationBase_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }

    public void setCallbackMoreMethod(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBase_setCallbackMoreMethod__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setCallbackMoreProperty(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBase_setCallbackMoreProperty__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setMultiCallbackMoreMethod(EEStdStringList eEStdStringList, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBase_setMultiCallbackMoreMethod__SWIG_0(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList, changeFrom.swigValue());
    }

    public void setMultiCallbackMoreProperty(EEStdStringList eEStdStringList, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBase_setMultiCallbackMoreProperty__SWIG_0(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList, changeFrom.swigValue());
    }

    public void setMultiSuffixPartId(EEStdStringList eEStdStringList, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBase_setMultiSuffixPartId__SWIG_0(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList, changeFrom.swigValue());
    }

    public void setName(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBase_setName__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setOwnerId(ElementId elementId, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBase_setOwnerId__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId, changeFrom.swigValue());
    }

    public void setSuffixPartId(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBase_setSuffixPartId__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setUIType(UIAnnotationUIType uIAnnotationUIType, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.UIAnnotationBase_setUIType__SWIG_0(this.swigCPtr, this, uIAnnotationUIType.swigValue(), changeFrom.swigValue());
    }
}
