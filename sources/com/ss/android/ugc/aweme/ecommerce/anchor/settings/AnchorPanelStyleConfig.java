package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class AnchorPanelStyleConfig extends F9E {

    @InterfaceC65349Pkn("ec_anchor_panel_style")
    public final int anchorPanelStyle;

    @InterfaceC65349Pkn("ec_anchor_panel_style_ads")
    public final int anchorPanelStyleAds;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnchorPanelStyleConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.settings.AnchorPanelStyleConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.anchorPanelStyleAds), Integer.valueOf(this.anchorPanelStyle)};
    }

    public AnchorPanelStyleConfig(int i, int i2) {
        this.anchorPanelStyleAds = i;
        this.anchorPanelStyle = i2;
    }

    public /* synthetic */ AnchorPanelStyleConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}