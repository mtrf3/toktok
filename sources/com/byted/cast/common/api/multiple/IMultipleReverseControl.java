package com.byted.cast.common.api.multiple;

/* loaded from: classes29.dex */
public interface IMultipleReverseControl {
    int getCurrentPosition(String str);

    int getDuration(String str);

    String getPlayState(String str);

    int getVolume(String str);

    void onAddVolume(String str);

    void onPause(String str);

    void onPlay(String str, float f);

    void onSeek(String str, long j, int i);

    void onSpeed(String str, float f);

    void onStop(String str);

    void onSubVolume(String str);

    void onVolume(String str, int i);
}
