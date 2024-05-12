package com.ss.bytertc.engine.handler;

import X.C16880lQ;
import com.bytedance.realx.video.VideoFrame;

/* loaded from: classes33.dex */
public class RTCVideoFrameObserver {
    public void onLocalScreenFrame(VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            throw e;
        }
    }

    public void onLocalVideoFrame(VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            throw e;
        }
    }

    public void onMergeFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            throw e;
        }
    }

    public void onRemoteScreenFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            throw e;
        }
    }

    public void onRemoteVideoFrame(String str, String str2, VideoFrame videoFrame) {
        try {
            videoFrame.release();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            throw e;
        }
    }
}
