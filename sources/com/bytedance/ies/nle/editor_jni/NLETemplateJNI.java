package com.bytedance.ies.nle.editor_jni;

import com.bytedance.ies.nle.editor_jni.SetString;
import java.math.BigInteger;

/* loaded from: classes17.dex */
public class NLETemplateJNI {
    public static final native void INLEMaterialHandleDelegate_change_ownership(INLEMaterialHandleDelegate iNLEMaterialHandleDelegate, long j, boolean z);

    public static final native void INLEMaterialHandleDelegate_director_connect(INLEMaterialHandleDelegate iNLEMaterialHandleDelegate, long j, boolean z, boolean z2);

    public static final native void INLEMaterialHandleDelegate_resizeImage(long j, INLEMaterialHandleDelegate iNLEMaterialHandleDelegate, String str, String str2, long j2, NLESize nLESize, long j3, NLESize nLESize2, long j4, NLEMaterialHandleCallback nLEMaterialHandleCallback);

    public static final native void INLEMaterialHandleDelegate_resizeVideo(long j, INLEMaterialHandleDelegate iNLEMaterialHandleDelegate, String str, String str2, long j2, NLESize nLESize, long j3, NLESize nLESize2, long j4, long j5, long j6, NLEMaterialHandleCallback nLEMaterialHandleCallback);

    public static final native void INLETemplateMattingServiceCallback_change_ownership(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, long j, boolean z);

    public static final native void INLETemplateMattingServiceCallback_director_connect(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, long j, boolean z, boolean z2);

    public static final native void INLETemplateMattingServiceCallback_onError(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, long j2, NLETrackSlot nLETrackSlot, int i, String str);

    public static final native void INLETemplateMattingServiceCallback_onErrorSwigExplicitINLETemplateMattingServiceCallback(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, long j2, NLETrackSlot nLETrackSlot, int i, String str);

    public static final native void INLETemplateMattingServiceCallback_onProgress(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, float f);

    public static final native void INLETemplateMattingServiceCallback_onProgressSwigExplicitINLETemplateMattingServiceCallback(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, float f);

    public static final native void INLETemplateMattingServiceCallback_onSuccess(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback);

    public static final native void INLETemplateMattingServiceCallback_onSuccessSwigExplicitINLETemplateMattingServiceCallback(long j, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback);

    public static final native boolean INLETemplateMattingService_cancel(long j, INLETemplateMattingService iNLETemplateMattingService);

    public static final native void INLETemplateMattingService_change_ownership(INLETemplateMattingService iNLETemplateMattingService, long j, boolean z);

    public static final native void INLETemplateMattingService_director_connect(INLETemplateMattingService iNLETemplateMattingService, long j, boolean z, boolean z2);

    public static final native boolean INLETemplateMattingService_start(long j, INLETemplateMattingService iNLETemplateMattingService);

    public static final native void INLETemplatePreHandler_change_ownership(INLETemplatePreHandler iNLETemplatePreHandler, long j, boolean z);

    public static final native void INLETemplatePreHandler_director_connect(INLETemplatePreHandler iNLETemplatePreHandler, long j, boolean z, boolean z2);

    public static final native void INLETemplatePreHandler_preHandle(long j, INLETemplatePreHandler iNLETemplatePreHandler, long j2, NLEModel nLEModel);

    public static final native void INLETemplatePreHandler_preHandleSwigExplicitINLETemplatePreHandler(long j, INLETemplatePreHandler iNLETemplatePreHandler, long j2, NLEModel nLEModel);

    public static final native void NLEBaseTemplateZipProgressHandler_change_ownership(NLEBaseTemplateZipProgressHandler nLEBaseTemplateZipProgressHandler, long j, boolean z);

    public static final native void NLEBaseTemplateZipProgressHandler_director_connect(NLEBaseTemplateZipProgressHandler nLEBaseTemplateZipProgressHandler, long j, boolean z, boolean z2);

    public static final native void NLEBaseTemplateZipProgressHandler_invoke(long j, NLEBaseTemplateZipProgressHandler nLEBaseTemplateZipProgressHandler, float f);

