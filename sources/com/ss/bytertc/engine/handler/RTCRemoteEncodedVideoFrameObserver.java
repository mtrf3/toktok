package com.ss.bytertc.engine.handler;

import com.bytedance.realx.video.VideoStream;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoCodecType;
import com.ss.bytertc.engine.data.VideoPictureType;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.mediaio.IRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import java.lang.ref.WeakReference;

/* loaded from: classes33.dex */
public class RTCRemoteEncodedVideoFrameObserver {
    public WeakReference<RTCEngineImpl> mRtcEngineImpl;
    public WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCRemoteEncodedVideoFrameObserver(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public RTCRemoteEncodedVideoFrameObserver(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public void onRemoteEncodedVideoFrame(String str, String str2, int i, VideoStream videoStream, long j, long j2, int i2, int i3, int i4) {
        RTCVideoImpl rTCVideoImpl;
        IRemoteEncodedVideoFrameObserver remoteEncodedVideoFrameObserver;
        RTCEngineImpl rTCEngineImpl;
        IRemoteEncodedVideoFrameObserver remoteEncodedVideoFrameObserver2;
        if (videoStream == null) {
            return;
        }
        WeakReference<RTCEngineImpl> weakReference = this.mRtcEngineImpl;
        if (weakReference != null && (rTCEngineImpl = weakReference.get()) != null && (remoteEncodedVideoFrameObserver2 = rTCEngineImpl.getRemoteEncodedVideoFrameObserver()) != null) {
            remoteEncodedVideoFrameObserver2.onRemoteEncodedVideoFrame(new RemoteStreamKey(str, str2, StreamIndex.fromId(i)), new RTCEncodedVideoFrame(videoStream.getBuffer().getData(), j, j2, videoStream.getWidth(), videoStream.getHeight(), VideoCodecType.fromId(i2), VideoPictureType.fromId(i3), VideoRotation.fromId(i4)));
        }
        WeakReference<RTCVideoImpl> weakReference2 = this.mRtcVideoImpl;
        if (weakReference2 != null && (rTCVideoImpl = weakReference2.get()) != null && (remoteEncodedVideoFrameObserver = rTCVideoImpl.getRemoteEncodedVideoFrameObserver()) != null) {
            remoteEncodedVideoFrameObserver.onRemoteEncodedVideoFrame(new RemoteStreamKey(str, str2, StreamIndex.fromId(i)), new RTCEncodedVideoFrame(videoStream.getBuffer().getData(), j, j2, videoStream.getWidth(), videoStream.getHeight(), VideoCodecType.fromId(i2), VideoPictureType.fromId(i3), VideoRotation.fromId(i4)));
        }
        videoStream.release();
    }
}
