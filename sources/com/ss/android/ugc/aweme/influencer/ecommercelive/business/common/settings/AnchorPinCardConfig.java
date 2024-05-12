package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class AnchorPinCardConfig extends F9E {

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("show")
    public final int show;

    public AnchorPinCardConfig() {
        this(0, 0L, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.show), Long.valueOf(this.duration)};
    }

    public AnchorPinCardConfig(int i, long j) {
        this.show = i;
        this.duration = j;
    }

    public /* synthetic */ AnchorPinCardConfig(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j);
    }
}
