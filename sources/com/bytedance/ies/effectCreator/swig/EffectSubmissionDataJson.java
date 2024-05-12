package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EffectSubmissionDataJson {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EffectSubmissionDataJson(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public EffectSubmissionDataJson() {
        this(EffectCreatorJniJNI.new_EffectSubmissionDataJson(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EffectSubmissionDataJson effectSubmissionDataJson) {
        if (effectSubmissionDataJson == null) {
            return 0L;
        }
        return effectSubmissionDataJson.swigCPtr;
    }

    public boolean getValueAsBool(String str) {
        return EffectCreatorJniJNI.EffectSubmissionDataJson_getValueAsBool(this.swigCPtr, this, str);
    }

    public double getValueAsDouble(String str) {
        return EffectCreatorJniJNI.EffectSubmissionDataJson_getValueAsDouble(this.swigCPtr, this, str);
    }

    public int getValueAsInt(String str) {
        return EffectCreatorJniJNI.EffectSubmissionDataJson_getValueAsInt(this.swigCPtr, this, str);
    }

    public String getValueAsString(String str) {
        return EffectCreatorJniJNI.EffectSubmissionDataJson_getValueAsString(this.swigCPtr, this, str);
    }

    public EEStdStringToStringMap getValueAsStringMap(String str) {
        return new EEStdStringToStringMap(EffectCreatorJniJNI.EffectSubmissionDataJson_getValueAsStringMap(this.swigCPtr, this, str), true);
    }

    public EEStdStringList getValueAsStringVector(String str) {
        return new EEStdStringList(EffectCreatorJniJNI.EffectSubmissionDataJson_getValueAsStringVector(this.swigCPtr, this, str), true);
    }

    public boolean isKeyExist(String str) {
        return EffectCreatorJniJNI.EffectSubmissionDataJson_isKeyExist(this.swigCPtr, this, str);
    }

    public void removeKey(String str) {
        EffectCreatorJniJNI.EffectSubmissionDataJson_removeKey(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public EffectSubmissionDataJson(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void setValue(String str, EEStdStringList eEStdStringList) {
        EffectCreatorJniJNI.EffectSubmissionDataJson_setValue__SWIG_4(this.swigCPtr, this, str, EEStdStringList.getCPtr(eEStdStringList), eEStdStringList);
    }

    public void setValue(String str, EEStdStringToStringMap eEStdStringToStringMap) {
        EffectCreatorJniJNI.EffectSubmissionDataJson_setValue__SWIG_5(this.swigCPtr, this, str, EEStdStringToStringMap.getCPtr(eEStdStringToStringMap), eEStdStringToStringMap);
    }

    public void setValue(String str, double d) {
        EffectCreatorJniJNI.EffectSubmissionDataJson_setValue__SWIG_1(this.swigCPtr, this, str, d);
    }

    public void setValue(String str, int i) {
        EffectCreatorJniJNI.EffectSubmissionDataJson_setValue__SWIG_0(this.swigCPtr, this, str, i);
    }

    public void setValue(String str, String str2) {
        EffectCreatorJniJNI.EffectSubmissionDataJson_setValue__SWIG_3(this.swigCPtr, this, str, str2);
    }

    public void setValue(String str, boolean z) {
        EffectCreatorJniJNI.EffectSubmissionDataJson_setValue__SWIG_2(this.swigCPtr, this, str, z);
    }
}