    public static final native void NLEBaseTemplateZipProgressHandler_invokeSwigExplicitNLEBaseTemplateZipProgressHandler(long j, NLEBaseTemplateZipProgressHandler nLEBaseTemplateZipProgressHandler, float f);

    public static final native void NLEContextProcessorFunc_change_ownership(NLEContextProcessorFunc nLEContextProcessorFunc, long j, boolean z);

    public static final native String NLEContextProcessorFunc_decrypt(long j, NLEContextProcessorFunc nLEContextProcessorFunc, String str);

    public static final native void NLEContextProcessorFunc_director_connect(NLEContextProcessorFunc nLEContextProcessorFunc, long j, boolean z, boolean z2);

    public static final native String NLEContextProcessorFunc_encrypt(long j, NLEContextProcessorFunc nLEContextProcessorFunc, String str);

    public static final native String NLEContextProcessor_decrypt(long j, NLEContextProcessor nLEContextProcessor, String str);

    public static final native String NLEContextProcessor_encrypt(long j, NLEContextProcessor nLEContextProcessor, String str);

    public static final native long NLEContextProcessor_processor();

    public static final native void NLEContextProcessor_setDelegate(long j, NLEContextProcessor nLEContextProcessor, long j2, NLEContextProcessorFunc nLEContextProcessorFunc);

    public static final native long NLEFTemplateDynamicSlotCutter_cutTemplateWithDynamicSlots(long j, VecString vecString, long j2, VecLongLong vecLongLong, long j3, NLETemplateModel nLETemplateModel);

    public static final native long NLEFTemplateDynamicSlotCutter_fetchRecommendSlotDuratioinsFromLab(String str, int i);

    public static final native String NLELabRecommendSlotsInfo_labVersion_get(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo);

    public static final native void NLELabRecommendSlotsInfo_labVersion_set(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo, String str);

    public static final native int NLELabRecommendSlotsInfo_slotCount_get(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo);

    public static final native void NLELabRecommendSlotsInfo_slotCount_set(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo, int i);

    public static final native long NLELabRecommendSlotsInfo_slotRecommendDurations_get(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo);

    public static final native void NLELabRecommendSlotsInfo_slotRecommendDurations_set(long j, NLELabRecommendSlotsInfo nLELabRecommendSlotsInfo, long j2, VecLongLong vecLongLong);

    public static final native long NLEMappingNode_SWIGSmartPtrUpcast(long j);

    public static final native long NLEMappingNode_clone(long j, NLEMappingNode nLEMappingNode);

    public static final native long NLEMappingNode_dynamicCast(long j, NLENode nLENode);

    public static final native String NLEMappingNode_getKeyClassName(long j, NLEMappingNode nLEMappingNode);

    public static final native String NLEMappingNode_getKeyUUID(long j, NLEMappingNode nLEMappingNode);

    public static final native String NLEMappingNode_getReproductionID(long j, NLEMappingNode nLEMappingNode);

    public static final native boolean NLEMappingNode_hasKeyClassName(long j, NLEMappingNode nLEMappingNode);

    public static final native boolean NLEMappingNode_hasKeyUUID(long j, NLEMappingNode nLEMappingNode);

    public static final native boolean NLEMappingNode_hasReproductionID(long j, NLEMappingNode nLEMappingNode);

    public static final native void NLEMappingNode_setKeyClassName(long j, NLEMappingNode nLEMappingNode, String str);

    public static final native void NLEMappingNode_setKeyUUID(long j, NLEMappingNode nLEMappingNode, String str);

    public static final native void NLEMappingNode_setReproductionID(long j, NLEMappingNode nLEMappingNode, String str);

    public static final native void NLEMaterialHandleCallback_change_ownership(NLEMaterialHandleCallback nLEMaterialHandleCallback, long j, boolean z);

    public static final native void NLEMaterialHandleCallback_director_connect(NLEMaterialHandleCallback nLEMaterialHandleCallback, long j, boolean z, boolean z2);

    public static final native void NLEMaterialHandleCallback_onFailure(long j, NLEMaterialHandleCallback nLEMaterialHandleCallback, int i, String str);

    public static final native void NLEMaterialHandleCallback_onProgress(long j, NLEMaterialHandleCallback nLEMaterialHandleCallback, float f);

