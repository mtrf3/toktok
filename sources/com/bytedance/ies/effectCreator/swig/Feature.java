package com.bytedance.ies.effectcreator.swig;

/* loaded from: classes34.dex */
public class Feature extends Element {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                EffectCreatorJniJNI.delete_Feature(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public boolean applyVisibility() {
        return EffectCreatorJniJNI.Feature_applyVisibility(this.swigCPtr, this);
    }

    public void clearParameterMap() {
        EffectCreatorJniJNI.Feature_clearParameterMap(this.swigCPtr, this);
    }

    public UIAnnotationAnchorType get2DStickerAnchorType() {
        return UIAnnotationAnchorType.swigToEnum(EffectCreatorJniJNI.Feature_get2DStickerAnchorType(this.swigCPtr, this));
    }

    public boolean getAnimationPlaying() {
        return EffectCreatorJniJNI.Feature_getAnimationPlaying(this.swigCPtr, this);
    }

    public String getAssetCategory() {
        return EffectCreatorJniJNI.Feature_getAssetCategory(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public String getClassName() {
        return EffectCreatorJniJNI.Feature_getClassName(this.swigCPtr, this);
    }

    public String getDisplayName() {
        return EffectCreatorJniJNI.Feature_getDisplayName(this.swigCPtr, this);
    }

    public boolean getEditable() {
        return EffectCreatorJniJNI.Feature_getEditable(this.swigCPtr, this);
    }

    public String getEventPartId() {
        return EffectCreatorJniJNI.Feature_getEventPartId(this.swigCPtr, this);
    }

    public Feature_ForeOrBackground getFeatureForeOrBackgound() {
        return Feature_ForeOrBackground.swigToEnum(EffectCreatorJniJNI.Feature_getFeatureForeOrBackgound(this.swigCPtr, this));
    }

    public FeatureType getFeatureType() {
        return FeatureType.swigToEnum(EffectCreatorJniJNI.Feature_getFeatureType(this.swigCPtr, this));
    }

    public Version getFeatureVersion() {
        return new Version(EffectCreatorJniJNI.Feature_getFeatureVersion(this.swigCPtr, this), false);
    }

    public String getFullPartID() {
        return EffectCreatorJniJNI.Feature_getFullPartID(this.swigCPtr, this);
    }

    public String getIconPath() {
        return EffectCreatorJniJNI.Feature_getIconPath(this.swigCPtr, this);
    }

    public boolean getInitiallyVisible() {
        return EffectCreatorJniJNI.Feature_getInitiallyVisible(this.swigCPtr, this);
    }

    public String getLokiPanelKey() {
        return EffectCreatorJniJNI.Feature_getLokiPanelKey(this.swigCPtr, this);
    }

    public EEStdUIAnnotationBaseList getMappableUiAnnotations() {
        return new EEStdUIAnnotationBaseList(EffectCreatorJniJNI.Feature_getMappableUiAnnotations(this.swigCPtr, this), true);
    }

    public EEStdStringList getModelCategoryKeys() {
        return new EEStdStringList(EffectCreatorJniJNI.Feature_getModelCategoryKeys(this.swigCPtr, this), true);
    }

    public String getPrefabPath() {
        return EffectCreatorJniJNI.Feature_getPrefabPath__SWIG_1(this.swigCPtr, this);
    }

    public int getRendererSize() {
        return EffectCreatorJniJNI.Feature_getRendererSize(this.swigCPtr, this);
    }

    public String getResourceName() {
        return EffectCreatorJniJNI.Feature_getResourceName(this.swigCPtr, this);
    }

    public String getSecondPanelType() {
        return EffectCreatorJniJNI.Feature_getSecondPanelType(this.swigCPtr, this);
    }

    public String getTag() {
        return EffectCreatorJniJNI.Feature_getTag(this.swigCPtr, this);
    }

    public FeatureType getType() {
        return FeatureType.swigToEnum(EffectCreatorJniJNI.Feature_getType(this.swigCPtr, this));
    }

    public EEStdElementList getUiAnnotationVector() {
        return new EEStdElementList(EffectCreatorJniJNI.Feature_getUiAnnotationVector(this.swigCPtr, this), true);
    }

    public EEStdUIAnnotationBaseList getUiAnnotations() {
        return new EEStdUIAnnotationBaseList(EffectCreatorJniJNI.Feature_getUiAnnotations(this.swigCPtr, this), true);
    }

    public boolean getVisible() {
        return EffectCreatorJniJNI.Feature_getVisible(this.swigCPtr, this);
    }

    public boolean isFeatureWithoutEffect() {
        return EffectCreatorJniJNI.Feature_isFeatureWithoutEffect(this.swigCPtr, this);
    }

    public void recordFeature() {
        EffectCreatorJniJNI.Feature_recordFeature(this.swigCPtr, this);
    }

    public void recoverRecordedFeature() {
        EffectCreatorJniJNI.Feature_recoverRecordedFeature(this.swigCPtr, this);
    }

    public void reverseForeOrBackground() {
        EffectCreatorJniJNI.Feature_reverseForeOrBackground(this.swigCPtr, this);
    }

    public void willBeSelected() {
        EffectCreatorJniJNI.Feature_willBeSelected(this.swigCPtr, this);
    }

    public Feature() {
        this(EffectCreatorJniJNI.new_Feature__SWIG_0(), true);
    }

    public static String className() {
        return EffectCreatorJniJNI.Feature_className();
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void finalize() {
        delete();
    }

    public Feature(Project project) {
        this(EffectCreatorJniJNI.new_Feature__SWIG_1(Project.getCPtr(project), project), true);
    }

    public static Feature dynamicCast(Element element) {
        long Feature_dynamicCast__SWIG_0 = EffectCreatorJniJNI.Feature_dynamicCast__SWIG_0(Element.getCPtr(element), element);
        if (Feature_dynamicCast__SWIG_0 == 0) {
            return null;
        }
        return new Feature(Feature_dynamicCast__SWIG_0, true);
    }

    public static String featureForeOrBackgroundEnum2Str(Feature_ForeOrBackground feature_ForeOrBackground) {
        return EffectCreatorJniJNI.Feature_featureForeOrBackgroundEnum2Str(feature_ForeOrBackground.swigValue());
    }

    public static Feature_ForeOrBackground featureForeOrBackgroundStr2Enum(String str) {
        return Feature_ForeOrBackground.swigToEnum(EffectCreatorJniJNI.Feature_featureForeOrBackgroundStr2Enum(str));
    }

    public static String featureTypeEnum2Str(FeatureType featureType) {
        return EffectCreatorJniJNI.Feature_featureTypeEnum2Str(featureType.swigValue());
    }

    public static FeatureType featureTypeStr2Enum(String str) {
        return FeatureType.swigToEnum(EffectCreatorJniJNI.Feature_featureTypeStr2Enum(str));
    }

    public static long getCPtr(Feature feature) {
        if (feature == null) {
            return 0L;
        }
        return feature.swigCPtr;
    }

    public static FeatureType getFeatureTypeFromPrefab(String str) {
        return FeatureType.swigToEnum(EffectCreatorJniJNI.Feature_getFeatureTypeFromPrefab(str));
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction) {
        EffectCreatorJniJNI.Feature_apply__SWIG_1(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction);
    }

    public Error createFrom(String str) {
        return new Error(EffectCreatorJniJNI.Feature_createFrom(this.swigCPtr, this, str), true);
    }

    public String getPrefabPath(boolean z) {
        return EffectCreatorJniJNI.Feature_getPrefabPath__SWIG_0(this.swigCPtr, this, z);
    }

    public UIAnnotationBase getUiAnnotationAccordingName(String str) {
        long Feature_getUiAnnotationAccordingName = EffectCreatorJniJNI.Feature_getUiAnnotationAccordingName(this.swigCPtr, this, str);
        if (Feature_getUiAnnotationAccordingName == 0) {
            return null;
        }
        return new UIAnnotationBase(Feature_getUiAnnotationAccordingName, true);
    }

    public UIAnnotationBase getUiAnnotationAccordingUIType(UIAnnotationUIType uIAnnotationUIType) {
        long Feature_getUiAnnotationAccordingUIType = EffectCreatorJniJNI.Feature_getUiAnnotationAccordingUIType(this.swigCPtr, this, uIAnnotationUIType.swigValue());
        if (Feature_getUiAnnotationAccordingUIType == 0) {
            return null;
        }
        return new UIAnnotationBase(Feature_getUiAnnotationAccordingUIType, true);
    }

    public EEStdUIAnnotationBaseList getUiAnnotationsAccordingUIType(UIAnnotationUIType uIAnnotationUIType) {
        return new EEStdUIAnnotationBaseList(EffectCreatorJniJNI.Feature_getUiAnnotationsAccordingUIType(this.swigCPtr, this, uIAnnotationUIType.swigValue()), true);
    }

    public void getUsedAssets(EEStdElementIdList eEStdElementIdList) {
        EffectCreatorJniJNI.Feature_getUsedAssets(this.swigCPtr, this, EEStdElementIdList.getCPtr(eEStdElementIdList), eEStdElementIdList);
    }

    public void loadCapabilityFromString(String str) {
        EffectCreatorJniJNI.Feature_loadCapabilityFromString(this.swigCPtr, this, str);
    }

    public void setAnimationPlaying(boolean z) {
        EffectCreatorJniJNI.Feature_setAnimationPlaying(this.swigCPtr, this, z);
    }

    public void setDisplayName(String str) {
        EffectCreatorJniJNI.Feature_setDisplayName__SWIG_1(this.swigCPtr, this, str);
    }

    public void setEditable(boolean z) {
        EffectCreatorJniJNI.Feature_setEditable__SWIG_1(this.swigCPtr, this, z);
    }

    public void setEventPartId(String str) {
        EffectCreatorJniJNI.Feature_setEventPartId__SWIG_1(this.swigCPtr, this, str);
    }

    public void setFeatureForeOrBackgound(Feature_ForeOrBackground feature_ForeOrBackground) {
        EffectCreatorJniJNI.Feature_setFeatureForeOrBackgound__SWIG_1(this.swigCPtr, this, feature_ForeOrBackground.swigValue());
    }

    public void setFeatureType(FeatureType featureType) {
        EffectCreatorJniJNI.Feature_setFeatureType__SWIG_1(this.swigCPtr, this, featureType.swigValue());
    }

    public void setFeatureVersion(Version version) {
        EffectCreatorJniJNI.Feature_setFeatureVersion__SWIG_1(this.swigCPtr, this, Version.getCPtr(version), version);
    }

    public void setIconPath(String str) {
        EffectCreatorJniJNI.Feature_setIconPath__SWIG_1(this.swigCPtr, this, str);
    }

    public void setInitiallyVisible(boolean z) {
        EffectCreatorJniJNI.Feature_setInitiallyVisible__SWIG_1(this.swigCPtr, this, z);
    }

    public void setResourceName(String str) {
        EffectCreatorJniJNI.Feature_setResourceName__SWIG_1(this.swigCPtr, this, str);
    }

    public void setTag(String str) {
        EffectCreatorJniJNI.Feature_setTag__SWIG_1(this.swigCPtr, this, str);
    }

    public void setVisible(boolean z) {
        EffectCreatorJniJNI.Feature_setVisible__SWIG_1(this.swigCPtr, this, z);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public void updateRootPartID(String str) {
        EffectCreatorJniJNI.Feature_updateRootPartID__SWIG_1(this.swigCPtr, this, str);
    }

    public Feature(long j, boolean z) {
        super(EffectCreatorJniJNI.Feature_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static String getRenderOrderComponentID(FeatureType featureType, boolean z) {
        return EffectCreatorJniJNI.Feature_getRenderOrderComponentID(featureType.swigValue(), z);
    }

    public static EEStdStringList getRendererComponentID(FeatureType featureType, boolean z) {
        return new EEStdStringList(EffectCreatorJniJNI.Feature_getRendererComponentID(featureType.swigValue(), z), true);
    }

    @Override // com.bytedance.ies.effectcreator.swig.Element
    public void apply(ApplyCallbackFunction applyCallbackFunction, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.Feature_apply__SWIG_0(this.swigCPtr, this, ApplyCallbackFunction.getCPtr(applyCallbackFunction), applyCallbackFunction, applyFrom.swigValue());
    }

    public Error reconstructFeature(String str, Feature_ReconstructFrom feature_ReconstructFrom) {
        return new Error(EffectCreatorJniJNI.Feature_reconstructFeature(this.swigCPtr, this, str, feature_ReconstructFrom.swigValue()), true);
    }

    public void setDisplayName(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setDisplayName__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setEditable(boolean z, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setEditable__SWIG_0(this.swigCPtr, this, z, changeFrom.swigValue());
    }

    public void setEventPartId(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setEventPartId__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setFeatureForeOrBackgound(Feature_ForeOrBackground feature_ForeOrBackground, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setFeatureForeOrBackgound__SWIG_0(this.swigCPtr, this, feature_ForeOrBackground.swigValue(), changeFrom.swigValue());
    }

    public void setFeatureType(FeatureType featureType, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setFeatureType__SWIG_0(this.swigCPtr, this, featureType.swigValue(), changeFrom.swigValue());
    }

    public void setFeatureVersion(Version version, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setFeatureVersion__SWIG_0(this.swigCPtr, this, Version.getCPtr(version), version, changeFrom.swigValue());
    }

    public void setIconPath(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setIconPath__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setInitiallyVisible(boolean z, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setInitiallyVisible__SWIG_0(this.swigCPtr, this, z, changeFrom.swigValue());
    }

    public void setPrefabPath(String str, String str2) {
        EffectCreatorJniJNI.Feature_setPrefabPath__SWIG_1(this.swigCPtr, this, str, str2);
    }

    public void setResourceName(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setResourceName__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setTag(String str, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setTag__SWIG_0(this.swigCPtr, this, str, changeFrom.swigValue());
    }

    public void setVisible(boolean z, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setVisible__SWIG_0(this.swigCPtr, this, z, changeFrom.swigValue());
    }

    public void updateRootPartID(String str, ApplyFrom applyFrom) {
        EffectCreatorJniJNI.Feature_updateRootPartID__SWIG_0(this.swigCPtr, this, str, applyFrom.swigValue());
    }

    public void replaceAndReloadPrefab(String str, boolean z, boolean z2) {
        EffectCreatorJniJNI.Feature_replaceAndReloadPrefab(this.swigCPtr, this, str, z, z2);
    }

    public void setPrefabPath(String str, String str2, ChangeFrom changeFrom) {
        EffectCreatorJniJNI.Feature_setPrefabPath__SWIG_0(this.swigCPtr, this, str, str2, changeFrom.swigValue());
    }
}
