package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class AnchorStaticViewConfig extends F9E {

    @InterfaceC65349Pkn("ec_anchor_icon_style")
    public final int anchorIconStyle;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("enable_ads")
    public final boolean enableAds;

    @InterfaceC65349Pkn("ec_anchor_title_show_prompt")
    public final boolean enableAnchorTitleShowPromot;

    @InterfaceC65349Pkn("primary_style")
    public final boolean primaryStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorStaticViewConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.anchorIconStyle), Boolean.valueOf(this.enableAnchorTitleShowPromot), Boolean.valueOf(this.enableAds), Boolean.valueOf(this.primaryStyle), Boolean.valueOf(this.enable)};
    }

    public AnchorStaticViewConfig(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.anchorIconStyle = i;
        this.enableAnchorTitleShowPromot = z;
        this.enableAds = z2;
        this.primaryStyle = z3;
        this.enable = z4;
    }

    public /* synthetic */ AnchorStaticViewConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4);
    }
}
