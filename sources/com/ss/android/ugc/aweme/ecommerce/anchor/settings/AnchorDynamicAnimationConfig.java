package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class AnchorDynamicAnimationConfig extends F9E {

    @InterfaceC65349Pkn("ec_anchor_show_subtitle_delay")
    public final int delayShowSubtitle;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("enable_ads")
    public final boolean enableAds;

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorDynamicAnimationConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Integer.valueOf(this.delayShowSubtitle), Boolean.valueOf(this.enableAds)};
    }

    public AnchorDynamicAnimationConfig(boolean z, int i, boolean z2) {
        this.enable = z;
        this.delayShowSubtitle = i;
        this.enableAds = z2;
    }

    public /* synthetic */ AnchorDynamicAnimationConfig(boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 3 : i, (i2 & 4) != 0 ? false : z2);
    }
}
