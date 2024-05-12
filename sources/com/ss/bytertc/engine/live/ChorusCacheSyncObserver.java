package com.ss.bytertc.engine.live;

import android.opengl.EGL14;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.WebrtcWrapperVideoFrame;

/* loaded from: classes33.dex */
public class ChorusCacheSyncObserver {
    public IChorusCacheSyncObserver observer;

    public void setUserObserver(IChorusCacheSyncObserver iChorusCacheSyncObserver) {
        if (iChorusCacheSyncObserver != null) {
            this.observer = iChorusCacheSyncObserver;
        }
    }

    public void onSyncEvent(ChorusCacheSyncEvent chorusCacheSyncEvent, ChorusCacheSyncError chorusCacheSyncError) {
        IChorusCacheSyncObserver iChorusCacheSyncObserver = this.observer;
        if (iChorusCacheSyncObserver != null) {
            iChorusCacheSyncObserver.onSyncEvent(chorusCacheSyncEvent, chorusCacheSyncError);
        }
    }

    public void onSyncedUsersChanged(int i, String[] strArr) {
        IChorusCacheSyncObserver iChorusCacheSyncObserver = this.observer;
        if (iChorusCacheSyncObserver != null) {
            iChorusCacheSyncObserver.onSyncedUsersChanged(i, strArr);
        }
    }

    public void onSyncedVideoFrames(int i, String[] strArr, VideoFrame[] videoFrameArr) {
        WebrtcWrapperVideoFrame webrtcWrapperVideoFrame;
        if (this.observer != null) {
            WebrtcWrapperVideoFrame[] webrtcWrapperVideoFrameArr = new WebrtcWrapperVideoFrame[i];
            for (int i2 = 0; i2 < i; i2++) {
                VideoFrame videoFrame = videoFrameArr[i2];
                if (videoFrame != null) {
                    if (videoFrame.getBuffer().getBufferType() == 4) {
                        webrtcWrapperVideoFrame = new WebrtcWrapperVideoFrame(videoFrameArr[i2], EGL14.eglGetCurrentContext());
                    } else {
                        webrtcWrapperVideoFrame = new WebrtcWrapperVideoFrame(videoFrameArr[i2], null);
                    }
                    webrtcWrapperVideoFrameArr[i2] = webrtcWrapperVideoFrame;
                    videoFrameArr[i2].release();
                }
            }
            this.observer.onSyncedVideoFrames(i, strArr, webrtcWrapperVideoFrameArr);
        }
    }
}
