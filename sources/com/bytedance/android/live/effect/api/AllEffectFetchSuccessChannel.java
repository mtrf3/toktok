package com.bytedance.android.live.effect.api;

import X.OQY;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.Channel;
import java.util.Set;

/* loaded from: classes.dex */
public final class AllEffectFetchSuccessChannel extends Channel<Set<? extends LiveEffect>> {
    public AllEffectFetchSuccessChannel() {
        super(OQY.INSTANCE);
    }
}
