package com.ss.bytertc.base.media;

import X.C16880lQ;
import android.os.Handler;
import android.view.Choreographer;
import com.ss.bytertc.base.media.RTCVSyncHelper;

/* loaded from: classes33.dex */
public class RTCVSyncHelper {

    /* loaded from: classes33.dex */
    public static class ChoreographerFrameCallback implements Choreographer.FrameCallback {
        public long nativeCallbackHandle;
        public String renderTaskUUID;

        public void resetCallback() {
            this.nativeCallbackHandle = 0L;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (this.nativeCallbackHandle != 0) {
                C16880lQ.LLIIIJ().postFrameCallback(this);
                RTCNativeFunctions.nativeNotifyVSyncDoFrame(this.nativeCallbackHandle, this.renderTaskUUID);
            }
        }
    }

    public static /* synthetic */ void lambda$registerVSyncCallback$0(ChoreographerFrameCallback choreographerFrameCallback) {
        C16880lQ.LLIIIJ().postFrameCallback(choreographerFrameCallback);
    }

    public static /* synthetic */ void lambda$unregisterVSyncCallback$1(Object obj) {
        ((ChoreographerFrameCallback) obj).resetCallback();
    }

    public static void unregisterVSyncCallback(final Object obj) {
        if (obj instanceof ChoreographerFrameCallback) {
            new Handler(C16880lQ.LLJJJJ()).post(new Runnable() { // from class: X.ZVb
                @Override // java.lang.Runnable
                public final void run() {
                    RTCVSyncHelper.lambda$unregisterVSyncCallback$1(obj);
                }
            });
        }
    }

    public static Object registerVSyncCallback(long j, String str) {
        if (j == 0) {
            return null;
        }
        final ChoreographerFrameCallback choreographerFrameCallback = new ChoreographerFrameCallback();
        choreographerFrameCallback.nativeCallbackHandle = j;
        choreographerFrameCallback.renderTaskUUID = str;
        new Handler(C16880lQ.LLJJJJ()).post(new Runnable() { // from class: X.ZVc
            @Override // java.lang.Runnable
            public final void run() {
                RTCVSyncHelper.lambda$registerVSyncCallback$0(RTCVSyncHelper.ChoreographerFrameCallback.this);
            }
        });
        return choreographerFrameCallback;
    }
}
