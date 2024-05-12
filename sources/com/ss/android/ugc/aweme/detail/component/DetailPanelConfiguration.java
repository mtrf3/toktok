package com.ss.android.ugc.aweme.detail.component;

import X.C211568Sa;
import X.C65352Pkq;
import X.C8VV;
import X.InterfaceC65350Pko;
import X.KRA;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class DetailPanelConfiguration extends CommonPanelConfiguration {
    public void LIZJ(BasePanelUIComponent basePanelUIComponent) {
        o.LJIIIZ(basePanelUIComponent, "<this>");
    }

    public InterfaceC65350Pko<? extends UIContentAssem> LIZLLL(KRA panelContext) {
        o.LJIIIZ(panelContext, "panelContext");
        return C65352Pkq.LIZ(DetailPageComponent.class);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration
    public final void LIZ(BasePanelUIComponent basePanelUIComponent) {
        o.LJIIIZ(basePanelUIComponent, "<this>");
        C8VV.LIZJ(basePanelUIComponent, new AqS140S0200000_9(this, basePanelUIComponent, 3));
        if (C211568Sa.LIZ()) {
            C8VV.LIZJ(basePanelUIComponent, new AqS170S0100000_4(basePanelUIComponent, 169));
        }
        LIZJ(basePanelUIComponent);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public boolean x0(KRA context) {
        o.LJIIIZ(context, "context");
        return o.LJ(context.LIZ, "DETAIL");
    }
}
