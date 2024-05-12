package com.ss.ttlivestreamer.livestreamv2.filter;

import android.graphics.Bitmap;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamGpuTurboWrapper;
import com.ss.ttlivestreamer.livestreamv2.utils.AdaptResolutionUtils;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface IFilterManager {

    /* loaded from: classes12.dex */
    public interface ContourDataCallBack {
        void onReceivedLocalData(FindContourInfo findContourInfo);

        void onReceivedRemoteData(FindContourInfo findContourInfo);
    }

    /* loaded from: classes12.dex */
    public interface ContourInfoListener {
        void onReceivedData(FindContourInfo findContourInfo, int i, int i2);
    }

    /* loaded from: classes12.dex */
    public interface EffectMsgListener extends IVideoEffectProcessor.EffectMsgListener {
    }

    /* loaded from: classes12.dex */
    public interface ErrorListener {
        void onError(int i, String str);
    }

    /* loaded from: classes12.dex */
    public interface ExpressionDetectListener extends IVideoEffectProcessor.ExpressionDetectListener {
    }

    /* loaded from: classes6.dex */
    public interface FaceDetectListener extends IVideoEffectProcessor.FaceDetectListener {
    }

    /* loaded from: classes12.dex */
    public interface FindContourListener {
        void onSendFindContourSei(ByteBuffer byteBuffer, long j, int i);
    }

    /* loaded from: classes12.dex */
    public interface MicrophoneDetectListener extends IVideoEffectProcessor.MicrophoneDetectListener {
    }

    int composerAppendNodes(String[] strArr, int i);

    int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2, boolean z, boolean z2, boolean z3);

    int composerCheckNodeExclusion(String str, String str2, int[] iArr);

    int composerExclusionCompare(String str, String str2, String str3, int[] iArr);

    int composerReloadNodes(String[] strArr, int i);

    int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerRemoveNodes(String[] strArr, int i);

    int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    int composerSetMode(int i, int i2);

    int composerSetNodes(String[] strArr, int i);

    int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2, boolean z, boolean z2, boolean z3);

    int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr);

    int composerUpdateNode(String str, String str2, float f);

    void configGpuTurbo(LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper, AdaptResolutionUtils adaptResolutionUtils);

    IAudioStrangeVoice createAudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2, boolean z);

    void destroyAudioGraphStickerContext();

    boolean detectFaceFromBitMap(Bitmap bitmap);

    void enable(boolean z);

    void enableAutoBrightenFilter(boolean z);

    void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    int enableFindContour(boolean z, String str);

    int enableMockFace(boolean z);

    void forceOutput2DTex(boolean z);

    String getABDefaultInfoFromEffect(String str);

    int getBufferBlockCnd();

    ContourDataCallBack getContourDataCallBack();

    long getEffectAudioQuirk();

    float getEffectAudioVolume();

    EffectImageInfo getEffectCapturedImagewithKey(String str);

    long getEffectNativeHandler();

    int getEffectProcessError();

    String getEffectVersion();

    int getFaceCount();

    float getFilterIntensity(String str);

    String getFrameCostStatistics();

    String getFrameProgressParams();

    String getVersion();

    IVideoEffectProcessor getVideoEffectProcessor();

    boolean isEnable();

    boolean isEnableFindContour();

    boolean isValid();

    String name();

    int notifyKeyboardHide(boolean z);

    int pauseEffect();

    void processDoubleClickEvent(float f, float f2);

    void processLongPressEvent(float f, float f2);

    void processPanEvent(float f, float f2, float f3, float f4, float f5);

    void processRotationEvent(float f, float f2);

    void processScaleEvent(float f, float f2);

    void processTouchDownEvent(float f, float f2, int i);

    void processTouchEvent(float f, float f2);

    void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2);

    void processTouchUpEvent(float f, float f2, int i);

    void releaseContetDetector();

    int resetFrameCostStatistics();

    int resumeEffect();

    int sendEffectMsg(int i, int i2, int i3, String str);

    void setABInfoToEffect(JSONObject jSONObject, String str);

    int setAudioRecognizeDict(Map<String, String[]> map);

    int setBeautify(String str, float f, float f2);

    int setBeautify(String str, float f, float f2, float f3);

    void setContourDataCallBack(ContourDataCallBack contourDataCallBack);

    void setContourDataSendInterval(int i);

    void setContourInfoIndex(String str);

    int setCustomEffect(String str, String str2);

    int setCustomEffectOrientation(String str, int i);

    int setCustomEffectWithUri(String str, String str2, int i, int i2);

    void setDoubleViewRect(double d, double d2, double d3, double d4);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    void setEffectAudioQuirk(long j);

    void setEffectAudioVolume(float f);

    void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    void setErrorListener(ErrorListener errorListener);

    void setExpressionDetectListener(ExpressionDetectListener expressionDetectListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f);

    int setFilter(String str, float f, boolean z);

    int setFilter(String str, String str2, float f, float f2, float f3);

    int setFilter(String str, String str2, float f, float f2, float f3, boolean z);

    void setFindContourListener(FindContourListener findContourListener);

    int setInputText(String str, int i, int i2, String str2);

    void setLicenseToEffect(String str);

    void setLicenseToEffect(String str, boolean z);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    void setMusicNodeFilePath(String str);

    void setRenderCacheInt(String str, int i);

    void setRenderCacheString(String str, String str2);

    void setRenderSinkOnlyMixWithRTC(boolean z);

    int setReshape(String str, float f, float f2);

    void setSendContourInfoType(int i);

    void setupAudioGraphStickerContext(boolean z, boolean z2, boolean z3);

    int startAudioRecognize();

    int startEffectAudio();

    int stopAudioRecognize();

    int stopEffectAudio();

    void updateEffAudioTimestampMs(long j);
}
