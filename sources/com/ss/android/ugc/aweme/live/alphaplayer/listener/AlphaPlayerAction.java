package com.ss.android.ugc.aweme.live.alphaplayer.listener;

import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;

/* loaded from: classes15.dex */
public interface AlphaPlayerAction {
    void endAction();

    void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType);

    void startAction();
}
