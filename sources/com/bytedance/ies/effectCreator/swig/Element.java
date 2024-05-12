package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class Element {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_Element(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Element deepClone() {
        long Element_deepClone = EffectCreatorJniJNI.Element_deepClone(this.swigCPtr, this);
        if (Element_deepClone == 0) {
            return null;
        }
        return new Element(Element_deepClone, true);
    }

    public String getCapabilityTokenString() {
        return EffectCreatorJniJNI.Element_getCapabilityTokenString(this.swigCPtr, this);
    }

    public String getClassName() {
        return EffectCreatorJniJNI.Element_getClassName(this.swigCPtr, this);
    }

    public EEStdElementIdList getDependencyElements() {
        return new EEStdElementIdList(EffectCreatorJniJNI.Element_getDependencyElements__SWIG_2(this.swigCPtr, this), true);
    }

    public ElementId id() {
        return new ElementId(EffectCreatorJniJNI.Element_id(this.swigCPtr, this), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.Element_className();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(Element element) {
        if (element == null) {
            return 0L;
        }
        return element.swigCPtr;
    }

    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.Element_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    public EEStdElementIdList getDependencyElements(String str) {
        return new EEStdElementIdList(EffectCreatorJniJNI.Element_getDependencyElements__SWIG_1(this.swigCPtr, this, str), true);
    }

    public String getExtraInfo(String str) {
        return EffectCreatorJniJNI.Element_getExtraInfo(this.swigCPtr, this, str);
    }

    public void getUsedAlgorithm(EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.Element_getUsedAlgorithm(this.swigCPtr, this, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public boolean isCapabilityTrackingDataSameWithoutPath(Element element) {
        return EffectCreatorJniJNI.Element_isCapabilityTrackingDataSameWithoutPath(this.swigCPtr, this, getCPtr(element), element);
    }

    public boolean isKeyExist(String str) {
        return EffectCreatorJniJNI.Element_isKeyExist(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public Element(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.Element_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }

    public EEStdElementIdList getDependencyElements(String str, boolean z) {
        return new EEStdElementIdList(EffectCreatorJniJNI.Element_getDependencyElements__SWIG_0(this.swigCPtr, this, str, z), true);
    }

    public void setExtraInfo(String str, String str2) {
        EffectCreatorJniJNI.Element_setExtraInfo(this.swigCPtr, this, str, str2);
    }
}
