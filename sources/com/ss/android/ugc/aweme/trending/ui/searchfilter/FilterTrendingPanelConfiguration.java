package com.ss.android.ugc.aweme.trending.ui.searchfilter;

import X.C65352Pkq;
import X.C8VV;
import X.InterfaceC65350Pko;
import X.KRA;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.trending.ui.platform.TrendingDetailPanelConfiguration;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FilterTrendingPanelConfiguration extends TrendingDetailPanelConfiguration {
    @Override // com.ss.android.ugc.aweme.trending.ui.platform.TrendingDetailPanelConfiguration, com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final InterfaceC65350Pko<? extends UIContentAssem> LIZLLL(KRA panelContext) {
        o.LJIIIZ(panelContext, "panelContext");
        return C65352Pkq.LIZ(FilterTrendingDetailComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final void LIZJ(BasePanelUIComponent basePanelUIComponent) {
        o.LJIIIZ(basePanelUIComponent, "<this>");
        C8VV.LIZJ(basePanelUIComponent, new AqS170S0100000_4(basePanelUIComponent, 804));
    }

    @Override // com.ss.android.ugc.aweme.trending.ui.platform.TrendingDetailPanelConfiguration, com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* renamed from: LJ */
    public final boolean x0(KRA context) {
        o.LJIIIZ(context, "context");
        return o.LJ(context.LIZ, "SCENE_DETAIL_TRENDING_FILTER");
    }

    @Override // com.ss.android.ugc.aweme.trending.ui.platform.TrendingDetailPanelConfiguration, com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final /* bridge */ /* synthetic */ boolean x0(KRA kra) {
        return x0(kra);
    }
}
