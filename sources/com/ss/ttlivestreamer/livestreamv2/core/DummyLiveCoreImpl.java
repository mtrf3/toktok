package com.ss.ttlivestreamer.livestreamv2.core;

import X.C5H3;
import X.C61878OQg;
import X.C68332mD;
import X.InterfaceC63833P3l;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.ss.ttlivestreamer.core.buffer.SurfaceWithExtData;
import com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.MediaSource;
import com.ss.ttlivestreamer.core.engine.MediaTrack;
import com.ss.ttlivestreamer.core.engine.VsyncModule;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.IInputAudioStream;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamOption;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamReport;
import com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.DummyAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.core.audiorecord.IAudioRecordManager;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLContext;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class DummyLiveCoreImpl extends LiveCore implements AudioDeviceModule.Observer, ILiveStream.ITextureFrameAvailableListener, ILiveStream.IAudioFrameAvailableListener {
    public final C5H3 mDummyFilterMgr$delegate = new C68332mD(FilterManager.createDummy());
    public final C5H3 mDummyAudioFilterManager$delegate = new C68332mD(new DummyAudioFilterManager());

    private final IAudioFilterManager getMDummyAudioFilterManager() {
        return (IAudioFilterManager) this.mDummyAudioFilterManager$delegate.getValue();
    }

    private final IFilterManager getMDummyFilterMgr() {
        return (IFilterManager) this.mDummyFilterMgr$delegate.getValue();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i, int i2) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i, int i2, int i3) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int addSeiField(String key, Object value, int i) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int addSeiField(String key, Object value, int i, boolean z, boolean z2) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int addSeiField(String key, Object value, int i, boolean z, boolean z2, int i2) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void addSurfaceAvailableListener(SurfaceWithExtData surface) {
        o.LJIIIZ(surface, "surface");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void addTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void addUserMetaData(String key, String value, int i) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean audioMute() {
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void catchMediaData(Bundle param, ILiveStream.CatchMediaDataCallback callback) {
        o.LJIIIZ(param, "param");
        o.LJIIIZ(callback, "callback");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void catchMediaData(Bundle param, ILiveStream.CatchPicCallback callback) {
        o.LJIIIZ(param, "param");
        o.LJIIIZ(callback, "callback");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void catchVideo(Bundle param, ILiveStream.CatchVideoCallback callback) {
        o.LJIIIZ(param, "param");
        o.LJIIIZ(callback, "callback");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void changeVideoBitrate(int i, int i2, int i3) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void changeVideoFps(int i) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void changeVideoResolution(int i, int i2) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public VideoFrameRenderer createFrameRender(View view, Handler handler, boolean z) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(handler, "handler");
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public VideoFrameRenderer createFrameRender(String name, int i, int i2) {
        o.LJIIIZ(name, "name");
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputAudioStream createInputAudioStream() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputAudioStream createInputAudioStream(String name) {
        o.LJIIIZ(name, "name");
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputVideoStream createInputVideoStream() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputVideoStream createInputVideoStream(String name) {
        o.LJIIIZ(name, "name");
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public IAVPlayer createPlayer() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public IPushFrameAfterCapture createPushFrameAfterCapture(int i, int i2) {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public MediaTrack createTrack(MediaSource source, String name) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(name, "name");
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void enableMirror(boolean z, boolean z2) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public boolean enableMirror(long j, boolean z) {
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void enableMixer(boolean z, boolean z2) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public AudioDeviceModule getADM() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean getAdaptedVideoResolution(int[] size) {
        o.LJIIIZ(size, "size");
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public IAudioDeviceControl getAudioDeviceControl() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public long getAudioEncodeTimeStamp(long j) {
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IAudioRecordManager getAudioRecorderMgr() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public View getCurrentDisplay() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public LiveCore.Builder getInternalBuilder() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public ILayerControl getLayerControl() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void getLiveCoreReportInfo(LiveStreamReport report) {
        o.LJIIIZ(report, "report");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean getLiveStreamInfo(LiveStreamReport report) {
        o.LJIIIZ(report, "report");
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public int getMirrorState() {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public LiveStreamOption getOption() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputAudioStream getOriginInputAudioStream() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputVideoStream getOriginInputVideoStream() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public boolean getPreviewFitMode() {
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public boolean getPreviewMirror(boolean z) {
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IRecorderManager getRecorderMgr() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public double getStaticsInfoWithKey(String str) {
        return -1.0d;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public long getTimestampForKey(int i) {
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public String getVersion() {
        return "";
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int getVideoCaptureDevice() {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IVideoCapturerControl getVideoCapturerControl() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public VsyncModule getVsyncModule() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public Handler getWorkThreadHandler() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean isEnableMixer(boolean z) {
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean isMirror(boolean z) {
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean isStreaming() {
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.Observer
    public void onADMInfo(int i, int i2, long j) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        o.LJIIIZ(buffer, "buffer");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void onInteractEvent(int i, int i2, Object... args) {
        o.LJIIIZ(args, "args");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public void onTextureFrameAvailable(EGLContext eglContext11, int i, boolean z, int i2, int i3, long j, float[] texMatrix, Object... extraDatas) {
        o.LJIIIZ(eglContext11, "eglContext11");
        o.LJIIIZ(texMatrix, "texMatrix");
        o.LJIIIZ(extraDatas, "extraDatas");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void pause() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushAudioFrame(ByteBuffer buffer, int i, int i2, int i3, int i4, long j) {
        o.LJIIIZ(buffer, "buffer");
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] texMatrix, long j) {
        o.LJIIIZ(texMatrix, "texMatrix");
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] texMatrix, long j, Bundle extraInfo) {
        o.LJIIIZ(texMatrix, "texMatrix");
        o.LJIIIZ(extraInfo, "extraInfo");
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer buffer, int i, int i2, int i3, long j) {
        o.LJIIIZ(buffer, "buffer");
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer bufferY, ByteBuffer bufferU, ByteBuffer bufferV, int i, int i2, int i3, long j) {
        o.LJIIIZ(bufferY, "bufferY");
        o.LJIIIZ(bufferU, "bufferU");
        o.LJIIIZ(bufferV, "bufferV");
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer[] buffers, int[] strides, int i, int i2, int i3, long j) {
        o.LJIIIZ(buffers, "buffers");
        o.LJIIIZ(strides, "strides");
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback cb) {
        o.LJIIIZ(executor, "executor");
        o.LJIIIZ(cb, "cb");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i, Cert cert) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void release() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void releaseBackgroundImage() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void removeSurfaceAvailableListener(SurfaceWithExtData surface) {
        o.LJIIIZ(surface, "surface");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void removeTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void requestKeyFrame() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void resetSdkParams() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void resume() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void sendSdkControlMsg(String issueJson) {
        o.LJIIIZ(issueJson, "issueJson");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setAudioMute(boolean z) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setAudioScenario(int i) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(String photoPath) {
        o.LJIIIZ(photoPath, "photoPath");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setBackgroundImageBitmap(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setDataListener(ILiveStream.ILiveStreamDataListener listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setDisplay(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setDisplay(View view, long j) {
        o.LJIIIZ(view, "view");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setDisplayMixBgColor(int i) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setDisplayPlanarRender(boolean z) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setDns(InterfaceC63833P3l dns) {
        o.LJIIIZ(dns, "dns");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setErrorListener(ILiveStream.ILiveStreamErrorListener listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setInfoListener(ILiveStream.ILiveStreamInfoListener listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setLowPowerLevel(int i) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setOnlyAddSeiToRTC(boolean z) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setOption(LiveStreamOption bundle) {
        o.LJIIIZ(bundle, "bundle");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setOriginAudioTrack(String track) {
        o.LJIIIZ(track, "track");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setOriginVideoTrack(String track) {
        o.LJIIIZ(track, "track");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setPreviewFitMode(boolean z) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setPreviewMirror(boolean z, boolean z2) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setPublishMixBgColor(int i) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setPublishPlanarRender(boolean z) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setPushStreamAfterServerMix(boolean z) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setRadioModeBgBitmap(Bitmap bitmap) {
        o.LJIIIZ(bitmap, "bitmap");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setRtcExtraDataListener(LiveCore.RtcExtraDataListener listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setSeiCurrentShiftDiffTime(long j) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void start(String url) {
        o.LJIIIZ(url, "url");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void start(List<String> urls) {
        o.LJIIIZ(urls, "urls");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void startAudioCapture() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public int startAudioPlayer() {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void startVideoCapture() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int status() {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void stop() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void stopAudioCapture() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public int stopAudioPlayer() {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void stopVideoCapture() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void switchAudioCapture(int i) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void switchAudioMode(int i) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void switchVideoCapture(int i) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback cb) {
        o.LJIIIZ(cb, "cb");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void unregisterScreenAudioPlayBack() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void updateSdkParams(TEBundle optBundle) {
        o.LJIIIZ(optBundle, "optBundle");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void updateSdkParams(String sdkParamsNew) {
        o.LJIIIZ(sdkParamsNew, "sdkParamsNew");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IAudioFilterManager getAudioFilterMgr() {
        return getMDummyAudioFilterManager();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IFilterManager getVideoFilterMgr() {
        IFilterManager mDummyFilterMgr = getMDummyFilterMgr();
        o.LJIIIIZZ(mDummyFilterMgr, "mDummyFilterMgr");
        return mDummyFilterMgr;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public List<String> getUrls() {
        return C61878OQg.INSTANCE;
    }
}
