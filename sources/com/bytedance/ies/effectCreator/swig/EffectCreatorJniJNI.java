package com.bytedance.ies.effectcreator.swig;

import com.bytedance.ies.effectcreator.swig.EEStdElementSet;
import com.bytedance.ies.effectcreator.swig.EEStdStringMap;
import com.bytedance.ies.effectcreator.swig.EEStdStringSet;
import com.bytedance.ies.effectcreator.swig.EEStdStringToStringMap;
import com.bytedance.ies.effectcreator.swig.Project;

/* loaded from: classes34.dex */
public class EffectCreatorJniJNI {
    public static final native double ActionExtraData_timeInterval_get(long j, ActionExtraData actionExtraData);

    public static final native void ActionExtraData_timeInterval_set(long j, ActionExtraData actionExtraData, double d);

    public static final native void ApplyCallbackFunction_change_ownership(ApplyCallbackFunction applyCallbackFunction, long j, boolean z);

    public static final native void ApplyCallbackFunction_director_connect(ApplyCallbackFunction applyCallbackFunction, long j, boolean z, boolean z2);

    public static final native void ApplyCallbackFunction_onApplied(long j, ApplyCallbackFunction applyCallbackFunction, long j2, Error error);

    public static final native long AssetAnimatedSequence_SWIGSmartPtrUpcast(long j);

    public static final native String AssetAnimatedSequence_className();

    public static final native long AssetAnimatedSequence_dynamicCast__SWIG_0(long j, Element element);

    public static final native String AssetAnimatedSequence_getClassName(long j, AssetAnimatedSequence assetAnimatedSequence);

    public static final native int AssetAnimatedSequence_getFPS(long j, AssetAnimatedSequence assetAnimatedSequence);

    public static final native long AssetGif_SWIGSmartPtrUpcast(long j);

    public static final native String AssetGif_className();

    public static final native long AssetGif_dynamicCast__SWIG_0(long j, Element element);

    public static final native String AssetGif_getClassName(long j, AssetGif assetGif);

    public static final native long AssetImageTexture_SWIGSmartPtrUpcast(long j);

    public static final native String AssetImageTexture_className();

    public static final native long AssetImageTexture_createFrom(long j, AssetImageTexture assetImageTexture, String str, int i, int i2, String str2);

    public static final native long AssetImageTexture_dynamicCast__SWIG_0(long j, Element element);

    public static final native String AssetImageTexture_getClassName(long j, AssetImageTexture assetImageTexture);

    public static final native int AssetImageTexture_getHeight(long j, AssetImageTexture assetImageTexture);

    public static final native String AssetImageTexture_getPNGTexMMetaPath(long j, AssetImageTexture assetImageTexture);

    public static final native int AssetImageTexture_getWidth(long j, AssetImageTexture assetImageTexture);

    public static final native void AssetImageTexture_setHeight__SWIG_0(long j, AssetImageTexture assetImageTexture, int i, int i2);

    public static final native void AssetImageTexture_setHeight__SWIG_1(long j, AssetImageTexture assetImageTexture, int i);

    public static final native void AssetImageTexture_setWidth__SWIG_0(long j, AssetImageTexture assetImageTexture, int i, int i2);

    public static final native void AssetImageTexture_setWidth__SWIG_1(long j, AssetImageTexture assetImageTexture, int i);

    public static final native long AssetManager_checkAssetCompatibilityWithAssetPackage(long j, AssetManager assetManager, String str);

    public static final native long AssetManager_checkAssetCompatibilityWithType(long j, AssetManager assetManager, int i);

    public static final native String AssetManager_className();

    public static final native long AssetManager_createAssetFromPackage(long j, AssetManager assetManager, String str);

    public static final native long AssetManager_createAsset__SWIG_0(long j, AssetManager assetManager, int i, String str);

    public static final native long AssetManager_createAsset__SWIG_1(long j, AssetManager assetManager, int i, long j2, EEStdStringList eEStdStringList);

    public static final native String AssetManager_getClassName(long j, AssetManager assetManager);

    public static final native void AssetManager_updateAssetHashToPartIDMap(long j, AssetManager assetManager);

    public static final native long AssetSourceDataFromExternalLibrary_SWIGSmartPtrUpcast(long j);

    public static final native String AssetSourceDataFromExternalLibrary_author_get(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary);

    public static final native void AssetSourceDataFromExternalLibrary_author_set(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary, String str);

    public static final native String AssetSourceDataFromExternalLibrary_className();

    public static final native String AssetSourceDataFromExternalLibrary_createFrom_get(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary);

    public static final native void AssetSourceDataFromExternalLibrary_createFrom_set(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary, String str);

    public static final native String AssetSourceDataFromExternalLibrary_creator_get(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary);

    public static final native void AssetSourceDataFromExternalLibrary_creator_set(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary, String str);

    public static final native long AssetSourceDataFromExternalLibrary_dynamicCast__SWIG_0(long j, IAssetSourceData iAssetSourceData);

    public static final native String AssetSourceDataFromExternalLibrary_generator_get(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary);

    public static final native void AssetSourceDataFromExternalLibrary_generator_set(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary, String str);

    public static final native String AssetSourceDataFromExternalLibrary_getClassName(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary);

    public static final native boolean AssetSourceDataFromExternalLibrary_isEqual(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary, long j2, IAssetSourceData iAssetSourceData);

    public static final native String AssetSourceDataFromExternalLibrary_license_get(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary);

    public static final native void AssetSourceDataFromExternalLibrary_license_set(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary, String str);

    public static final native String AssetSourceDataFromExternalLibrary_source_get(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary);

    public static final native void AssetSourceDataFromExternalLibrary_source_set(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary, String str);

    public static final native String AssetSourceDataFromExternalLibrary_title_get(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary);

    public static final native void AssetSourceDataFromExternalLibrary_title_set(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary, String str);

    public static final native long AssetSourceDataFromInternalLibrary_SWIGSmartPtrUpcast(long j);

    public static final native String AssetSourceDataFromInternalLibrary_className();

    public static final native String AssetSourceDataFromInternalLibrary_createFrom_get(long j, AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary);

    public static final native void AssetSourceDataFromInternalLibrary_createFrom_set(long j, AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary, String str);

    public static final native long AssetSourceDataFromInternalLibrary_dynamicCast__SWIG_0(long j, IAssetSourceData iAssetSourceData);

    public static final native String AssetSourceDataFromInternalLibrary_getClassName(long j, AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary);

    public static final native String AssetSourceDataFromInternalLibrary_id_get(long j, AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary);

    public static final native void AssetSourceDataFromInternalLibrary_id_set(long j, AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary, String str);

    public static final native boolean AssetSourceDataFromInternalLibrary_isEqual(long j, AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary, long j2, IAssetSourceData iAssetSourceData);

    public static final native String AssetSourceDataFromInternalLibrary_source_get(long j, AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary);

    public static final native void AssetSourceDataFromInternalLibrary_source_set(long j, AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary, String str);

    public static final native long AssetSourceDataFromUser_SWIGSmartPtrUpcast(long j);

    public static final native String AssetSourceDataFromUser_className();

    public static final native String AssetSourceDataFromUser_createFrom_get(long j, AssetSourceDataFromUser assetSourceDataFromUser);

    public static final native void AssetSourceDataFromUser_createFrom_set(long j, AssetSourceDataFromUser assetSourceDataFromUser, String str);

    public static final native long AssetSourceDataFromUser_dynamicCast__SWIG_0(long j, IAssetSourceData iAssetSourceData);

    public static final native String AssetSourceDataFromUser_getClassName(long j, AssetSourceDataFromUser assetSourceDataFromUser);

    public static final native boolean AssetSourceDataFromUser_isEqual(long j, AssetSourceDataFromUser assetSourceDataFromUser, long j2, IAssetSourceData iAssetSourceData);

    public static final native long AssetSource_data_get(long j, AssetSource assetSource);

    public static final native void AssetSource_data_set(long j, AssetSource assetSource, long j2, IAssetSourceData iAssetSourceData);

    public static final native long AssetSource_fromExternalLibrary(long j, AssetSourceDataFromExternalLibrary assetSourceDataFromExternalLibrary);

    public static final native long AssetSource_fromInternalLibrary(long j, AssetSourceDataFromInternalLibrary assetSourceDataFromInternalLibrary);

    public static final native long AssetSource_fromUser(long j, AssetSourceDataFromUser assetSourceDataFromUser);

    public static final native int AssetSource_type_get(long j, AssetSource assetSource);

    public static final native void AssetSource_type_set(long j, AssetSource assetSource, int i);

    public static final native long Asset_SWIGSmartPtrUpcast(long j);

    public static final native String Asset_className();

    public static final native long Asset_dynamicCast__SWIG_0(long j, Element element);

    public static final native String Asset_getAbsoluteAssetPath(long j, Asset asset);

    public static final native String Asset_getAbsoluteAssetSubPath(long j, Asset asset);

    public static final native String Asset_getAbsoluteCoverImgPath(long j, Asset asset);

    public static final native String Asset_getAssetCoverImgPath(long j, Asset asset);

    public static final native long Asset_getAssetEffectPaths(long j, Asset asset);

    public static final native String Asset_getAssetName(long j, Asset asset);

    public static final native String Asset_getAssetPath(long j, Asset asset);

    public static final native long Asset_getAssetSource(long j, Asset asset);

    public static final native String Asset_getAssetSubPath(long j, Asset asset);

    public static final native int Asset_getAssetType(long j, Asset asset);

    public static final native String Asset_getClassName(long j, Asset asset);

    public static final native int Asset_getFileType(long j, Asset asset);

    public static final native String Asset_loadAmgResObject(long j, Asset asset);

    public static final native void Asset_setAssetCoverImgPath__SWIG_0(long j, Asset asset, String str, int i);

    public static final native void Asset_setAssetCoverImgPath__SWIG_1(long j, Asset asset, String str);

    public static final native void Asset_setAssetEffectPaths__SWIG_0(long j, Asset asset, long j2, EEStdStringList eEStdStringList, int i);

    public static final native void Asset_setAssetEffectPaths__SWIG_1(long j, Asset asset, long j2, EEStdStringList eEStdStringList);

    public static final native void Asset_setAssetHash(long j, Asset asset, String str, int i);

    public static final native void Asset_setAssetName__SWIG_0(long j, Asset asset, String str, int i);

    public static final native void Asset_setAssetName__SWIG_1(long j, Asset asset, String str);

    public static final native void Asset_setAssetPath__SWIG_0(long j, Asset asset, String str, int i);

    public static final native void Asset_setAssetPath__SWIG_1(long j, Asset asset, String str);

    public static final native void Asset_setAssetSource__SWIG_0(long j, Asset asset, long j2, AssetSource assetSource, int i);

    public static final native void Asset_setAssetSource__SWIG_1(long j, Asset asset, long j2, AssetSource assetSource);

    public static final native void Asset_setAssetSubPath__SWIG_0(long j, Asset asset, String str, int i);

    public static final native void Asset_setAssetSubPath__SWIG_1(long j, Asset asset, String str);

    public static final native void Asset_setAssetType__SWIG_0(long j, Asset asset, int i, int i2);

    public static final native void Asset_setAssetType__SWIG_1(long j, Asset asset, int i);

    public static final native void CanvasAnimationListener_animationStatusChanged(long j, CanvasAnimationListener canvasAnimationListener, long j2, Feature feature, boolean z);

    public static final native void CanvasAnimationListener_change_ownership(CanvasAnimationListener canvasAnimationListener, long j, boolean z);

    public static final native void CanvasAnimationListener_director_connect(CanvasAnimationListener canvasAnimationListener, long j, boolean z, boolean z2);

    public static final native String Canvas_className();

    public static final native long Canvas_getAllTransform2DFeaturePtrInCanvas(long j, Canvas canvas);

    public static final native long Canvas_getCanvasSize(long j, Canvas canvas);

    public static final native String Canvas_getClassName(long j, Canvas canvas);

    public static final native long Canvas_getFeatureAndTransformPtrViaPoint(long j, Canvas canvas, long j2, EEPoint eEPoint);

    public static final native long Canvas_getFeaturePtrViaPoint(long j, Canvas canvas, long j2, EEPoint eEPoint);

    public static final native boolean Canvas_isAnimatableWithFeatureID(long j, Canvas canvas, long j2, ElementId elementId);

    public static final native boolean Canvas_isCompatibleWithFeatureID(long j, Canvas canvas, long j2, ElementId elementId);

    public static final native boolean Canvas_isCurrentCanvasHasHumanFace(long j, Canvas canvas);

    public static final native void Canvas_onInputRTChanged(long j, Canvas canvas);

    public static final native void Canvas_setAnimationListenerPtr(long j, Canvas canvas, long j2, CanvasAnimationListener canvasAnimationListener);

    public static final native void Canvas_setCanvasSize(long j, Canvas canvas, long j2, EESize eESize);

    public static final native void Canvas_setFaceStretchFacePointsInfo(long j, Canvas canvas, String str);

    public static final native void Canvas_setScaleFactor(long j, Canvas canvas, String str);

    public static final native void Canvas_startAnimationWithFeatureID__SWIG_0(long j, Canvas canvas, long j2, ElementId elementId, boolean z);

    public static final native void Canvas_startAnimationWithFeatureID__SWIG_1(long j, Canvas canvas, long j2, ElementId elementId);

    public static final native void Canvas_stopAnimation(long j, Canvas canvas);

    public static final native void Canvas_stopAnimationSync(long j, Canvas canvas);

    public static final native void Canvas_stopAnimationWithFeatureID__SWIG_0(long j, Canvas canvas, long j2, ElementId elementId, boolean z);

    public static final native void Canvas_stopAnimationWithFeatureID__SWIG_1(long j, Canvas canvas, long j2, ElementId elementId);

    public static final native void DataChangeObserver_change_ownership(DataChangeObserver dataChangeObserver, long j, boolean z);

    public static final native void DataChangeObserver_director_connect(DataChangeObserver dataChangeObserver, long j, boolean z, boolean z2);

    public static final native void DataChangeObserver_onDataChanged(long j, DataChangeObserver dataChangeObserver, long j2, DataChanges dataChanges, long j3, Error error);

    public static final native long DataChanges_added_get(long j, DataChanges dataChanges);

    public static final native void DataChanges_added_set(long j, DataChanges dataChanges, long j2, EEStdElementSet eEStdElementSet);

    public static final native void DataChanges_clear(long j, DataChanges dataChanges);

    public static final native boolean DataChanges_hasChanges(long j, DataChanges dataChanges);

    public static final native long DataChanges_modified_get(long j, DataChanges dataChanges);

    public static final native void DataChanges_modified_set(long j, DataChanges dataChanges, long j2, EEStdStringMap eEStdStringMap);

    public static final native long DataChanges_removed_get(long j, DataChanges dataChanges);

    public static final native void DataChanges_removed_set(long j, DataChanges dataChanges, long j2, EEStdElementSet eEStdElementSet);

    public static final native void DataEventReceiver_change_ownership(DataEventReceiver dataEventReceiver, long j, boolean z);

    public static final native void DataEventReceiver_director_connect(DataEventReceiver dataEventReceiver, long j, boolean z, boolean z2);

    public static final native void DataEventReceiver_onDataEventReceived(long j, DataEventReceiver dataEventReceiver, long j2, DataEvent dataEvent);

    public static final native long DataEventRequestReloadEffectResource_SWIGSmartPtrUpcast(long j);

    public static final native String DataEventRequestReloadEffectResource_className();

    public static final native long DataEventRequestReloadEffectResource_dynamicCast__SWIG_0(long j, DataEvent dataEvent);

    public static final native String DataEventRequestReloadEffectResource_getClassName(long j, DataEventRequestReloadEffectResource dataEventRequestReloadEffectResource);

    public static final native String DataEventRequestReloadEffectResource_path_get(long j, DataEventRequestReloadEffectResource dataEventRequestReloadEffectResource);

    public static final native void DataEventRequestReloadEffectResource_path_set(long j, DataEventRequestReloadEffectResource dataEventRequestReloadEffectResource, String str);

    public static final native String DataEvent_className();

    public static final native String DataEvent_getClassName(long j, DataEvent dataEvent);

    public static final native int DataEvent_type_get(long j, DataEvent dataEvent);

    public static final native void DataEvent_type_set(long j, DataEvent dataEvent, int i);

    public static final native boolean DraftUpgradeManager_checkModuleNeedUpgrade(long j, DraftUpgradeManager draftUpgradeManager, String str);

    public static final native void DraftUpgradeManager_checkUpdate(long j, DraftUpgradeManager draftUpgradeManager, String str, String str2, String str3);

    public static final native long DraftUpgradeManager_getRequiredLokInfos(long j, DraftUpgradeManager draftUpgradeManager);

    public static final native boolean DraftUpgradeManager_isNeedUpgradeAfterStickerLoad(long j, DraftUpgradeManager draftUpgradeManager);

    public static final native void DraftUpgradeManager_setFeatureOnlineRes(long j, DraftUpgradeManager draftUpgradeManager, long j2, EEStdStringList eEStdStringList);

    public static final native void DraftUpgradeManager_updateEditorBuiltinAssetVersion(long j, DraftUpgradeManager draftUpgradeManager);

    public static final native long DraftUpgradeManager_upgradeAfterStickerLoad(long j, DraftUpgradeManager draftUpgradeManager);

    public static final native long DraftUpgradeManager_upgradeBeforeStickerLoad(long j, DraftUpgradeManager draftUpgradeManager);

    public static final native long EEBoxVertex_back_bottom_left_get(long j, EEBoxVertex eEBoxVertex);

    public static final native void EEBoxVertex_back_bottom_left_set(long j, EEBoxVertex eEBoxVertex, long j2, EEPoint eEPoint);

    public static final native long EEBoxVertex_back_bottom_right_get(long j, EEBoxVertex eEBoxVertex);

    public static final native void EEBoxVertex_back_bottom_right_set(long j, EEBoxVertex eEBoxVertex, long j2, EEPoint eEPoint);

    public static final native long EEBoxVertex_back_top_left_get(long j, EEBoxVertex eEBoxVertex);

    public static final native void EEBoxVertex_back_top_left_set(long j, EEBoxVertex eEBoxVertex, long j2, EEPoint eEPoint);

    public static final native long EEBoxVertex_back_top_right_get(long j, EEBoxVertex eEBoxVertex);

    public static final native void EEBoxVertex_back_top_right_set(long j, EEBoxVertex eEBoxVertex, long j2, EEPoint eEPoint);

    public static final native long EEBoxVertex_front_bottom_left_get(long j, EEBoxVertex eEBoxVertex);

