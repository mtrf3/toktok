package com.byted.cast.common.api;

import com.byted.cast.common.bean.DramaBean;
import com.byted.cast.common.sink.CastInfo;

/* loaded from: classes29.dex */
public interface IActionListener {
    void onAddDramaList(DramaBean[] dramaBeanArr, String str);

    void onAddVolume();

    void onClearDramaList();

    void onPause();

    void onPlay(float f);

    void onPlayDramaId(String str);

    void onPlayNextDrama();

    void onPlayPreDrama();

    void onRepeatMode(int i);

    void onSeek(long j, int i);

    void onSetDramaList(DramaBean[] dramaBeanArr);

    void onSetUrlSuccess(CastInfo castInfo);

    void onSpeed(float f);

    void onStop();

    void onSubVolume();

    void onVolume(int i);
}
