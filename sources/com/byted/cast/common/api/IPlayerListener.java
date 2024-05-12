package com.byted.cast.common.api;

import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;

/* loaded from: classes29.dex */
public interface IPlayerListener {
    void onCompletion();

    void onDramaId(ServiceInfo serviceInfo, String str);

    void onDramaList(ServiceInfo serviceInfo, DramaBean[] dramaBeanArr);

    void onError(int i, int i2);

    void onError(int i, int i2, String str);

    void onInfo(int i, int i2);

    void onInfo(int i, int i2, String str);

    void onLoading();

    void onPause();

    void onPositionUpdate(long j, long j2);

    void onSeekComplete(long j);

    void onStart();

    void onStartMirror();

    void onStatistics(Statistics statistics);

    void onStop();

    void onStopMirror();

    void onSwitch(int i);

    void onVolumeChanged(float f);
}
