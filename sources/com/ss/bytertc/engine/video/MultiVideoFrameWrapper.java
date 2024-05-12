package com.ss.bytertc.engine.video;

import X.V0N;

/* loaded from: classes33.dex */
public class MultiVideoFrameWrapper {
    public final Type frameType;
    public final Object videoFrame;

    public boolean isByteRTCVideoFrame() {
        if (this.frameType == Type.BYTE_RTC_FRAME) {
            return true;
        }
        return false;
    }

    public boolean isWebRTCVideoFrame() {
        if (this.frameType == Type.WEB_RTC_FRAME) {
            return true;
        }
        return false;
    }

    public Object getVideoFrame() {
        return this.videoFrame;
    }

    /* loaded from: classes33.dex */
    public enum Type {
        BYTE_RTC_FRAME,
        WEB_RTC_FRAME;

        public static Type valueOf(String str) {
            return (Type) V0N.LJJJ(Type.class, str);
        }
    }

    public MultiVideoFrameWrapper(com.bytedance.realx.video.VideoFrame videoFrame) {
        this.videoFrame = videoFrame;
        this.frameType = Type.WEB_RTC_FRAME;
    }

    public MultiVideoFrameWrapper(VideoFrame videoFrame) {
        this.videoFrame = videoFrame;
        this.frameType = Type.BYTE_RTC_FRAME;
    }
}