    public static final native void NLEMaterialHandleCallback_onSuccess(long j, NLEMaterialHandleCallback nLEMaterialHandleCallback, String str, long j2, NLESize nLESize);

    public static final native boolean NLESingleSlotMattingTask_cancel(long j, NLESingleSlotMattingTask nLESingleSlotMattingTask);

    public static final native boolean NLESingleSlotMattingTask_start(long j, NLESingleSlotMattingTask nLESingleSlotMattingTask);

    public static final native void NLETemplateConvertCallback_change_ownership(NLETemplateConvertCallback nLETemplateConvertCallback, long j, boolean z);

    public static final native void NLETemplateConvertCallback_director_connect(NLETemplateConvertCallback nLETemplateConvertCallback, long j, boolean z, boolean z2);

    public static final native void NLETemplateConvertCallback_onFailure(long j, NLETemplateConvertCallback nLETemplateConvertCallback, int i, String str);

    public static final native void NLETemplateConvertCallback_onProgress(long j, NLETemplateConvertCallback nLETemplateConvertCallback, float f);

    public static final native void NLETemplateConvertCallback_onSuccess(long j, NLETemplateConvertCallback nLETemplateConvertCallback, String str);

    public static final native boolean NLETemplateConverter_checkUnSupportFeature(long j, NLEModel nLEModel);

    public static final native long NLETemplateConverter_normalizeDraft(long j, NLEModel nLEModel, long j2, INLETemplatePreHandler iNLETemplatePreHandler);

    public static final native void NLETemplateConverter_setMaterialDelegate(long j, NLETemplateConverter nLETemplateConverter, long j2, INLEMaterialHandleDelegate iNLEMaterialHandleDelegate);

    public static final native void NLETemplateConverter_setPreHandler(long j, NLETemplateConverter nLETemplateConverter, long j2, INLETemplatePreHandler iNLETemplatePreHandler);

    public static final native void NLETemplateConverter_setUnMutableVideoSlot(long j, NLETemplateConverter nLETemplateConverter, long j2, VecNLETrackSlotSPtr vecNLETrackSlotSPtr);

    public static final native String NLETemplateConverter_storeToZipFromDraft__SWIG_0(long j, NLETemplateConverter nLETemplateConverter, String str);

    public static final native void NLETemplateConverter_storeToZipFromDraft__SWIG_1(long j, NLETemplateConverter nLETemplateConverter, String str, long j2, NLETemplateConvertCallback nLETemplateConvertCallback);

    public static final native long NLETemplateEditor_SWIGUpcast(long j);

    public static final native long NLETemplateMattingService_SWIGSmartPtrUpcast(long j);

    public static final native boolean NLETemplateMattingService_cancel(long j, NLETemplateMattingService nLETemplateMattingService);

    public static final native long NLETemplateMattingService_createSingleMattingTask__SWIG_0(long j, NLETrackSlot nLETrackSlot, long j2, NLEModel nLEModel, String str, long j3, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, String str2);

