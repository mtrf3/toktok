package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class LegacyFeature extends Feature {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Feature, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_LegacyFeature(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Feature
    public boolean applyVisibility() {
        return EffectCreatorJniJNI.LegacyFeature_applyVisibility(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Feature, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.LegacyFeature_getClassName(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Feature
    public String getFullPartID() {
        return EffectCreatorJniJNI.LegacyFeature_getFullPartID(this.swigCPtr, this);
    }

    public LegacyFeature() {
        this(EffectCreatorJniJNI.new_LegacyFeature__SWIG_0(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.LegacyFeature_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Feature, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public LegacyFeature(Project project) {
        this(EffectCreatorJniJNI.new_LegacyFeature__SWIG_1(Project.getCPtr(project), project), true);
    }

    public static LegacyFeature dynamicCast(Element element) {
        long LegacyFeature_dynamicCast__SWIG_0 = EffectCreatorJniJNI.LegacyFeature_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (LegacyFeature_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new LegacyFeature(LegacyFeature_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(LegacyFeature legacyFeature) {
        if (legacyFeature == null) {
            return 0L;
        }
        return legacyFeature.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.Feature, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public LegacyFeature(long j, boolean z) {
        super(EffectCreatorJniJNI.LegacyFeature_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
