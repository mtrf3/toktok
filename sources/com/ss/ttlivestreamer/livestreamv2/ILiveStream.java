package com.ss.ttlivestreamer.livestreamv2;

import X.InterfaceC63833P3l;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl;
import com.ss.ttlivestreamer.livestreamv2.core.audiorecord.IAudioRecordManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher;
import com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface ILiveStream {

    /* loaded from: classes12.dex */
    public interface CatchMediaDataCallback {
        void onComplete();

        void onCompleteOnce(String str, long j, long j2, int i, int i2, int i3);

        void onError(int i, String str);
    }

    /* loaded from: classes12.dex */
    public interface CatchPicCallback extends CatchMediaDataCallback {
        void onCatchedPic(boolean z, VideoCatcher videoCatcher);
    }

    /* loaded from: classes6.dex */
    public interface CatchVideoCallback extends CatchMediaDataCallback {
    }

    /* loaded from: classes12.dex */
    public interface IAudioFrameAvailableListener {
        void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j);
    }

    /* loaded from: classes12.dex */
    public interface ILiveStreamDataListener {
        void onData(int i, int i2, int i3);
    }

    /* loaded from: classes6.dex */
    public interface ILiveStreamErrorListener {
        void onError(int i, int i2, Exception exc);
    }

    /* loaded from: classes12.dex */
    public interface ILiveStreamInfoListener {
        void onInfo(int i, int i2, int i3);

        void onInfo(int i, int i2, String str);
    }

    /* loaded from: classes12.dex */
    public interface ITextureFrameAvailableListener {
        void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr);
    }

    void adaptedVideoResolution(int i, int i2);

    void adaptedVideoResolution(int i, int i2, int i3);

    int addSeiField(String str, Object obj, int i);

    int addSeiField(String str, Object obj, int i, boolean z, boolean z2);

    int addSeiField(String str, Object obj, int i, boolean z, boolean z2, int i2);

    void addUserMetaData(String str, String str2, int i);

    boolean audioMute();

    void catchMediaData(Bundle bundle, CatchMediaDataCallback catchMediaDataCallback);

    void catchMediaData(Bundle bundle, CatchPicCallback catchPicCallback);

    void catchVideo(Bundle bundle, CatchVideoCallback catchVideoCallback);

    void changeVideoBitrate(int i, int i2, int i3);

    void changeVideoFps(int i);

    void changeVideoResolution(int i, int i2);

    int configEffectDowngradingStrategy(JSONObject jSONObject);

    IInputAudioStream createInputAudioStream();

    IInputAudioStream createInputAudioStream(String str);

    IInputVideoStream createInputVideoStream();

    IInputVideoStream createInputVideoStream(String str);

    void enableMirror(boolean z, boolean z2);

    void enableMixer(boolean z, boolean z2);

    boolean getAdaptedVideoResolution(int[] iArr);

    long getAudioEncodeTimeStamp(long j);

    IAudioFilterManager getAudioFilterMgr();

    IAudioRecordManager getAudioRecorderMgr();

    boolean getLiveStreamInfo(LiveStreamReport liveStreamReport);

    LiveStreamOption getOption();

    IInputAudioStream getOriginInputAudioStream();

    IInputVideoStream getOriginInputVideoStream();

    IRecorderManager getRecorderMgr();

    double getStaticsInfoWithKey(String str);

    long getTimestampForKey(int i);

    String getVersion();

    int getVideoCaptureDevice();

    IVideoCapturerControl getVideoCapturerControl();

    IFilterManager getVideoFilterMgr();

    boolean isEnableMixer(boolean z);

    boolean isMirror(boolean z);

    boolean isStreaming();

    void pause();

    int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j);

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j);

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle);

    int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    int pushVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, long j);

    int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j);

    void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback);

    void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i);

    void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i, Cert cert);

    void release();

    void releaseBackgroundImage();

    void requestKeyFrame();

    void resume();

    void sendSdkControlMsg(String str);

    void setAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener);

    void setAudioMute(boolean z);

    void setAudioScenario(int i);

    void setBackGroundPhotoPath(Bitmap bitmap);

    void setBackGroundPhotoPath(String str);

    void setBackgroundImageBitmap(Bitmap bitmap);

    void setDataListener(ILiveStreamDataListener iLiveStreamDataListener);

    void setDns(InterfaceC63833P3l interfaceC63833P3l);

    void setErrorListener(ILiveStreamErrorListener iLiveStreamErrorListener);

    void setInfoListener(ILiveStreamInfoListener iLiveStreamInfoListener);

    void setLowPowerLevel(int i);

    void setOption(LiveStreamOption liveStreamOption);

    void setOriginAudioTrack(String str);

    void setOriginVideoTrack(String str);

    void setPublishMixBgColor(int i);

    void setPublishPlanarRender(boolean z);

    void setRadioModeBgBitmap(Bitmap bitmap);

    void setSeiCurrentShiftDiffTime(long j);

    void setTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener);

    void start(String str);

    void start(List<String> list);

    void startAudioCapture();

    void startVideoCapture();

    int status();

    void stop();

    void stopAudioCapture();

    void stopVideoCapture();

    void switchAudioCapture(int i);

    void switchAudioMode(int i);

    void switchVideoCapture(int i);

    int tryToExecuteEffectDowningStrategy(int i, int i2);

    int turnOffEffectDowngradingStrategy();

    void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback);

    void unregisterScreenAudioPlayBack();

    void updateSdkParams(TEBundle tEBundle);

    void updateSdkParams(String str);
}
