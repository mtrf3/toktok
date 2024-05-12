package com.byted.cast.source.api;

import com.byted.cast.source.browser.api.ByteLinkServiceInfo;

/* loaded from: classes29.dex */
public interface IByteLinkPlayerListener {
    void onCompletion();

    void onError(int i, int i2, String str);

    void onInfo(int i, int i2, String str);

    void onLoading();

    void onMonitorEvent(ByteLinkServiceInfo byteLinkServiceInfo, String str, String str2);

    void onPause();

    void onPositionUpdate(long j, long j2);

    void onRecvMetaData(String str);

    void onRecvMetaData(String str, String str2);

    void onSeekComplete(int i);

    void onStart();

    void onStat(String str);

    void onStop();

    void onStuckStat(String str);

    void onVolumeChanged(float f);
}
