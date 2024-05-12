package com.ss.android.ugc.aweme.offlinemode.ui;

import X.C26222AQw;
import X.C65352Pkq;
import X.C8VV;
import X.InterfaceC65350Pko;
import X.KRA;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OfflineModeDetailPanelConfiguration extends DetailPanelConfiguration {
    public static final C26222AQw LJLIL = new C26222AQw("Configuration");

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final InterfaceC65350Pko<? extends UIContentAssem> LIZLLL(KRA panelContext) {
        o.LJIIIZ(panelContext, "panelContext");
        return C65352Pkq.LIZ(OfflineModeDetailPageComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final void LIZJ(BasePanelUIComponent basePanelUIComponent) {
        o.LJIIIZ(basePanelUIComponent, "<this>");
        LJLIL.LIZ(null, "applyDetailComponent");
        C8VV.LIZJ(basePanelUIComponent, new AqS170S0100000_4(basePanelUIComponent, 460));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* renamed from: LJ */
    public final boolean x0(KRA context) {
        o.LJIIIZ(context, "context");
        return o.LJ(context.LIZ, "SCENE_DETAIL_OFFLINE_MODE");
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final /* bridge */ /* synthetic */ boolean x0(KRA kra) {
        return x0(kra);
    }
}
