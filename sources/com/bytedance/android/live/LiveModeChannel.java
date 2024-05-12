package com.bytedance.android.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.Channel;

/* loaded from: classes.dex */
public final class LiveModeChannel extends Channel<LiveMode> {
    public LiveModeChannel() {
        super(LiveMode.VIDEO);
    }
}
