package com.bytedance.ies.nle.editor_jni;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class NLEMediaPublicJniJNI {
    public static final native void DLWCallback_change_ownership(DLWCallback dLWCallback, long j, boolean z);

    public static final native void DLWCallback_compileDone(long j, DLWCallback dLWCallback);

    public static final native void DLWCallback_compileError(long j, DLWCallback dLWCallback, int i);

    public static final native void DLWCallback_director_connect(DLWCallback dLWCallback, long j, boolean z, boolean z2);

    public static final native void DLWCallback_onProgress(long j, DLWCallback dLWCallback, float f);

    public static final native int DynamicLightWaveUtil_cancelCompile(long j, DynamicLightWaveUtil dynamicLightWaveUtil);

    public static final native int DynamicLightWaveUtil_compile(long j, DynamicLightWaveUtil dynamicLightWaveUtil, String str, boolean z, long j2, DLWCallback dLWCallback);

    public static final native int DynamicLightWaveUtil_destroy(long j, DynamicLightWaveUtil dynamicLightWaveUtil);

    public static final native int DynamicLightWaveUtil_insertClipAndFilter(long j, DynamicLightWaveUtil dynamicLightWaveUtil, long j2, SpeedConfig speedConfig, String str);

    public static final native void INLEApplyPatchCallback_change_ownership(INLEApplyPatchCallback iNLEApplyPatchCallback, long j, boolean z);

    public static final native void INLEApplyPatchCallback_director_connect(INLEApplyPatchCallback iNLEApplyPatchCallback, long j, boolean z, boolean z2);

    public static final native void INLEApplyPatchCallback_onError(long j, INLEApplyPatchCallback iNLEApplyPatchCallback, long j2, NLEModel nLEModel, String str);

    public static final native void INLEApplyPatchCallback_onProgress(long j, INLEApplyPatchCallback iNLEApplyPatchCallback, long j2, NLEModel nLEModel, float f);

    public static final native void INLEApplyPatchCallback_onSuccess(long j, INLEApplyPatchCallback iNLEApplyPatchCallback, long j2, NLEModel nLEModel);

    public static final native void NLEAlgorithmCallbackWrapper_change_ownership(NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper, long j, boolean z);

    public static final native void NLEAlgorithmCallbackWrapper_director_connect(NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper, long j, boolean z, boolean z2);

    public static final native void NLEAlgorithmCallbackWrapper_onProgress(long j, NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper, float f);

    public static final native int NLEAlgorithmController_beginGenVideoFrames(long j, NLEAlgorithmController nLEAlgorithmController, int i, long j2, NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper);

    public static final native int NLEAlgorithmController_cancelGenVideoFrame(long j, NLEAlgorithmController nLEAlgorithmController, int i);

    public static final native int NLEAlgorithmController_checkScoresFile(long j, NLEAlgorithmController nLEAlgorithmController, String str);

    public static final native int NLEAlgorithmController_genRandomSolve(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native int NLEAlgorithmController_genSmartCutting(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native long NLEAlgorithmController_getAllVideoRangeData(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native int NLEAlgorithmController_initBingoAlgorithm(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native int NLEAlgorithmController_initSmartAlgorithm(long j, NLEAlgorithmController nLEAlgorithmController, long j2, long j3, long j4, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native int NLEAlgorithmController_reInitSmartAlgorithmIfPossible(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native int NLEAlgorithmController_removeAllVideoSound(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native int NLEAlgorithmController_restoreAllVideoSound(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native int NLEAlgorithmController_setInterimScoresToFile(long j, NLEAlgorithmController nLEAlgorithmController, String str);

    public static final native int NLEAlgorithmController_setMusicAndResult(long j, NLEAlgorithmController nLEAlgorithmController, String str, int i, int i2, long j2, NLEAlgorithmPath nLEAlgorithmPath);

    public static final native int NLEAlgorithmController_updateAlgorithmFromNormal(long j, NLEAlgorithmController nLEAlgorithmController);

    public static final native long NLEApplyPatchShims_applyNLEModelWithJSON(long j, NLEApplyPatchShims nLEApplyPatchShims, String str, long j2, INLEApplyPatchCallback iNLEApplyPatchCallback);

    public static final native long NLEApplyPatchShims_applyNLEModel__SWIG_0(long j, NLEApplyPatchShims nLEApplyPatchShims, long j2, NLEModel nLEModel, long j3, INLEApplyPatchCallback iNLEApplyPatchCallback);

    public static final native long NLEApplyPatchShims_applyNLEModel__SWIG_1(long j, NLEApplyPatchShims nLEApplyPatchShims, long j2, NLEModel nLEModel, long j3, INLEApplyPatchCallback iNLEApplyPatchCallback, boolean z);

    public static final native long NLEApplyPatchShims_rebindNLEModel(long j, NLEApplyPatchShims nLEApplyPatchShims, long j2, NLEModel nLEModel);

    public static final native void NLEAudioBeatTracking_notifyStop(long j, NLEAudioBeatTracking nLEAudioBeatTracking);

    public static final native int NLEAudioBeatTracking_process(long j, NLEAudioBeatTracking nLEAudioBeatTracking, long j2, NLEBeatTrackingParam nLEBeatTrackingParam, long j3, VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo);

    public static final native int NLEBrushRuntimeController_begin2DBrush(long j, NLEBrushRuntimeController nLEBrushRuntimeController);

    public static final native int NLEBrushRuntimeController_end2DBrush(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str);

    public static final native int NLEBrushRuntimeController_get2DBrushStrokeCount(long j, NLEBrushRuntimeController nLEBrushRuntimeController);

    public static final native long NLEBrushRuntimeController_getBrushStickerOutState(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, boolean z);

    public static final native boolean NLEBrushRuntimeController_is2DBrushEmpty(long j, NLEBrushRuntimeController nLEBrushRuntimeController);

    public static final native int NLEBrushRuntimeController_processPanEvent(long j, NLEBrushRuntimeController nLEBrushRuntimeController, float f, float f2, float f3, float f4, float f5);

    public static final native int NLEBrushRuntimeController_processTouchDownEvent(long j, NLEBrushRuntimeController nLEBrushRuntimeController, float f, float f2, int i);

    public static final native int NLEBrushRuntimeController_processTouchUpEvent(long j, NLEBrushRuntimeController nLEBrushRuntimeController, float f, float f2, int i);

    public static final native int NLEBrushRuntimeController_saveBrushStickerContext(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, String str2, long j2, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper);

    public static final native int NLEBrushRuntimeController_saveStickerBrushToPng(long j, NLEBrushRuntimeController nLEBrushRuntimeController, String str, String str2, long j2, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper);

    public static final native int NLEBrushRuntimeController_set2DBrushCanvasAlpha(long j, NLEBrushRuntimeController nLEBrushRuntimeController, float f);

    public static final native int NLEBrushRuntimeController_set2DBrushColor(long j, NLEBrushRuntimeController nLEBrushRuntimeController, int i);

    public static final native int NLEBrushRuntimeController_set2DBrushSize(long j, NLEBrushRuntimeController nLEBrushRuntimeController, float f);

    public static final native int NLEBrushRuntimeController_undo2DBrush(long j, NLEBrushRuntimeController nLEBrushRuntimeController);

    public static final native void NLEBrushSaveCallbackWrapper_change_ownership(NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper, long j, boolean z);

    public static final native void NLEBrushSaveCallbackWrapper_director_connect(NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper, long j, boolean z, boolean z2);

    public static final native void NLEBrushSaveCallbackWrapper_onDone(long j, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper, String str, boolean z);

    public static final native void NLEBrushSaveCallbackWrapper_onDoneSwigExplicitNLEBrushSaveCallbackWrapper(long j, NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper, String str, boolean z);

    public static final native void NLECompileListenerWrapper_change_ownership(NLECompileListenerWrapper nLECompileListenerWrapper, long j, boolean z);

    public static final native void NLECompileListenerWrapper_director_connect(NLECompileListenerWrapper nLECompileListenerWrapper, long j, boolean z, boolean z2);

    public static final native void NLECompileListenerWrapper_onCompileDone(long j, NLECompileListenerWrapper nLECompileListenerWrapper);

    public static final native void NLECompileListenerWrapper_onCompileDoneSwigExplicitNLECompileListenerWrapper(long j, NLECompileListenerWrapper nLECompileListenerWrapper);

    public static final native void NLECompileListenerWrapper_onCompileError(long j, NLECompileListenerWrapper nLECompileListenerWrapper, int i, int i2, float f, String str);

    public static final native void NLECompileListenerWrapper_onCompileErrorSwigExplicitNLECompileListenerWrapper(long j, NLECompileListenerWrapper nLECompileListenerWrapper, int i, int i2, float f, String str);

    public static final native void NLECompileListenerWrapper_onCompileProgress(long j, NLECompileListenerWrapper nLECompileListenerWrapper, float f);

    public static final native void NLECompileListenerWrapper_onCompileProgressSwigExplicitNLECompileListenerWrapper(long j, NLECompileListenerWrapper nLECompileListenerWrapper, float f);

    public static final native void NLEEffectMsgListenerWrapper2_change_ownership(NLEEffectMsgListenerWrapper2 nLEEffectMsgListenerWrapper2, long j, boolean z);

    public static final native void NLEEffectMsgListenerWrapper2_director_connect(NLEEffectMsgListenerWrapper2 nLEEffectMsgListenerWrapper2, long j, boolean z, boolean z2);

    public static final native void NLEEffectMsgListenerWrapper2_onMessageReceived(long j, NLEEffectMsgListenerWrapper2 nLEEffectMsgListenerWrapper2, long j2, BigInteger bigInteger, BigInteger bigInteger2, String str, boolean z);

    public static final native void NLEEffectMsgListenerWrapper2_onMessageReceivedSwigExplicitNLEEffectMsgListenerWrapper2(long j, NLEEffectMsgListenerWrapper2 nLEEffectMsgListenerWrapper2, long j2, BigInteger bigInteger, BigInteger bigInteger2, String str, boolean z);

    public static final native void NLEEffectMsgListenerWrapper_change_ownership(NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper, long j, boolean z);

    public static final native void NLEEffectMsgListenerWrapper_director_connect(NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper, long j, boolean z, boolean z2);

    public static final native void NLEEffectMsgListenerWrapper_onMessageReceived(long j, NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper, int i, int i2, int i3, String str);

    public static final native void NLEEffectMsgListenerWrapper_onMessageReceivedSwigExplicitNLEEffectMsgListenerWrapper(long j, NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper, int i, int i2, int i3, String str);

    public static final native int NLEEffectRuntimeController_removeEffectMessageCallback(long j, NLEEffectRuntimeController nLEEffectRuntimeController);

    public static final native int NLEEffectRuntimeController_removeEffectMessageCenterCallback(long j, NLEEffectRuntimeController nLEEffectRuntimeController);

    public static final native int NLEEffectRuntimeController_setEffectMessageCenterCallback(long j, NLEEffectRuntimeController nLEEffectRuntimeController, long j2, NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper);

    public static final native int NLEEffectRuntimeController_setEffectMessageCenterCallback2(long j, NLEEffectRuntimeController nLEEffectRuntimeController, long j2, NLEEffectMsgListenerWrapper2 nLEEffectMsgListenerWrapper2, short s);

    public static final native void NLEEncodeListenerWrapper_change_ownership(NLEEncodeListenerWrapper nLEEncodeListenerWrapper, long j, boolean z);

    public static final native void NLEEncodeListenerWrapper_director_connect(NLEEncodeListenerWrapper nLEEncodeListenerWrapper, long j, boolean z, boolean z2);

    public static final native void NLEEncodeListenerWrapper_onCompressBuffer(long j, NLEEncodeListenerWrapper nLEEncodeListenerWrapper, byte[] bArr, long j2, int i, boolean z);

    public static final native int NLEExporterController_cancelCompile(long j, NLEExporterController nLEExporterController);

    public static final native boolean NLEExporterController_compileOnlyAudio(long j, NLEExporterController nLEExporterController, String str, long j2, NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings);

    public static final native boolean NLEExporterController_compile__SWIG_0(long j, NLEExporterController nLEExporterController, String str, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native boolean NLEExporterController_compile__SWIG_1(long j, NLEExporterController nLEExporterController, String str, String str2, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native boolean NLEExporterController_compile__SWIG_2(long j, NLEExporterController nLEExporterController, String str, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j3, NLECompileListenerWrapper nLECompileListenerWrapper);

    public static final native boolean NLEExporterController_compile__SWIG_3(long j, NLEExporterController nLEExporterController, String str, String str2, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings, long j3, NLECompileListenerWrapper nLECompileListenerWrapper);

    public static final native int NLEExporterController_destroyCompiler(long j, NLEExporterController nLEExporterController);

    public static final native String NLEExporterController_getAudioMatrixResult(long j, NLEExporterController nLEExporterController);

    public static final native long NLEExporterController_getCompileResult(long j, NLEExporterController nLEExporterController);

    public static final native long NLEExporterController_getDenoiseSnrResults(long j, NLEExporterController nLEExporterController);

    public static final native int NLEExporterController_getRemuxErrorCode(long j, NLEExporterController nLEExporterController, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native boolean NLEExporterController_isEnableRemuxVideo(long j, NLEExporterController nLEExporterController, long j2, NLEVideoEncodeSettings nLEVideoEncodeSettings);

    public static final native int NLEExporterController_isWatermarkCompileEncode(long j, NLEExporterController nLEExporterController);

    public static final native void NLEExporterController_pauseCompile(long j, NLEExporterController nLEExporterController);

    public static final native void NLEExporterController_resumeCompile(long j, NLEExporterController nLEExporterController);

    public static final native void NLEExporterController_setCompileDumpFilePath(long j, NLEExporterController nLEExporterController, String str);

    public static final native long NLEFilterRuntimeController_checkComposerNodeExclusion(long j, NLEFilterRuntimeController nLEFilterRuntimeController, String str, String str2, String str3);

    public static final native int NLEFilterRuntimeController_doLensOneKeyDetect(long j, NLEFilterRuntimeController nLEFilterRuntimeController);

    public static final native float NLEFilterRuntimeController_getColorFilterIntensity(long j, NLEFilterRuntimeController nLEFilterRuntimeController, String str);

    public static final native int NLEFilterRuntimeController_updateMultiComposerNodes(long j, NLEFilterRuntimeController nLEFilterRuntimeController, long j2, VecString vecString, long j3, VecString vecString2, long j4, VecFloat vecFloat, String str);

    public static final native void NLEImageTemplateEffectUtil_setSurfaceSize(int i, int i2);

    public static final native void NLEInfoStickerBufferCallbackWrapper_change_ownership(NLEInfoStickerBufferCallbackWrapper nLEInfoStickerBufferCallbackWrapper, long j, boolean z);

    public static final native void NLEInfoStickerBufferCallbackWrapper_director_connect(NLEInfoStickerBufferCallbackWrapper nLEInfoStickerBufferCallbackWrapper, long j, boolean z, boolean z2);

    public static final native Object NLEInfoStickerBufferCallbackWrapper_onGetBuffer(long j, NLEInfoStickerBufferCallbackWrapper nLEInfoStickerBufferCallbackWrapper, String str);

    public static final native void NLEListenerCompileTargetFileInfoPredictWrapper_change_ownership(NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper, long j, boolean z);

    public static final native void NLEListenerCompileTargetFileInfoPredictWrapper_director_connect(NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper, long j, boolean z, boolean z2);

    public static final native void NLEListenerCompileTargetFileInfoPredictWrapper_onCompileTargetFileInfoPredict(long j, NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper, long j2, long j3, boolean z, boolean z2);

    public static final native void NLEListenerCompileTargetFileInfoPredictWrapper_onCompileTargetFileInfoPredictSwigExplicitNLEListenerCompileTargetFileInfoPredictWrapper(long j, NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper, long j2, long j3, boolean z, boolean z2);

    public static final native void NLEListenerGetImageWrapper_change_ownership(NLEListenerGetImageWrapper nLEListenerGetImageWrapper, long j, boolean z);

    public static final native void NLEListenerGetImageWrapper_director_connect(NLEListenerGetImageWrapper nLEListenerGetImageWrapper, long j, boolean z, boolean z2);

    public static final native int NLEListenerGetImageWrapper_onGetImageDataCalled(long j, NLEListenerGetImageWrapper nLEListenerGetImageWrapper, byte[] bArr, int i, int i2, int i3, float f);

    public static final native long NLEMVInfoController_getMVDuration(long j, NLEMVInfoController nLEMVInfoController);

    public static final native long NLEMVInfoController_getMVInfo(long j, NLEMVInfoController nLEMVInfoController);

    public static final native long NLEMVInfoController_getMVOriginalBackgroundAudio(long j, NLEMVInfoController nLEMVInfoController);

    public static final native long NLEMediaResourceManager_getResourceManager(long j, NLEMediaResourceManager nLEMediaResourceManager);

    public static final native long NLEMediaResourceManager_obtain();

    public static final native void NLEMediaResourceManager_prepareNecessaryResource__SWIG_0(long j, NLEMediaResourceManager nLEMediaResourceManager, long j2, NLEModel nLEModel, long j3, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, boolean z, boolean z2);

    public static final native void NLEMediaResourceManager_prepareNecessaryResource__SWIG_1(long j, NLEMediaResourceManager nLEMediaResourceManager, long j2, NLEModel nLEModel, long j3, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback, boolean z);

    public static final native void NLEMediaResourceManager_prepareNecessaryResource__SWIG_2(long j, NLEMediaResourceManager nLEMediaResourceManager, long j2, NLEModel nLEModel, long j3, INLENecessaryResourceFetchCallback iNLENecessaryResourceFetchCallback);

    public static final native void NLEMediaResourceManager_setDelegate(long j, NLEMediaResourceManager nLEMediaResourceManager, long j2, NLEResourceManager nLEResourceManager);

    public static final native void NLEMediaRuntimeController_addAndroidImageHolder(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, Object obj);

    public static final native int NLEMediaRuntimeController_addMetadata(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, String str2);

    public static final native int NLEMediaRuntimeController_cancelGetVideoFrames(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native void NLEMediaRuntimeController_clearAndroidImageHolder(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_completeConfigTemplate(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_enableWatermarkMetadata(long j, NLEMediaRuntimeController nLEMediaRuntimeController, boolean z);

    public static final native int NLEMediaRuntimeController_exportResource(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str);

    public static final native String NLEMediaRuntimeController_findVEParentIdByNLESlotUUID(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str);

    public static final native long NLEMediaRuntimeController_getCanvasSize(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_getDisplayImage(long j, NLEMediaRuntimeController nLEMediaRuntimeController, Object obj);

    public static final native int NLEMediaRuntimeController_getEffectHandle(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native String NLEMediaRuntimeController_getFileInfo(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, String str2);

    public static final native int NLEMediaRuntimeController_getImages(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, VecLongLong vecLongLong, int i, int i2, int i3, long j3, NLEListenerGetImageWrapper nLEListenerGetImageWrapper);

    public static final native long NLEMediaRuntimeController_getInitSize__SWIG_0(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native long NLEMediaRuntimeController_getInitSize__SWIG_1(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i, int i2);

    public static final native String NLEMediaRuntimeController_getKeyFrameParam(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, long j2);

    public static final native String NLEMediaRuntimeController_getMetadata(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str);

    public static final native float NLEMediaRuntimeController_getPlayFps(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_getPreviewFillMode(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native String NLEMediaRuntimeController_getUniqueKey(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_getVEColorSpace(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native long NLEMediaRuntimeController_getVideoResolution(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native boolean NLEMediaRuntimeController_isUseFilterProcess(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_lockSeekVideoClip(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str);

    public static final native void NLEMediaRuntimeController_resetFirstFrame(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native int NLEMediaRuntimeController_sendEffectMsg(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i, int i2, int i3, String str);

    public static final native void NLEMediaRuntimeController_setBackgroundColor(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i);

    public static final native int NLEMediaRuntimeController_setCanvasMinDuration(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, boolean z);

    public static final native void NLEMediaRuntimeController_setCanvasSize(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i, int i2);

    public static final native void NLEMediaRuntimeController_setDisplayPos(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i, int i2, int i3, int i4);

    public static final native void NLEMediaRuntimeController_setDisplayState(long j, NLEMediaRuntimeController nLEMediaRuntimeController, float f, float f2, float f3, int i, int i2);

    public static final native void NLEMediaRuntimeController_setEncoderListener(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, NLEEncodeListenerWrapper nLEEncodeListenerWrapper);

    public static final native int NLEMediaRuntimeController_setHeightWidthRatio(long j, NLEMediaRuntimeController nLEMediaRuntimeController, float f);

    public static final native int NLEMediaRuntimeController_setMaxWidthAndHeight(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, long j3);

    public static final native int NLEMediaRuntimeController_setMetadata(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, MapStrStr mapStrStr);

    public static final native void NLEMediaRuntimeController_setOnCompileTargetFileInfoPredictListener(long j, NLEMediaRuntimeController nLEMediaRuntimeController, long j2, NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper);

    public static final native void NLEMediaRuntimeController_setPlayFps(long j, NLEMediaRuntimeController nLEMediaRuntimeController, float f);

    public static final native int NLEMediaRuntimeController_setPreviewFillMode(long j, NLEMediaRuntimeController nLEMediaRuntimeController, int i);

    public static final native int NLEMediaRuntimeController_setPreviewSurfaceImage(long j, NLEMediaRuntimeController nLEMediaRuntimeController, Object obj, boolean z);

    public static final native int NLEMediaRuntimeController_setPreviewSurfaceTexDesc__SWIG_0(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str, boolean z);

    public static final native int NLEMediaRuntimeController_setPreviewSurfaceTexDesc__SWIG_1(long j, NLEMediaRuntimeController nLEMediaRuntimeController, String str);

    public static final native int NLEMediaRuntimeController_setPreviewTransform(long j, NLEMediaRuntimeController nLEMediaRuntimeController, double d, double d2, double d3);

    public static final native int NLEMediaRuntimeController_setVEMetadataWhitelistConfig(long j, NLEMediaRuntimeController nLEMediaRuntimeController, boolean z, boolean z2, String str, String str2);

    public static final native int NLEMediaRuntimeController_unlockSeekVideoClip(long j, NLEMediaRuntimeController nLEMediaRuntimeController);

    public static final native long NLEMediaSession_getAlgorithmApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getBrushApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getDataSource(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getEffectApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getExporterApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getFilterApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getMVApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getMediaConfig(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getMediaRuntimeApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getMediaSettingApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getMetricsApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getPlayerApi(long j, NLEMediaSession nLEMediaSession);

    public static final native long NLEMediaSession_getStickerApi(long j, NLEMediaSession nLEMediaSession);

    public static final native void NLEMediaSession_setDataSource(long j, NLEMediaSession nLEMediaSession, long j2, NLEModel nLEModel);

    public static final native void NLEMediaSession_updateMediaConfig(long j, NLEMediaSession nLEMediaSession, long j2, NLEMediaConfig nLEMediaConfig);

    public static final native int NLEMediaSettingsController_enableEffect(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_enableHighSpeedForSingle(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_enableImageEditor(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_enableSimpleProcessor(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setAutoPrepare(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native int NLEMediaSettingsController_setDestroyVersion(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setDldEnabled(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setDldThrVal(long j, NLEMediaSettingsController nLEMediaSettingsController, int i);

    public static final native void NLEMediaSettingsController_setDleEnabled(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setDleEnabledPreview(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native int NLEMediaSettingsController_setDropFrameParam(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z, long j2, int i);

    public static final native void NLEMediaSettingsController_setForceDetectForFirstFrameByClip(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setImageResizeInfo(long j, NLEMediaSettingsController nLEMediaSettingsController, int i, int i2, int i3, int i4);

    public static final native void NLEMediaSettingsController_setLoopPlay(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native void NLEMediaSettingsController_setPageMode(long j, NLEMediaSettingsController nLEMediaSettingsController, int i);

    public static final native int NLEMediaSettingsController_setPreviewFps__SWIG_0(long j, NLEMediaSettingsController nLEMediaSettingsController, int i, boolean z);

    public static final native int NLEMediaSettingsController_setPreviewFps__SWIG_1(long j, NLEMediaSettingsController nLEMediaSettingsController, int i);

    public static final native int NLEMediaSettingsController_setSrcMaxHWRatio(long j, NLEMediaSettingsController nLEMediaSettingsController, float f);

    public static final native void NLEMediaSettingsController_setSurfaceReDraw(long j, NLEMediaSettingsController nLEMediaSettingsController, boolean z);

    public static final native long NLEMediaUtil_createAudioBeatTracking();

    public static final native int NLEMediaUtil_detachAudioStreamFile__SWIG_0(String str, long j, NLEModel nLEModel);

    public static final native int NLEMediaUtil_detachAudioStreamFile__SWIG_1(String str, long j, NLEModel nLEModel, int i, int i2, int i3);

    public static final native boolean NLEMediaUtil_isNewAnimation(long j, NLEVideoAnimation nLEVideoAnimation);

    public static final native long NLEMediaUtil_jointModels(long j);

    public static final native int NLEMediaUtil_numberOfString(String str);

    public static final native int NLEMediaUtil_operateGlobalAllowedPaths(long j, VecString vecString, int i);

    public static final native boolean NLEMediaUtil_saveVideoAndPicAsLivePhotoToAlbum(String str, String str2, long j);

    public static final native int NLEMetricsRuntimeController_enableAudioGlitchMetrics(long j, NLEMetricsRuntimeController nLEMetricsRuntimeController, boolean z);

    public static final native String NLEMetricsRuntimeController_getAudioGlitchCount(long j, NLEMetricsRuntimeController nLEMetricsRuntimeController);

    public static final native void NLEOnFrameAvailableWrapper_change_ownership(NLEOnFrameAvailableWrapper nLEOnFrameAvailableWrapper, long j, boolean z);

    public static final native void NLEOnFrameAvailableWrapper_director_connect(NLEOnFrameAvailableWrapper nLEOnFrameAvailableWrapper, long j, boolean z, boolean z2);

    public static final native boolean NLEOnFrameAvailableWrapper_onGetFrame(long j, NLEOnFrameAvailableWrapper nLEOnFrameAvailableWrapper, byte[] bArr, long j2, long j3, long j4);

    public static final native void NLEPlayer_addMessageListener(long j, NLEPlayer nLEPlayer, long j2, NLEMediaMessageListener nLEMediaMessageListener);

    public static final native void NLEPlayer_addNLEResourceDownloadStatusListener(long j, NLEPlayer nLEPlayer, long j2, INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener);

    public static final native void NLEPlayer_cancelAsyncRender(long j, NLEPlayer nLEPlayer);

    public static final native void NLEPlayer_clearNLEResourceDownloadStatusListener(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_destroy(long j, NLEPlayer nLEPlayer);

    public static final native String NLEPlayer_dumpVEModel(long j, NLEPlayer nLEPlayer);

    public static final native String NLEPlayer_dumpVESequence(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_flushSeekCmd(long j, NLEPlayer nLEPlayer);

    public static final native long NLEPlayer_getCurrentPosition(long j, NLEPlayer nLEPlayer);

    public static final native long NLEPlayer_getDuration(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_pause(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_play(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_prepare(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_rePrepare(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_refreshCurrentFrame(long j, NLEPlayer nLEPlayer, int i);

    public static final native void NLEPlayer_releaseAndroidSurface(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_releaseEngine__SWIG_0(long j, NLEPlayer nLEPlayer, boolean z);

    public static final native int NLEPlayer_releaseEngine__SWIG_1(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_releaseResource(long j, NLEPlayer nLEPlayer);

    public static final native void NLEPlayer_removeNLEResourceDownloadStatusListener(long j, NLEPlayer nLEPlayer, long j2, INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener);

    public static final native int NLEPlayer_seekTime(long j, NLEPlayer nLEPlayer, long j2, int i);

    public static final native int NLEPlayer_seekWithFrame__SWIG_0(long j, NLEPlayer nLEPlayer, long j2, long j3, NLEListenerGetImageWrapper nLEListenerGetImageWrapper);

    public static final native int NLEPlayer_seekWithFrame__SWIG_1(long j, NLEPlayer nLEPlayer, long j2, int i, long j3, NLEListenerGetImageWrapper nLEListenerGetImageWrapper);

    public static final native int NLEPlayer_seekWithSpeed(long j, NLEPlayer nLEPlayer, long j2, int i, float f, float f2);

    public static final native int NLEPlayer_setAndroidSurface(long j, NLEPlayer nLEPlayer, Object obj);

    public static final native void NLEPlayer_setAsyncRenderPlayStatusListener(long j, NLEPlayer nLEPlayer, long j2, INLEAsyncRenderPlayStatusListener iNLEAsyncRenderPlayStatusListener);

    public static final native int NLEPlayer_setEditorMode(long j, NLEPlayer nLEPlayer, int i);

    public static final native void NLEPlayer_setNleModel(long j, NLEPlayer nLEPlayer, long j2, NLEModel nLEModel);

    public static final native int NLEPlayer_setPlayRange__SWIG_0(long j, NLEPlayer nLEPlayer, long j2, long j3, int i);

    public static final native int NLEPlayer_setPlayRange__SWIG_1(long j, NLEPlayer nLEPlayer, long j2, long j3);

    public static final native int NLEPlayer_setPreviewSurfaceSize(long j, NLEPlayer nLEPlayer, int i, int i2);

    public static final native void NLEPlayer_setResourceDownloadConfig(long j, NLEPlayer nLEPlayer, long j2, INLEResourceDownloadConfig iNLEResourceDownloadConfig);

    public static final native void NLEPlayer_setResourceManager(long j, NLEPlayer nLEPlayer, long j2, NLEResourceManager nLEResourceManager);

    public static final native int NLEPlayer_state(long j, NLEPlayer nLEPlayer);

    public static final native int NLEPlayer_stop(long j, NLEPlayer nLEPlayer);

    public static final native void NLERenderResourceUtil_convertTrackKeyframesToSlotKeyframes(long j, NLEModel nLEModel);

    public static final native long NLERenderResourceUtil_getUnpreparedNecessaryResources(long j, NLEModel nLEModel);

    public static final native long NLERenderResourceUtil_getUnpreparedUnnecessaryResources(long j, NLEModel nLEModel);

    public static final native void NLERenderResourceUtil_setNLEResourceNecessary(long j, NLEModel nLEModel, long j2, long j3);

    public static final native long NLEResourceDownloadConfig_SWIGUpcast(long j);

    public static final native void NLEResourceDownloadConfig_setResourcePriorityConfig(long j, NLEResourceDownloadConfig nLEResourceDownloadConfig, String str);

    public static final native void NLESafetyApplyPatchToken_cancel(long j, NLESafetyApplyPatchToken nLESafetyApplyPatchToken);

    public static final native void NLESafetyApplyPatchToken_pause(long j, NLESafetyApplyPatchToken nLESafetyApplyPatchToken);

    public static final native void NLESafetyApplyPatchToken_resume(long j, NLESafetyApplyPatchToken nLESafetyApplyPatchToken, long j2, INLEApplyPatchCallback iNLEApplyPatchCallback);

    public static final native int NLEStickerController_beginInfoStickerPin(long j, NLEStickerController nLEStickerController, String str);

    public static final native int NLEStickerController_cancelInfoStickerPin(long j, NLEStickerController nLEStickerController, String str);

    public static final native int NLEStickerController_enableStickerAnimationPreview(long j, NLEStickerController nLEStickerController, String str, boolean z);

    public static final native long NLEStickerController_getInfoStickerBoundingBox(long j, NLEStickerController nLEStickerController, String str, boolean z);

    public static final native byte[] NLEStickerController_getInfoStickerPinData(long j, NLEStickerController nLEStickerController, String str);

    public static final native int NLEStickerController_getInfoStickerPinState(long j, NLEStickerController nLEStickerController, String str);

    public static final native float NLEStickerController_getInfoStickerRotate(long j, NLEStickerController nLEStickerController, String str);

    public static final native float NLEStickerController_getInfoStickerScale(long j, NLEStickerController nLEStickerController, String str);

    public static final native String NLEStickerController_getInfoStickerTemplateParams(long j, NLEStickerController nLEStickerController, String str);

    public static final native boolean NLEStickerController_getInfoStickerVisible(long j, NLEStickerController nLEStickerController, String str);

    public static final native long NLEStickerController_getSrtInfoStickerInitPosition(long j, NLEStickerController nLEStickerController, String str);

    public static final native int NLEStickerController_getStickerBoundingBox(long j, NLEStickerController nLEStickerController, long j2, NLETrackSlot nLETrackSlot, long j3, NLERectF nLERectF, boolean z);

    public static final native boolean NLEStickerController_getStickerIsDynamic(long j, NLEStickerController nLEStickerController, String str);

    public static final native boolean NLEStickerController_isInfoStickerAnimatable(long j, NLEStickerController nLEStickerController, String str);

    public static final native int NLEStickerController_setInfoStickerBufferCallback(long j, NLEStickerController nLEStickerController, long j2, NLEInfoStickerBufferCallbackWrapper nLEInfoStickerBufferCallbackWrapper);

    public static final native int NLEStickerController_setInfoStickerRestoreMode(long j, NLEStickerController nLEStickerController, int i);

    public static final native int NLEStickerController_setInfoStickerTransform(long j, NLEStickerController nLEStickerController, String str, float f, float f2, float f3, float f4, float f5);

    public static final native int NLEStickerController_setSrtManipulateState(long j, NLEStickerController nLEStickerController, String str, boolean z);

    public static final native int NLEStickerController_startStickerAnimationPreview(long j, NLEStickerController nLEStickerController, long j2, int i);

    public static final native int NLEStickerController_stopStickerAnimationPreview(long j, NLEStickerController nLEStickerController);

    public static final native void NLEVEOperationEventManager_addVEOperationListener(long j, NLEVEOperationEventManager nLEVEOperationEventManager, long j2, NLEVEOperationListener nLEVEOperationListener);

    public static final native void NLEVEOperationEventManager_clearVEOperationListener(long j, NLEVEOperationEventManager nLEVEOperationEventManager);

    public static final native long NLEVEOperationEventManager_obtain();

    public static final native void NLEVEOperationEventManager_removeVEOperationListener(long j, NLEVEOperationEventManager nLEVEOperationEventManager, long j2, NLEVEOperationListener nLEVEOperationListener);

    public static final native void NLEVEOperationListener_change_ownership(NLEVEOperationListener nLEVEOperationListener, long j, boolean z);

    public static final native void NLEVEOperationListener_director_connect(NLEVEOperationListener nLEVEOperationListener, long j, boolean z, boolean z2);

    public static final native void NLEVEOperationListener_onVEOperationEvent(long j, NLEVEOperationListener nLEVEOperationListener, int i, String str, long j2, NLEResourceNode nLEResourceNode, int i2, int i3);

    public static final native int SpeedConfig_mode_get(long j, SpeedConfig speedConfig);

    public static final native void SpeedConfig_mode_set(long j, SpeedConfig speedConfig, int i);

    public static final native long SpeedConfig_points_get(long j, SpeedConfig speedConfig);

    public static final native void SpeedConfig_points_set(long j, SpeedConfig speedConfig, long j2, VecNLEPointSPtr vecNLEPointSPtr);

    public static final native long SpeedConfig_repeat_duration_get(long j, SpeedConfig speedConfig);

    public static final native void SpeedConfig_repeat_duration_set(long j, SpeedConfig speedConfig, long j2);

    public static final native void delete_DLWCallback(long j);

    public static final native void delete_DynamicLightWaveUtil(long j);

    public static final native void delete_INLEApplyPatchCallback(long j);

    public static final native void delete_NLEAlgorithmCallbackWrapper(long j);

    public static final native void delete_NLEAlgorithmController(long j);

    public static final native void delete_NLEApplyPatchShims(long j);

    public static final native void delete_NLEAudioBeatTracking(long j);

    public static final native void delete_NLEBrushRuntimeController(long j);

    public static final native void delete_NLEBrushSaveCallbackWrapper(long j);

    public static final native void delete_NLECompileListenerWrapper(long j);

    public static final native void delete_NLEEffectMsgListenerWrapper(long j);

    public static final native void delete_NLEEffectMsgListenerWrapper2(long j);

    public static final native void delete_NLEEffectRuntimeController(long j);

    public static final native void delete_NLEEncodeListenerWrapper(long j);

    public static final native void delete_NLEExporterController(long j);

    public static final native void delete_NLEFilterRuntimeController(long j);

    public static final native void delete_NLEImageTemplateEffectUtil(long j);

    public static final native void delete_NLEInfoStickerBufferCallbackWrapper(long j);

    public static final native void delete_NLEListenerCompileTargetFileInfoPredictWrapper(long j);

    public static final native void delete_NLEListenerGetImageWrapper(long j);

    public static final native void delete_NLEMVInfoController(long j);

    public static final native void delete_NLEMediaResourceManager(long j);

    public static final native void delete_NLEMediaRuntimeController(long j);

    public static final native void delete_NLEMediaSession(long j);

    public static final native void delete_NLEMediaSettingsController(long j);

    public static final native void delete_NLEMediaUtil(long j);

    public static final native void delete_NLEMetricsRuntimeController(long j);

    public static final native void delete_NLEOnFrameAvailableWrapper(long j);

    public static final native void delete_NLEPlayer(long j);

    public static final native void delete_NLEResourceDownloadConfig(long j);

    public static final native void delete_NLESafetyApplyPatchToken(long j);

    public static final native void delete_NLEStickerController(long j);

    public static final native void delete_NLEVEOperationEventManager(long j);

    public static final native void delete_NLEVEOperationListener(long j);

    public static final native void delete_SpeedConfig(long j);

    public static final native long new_DLWCallback();

    public static final native long new_DynamicLightWaveUtil(long j, long j2, long j3, String str, String str2);

    public static final native long new_INLEApplyPatchCallback();

    public static final native long new_NLEAlgorithmCallbackWrapper();

    public static final native long new_NLEApplyPatchShims(long j, NLEModel nLEModel);

    public static final native long new_NLEAudioBeatTracking();

    public static final native long new_NLEBrushSaveCallbackWrapper();

    public static final native long new_NLECompileListenerWrapper();

    public static final native long new_NLEEffectMsgListenerWrapper();

    public static final native long new_NLEEffectMsgListenerWrapper2();

    public static final native long new_NLEEncodeListenerWrapper();

    public static final native long new_NLEInfoStickerBufferCallbackWrapper();

    public static final native long new_NLEListenerCompileTargetFileInfoPredictWrapper();

    public static final native long new_NLEListenerGetImageWrapper();

    public static final native long new_NLEMediaResourceManager();

    public static final native long new_NLEMediaSession(long j, NLEMediaConfig nLEMediaConfig);

    public static final native long new_NLEMediaUtil();

    public static final native long new_NLEOnFrameAvailableWrapper();

    public static final native long new_NLEResourceDownloadConfig();

    public static final native long new_NLEVEOperationEventManager();

    public static final native long new_NLEVEOperationListener();

    public static final native long new_SpeedConfig();

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static void SwigDirector_DLWCallback_compileDone(DLWCallback dLWCallback) {
        dLWCallback.compileDone();
    }

    public static void SwigDirector_NLECompileListenerWrapper_onCompileDone(NLECompileListenerWrapper nLECompileListenerWrapper) {
        nLECompileListenerWrapper.onCompileDone();
    }

    public static void SwigDirector_DLWCallback_compileError(DLWCallback dLWCallback, int i) {
        dLWCallback.compileError(i);
    }

    public static void SwigDirector_DLWCallback_onProgress(DLWCallback dLWCallback, float f) {
        dLWCallback.onProgress(f);
    }

    public static void SwigDirector_INLEApplyPatchCallback_onSuccess(INLEApplyPatchCallback iNLEApplyPatchCallback, long j) {
        NLEModel nLEModel;
        if (j == 0) {
            nLEModel = null;
        } else {
            nLEModel = new NLEModel(j, true);
        }
        iNLEApplyPatchCallback.onSuccess(nLEModel);
    }

    public static void SwigDirector_NLEAlgorithmCallbackWrapper_onProgress(NLEAlgorithmCallbackWrapper nLEAlgorithmCallbackWrapper, float f) {
        nLEAlgorithmCallbackWrapper.onProgress(f);
    }

    public static void SwigDirector_NLECompileListenerWrapper_onCompileProgress(NLECompileListenerWrapper nLECompileListenerWrapper, float f) {
        nLECompileListenerWrapper.onCompileProgress(f);
    }

    public static Object SwigDirector_NLEInfoStickerBufferCallbackWrapper_onGetBuffer(NLEInfoStickerBufferCallbackWrapper nLEInfoStickerBufferCallbackWrapper, String str) {
        return nLEInfoStickerBufferCallbackWrapper.onGetBuffer(str);
    }

    public static void SwigDirector_INLEApplyPatchCallback_onError(INLEApplyPatchCallback iNLEApplyPatchCallback, long j, String str) {
        NLEModel nLEModel;
        if (j == 0) {
            nLEModel = null;
        } else {
            nLEModel = new NLEModel(j, true);
        }
        iNLEApplyPatchCallback.onError(nLEModel, str);
    }

    public static void SwigDirector_INLEApplyPatchCallback_onProgress(INLEApplyPatchCallback iNLEApplyPatchCallback, long j, float f) {
        NLEModel nLEModel;
        if (j == 0) {
            nLEModel = null;
        } else {
            nLEModel = new NLEModel(j, true);
        }
        iNLEApplyPatchCallback.onProgress(nLEModel, f);
    }

    public static void SwigDirector_NLEBrushSaveCallbackWrapper_onDone(NLEBrushSaveCallbackWrapper nLEBrushSaveCallbackWrapper, String str, boolean z) {
        nLEBrushSaveCallbackWrapper.onDone(str, z);
    }

    public static void SwigDirector_NLECompileListenerWrapper_onCompileError(NLECompileListenerWrapper nLECompileListenerWrapper, int i, int i2, float f, String str) {
        nLECompileListenerWrapper.onCompileError(i, i2, f, str);
    }

    public static void SwigDirector_NLEEffectMsgListenerWrapper_onMessageReceived(NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper, int i, int i2, int i3, String str) {
        nLEEffectMsgListenerWrapper.onMessageReceived(i, i2, i3, str);
    }

    public static void SwigDirector_NLEEncodeListenerWrapper_onCompressBuffer(NLEEncodeListenerWrapper nLEEncodeListenerWrapper, byte[] bArr, long j, int i, boolean z) {
        nLEEncodeListenerWrapper.onCompressBuffer(bArr, j, i, z);
    }

    public static void SwigDirector_NLEListenerCompileTargetFileInfoPredictWrapper_onCompileTargetFileInfoPredict(NLEListenerCompileTargetFileInfoPredictWrapper nLEListenerCompileTargetFileInfoPredictWrapper, long j, long j2, boolean z, boolean z2) {
        nLEListenerCompileTargetFileInfoPredictWrapper.onCompileTargetFileInfoPredict(j, j2, z, z2);
    }

    public static boolean SwigDirector_NLEOnFrameAvailableWrapper_onGetFrame(NLEOnFrameAvailableWrapper nLEOnFrameAvailableWrapper, byte[] bArr, long j, long j2, long j3) {
        return nLEOnFrameAvailableWrapper.onGetFrame(bArr, j, j2, j3);
    }

    public static void SwigDirector_NLEEffectMsgListenerWrapper2_onMessageReceived(NLEEffectMsgListenerWrapper2 nLEEffectMsgListenerWrapper2, long j, BigInteger bigInteger, BigInteger bigInteger2, String str, boolean z) {
        nLEEffectMsgListenerWrapper2.onMessageReceived(j, bigInteger, bigInteger2, str, z);
    }

    public static int SwigDirector_NLEListenerGetImageWrapper_onGetImageDataCalled(NLEListenerGetImageWrapper nLEListenerGetImageWrapper, byte[] bArr, int i, int i2, int i3, float f) {
        return nLEListenerGetImageWrapper.onGetImageDataCalled(bArr, i, i2, i3, f);
    }

    public static void SwigDirector_NLEVEOperationListener_onVEOperationEvent(NLEVEOperationListener nLEVEOperationListener, int i, String str, long j, int i2, int i3) {
        NLEResourceNode nLEResourceNode;
        NLEVEOperationResType swigToEnum = NLEVEOperationResType.swigToEnum(i);
        if (j == 0) {
            nLEResourceNode = null;
        } else {
            nLEResourceNode = new NLEResourceNode(j);
        }
        nLEVEOperationListener.onVEOperationEvent(swigToEnum, str, nLEResourceNode, i2, NLERenderAction.swigToEnum(i3));
    }
}
