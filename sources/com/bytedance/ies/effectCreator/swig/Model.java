package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class Model extends Element {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_Model(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public AssetManager assetManager() {
        long Model_assetManager = EffectCreatorJniJNI.Model_assetManager(this.swigCPtr, this);
        if (Model_assetManager == 0) {
            return null;
        }
        return new AssetManager(Model_assetManager, true);
    }

    public EventManager eventManager() {
        long Model_eventManager = EffectCreatorJniJNI.Model_eventManager(this.swigCPtr, this);
        if (Model_eventManager == 0) {
            return null;
        }
        return new EventManager(Model_eventManager, true);
    }

    public EventManagerV2 eventManagerV2() {
        long Model_eventManagerV2 = EffectCreatorJniJNI.Model_eventManagerV2(this.swigCPtr, this);
        if (Model_eventManagerV2 == 0) {
            return null;
        }
        return new EventManagerV2(Model_eventManagerV2, true);
    }

    public FeatureManager featureManager() {
        long Model_featureManager = EffectCreatorJniJNI.Model_featureManager(this.swigCPtr, this);
        if (Model_featureManager == 0) {
            return null;
        }
        return new FeatureManager(Model_featureManager, true);
    }

    public EEStdElementList getAssetVector() {
        return new EEStdElementList(EffectCreatorJniJNI.Model_getAssetVector(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.Model_getClassName(this.swigCPtr, this);
    }

    public EEStdElementList getEventCommandVector() {
        return new EEStdElementList(EffectCreatorJniJNI.Model_getEventCommandVector(this.swigCPtr, this), true);
    }

    public EEStdElementList getEventItemVector() {
        return new EEStdElementList(EffectCreatorJniJNI.Model_getEventItemVector(this.swigCPtr, this), true);
    }

    public EEStdElementList getFeatureVector() {
        return new EEStdElementList(EffectCreatorJniJNI.Model_getFeatureVector(this.swigCPtr, this), true);
    }

    public void initForEmptyProject() {
        EffectCreatorJniJNI.Model_initForEmptyProject(this.swigCPtr, this);
    }

    public Model() {
        this(EffectCreatorJniJNI.new_Model__SWIG_0(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.Model_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public Model(Project project) {
        this(EffectCreatorJniJNI.new_Model__SWIG_1(Project.getCPtr(project), project), true);
    }

    public static Model dynamicCast(Element element) {
        long Model_dynamicCast__SWIG_0 = EffectCreatorJniJNI.Model_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (Model_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new Model(Model_dynamicCast__SWIG_0, true);
    }

    public static long getCPtr(Model model) {
        if (model == null) {
            return 0L;
        }
        return model.swigCPtr;
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.Model_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public Model(long j, boolean z) {
        super(EffectCreatorJniJNI.Model_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.Model_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }
}
