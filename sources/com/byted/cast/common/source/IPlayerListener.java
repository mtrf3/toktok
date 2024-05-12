package com.byted.cast.common.source;

import com.byted.cast.common.bean.DramaBean;

/* loaded from: classes29.dex */
public interface IPlayerListener {
    void onCompletion();

    void onDramaId(ServiceInfo serviceInfo, String str);

    void onDramaList(ServiceInfo serviceInfo, DramaBean[] dramaBeanArr);

    void onError(int i, int i2);

    void onError(int i, String str);

    void onInfo(int i, int i2);

    void onLoading();

    void onPause();

    void onPositionUpdate(long j, long j2);

    void onSeekComplete(long j);

    void onStart();

    void onStop();

    void onVolumeChanged(float f);
}
