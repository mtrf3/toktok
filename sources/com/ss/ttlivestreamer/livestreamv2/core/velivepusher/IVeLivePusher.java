package com.ss.ttlivestreamer.livestreamv2.core.velivepusher;

import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public interface IVeLivePusher {
    void addUserMetaData(String str, String str2, int i);

    void onDestroy();

    int sendSeiMessage(String str, Object obj, int i, boolean z, boolean z2);

    void setPusherAVProperty(TEBundle tEBundle);

    void setPusherSeiDiffTime(long j);

    void startAudioCapture();

    void startEncodeAndPublish(String str);

    void startEncodeAndPublish(String[] strArr);

    void startVideoCapture();

    void stopAudioCapture();

    void stopEncodeAndPublish();

    void stopVideoCapture();

    void syncCaptureHeight(int i);

    void syncCaptureWidth(int i);

    void syncPushBaseHeight(int i);

    void syncPushBaseWidth(int i);
}
