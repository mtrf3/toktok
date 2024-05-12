package com.ss.avframework.livestreamv2.core.interact;

import X.Q89;
import X.V0N;
import X.X1D;
import android.graphics.Bitmap;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.realx.video.EglBase;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCEngineWrapper;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.publicstream.PublicStreaming;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.SurfaceWithExtData;
import java.nio.ByteBuffer;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface Client {

    /* loaded from: classes12.dex */
    public interface IAudioFrameObserver {
        void onMixedAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        void onRecordAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

        boolean wantMixedAudioFrame();

        boolean wantPlaybackAudioFrame();

        boolean wantRecordAudioFrame();
    }

    /* loaded from: classes12.dex */
    public interface ICatchedVideoFrameCallback {
        void onCatchedVideoFrameCallback(String str, ByteBuffer byteBuffer, int i, int i2);
    }

    /* loaded from: classes12.dex */
    public interface InteractEventListener {
        void notifyLiveStreamAdjustResolution(Client client, boolean z, int i, int i2);

        void onInteractInfoReport(Client client, String str, int i, long j, Object... objArr);

        void onInteractStart(Client client);

        void onInteractStop(Client client);
    }

    /* loaded from: classes12.dex */
    public interface Listener {
        void onError(Client client, int i, long j, Exception exc);

        void onInfo(Client client, int i, long j, Object... objArr);
    }

    /* loaded from: classes12.dex */
    public static class RTCAudioVolumeIndication {
        public float volumeIndicationInterval = 2.0f;
        public int talkVolume = 25;
        public boolean isAddVolumeValue = true;
        public RTCAudioVolumeIndicationContentMode contentMode = RTCAudioVolumeIndicationContentMode.VOLUME_INDICATION_CONTENT_MODE_VOLUME_ONLY;
    }

    /* loaded from: classes12.dex */
    public enum RTCStreamIndex {
        STREAM_INDEX_MAIN(0),
        STREAM_INDEX_SCREEN(1);

        public int value;

        @Override // java.lang.Enum
        public String toString() {
            if (this == STREAM_INDEX_MAIN) {
                return "kStreamIndexMain";
            }
            return "kStreamIndexScreen";
        }

        public int value() {
            return this.value;
        }

        public static RTCStreamIndex valueOf(String str) {
            return (RTCStreamIndex) V0N.LJJJ(RTCStreamIndex.class, str);
        }

        RTCStreamIndex(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes12.dex */
    public interface StreamMixer {
        String mixStream(int i, int i2, List<Region> list);

        boolean updateMixAudioVolumeIndication(RTCAudioVolumeIndication rTCAudioVolumeIndication);

        boolean updateMixSpatialAudio(RTCSpatialAudioPosition rTCSpatialAudioPosition, RTCSpatialAudioHumanOrientation rTCSpatialAudioHumanOrientation);
    }

    int addWaterMarkWithId(String str, RTCWaterMarkRegion rTCWaterMarkRegion, long j);

    int composeCurrentWaterMarks();

    RTCRoom createRtcRoom();

    void disableRtcPhoneListener();

    void dispose();

    void enableAllRemoteRender(boolean z);

    void enableAllRemoteRender(boolean z, boolean z2);

    void enableRtcPhoneListener();

    void enableSpatialAudioRender(boolean z);

    void enableVideoBFrameOnMixStream(boolean z);

    String getBusinessId();

    Config getConfig();

    JSONObject getDebugInfo();

    boolean getLocalAudioStreamMuteState();

    boolean getLocalVideoStreamMuteState();

    MixStreamParamInfo getMixStreamParamInfo();

    JSONArray getRemoteVideoFrozenInfo();

    RTCVideo getRtcEngine();

    RTCEngineWrapper getRtcEngineWrapper();

    RTCRoom getRtcRoom();

    IRTCRoomEventHandler getRtcRoomHandler();

    String getRtcRoomId();

    JSONArray getVideoE2EDelayMSec();

    void invalidateSei();

    boolean isClientMix();

    boolean isDualStream();

    boolean isGuest();

    boolean isMultiRoomClient();

    boolean isNeedPublishFrame();

    void joinChannel();

    void muteAllRemoteAudioStreams(boolean z);

    void muteAllRemoteVideoStreams(boolean z);

    void muteLocalAudio(boolean z);

    void muteLocalVideo(boolean z);

    void muteRemoteAudioStream(String str, boolean z);

    void muteRemoteVideoStream(String str, boolean z);

    void onServerMixSuccess();

    void pause();

    void pauseForwardStreamToAllRooms();

    boolean pushSurfaceExternalVideoFrame(SurfaceTextureHelper surfaceTextureHelper, SurfaceWithExtData surfaceWithExtData, int i, float[] fArr, EglBase eglBase);

    int removeAllWaterMarks();

    int removeWaterMarkWithId(String str);

    void resume();

    void resumeForwardStreamToAllRooms();

    long sendRoomMessage(String str);

    void sendSdkControlMsg(String str);

    long sendUserMessage(String str, String str2);

    void setAudioFrameObserver(int i, int i2, IAudioFrameObserver iAudioFrameObserver);

    void setAudioScenario(int i);

    void setBusinessId(String str);

    void setCatchedVideoFrameCallback(String str, ICatchedVideoFrameCallback iCatchedVideoFrameCallback);

    void setDirectRtcEventCallback(IRTCEngineEventHandler iRTCEngineEventHandler);

    void setFitMode(String str, boolean z);

    void setInteractEventListener(InteractEventListener interactEventListener);

    void setListener(Listener listener);

    void setLocalTimeGapWithServer(int i);

    int setLocalVideoDenoiseMode(RTCStreamIndex rTCStreamIndex, boolean z);

    void setMirror(boolean z, boolean z2);

    void setOnlyConsumeAllRemoteSei(boolean z);

    void setOnlyConsumeRemoteSei(String str, boolean z);

    void setPerformanceProfile(PerformanceProfile performanceProfile);

    int setPublicStreamVideoCanvas(String str, VideoCanvas videoCanvas);

    void setPublicStreamVideoSink(String str, IVideoSink iVideoSink, int i);

    void setRemoteAudioPlaybackVolume(String str, float f);

    int setRemoteVideoSuperResolution(RTCRemoteStreamInfo rTCRemoteStreamInfo, boolean z);

    void setSingleViewMode(boolean z);

    void start();

    void start(Cert cert);

    int startChorus(boolean z, boolean z2);

    int startForwardStreamToRooms(List<ForwardRoomInfo> list);

    void startInteract();

    void startInteract(Cert cert);

    int startPlayPublicStream(String str);

    void startPushData();

    int startPushPublicStream(String str, PublicStreaming publicStreaming);

    void stop();

    void stop(Cert cert);

    int stopChorus();

    void stopForwardStreamToRooms();

    void stopLiveCore();

    int stopPlayPublicStream(String str);

    int stopPushPublicStream(String str);

    void switchAudio(boolean z);

    void switchInteractMode(Config.InteractMode interactMode);

    void switchMixType(Config.MixStreamType mixStreamType);

    void updateAudioScene(String str);

    void updateAuthInfo(JSONObject jSONObject, FrameType frameType);

    int updateForwardStreamToRooms(List<ForwardRoomInfo> list);

    int updateListenerSpatialAudioOrientation(RTCSpatialAudioHumanOrientation rTCSpatialAudioHumanOrientation);

    int updateListenerSpatialAudioPosition(RTCSpatialAudioPosition rTCSpatialAudioPosition);

    int updatePublicStreamParam(String str, PublicStreaming publicStreaming);

    void updateRtcExtInfo(String str);

    void updateSdkParams(String str);

    int updateSpatialAudioPosition(RTCSpatialAudioPosition rTCSpatialAudioPosition);

    int updateSpatialAudioSelfOrientation(RTCSpatialAudioHumanOrientation rTCSpatialAudioHumanOrientation);

    int updateWaterMarkWithId(String str, RTCWaterMarkRegion rTCWaterMarkRegion, long j);

    /* loaded from: classes12.dex */
    public static class MixStreamParamInfo {
        public final boolean enableBFrame;
        public final int mixAudioBitrate;
        public final int mixAudioChannel;
        public final String mixAudioCodec;
        public final int mixAudioSampleRate;
        public final Config.MixStreamType mixType;
        public final int mixVideoBitrate;
        public final Config.VideoCodec mixVideoCodec;
        public final int mixVideoFps;
        public final float mixVideoGop;
        public final int mixVideoHeight;
        public final Config.VideoProfile mixVideoProfile;
        public final int mixVideoWidth;
        public final String publishUrl;
        public final String roomId;
        public final String taskId;
        public final String userId;

        /* loaded from: classes12.dex */
        public static class Builder {
            public boolean enableBFrame;
            public int mixAudioBitrate;
            public int mixAudioChannel;
            public String mixAudioCodec = "aac";
            public int mixAudioSampleRate;
            public Config.MixStreamType mixType;
            public int mixVideoBitrate;
            public Config.VideoCodec mixVideoCodec;
            public int mixVideoFps;
            public float mixVideoGop;
            public int mixVideoHeight;
            public Config.VideoProfile mixVideoProfile;
            public int mixVideoWidth;
            public String publishUrl;
            public String roomId;
            public String taskId;
            public String userId;

            public MixStreamParamInfo build() {
                return new MixStreamParamInfo(this);
            }

            public Builder setEnableBFrame(boolean z) {
                this.enableBFrame = z;
                return this;
            }

            public Builder setMixAudioBitrate(int i) {
                this.mixAudioBitrate = i;
                return this;
            }

            public Builder setMixAudioChannel(int i) {
                this.mixAudioChannel = i;
                return this;
            }

            public Builder setMixAudioCodec(String str) {
                this.mixAudioCodec = str;
                return this;
            }

            public Builder setMixAudioSampleRate(int i) {
                this.mixAudioSampleRate = i;
                return this;
            }

            public Builder setMixType(Config.MixStreamType mixStreamType) {
                this.mixType = mixStreamType;
                return this;
            }

            public Builder setMixVideoBitrate(int i) {
                this.mixVideoBitrate = i;
                return this;
            }

            public Builder setMixVideoCodec(Config.VideoCodec videoCodec) {
                this.mixVideoCodec = videoCodec;
                return this;
            }

            public Builder setMixVideoFps(int i) {
                this.mixVideoFps = i;
                return this;
            }

            public Builder setMixVideoGop(float f) {
                this.mixVideoGop = f;
                return this;
            }

            public Builder setMixVideoHeight(int i) {
                this.mixVideoHeight = i;
                return this;
            }

            public Builder setMixVideoProfile(Config.VideoProfile videoProfile) {
                this.mixVideoProfile = videoProfile;
                return this;
            }

            public Builder setMixVideoWidth(int i) {
                this.mixVideoWidth = i;
                return this;
            }

            public Builder setPublishUrl(String str) {
                this.publishUrl = str;
                return this;
            }

            public Builder setRoomId(String str) {
                this.roomId = str;
                return this;
            }

            public Builder setTaskId(String str) {
                this.taskId = str;
                return this;
            }

            public Builder setUserId(String str) {
                this.userId = str;
                return this;
            }
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MixStreamParamInfo{mixVideoWidth=");
            LIZ.append(this.mixVideoWidth);
            LIZ.append(", mixVideoHeight=");
            LIZ.append(this.mixVideoHeight);
            LIZ.append(", mixVideoFps=");
            LIZ.append(this.mixVideoFps);
            LIZ.append(", mixVideoCodec=");
            LIZ.append(this.mixVideoCodec);
            LIZ.append(", mixVideoProfile=");
            LIZ.append(this.mixVideoProfile);
            LIZ.append(", mixVideoGop=");
            LIZ.append(this.mixVideoGop);
            LIZ.append(", mixVideoBitrate=");
            LIZ.append(this.mixVideoBitrate);
            LIZ.append(", mixAudioSampleRate=");
            LIZ.append(this.mixAudioSampleRate);
            LIZ.append(", mixAudioChannel=");
            LIZ.append(this.mixAudioChannel);
            LIZ.append(", mixAudioBitrate=");
            LIZ.append(this.mixAudioBitrate);
            LIZ.append(", mixAudioCodec='");
            Q89.LIZIZ(LIZ, this.mixAudioCodec, '\'', ", enableBFrame=");
            LIZ.append(this.enableBFrame);
            LIZ.append(", publishUrl='");
            Q89.LIZIZ(LIZ, this.publishUrl, '\'', ", userId='");
            Q89.LIZIZ(LIZ, this.userId, '\'', ", roomId='");
            Q89.LIZIZ(LIZ, this.roomId, '\'', ", taskId='");
            Q89.LIZIZ(LIZ, this.taskId, '\'', ", mixType=");
            LIZ.append(this.mixType);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }

        public int getMixAudioBitrate() {
            return this.mixAudioBitrate;
        }

        public int getMixAudioChannel() {
            return this.mixAudioChannel;
        }

        public String getMixAudioCodec() {
            return this.mixAudioCodec;
        }

        public int getMixAudioSampleRate() {
            return this.mixAudioSampleRate;
        }

        public Config.MixStreamType getMixType() {
            return this.mixType;
        }

        public int getMixVideoBitrate() {
            return this.mixVideoBitrate;
        }

        public Config.VideoCodec getMixVideoCodec() {
            return this.mixVideoCodec;
        }

        public int getMixVideoFps() {
            return this.mixVideoFps;
        }

        public float getMixVideoGop() {
            return this.mixVideoGop;
        }

        public int getMixVideoHeight() {
            return this.mixVideoHeight;
        }

        public Config.VideoProfile getMixVideoProfile() {
            return this.mixVideoProfile;
        }

        public int getMixVideoWidth() {
            return this.mixVideoWidth;
        }

        public String getPublishUrl() {
            return this.publishUrl;
        }

        public String getRoomId() {
            return this.roomId;
        }

        public String getTaskId() {
            return this.taskId;
        }

        public String getUserId() {
            return this.userId;
        }

        public boolean isEnableBFrame() {
            return this.enableBFrame;
        }

        public MixStreamParamInfo(Builder builder) {
            this.mixVideoWidth = builder.mixVideoWidth;
            this.mixVideoHeight = builder.mixVideoHeight;
            this.mixVideoFps = builder.mixVideoFps;
            this.mixVideoCodec = builder.mixVideoCodec;
            this.mixVideoProfile = builder.mixVideoProfile;
            this.mixVideoGop = builder.mixVideoGop;
            this.mixVideoBitrate = builder.mixVideoBitrate;
            this.mixAudioSampleRate = builder.mixAudioSampleRate;
            this.mixAudioChannel = builder.mixAudioChannel;
            this.mixAudioBitrate = builder.mixAudioBitrate;
            this.mixAudioCodec = builder.mixAudioCodec;
            this.enableBFrame = builder.enableBFrame;
            this.publishUrl = builder.publishUrl;
            this.userId = builder.userId;
            this.roomId = builder.roomId;
            this.taskId = builder.taskId;
            this.mixType = builder.mixType;
        }
    }

    /* loaded from: classes12.dex */
    public static class RTCRemoteStreamInfo {
        public String roomId;
        public RTCStreamIndex streamIndex;
        public String userId;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RTCRemoteStreamInfo: {roomId: ");
            LIZ.append(this.roomId);
            LIZ.append(", userId: ");
            LIZ.append(this.userId);
            LIZ.append(", streamIndex: ");
            LIZ.append(this.streamIndex.toString());
            LIZ.append("}");
            return X1D.LIZIZ(LIZ);
        }

        public RTCRemoteStreamInfo(String str, String str2, RTCStreamIndex rTCStreamIndex) {
            this.roomId = str;
            this.userId = str2;
            this.streamIndex = rTCStreamIndex;
        }
    }

    /* loaded from: classes12.dex */
    public static class RTCSpatialAudioHumanOrientation {
        public RTCSpatialAudioOrientation forward;
        public RTCSpatialAudioOrientation right;
        public RTCSpatialAudioOrientation up;

        public RTCSpatialAudioHumanOrientation() {
            this.forward = new RTCSpatialAudioOrientation(1.0f, 0.0f, 0.0f);
            this.right = new RTCSpatialAudioOrientation(0.0f, 1.0f, 0.0f);
            this.up = new RTCSpatialAudioOrientation(0.0f, 0.0f, 1.0f);
        }

        public RTCSpatialAudioHumanOrientation(RTCSpatialAudioOrientation rTCSpatialAudioOrientation, RTCSpatialAudioOrientation rTCSpatialAudioOrientation2, RTCSpatialAudioOrientation rTCSpatialAudioOrientation3) {
            this.forward = rTCSpatialAudioOrientation;
            this.right = rTCSpatialAudioOrientation2;
            this.up = rTCSpatialAudioOrientation3;
        }
    }

    /* loaded from: classes12.dex */
    public static class RTCWaterMarkRegion {
        public float alpha;
        public float h;
        public Bitmap image;
        public TranscoderImageRenderMode renderMode;
        public float w;
        public float x;
        public float y;
        public int zOrder;

        public RTCWaterMarkRegion() {
            this.alpha = 1.0f;
            TranscoderImageRenderMode transcoderImageRenderMode = TranscoderImageRenderMode.RENDER_FIT;
            this.alpha = 1.0f;
            this.renderMode = transcoderImageRenderMode;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RTCWaterMarkRegion{x=");
            LIZ.append(this.x);
            LIZ.append(", y=");
            LIZ.append(this.y);
            LIZ.append(", w=");
            LIZ.append(this.w);
            LIZ.append(", h=");
            LIZ.append(this.h);
            LIZ.append(", zOrder=");
            LIZ.append(this.zOrder);
            LIZ.append(", alpha=");
            LIZ.append(this.alpha);
            LIZ.append(", renderMode=");
            LIZ.append(this.renderMode);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }

        /* loaded from: classes12.dex */
        public enum TranscoderImageRenderMode {
            RENDER_UNKNOWN(0),
            RENDER_HIDDEN(1),
            RENDER_FIT(2),
            RENDER_ADAPTIVE(3);

            public int renderMode;

            public int getValue() {
                return this.renderMode;
            }

            public static TranscoderImageRenderMode valueOf(String str) {
                return (TranscoderImageRenderMode) V0N.LJJJ(TranscoderImageRenderMode.class, str);
            }

            TranscoderImageRenderMode(int i) {
                this.renderMode = i;
            }
        }

        public float getAlpha() {
            return this.alpha;
        }

        public float getH() {
            return this.h;
        }

        public Bitmap getImage() {
            return this.image;
        }

        public TranscoderImageRenderMode getRenderMode() {
            return this.renderMode;
        }

        public float getW() {
            return this.w;
        }

        public float getX() {
            return this.x;
        }

        public float getY() {
            return this.y;
        }

        public int getZorder() {
            return this.zOrder;
        }

        public void setAlpha(float f) {
            this.alpha = f;
        }

        public void setH(float f) {
            this.h = f;
        }

        public void setImage(Bitmap bitmap) {
            this.image = bitmap;
        }

        public void setRenderMode(TranscoderImageRenderMode transcoderImageRenderMode) {
            this.renderMode = transcoderImageRenderMode;
        }

        public void setW(float f) {
            this.w = f;
        }

        public void setX(float f) {
            this.x = f;
        }

        public void setY(float f) {
            this.y = f;
        }

        public void setZorder(int i) {
            this.zOrder = i;
        }

        public RTCWaterMarkRegion(float f, float f2, float f3, float f4, int i, float f5, TranscoderImageRenderMode transcoderImageRenderMode, Bitmap bitmap) {
            this.alpha = 1.0f;
            this.x = f;
            this.y = f2;
            this.w = f3;
            this.h = f4;
            this.zOrder = i;
            this.alpha = f5;
            this.renderMode = transcoderImageRenderMode;
            this.image = bitmap;
        }
    }

    /* loaded from: classes12.dex */
    public enum RTCAudioVolumeIndicationContentMode {
        VOLUME_INDICATION_CONTENT_MODE_FULL(0),
        VOLUME_INDICATION_CONTENT_MODE_VOLUME_ONLY(1);

        public int value;

        public int value() {
            return this.value;
        }

        public static RTCAudioVolumeIndicationContentMode valueOf(String str) {
            return (RTCAudioVolumeIndicationContentMode) V0N.LJJJ(RTCAudioVolumeIndicationContentMode.class, str);
        }

        RTCAudioVolumeIndicationContentMode(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes12.dex */
    public enum FrameType {
        DEFAULT_OCCUPY,
        METADATA,
        SEI,
        METADATA_SEI;

        public static FrameType valueOf(String str) {
            return (FrameType) V0N.LJJJ(FrameType.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public enum PerformanceProfile {
        PERFORMANCE_PROFILE_LOW,
        PERFORMANCE_PROFILE_MID,
        PERFORMANCE_PROFILE_HIGH;

        public static PerformanceProfile valueOf(String str) {
            return (PerformanceProfile) V0N.LJJJ(PerformanceProfile.class, str);
        }
    }

    /* loaded from: classes12.dex */
    public static class ForwardRoomInfo {
        public String roomId;
        public String rtcExtInfo;

        public ForwardRoomInfo(String str, String str2) {
            this.roomId = str;
            this.rtcExtInfo = str2;
        }
    }

    /* loaded from: classes12.dex */
    public static class RTCSpatialAudioOrientation {
        public float x;
        public float y;
        public float z;

        public RTCSpatialAudioOrientation(float f, float f2, float f3) {
            this.x = f;
            this.y = f2;
            this.z = f3;
        }
    }

    /* loaded from: classes12.dex */
    public static class RTCSpatialAudioPosition {
        public float x;
        public float y;
        public float z;

        public RTCSpatialAudioPosition(float f, float f2, float f3) {
            this.x = f;
            this.y = f2;
            this.z = f3;
        }
    }
}
