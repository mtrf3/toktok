package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class ElementId {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_ElementId(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static ElementId Invalid() {
        return new ElementId(EffectCreatorJniJNI.ElementId_Invalid(), true);
    }

    public String descriptionString() {
        return EffectCreatorJniJNI.ElementId_descriptionString(this.swigCPtr, this);
    }

    public boolean isValid() {
        return EffectCreatorJniJNI.ElementId_isValid(this.swigCPtr, this);
    }

    public long objectId() {
        return EffectCreatorJniJNI.ElementId_objectId(this.swigCPtr, this);
    }

    public String toString() {
        return EffectCreatorJniJNI.ElementId_toString(this.swigCPtr, this);
    }

    public ElementId() {
        this(EffectCreatorJniJNI.new_ElementId__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public ElementId(ElementId elementId) {
        this(EffectCreatorJniJNI.new_ElementId__SWIG_3(getCPtr(elementId), elementId), true);
    }

    public static long getCPtr(ElementId elementId) {
        if (elementId == null) {
            return 0L;
        }
        return elementId.swigCPtr;
    }

    public boolean isSameElement(ElementId elementId) {
        return EffectCreatorJniJNI.ElementId_isSameElement(this.swigCPtr, this, getCPtr(elementId), elementId);
    }

    public boolean looseEquality(ElementId elementId) {
        return EffectCreatorJniJNI.ElementId_looseEquality(this.swigCPtr, this, getCPtr(elementId), elementId);
    }

    public boolean looseInequality(ElementId elementId) {
        return EffectCreatorJniJNI.ElementId_looseInequality(this.swigCPtr, this, getCPtr(elementId), elementId);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ElementId(String str) {
        this(EffectCreatorJniJNI.new_ElementId__SWIG_1(str), true);
    }

    public ElementId(long j, String str) {
        this(EffectCreatorJniJNI.new_ElementId__SWIG_2(j, str), true);
    }

    public ElementId(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
