package com.ss.android.ugc.aweme.detail.ui.story;

import X.C65352Pkq;
import X.InterfaceC65350Pko;
import X.KRA;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StoryDetailPanelConfiguration extends DetailPanelConfiguration {
    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final InterfaceC65350Pko<? extends UIContentAssem> LIZLLL(KRA panelContext) {
        o.LJIIIZ(panelContext, "panelContext");
        return C65352Pkq.LIZ(StoryDetailComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* renamed from: LJ */
    public final boolean x0(KRA context) {
        o.LJIIIZ(context, "context");
        return o.LJ(context.LIZ, "DETAIL_STORY");
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final /* bridge */ /* synthetic */ boolean x0(KRA kra) {
        return x0(kra);
    }
}
