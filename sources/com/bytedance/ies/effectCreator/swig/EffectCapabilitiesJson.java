package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class EffectCapabilitiesJson {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EffectCapabilitiesJson(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Error load() {
        return new Error(EffectCreatorJniJNI.EffectCapabilitiesJson_load(this.swigCPtr, this), true);
    }

    public EffectCapabilitiesJson() {
        this(EffectCreatorJniJNI.new_EffectCapabilitiesJson(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(EffectCapabilitiesJson effectCapabilitiesJson) {
        if (effectCapabilitiesJson == null) {
            return 0L;
        }
        return effectCapabilitiesJson.swigCPtr;
    }

    public boolean getValueAsBoolInAMEExtraCreation(String str) {
        return EffectCreatorJniJNI.EffectCapabilitiesJson_getValueAsBoolInAMEExtraCreation(this.swigCPtr, this, str);
    }

    public double getValueAsDoubleInAMEExtraCreation(String str) {
        return EffectCreatorJniJNI.EffectCapabilitiesJson_getValueAsDoubleInAMEExtraCreation(this.swigCPtr, this, str);
    }

    public int getValueAsIntInAMEExtraCreation(String str) {
        return EffectCreatorJniJNI.EffectCapabilitiesJson_getValueAsIntInAMEExtraCreation(this.swigCPtr, this, str);
    }

    public String getValueAsStringInAMEExtraCreation(String str) {
        return EffectCreatorJniJNI.EffectCapabilitiesJson_getValueAsStringInAMEExtraCreation(this.swigCPtr, this, str);
    }

    public boolean isKeyExistInAMEExtraCreation(String str) {
        return EffectCreatorJniJNI.EffectCapabilitiesJson_isKeyExistInAMEExtraCreation(this.swigCPtr, this, str);
    }

    public void removeKeyInAMEExtraCreation(String str) {
        EffectCreatorJniJNI.EffectCapabilitiesJson_removeKeyInAMEExtraCreation(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public EffectCapabilitiesJson(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void setValueInAMEExtraCreation(String str, double d) {
        EffectCreatorJniJNI.EffectCapabilitiesJson_setValueInAMEExtraCreation__SWIG_1(this.swigCPtr, this, str, d);
    }

    public void setValueInAMEExtraCreation(String str, int i) {
        EffectCreatorJniJNI.EffectCapabilitiesJson_setValueInAMEExtraCreation__SWIG_0(this.swigCPtr, this, str, i);
    }

    public void setValueInAMEExtraCreation(String str, String str2) {
        EffectCreatorJniJNI.EffectCapabilitiesJson_setValueInAMEExtraCreation__SWIG_3(this.swigCPtr, this, str, str2);
    }

    public void setValueInAMEExtraCreation(String str, boolean z) {
        EffectCreatorJniJNI.EffectCapabilitiesJson_setValueInAMEExtraCreation__SWIG_2(this.swigCPtr, this, str, z);
    }
}
