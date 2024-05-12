package com.ss.android.ugc.aweme.search.performance.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SearchHorizontalCardRecyclerViewSlideOptConfig extends F9E {

    @InterfaceC65349Pkn("enable_horizontal_card_recycler_view_slide_opt")
    public final boolean enableHorizontalCardRecyclerViewSlideOpt;

    @InterfaceC65349Pkn("horizontal_card_view_slide_opt_rate")
    public final float horizontalCardViewSlideOptRate;

    public SearchHorizontalCardRecyclerViewSlideOptConfig() {
        this(false, 0.0f, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableHorizontalCardRecyclerViewSlideOpt), Float.valueOf(this.horizontalCardViewSlideOptRate)};
    }

    public SearchHorizontalCardRecyclerViewSlideOptConfig(boolean z, float f) {
        this.enableHorizontalCardRecyclerViewSlideOpt = z;
        this.horizontalCardViewSlideOptRate = f;
    }

    public /* synthetic */ SearchHorizontalCardRecyclerViewSlideOptConfig(boolean z, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 1.0f : f);
    }
}
