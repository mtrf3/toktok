package com.ss.android.ugc.aweme.experiment;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class WwaPreloadChannelConfig extends F9E {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("wwa_preload_channels")
    public final List<String> preloadChannels;

    /* JADX WARN: Multi-variable type inference failed */
    public WwaPreloadChannelConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WwaPreloadChannelConfig copy$default(WwaPreloadChannelConfig wwaPreloadChannelConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wwaPreloadChannelConfig.preloadChannels;
        }
        return wwaPreloadChannelConfig.copy(list);
    }

    public final WwaPreloadChannelConfig copy(List<String> preloadChannels) {
        o.LJIIIZ(preloadChannels, "preloadChannels");
        return new WwaPreloadChannelConfig(preloadChannels);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.preloadChannels};
    }

    public final List<String> getPreloadChannels() {
        return this.preloadChannels;
    }

    public WwaPreloadChannelConfig(List<String> preloadChannels) {
        o.LJIIIZ(preloadChannels, "preloadChannels");
        this.preloadChannels = preloadChannels;
    }

    public /* synthetic */ WwaPreloadChannelConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C47261Igj.LJJIJIIJI("music_promotion_wwa_entrance", "music_promotion_wwa") : list);
    }
}
