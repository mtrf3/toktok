package com.ss.bytertc.engine.live;

import android.opengl.EGL14;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.WebrtcWrapperVideoFrame;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes33.dex */
public class PushMixedStreamToCDNObserver {
    public Map<String, IMixedStreamObserver> mLiveTransObserver = new HashMap();
    public Map<String, Boolean> mSupportClientPushStream = new HashMap();

    public boolean isSupportClientPushStream(String str) {
        Map<String, Boolean> map = this.mSupportClientPushStream;
        if (map != null && map.containsKey(str)) {
            return this.mSupportClientPushStream.get(str).booleanValue();
        }
        return false;
    }

    public void onMixingVideoFrame(String str, VideoFrame videoFrame) {
        WebrtcWrapperVideoFrame webrtcWrapperVideoFrame;
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map != null && map.containsKey(str)) {
            if (videoFrame.getBuffer().getBufferType() == 4) {
                webrtcWrapperVideoFrame = new WebrtcWrapperVideoFrame(videoFrame, EGL14.eglGetCurrentContext());
            } else {
                webrtcWrapperVideoFrame = new WebrtcWrapperVideoFrame(videoFrame, null);
            }
            this.mLiveTransObserver.get(str).onMixingVideoFrame(str, webrtcWrapperVideoFrame);
            videoFrame.release();
        }
    }

    public void setUserObserver(String str, IMixedStreamObserver iMixedStreamObserver) {
        if (this.mLiveTransObserver == null) {
            this.mLiveTransObserver = new HashMap();
        }
        if (this.mSupportClientPushStream == null) {
            this.mSupportClientPushStream = new HashMap();
        }
        this.mLiveTransObserver.put(str, iMixedStreamObserver);
        if (iMixedStreamObserver != null) {
            this.mSupportClientPushStream.put(str, Boolean.valueOf(iMixedStreamObserver.isSupportClientPushStream()));
        } else {
            this.mSupportClientPushStream.put(str, Boolean.FALSE);
        }
    }

    public void onMixingDataFrame(String str, byte[] bArr, long j) {
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map != null && map.containsKey(str)) {
            this.mLiveTransObserver.get(str).onMixingDataFrame(str, bArr, j);
        }
    }

    public void onMixingAudioFrame(String str, byte[] bArr, int i, long j) {
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map != null && map.containsKey(str)) {
            this.mLiveTransObserver.get(str).onMixingAudioFrame(str, bArr, i, j);
        }
    }

    public void onMixingEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode, MixedStreamType mixedStreamType) {
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map != null && map.containsKey(str)) {
            this.mLiveTransObserver.get(str).onMixingEvent(byteRTCStreamMixingEvent, str, byteRTCTranscoderErrorCode, mixedStreamType);
        }
    }

    public void onCacheSyncVideoFrames(String str, String[] strArr, VideoFrame[] videoFrameArr, byte[][] bArr, int i) {
        WebrtcWrapperVideoFrame webrtcWrapperVideoFrame;
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map != null && map.containsKey(str)) {
            WebrtcWrapperVideoFrame[] webrtcWrapperVideoFrameArr = new WebrtcWrapperVideoFrame[i];
            for (int i2 = 0; i2 < i; i2++) {
                if (videoFrameArr[i2].getBuffer().getBufferType() == 4) {
                    webrtcWrapperVideoFrame = new WebrtcWrapperVideoFrame(videoFrameArr[i2], EGL14.eglGetCurrentContext());
                } else {
                    webrtcWrapperVideoFrame = new WebrtcWrapperVideoFrame(videoFrameArr[i2], null);
                }
                webrtcWrapperVideoFrameArr[i2] = webrtcWrapperVideoFrame;
                videoFrameArr[i2].release();
            }
            this.mLiveTransObserver.get(str).onCacheSyncVideoFrames(str, strArr, webrtcWrapperVideoFrameArr, bArr, i);
        }
    }
}