    public static final native void EEBoxVertex_front_bottom_left_set(long j, EEBoxVertex eEBoxVertex, long j2, EEPoint eEPoint);

    public static final native long EEBoxVertex_front_bottom_right_get(long j, EEBoxVertex eEBoxVertex);

    public static final native void EEBoxVertex_front_bottom_right_set(long j, EEBoxVertex eEBoxVertex, long j2, EEPoint eEPoint);

    public static final native long EEBoxVertex_front_top_left_get(long j, EEBoxVertex eEBoxVertex);

    public static final native void EEBoxVertex_front_top_left_set(long j, EEBoxVertex eEBoxVertex, long j2, EEPoint eEPoint);

    public static final native long EEBoxVertex_front_top_right_get(long j, EEBoxVertex eEBoxVertex);

    public static final native void EEBoxVertex_front_top_right_set(long j, EEBoxVertex eEBoxVertex, long j2, EEPoint eEPoint);

    public static final native long EEEffectHandle_Instance();

    public static final native void EEEffectHandle_setAMEEffectHandleGetterPtr(long j, EEEffectHandle eEEffectHandle, long j2, EffectHandleGetter effectHandleGetter);

    public static final native long EEEventSequenceList_capacity(long j, EEEventSequenceList eEEventSequenceList);

    public static final native void EEEventSequenceList_clear(long j, EEEventSequenceList eEEventSequenceList);

    public static final native void EEEventSequenceList_doAdd__SWIG_0(long j, EEEventSequenceList eEEventSequenceList, long j2, EventSequence eventSequence);

    public static final native void EEEventSequenceList_doAdd__SWIG_1(long j, EEEventSequenceList eEEventSequenceList, int i, long j2, EventSequence eventSequence);

    public static final native long EEEventSequenceList_doGet(long j, EEEventSequenceList eEEventSequenceList, int i);

    public static final native long EEEventSequenceList_doRemove(long j, EEEventSequenceList eEEventSequenceList, int i);

    public static final native void EEEventSequenceList_doRemoveRange(long j, EEEventSequenceList eEEventSequenceList, int i, int i2);

    public static final native long EEEventSequenceList_doSet(long j, EEEventSequenceList eEEventSequenceList, int i, long j2, EventSequence eventSequence);

    public static final native int EEEventSequenceList_doSize(long j, EEEventSequenceList eEEventSequenceList);

    public static final native boolean EEEventSequenceList_isEmpty(long j, EEEventSequenceList eEEventSequenceList);

    public static final native void EEEventSequenceList_reserve(long j, EEEventSequenceList eEEventSequenceList, long j2);

    public static final native long EEFloatList_capacity(long j, EEFloatList eEFloatList);

    public static final native void EEFloatList_clear(long j, EEFloatList eEFloatList);

    public static final native void EEFloatList_doAdd__SWIG_0(long j, EEFloatList eEFloatList, float f);

    public static final native void EEFloatList_doAdd__SWIG_1(long j, EEFloatList eEFloatList, int i, float f);

    public static final native float EEFloatList_doGet(long j, EEFloatList eEFloatList, int i);

    public static final native float EEFloatList_doRemove(long j, EEFloatList eEFloatList, int i);

    public static final native void EEFloatList_doRemoveRange(long j, EEFloatList eEFloatList, int i, int i2);

    public static final native float EEFloatList_doSet(long j, EEFloatList eEFloatList, int i, float f);

    public static final native int EEFloatList_doSize(long j, EEFloatList eEFloatList);

    public static final native boolean EEFloatList_isEmpty(long j, EEFloatList eEFloatList);

    public static final native void EEFloatList_reserve(long j, EEFloatList eEFloatList, long j2);

    public static final native long EEIntegerList_capacity(long j, EEIntegerList eEIntegerList);

    public static final native void EEIntegerList_clear(long j, EEIntegerList eEIntegerList);

    public static final native void EEIntegerList_doAdd__SWIG_0(long j, EEIntegerList eEIntegerList, int i);

    public static final native void EEIntegerList_doAdd__SWIG_1(long j, EEIntegerList eEIntegerList, int i, int i2);

    public static final native int EEIntegerList_doGet(long j, EEIntegerList eEIntegerList, int i);

    public static final native int EEIntegerList_doRemove(long j, EEIntegerList eEIntegerList, int i);

    public static final native void EEIntegerList_doRemoveRange(long j, EEIntegerList eEIntegerList, int i, int i2);

    public static final native int EEIntegerList_doSet(long j, EEIntegerList eEIntegerList, int i, int i2);

    public static final native int EEIntegerList_doSize(long j, EEIntegerList eEIntegerList);

    public static final native boolean EEIntegerList_isEmpty(long j, EEIntegerList eEIntegerList);

    public static final native void EEIntegerList_reserve(long j, EEIntegerList eEIntegerList, long j2);

    public static final native long EEPointList_capacity(long j, EEPointList eEPointList);

    public static final native void EEPointList_clear(long j, EEPointList eEPointList);

    public static final native void EEPointList_doAdd__SWIG_0(long j, EEPointList eEPointList, long j2, EEPoint eEPoint);

    public static final native void EEPointList_doAdd__SWIG_1(long j, EEPointList eEPointList, int i, long j2, EEPoint eEPoint);

    public static final native long EEPointList_doGet(long j, EEPointList eEPointList, int i);

    public static final native long EEPointList_doRemove(long j, EEPointList eEPointList, int i);

    public static final native void EEPointList_doRemoveRange(long j, EEPointList eEPointList, int i, int i2);

    public static final native long EEPointList_doSet(long j, EEPointList eEPointList, int i, long j2, EEPoint eEPoint);

    public static final native int EEPointList_doSize(long j, EEPointList eEPointList);

    public static final native boolean EEPointList_isEmpty(long j, EEPointList eEPointList);

    public static final native void EEPointList_reserve(long j, EEPointList eEPointList, long j2);

    public static final native double EEPoint_x_get(long j, EEPoint eEPoint);

    public static final native void EEPoint_x_set(long j, EEPoint eEPoint, double d);

    public static final native double EEPoint_y_get(long j, EEPoint eEPoint);

    public static final native void EEPoint_y_set(long j, EEPoint eEPoint, double d);

    public static final native double EEScale_x_get(long j, EEScale eEScale);

    public static final native void EEScale_x_set(long j, EEScale eEScale, double d);

    public static final native double EEScale_y_get(long j, EEScale eEScale);

    public static final native void EEScale_y_set(long j, EEScale eEScale, double d);

    public static final native double EESize_height_get(long j, EESize eESize);

    public static final native void EESize_height_set(long j, EESize eESize, double d);

    public static final native double EESize_width_get(long j, EESize eESize);

    public static final native void EESize_width_set(long j, EESize eESize, double d);

    public static final native long EEStdElementIdList_capacity(long j, EEStdElementIdList eEStdElementIdList);

    public static final native void EEStdElementIdList_clear(long j, EEStdElementIdList eEStdElementIdList);

    public static final native void EEStdElementIdList_doAdd__SWIG_0(long j, EEStdElementIdList eEStdElementIdList, long j2, ElementId elementId);

    public static final native void EEStdElementIdList_doAdd__SWIG_1(long j, EEStdElementIdList eEStdElementIdList, int i, long j2, ElementId elementId);

    public static final native long EEStdElementIdList_doGet(long j, EEStdElementIdList eEStdElementIdList, int i);

    public static final native long EEStdElementIdList_doRemove(long j, EEStdElementIdList eEStdElementIdList, int i);

    public static final native void EEStdElementIdList_doRemoveRange(long j, EEStdElementIdList eEStdElementIdList, int i, int i2);

    public static final native long EEStdElementIdList_doSet(long j, EEStdElementIdList eEStdElementIdList, int i, long j2, ElementId elementId);

    public static final native int EEStdElementIdList_doSize(long j, EEStdElementIdList eEStdElementIdList);

    public static final native boolean EEStdElementIdList_isEmpty(long j, EEStdElementIdList eEStdElementIdList);

    public static final native void EEStdElementIdList_reserve(long j, EEStdElementIdList eEStdElementIdList, long j2);

    public static final native long EEStdElementItemSharePtrList_capacity(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList);

    public static final native void EEStdElementItemSharePtrList_clear(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList);

    public static final native void EEStdElementItemSharePtrList_doAdd__SWIG_0(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList, long j2, EventItem eventItem);

    public static final native void EEStdElementItemSharePtrList_doAdd__SWIG_1(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList, int i, long j2, EventItem eventItem);

    public static final native long EEStdElementItemSharePtrList_doGet(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList, int i);

    public static final native long EEStdElementItemSharePtrList_doRemove(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList, int i);

    public static final native void EEStdElementItemSharePtrList_doRemoveRange(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList, int i, int i2);

    public static final native long EEStdElementItemSharePtrList_doSet(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList, int i, long j2, EventItem eventItem);

    public static final native int EEStdElementItemSharePtrList_doSize(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList);

    public static final native boolean EEStdElementItemSharePtrList_isEmpty(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList);

    public static final native void EEStdElementItemSharePtrList_reserve(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList, long j2);

    public static final native long EEStdElementList_capacity(long j, EEStdElementList eEStdElementList);

    public static final native void EEStdElementList_clear(long j, EEStdElementList eEStdElementList);

    public static final native void EEStdElementList_doAdd__SWIG_0(long j, EEStdElementList eEStdElementList, long j2, Element element);

    public static final native void EEStdElementList_doAdd__SWIG_1(long j, EEStdElementList eEStdElementList, int i, long j2, Element element);

    public static final native long EEStdElementList_doGet(long j, EEStdElementList eEStdElementList, int i);

    public static final native long EEStdElementList_doRemove(long j, EEStdElementList eEStdElementList, int i);

    public static final native void EEStdElementList_doRemoveRange(long j, EEStdElementList eEStdElementList, int i, int i2);

    public static final native long EEStdElementList_doSet(long j, EEStdElementList eEStdElementList, int i, long j2, Element element);

    public static final native int EEStdElementList_doSize(long j, EEStdElementList eEStdElementList);

    public static final native boolean EEStdElementList_isEmpty(long j, EEStdElementList eEStdElementList);

    public static final native void EEStdElementList_reserve(long j, EEStdElementList eEStdElementList, long j2);

    public static final native long EEStdElementSet_Iterator_derefUnchecked(long j, EEStdElementSet.Iterator iterator);

    public static final native void EEStdElementSet_Iterator_incrementUnchecked(long j, EEStdElementSet.Iterator iterator);

    public static final native boolean EEStdElementSet_Iterator_isNot(long j, EEStdElementSet.Iterator iterator, long j2, EEStdElementSet.Iterator iterator2);

    public static final native boolean EEStdElementSet_addImpl(long j, EEStdElementSet eEStdElementSet, long j2, Element element);

    public static final native long EEStdElementSet_begin(long j, EEStdElementSet eEStdElementSet);

    public static final native void EEStdElementSet_clear(long j, EEStdElementSet eEStdElementSet);

    public static final native boolean EEStdElementSet_containsImpl(long j, EEStdElementSet eEStdElementSet, long j2, Element element);

    public static final native long EEStdElementSet_end(long j, EEStdElementSet eEStdElementSet);

    public static final native boolean EEStdElementSet_hasNextImpl(long j, EEStdElementSet eEStdElementSet, long j2, EEStdElementSet.Iterator iterator);

    public static final native boolean EEStdElementSet_isEmpty(long j, EEStdElementSet eEStdElementSet);

    public static final native boolean EEStdElementSet_removeImpl(long j, EEStdElementSet eEStdElementSet, long j2, Element element);

    public static final native int EEStdElementSet_sizeImpl(long j, EEStdElementSet eEStdElementSet);

    public static final native long EEStdEventActionList_capacity(long j, EEStdEventActionList eEStdEventActionList);

    public static final native void EEStdEventActionList_clear(long j, EEStdEventActionList eEStdEventActionList);

    public static final native void EEStdEventActionList_doAdd__SWIG_0(long j, EEStdEventActionList eEStdEventActionList, long j2, EventAction eventAction);

    public static final native void EEStdEventActionList_doAdd__SWIG_1(long j, EEStdEventActionList eEStdEventActionList, int i, long j2, EventAction eventAction);

    public static final native long EEStdEventActionList_doGet(long j, EEStdEventActionList eEStdEventActionList, int i);

    public static final native long EEStdEventActionList_doRemove(long j, EEStdEventActionList eEStdEventActionList, int i);

    public static final native void EEStdEventActionList_doRemoveRange(long j, EEStdEventActionList eEStdEventActionList, int i, int i2);

    public static final native long EEStdEventActionList_doSet(long j, EEStdEventActionList eEStdEventActionList, int i, long j2, EventAction eventAction);

    public static final native int EEStdEventActionList_doSize(long j, EEStdEventActionList eEStdEventActionList);

    public static final native boolean EEStdEventActionList_isEmpty(long j, EEStdEventActionList eEStdEventActionList);

    public static final native void EEStdEventActionList_reserve(long j, EEStdEventActionList eEStdEventActionList, long j2);

    public static final native long EEStdEventCommandList_capacity(long j, EEStdEventCommandList eEStdEventCommandList);

    public static final native void EEStdEventCommandList_clear(long j, EEStdEventCommandList eEStdEventCommandList);

    public static final native void EEStdEventCommandList_doAdd__SWIG_0(long j, EEStdEventCommandList eEStdEventCommandList, long j2, EventCommand eventCommand);

    public static final native void EEStdEventCommandList_doAdd__SWIG_1(long j, EEStdEventCommandList eEStdEventCommandList, int i, long j2, EventCommand eventCommand);

    public static final native long EEStdEventCommandList_doGet(long j, EEStdEventCommandList eEStdEventCommandList, int i);

    public static final native long EEStdEventCommandList_doRemove(long j, EEStdEventCommandList eEStdEventCommandList, int i);

    public static final native void EEStdEventCommandList_doRemoveRange(long j, EEStdEventCommandList eEStdEventCommandList, int i, int i2);

    public static final native long EEStdEventCommandList_doSet(long j, EEStdEventCommandList eEStdEventCommandList, int i, long j2, EventCommand eventCommand);

    public static final native int EEStdEventCommandList_doSize(long j, EEStdEventCommandList eEStdEventCommandList);

    public static final native boolean EEStdEventCommandList_isEmpty(long j, EEStdEventCommandList eEStdEventCommandList);

    public static final native void EEStdEventCommandList_reserve(long j, EEStdEventCommandList eEStdEventCommandList, long j2);

    public static final native long EEStdEventCommandUnitList_capacity(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList);

    public static final native void EEStdEventCommandUnitList_clear(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList);

    public static final native void EEStdEventCommandUnitList_doAdd__SWIG_0(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList, long j2, EventCommandUnit eventCommandUnit);

    public static final native void EEStdEventCommandUnitList_doAdd__SWIG_1(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList, int i, long j2, EventCommandUnit eventCommandUnit);

    public static final native long EEStdEventCommandUnitList_doGet(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList, int i);

    public static final native long EEStdEventCommandUnitList_doRemove(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList, int i);

    public static final native void EEStdEventCommandUnitList_doRemoveRange(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList, int i, int i2);

    public static final native long EEStdEventCommandUnitList_doSet(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList, int i, long j2, EventCommandUnit eventCommandUnit);

    public static final native int EEStdEventCommandUnitList_doSize(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList);

    public static final native boolean EEStdEventCommandUnitList_isEmpty(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList);

    public static final native void EEStdEventCommandUnitList_reserve(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList, long j2);

    public static final native long EEStdEventObjectSharePtrList_capacity(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList);

    public static final native void EEStdEventObjectSharePtrList_clear(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList);

    public static final native void EEStdEventObjectSharePtrList_doAdd__SWIG_0(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList, long j2, EventObject eventObject);

    public static final native void EEStdEventObjectSharePtrList_doAdd__SWIG_1(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList, int i, long j2, EventObject eventObject);

    public static final native long EEStdEventObjectSharePtrList_doGet(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList, int i);

    public static final native long EEStdEventObjectSharePtrList_doRemove(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList, int i);

    public static final native void EEStdEventObjectSharePtrList_doRemoveRange(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList, int i, int i2);

    public static final native long EEStdEventObjectSharePtrList_doSet(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList, int i, long j2, EventObject eventObject);

    public static final native int EEStdEventObjectSharePtrList_doSize(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList);

    public static final native boolean EEStdEventObjectSharePtrList_isEmpty(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList);

    public static final native void EEStdEventObjectSharePtrList_reserve(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList, long j2);

    public static final native long EEStdEventTriggerList_capacity(long j, EEStdEventTriggerList eEStdEventTriggerList);

    public static final native void EEStdEventTriggerList_clear(long j, EEStdEventTriggerList eEStdEventTriggerList);

    public static final native void EEStdEventTriggerList_doAdd__SWIG_0(long j, EEStdEventTriggerList eEStdEventTriggerList, long j2, EventTrigger eventTrigger);

    public static final native void EEStdEventTriggerList_doAdd__SWIG_1(long j, EEStdEventTriggerList eEStdEventTriggerList, int i, long j2, EventTrigger eventTrigger);

    public static final native long EEStdEventTriggerList_doGet(long j, EEStdEventTriggerList eEStdEventTriggerList, int i);

    public static final native long EEStdEventTriggerList_doRemove(long j, EEStdEventTriggerList eEStdEventTriggerList, int i);

    public static final native void EEStdEventTriggerList_doRemoveRange(long j, EEStdEventTriggerList eEStdEventTriggerList, int i, int i2);

    public static final native long EEStdEventTriggerList_doSet(long j, EEStdEventTriggerList eEStdEventTriggerList, int i, long j2, EventTrigger eventTrigger);

    public static final native int EEStdEventTriggerList_doSize(long j, EEStdEventTriggerList eEStdEventTriggerList);

    public static final native boolean EEStdEventTriggerList_isEmpty(long j, EEStdEventTriggerList eEStdEventTriggerList);

    public static final native void EEStdEventTriggerList_reserve(long j, EEStdEventTriggerList eEStdEventTriggerList, long j2);

    public static final native long EEStdFeatureList_capacity(long j, EEStdFeatureList eEStdFeatureList);

    public static final native void EEStdFeatureList_clear(long j, EEStdFeatureList eEStdFeatureList);

    public static final native void EEStdFeatureList_doAdd__SWIG_0(long j, EEStdFeatureList eEStdFeatureList, long j2, Feature feature);

    public static final native void EEStdFeatureList_doAdd__SWIG_1(long j, EEStdFeatureList eEStdFeatureList, int i, long j2, Feature feature);

