package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class FeatureManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_FeatureManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void apply() {
        EffectCreatorJniJNI.FeatureManager_apply__SWIG_1(this.swigCPtr, this);
    }

    public EEStdFeatureList getFeatures() {
        return new EEStdFeatureList(EffectCreatorJniJNI.FeatureManager_getFeatures(this.swigCPtr, this), true);
    }

    public void initForEmptyProject() {
        EffectCreatorJniJNI.FeatureManager_initForEmptyProject(this.swigCPtr, this);
    }

    public Error recordFeatureEditableStates() {
        return new Error(EffectCreatorJniJNI.FeatureManager_recordFeatureEditableStates(this.swigCPtr, this), true);
    }

    public Error recordFeatureVisibleStates() {
        return new Error(EffectCreatorJniJNI.FeatureManager_recordFeatureVisibleStates(this.swigCPtr, this), true);
    }

    public Error recoverFeatureEditableStates() {
        return new Error(EffectCreatorJniJNI.FeatureManager_recoverFeatureEditableStates__SWIG_1(this.swigCPtr, this), true);
    }

    public Error recoverFeatureVisibleStates() {
        return new Error(EffectCreatorJniJNI.FeatureManager_recoverFeatureVisibleStates__SWIG_1(this.swigCPtr, this), true);
    }

    public void refreshWholeList() {
        EffectCreatorJniJNI.FeatureManager_refreshWholeList(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(FeatureManager featureManager) {
        if (featureManager == null) {
            return 0L;
        }
        return featureManager.swigCPtr;
    }

    public void apply(ApplyFrom applyFrom) {
        EffectCreatorJniJNI.FeatureManager_apply__SWIG_0(this.swigCPtr, this, applyFrom.swigValue());
    }

    public Error canCreateFeature(String str) {
        return new Error(EffectCreatorJniJNI.FeatureManager_canCreateFeature(this.swigCPtr, this, str), true);
    }

    public Feature copyFeature(Feature feature) {
        long FeatureManager_copyFeature = EffectCreatorJniJNI.FeatureManager_copyFeature(this.swigCPtr, this, Feature.getCPtr(feature), feature);
        if (FeatureManager_copyFeature == 0) {
            return null;
        }
        return new Feature(FeatureManager_copyFeature, true);
    }

    public Feature copyFeatureAndObject(Feature feature) {
        long FeatureManager_copyFeatureAndObject = EffectCreatorJniJNI.FeatureManager_copyFeatureAndObject(this.swigCPtr, this, Feature.getCPtr(feature), feature);
        if (FeatureManager_copyFeatureAndObject == 0) {
            return null;
        }
        return new Feature(FeatureManager_copyFeatureAndObject, true);
    }

    public Feature createFeature(String str) {
        long FeatureManager_createFeature__SWIG_3 = EffectCreatorJniJNI.FeatureManager_createFeature__SWIG_3(this.swigCPtr, this, str);
        if (FeatureManager_createFeature__SWIG_3 == 0) {
            return null;
        }
        return new Feature(FeatureManager_createFeature__SWIG_3, true);
    }

    public Feature createFeatureAndObject(String str) {
        long FeatureManager_createFeatureAndObject__SWIG_3 = EffectCreatorJniJNI.FeatureManager_createFeatureAndObject__SWIG_3(this.swigCPtr, this, str);
        if (FeatureManager_createFeatureAndObject__SWIG_3 == 0) {
            return null;
        }
        return new Feature(FeatureManager_createFeatureAndObject__SWIG_3, true);
    }

    public int getFeatureOrder(Feature feature) {
        return EffectCreatorJniJNI.FeatureManager_getFeatureOrder(this.swigCPtr, this, Feature.getCPtr(feature), feature);
    }

    public Error hideAllFeatureExcept(EEStdFeatureList eEStdFeatureList) {
        return new Error(EffectCreatorJniJNI.FeatureManager_hideAllFeatureExcept(this.swigCPtr, this, EEStdFeatureList.getCPtr(eEStdFeatureList), eEStdFeatureList), true);
    }

    public Error lockAllFeatureExcept(EEStdFeatureList eEStdFeatureList) {
        return new Error(EffectCreatorJniJNI.FeatureManager_lockAllFeatureExcept(this.swigCPtr, this, EEStdFeatureList.getCPtr(eEStdFeatureList), eEStdFeatureList), true);
    }

    public int recommendOrderForCreate(FeatureType featureType) {
        return EffectCreatorJniJNI.FeatureManager_recommendOrderForCreate(this.swigCPtr, this, featureType.swigValue());
    }

    public Error recoverFeatureEditableStates(boolean z) {
        return new Error(EffectCreatorJniJNI.FeatureManager_recoverFeatureEditableStates__SWIG_0(this.swigCPtr, this, z), true);
    }

    public Error recoverFeatureVisibleStates(boolean z) {
        return new Error(EffectCreatorJniJNI.FeatureManager_recoverFeatureVisibleStates__SWIG_0(this.swigCPtr, this, z), true);
    }

    public Error removeFeature(Feature feature) {
        return new Error(EffectCreatorJniJNI.FeatureManager_removeFeature(this.swigCPtr, this, Feature.getCPtr(feature), feature), true);
    }

    public Error removeFeatureAndObject(Feature feature) {
        return new Error(EffectCreatorJniJNI.FeatureManager_removeFeatureAndObject(this.swigCPtr, this, Feature.getCPtr(feature), feature), true);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public FeatureManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public EEIntegerList askForAvailablePositionsToMoveFeatures(EEStdFeatureList eEStdFeatureList, int i) {
        return new EEIntegerList(EffectCreatorJniJNI.FeatureManager_askForAvailablePositionsToMoveFeatures(this.swigCPtr, this, EEStdFeatureList.getCPtr(eEStdFeatureList), eEStdFeatureList, i), true);
    }

    public Feature createFeature(String str, String str2) {
        long FeatureManager_createFeature__SWIG_2 = EffectCreatorJniJNI.FeatureManager_createFeature__SWIG_2(this.swigCPtr, this, str, str2);
        if (FeatureManager_createFeature__SWIG_2 == 0) {
            return null;
        }
        return new Feature(FeatureManager_createFeature__SWIG_2, true);
    }

    public Feature createFeatureAndObject(String str, String str2) {
        long FeatureManager_createFeatureAndObject__SWIG_2 = EffectCreatorJniJNI.FeatureManager_createFeatureAndObject__SWIG_2(this.swigCPtr, this, str, str2);
        if (FeatureManager_createFeatureAndObject__SWIG_2 == 0) {
            return null;
        }
        return new Feature(FeatureManager_createFeatureAndObject__SWIG_2, true);
    }

    public Error moveFeatures(EEStdFeatureList eEStdFeatureList, int i) {
        return new Error(EffectCreatorJniJNI.FeatureManager_moveFeatures(this.swigCPtr, this, EEStdFeatureList.getCPtr(eEStdFeatureList), eEStdFeatureList, i), true);
    }

    public Feature createFeature(String str, String str2, String str3) {
        long FeatureManager_createFeature__SWIG_1 = EffectCreatorJniJNI.FeatureManager_createFeature__SWIG_1(this.swigCPtr, this, str, str2, str3);
        if (FeatureManager_createFeature__SWIG_1 == 0) {
            return null;
        }
        return new Feature(FeatureManager_createFeature__SWIG_1, true);
    }

    public Feature createFeatureAndObject(String str, String str2, String str3) {
        long FeatureManager_createFeatureAndObject__SWIG_1 = EffectCreatorJniJNI.FeatureManager_createFeatureAndObject__SWIG_1(this.swigCPtr, this, str, str2, str3);
        if (FeatureManager_createFeatureAndObject__SWIG_1 == 0) {
            return null;
        }
        return new Feature(FeatureManager_createFeatureAndObject__SWIG_1, true);
    }

    public Feature createFeature(String str, String str2, String str3, int i) {
        long FeatureManager_createFeature__SWIG_0 = EffectCreatorJniJNI.FeatureManager_createFeature__SWIG_0(this.swigCPtr, this, str, str2, str3, i);
        if (FeatureManager_createFeature__SWIG_0 == 0) {
            return null;
        }
        return new Feature(FeatureManager_createFeature__SWIG_0, true);
    }

    public Feature createFeatureAndObject(String str, String str2, String str3, int i) {
        long FeatureManager_createFeatureAndObject__SWIG_0 = EffectCreatorJniJNI.FeatureManager_createFeatureAndObject__SWIG_0(this.swigCPtr, this, str, str2, str3, i);
        if (FeatureManager_createFeatureAndObject__SWIG_0 == 0) {
            return null;
        }
        return new Feature(FeatureManager_createFeatureAndObject__SWIG_0, true);
    }
}
