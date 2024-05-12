package com.ss.bytertc.engine.handler;

import com.bytedance.realx.video.VideoStream;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoCodecType;
import com.ss.bytertc.engine.data.VideoPictureType;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import java.lang.ref.WeakReference;

/* loaded from: classes33.dex */
public class RTCLocalEncodedVideoFrameObserver {
    public WeakReference<RTCEngineImpl> mRtcEngineImpl;
    public WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCLocalEncodedVideoFrameObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public RTCLocalEncodedVideoFrameObserver(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public void onLocalEncodedVideoFrame(int i, VideoStream videoStream, long j, long j2, int i2, int i3, int i4) {
        RTCVideoImpl rTCVideoImpl;
        ILocalEncodedVideoFrameObserver encodedVideoFrameObserver;
        RTCEngineImpl rTCEngineImpl;
        ILocalEncodedVideoFrameObserver encodedVideoFrameObserver2;
        if (videoStream == null) {
            return;
        }
        WeakReference<RTCEngineImpl> weakReference = this.mRtcEngineImpl;
        if (weakReference != null && (rTCEngineImpl = weakReference.get()) != null && (encodedVideoFrameObserver2 = rTCEngineImpl.getEncodedVideoFrameObserver()) != null) {
            encodedVideoFrameObserver2.onLocalEncodedVideoFrame(StreamIndex.fromId(i), new RTCEncodedVideoFrame(videoStream.getBuffer().getData(), j, j2, videoStream.getWidth(), videoStream.getHeight(), VideoCodecType.fromId(i2), VideoPictureType.fromId(i3), VideoRotation.fromId(i4)));
        }
        WeakReference<RTCVideoImpl> weakReference2 = this.mRtcVideoImpl;
        if (weakReference2 != null && (rTCVideoImpl = weakReference2.get()) != null && (encodedVideoFrameObserver = rTCVideoImpl.getEncodedVideoFrameObserver()) != null) {
            encodedVideoFrameObserver.onLocalEncodedVideoFrame(StreamIndex.fromId(i), new RTCEncodedVideoFrame(videoStream.getBuffer().getData(), j, j2, videoStream.getWidth(), videoStream.getHeight(), VideoCodecType.fromId(i2), VideoPictureType.fromId(i3), VideoRotation.fromId(i4)));
        }
        videoStream.release();
    }
}
