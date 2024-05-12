package com.byted.cast.common.api;

/* loaded from: classes29.dex */
public interface IActiveControl {
    void pause(String str);

    void seekComplete(String str, int i);

    void seekStart(String str, int i);

    void start(String str);

    void stop(String str, boolean z);

    void updateVolume(String str);
}
