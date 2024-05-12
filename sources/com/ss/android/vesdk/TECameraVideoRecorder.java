package com.ss.android.vesdk;

import X.AbstractC84025WyL;
import X.AbstractC84033WyT;
import X.C63965P8n;
import X.C63975P8x;
import X.C84073Wz7;
import X.C84074Wz8;
import X.C84075Wz9;
import X.C84076WzA;
import X.C84077WzB;
import X.ICH;
import X.InterfaceC63955P8d;
import X.InterfaceC63961P8j;
import X.InterfaceC84057Wyr;
import X.InterfaceC84058Wys;
import X.OOG;
import X.X09;
import X.X0H;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.vesdk.VERecorder;
import java.util.Map;

/* loaded from: classes15.dex */
public class TECameraVideoRecorder extends AbstractC84025WyL {
    @Override // X.AbstractC84025WyL
    public void addSticker(Bitmap bitmap, int i, int i2) {
    }

    @Override // X.AbstractC84025WyL
    public int animateImageToPreview(String str, String str2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int appendComposerNodes(String[] strArr, int i) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void capture(int i, int i2, int i3, boolean z, boolean z2, InterfaceC84058Wys interfaceC84058Wys, InterfaceC84057Wyr interfaceC84057Wyr) {
    }

    @Override // X.AbstractC84025WyL
    public void capture(int i, boolean z, boolean z2, InterfaceC84058Wys interfaceC84058Wys, InterfaceC84057Wyr interfaceC84057Wyr) {
    }

    @Override // X.AbstractC84025WyL
    public void changeDuetVideo(String str, String str2) {
    }

    @Override // X.AbstractC84025WyL
    public void changeRecordMode(VERecordMode vERecordMode) {
    }

    @Override // X.AbstractC84025WyL
    public int changeSurface(Surface surface) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int[] checkComposerNodeExclusion(String str, String str2) {
        return new int[0];
    }

    @Override // X.AbstractC84025WyL
    public int[] checkComposerNodeExclusion(String str, String str2, String str3) {
        return new int[0];
    }

    @Override // X.AbstractC84025WyL
    public void clearSticker() {
    }

    @Override // X.AbstractC84025WyL
    public int concat(String str, String str2, int i, String str3, String str4) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int concat(String str, String str2, int i, String str3, String str4, int i2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void deleteLastFrag() {
    }

    @Override // X.AbstractC84025WyL
    public void disableRender(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void enableAudio(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void enableDuetMicRecord(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void enableEffect(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void enableFaceBeautifyDetect(int i) {
    }

    @Override // X.AbstractC84025WyL
    public void enableFaceExtInfo(int i) {
    }

    @Override // X.AbstractC84025WyL
    public void enableScan(boolean z, long j) {
    }

    @Override // X.AbstractC84025WyL
    public void enableSceneRecognition(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void enableSkeletonDetect(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void enableSmartBeauty(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void enableStickerRecognition(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public float[] getAECSuggestVolume() {
        return new float[0];
    }

    @Override // X.AbstractC84025WyL
    public float getCameraFps() {
        return 0.0f;
    }

    @Override // X.AbstractC84025WyL
    public String getComposerNodePaths() {
        return null;
    }

    @Override // X.AbstractC84025WyL
    public float getComposerNodeValue(String str, String str2) {
        return 0.0f;
    }

    @Override // X.AbstractC84025WyL
    public String getDuetAudioPath() {
        return null;
    }

    @Override // X.AbstractC84025WyL
    public long getEndFrameTime() {
        return 0L;
    }

    @Override // X.AbstractC84025WyL
    public EnigmaResult getEnigmaResult() {
        return null;
    }

    @Override // X.AbstractC84025WyL
    public float getFilterIntensity(String str) {
        return 0.0f;
    }

    @Override // X.AbstractC84025WyL
    public String getReactAudioPath() {
        return null;
    }

    @Override // X.AbstractC84025WyL
    public int[] getReactRegionInRecordVideoPixel() {
        return new int[0];
    }

    @Override // X.AbstractC84025WyL
    public int[] getReactRegionInViewPixel() {
        return new int[0];
    }

    @Override // X.AbstractC84025WyL
    public int[] getReactionPosMarginInViewPixel() {
        return new int[0];
    }

    @Override // X.AbstractC84025WyL
    public float getReactionWindowRotation() {
        return 0.0f;
    }

    @Override // X.AbstractC84025WyL
    public ICH getVideoController() {
        return null;
    }

    @Override // X.AbstractC84025WyL
    public void handleEffectAudioPlay(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void initFaceBeautifyDetectExtParam(C84074Wz8 c84074Wz8) {
    }

    @Override // X.AbstractC84025WyL
    public void initFaceBeautyDetectExtParam(C84075Wz9 c84075Wz9) {
    }

    @Override // X.AbstractC84025WyL
    public void initFaceDetectExtParam(C84073Wz7 c84073Wz7) {
    }

    @Override // X.AbstractC84025WyL
    public void initHDRNetDetectExtParam(C84076WzA c84076WzA) {
    }

    @Override // X.AbstractC84025WyL
    public void initHandDetectExtParam(C84077WzB c84077WzB) {
    }

    @Override // X.AbstractC84025WyL
    public boolean isGestureRegistered(OOG oog) {
        return false;
    }

    @Override // X.AbstractC84025WyL
    public void pauseEffectAudio(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public boolean posInReactionRegion(int i, int i2) {
        return false;
    }

    @Override // X.AbstractC84025WyL
    public void preventTextureRender(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public boolean previewDuetVideo() {
        return false;
    }

    @Override // X.AbstractC84025WyL
    public int processTouchEvent(float f, float f2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public boolean processTouchEvent(VETouchPointer vETouchPointer, int i) {
        return false;
    }

    @Override // X.AbstractC84025WyL
    public void recoverCherEffect(VECherEffectParam vECherEffectParam) {
    }

    @Override // X.AbstractC84025WyL
    public int reloadComposerNodes(String[] strArr, int i) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int removeComposerNodes(String[] strArr, int i) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int replaceComposerNodes(String[] strArr, int i, String[] strArr2, int i2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public float rotateReactionWindow(float f) {
        return 0.0f;
    }

    @Override // X.AbstractC84025WyL
    public int[] scaleReactionWindow(float f) {
        return new int[0];
    }

    @Override // X.AbstractC84025WyL
    public void sendEffectMsg(int i, long j, long j2, String str) {
    }

    @Override // X.AbstractC84025WyL
    public int setAlgorithmPreConfig(int i, int i2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setBeautyFace(int i, String str) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setBeautyFaceIntensity(float f, float f2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setBeautyIntensity(int i, float f) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void setCameraFirstFrameOptimize(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void setCaptureMirror(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public int setComposerMode(int i, int i2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setComposerNodes(String[] strArr, int i) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setComposerResourcePath(String str) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void setCustomVideoBg(String str, String str2, String str3) {
    }

    @Override // X.AbstractC84025WyL
    public void setDLEEnable(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void setDeviceRotation(float[] fArr) {
    }

    @Override // X.AbstractC84025WyL
    public void setDropFrame(int i) {
    }

    @Override // X.AbstractC84025WyL
    public void setDuetVideoCompleteCallback(Runnable runnable) {
    }

    @Override // X.AbstractC84025WyL
    public void setEffectBgmEnable(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public int setEffectMaxMemoryCache(int i) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setEnableAEC(boolean z, String str) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void setEnableDuetV2(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public int setEnableLoudness(boolean z, int i) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setFaceMakeUp(String str) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setFaceMakeUp(String str, float f, float f2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setFaceReshape(String str, float f, float f2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setFilter(String str, float f, boolean z) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void setFilter(String str, String str2, float f) {
    }

    @Override // X.AbstractC84025WyL
    public int setFilterNew(String str, float f) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void setFilterNew(String str, String str2, float f, float f2, float f3) {
    }

    @Override // X.AbstractC84025WyL
    public int setMaleMakeupState(boolean z) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void setPreviewDuetVideoPaused(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void setPreviewRatio(int i, float f, VESize vESize, VESize vESize2) {
    }

    @Override // X.AbstractC84025WyL
    public void setPreviewRotation(int i) {
    }

    @Override // X.AbstractC84025WyL
    public void setReactPosMarginInVideoRecordPixel(int i, int i2, int i3, int i4) {
    }

    @Override // X.AbstractC84025WyL
    public void setReactionBorderParam(int i, int i2) {
    }

    @Override // X.AbstractC84025WyL
    public boolean setReactionMaskImagePath(String str, boolean z) {
        return false;
    }

    @Override // X.AbstractC84025WyL
    public void setRenderCacheString(String str, String str2) {
    }

    @Override // X.AbstractC84025WyL
    public void setRenderCacheTexture(String str, String str2) {
    }

    @Override // X.AbstractC84025WyL
    public int setReshapeIntensity(int i, float f) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setReshapeIntensityDict(Map<Integer, Float> map) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setReshapeParam(String str, Map<Integer, Float> map) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setReshapeResource(String str) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void setScanArea(float f, float f2, float f3, float f4) {
    }

    @Override // X.AbstractC84025WyL
    public boolean setSharedTextureStatus(boolean z) {
        return false;
    }

    @Override // X.AbstractC84025WyL
    public int setSkinTone(String str) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int setSkinToneIntensity(float f) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
    }

    @Override // X.AbstractC84025WyL
    public void setSwapDuetRegion(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public void setSwapReactionRegion(boolean z) {
    }

    @Override // X.AbstractC84025WyL
    public int setVEEffectParams(VEEffectParams vEEffectParams) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void setVideoBgSpeed(double d) {
    }

    @Override // X.AbstractC84025WyL
    public int shotScreen(int i, int i2, boolean z, InterfaceC63955P8d interfaceC63955P8d, boolean z2, VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback, boolean z3) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int shotScreen(int i, int i2, boolean z, boolean z2, InterfaceC63955P8d interfaceC63955P8d) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int shotScreen(int i, int i2, boolean z, boolean z2, VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback, boolean z3) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int shotScreen(C63965P8n c63965P8n) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int shotScreen(String str, int i, int i2, boolean z, boolean z2, Bitmap.CompressFormat compressFormat, InterfaceC63961P8j interfaceC63961P8j) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int shotScreen(String str, int i, int i2, boolean z, boolean z2, Bitmap.CompressFormat compressFormat, InterfaceC63961P8j interfaceC63961P8j, boolean z3) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamDeviceConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamGetTextBitmap(X09 x09) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamGetTextLimitCount(X0H x0h) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamGetTextParagraphContent(X0H x0h) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamNotifyHideKeyBoard(boolean z) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamProcessDoubleClickEvent(float f, float f2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamProcessIngestAcc(double d, double d2, double d3, double d4) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamProcessIngestGra(double d, double d2, double d3, double d4) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamProcessIngestGyr(double d, double d2, double d3, double d4) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamProcessIngestOri(double[] dArr, double d) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamProcessPanEvent(float f, float f2, float f3, float f4, float f5) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamProcessRotationEvent(float f, float f2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamProcessScaleEvent(float f, float f2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamProcessTouchEventByType(int i, float f, float f2, int i2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamSetInputText(String str, int i, int i2, String str2) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int slamSetLanguage(String str) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public void startAudioRecorder() {
    }

    @Override // X.AbstractC84025WyL
    public void startPreview(Surface surface) {
    }

    @Override // X.AbstractC84025WyL
    public void stopAudioRecorder() {
    }

    @Override // X.AbstractC84025WyL
    public void stopPreview() {
    }

    @Override // X.AbstractC84025WyL
    public int stopRecord() {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int stopRecord(boolean z) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public boolean suspendGestureRecognizer(OOG oog, boolean z) {
        return false;
    }

    @Override // X.AbstractC84025WyL
    public void updateAlgorithmRuntimeParam(int i, float f) {
    }

    @Override // X.AbstractC84025WyL
    public int updateComposerNode(String str, String str2, float f) {
        return 0;
    }

    @Override // X.AbstractC84025WyL
    public int[] updateReactionRegion(int i, int i2, int i3, int i4, float f) {
        return new int[0];
    }

    @Override // X.AbstractC84025WyL
    public void updateRotation(float f, float f2, float f3) {
    }

    @Override // X.AbstractC84025WyL
    public void useMusic(boolean z) {
    }

    public TECameraVideoRecorder(Context context, AbstractC84033WyT abstractC84033WyT, C63975P8x c63975P8x) {
        super(context, abstractC84033WyT, c63975P8x);
    }
}
