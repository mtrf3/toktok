package com.byted.cast.common.api;

import com.byted.cast.common.bean.DanmakuSetting;
import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.bean.Resolution;
import com.byted.cast.common.bean.Speed;
import com.byted.cast.common.sink.CastInfo;

/* loaded from: classes29.dex */
public interface IMediaServiceListener {
    int getCurrentPosition(String str);

    String getDramaId(String str);

    DramaBean[] getDramaList(String str);

    int getDuration(String str);

    String getPlayState(String str);

    int getVolume(String str);

    void onAddDramaList(String str, DramaBean[] dramaBeanArr, String str2);

    void onAddVolume(String str);

    void onClearDramaList(String str);

    void onDanmakuSetting(String str, DanmakuSetting danmakuSetting);

    void onError(String str, int i, String str2);

    void onPause(String str);

    void onPlay(String str, float f);

    void onPlayDramaId(String str, String str2);

    void onPlayNextDrama(String str);

    void onPlayPreDrama(String str);

    void onRepeatMode(String str, int i);

    void onResolution(String str, Resolution resolution);

    void onSeek(String str, long j, int i);

    void onSetDramaList(String str, DramaBean[] dramaBeanArr);

    void onSetUrlSuccess(CastInfo castInfo);

    void onSpeed(String str, float f);

    void onSpeed(String str, Speed speed);

    void onStop(String str);

    void onSubVolume(String str);

    void onVolume(String str, int i);
}
