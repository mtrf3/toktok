package com.byted.cast.common.source;

import com.byted.cast.common.api.IConnectListener;

/* loaded from: classes29.dex */
public interface IMirrorListener extends IConnectListener {
    void onError(int i, int i2, int i3, String str);

    void onInfo(int i, int i2, int i3, String str);

    boolean onInvite(String str, int i);

    void onMirrorModeChange(int i);

    void onStart(int i);

    boolean onStartMirrorAuthorization();

    void onStatistics(Statistics statistics);

    void onStop(int i);
}
