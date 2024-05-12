package com.byted.cast.sink.api.multiple;

/* loaded from: classes29.dex */
public interface IMultipleReverseControl {
    int getCurrentPosition(String str);

    int getDuration(String str);

    void lowerVolume(String str);

    boolean pause(String str);

    void raiseVolume(String str);

    void seekTo(String str, int i);

    void sendMetaData(String str);

    void setVolume(String str, int i);

    boolean start(String str);

    boolean stop(String str);
}
