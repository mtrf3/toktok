package com.bytedance.helios.api.config;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BinderConfig extends F9E {

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    @InterfaceC65349Pkn("interest_binders")
    public final List<InterestBinderConfig> interestBinders;

    @InterfaceC65349Pkn("interest_providers")
    public final List<InterestContentProviderConfig> interestProviders;

    @InterfaceC65349Pkn("share_monitor")
    public final ShareConfig shareConfig;

    public BinderConfig() {
        this(false, null, null, null, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enabled), this.shareConfig, this.interestBinders, this.interestProviders};
    }

    public BinderConfig(boolean z, ShareConfig shareConfig, List<InterestBinderConfig> interestBinders, List<InterestContentProviderConfig> interestProviders) {
        o.LJIIIZ(shareConfig, "shareConfig");
        o.LJIIIZ(interestBinders, "interestBinders");
        o.LJIIIZ(interestProviders, "interestProviders");
        this.enabled = z;
        this.shareConfig = shareConfig;
        this.interestBinders = interestBinders;
        this.interestProviders = interestProviders;
    }

    public BinderConfig(boolean z, ShareConfig shareConfig, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ShareConfig(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, false, null, null, null, 63, null) : shareConfig, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