    public static final native long EEStdFeatureList_doGet(long j, EEStdFeatureList eEStdFeatureList, int i);

    public static final native long EEStdFeatureList_doRemove(long j, EEStdFeatureList eEStdFeatureList, int i);

    public static final native void EEStdFeatureList_doRemoveRange(long j, EEStdFeatureList eEStdFeatureList, int i, int i2);

    public static final native long EEStdFeatureList_doSet(long j, EEStdFeatureList eEStdFeatureList, int i, long j2, Feature feature);

    public static final native int EEStdFeatureList_doSize(long j, EEStdFeatureList eEStdFeatureList);

    public static final native boolean EEStdFeatureList_isEmpty(long j, EEStdFeatureList eEStdFeatureList);

    public static final native void EEStdFeatureList_reserve(long j, EEStdFeatureList eEStdFeatureList, long j2);

    public static final native long EEStdLokiInfoList_capacity(long j, EEStdLokiInfoList eEStdLokiInfoList);

    public static final native void EEStdLokiInfoList_clear(long j, EEStdLokiInfoList eEStdLokiInfoList);

    public static final native void EEStdLokiInfoList_doAdd__SWIG_0(long j, EEStdLokiInfoList eEStdLokiInfoList, long j2, LokiInfo lokiInfo);

    public static final native void EEStdLokiInfoList_doAdd__SWIG_1(long j, EEStdLokiInfoList eEStdLokiInfoList, int i, long j2, LokiInfo lokiInfo);

    public static final native long EEStdLokiInfoList_doGet(long j, EEStdLokiInfoList eEStdLokiInfoList, int i);

    public static final native long EEStdLokiInfoList_doRemove(long j, EEStdLokiInfoList eEStdLokiInfoList, int i);

    public static final native void EEStdLokiInfoList_doRemoveRange(long j, EEStdLokiInfoList eEStdLokiInfoList, int i, int i2);

    public static final native long EEStdLokiInfoList_doSet(long j, EEStdLokiInfoList eEStdLokiInfoList, int i, long j2, LokiInfo lokiInfo);

    public static final native int EEStdLokiInfoList_doSize(long j, EEStdLokiInfoList eEStdLokiInfoList);

    public static final native boolean EEStdLokiInfoList_isEmpty(long j, EEStdLokiInfoList eEStdLokiInfoList);

    public static final native void EEStdLokiInfoList_reserve(long j, EEStdLokiInfoList eEStdLokiInfoList, long j2);

    public static final native long EEStdLokiInfoPtrList_capacity(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList);

    public static final native void EEStdLokiInfoPtrList_clear(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList);

    public static final native void EEStdLokiInfoPtrList_doAdd__SWIG_0(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList, long j2, LokiInfo lokiInfo);

    public static final native void EEStdLokiInfoPtrList_doAdd__SWIG_1(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList, int i, long j2, LokiInfo lokiInfo);

    public static final native long EEStdLokiInfoPtrList_doGet(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList, int i);

    public static final native long EEStdLokiInfoPtrList_doRemove(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList, int i);

    public static final native void EEStdLokiInfoPtrList_doRemoveRange(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList, int i, int i2);

    public static final native long EEStdLokiInfoPtrList_doSet(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList, int i, long j2, LokiInfo lokiInfo);

    public static final native int EEStdLokiInfoPtrList_doSize(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList);

    public static final native boolean EEStdLokiInfoPtrList_isEmpty(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList);

    public static final native void EEStdLokiInfoPtrList_reserve(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList, long j2);

    public static final native long EEStdStringList_capacity(long j, EEStdStringList eEStdStringList);

    public static final native void EEStdStringList_clear(long j, EEStdStringList eEStdStringList);

    public static final native void EEStdStringList_doAdd__SWIG_0(long j, EEStdStringList eEStdStringList, String str);

    public static final native void EEStdStringList_doAdd__SWIG_1(long j, EEStdStringList eEStdStringList, int i, String str);

    public static final native String EEStdStringList_doGet(long j, EEStdStringList eEStdStringList, int i);

    public static final native String EEStdStringList_doRemove(long j, EEStdStringList eEStdStringList, int i);

    public static final native void EEStdStringList_doRemoveRange(long j, EEStdStringList eEStdStringList, int i, int i2);

    public static final native String EEStdStringList_doSet(long j, EEStdStringList eEStdStringList, int i, String str);

    public static final native int EEStdStringList_doSize(long j, EEStdStringList eEStdStringList);

    public static final native boolean EEStdStringList_isEmpty(long j, EEStdStringList eEStdStringList);

    public static final native void EEStdStringList_reserve(long j, EEStdStringList eEStdStringList, long j2);

    public static final native long EEStdStringMap_Iterator_getKey(long j, EEStdStringMap.Iterator iterator);

    public static final native long EEStdStringMap_Iterator_getNextUnchecked(long j, EEStdStringMap.Iterator iterator);

    public static final native long EEStdStringMap_Iterator_getValue(long j, EEStdStringMap.Iterator iterator);

    public static final native boolean EEStdStringMap_Iterator_isNot(long j, EEStdStringMap.Iterator iterator, long j2, EEStdStringMap.Iterator iterator2);

    public static final native void EEStdStringMap_Iterator_setValue(long j, EEStdStringMap.Iterator iterator, long j2, EEStdStringSet eEStdStringSet);

    public static final native long EEStdStringMap_begin(long j, EEStdStringMap eEStdStringMap);

    public static final native void EEStdStringMap_clear(long j, EEStdStringMap eEStdStringMap);

    public static final native boolean EEStdStringMap_containsImpl(long j, EEStdStringMap eEStdStringMap, long j2, Element element);

    public static final native long EEStdStringMap_end(long j, EEStdStringMap eEStdStringMap);

    public static final native long EEStdStringMap_find(long j, EEStdStringMap eEStdStringMap, long j2, Element element);

    public static final native boolean EEStdStringMap_isEmpty(long j, EEStdStringMap eEStdStringMap);

    public static final native void EEStdStringMap_putUnchecked(long j, EEStdStringMap eEStdStringMap, long j2, Element element, long j3, EEStdStringSet eEStdStringSet);

    public static final native void EEStdStringMap_removeUnchecked(long j, EEStdStringMap eEStdStringMap, long j2, EEStdStringMap.Iterator iterator);

    public static final native int EEStdStringMap_sizeImpl(long j, EEStdStringMap eEStdStringMap);

    public static final native String EEStdStringSet_Iterator_derefUnchecked(long j, EEStdStringSet.Iterator iterator);

    public static final native void EEStdStringSet_Iterator_incrementUnchecked(long j, EEStdStringSet.Iterator iterator);

    public static final native boolean EEStdStringSet_Iterator_isNot(long j, EEStdStringSet.Iterator iterator, long j2, EEStdStringSet.Iterator iterator2);

    public static final native boolean EEStdStringSet_addImpl(long j, EEStdStringSet eEStdStringSet, String str);

    public static final native long EEStdStringSet_begin(long j, EEStdStringSet eEStdStringSet);

    public static final native void EEStdStringSet_clear(long j, EEStdStringSet eEStdStringSet);

    public static final native boolean EEStdStringSet_containsImpl(long j, EEStdStringSet eEStdStringSet, String str);

    public static final native long EEStdStringSet_end(long j, EEStdStringSet eEStdStringSet);

    public static final native boolean EEStdStringSet_hasNextImpl(long j, EEStdStringSet eEStdStringSet, long j2, EEStdStringSet.Iterator iterator);

    public static final native boolean EEStdStringSet_isEmpty(long j, EEStdStringSet eEStdStringSet);

    public static final native boolean EEStdStringSet_removeImpl(long j, EEStdStringSet eEStdStringSet, String str);

    public static final native int EEStdStringSet_sizeImpl(long j, EEStdStringSet eEStdStringSet);

    public static final native String EEStdStringToStringMap_Iterator_getKey(long j, EEStdStringToStringMap.Iterator iterator);

    public static final native long EEStdStringToStringMap_Iterator_getNextUnchecked(long j, EEStdStringToStringMap.Iterator iterator);

    public static final native String EEStdStringToStringMap_Iterator_getValue(long j, EEStdStringToStringMap.Iterator iterator);

    public static final native boolean EEStdStringToStringMap_Iterator_isNot(long j, EEStdStringToStringMap.Iterator iterator, long j2, EEStdStringToStringMap.Iterator iterator2);

    public static final native void EEStdStringToStringMap_Iterator_setValue(long j, EEStdStringToStringMap.Iterator iterator, String str);

