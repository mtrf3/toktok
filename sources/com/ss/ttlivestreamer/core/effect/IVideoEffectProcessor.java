package com.ss.ttlivestreamer.core.effect;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface IVideoEffectProcessor {

    /* loaded from: classes12.dex */
    public interface EffectMsgListener {
        void onMessageReceived(int i, int i2, int i3, String str);
    }

    /* loaded from: classes12.dex */
    public interface ExpressionBundle {
        float getAngryScore();

        float getArousal();

        float getAttractive();

        float getBlurScore();

        float getBoyProb();

        float getEge();

        int getExpressionType();

        float getHappyScore();

        float getIllumination();

        float getLipstickProb();

        float getMaskProb();

        float getMustacheProb();

        float getQuality();

        float getRealFaceProb();

        float getSadScore();

        float getSurpriseScore();

        float getValence();

        float getWearGlassProb();

        float getWearHatProb();

        float getWearSunglassProb();
    }

    /* loaded from: classes12.dex */
    public interface ExpressionDetectListener {
        void onExpressionDetectResultCallback(ExpressionBundle[] expressionBundleArr);
    }

    /* loaded from: classes6.dex */
    public interface FaceDetectListener {
        void onFaceDetectResultCallback(int i);
    }

    /* loaded from: classes12.dex */
    public interface IEffectInfoChangeListener {
        void onEffectInfoChange(String str, String str2, int i, int i2);

        void onLicenseInfoChange(String str, int i);
    }

    /* loaded from: classes12.dex */
    public interface MicrophoneDetectListener {
        void onMicrophoneDetectResultCallback(float f);
    }

    int composerAppendNodes(String[] strArr, int i);

    int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerCheckNodeExclusion(String str, String str2, int[] iArr);

    int composerExclusionCompare(String str, String str2, String str3, int[] iArr);

    int composerReloadNodes(String[] strArr, int i);

    int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerRemoveNodes(String[] strArr, int i);

    int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    int composerSetMode(int i, int i2);

    int composerSetNodes(String[] strArr, int i);

    int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr);

    int composerUpdateNode(String str, String str2, float f);

    void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3);

    void configGpuTurboBeforeProcessEffect(int i, int i2, boolean z);

    int destroyEffectAudioHandler();

    boolean detectFaceFromBitMap(Bitmap bitmap);

    int effectAudioProcessData(ByteBuffer byteBuffer, int i, int i2, int i3);

    int effectAudioSetPlaybackDeviceType(int i);

    void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    int enableFindContour(boolean z, String str);

    int enableMockFace(boolean z);

    ByteBuffer getContourInfo(EffectWrapper.AlgorithmResult algorithmResult);

    AudioDeviceModule.AudioRenderSink getEffectAudioRender();

    String getEffectVersion();

    int getFaceCount();

    float getFilterIntensity(String str);

    String getFrameCostStatistics();

    String getFrameProgressParams();

    void insertEffectLicense(String str);

    boolean isAudioRecognizeAvailable();

    boolean isEffectGpuTurboEnable();

    String name();

    int notifyKeyboardHide(boolean z);

    int pauseEffect();

    int process(int i, int i2, int i3, int i4, int i5, long j, boolean z);

    int process(int i, int i2, int i3, int i4, int i5, RoiInfo roiInfo, long j, boolean z, long j2);

    void processDoubleClickEvent(float f, float f2);

    void processLongPressEvent(float f, float f2);

    void processPanEvent(float f, float f2, float f3, float f4, float f5);

    void processRotationEvent(float f, float f2);

    void processScaleEvent(float f, float f2);

    void processTouchDownEvent(float f, float f2, int i);

    void processTouchEvent(float f, float f2);

    void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2);

    void processTouchUpEvent(float f, float f2, int i);

    int processV2(int i, int i2, int i3, int i4, int i5, RoiInfo roiInfo, long[] jArr, boolean z, long j);

    void release();

    void releaseContetDetector();

    int resetFrameCostStatistics();

    int resumeEffect();

    int sendEffectMsg(int i, int i2, int i3, String str);

    void setAlgorithmAB(boolean z);

    int setAssetManager(AssetManager assetManager);

    int setAudioRecognizeDict(Map<String, String[]> map);

    int setBeautify(String str, float f, float f2);

    int setBeautify(String str, float f, float f2, float f3);

    void setContourInfoIndex(String str);

    int setCustomEffect(String str, String str2);

    int setCustomEffectBitmap(String str, Bitmap bitmap);

    int setCustomEffectOrientation(String str, int i);

    void setDoubleViewRect(double d, double d2, double d3, double d4);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    int setEffectABInfo(JSONObject jSONObject, String str);

    int setEffectLicense(String str);

    void setEffectLogLevel(int i);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    void setEnableAlgorithmSyncer(boolean z);

    void setEnableThreeBuffer(boolean z);

    void setExpressionDetectListener(ExpressionDetectListener expressionDetectListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f);

    int setFilter(String str, float f, boolean z);

    int setFilter(String str, String str2, float f, float f2, float f3);

    int setFilter(String str, String str2, float f, float f2, float f3, boolean z);

    int setInputText(String str, int i, int i2, String str2);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    void setMusicNodeFilePath(String str);

    void setRenderCacheInt(String str, int i);

    void setRenderCacheString(String str, String str2);

    int setReshape(String str, float f, float f2);

    int setResourceFinder(Object obj);

    int setSendContourInfoType(int i);

    int setupEffectAudioHandler();

    int startAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3);

    int startEffectAudio();

    int stopEffectAudio();

    boolean valid();
}
