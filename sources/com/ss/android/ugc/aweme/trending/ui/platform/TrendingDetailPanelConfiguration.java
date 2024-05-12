package com.ss.android.ugc.aweme.trending.ui.platform;

import X.C65352Pkq;
import X.InterfaceC65350Pko;
import X.KRA;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class TrendingDetailPanelConfiguration extends DetailPanelConfiguration {
    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public InterfaceC65350Pko<? extends UIContentAssem> LIZLLL(KRA panelContext) {
        o.LJIIIZ(panelContext, "panelContext");
        return C65352Pkq.LIZ(TrendingDetailComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* renamed from: LJ */
    public boolean x0(KRA context) {
        o.LJIIIZ(context, "context");
        return o.LJ(context.LIZ, "DETAIL_TRENDING");
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public /* bridge */ /* synthetic */ boolean x0(KRA kra) {
        return x0(kra);
    }
}
