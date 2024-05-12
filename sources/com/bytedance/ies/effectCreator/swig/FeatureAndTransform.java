package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class FeatureAndTransform {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_FeatureAndTransform(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public Feature getFeatrure() {
        long FeatureAndTransform_featrure_get = EffectCreatorJniJNI.FeatureAndTransform_featrure_get(this.swigCPtr, this);
        if (FeatureAndTransform_featrure_get == 0) {
            return null;
        }
        return new Feature(FeatureAndTransform_featrure_get, true);
    }

    public UIAnnotationBase getTransform() {
        long FeatureAndTransform_transform_get = EffectCreatorJniJNI.FeatureAndTransform_transform_get(this.swigCPtr, this);
        if (FeatureAndTransform_transform_get == 0) {
            return null;
        }
        return new UIAnnotationBase(FeatureAndTransform_transform_get, true);
    }

    public FeatureAndTransform() {
        this(EffectCreatorJniJNI.new_FeatureAndTransform(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(FeatureAndTransform featureAndTransform) {
        if (featureAndTransform == null) {
            return 0L;
        }
        return featureAndTransform.swigCPtr;
    }

    public void setFeatrure(Feature feature) {
        EffectCreatorJniJNI.FeatureAndTransform_featrure_set(this.swigCPtr, this, Feature.getCPtr(feature), feature);
    }

    public void setTransform(UIAnnotationBase uIAnnotationBase) {
        EffectCreatorJniJNI.FeatureAndTransform_transform_set(this.swigCPtr, this, UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
    }

    public FeatureAndTransform(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
