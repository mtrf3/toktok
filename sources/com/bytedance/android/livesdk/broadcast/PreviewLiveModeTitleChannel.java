package com.bytedance.android.livesdk.broadcast;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.Channel;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class PreviewLiveModeTitleChannel extends Channel<Map<LiveMode, String>> {
    public PreviewLiveModeTitleChannel() {
        super(new LinkedHashMap());
    }
}
