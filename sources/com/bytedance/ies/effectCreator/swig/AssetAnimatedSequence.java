package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class AssetAnimatedSequence extends AssetImageTexture {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.AssetImageTexture, com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_AssetAnimatedSequence(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.effectcreator.swig.AssetImageTexture, com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.AssetAnimatedSequence_getClassName(this.swigCPtr, this);
    }

    public int getFPS() {
        return EffectCreatorJniJNI.AssetAnimatedSequence_getFPS(this.swigCPtr, this);
    }

    public AssetAnimatedSequence() {
        this(EffectCreatorJniJNI.new_AssetAnimatedSequence__SWIG_0(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.AssetAnimatedSequence_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.AssetImageTexture, com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public AssetAnimatedSequence(Project project) {
        this(EffectCreatorJniJNI.new_AssetAnimatedSequence__SWIG_1(Project.getCPtr(project), project), true);
    }

    public static AssetAnimatedSequence dynamicCast(Element element) {
        long AssetAnimatedSequence_dynamicCast__SWIG_0 = EffectCreatorJniJNI.AssetAnimatedSequence_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (AssetAnimatedSequence_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new AssetAnimatedSequence(AssetAnimatedSequence_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(AssetAnimatedSequence assetAnimatedSequence) {
        if (assetAnimatedSequence == null) {
            return 0L;
        }
        return assetAnimatedSequence.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.AssetImageTexture, com.bytedance.ies.effectcreator.swig.Asset, com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public AssetAnimatedSequence(long j, boolean z) {
        super(EffectCreatorJniJNI.AssetAnimatedSequence_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
