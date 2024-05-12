package com.ss.android.ugc.aweme.trending.ui.searchfilter;

import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC51657KPd;
import com.ss.android.ugc.aweme.trending.ui.platform.TrendingDetailComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class FilterTrendingDetailComponent extends TrendingDetailComponent {
    public final C62822Ol8 LLIILZL;

    public FilterTrendingDetailComponent() {
        new LinkedHashMap();
        this.LLIILZL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 345));
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility
    public final void Jk() {
        InterfaceC51657KPd mm = ((FilterTrendingDetailPageFragment) this.LLIILZL.getValue()).mm();
        if (mm != null && mm.LIZLLL()) {
            return;
        }
        super.Jk();
    }
}