    public static final native long EEStdStringToStringMap_begin(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native void EEStdStringToStringMap_clear(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native boolean EEStdStringToStringMap_containsImpl(long j, EEStdStringToStringMap eEStdStringToStringMap, String str);

    public static final native long EEStdStringToStringMap_end(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native long EEStdStringToStringMap_find(long j, EEStdStringToStringMap eEStdStringToStringMap, String str);

    public static final native boolean EEStdStringToStringMap_isEmpty(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native void EEStdStringToStringMap_putUnchecked(long j, EEStdStringToStringMap eEStdStringToStringMap, String str, String str2);

    public static final native void EEStdStringToStringMap_removeUnchecked(long j, EEStdStringToStringMap eEStdStringToStringMap, long j2, EEStdStringToStringMap.Iterator iterator);

    public static final native int EEStdStringToStringMap_sizeImpl(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native long EEStdUIAnnotationBaseList_capacity(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList);

    public static final native void EEStdUIAnnotationBaseList_clear(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList);

    public static final native void EEStdUIAnnotationBaseList_doAdd__SWIG_0(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList, long j2, UIAnnotationBase uIAnnotationBase);

    public static final native void EEStdUIAnnotationBaseList_doAdd__SWIG_1(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList, int i, long j2, UIAnnotationBase uIAnnotationBase);

    public static final native long EEStdUIAnnotationBaseList_doGet(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList, int i);

    public static final native long EEStdUIAnnotationBaseList_doRemove(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList, int i);

    public static final native void EEStdUIAnnotationBaseList_doRemoveRange(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList, int i, int i2);

    public static final native long EEStdUIAnnotationBaseList_doSet(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList, int i, long j2, UIAnnotationBase uIAnnotationBase);

    public static final native int EEStdUIAnnotationBaseList_doSize(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList);

    public static final native boolean EEStdUIAnnotationBaseList_isEmpty(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList);

    public static final native void EEStdUIAnnotationBaseList_reserve(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList, long j2);

    public static final native long EEUIAnnotationSharePtrList_capacity(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList);

    public static final native void EEUIAnnotationSharePtrList_clear(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList);

    public static final native void EEUIAnnotationSharePtrList_doAdd__SWIG_0(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList, long j2, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native void EEUIAnnotationSharePtrList_doAdd__SWIG_1(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList, int i, long j2, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native long EEUIAnnotationSharePtrList_doGet(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList, int i);

    public static final native long EEUIAnnotationSharePtrList_doRemove(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList, int i);

    public static final native void EEUIAnnotationSharePtrList_doRemoveRange(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList, int i, int i2);

    public static final native long EEUIAnnotationSharePtrList_doSet(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList, int i, long j2, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native int EEUIAnnotationSharePtrList_doSize(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList);

    public static final native boolean EEUIAnnotationSharePtrList_isEmpty(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList);

    public static final native void EEUIAnnotationSharePtrList_reserve(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList, long j2);

    public static final native double EEVec3f_x_get(long j, EEVec3f eEVec3f);

    public static final native void EEVec3f_x_set(long j, EEVec3f eEVec3f, double d);

    public static final native double EEVec3f_y_get(long j, EEVec3f eEVec3f);

    public static final native void EEVec3f_y_set(long j, EEVec3f eEVec3f, double d);

    public static final native double EEVec3f_z_get(long j, EEVec3f eEVec3f);

    public static final native void EEVec3f_z_set(long j, EEVec3f eEVec3f, double d);

    public static final native double EEVec4f_w_get(long j, EEVec4f eEVec4f);

    public static final native void EEVec4f_w_set(long j, EEVec4f eEVec4f, double d);

    public static final native double EEVec4f_x_get(long j, EEVec4f eEVec4f);

    public static final native void EEVec4f_x_set(long j, EEVec4f eEVec4f, double d);

    public static final native double EEVec4f_y_get(long j, EEVec4f eEVec4f);

    public static final native void EEVec4f_y_set(long j, EEVec4f eEVec4f, double d);

    public static final native double EEVec4f_z_get(long j, EEVec4f eEVec4f);

    public static final native void EEVec4f_z_set(long j, EEVec4f eEVec4f, double d);

    public static final native boolean EffectCapabilitiesJson_getValueAsBoolInAMEExtraCreation(long j, EffectCapabilitiesJson effectCapabilitiesJson, String str);

    public static final native double EffectCapabilitiesJson_getValueAsDoubleInAMEExtraCreation(long j, EffectCapabilitiesJson effectCapabilitiesJson, String str);

    public static final native int EffectCapabilitiesJson_getValueAsIntInAMEExtraCreation(long j, EffectCapabilitiesJson effectCapabilitiesJson, String str);

    public static final native String EffectCapabilitiesJson_getValueAsStringInAMEExtraCreation(long j, EffectCapabilitiesJson effectCapabilitiesJson, String str);

    public static final native boolean EffectCapabilitiesJson_isKeyExistInAMEExtraCreation(long j, EffectCapabilitiesJson effectCapabilitiesJson, String str);

    public static final native long EffectCapabilitiesJson_load(long j, EffectCapabilitiesJson effectCapabilitiesJson);

    public static final native void EffectCapabilitiesJson_removeKeyInAMEExtraCreation(long j, EffectCapabilitiesJson effectCapabilitiesJson, String str);

    public static final native void EffectCapabilitiesJson_setValueInAMEExtraCreation__SWIG_0(long j, EffectCapabilitiesJson effectCapabilitiesJson, String str, int i);

    public static final native void EffectCapabilitiesJson_setValueInAMEExtraCreation__SWIG_1(long j, EffectCapabilitiesJson effectCapabilitiesJson, String str, double d);

    public static final native void EffectCapabilitiesJson_setValueInAMEExtraCreation__SWIG_2(long j, EffectCapabilitiesJson effectCapabilitiesJson, String str, boolean z);

    public static final native void EffectCapabilitiesJson_setValueInAMEExtraCreation__SWIG_3(long j, EffectCapabilitiesJson effectCapabilitiesJson, String str, String str2);

    public static final native void EffectHandleGetter_change_ownership(EffectHandleGetter effectHandleGetter, long j, boolean z);

    public static final native void EffectHandleGetter_director_connect(EffectHandleGetter effectHandleGetter, long j, boolean z, boolean z2);

    public static final native long EffectHandleGetter_getEffectHandle(long j, EffectHandleGetter effectHandleGetter);

    public static final native void EffectMessageCenter_dispatchEffectMessage(long j, int i, int i2, String str);

    public static final native void EffectMessageObserver_change_ownership(EffectMessageObserver effectMessageObserver, long j, boolean z);

    public static final native void EffectMessageObserver_director_connect(EffectMessageObserver effectMessageObserver, long j, boolean z, boolean z2);

    public static final native void EffectMessageObserver_onEffectMessageReceived(long j, EffectMessageObserver effectMessageObserver, long j2, int i, int i2, String str);

    public static final native boolean EffectSubmissionDataJson_getValueAsBool(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str);

    public static final native double EffectSubmissionDataJson_getValueAsDouble(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str);

    public static final native int EffectSubmissionDataJson_getValueAsInt(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str);

    public static final native String EffectSubmissionDataJson_getValueAsString(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str);

    public static final native long EffectSubmissionDataJson_getValueAsStringMap(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str);

    public static final native long EffectSubmissionDataJson_getValueAsStringVector(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str);

    public static final native boolean EffectSubmissionDataJson_isKeyExist(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str);

    public static final native void EffectSubmissionDataJson_removeKey(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str);

    public static final native void EffectSubmissionDataJson_setValue__SWIG_0(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str, int i);

    public static final native void EffectSubmissionDataJson_setValue__SWIG_1(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str, double d);

    public static final native void EffectSubmissionDataJson_setValue__SWIG_2(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str, boolean z);

    public static final native void EffectSubmissionDataJson_setValue__SWIG_3(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str, String str2);

    public static final native void EffectSubmissionDataJson_setValue__SWIG_4(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str, long j2, EEStdStringList eEStdStringList);

    public static final native void EffectSubmissionDataJson_setValue__SWIG_5(long j, EffectSubmissionDataJson effectSubmissionDataJson, String str, long j2, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native long ElementId_Invalid();

    public static final native String ElementId_descriptionString(long j, ElementId elementId);

    public static final native boolean ElementId_isSameElement(long j, ElementId elementId, long j2, ElementId elementId2);

    public static final native boolean ElementId_isValid(long j, ElementId elementId);

    public static final native boolean ElementId_looseEquality(long j, ElementId elementId, long j2, ElementId elementId2);

    public static final native boolean ElementId_looseInequality(long j, ElementId elementId, long j2, ElementId elementId2);

    public static final native long ElementId_objectId(long j, ElementId elementId);

    public static final native String ElementId_toString(long j, ElementId elementId);

    public static final native void Element_apply__SWIG_0(long j, Element element, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void Element_apply__SWIG_1(long j, Element element, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native String Element_className();

    public static final native long Element_deepClone(long j, Element element);

    public static final native String Element_getCapabilityTokenString(long j, Element element);

    public static final native String Element_getClassName(long j, Element element);

    public static final native long Element_getDependencyElements__SWIG_0(long j, Element element, String str, boolean z);

    public static final native long Element_getDependencyElements__SWIG_1(long j, Element element, String str);

    public static final native long Element_getDependencyElements__SWIG_2(long j, Element element);

    public static final native String Element_getExtraInfo(long j, Element element, String str);

    public static final native void Element_getUsedAlgorithm(long j, Element element, long j2, EEStdStringList eEStdStringList);

    public static final native long Element_id(long j, Element element);

    public static final native boolean Element_isCapabilityTrackingDataSameWithoutPath(long j, Element element, long j2, Element element2);

    public static final native boolean Element_isKeyExist(long j, Element element, String str);

    public static final native void Element_setExtraInfo(long j, Element element, String str, String str2);

    public static final native boolean Error_isSuccess(long j, Error error);

    public static final native void Error_log(long j, Error error);

    public static final native long Error_makeSuccess();

    public static final native long Error_make__SWIG_0(int i, String str, boolean z);

    public static final native long Error_make__SWIG_1(int i, String str);

    public static final native long Error_make__SWIG_2(int i);

    public static final native String Error_message_get(long j, Error error);

    public static final native void Error_message_set(long j, Error error, String str);

    public static final native int Error_type_get(long j, Error error);

    public static final native void Error_type_set(long j, Error error, int i);

    public static final native long EventAction_SWIGSmartPtrUpcast(long j);

    public static final native String EventAction_className();

    public static final native long EventAction_dynamicCast__SWIG_0(long j, Element element);

    public static final native String EventAction_getAnimation(long j, EventAction eventAction);

    public static final native String EventAction_getClassName(long j, EventAction eventAction);

    public static final native long EventAction_getExtraData(long j, EventAction eventAction);

    public static final native double EventAction_getExtraDataTimeInterval(long j, EventAction eventAction);

    public static final native int EventAction_getExtraDataType(long j, EventAction eventAction);

    public static final native String EventAction_getKey(long j, EventAction eventAction);

    public static final native int EventAction_getPlayMode(long j, EventAction eventAction);

    public static final native int EventAction_getType(long j, EventAction eventAction);

    public static final native void EventAction_setAnimation__SWIG_0(long j, EventAction eventAction, String str, int i);

    public static final native void EventAction_setAnimation__SWIG_1(long j, EventAction eventAction, String str);

    public static final native long EventAction_setExtraDataTimeInterval(long j, EventAction eventAction, double d);

    public static final native void EventAction_setExtraData__SWIG_0(long j, EventAction eventAction, long j2, ActionExtraData actionExtraData, int i);

    public static final native void EventAction_setExtraData__SWIG_1(long j, EventAction eventAction, long j2, ActionExtraData actionExtraData);

    public static final native long EventAction_setKey(long j, EventAction eventAction, String str);

    public static final native void EventAction_setPlayMode__SWIG_0(long j, EventAction eventAction, int i, int i2);

    public static final native void EventAction_setPlayMode__SWIG_1(long j, EventAction eventAction, int i);

    public static final native void EventAction_setType__SWIG_0(long j, EventAction eventAction, int i, int i2);

    public static final native void EventAction_setType__SWIG_1(long j, EventAction eventAction, int i);

    public static final native int EventAction_typeOfAction(String str);

    public static final native long EventCommandUnit_SWIGSmartPtrUpcast(long j);

    public static final native long EventCommandUnit_actionKeyShowList(long j, EventCommandUnit eventCommandUnit);

    public static final native boolean EventCommandUnit_actionSupportDetect(long j, EventCommandUnit eventCommandUnit);

    public static final native long EventCommandUnit_appearActionConflictDetect(long j, EventCommandUnit eventCommandUnit);

    public static final native String EventCommandUnit_className();

    public static final native long EventCommandUnit_create(long j, Project project);

    public static final native long EventCommandUnit_dynamicCast__SWIG_0(long j, Element element);

    public static final native void EventCommandUnit_exchangeFeature(long j, EventCommandUnit eventCommandUnit, long j2, Feature feature, long j3, Feature feature2);

    public static final native long EventCommandUnit_getActionList(long j, EventCommandUnit eventCommandUnit);

    public static final native long EventCommandUnit_getAction__SWIG_0(long j, EventCommandUnit eventCommandUnit, int i);

    public static final native long EventCommandUnit_getAction__SWIG_1(long j, EventCommandUnit eventCommandUnit);

    public static final native long EventCommandUnit_getActionsVector(long j, EventCommandUnit eventCommandUnit);

    public static final native String EventCommandUnit_getClassName(long j, EventCommandUnit eventCommandUnit);

    public static final native long EventCommandUnit_getFeatureGroupId(long j, EventCommandUnit eventCommandUnit);

    public static final native long EventCommandUnit_getFeatureId(long j, EventCommandUnit eventCommandUnit);

    public static final native long EventCommandUnit_getFeatures(long j, EventCommandUnit eventCommandUnit);

    public static final native void EventCommandUnit_removeFeature(long j, EventCommandUnit eventCommandUnit, long j2, ElementId elementId);

    public static final native void EventCommandUnit_setFeatureGroupId__SWIG_0(long j, EventCommandUnit eventCommandUnit, long j2, ElementId elementId, int i);

    public static final native void EventCommandUnit_setFeatureGroupId__SWIG_1(long j, EventCommandUnit eventCommandUnit, long j2, ElementId elementId);

    public static final native void EventCommandUnit_setFeatureId__SWIG_0(long j, EventCommandUnit eventCommandUnit, long j2, ElementId elementId, int i);

    public static final native void EventCommandUnit_setFeatureId__SWIG_1(long j, EventCommandUnit eventCommandUnit, long j2, ElementId elementId);

    public static final native long EventCommandUnit_setFeatures(long j, EventCommandUnit eventCommandUnit, long j2, EEStdFeatureList eEStdFeatureList);

    public static final native long EventCommand_SWIGSmartPtrUpcast(long j);

    public static final native long EventCommand_appearActionConflictDetect(long j, EventCommand eventCommand);

    public static final native String EventCommand_className();

    public static final native long EventCommand_create(long j, Project project);

    public static final native long EventCommand_createCommandUnit(long j, EventCommand eventCommand);

    public static final native long EventCommand_dynamicCast__SWIG_0(long j, Element element);

    public static final native void EventCommand_exchangeFeature(long j, EventCommand eventCommand, long j2, Feature feature, long j3, Feature feature2);

    public static final native String EventCommand_getClassName(long j, EventCommand eventCommand);

    public static final native long EventCommand_getCommandUnitList(long j, EventCommand eventCommand);

    public static final native long EventCommand_getCommandUnit__SWIG_0(long j, EventCommand eventCommand, int i);

    public static final native long EventCommand_getCommandUnit__SWIG_1(long j, EventCommand eventCommand);

    public static final native long EventCommand_getCommandUnitsVector(long j, EventCommand eventCommand);

    public static final native long EventCommand_getTriggerList(long j, EventCommand eventCommand);

    public static final native int EventCommand_getTriggerMode(long j, EventCommand eventCommand);

    public static final native long EventCommand_getTrigger__SWIG_0(long j, EventCommand eventCommand, int i);

    public static final native long EventCommand_getTrigger__SWIG_1(long j, EventCommand eventCommand);

    public static final native long EventCommand_getTriggersVector(long j, EventCommand eventCommand);

    public static final native void EventCommand_getUsedAlgorithm(long j, EventCommand eventCommand, long j2, EEStdStringList eEStdStringList);

    public static final native long EventCommand_insertCommandUnit(long j, EventCommand eventCommand, long j2, EventCommandUnit eventCommandUnit, long j3, EventCommandUnit eventCommandUnit2);

    public static final native long EventCommand_insertCommandUnitToBottom(long j, EventCommand eventCommand, long j2, EventCommandUnit eventCommandUnit);

    public static final native long EventCommand_moveCommandUnit(long j, EventCommand eventCommand, long j2, EventCommandUnit eventCommandUnit, long j3, EventCommandUnit eventCommandUnit2);

    public static final native long EventCommand_removeCommandUnit(long j, EventCommand eventCommand, long j2, EventCommandUnit eventCommandUnit);

    public static final native void EventCommand_removeFeature(long j, EventCommand eventCommand, long j2, ElementId elementId);

    public static final native void EventCommand_setTriggerMode__SWIG_0(long j, EventCommand eventCommand, int i, int i2);

    public static final native void EventCommand_setTriggerMode__SWIG_1(long j, EventCommand eventCommand, int i);

    public static final native long EventItem_SWIGSmartPtrUpcast(long j);

    public static final native String EventItem_className();

    public static final native long EventItem_dynamicCast__SWIG_0(long j, Element element);

    public static final native String EventItem_getClassName(long j, EventItem eventItem);

    public static final native boolean EventItem_isEdited(long j, EventItem eventItem);

    public static final native void EventManagerV2_apply(long j, EventManagerV2 eventManagerV2);

    public static final native long EventManagerV2_createCommand(long j, EventManagerV2 eventManagerV2);

    public static final native long EventManagerV2_exchangeFeature(long j, EventManagerV2 eventManagerV2, long j2, Feature feature, long j3, Feature feature2);

    public static final native long EventManagerV2_getCommandList(long j, EventManagerV2 eventManagerV2);

    public static final native void EventManagerV2_getUsedAlgorithm(long j, EventManagerV2 eventManagerV2, long j2, EEStdStringList eEStdStringList);

    public static final native long EventManagerV2_init(long j, EventManagerV2 eventManagerV2);

    public static final native long EventManagerV2_insertCommand(long j, EventManagerV2 eventManagerV2, long j2, EventCommand eventCommand, long j3, EventCommand eventCommand2);

    public static final native long EventManagerV2_insertCommandToBottom(long j, EventManagerV2 eventManagerV2, long j2, EventCommand eventCommand);

    public static final native long EventManagerV2_moveCommand(long j, EventManagerV2 eventManagerV2, long j2, EventCommand eventCommand, long j3, EventCommand eventCommand2);

    public static final native long EventManagerV2_removeCommand(long j, EventManagerV2 eventManagerV2, long j2, EventCommand eventCommand);

    public static final native long EventManagerV2_removeItemAndDereferenceTrigger(long j, EventManagerV2 eventManagerV2, long j2, ElementId elementId);

    public static final native long EventManager_afterLoad(long j, EventManager eventManager);

    public static final native long EventObject_SWIGSmartPtrUpcast(long j);

    public static final native String EventObject_className();

    public static final native long EventObject_create(long j, Project project);

    public static final native long EventObject_dynamicCast__SWIG_0(long j, Element element);

    public static final native String EventObject_getAnimation__SWIG_0(long j, EventObject eventObject, int i);

    public static final native String EventObject_getAnimation__SWIG_1(long j, EventObject eventObject);

    public static final native String EventObject_getClassName(long j, EventObject eventObject);

    public static final native long EventObject_getEndEventNode(long j, EventObject eventObject);

    public static final native long EventObject_getEndEventNodeId(long j, EventObject eventObject);

    public static final native String EventObject_getEndTrigger__SWIG_0(long j, EventObject eventObject, int i);

    public static final native String EventObject_getEndTrigger__SWIG_1(long j, EventObject eventObject);

    public static final native long EventObject_getFeatureId(long j, EventObject eventObject);

    public static final native long EventObject_getParentSequenceId(long j, EventObject eventObject);

    public static final native long EventObject_getStartEventNode(long j, EventObject eventObject);

    public static final native long EventObject_getStartEventNodeId(long j, EventObject eventObject);

    public static final native String EventObject_getStartTrigger__SWIG_0(long j, EventObject eventObject, int i);

    public static final native String EventObject_getStartTrigger__SWIG_1(long j, EventObject eventObject);

    public static final native boolean EventObject_isEdited(long j, EventObject eventObject);

    public static final native void EventObject_setEndEventNodeId__SWIG_0(long j, EventObject eventObject, long j2, ElementId elementId, int i);

    public static final native void EventObject_setEndEventNodeId__SWIG_1(long j, EventObject eventObject, long j2, ElementId elementId);

    public static final native void EventObject_setFeatureId__SWIG_0(long j, EventObject eventObject, long j2, ElementId elementId, int i);

    public static final native void EventObject_setFeatureId__SWIG_1(long j, EventObject eventObject, long j2, ElementId elementId);

    public static final native void EventObject_setParentSequenceId__SWIG_0(long j, EventObject eventObject, long j2, ElementId elementId, int i);

    public static final native void EventObject_setParentSequenceId__SWIG_1(long j, EventObject eventObject, long j2, ElementId elementId);

    public static final native void EventObject_setStartEventNodeId__SWIG_0(long j, EventObject eventObject, long j2, ElementId elementId, int i);

    public static final native void EventObject_setStartEventNodeId__SWIG_1(long j, EventObject eventObject, long j2, ElementId elementId);

    public static final native long EventSequence_SWIGSmartPtrUpcast(long j);

    public static final native String EventSequence_className();

    public static final native long EventSequence_create__SWIG_0(long j, Project project, int i);

    public static final native long EventSequence_create__SWIG_1(long j, Project project);

    public static final native long EventSequence_dynamicCast__SWIG_0(long j, Element element);

    public static final native String EventSequence_getClassName(long j, EventSequence eventSequence);

    public static final native long EventSequence_getObjectVector(long j, EventSequence eventSequence);

    public static final native int EventSequence_getSequenceMode(long j, EventSequence eventSequence);

    public static final native String EventSequence_getSequenceName(long j, EventSequence eventSequence);

    public static final native long EventSequence_getStopTriggerId(long j, EventSequence eventSequence);

    public static final native long EventSequence_getSwitchTriggerId(long j, EventSequence eventSequence);

    public static final native boolean EventSequence_isEdited(long j, EventSequence eventSequence);

    public static final native void EventSequence_setSequenceMode__SWIG_0(long j, EventSequence eventSequence, int i, int i2);

    public static final native void EventSequence_setSequenceMode__SWIG_1(long j, EventSequence eventSequence, int i);

    public static final native void EventSequence_setSequenceName__SWIG_0(long j, EventSequence eventSequence, String str, int i);

    public static final native void EventSequence_setSequenceName__SWIG_1(long j, EventSequence eventSequence, String str);

    public static final native void EventSequence_setStopTriggerId__SWIG_0(long j, EventSequence eventSequence, long j2, ElementId elementId, int i);

    public static final native void EventSequence_setStopTriggerId__SWIG_1(long j, EventSequence eventSequence, long j2, ElementId elementId);

    public static final native void EventSequence_setSwitchTriggerId__SWIG_0(long j, EventSequence eventSequence, long j2, ElementId elementId, int i);

    public static final native void EventSequence_setSwitchTriggerId__SWIG_1(long j, EventSequence eventSequence, long j2, ElementId elementId);

    public static final native long EventStandardNode_SWIGSmartPtrUpcast(long j);

    public static final native String EventStandardNode_className();

    public static final native long EventStandardNode_create(long j, Project project);

    public static final native long EventStandardNode_dynamicCast__SWIG_0(long j, Element element);

    public static final native int EventStandardNode_getActionMode(long j, EventStandardNode eventStandardNode);

    public static final native String EventStandardNode_getAction__SWIG_0(long j, EventStandardNode eventStandardNode, int i);

    public static final native String EventStandardNode_getAction__SWIG_1(long j, EventStandardNode eventStandardNode);

    public static final native long EventStandardNode_getActionsVector(long j, EventStandardNode eventStandardNode);

    public static final native String EventStandardNode_getClassName(long j, EventStandardNode eventStandardNode);

    public static final native int EventStandardNode_getTriggerMode(long j, EventStandardNode eventStandardNode);

    public static final native String EventStandardNode_getTrigger__SWIG_0(long j, EventStandardNode eventStandardNode, int i);

    public static final native String EventStandardNode_getTrigger__SWIG_1(long j, EventStandardNode eventStandardNode);

    public static final native long EventStandardNode_getTriggersVector(long j, EventStandardNode eventStandardNode);

    public static final native void EventStandardNode_setActionMode__SWIG_0(long j, EventStandardNode eventStandardNode, int i, int i2);

    public static final native void EventStandardNode_setActionMode__SWIG_1(long j, EventStandardNode eventStandardNode, int i);

    public static final native void EventStandardNode_setTriggerMode__SWIG_0(long j, EventStandardNode eventStandardNode, int i, int i2);

    public static final native void EventStandardNode_setTriggerMode__SWIG_1(long j, EventStandardNode eventStandardNode, int i);

    public static final native long EventTrigger_SWIGSmartPtrUpcast(long j);

    public static final native String EventTrigger_className();

    public static final native long EventTrigger_dynamicCast__SWIG_0(long j, Element element);

    public static final native String EventTrigger_getAction(long j, EventTrigger eventTrigger);

    public static final native String EventTrigger_getClassName(long j, EventTrigger eventTrigger);

    public static final native long EventTrigger_getExtraData(long j, EventTrigger eventTrigger);

    public static final native double EventTrigger_getExtraDataDelayTime(long j, EventTrigger eventTrigger);

    public static final native double EventTrigger_getExtraDataFPS(long j, EventTrigger eventTrigger);

    public static final native long EventTrigger_getExtraDataFeature(long j, EventTrigger eventTrigger);

    public static final native int EventTrigger_getExtraDataType(long j, EventTrigger eventTrigger);

    public static final native String EventTrigger_getKey(long j, EventTrigger eventTrigger);

    public static final native int EventTrigger_getType(long j, EventTrigger eventTrigger);

    public static final native void EventTrigger_getUsedAlgorithm(long j, EventTrigger eventTrigger, long j2, EEStdStringList eEStdStringList);

    public static final native void EventTrigger_setAction__SWIG_0(long j, EventTrigger eventTrigger, String str, int i);

    public static final native void EventTrigger_setAction__SWIG_1(long j, EventTrigger eventTrigger, String str);

    public static final native long EventTrigger_setExtraDataDelayTime(long j, EventTrigger eventTrigger, double d);

    public static final native long EventTrigger_setExtraDataFPS(long j, EventTrigger eventTrigger, double d);

    public static final native long EventTrigger_setExtraDataFeature(long j, EventTrigger eventTrigger, long j2, Feature feature);

    public static final native void EventTrigger_setExtraData__SWIG_0(long j, EventTrigger eventTrigger, long j2, TriggerExtraData triggerExtraData, int i);

    public static final native void EventTrigger_setExtraData__SWIG_1(long j, EventTrigger eventTrigger, long j2, TriggerExtraData triggerExtraData);

    public static final native long EventTrigger_setKey(long j, EventTrigger eventTrigger, String str);

    public static final native void EventTrigger_setTypeAndAction(long j, EventTrigger eventTrigger, int i, String str);

    public static final native void EventTrigger_setType__SWIG_0(long j, EventTrigger eventTrigger, int i, int i2);

    public static final native void EventTrigger_setType__SWIG_1(long j, EventTrigger eventTrigger, int i);

    public static final native int EventTrigger_typeOfAction(String str);

    public static final native long Event_SWIGSmartPtrUpcast(long j);

    public static final native int Event_actionTypeFromString(String str);

    public static final native int Event_animationPlayModeFromString(String str);

    public static final native String Event_className();

    public static final native long Event_dynamicCast__SWIG_0(long j, Element element);

    public static final native int Event_eventModeFromString(String str);

    public static final native String Event_getClassName(long j, Event event);

    public static final native int Event_sequenceModeFromString(String str);

    public static final native String Event_stringFromActionType(int i);

    public static final native String Event_stringFromAnimationPlayMode(int i);

    public static final native String Event_stringFromEventMode(int i);

    public static final native String Event_stringFromSequenceMode(int i);

    public static final native String Event_stringFromTriggerMode(int i);

    public static final native String Event_stringFromTriggerType(int i);

    public static final native int Event_triggerModeFromString(String str);

    public static final native int Event_triggerTypeFromString(String str);

    public static final native long FeatureAndTransform_featrure_get(long j, FeatureAndTransform featureAndTransform);

    public static final native void FeatureAndTransform_featrure_set(long j, FeatureAndTransform featureAndTransform, long j2, Feature feature);

    public static final native long FeatureAndTransform_transform_get(long j, FeatureAndTransform featureAndTransform);

    public static final native void FeatureAndTransform_transform_set(long j, FeatureAndTransform featureAndTransform, long j2, UIAnnotationBase uIAnnotationBase);

    public static final native void FeatureManager_apply__SWIG_0(long j, FeatureManager featureManager, int i);

    public static final native void FeatureManager_apply__SWIG_1(long j, FeatureManager featureManager);

    public static final native long FeatureManager_askForAvailablePositionsToMoveFeatures(long j, FeatureManager featureManager, long j2, EEStdFeatureList eEStdFeatureList, int i);

    public static final native long FeatureManager_canCreateFeature(long j, FeatureManager featureManager, String str);

    public static final native long FeatureManager_copyFeature(long j, FeatureManager featureManager, long j2, Feature feature);

    public static final native long FeatureManager_copyFeatureAndObject(long j, FeatureManager featureManager, long j2, Feature feature);

    public static final native long FeatureManager_createFeatureAndObject__SWIG_0(long j, FeatureManager featureManager, String str, String str2, String str3, int i);

    public static final native long FeatureManager_createFeatureAndObject__SWIG_1(long j, FeatureManager featureManager, String str, String str2, String str3);

    public static final native long FeatureManager_createFeatureAndObject__SWIG_2(long j, FeatureManager featureManager, String str, String str2);

    public static final native long FeatureManager_createFeatureAndObject__SWIG_3(long j, FeatureManager featureManager, String str);

    public static final native long FeatureManager_createFeature__SWIG_0(long j, FeatureManager featureManager, String str, String str2, String str3, int i);

    public static final native long FeatureManager_createFeature__SWIG_1(long j, FeatureManager featureManager, String str, String str2, String str3);

    public static final native long FeatureManager_createFeature__SWIG_2(long j, FeatureManager featureManager, String str, String str2);

    public static final native long FeatureManager_createFeature__SWIG_3(long j, FeatureManager featureManager, String str);

    public static final native int FeatureManager_getFeatureOrder(long j, FeatureManager featureManager, long j2, Feature feature);

    public static final native long FeatureManager_getFeatures(long j, FeatureManager featureManager);

    public static final native long FeatureManager_hideAllFeatureExcept(long j, FeatureManager featureManager, long j2, EEStdFeatureList eEStdFeatureList);

    public static final native void FeatureManager_initForEmptyProject(long j, FeatureManager featureManager);

    public static final native long FeatureManager_lockAllFeatureExcept(long j, FeatureManager featureManager, long j2, EEStdFeatureList eEStdFeatureList);

    public static final native long FeatureManager_moveFeatures(long j, FeatureManager featureManager, long j2, EEStdFeatureList eEStdFeatureList, int i);

    public static final native int FeatureManager_recommendOrderForCreate(long j, FeatureManager featureManager, int i);

    public static final native long FeatureManager_recordFeatureEditableStates(long j, FeatureManager featureManager);

    public static final native long FeatureManager_recordFeatureVisibleStates(long j, FeatureManager featureManager);

    public static final native long FeatureManager_recoverFeatureEditableStates__SWIG_0(long j, FeatureManager featureManager, boolean z);

    public static final native long FeatureManager_recoverFeatureEditableStates__SWIG_1(long j, FeatureManager featureManager);

    public static final native long FeatureManager_recoverFeatureVisibleStates__SWIG_0(long j, FeatureManager featureManager, boolean z);

    public static final native long FeatureManager_recoverFeatureVisibleStates__SWIG_1(long j, FeatureManager featureManager);

    public static final native void FeatureManager_refreshWholeList(long j, FeatureManager featureManager);

    public static final native long FeatureManager_removeFeature(long j, FeatureManager featureManager, long j2, Feature feature);

    public static final native long FeatureManager_removeFeatureAndObject(long j, FeatureManager featureManager, long j2, Feature feature);

    public static final native long Feature_SWIGSmartPtrUpcast(long j);

    public static final native boolean Feature_applyVisibility(long j, Feature feature);

    public static final native void Feature_apply__SWIG_0(long j, Feature feature, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void Feature_apply__SWIG_1(long j, Feature feature, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native String Feature_className();

    public static final native void Feature_clearParameterMap(long j, Feature feature);

    public static final native long Feature_createFrom(long j, Feature feature, String str);

    public static final native long Feature_dynamicCast__SWIG_0(long j, Element element);

    public static final native String Feature_featureForeOrBackgroundEnum2Str(int i);

    public static final native int Feature_featureForeOrBackgroundStr2Enum(String str);

    public static final native String Feature_featureTypeEnum2Str(int i);

    public static final native int Feature_featureTypeStr2Enum(String str);

    public static final native int Feature_get2DStickerAnchorType(long j, Feature feature);

    public static final native boolean Feature_getAnimationPlaying(long j, Feature feature);

    public static final native String Feature_getAssetCategory(long j, Feature feature);

    public static final native String Feature_getClassName(long j, Feature feature);

    public static final native String Feature_getDisplayName(long j, Feature feature);

    public static final native boolean Feature_getEditable(long j, Feature feature);

    public static final native String Feature_getEventPartId(long j, Feature feature);

    public static final native int Feature_getFeatureForeOrBackgound(long j, Feature feature);

    public static final native int Feature_getFeatureType(long j, Feature feature);

    public static final native int Feature_getFeatureTypeFromPrefab(String str);

    public static final native long Feature_getFeatureVersion(long j, Feature feature);

    public static final native String Feature_getFullPartID(long j, Feature feature);

    public static final native String Feature_getIconPath(long j, Feature feature);

    public static final native boolean Feature_getInitiallyVisible(long j, Feature feature);

    public static final native String Feature_getLokiPanelKey(long j, Feature feature);

    public static final native long Feature_getMappableUiAnnotations(long j, Feature feature);

    public static final native long Feature_getModelCategoryKeys(long j, Feature feature);

    public static final native String Feature_getPrefabPath__SWIG_0(long j, Feature feature, boolean z);

    public static final native String Feature_getPrefabPath__SWIG_1(long j, Feature feature);

    public static final native String Feature_getRenderOrderComponentID(int i, boolean z);

    public static final native long Feature_getRendererComponentID(int i, boolean z);

    public static final native int Feature_getRendererSize(long j, Feature feature);

    public static final native String Feature_getResourceName(long j, Feature feature);

    public static final native String Feature_getSecondPanelType(long j, Feature feature);

    public static final native String Feature_getTag(long j, Feature feature);

    public static final native int Feature_getType(long j, Feature feature);

    public static final native long Feature_getUiAnnotationAccordingName(long j, Feature feature, String str);

    public static final native long Feature_getUiAnnotationAccordingUIType(long j, Feature feature, int i);

    public static final native long Feature_getUiAnnotationVector(long j, Feature feature);

    public static final native long Feature_getUiAnnotations(long j, Feature feature);

    public static final native long Feature_getUiAnnotationsAccordingUIType(long j, Feature feature, int i);

    public static final native void Feature_getUsedAssets(long j, Feature feature, long j2, EEStdElementIdList eEStdElementIdList);

    public static final native boolean Feature_getVisible(long j, Feature feature);

    public static final native boolean Feature_isFeatureWithoutEffect(long j, Feature feature);

    public static final native void Feature_loadCapabilityFromString(long j, Feature feature, String str);

    public static final native long Feature_reconstructFeature(long j, Feature feature, String str, int i);

    public static final native void Feature_recordFeature(long j, Feature feature);

    public static final native void Feature_recoverRecordedFeature(long j, Feature feature);

    public static final native void Feature_replaceAndReloadPrefab(long j, Feature feature, String str, boolean z, boolean z2);

    public static final native void Feature_reverseForeOrBackground(long j, Feature feature);

    public static final native void Feature_setAnimationPlaying(long j, Feature feature, boolean z);

    public static final native void Feature_setDisplayName__SWIG_0(long j, Feature feature, String str, int i);

    public static final native void Feature_setDisplayName__SWIG_1(long j, Feature feature, String str);

    public static final native void Feature_setEditable__SWIG_0(long j, Feature feature, boolean z, int i);

    public static final native void Feature_setEditable__SWIG_1(long j, Feature feature, boolean z);

    public static final native void Feature_setEventPartId__SWIG_0(long j, Feature feature, String str, int i);

    public static final native void Feature_setEventPartId__SWIG_1(long j, Feature feature, String str);

    public static final native void Feature_setFeatureForeOrBackgound__SWIG_0(long j, Feature feature, int i, int i2);

    public static final native void Feature_setFeatureForeOrBackgound__SWIG_1(long j, Feature feature, int i);

    public static final native void Feature_setFeatureType__SWIG_0(long j, Feature feature, int i, int i2);

    public static final native void Feature_setFeatureType__SWIG_1(long j, Feature feature, int i);

    public static final native void Feature_setFeatureVersion__SWIG_0(long j, Feature feature, long j2, Version version, int i);

    public static final native void Feature_setFeatureVersion__SWIG_1(long j, Feature feature, long j2, Version version);

    public static final native void Feature_setIconPath__SWIG_0(long j, Feature feature, String str, int i);

    public static final native void Feature_setIconPath__SWIG_1(long j, Feature feature, String str);

    public static final native void Feature_setInitiallyVisible__SWIG_0(long j, Feature feature, boolean z, int i);

    public static final native void Feature_setInitiallyVisible__SWIG_1(long j, Feature feature, boolean z);

    public static final native void Feature_setPrefabPath__SWIG_0(long j, Feature feature, String str, String str2, int i);

    public static final native void Feature_setPrefabPath__SWIG_1(long j, Feature feature, String str, String str2);

    public static final native void Feature_setResourceName__SWIG_0(long j, Feature feature, String str, int i);

    public static final native void Feature_setResourceName__SWIG_1(long j, Feature feature, String str);

    public static final native void Feature_setTag__SWIG_0(long j, Feature feature, String str, int i);

    public static final native void Feature_setTag__SWIG_1(long j, Feature feature, String str);

    public static final native void Feature_setVisible__SWIG_0(long j, Feature feature, boolean z, int i);

    public static final native void Feature_setVisible__SWIG_1(long j, Feature feature, boolean z);

    public static final native void Feature_updateRootPartID__SWIG_0(long j, Feature feature, String str, int i);

    public static final native void Feature_updateRootPartID__SWIG_1(long j, Feature feature, String str);

    public static final native void Feature_willBeSelected(long j, Feature feature);

    public static final native String IAssetSourceData_className();

    public static final native String IAssetSourceData_getClassName(long j, IAssetSourceData iAssetSourceData);

    public static final native boolean IAssetSourceData_isEqual(long j, IAssetSourceData iAssetSourceData, long j2, IAssetSourceData iAssetSourceData2);

    public static final native long LegacyFeature_SWIGSmartPtrUpcast(long j);

    public static final native boolean LegacyFeature_applyVisibility(long j, LegacyFeature legacyFeature);

    public static final native String LegacyFeature_className();

    public static final native long LegacyFeature_dynamicCast__SWIG_0(long j, Element element);

    public static final native String LegacyFeature_getClassName(long j, LegacyFeature legacyFeature);

    public static final native String LegacyFeature_getFullPartID(long j, LegacyFeature legacyFeature);

    public static final native String LokiInfo_category_get(long j, LokiInfo lokiInfo);

    public static final native void LokiInfo_category_set(long j, LokiInfo lokiInfo, String str);

    public static final native String LokiInfo_identify_get(long j, LokiInfo lokiInfo);

    public static final native void LokiInfo_identify_set(long j, LokiInfo lokiInfo, String str);

    public static final native boolean LokiInfo_needDownload_get(long j, LokiInfo lokiInfo);

    public static final native void LokiInfo_needDownload_set(long j, LokiInfo lokiInfo, boolean z);

    public static final native String LokiInfo_panelName_get(long j, LokiInfo lokiInfo);

    public static final native void LokiInfo_panelName_set(long j, LokiInfo lokiInfo, String str);

    public static final native long Model_SWIGSmartPtrUpcast(long j);

    public static final native void Model_apply__SWIG_0(long j, Model model, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void Model_apply__SWIG_1(long j, Model model, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native long Model_assetManager(long j, Model model);

    public static final native String Model_className();

    public static final native long Model_dynamicCast__SWIG_0(long j, Element element);

    public static final native long Model_eventManager(long j, Model model);

    public static final native long Model_eventManagerV2(long j, Model model);

    public static final native long Model_featureManager(long j, Model model);

    public static final native long Model_getAssetVector(long j, Model model);

    public static final native String Model_getClassName(long j, Model model);

    public static final native long Model_getEventCommandVector(long j, Model model);

    public static final native long Model_getEventItemVector(long j, Model model);

    public static final native long Model_getFeatureVector(long j, Model model);

    public static final native void Model_initForEmptyProject(long j, Model model);

    public static final native int Project_ProjectLoadSettings_eCreateFrom_get(long j, Project.ProjectLoadSettings projectLoadSettings);

    public static final native void Project_ProjectLoadSettings_eCreateFrom_set(long j, Project.ProjectLoadSettings projectLoadSettings, int i);

    public static final native String Project_ProjectLoadSettings_sOnlineMainDraftPath_get(long j, Project.ProjectLoadSettings projectLoadSettings);

    public static final native void Project_ProjectLoadSettings_sOnlineMainDraftPath_set(long j, Project.ProjectLoadSettings projectLoadSettings, String str);

    public static final native void Project_addDataChangeObserver(long j, Project project, long j2, DataChangeObserver dataChangeObserver);

    public static final native void Project_addDataEventReceiver(long j, Project project, long j2, DataEventReceiver dataEventReceiver);

    public static final native void Project_addEffectMessageObserver(long j, Project project, long j2, EffectMessageObserver effectMessageObserver);

    public static final native String Project_askForEffectSticker(long j, Project project, int i, boolean z);

    public static final native boolean Project_canRedo(long j, Project project);

    public static final native boolean Project_canUndo(long j, Project project);

    public static final native String Project_className();

    public static final native long Project_commit__SWIG_0(long j, Project project, String str);

    public static final native long Project_commit__SWIG_1(long j, Project project);

    public static final native long Project_create__SWIG_0(String str, String str2, String str3, int i, long j, Error error, String str4);

    public static final native long Project_create__SWIG_1(String str, String str2, String str3, int i, long j, Error error);

    public static final native long Project_exportEffect(long j, Project project, String str, int i);

    public static final native void Project_fireDataEvent(long j, Project project, long j2, DataEvent dataEvent);

    public static final native long Project_getAMERuntimeVersion(long j, Project project);

    public static final native long Project_getAccumulatedDataChanges(long j, Project project);

    public static final native long Project_getArtifactVersion(long j, Project project);

    public static final native String Project_getBuiltinAssetEffectPath(long j, Project project);

    public static final native String Project_getBuiltinAssetPath(long j, Project project);

    public static final native long Project_getBuiltinAssetVersion(long j, Project project);

    public static final native long Project_getCanvasPtr(long j, Project project);

    public static final native String Project_getClassName(long j, Project project);

    public static final native int Project_getCreatedFrom(long j, Project project);

    public static final native long Project_getDraftVersion(long j, Project project);

    public static final native long Project_getEffectCapabilitiesJsonPtr(long j, Project project);

    public static final native String Project_getEffectPath(long j, Project project, int i);

    public static final native long Project_getEffectSDKVersion(long j, Project project);

    public static final native long Project_getEffectSubmissionDataPtr(long j, Project project);

    public static final native long Project_getElement(long j, Project project, long j2, ElementId elementId);

    public static final native int Project_getProjectState(long j, Project project);

    public static final native String Project_getUUID(long j, Project project);

    public static final native long Project_getUnstagedDataChanges(long j, Project project);

    public static final native long Project_getWorkingModel(long j, Project project);

    public static final native String Project_getWorkingPath(long j, Project project);

    public static final native void Project_init(long j, Project project);

    public static final native long Project_isDraftNeedUpgrade(long j, Project project);

    public static final native boolean Project_isUseJSScript(long j, Project project);

    public static final native long Project_load(long j, Project project, String str, long j2, Project.ProjectLoadSettings projectLoadSettings);

    public static final native long Project_notifyRecordEnd(long j, Project project);

    public static final native long Project_notifyRecordStart(long j, Project project);

    public static final native void Project_recordAdded(long j, Project project, long j2, Element element);

    public static final native void Project_recordModified(long j, Project project, long j2, Element element, String str);

    public static final native void Project_recordRemoved(long j, Project project, long j2, Element element);

    public static final native long Project_redo(long j, Project project);

    public static final native void Project_removeDataChangeObserver(long j, Project project, long j2, DataChangeObserver dataChangeObserver);

    public static final native void Project_removeDataEventReceiver(long j, Project project, long j2, DataEventReceiver dataEventReceiver);

    public static final native void Project_removeEffectMessageObserver(long j, Project project, long j2, EffectMessageObserver effectMessageObserver);

    public static final native long Project_save__SWIG_0(long j, Project project, String str, boolean z);

    public static final native long Project_save__SWIG_1(long j, Project project, String str);

    public static final native void Project_setBuiltinAssetPath(long j, Project project, String str);

    public static final native void Project_setProjectState(long j, Project project, int i);

    public static final native void Project_setUseSensorOrientationForAlgorithm(long j, Project project, boolean z);

    public static final native long Project_undo(long j, Project project);

    public static final native void Project_unload(long j, Project project);

    public static final native long Project_upgradeDraft(long j, Project project, long j2, EEStdStringList eEStdStringList);

    public static final native double TriggerExtraData_delayTime_get(long j, TriggerExtraData triggerExtraData);

    public static final native void TriggerExtraData_delayTime_set(long j, TriggerExtraData triggerExtraData, double d);

    public static final native double TriggerExtraData_fps_get(long j, TriggerExtraData triggerExtraData);

    public static final native void TriggerExtraData_fps_set(long j, TriggerExtraData triggerExtraData, double d);

    public static final native long TriggerExtraData_objectId_get(long j, TriggerExtraData triggerExtraData);

    public static final native void TriggerExtraData_objectId_set(long j, TriggerExtraData triggerExtraData, long j2, ElementId elementId);

    public static final native long TriggerExtraData_sequenceId_get(long j, TriggerExtraData triggerExtraData);

    public static final native void TriggerExtraData_sequenceId_set(long j, TriggerExtraData triggerExtraData, long j2, ElementId elementId);

    public static final native long UIAnnotationAnchorAlignment_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationAnchorAlignment_className();

    public static final native long UIAnnotationAnchorAlignment_dynamicCast__SWIG_0(long j, Element element);

    public static final native int UIAnnotationAnchorAlignment_getAnchorType(long j, UIAnnotationAnchorAlignment uIAnnotationAnchorAlignment);

    public static final native String UIAnnotationAnchorAlignment_getClassName(long j, UIAnnotationAnchorAlignment uIAnnotationAnchorAlignment);

    public static final native String UIAnnotationAnchorAlignment_stringFromType(int i);

    public static final native int UIAnnotationAnchorAlignment_typeFromString(String str);

    public static final native long UIAnnotationAssetTextureUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationAssetTextureUIMore_className();

    public static final native long UIAnnotationAssetTextureUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native String UIAnnotationAssetTextureUIMore_getClassName(long j, UIAnnotationAssetTextureUIMore uIAnnotationAssetTextureUIMore);

    public static final native int UIAnnotationAssetTextureUIMore_getMaxHeight(long j, UIAnnotationAssetTextureUIMore uIAnnotationAssetTextureUIMore);

    public static final native int UIAnnotationAssetTextureUIMore_getMaxWidth(long j, UIAnnotationAssetTextureUIMore uIAnnotationAssetTextureUIMore);

    public static final native long UIAnnotationAssetTextureUIMore_getSuffixes(long j, UIAnnotationAssetTextureUIMore uIAnnotationAssetTextureUIMore);

    public static final native int UIAnnotationAssetTextureUIMore_getUIType(long j, UIAnnotationAssetTextureUIMore uIAnnotationAssetTextureUIMore);

    public static final native void UIAnnotationAssetTextureUIMore_setMaxHeight(long j, UIAnnotationAssetTextureUIMore uIAnnotationAssetTextureUIMore, int i);

    public static final native void UIAnnotationAssetTextureUIMore_setMaxWidth(long j, UIAnnotationAssetTextureUIMore uIAnnotationAssetTextureUIMore, int i);

    public static final native void UIAnnotationAssetTextureUIMore_setSuffixes(long j, UIAnnotationAssetTextureUIMore uIAnnotationAssetTextureUIMore, long j2, EEStdStringList eEStdStringList);

    public static final native long UIAnnotationAssetTexture_SWIGSmartPtrUpcast(long j);

    public static final native void UIAnnotationAssetTexture_apply__SWIG_0(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void UIAnnotationAssetTexture_apply__SWIG_1(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native String UIAnnotationAssetTexture_className();

    public static final native long UIAnnotationAssetTexture_dynamicCast__SWIG_0(long j, Element element);

    public static final native String UIAnnotationAssetTexture_getAssetPath(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture);

    public static final native long UIAnnotationAssetTexture_getAssetTexture(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture);

    public static final native String UIAnnotationAssetTexture_getClassName(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture);

    public static final native long UIAnnotationAssetTexture_getCurrentValueId(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture);

    public static final native void UIAnnotationAssetTexture_initClass();

    public static final native void UIAnnotationAssetTexture_setCurrentValueId__SWIG_0(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture, long j2, ElementId elementId, int i);

    public static final native void UIAnnotationAssetTexture_setCurrentValueId__SWIG_1(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture, long j2, ElementId elementId);

    public static final native void UIAnnotationAssetTexture_updateValue__SWIG_0(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture, long j2, ElementId elementId, int i);

    public static final native void UIAnnotationAssetTexture_updateValue__SWIG_1(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture, long j2, ElementId elementId);

    public static final native void UIAnnotationAssetTexture_updateValue__SWIG_2(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture, String str, int i);

    public static final native void UIAnnotationAssetTexture_updateValue__SWIG_3(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture, String str);

    public static final native void UIAnnotationAssetTexture_updateValue__SWIG_4(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture, long j2, EEStdStringList eEStdStringList, int i);

    public static final native void UIAnnotationAssetTexture_updateValue__SWIG_5(long j, UIAnnotationAssetTexture uIAnnotationAssetTexture, long j2, EEStdStringList eEStdStringList);

    public static final native long UIAnnotationBase_SWIGSmartPtrUpcast(long j);

    public static final native void UIAnnotationBase_apply__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void UIAnnotationBase_apply__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native String UIAnnotationBase_className();

    public static final native long UIAnnotationBase_dynamicCast__SWIG_0(long j, Element element);

    public static final native String UIAnnotationBase_getCallbackMoreMethod(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationBase_getCallbackMoreProperty(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationBase_getClassName(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationBase_getFeatureFullPartId(long j, UIAnnotationBase uIAnnotationBase);

    public static final native long UIAnnotationBase_getMultiCallbackMoreMethod(long j, UIAnnotationBase uIAnnotationBase);

    public static final native long UIAnnotationBase_getMultiCallbackMoreProperty(long j, UIAnnotationBase uIAnnotationBase);

    public static final native long UIAnnotationBase_getMultiSuffixPartId(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationBase_getName(long j, UIAnnotationBase uIAnnotationBase);

    public static final native long UIAnnotationBase_getOwnerId(long j, UIAnnotationBase uIAnnotationBase);

    public static final native String UIAnnotationBase_getSuffixPartId(long j, UIAnnotationBase uIAnnotationBase);

    public static final native void UIAnnotationBase_getUIAnnotationMultiPartId(long j, UIAnnotationBase uIAnnotationBase, long j2, EEStdStringList eEStdStringList);

    public static final native long UIAnnotationBase_getUIMore(long j, UIAnnotationBase uIAnnotationBase);

    public static final native int UIAnnotationBase_getUIType(long j, UIAnnotationBase uIAnnotationBase);

    public static final native void UIAnnotationBase_setCallbackMoreMethod__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, String str, int i);

    public static final native void UIAnnotationBase_setCallbackMoreMethod__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, String str);

    public static final native void UIAnnotationBase_setCallbackMoreProperty__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, String str, int i);

    public static final native void UIAnnotationBase_setCallbackMoreProperty__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, String str);

    public static final native void UIAnnotationBase_setMultiCallbackMoreMethod__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, long j2, EEStdStringList eEStdStringList, int i);

    public static final native void UIAnnotationBase_setMultiCallbackMoreMethod__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, long j2, EEStdStringList eEStdStringList);

    public static final native void UIAnnotationBase_setMultiCallbackMoreProperty__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, long j2, EEStdStringList eEStdStringList, int i);

    public static final native void UIAnnotationBase_setMultiCallbackMoreProperty__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, long j2, EEStdStringList eEStdStringList);

    public static final native void UIAnnotationBase_setMultiSuffixPartId__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, long j2, EEStdStringList eEStdStringList, int i);

    public static final native void UIAnnotationBase_setMultiSuffixPartId__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, long j2, EEStdStringList eEStdStringList);

    public static final native void UIAnnotationBase_setName__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, String str, int i);

    public static final native void UIAnnotationBase_setName__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, String str);

    public static final native void UIAnnotationBase_setOwnerId__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, long j2, ElementId elementId, int i);

    public static final native void UIAnnotationBase_setOwnerId__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, long j2, ElementId elementId);

    public static final native void UIAnnotationBase_setSuffixPartId__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, String str, int i);

    public static final native void UIAnnotationBase_setSuffixPartId__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, String str);

    public static final native void UIAnnotationBase_setUIType__SWIG_0(long j, UIAnnotationBase uIAnnotationBase, int i, int i2);

    public static final native void UIAnnotationBase_setUIType__SWIG_1(long j, UIAnnotationBase uIAnnotationBase, int i);

    public static final native long UIAnnotationBoolUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationBoolUIMore_className();

    public static final native long UIAnnotationBoolUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native String UIAnnotationBoolUIMore_getClassName(long j, UIAnnotationBoolUIMore uIAnnotationBoolUIMore);

    public static final native int UIAnnotationBoolUIMore_getUIType(long j, UIAnnotationBoolUIMore uIAnnotationBoolUIMore);

    public static final native long UIAnnotationBool_SWIGSmartPtrUpcast(long j);

    public static final native void UIAnnotationBool_apply__SWIG_0(long j, UIAnnotationBool uIAnnotationBool, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void UIAnnotationBool_apply__SWIG_1(long j, UIAnnotationBool uIAnnotationBool, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native String UIAnnotationBool_className();

    public static final native long UIAnnotationBool_dynamicCast__SWIG_0(long j, Element element);

    public static final native String UIAnnotationBool_getClassName(long j, UIAnnotationBool uIAnnotationBool);

    public static final native boolean UIAnnotationBool_getCurrentValue(long j, UIAnnotationBool uIAnnotationBool);

    public static final native boolean UIAnnotationBool_getCurrentValueSync(long j, UIAnnotationBool uIAnnotationBool);

    public static final native void UIAnnotationBool_setCurrentValue__SWIG_0(long j, UIAnnotationBool uIAnnotationBool, boolean z, int i);

    public static final native void UIAnnotationBool_setCurrentValue__SWIG_1(long j, UIAnnotationBool uIAnnotationBool, boolean z);

    public static final native void UIAnnotationBool_updateValue__SWIG_0(long j, UIAnnotationBool uIAnnotationBool, boolean z, int i);

    public static final native void UIAnnotationBool_updateValue__SWIG_1(long j, UIAnnotationBool uIAnnotationBool, boolean z);

    public static final native void UIAnnotationCompletion_change_ownership(UIAnnotationCompletion uIAnnotationCompletion, long j, boolean z);

    public static final native void UIAnnotationCompletion_director_connect(UIAnnotationCompletion uIAnnotationCompletion, long j, boolean z, boolean z2);

    public static final native void UIAnnotationCompletion_onError(long j, UIAnnotationCompletion uIAnnotationCompletion, long j2, Error error);

    public static final native void UIAnnotationCompletion_onSuccess(long j, UIAnnotationCompletion uIAnnotationCompletion);

    public static final native long UIAnnotationFacePointsUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationFacePointsUIMore_className();

    public static final native long UIAnnotationFacePointsUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native String UIAnnotationFacePointsUIMore_getClassName(long j, UIAnnotationFacePointsUIMore uIAnnotationFacePointsUIMore);

    public static final native int UIAnnotationFacePointsUIMore_getUIType(long j, UIAnnotationFacePointsUIMore uIAnnotationFacePointsUIMore);

    public static final native long UIAnnotationFacePoints_SWIGSmartPtrUpcast(long j);

    public static final native void UIAnnotationFacePoints_apply__SWIG_0(long j, UIAnnotationFacePoints uIAnnotationFacePoints, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void UIAnnotationFacePoints_apply__SWIG_1(long j, UIAnnotationFacePoints uIAnnotationFacePoints, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native String UIAnnotationFacePoints_className();

    public static final native long UIAnnotationFacePoints_dynamicCast__SWIG_0(long j, Element element);

    public static final native String UIAnnotationFacePoints_getClassName(long j, UIAnnotationFacePoints uIAnnotationFacePoints);

    public static final native long UIAnnotationFacePoints_getCurrentValue(long j, UIAnnotationFacePoints uIAnnotationFacePoints);

    public static final native long UIAnnotationFacePoints_getFacePoints(long j, UIAnnotationFacePoints uIAnnotationFacePoints);

    public static final native void UIAnnotationFacePoints_reset(long j, UIAnnotationFacePoints uIAnnotationFacePoints);

    public static final native void UIAnnotationFacePoints_setCurrentValue__SWIG_0(long j, UIAnnotationFacePoints uIAnnotationFacePoints, long j2, EEFloatList eEFloatList, int i);

    public static final native void UIAnnotationFacePoints_setCurrentValue__SWIG_1(long j, UIAnnotationFacePoints uIAnnotationFacePoints, long j2, EEFloatList eEFloatList);

    public static final native void UIAnnotationFacePoints_symmetrization(long j, UIAnnotationFacePoints uIAnnotationFacePoints);

    public static final native void UIAnnotationFacePoints_updateValue__SWIG_0(long j, UIAnnotationFacePoints uIAnnotationFacePoints, int i, long j2, EEPoint eEPoint, boolean z, int i2);

    public static final native void UIAnnotationFacePoints_updateValue__SWIG_1(long j, UIAnnotationFacePoints uIAnnotationFacePoints, int i, long j2, EEPoint eEPoint, boolean z);

    public static final native void UIAnnotationFacePoints_updateValue__SWIG_2(long j, UIAnnotationFacePoints uIAnnotationFacePoints, long j2, EEPointList eEPointList, int i);

    public static final native void UIAnnotationFacePoints_updateValue__SWIG_3(long j, UIAnnotationFacePoints uIAnnotationFacePoints, long j2, EEPointList eEPointList);

    public static final native long UIAnnotationFloatUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationFloatUIMore_className();

    public static final native long UIAnnotationFloatUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native String UIAnnotationFloatUIMore_getClassName(long j, UIAnnotationFloatUIMore uIAnnotationFloatUIMore);

    public static final native int UIAnnotationFloatUIMore_getNumberDisplayMode(long j, UIAnnotationFloatUIMore uIAnnotationFloatUIMore);

    public static final native int UIAnnotationFloatUIMore_getUIType(long j, UIAnnotationFloatUIMore uIAnnotationFloatUIMore);

    public static final native long UIAnnotationFloat_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationFloat_className();

    public static final native long UIAnnotationFloat_dynamicCast__SWIG_0(long j, Element element);

    public static final native String UIAnnotationFloat_getClassName(long j, UIAnnotationFloat uIAnnotationFloat);

    public static final native float UIAnnotationFloat_getCurrentValue(long j, UIAnnotationFloat uIAnnotationFloat);

    public static final native float UIAnnotationFloat_getCurrentValueSync(long j, UIAnnotationFloat uIAnnotationFloat);

    public static final native float UIAnnotationFloat_getMaxValue(long j, UIAnnotationFloat uIAnnotationFloat);

    public static final native float UIAnnotationFloat_getMinValue(long j, UIAnnotationFloat uIAnnotationFloat);

    public static final native int UIAnnotationFloat_getNumberDisplayMode(long j, UIAnnotationFloat uIAnnotationFloat);

    public static final native void UIAnnotationFloat_setCurrentValue__SWIG_0(long j, UIAnnotationFloat uIAnnotationFloat, float f, int i);

    public static final native void UIAnnotationFloat_setCurrentValue__SWIG_1(long j, UIAnnotationFloat uIAnnotationFloat, float f);

    public static final native void UIAnnotationFloat_setMaxValue__SWIG_0(long j, UIAnnotationFloat uIAnnotationFloat, float f, int i);

    public static final native void UIAnnotationFloat_setMaxValue__SWIG_1(long j, UIAnnotationFloat uIAnnotationFloat, float f);

    public static final native void UIAnnotationFloat_setMinValue__SWIG_0(long j, UIAnnotationFloat uIAnnotationFloat, float f, int i);

    public static final native void UIAnnotationFloat_setMinValue__SWIG_1(long j, UIAnnotationFloat uIAnnotationFloat, float f);

    public static final native void UIAnnotationFloat_updateValue__SWIG_0(long j, UIAnnotationFloat uIAnnotationFloat, float f, int i);

    public static final native void UIAnnotationFloat_updateValue__SWIG_1(long j, UIAnnotationFloat uIAnnotationFloat, float f);

    public static final native long UIAnnotationPulseUIMore_SWIGSmartPtrUpcast(long j);

    public static final native String UIAnnotationPulseUIMore_className();

    public static final native long UIAnnotationPulseUIMore_dynamicCast__SWIG_0(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native String UIAnnotationPulseUIMore_getClassName(long j, UIAnnotationPulseUIMore uIAnnotationPulseUIMore);

    public static final native int UIAnnotationPulseUIMore_getUIType(long j, UIAnnotationPulseUIMore uIAnnotationPulseUIMore);

    public static final native long UIAnnotationPulse_SWIGSmartPtrUpcast(long j);

    public static final native void UIAnnotationPulse_apply__SWIG_0(long j, UIAnnotationPulse uIAnnotationPulse, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void UIAnnotationPulse_apply__SWIG_1(long j, UIAnnotationPulse uIAnnotationPulse, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native String UIAnnotationPulse_className();

    public static final native long UIAnnotationPulse_dynamicCast__SWIG_0(long j, Element element);

    public static final native String UIAnnotationPulse_getClassName(long j, UIAnnotationPulse uIAnnotationPulse);

    public static final native String UIAnnotationPulse_getCurrentValue(long j, UIAnnotationPulse uIAnnotationPulse);

    public static final native String UIAnnotationPulse_getCurrentValueSync(long j, UIAnnotationPulse uIAnnotationPulse);

    public static final native void UIAnnotationPulse_setCurrentValue__SWIG_0(long j, UIAnnotationPulse uIAnnotationPulse, String str, int i);

    public static final native void UIAnnotationPulse_setCurrentValue__SWIG_1(long j, UIAnnotationPulse uIAnnotationPulse, String str);

    public static final native void UIAnnotationPulse_updateValue__SWIG_0(long j, UIAnnotationPulse uIAnnotationPulse, String str, int i);

    public static final native void UIAnnotationPulse_updateValue__SWIG_1(long j, UIAnnotationPulse uIAnnotationPulse, String str);

    public static final native long UIAnnotationScriptTransform2D_SWIGSmartPtrUpcast(long j);

    public static final native void UIAnnotationScriptTransform2D_apply__SWIG_0(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void UIAnnotationScriptTransform2D_apply__SWIG_1(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native String UIAnnotationScriptTransform2D_className();

    public static final native long UIAnnotationScriptTransform2D_dynamicCast__SWIG_0(long j, Element element);

    public static final native String UIAnnotationScriptTransform2D_getClassName(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D);

    public static final native long UIAnnotationScriptTransform2D_getCurrentValue(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D);

    public static final native long UIAnnotationScriptTransform2D_getNormalizationTransform2DUIDataPtr(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D);

    public static final native long UIAnnotationScriptTransform2D_getScale(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D);

    public static final native boolean UIAnnotationScriptTransform2D_isContainPoint(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EEPoint eEPoint);

    public static final native void UIAnnotationScriptTransform2D_onCanvasInputRTChanged(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D);

    public static final native void UIAnnotationScriptTransform2D_setCurrentValue__SWIG_0(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, UIAnnotationTransform2DData uIAnnotationTransform2DData, int i);

    public static final native void UIAnnotationScriptTransform2D_setCurrentValue__SWIG_1(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native void UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_0(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EEPoint eEPoint, int i);

    public static final native void UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_1(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EEPoint eEPoint);

    public static final native void UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_2(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EEScale eEScale, int i);

    public static final native void UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_3(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EEScale eEScale);

    public static final native void UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_4(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, double d, int i);

    public static final native void UIAnnotationScriptTransform2D_updateDeltaValue__SWIG_5(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, double d);

    public static final native void UIAnnotationScriptTransform2D_updateOffsetAfterClone(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EEPoint eEPoint);

    public static final native long UIAnnotationScriptTransform2D_updateValueFromAMG(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D);

    public static final native void UIAnnotationScriptTransform2D_updateValue__SWIG_0(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EEPoint eEPoint, int i);

    public static final native void UIAnnotationScriptTransform2D_updateValue__SWIG_1(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EEPoint eEPoint);

    public static final native void UIAnnotationScriptTransform2D_updateValue__SWIG_2(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EESize eESize, int i);

    public static final native void UIAnnotationScriptTransform2D_updateValue__SWIG_3(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EESize eESize);

    public static final native void UIAnnotationScriptTransform2D_updateValue__SWIG_4(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, double d, int i);

    public static final native void UIAnnotationScriptTransform2D_updateValue__SWIG_5(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, double d);

    public static final native void UIAnnotationScriptTransform2D_updateValue__SWIG_6(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EEPoint eEPoint, long j3, EESize eESize, double d, int i);

    public static final native void UIAnnotationScriptTransform2D_updateValue__SWIG_7(long j, UIAnnotationScriptTransform2D uIAnnotationScriptTransform2D, long j2, EEPoint eEPoint, long j3, EESize eESize, double d);

    public static final native String UIAnnotationTransform2DData_className();

    public static final native long UIAnnotationTransform2DData_getCenter(long j, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native String UIAnnotationTransform2DData_getClassName(long j, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native double UIAnnotationTransform2DData_getRotationAngle(long j, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native long UIAnnotationTransform2DData_getSize(long j, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native long UIAnnotationTransform2D_SWIGSmartPtrUpcast(long j);

    public static final native void UIAnnotationTransform2D_apply__SWIG_0(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void UIAnnotationTransform2D_apply__SWIG_1(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native String UIAnnotationTransform2D_className();

    public static final native long UIAnnotationTransform2D_dynamicCast__SWIG_0(long j, Element element);

    public static final native int UIAnnotationTransform2D_getAnchorType(long j, UIAnnotationTransform2D uIAnnotationTransform2D);

    public static final native String UIAnnotationTransform2D_getClassName(long j, UIAnnotationTransform2D uIAnnotationTransform2D);

    public static final native long UIAnnotationTransform2D_getCurrentValue(long j, UIAnnotationTransform2D uIAnnotationTransform2D);

    public static final native long UIAnnotationTransform2D_getNormalizationTransform2DDataPtr(long j, UIAnnotationTransform2D uIAnnotationTransform2D);

    public static final native long UIAnnotationTransform2D_getScale(long j, UIAnnotationTransform2D uIAnnotationTransform2D);

    public static final native boolean UIAnnotationTransform2D_getVisible(long j, UIAnnotationTransform2D uIAnnotationTransform2D);

    public static final native void UIAnnotationTransform2D_initClass();

    public static final native void UIAnnotationTransform2D_onCanvasInputRTChanged(long j, UIAnnotationTransform2D uIAnnotationTransform2D);

    public static final native void UIAnnotationTransform2D_setCurrentValue__SWIG_0(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, UIAnnotationTransform2DData uIAnnotationTransform2DData, int i);

    public static final native void UIAnnotationTransform2D_setCurrentValue__SWIG_1(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native void UIAnnotationTransform2D_setVisible__SWIG_0(long j, UIAnnotationTransform2D uIAnnotationTransform2D, boolean z, int i);

    public static final native void UIAnnotationTransform2D_setVisible__SWIG_1(long j, UIAnnotationTransform2D uIAnnotationTransform2D, boolean z);

    public static final native void UIAnnotationTransform2D_updateOffsetAfterClone(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, EEPoint eEPoint);

    public static final native long UIAnnotationTransform2D_updateValueFromAMG(long j, UIAnnotationTransform2D uIAnnotationTransform2D);

    public static final native void UIAnnotationTransform2D_updateValue__SWIG_0(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, EEPoint eEPoint, int i);

    public static final native void UIAnnotationTransform2D_updateValue__SWIG_1(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, EEPoint eEPoint);

    public static final native void UIAnnotationTransform2D_updateValue__SWIG_2(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, EESize eESize, int i);

    public static final native void UIAnnotationTransform2D_updateValue__SWIG_3(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, EESize eESize);

    public static final native void UIAnnotationTransform2D_updateValue__SWIG_4(long j, UIAnnotationTransform2D uIAnnotationTransform2D, double d, int i);

    public static final native void UIAnnotationTransform2D_updateValue__SWIG_5(long j, UIAnnotationTransform2D uIAnnotationTransform2D, double d);

    public static final native void UIAnnotationTransform2D_updateValue__SWIG_6(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, EEPoint eEPoint, long j3, EESize eESize, double d, int i);

    public static final native void UIAnnotationTransform2D_updateValue__SWIG_7(long j, UIAnnotationTransform2D uIAnnotationTransform2D, long j2, EEPoint eEPoint, long j3, EESize eESize, double d);

    public static final native String UIAnnotationTransform3DData_className();

    public static final native long UIAnnotationTransform3DData_getBoxVertex(long j, UIAnnotationTransform3DData uIAnnotationTransform3DData);

    public static final native long UIAnnotationTransform3DData_getCenter(long j, UIAnnotationTransform3DData uIAnnotationTransform3DData);

    public static final native String UIAnnotationTransform3DData_getClassName(long j, UIAnnotationTransform3DData uIAnnotationTransform3DData);

    public static final native double UIAnnotationTransform3DData_getRotationAngle(long j, UIAnnotationTransform3DData uIAnnotationTransform3DData);

    public static final native long UIAnnotationTransform3DData_getSize(long j, UIAnnotationTransform3DData uIAnnotationTransform3DData);

    public static final native void UIAnnotationTransform3DData_setBoxVertex(long j, UIAnnotationTransform3DData uIAnnotationTransform3DData, long j2, EEBoxVertex eEBoxVertex);

    public static final native long UIAnnotationTransform3D_SWIGSmartPtrUpcast(long j);

    public static final native void UIAnnotationTransform3D_apply__SWIG_0(long j, UIAnnotationTransform3D uIAnnotationTransform3D, long j2, ApplyCallbackFunction applyCallbackFunction, int i);

    public static final native void UIAnnotationTransform3D_apply__SWIG_1(long j, UIAnnotationTransform3D uIAnnotationTransform3D, long j2, ApplyCallbackFunction applyCallbackFunction);

    public static final native String UIAnnotationTransform3D_className();

    public static final native long UIAnnotationTransform3D_dynamicCast__SWIG_0(long j, Element element);

    public static final native String UIAnnotationTransform3D_getClassName(long j, UIAnnotationTransform3D uIAnnotationTransform3D);

    public static final native long UIAnnotationTransform3D_getCurrentValue(long j, UIAnnotationTransform3D uIAnnotationTransform3D);

    public static final native long UIAnnotationTransform3D_getNormalizationTransform3DDataPtr(long j, UIAnnotationTransform3D uIAnnotationTransform3D);

    public static final native long UIAnnotationTransform3D_getScale(long j, UIAnnotationTransform3D uIAnnotationTransform3D);

    public static final native int UIAnnotationTransform3D_getTransform3DType(long j, UIAnnotationTransform3D uIAnnotationTransform3D);

    public static final native boolean UIAnnotationTransform3D_getVisible(long j, UIAnnotationTransform3D uIAnnotationTransform3D);

    public static final native void UIAnnotationTransform3D_initClass();

    public static final native void UIAnnotationTransform3D_onCanvasInputRTChanged(long j, UIAnnotationTransform3D uIAnnotationTransform3D);

    public static final native void UIAnnotationTransform3D_setCurrentValue__SWIG_0(long j, UIAnnotationTransform3D uIAnnotationTransform3D, long j2, UIAnnotationTransform3DData uIAnnotationTransform3DData, int i);

    public static final native void UIAnnotationTransform3D_setCurrentValue__SWIG_1(long j, UIAnnotationTransform3D uIAnnotationTransform3D, long j2, UIAnnotationTransform3DData uIAnnotationTransform3DData);

    public static final native void UIAnnotationTransform3D_setVisible__SWIG_0(long j, UIAnnotationTransform3D uIAnnotationTransform3D, boolean z, int i);

    public static final native void UIAnnotationTransform3D_setVisible__SWIG_1(long j, UIAnnotationTransform3D uIAnnotationTransform3D, boolean z);

    public static final native long UIAnnotationTransform3D_updateValueFromAMG(long j, UIAnnotationTransform3D uIAnnotationTransform3D);

    public static final native void UIAnnotationTransform3D_updateValue__SWIG_0(long j, UIAnnotationTransform3D uIAnnotationTransform3D, long j2, EEPoint eEPoint, int i);

    public static final native void UIAnnotationTransform3D_updateValue__SWIG_1(long j, UIAnnotationTransform3D uIAnnotationTransform3D, long j2, EEPoint eEPoint);

    public static final native void UIAnnotationTransform3D_updateValue__SWIG_2(long j, UIAnnotationTransform3D uIAnnotationTransform3D, long j2, EESize eESize, int i);

    public static final native void UIAnnotationTransform3D_updateValue__SWIG_3(long j, UIAnnotationTransform3D uIAnnotationTransform3D, long j2, EESize eESize);

    public static final native void UIAnnotationTransform3D_updateValue__SWIG_4(long j, UIAnnotationTransform3D uIAnnotationTransform3D, double d, int i);

    public static final native void UIAnnotationTransform3D_updateValue__SWIG_5(long j, UIAnnotationTransform3D uIAnnotationTransform3D, double d);

    public static final native void UIAnnotationTransform3D_updateValue__SWIG_6(long j, UIAnnotationTransform3D uIAnnotationTransform3D, long j2, EEPoint eEPoint, long j3, EESize eESize, double d, int i);

    public static final native void UIAnnotationTransform3D_updateValue__SWIG_7(long j, UIAnnotationTransform3D uIAnnotationTransform3D, long j2, EEPoint eEPoint, long j3, EESize eESize, double d);

    public static final native String UIAnnotationUIMore_className();

    public static final native String UIAnnotationUIMore_getClassName(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native int UIAnnotationUIMore_getUIType(long j, UIAnnotationUIMore uIAnnotationUIMore);

    public static final native String Version_toString(long j, Version version);

    public static final native long Version_withoutPatch(long j, Version version);

    public static final native boolean changeShouldBeRecorded(int i);

    public static final native void delete_ActionExtraData(long j);

    public static final native void delete_ApplyCallbackFunction(long j);

    public static final native void delete_Asset(long j);

    public static final native void delete_AssetAnimatedSequence(long j);

    public static final native void delete_AssetGif(long j);

    public static final native void delete_AssetImageTexture(long j);

    public static final native void delete_AssetManager(long j);

    public static final native void delete_AssetSource(long j);

    public static final native void delete_AssetSourceDataFromExternalLibrary(long j);

    public static final native void delete_AssetSourceDataFromInternalLibrary(long j);

    public static final native void delete_AssetSourceDataFromUser(long j);

    public static final native void delete_Canvas(long j);

    public static final native void delete_CanvasAnimationListener(long j);

    public static final native void delete_DataChangeObserver(long j);

    public static final native void delete_DataChanges(long j);

    public static final native void delete_DataEvent(long j);

    public static final native void delete_DataEventReceiver(long j);

    public static final native void delete_DataEventRequestReloadEffectResource(long j);

    public static final native void delete_DraftUpgradeManager(long j);

    public static final native void delete_EEBoxVertex(long j);

    public static final native void delete_EEEffectHandle(long j);

    public static final native void delete_EEEventSequenceList(long j);

    public static final native void delete_EEFloatList(long j);

    public static final native void delete_EEIntegerList(long j);

    public static final native void delete_EEPoint(long j);

    public static final native void delete_EEPointList(long j);

    public static final native void delete_EEScale(long j);

    public static final native void delete_EESize(long j);

    public static final native void delete_EEStdElementIdList(long j);

    public static final native void delete_EEStdElementItemSharePtrList(long j);

    public static final native void delete_EEStdElementList(long j);

    public static final native void delete_EEStdElementSet(long j);

    public static final native void delete_EEStdElementSet_Iterator(long j);

    public static final native void delete_EEStdEventActionList(long j);

    public static final native void delete_EEStdEventCommandList(long j);

    public static final native void delete_EEStdEventCommandUnitList(long j);

    public static final native void delete_EEStdEventObjectSharePtrList(long j);

    public static final native void delete_EEStdEventTriggerList(long j);

    public static final native void delete_EEStdFeatureList(long j);

    public static final native void delete_EEStdLokiInfoList(long j);

    public static final native void delete_EEStdLokiInfoPtrList(long j);

    public static final native void delete_EEStdStringList(long j);

    public static final native void delete_EEStdStringMap(long j);

    public static final native void delete_EEStdStringMap_Iterator(long j);

    public static final native void delete_EEStdStringSet(long j);

    public static final native void delete_EEStdStringSet_Iterator(long j);

    public static final native void delete_EEStdStringToStringMap(long j);

    public static final native void delete_EEStdStringToStringMap_Iterator(long j);

    public static final native void delete_EEStdUIAnnotationBaseList(long j);

    public static final native void delete_EEUIAnnotationSharePtrList(long j);

    public static final native void delete_EEVec3f(long j);

    public static final native void delete_EEVec4f(long j);

    public static final native void delete_EffectCapabilitiesJson(long j);

    public static final native void delete_EffectHandleGetter(long j);

    public static final native void delete_EffectMessageCenter(long j);

    public static final native void delete_EffectMessageObserver(long j);

    public static final native void delete_EffectSubmissionDataJson(long j);

    public static final native void delete_Element(long j);

    public static final native void delete_ElementId(long j);

    public static final native void delete_ElementIdEqual(long j);

    public static final native void delete_ElementIdHash(long j);

    public static final native void delete_Error(long j);

    public static final native void delete_Event(long j);

    public static final native void delete_EventAction(long j);

    public static final native void delete_EventCommand(long j);

    public static final native void delete_EventCommandUnit(long j);

    public static final native void delete_EventItem(long j);

    public static final native void delete_EventManager(long j);

    public static final native void delete_EventManagerV2(long j);

    public static final native void delete_EventObject(long j);

    public static final native void delete_EventSequence(long j);

    public static final native void delete_EventStandardNode(long j);

    public static final native void delete_EventTrigger(long j);

    public static final native void delete_Feature(long j);

    public static final native void delete_FeatureAndTransform(long j);

    public static final native void delete_FeatureManager(long j);

    public static final native void delete_IAssetSourceData(long j);

    public static final native void delete_LegacyFeature(long j);

    public static final native void delete_LokiInfo(long j);

    public static final native void delete_Model(long j);

    public static final native void delete_Project(long j);

    public static final native void delete_Project_ProjectLoadSettings(long j);

    public static final native void delete_TriggerExtraData(long j);

    public static final native void delete_UIAnnotationAnchorAlignment(long j);

    public static final native void delete_UIAnnotationAssetTexture(long j);

    public static final native void delete_UIAnnotationAssetTextureUIMore(long j);

    public static final native void delete_UIAnnotationBase(long j);

    public static final native void delete_UIAnnotationBool(long j);

    public static final native void delete_UIAnnotationBoolUIMore(long j);

    public static final native void delete_UIAnnotationCompletion(long j);

    public static final native void delete_UIAnnotationFacePoints(long j);

    public static final native void delete_UIAnnotationFacePointsUIMore(long j);

    public static final native void delete_UIAnnotationFloat(long j);

    public static final native void delete_UIAnnotationFloatUIMore(long j);

    public static final native void delete_UIAnnotationPulse(long j);

    public static final native void delete_UIAnnotationPulseUIMore(long j);

    public static final native void delete_UIAnnotationScriptTransform2D(long j);

    public static final native void delete_UIAnnotationTransform2D(long j);

    public static final native void delete_UIAnnotationTransform2DData(long j);

    public static final native void delete_UIAnnotationTransform3D(long j);

    public static final native void delete_UIAnnotationTransform3DData(long j);

    public static final native void delete_UIAnnotationUIMore(long j);

    public static final native void delete_Version(long j);

    public static final native void initLibrary();

    public static final native boolean isCommitIdForWorking(String str);

    public static final native int isEqualToEEPoint(long j, EEPoint eEPoint, long j2, EEPoint eEPoint2);

    public static final native int isEqualToEEScale(long j, EEScale eEScale, long j2, EEScale eEScale2);

    public static final native int isEqualToEESize(long j, EESize eESize, long j2, EESize eESize2);

    public static final native int isEqualToEEVec3f(long j, EEVec3f eEVec3f, long j2, EEVec3f eEVec3f2);

    public static final native int isEqualToEEVec4f(long j, EEVec4f eEVec4f, long j2, EEVec4f eEVec4f2);

    public static final native boolean isObjectIdValid(long j);

    public static final native String kAnimseqResImageFiles();

    public static final native String kAnimseqResSeqFile();

    public static final native String kAnimseqResType();

    public static final native String kAssetCoverImgPath();

    public static final native String kAssetDirectoryName();

    public static final native String kAssetJson();

    public static final native String kAssetManager();

    public static final native String kAssetName();

    public static final native String kAssetPath();

    public static final native String kAssetType();

    public static final native String kCapabilitiesJsonFileName();

    public static final native String kEventActionAppear();

    public static final native String kEventActionDisappear();

    public static final native String kEventActionGroupEndTrigger();

    public static final native String kEventActionGroupStartTrigger();

    public static final native String kEventActionGroupSwitchTrigger();

    public static final native String kEventActionToggle();

    public static final native String kEventAnimationBarrageScrollHorizontal();

    public static final native String kEventAnimationBarrageScrollHorizontalReverse();

    public static final native String kEventAnimationBounceIn();

    public static final native String kEventAnimationBounceOut();

    public static final native String kEventAnimationDance();

    public static final native String kEventAnimationDanceSlightly();

    public static final native String kEventAnimationFlicker();

    public static final native String kEventAnimationFlip();

    public static final native String kEventAnimationFlipOverIn();

    public static final native String kEventAnimationFlipOverOut();

    public static final native String kEventAnimationHeartbeat();

    public static final native String kEventAnimationNone();

    public static final native String kEventAnimationOpacityIn();

    public static final native String kEventAnimationOpacityOut();

    public static final native String kEventAnimationPendulum();

    public static final native String kEventAnimationPlayModeLoop();

    public static final native String kEventAnimationPlayModeOnce();

    public static final native String kEventAnimationRotate();

    public static final native String kEventAnimationSlowlyZoomIn();

    public static final native String kEventAnimationSlowlyZoomOut();

    public static final native String kEventAnimationSubtitleScrollVertical();

    public static final native String kEventAnimationSubtitleScrollVerticalReverse();

    public static final native String kEventAnimationSwing();

    public static final native String kEventAnimationTremble();

    public static final native String kEventAnimationWiper();

    public static final native String kEventObject();

    public static final native String kEventSequence();

    public static final native String kEventSequenceModeInOrder();

    public static final native String kEventSequenceModeLoop();

    public static final native String kEventSequenceModeRandom();

    public static final native String kEventTriggerActionAngry();

    public static final native String kEventTriggerActionBeg();

    public static final native String kEventTriggerActionBigV();

    public static final native String kEventTriggerActionCabbage();

    public static final native String kEventTriggerActionEffectStart();

    public static final native String kEventTriggerActionFPS();

    public static final native String kEventTriggerActionFear();

    public static final native String kEventTriggerActionFist();

    public static final native String kEventTriggerActionFistBow();

    public static final native String kEventTriggerActionFour();

    public static final native String kEventTriggerActionHandOpen();

    public static final native String kEventTriggerActionHappy();

    public static final native String kEventTriggerActionHeartA();

    public static final native String kEventTriggerActionHeartB();

    public static final native String kEventTriggerActionHeartC();

    public static final native String kEventTriggerActionHeartD();

    public static final native String kEventTriggerActionHoldFace();

    public static final native String kEventTriggerActionHornA();

    public static final native String kEventTriggerActionHornB();

    public static final native String kEventTriggerActionIndexFingerUp();

    public static final native String kEventTriggerActionNamaste();

    public static final native String kEventTriggerActionNausea();

    public static final native String kEventTriggerActionNod();

    public static final native String kEventTriggerActionNone();

    public static final native String kEventTriggerActionOK();

    public static final native String kEventTriggerActionObjectEnd();

    public static final native String kEventTriggerActionObjectStart();

    public static final native String kEventTriggerActionOpenMouth();

    public static final native String kEventTriggerActionPalmUp();

    public static final native String kEventTriggerActionPhoneCall();

    public static final native String kEventTriggerActionPokerFace();

    public static final native String kEventTriggerActionPoutMouth();

    public static final native String kEventTriggerActionPray();

    public static final native String kEventTriggerActionRaiseEyebrows();

    public static final native String kEventTriggerActionSad();

    public static final native String kEventTriggerActionSalute();

    public static final native String kEventTriggerActionSecond();

    public static final native String kEventTriggerActionSequenceStop();

    public static final native String kEventTriggerActionShakeHead();

    public static final native String kEventTriggerActionShootA();

    public static final native String kEventTriggerActionShootB();

    public static final native String kEventTriggerActionSurprise();

    public static final native String kEventTriggerActionTapScreen();

    public static final native String kEventTriggerActionThanks();

    public static final native String kEventTriggerActionThree();

    public static final native String kEventTriggerActionThumbDown();

    public static final native String kEventTriggerActionUsePreEndAsStart();

    public static final native String kEventTriggerActionVictory();

    public static final native String kEventTriggerActionVow();

    public static final native String kEventTriggerActionWinkEyes();

    public static final native String kEventTriggerExtraDataTypeDelayTime();

    public static final native String kEventTriggerExtraDataTypeFPS();

    public static final native String kEventTriggerExtraDataTypeNone();

    public static final native String kEventTriggerExtraDataTypeObjectEnd();

    public static final native String kEventTriggerExtraDataTypeSeqStop();

    public static final native String kSubmissionExtraJsonFileName();

    public static final native long makeDefaultBoxVertex();

    public static final native long makeDefaultPoint();

    public static final native long makeDefaultScale();

    public static final native long makeDefaultSize();

    public static final native long makeDefaultVec3f();

    public static final native long makeDefaultVec4f();

    public static final native long makePoint(double d, double d2);

    public static final native long makeScale(double d, double d2);

    public static final native long makeSize(double d, double d2);

    public static final native long makeVec3f(double d, double d2, double d3);

    public static final native long makeVec4f(double d, double d2, double d3, double d4);

    public static final native long new_ActionExtraData();

    public static final native long new_ApplyCallbackFunction();

    public static final native long new_AssetAnimatedSequence__SWIG_0();

    public static final native long new_AssetAnimatedSequence__SWIG_1(long j, Project project);

    public static final native long new_AssetGif__SWIG_0();

    public static final native long new_AssetGif__SWIG_1(long j, Project project);

    public static final native long new_AssetImageTexture__SWIG_0();

    public static final native long new_AssetImageTexture__SWIG_1(long j, Project project);

    public static final native long new_AssetSource();

    public static final native long new_AssetSourceDataFromExternalLibrary();

    public static final native long new_AssetSourceDataFromInternalLibrary();

    public static final native long new_AssetSourceDataFromUser();

    public static final native long new_Asset__SWIG_0();

    public static final native long new_Asset__SWIG_1(long j, Project project);

    public static final native long new_CanvasAnimationListener();

    public static final native long new_DataChangeObserver();

    public static final native long new_DataChanges();

    public static final native long new_DataEvent();

    public static final native long new_DataEventReceiver();

    public static final native long new_DataEventRequestReloadEffectResource();

    public static final native long new_DraftUpgradeManager(long j, Project project);

    public static final native long new_EEBoxVertex();

    public static final native long new_EEEventSequenceList__SWIG_0();

    public static final native long new_EEEventSequenceList__SWIG_1(long j, EEEventSequenceList eEEventSequenceList);

    public static final native long new_EEEventSequenceList__SWIG_2(int i, long j, EventSequence eventSequence);

    public static final native long new_EEFloatList__SWIG_0();

    public static final native long new_EEFloatList__SWIG_1(long j, EEFloatList eEFloatList);

    public static final native long new_EEFloatList__SWIG_2(int i, float f);

    public static final native long new_EEIntegerList__SWIG_0();

    public static final native long new_EEIntegerList__SWIG_1(long j, EEIntegerList eEIntegerList);

    public static final native long new_EEIntegerList__SWIG_2(int i, int i2);

    public static final native long new_EEPoint();

    public static final native long new_EEPointList__SWIG_0();

    public static final native long new_EEPointList__SWIG_1(long j, EEPointList eEPointList);

    public static final native long new_EEPointList__SWIG_2(int i, long j, EEPoint eEPoint);

    public static final native long new_EEScale();

    public static final native long new_EESize();

    public static final native long new_EEStdElementIdList__SWIG_0();

    public static final native long new_EEStdElementIdList__SWIG_1(long j, EEStdElementIdList eEStdElementIdList);

    public static final native long new_EEStdElementIdList__SWIG_2(int i, long j, ElementId elementId);

    public static final native long new_EEStdElementItemSharePtrList__SWIG_0();

    public static final native long new_EEStdElementItemSharePtrList__SWIG_1(long j, EEStdElementItemSharePtrList eEStdElementItemSharePtrList);

    public static final native long new_EEStdElementItemSharePtrList__SWIG_2(int i, long j, EventItem eventItem);

    public static final native long new_EEStdElementList__SWIG_0();

    public static final native long new_EEStdElementList__SWIG_1(long j, EEStdElementList eEStdElementList);

    public static final native long new_EEStdElementList__SWIG_2(int i, long j, Element element);

    public static final native long new_EEStdElementSet__SWIG_0();

    public static final native long new_EEStdElementSet__SWIG_1(long j, EEStdElementSet eEStdElementSet);

    public static final native long new_EEStdEventActionList__SWIG_0();

    public static final native long new_EEStdEventActionList__SWIG_1(long j, EEStdEventActionList eEStdEventActionList);

    public static final native long new_EEStdEventActionList__SWIG_2(int i, long j, EventAction eventAction);

    public static final native long new_EEStdEventCommandList__SWIG_0();

    public static final native long new_EEStdEventCommandList__SWIG_1(long j, EEStdEventCommandList eEStdEventCommandList);

    public static final native long new_EEStdEventCommandList__SWIG_2(int i, long j, EventCommand eventCommand);

    public static final native long new_EEStdEventCommandUnitList__SWIG_0();

    public static final native long new_EEStdEventCommandUnitList__SWIG_1(long j, EEStdEventCommandUnitList eEStdEventCommandUnitList);

    public static final native long new_EEStdEventCommandUnitList__SWIG_2(int i, long j, EventCommandUnit eventCommandUnit);

    public static final native long new_EEStdEventObjectSharePtrList__SWIG_0();

    public static final native long new_EEStdEventObjectSharePtrList__SWIG_1(long j, EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList);

    public static final native long new_EEStdEventObjectSharePtrList__SWIG_2(int i, long j, EventObject eventObject);

    public static final native long new_EEStdEventTriggerList__SWIG_0();

    public static final native long new_EEStdEventTriggerList__SWIG_1(long j, EEStdEventTriggerList eEStdEventTriggerList);

    public static final native long new_EEStdEventTriggerList__SWIG_2(int i, long j, EventTrigger eventTrigger);

    public static final native long new_EEStdFeatureList__SWIG_0();

    public static final native long new_EEStdFeatureList__SWIG_1(long j, EEStdFeatureList eEStdFeatureList);

    public static final native long new_EEStdFeatureList__SWIG_2(int i, long j, Feature feature);

    public static final native long new_EEStdLokiInfoList__SWIG_0();

    public static final native long new_EEStdLokiInfoList__SWIG_1(long j, EEStdLokiInfoList eEStdLokiInfoList);

    public static final native long new_EEStdLokiInfoList__SWIG_2(int i, long j, LokiInfo lokiInfo);

    public static final native long new_EEStdLokiInfoPtrList__SWIG_0();

    public static final native long new_EEStdLokiInfoPtrList__SWIG_1(long j, EEStdLokiInfoPtrList eEStdLokiInfoPtrList);

    public static final native long new_EEStdLokiInfoPtrList__SWIG_2(int i, long j, LokiInfo lokiInfo);

    public static final native long new_EEStdStringList__SWIG_0();

    public static final native long new_EEStdStringList__SWIG_1(long j, EEStdStringList eEStdStringList);

    public static final native long new_EEStdStringList__SWIG_2(int i, String str);

    public static final native long new_EEStdStringMap__SWIG_0();

    public static final native long new_EEStdStringMap__SWIG_1(long j, EEStdStringMap eEStdStringMap);

    public static final native long new_EEStdStringSet__SWIG_0();

    public static final native long new_EEStdStringSet__SWIG_1(long j, EEStdStringSet eEStdStringSet);

    public static final native long new_EEStdStringToStringMap__SWIG_0();

    public static final native long new_EEStdStringToStringMap__SWIG_1(long j, EEStdStringToStringMap eEStdStringToStringMap);

    public static final native long new_EEStdUIAnnotationBaseList__SWIG_0();

    public static final native long new_EEStdUIAnnotationBaseList__SWIG_1(long j, EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList);

    public static final native long new_EEStdUIAnnotationBaseList__SWIG_2(int i, long j, UIAnnotationBase uIAnnotationBase);

    public static final native long new_EEUIAnnotationSharePtrList__SWIG_0();

    public static final native long new_EEUIAnnotationSharePtrList__SWIG_1(long j, EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList);

    public static final native long new_EEUIAnnotationSharePtrList__SWIG_2(int i, long j, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native long new_EEVec3f();

    public static final native long new_EEVec4f();

    public static final native long new_EffectCapabilitiesJson();

    public static final native long new_EffectHandleGetter();

    public static final native long new_EffectMessageObserver();

    public static final native long new_EffectSubmissionDataJson();

    public static final native long new_ElementIdEqual();

    public static final native long new_ElementIdHash();

    public static final native long new_ElementId__SWIG_0();

    public static final native long new_ElementId__SWIG_1(String str);

    public static final native long new_ElementId__SWIG_2(long j, String str);

    public static final native long new_ElementId__SWIG_3(long j, ElementId elementId);

    public static final native long new_Error();

    public static final native long new_EventAction__SWIG_0(long j, Project project);

    public static final native long new_EventAction__SWIG_1();

    public static final native long new_EventCommandUnit__SWIG_0(long j, Project project);

    public static final native long new_EventCommandUnit__SWIG_1();

    public static final native long new_EventCommand__SWIG_0(long j, Project project);

    public static final native long new_EventCommand__SWIG_1();

    public static final native long new_EventItem__SWIG_0(long j, Project project);

    public static final native long new_EventItem__SWIG_1();

    public static final native long new_EventObject__SWIG_0(long j, Project project);

    public static final native long new_EventObject__SWIG_1();

    public static final native long new_EventSequence__SWIG_0(long j, Project project);

    public static final native long new_EventSequence__SWIG_1();

    public static final native long new_EventStandardNode__SWIG_0(long j, Project project);

    public static final native long new_EventStandardNode__SWIG_1();

    public static final native long new_EventTrigger__SWIG_0(long j, Project project);

    public static final native long new_EventTrigger__SWIG_1();

    public static final native long new_Event__SWIG_0(long j, Project project);

    public static final native long new_Event__SWIG_1();

    public static final native long new_FeatureAndTransform();

    public static final native long new_Feature__SWIG_0();

    public static final native long new_Feature__SWIG_1(long j, Project project);

    public static final native long new_LegacyFeature__SWIG_0();

    public static final native long new_LegacyFeature__SWIG_1(long j, Project project);

    public static final native long new_LokiInfo();

    public static final native long new_Model__SWIG_0();

    public static final native long new_Model__SWIG_1(long j, Project project);

    public static final native long new_Project_ProjectLoadSettings();

    public static final native long new_Project__SWIG_0(String str, String str2);

    public static final native long new_Project__SWIG_1(String str);

    public static final native long new_Project__SWIG_2();

    public static final native long new_TriggerExtraData();

    public static final native long new_UIAnnotationAssetTexture();

    public static final native long new_UIAnnotationAssetTextureUIMore();

    public static final native long new_UIAnnotationBase();

    public static final native long new_UIAnnotationBoolUIMore();

    public static final native long new_UIAnnotationCompletion();

    public static final native long new_UIAnnotationFacePointsUIMore();

    public static final native long new_UIAnnotationFloatUIMore();

    public static final native long new_UIAnnotationPulseUIMore();

    public static final native long new_UIAnnotationScriptTransform2D();

    public static final native long new_UIAnnotationTransform2D();

    public static final native long new_UIAnnotationTransform2DData__SWIG_0();

    public static final native long new_UIAnnotationTransform2DData__SWIG_1(long j, EEPoint eEPoint, long j2, EESize eESize, double d);

    public static final native long new_UIAnnotationTransform2DData__SWIG_2(long j, EEPoint eEPoint, long j2, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native long new_UIAnnotationTransform2DData__SWIG_3(long j, EESize eESize, long j2, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native long new_UIAnnotationTransform2DData__SWIG_4(double d, long j, UIAnnotationTransform2DData uIAnnotationTransform2DData);

    public static final native long new_UIAnnotationTransform3D();

    public static final native long new_UIAnnotationTransform3DData__SWIG_0();

    public static final native long new_UIAnnotationTransform3DData__SWIG_1(long j, EEPoint eEPoint, long j2, UIAnnotationTransform3DData uIAnnotationTransform3DData);

    public static final native long new_UIAnnotationTransform3DData__SWIG_2(long j, EEPoint eEPoint, long j2, EESize eESize, double d);

    public static final native long new_UIAnnotationTransform3DData__SWIG_3(long j, EEPoint eEPoint, long j2, EESize eESize, double d, long j3, EEBoxVertex eEBoxVertex);

    public static final native long new_UIAnnotationTransform3DData__SWIG_4(long j, EESize eESize, long j2, UIAnnotationTransform3DData uIAnnotationTransform3DData);

    public static final native long new_UIAnnotationTransform3DData__SWIG_5(double d, long j, UIAnnotationTransform3DData uIAnnotationTransform3DData);

    public static final native long new_UIAnnotationUIMore();

    public static final native long new_Version__SWIG_0();

    public static final native long new_Version__SWIG_1(long j, long j2, long j3);

    public static final native long new_Version__SWIG_2(String str);

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static long SwigDirector_EffectHandleGetter_getEffectHandle(EffectHandleGetter effectHandleGetter) {
        return effectHandleGetter.getEffectHandle();
    }

    public static void SwigDirector_UIAnnotationCompletion_onSuccess(UIAnnotationCompletion uIAnnotationCompletion) {
        uIAnnotationCompletion.onSuccess();
    }

    public static void SwigDirector_ApplyCallbackFunction_onApplied(ApplyCallbackFunction applyCallbackFunction, long j) {
        Error error;
        if (j == 0) {
            error = null;
        } else {
            error = new Error(j, true);
        }
        applyCallbackFunction.onApplied(error);
    }

    public static void SwigDirector_DataEventReceiver_onDataEventReceived(DataEventReceiver dataEventReceiver, long j) {
        DataEvent dataEvent;
        if (j == 0) {
            dataEvent = null;
        } else {
            dataEvent = new DataEvent(j, true);
        }
        dataEventReceiver.onDataEventReceived(dataEvent);
    }

    public static void SwigDirector_UIAnnotationCompletion_onError(UIAnnotationCompletion uIAnnotationCompletion, long j) {
        Error error;
        if (j == 0) {
            error = null;
        } else {
            error = new Error(j, true);
        }
        uIAnnotationCompletion.onError(error);
    }

    public static void SwigDirector_CanvasAnimationListener_animationStatusChanged(CanvasAnimationListener canvasAnimationListener, long j, boolean z) {
        Feature feature;
        if (j == 0) {
            feature = null;
        } else {
            feature = new Feature(j, true);
        }
        canvasAnimationListener.animationStatusChanged(feature, z);
    }

    public static void SwigDirector_DataChangeObserver_onDataChanged(DataChangeObserver dataChangeObserver, long j, long j2) {
        DataChanges dataChanges;
        Error error = null;
        if (j == 0) {
            dataChanges = null;
        } else {
            dataChanges = new DataChanges(j, true);
        }
        if (j2 != 0) {
            error = new Error(j2, true);
        }
        dataChangeObserver.onDataChanged(dataChanges, error);
    }

    public static void SwigDirector_EffectMessageObserver_onEffectMessageReceived(EffectMessageObserver effectMessageObserver, long j, int i, int i2, String str) {
        effectMessageObserver.onEffectMessageReceived(j, i, i2, str);
    }
}
