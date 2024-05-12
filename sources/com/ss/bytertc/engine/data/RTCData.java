package com.ss.bytertc.engine.data;

import X.X1D;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import java.util.Arrays;

/* loaded from: classes33.dex */
public class RTCData {
    public VideoEncoderConfiguration.OrientationMode mOrientationMode;
    public VideoStreamDescription[] videoStreamDescriptions = new VideoStreamDescription[1];

    /* loaded from: classes33.dex */
    public static class SingletonHelper {
        public static final RTCData INSTANCE = new RTCData();
    }

    public RTCData() {
        VideoStreamDescription videoStreamDescription = new VideoStreamDescription();
        videoStreamDescription.videoSize = new Pair<>(Integer.valueOf(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT), 360);
        videoStreamDescription.frameRate = 20;
        videoStreamDescription.maxKbps = 600;
        this.videoStreamDescriptions[0] = videoStreamDescription;
        this.mOrientationMode = VideoEncoderConfiguration.OrientationMode.ORIENTATION_MODE_ADAPTIVE;
    }

    public static RTCData instance() {
        return SingletonHelper.INSTANCE;
    }

    public VideoEncoderConfiguration.OrientationMode getOrientationMode() {
        return this.mOrientationMode;
    }

    public VideoStreamDescription[] getVideoStreamDescriptions() {
        return this.videoStreamDescriptions;
    }

    public void setOrientationMode(VideoEncoderConfiguration.OrientationMode orientationMode) {
        this.mOrientationMode = orientationMode;
    }

    public void setVideoStreamDescriptions(VideoStreamDescription[] videoStreamDescriptionArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVideoStreamDescriptions: ");
        LIZ.append(Arrays.toString(videoStreamDescriptionArr));
        LogUtil.i("RTCData", X1D.LIZIZ(LIZ));
        this.videoStreamDescriptions = videoStreamDescriptionArr;
    }
}