    public static final native long NLETemplateMattingService_createSingleMattingTask__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2, NLEModel nLEModel, String str, long j3, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback);

    public static final native String NLETemplateMattingService_getMattingWorkSpace(String str, String str2);

    public static final native boolean NLETemplateMattingService_start(long j, NLETemplateMattingService nLETemplateMattingService);

    public static final native String NLETemplateModel_NLE_TEMPLATE_JSON_FILENAME();

    public static final native long NLETemplateModel_SWIGSmartPtrUpcast(long j);

    public static final native boolean NLETemplateModel_canSupportFeatureBits(long j, VecUInt32 vecUInt32);

    public static final native long NLETemplateModel_clone(long j, NLETemplateModel nLETemplateModel);

    public static final native String NLETemplateModel_compressTemplateJson(String str);

    public static final native long NLETemplateModel_convertNLEMappingNode(long j, NLETemplateModel nLETemplateModel, long j2, NLENode nLENode);

    public static final native long NLETemplateModel_createFromDraft(long j, NLEModel nLEModel);

    public static final native String NLETemplateModel_createLocalRelativePath(long j, NLEResourceNode nLEResourceNode);

    public static final native long NLETemplateModel_dynamicCast(long j, NLENode nLENode);

    public static final native long NLETemplateModel_featureListInTemplateModel(String str);

    public static final native long NLETemplateModel_getAllMutableItems(long j, NLETemplateModel nLETemplateModel);

    public static final native long NLETemplateModel_getAllMutableTextClipsFromSlot(long j, NLETemplateModel nLETemplateModel, long j2, NLETrackSlot nLETrackSlot);

    public static final native long NLETemplateModel_getFeatureBits(long j, NLETemplateModel nLETemplateModel);

    public static final native int NLETemplateModel_getFeatureIndex(String str);

    public static final native long NLETemplateModel_getMutableAssetItems(long j, NLETemplateModel nLETemplateModel);

    public static final native long NLETemplateModel_getMutableTextItems(long j, NLETemplateModel nLETemplateModel);

    public static final native String NLETemplateModel_getReproductionID(long j, NLETemplateModel nLETemplateModel, long j2, NLETrackSlot nLETrackSlot);

    public static final native long NLETemplateModel_getSupportFeatureBits__SWIG_0(long j, SetString setString);

    public static final native long NLETemplateModel_getSupportFeatureBits__SWIG_1();

    public static final native long NLETemplateModel_getTemplateCanvasSize(long j, NLETemplateModel nLETemplateModel);

    public static final native long NLETemplateModel_getTemplateInfo(long j, NLETemplateModel nLETemplateModel);

    public static final native long NLETemplateModel_restore(String str);

    public static final native long NLETemplateModel_restoreFromPath(String str);

    public static final native long NLETemplateModel_saveToDraft(long j, NLETemplateModel nLETemplateModel);

    public static final native void NLETemplateModel_setTemplateInfo(long j, NLETemplateModel nLETemplateModel, long j2, TemplateInfo templateInfo);

    public static final native String NLETemplateModel_store(long j, NLETemplateModel nLETemplateModel);

    public static final native String NLETemplateModel_storeToZip(long j, NLETemplateModel nLETemplateModel, String str, String str2, long j2, NLEBaseTemplateZipProgressHandler nLEBaseTemplateZipProgressHandler);

    public static final native String NLETemplateModel_templateJsonDecompress(String str);

    public static final native void NLETemplateModel_updateResourcePath(long j, NLETemplateModel nLETemplateModel, String str, String str2);

    public static final native String SetString_Iterator_derefUnchecked(long j, SetString.Iterator iterator);

    public static final native void SetString_Iterator_incrementUnchecked(long j, SetString.Iterator iterator);

    public static final native boolean SetString_Iterator_isNot(long j, SetString.Iterator iterator, long j2, SetString.Iterator iterator2);

    public static final native boolean SetString_add(long j, SetString setString, String str);

    public static final native long SetString_begin(long j, SetString setString);

    public static final native void SetString_clear(long j, SetString setString);

    public static final native boolean SetString_containsImpl(long j, SetString setString, String str);

    public static final native long SetString_end(long j, SetString setString);

    public static final native boolean SetString_hasNextImpl(long j, SetString setString, long j2, SetString.Iterator iterator);

    public static final native boolean SetString_isEmpty(long j, SetString setString);

    public static final native boolean SetString_removeImpl(long j, SetString setString, String str);

    public static final native int SetString_sizeImpl(long j, SetString setString);

    public static final native long TemplateConfig_SWIGSmartPtrUpcast(long j);

    public static final native long TemplateConfig_clone(long j, TemplateConfig templateConfig);

    public static final native long TemplateConfig_dynamicCast(long j, NLENode nLENode);

    public static final native String TemplateConfig_getCanvasRatio(long j, TemplateConfig templateConfig);

    public static final native boolean TemplateConfig_hasCanvasRatio(long j, TemplateConfig templateConfig);

    public static final native void TemplateConfig_setCanvasRatio(long j, TemplateConfig templateConfig, String str);

    public static final native long TemplateInfo_SWIGSmartPtrUpcast(long j);

    public static final native void TemplateInfo_addMutableItems(long j, TemplateInfo templateInfo, long j2, NLEMappingNode nLEMappingNode);

    public static final native void TemplateInfo_clearMutableItems(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_clone(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_dynamicCast(long j, NLENode nLENode);

    public static final native String TemplateInfo_getCompressJSON(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_getConfig(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_getCoverModel(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_getCoverRes(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getDesc(long j, TemplateInfo templateInfo);

    public static final native long TemplateInfo_getMutableItemss(long j, TemplateInfo templateInfo);

    public static final native BigInteger TemplateInfo_getOriginalJSONSize(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getParentTemplateId(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getPlatform(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getTag(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getTemplateId(long j, TemplateInfo templateInfo);

    public static final native String TemplateInfo_getTitle(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasCompressJSON(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasDesc(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasOriginalJSONSize(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasParentTemplateId(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasPlatform(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasTag(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasTemplateId(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_hasTitle(long j, TemplateInfo templateInfo);

    public static final native boolean TemplateInfo_removeMutableItems(long j, TemplateInfo templateInfo, long j2, NLEMappingNode nLEMappingNode);

    public static final native long TemplateInfo_restore(String str);

    public static final native void TemplateInfo_setCompressJSON(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setConfig(long j, TemplateInfo templateInfo, long j2, TemplateConfig templateConfig);

    public static final native void TemplateInfo_setCoverModel(long j, TemplateInfo templateInfo, long j2, NLEVideoFrameModel nLEVideoFrameModel);

    public static final native void TemplateInfo_setCoverRes(long j, TemplateInfo templateInfo, long j2, NLEResourceNode nLEResourceNode);

    public static final native void TemplateInfo_setDesc(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setOriginalJSONSize(long j, TemplateInfo templateInfo, BigInteger bigInteger);

    public static final native void TemplateInfo_setParentTemplateId(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setPlatform(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setTag(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setTemplateId(long j, TemplateInfo templateInfo, String str);

    public static final native void TemplateInfo_setTitle(long j, TemplateInfo templateInfo, String str);

    public static final native String TemplateInfo_store(long j, TemplateInfo templateInfo);

    public static final native long VecNLEMappingNode_capacity(long j, VecNLEMappingNode vecNLEMappingNode);

    public static final native void VecNLEMappingNode_clear(long j, VecNLEMappingNode vecNLEMappingNode);

    public static final native void VecNLEMappingNode_doAdd__SWIG_0(long j, VecNLEMappingNode vecNLEMappingNode, long j2, NLEMappingNode nLEMappingNode);

    public static final native void VecNLEMappingNode_doAdd__SWIG_1(long j, VecNLEMappingNode vecNLEMappingNode, int i, long j2, NLEMappingNode nLEMappingNode);

    public static final native long VecNLEMappingNode_doGet(long j, VecNLEMappingNode vecNLEMappingNode, int i);

    public static final native long VecNLEMappingNode_doRemove(long j, VecNLEMappingNode vecNLEMappingNode, int i);

    public static final native void VecNLEMappingNode_doRemoveRange(long j, VecNLEMappingNode vecNLEMappingNode, int i, int i2);

    public static final native long VecNLEMappingNode_doSet(long j, VecNLEMappingNode vecNLEMappingNode, int i, long j2, NLEMappingNode nLEMappingNode);

    public static final native int VecNLEMappingNode_doSize(long j, VecNLEMappingNode vecNLEMappingNode);

    public static final native boolean VecNLEMappingNode_isEmpty(long j, VecNLEMappingNode vecNLEMappingNode);

    public static final native void VecNLEMappingNode_reserve(long j, VecNLEMappingNode vecNLEMappingNode, long j2);

    public static final native long VecNLENode_capacity(long j, VecNLENode vecNLENode);

    public static final native void VecNLENode_clear(long j, VecNLENode vecNLENode);

    public static final native void VecNLENode_doAdd__SWIG_0(long j, VecNLENode vecNLENode, long j2, NLENode nLENode);

    public static final native void VecNLENode_doAdd__SWIG_1(long j, VecNLENode vecNLENode, int i, long j2, NLENode nLENode);

    public static final native long VecNLENode_doGet(long j, VecNLENode vecNLENode, int i);

    public static final native long VecNLENode_doRemove(long j, VecNLENode vecNLENode, int i);

    public static final native void VecNLENode_doRemoveRange(long j, VecNLENode vecNLENode, int i, int i2);

    public static final native long VecNLENode_doSet(long j, VecNLENode vecNLENode, int i, long j2, NLENode nLENode);

    public static final native int VecNLENode_doSize(long j, VecNLENode vecNLENode);

    public static final native boolean VecNLENode_isEmpty(long j, VecNLENode vecNLENode);

    public static final native void VecNLENode_reserve(long j, VecNLENode vecNLENode, long j2);

    public static final native long VecUInt32_capacity(long j, VecUInt32 vecUInt32);

    public static final native void VecUInt32_clear(long j, VecUInt32 vecUInt32);

    public static final native void VecUInt32_doAdd__SWIG_0(long j, VecUInt32 vecUInt32, long j2);

    public static final native void VecUInt32_doAdd__SWIG_1(long j, VecUInt32 vecUInt32, int i, long j2);

    public static final native long VecUInt32_doGet(long j, VecUInt32 vecUInt32, int i);

    public static final native long VecUInt32_doRemove(long j, VecUInt32 vecUInt32, int i);

    public static final native void VecUInt32_doRemoveRange(long j, VecUInt32 vecUInt32, int i, int i2);

    public static final native long VecUInt32_doSet(long j, VecUInt32 vecUInt32, int i, long j2);

    public static final native int VecUInt32_doSize(long j, VecUInt32 vecUInt32);

    public static final native boolean VecUInt32_isEmpty(long j, VecUInt32 vecUInt32);

    public static final native void VecUInt32_reserve(long j, VecUInt32 vecUInt32, long j2);

    public static final native void delete_INLEMaterialHandleDelegate(long j);

    public static final native void delete_INLETemplateMattingService(long j);

    public static final native void delete_INLETemplateMattingServiceCallback(long j);

    public static final native void delete_INLETemplatePreHandler(long j);

    public static final native void delete_NLEBaseTemplateZipProgressHandler(long j);

    public static final native void delete_NLEContextProcessor(long j);

    public static final native void delete_NLEContextProcessorFunc(long j);

    public static final native void delete_NLEFTemplateDynamicSlotCutter(long j);

    public static final native void delete_NLELabRecommendSlotsInfo(long j);

    public static final native void delete_NLEMappingNode(long j);

    public static final native void delete_NLEMaterialHandleCallback(long j);

    public static final native void delete_NLESingleSlotMattingTask(long j);

    public static final native void delete_NLETemplateConvertCallback(long j);

    public static final native void delete_NLETemplateConverter(long j);

    public static final native void delete_NLETemplateEditor(long j);

    public static final native void delete_NLETemplateMattingService(long j);

    public static final native void delete_NLETemplateModel(long j);

    public static final native void delete_SetString(long j);

    public static final native void delete_SetString_Iterator(long j);

    public static final native void delete_TemplateConfig(long j);

    public static final native void delete_TemplateInfo(long j);

    public static final native void delete_VecNLEMappingNode(long j);

    public static final native void delete_VecNLENode(long j);

    public static final native void delete_VecUInt32(long j);

    public static final native long new_INLEMaterialHandleDelegate();

    public static final native long new_INLETemplateMattingService();

    public static final native long new_INLETemplateMattingServiceCallback();

    public static final native long new_INLETemplatePreHandler();

    public static final native long new_NLEBaseTemplateZipProgressHandler();

    public static final native long new_NLEContextProcessor();

    public static final native long new_NLEContextProcessorFunc();

    public static final native long new_NLEFTemplateDynamicSlotCutter();

    public static final native long new_NLELabRecommendSlotsInfo();

    public static final native long new_NLEMappingNode();

    public static final native long new_NLEMaterialHandleCallback();

    public static final native long new_NLESingleSlotMattingTask__SWIG_0(long j, NLETrackSlot nLETrackSlot, long j2, NLEModel nLEModel, String str, long j3, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, String str2);

    public static final native long new_NLESingleSlotMattingTask__SWIG_1(long j, NLETrackSlot nLETrackSlot, long j2, NLEModel nLEModel, String str, long j3, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback);

    public static final native long new_NLETemplateConvertCallback();

    public static final native long new_NLETemplateConverter(long j, NLEModel nLEModel, String str, String str2);

    public static final native long new_NLETemplateEditor();

    public static final native long new_NLETemplateMattingService(long j, NLETemplateModel nLETemplateModel, String str, String str2, long j2, INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback);

    public static final native long new_NLETemplateModel();

    public static final native long new_SetString__SWIG_0();

    public static final native long new_SetString__SWIG_1(long j, SetString setString);

    public static final native long new_TemplateConfig();

    public static final native long new_TemplateInfo();

    public static final native long new_VecNLEMappingNode__SWIG_0();

    public static final native long new_VecNLEMappingNode__SWIG_1(long j, VecNLEMappingNode vecNLEMappingNode);

    public static final native long new_VecNLEMappingNode__SWIG_2(int i, long j, NLEMappingNode nLEMappingNode);

    public static final native long new_VecNLENode__SWIG_0();

    public static final native long new_VecNLENode__SWIG_1(long j, VecNLENode vecNLENode);

    public static final native long new_VecNLENode__SWIG_2(int i, long j, NLENode nLENode);

    public static final native long new_VecUInt32__SWIG_0();

    public static final native long new_VecUInt32__SWIG_1(long j, VecUInt32 vecUInt32);

    public static final native long new_VecUInt32__SWIG_2(int i, long j);

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static void SwigDirector_INLETemplateMattingServiceCallback_onSuccess(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback) {
        iNLETemplateMattingServiceCallback.onSuccess();
    }

    public static boolean SwigDirector_INLETemplateMattingService_cancel(INLETemplateMattingService iNLETemplateMattingService) {
        return iNLETemplateMattingService.LIZ();
    }

    public static boolean SwigDirector_INLETemplateMattingService_start(INLETemplateMattingService iNLETemplateMattingService) {
        return iNLETemplateMattingService.LIZJ();
    }

    public static void SwigDirector_INLETemplateMattingServiceCallback_onProgress(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, float f) {
        iNLETemplateMattingServiceCallback.onProgress(f);
    }

    public static void SwigDirector_INLETemplatePreHandler_preHandle(INLETemplatePreHandler iNLETemplatePreHandler, long j) {
        NLEModel nLEModel;
        if (j == 0) {
            nLEModel = null;
        } else {
            nLEModel = new NLEModel(j, true);
        }
        iNLETemplatePreHandler.getClass();
        long j2 = iNLETemplatePreHandler.LIZ;
        long cPtr = NLEModel.getCPtr(nLEModel);
        if (INLETemplatePreHandler.class == INLETemplatePreHandler.class) {
            INLETemplatePreHandler_preHandle(j2, iNLETemplatePreHandler, cPtr, nLEModel);
        } else {
            INLETemplatePreHandler_preHandleSwigExplicitINLETemplatePreHandler(j2, iNLETemplatePreHandler, cPtr, nLEModel);
        }
    }

    public static void SwigDirector_NLEBaseTemplateZipProgressHandler_invoke(NLEBaseTemplateZipProgressHandler nLEBaseTemplateZipProgressHandler, float f) {
        nLEBaseTemplateZipProgressHandler.invoke(f);
    }

    public static String SwigDirector_NLEContextProcessorFunc_decrypt(NLEContextProcessorFunc nLEContextProcessorFunc, String str) {
        return NLEContextProcessorFunc_decrypt(nLEContextProcessorFunc.LIZ, nLEContextProcessorFunc, str);
    }

    public static String SwigDirector_NLEContextProcessorFunc_encrypt(NLEContextProcessorFunc nLEContextProcessorFunc, String str) {
        return NLEContextProcessorFunc_encrypt(nLEContextProcessorFunc.LIZ, nLEContextProcessorFunc, str);
    }

    public static void SwigDirector_NLEMaterialHandleCallback_onProgress(NLEMaterialHandleCallback nLEMaterialHandleCallback, float f) {
        NLEMaterialHandleCallback_onProgress(nLEMaterialHandleCallback.LIZ, nLEMaterialHandleCallback, f);
    }

    public static void SwigDirector_NLETemplateConvertCallback_onProgress(NLETemplateConvertCallback nLETemplateConvertCallback, float f) {
        NLETemplateConvertCallback_onProgress(nLETemplateConvertCallback.LIZ, nLETemplateConvertCallback, f);
    }

    public static void SwigDirector_NLETemplateConvertCallback_onSuccess(NLETemplateConvertCallback nLETemplateConvertCallback, String str) {
        NLETemplateConvertCallback_onSuccess(nLETemplateConvertCallback.LIZ, nLETemplateConvertCallback, str);
    }

    public static void SwigDirector_NLEMaterialHandleCallback_onFailure(NLEMaterialHandleCallback nLEMaterialHandleCallback, int i, String str) {
        NLEMaterialHandleCallback_onFailure(nLEMaterialHandleCallback.LIZ, nLEMaterialHandleCallback, i, str);
    }

    public static void SwigDirector_NLEMaterialHandleCallback_onSuccess(NLEMaterialHandleCallback nLEMaterialHandleCallback, String str, long j) {
        NLESize nLESize = new NLESize(j);
        NLEMaterialHandleCallback_onSuccess(nLEMaterialHandleCallback.LIZ, nLEMaterialHandleCallback, str, nLESize.LIZ, nLESize);
    }

    public static void SwigDirector_NLETemplateConvertCallback_onFailure(NLETemplateConvertCallback nLETemplateConvertCallback, int i, String str) {
        NLETemplateConvertCallback_onFailure(nLETemplateConvertCallback.LIZ, nLETemplateConvertCallback, i, str);
    }

    public static void SwigDirector_INLETemplateMattingServiceCallback_onError(INLETemplateMattingServiceCallback iNLETemplateMattingServiceCallback, long j, int i, String str) {
        NLETrackSlot nLETrackSlot;
        if (j == 0) {
            nLETrackSlot = null;
        } else {
            nLETrackSlot = new NLETrackSlot(j);
        }
        iNLETemplateMattingServiceCallback.onError(nLETrackSlot, i, str);
    }

    public static void SwigDirector_INLEMaterialHandleDelegate_resizeImage(INLEMaterialHandleDelegate iNLEMaterialHandleDelegate, String str, String str2, long j, long j2, long j3) {
        NLEMaterialHandleCallback nLEMaterialHandleCallback;
        NLESize nLESize = new NLESize(j);
        NLESize nLESize2 = new NLESize(j2);
        long j4 = 0;
        if (j3 == 0) {
            nLEMaterialHandleCallback = null;
        } else {
            nLEMaterialHandleCallback = new NLEMaterialHandleCallback(j3);
        }
        long j5 = iNLEMaterialHandleDelegate.LIZ;
        long j6 = nLESize.LIZ;
        long j7 = nLESize2.LIZ;
        if (nLEMaterialHandleCallback != null) {
            j4 = nLEMaterialHandleCallback.LIZ;
        }
        INLEMaterialHandleDelegate_resizeImage(j5, iNLEMaterialHandleDelegate, str, str2, j6, nLESize, j7, nLESize2, j4, nLEMaterialHandleCallback);
    }

    public static void SwigDirector_INLEMaterialHandleDelegate_resizeVideo(INLEMaterialHandleDelegate iNLEMaterialHandleDelegate, String str, String str2, long j, long j2, long j3, long j4, long j5) {
        NLEMaterialHandleCallback nLEMaterialHandleCallback;
        NLESize nLESize = new NLESize(j);
        NLESize nLESize2 = new NLESize(j2);
        long j6 = 0;
        if (j5 == 0) {
            nLEMaterialHandleCallback = null;
        } else {
            nLEMaterialHandleCallback = new NLEMaterialHandleCallback(j5);
        }
        long j7 = iNLEMaterialHandleDelegate.LIZ;
        long j8 = nLESize.LIZ;
        long j9 = nLESize2.LIZ;
        if (nLEMaterialHandleCallback != null) {
            j6 = nLEMaterialHandleCallback.LIZ;
        }
        INLEMaterialHandleDelegate_resizeVideo(j7, iNLEMaterialHandleDelegate, str, str2, j8, nLESize, j9, nLESize2, j3, j4, j6, nLEMaterialHandleCallback);
    }
}
