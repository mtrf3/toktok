package com.ss.ttlivestreamer.livestreamv2.core.velivepusher;

import android.content.Context;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;

/* loaded from: classes12.dex */
public class VeLivePusherWrapper implements IVeLivePusher {
    public Context mContext;
    public String[] pusherAVIntKeys = {"width", "height", "cap_adapted_width", "cap_adapted_height", "fps", "defaultBitrate", "minBitrate", "maxBitrate", "videoCaptureFps", "audioBitrate", "videoCaptureWidth", "videoCaptureHeight", "cap_adapted_quirks", "maxFps"};
    public String[] pusherAVDoubleKeys = {"bitrateRatio", "capWidthRate", "capHeightRate"};
    public String[] pusherAVStringKeys = {"from"};
    public String[] pusherAVBooleanKeys = {"enable_siti", "useHardware"};

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void addUserMetaData(String str, String str2, int i) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void onDestroy() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public int sendSeiMessage(String str, Object obj, int i, boolean z, boolean z2) {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void setPusherAVProperty(TEBundle tEBundle) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void setPusherSeiDiffTime(long j) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void stopAudioCapture() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void stopEncodeAndPublish() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void stopVideoCapture() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void startAudioCapture() {
        DebugLogUtils.isEnableDebugLog();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void startVideoCapture() {
        DebugLogUtils.isEnableDebugLog();
    }

    public VeLivePusherWrapper(LiveStreamBuilder liveStreamBuilder) {
        this.mContext = liveStreamBuilder.getContext();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void startEncodeAndPublish(String str) {
        DebugLogUtils.isEnableDebugLog();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void syncCaptureHeight(int i) {
        DebugLogUtils.isEnableDebugLog();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void syncCaptureWidth(int i) {
        DebugLogUtils.isEnableDebugLog();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void syncPushBaseHeight(int i) {
        DebugLogUtils.isEnableDebugLog();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void syncPushBaseWidth(int i) {
        DebugLogUtils.isEnableDebugLog();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher
    public void startEncodeAndPublish(String[] strArr) {
        DebugLogUtils.isEnableDebugLog();
    }
}
