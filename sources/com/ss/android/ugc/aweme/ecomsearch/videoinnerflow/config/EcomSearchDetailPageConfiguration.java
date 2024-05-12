package com.ss.android.ugc.aweme.ecomsearch.videoinnerflow.config;

import X.C8VV;
import X.KRA;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class EcomSearchDetailPageConfiguration extends DetailPanelConfiguration {
    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final void LIZJ(BasePanelUIComponent basePanelUIComponent) {
        o.LJIIIZ(basePanelUIComponent, "<this>");
        C8VV.LIZJ(basePanelUIComponent, new AqS169S0100000_3(basePanelUIComponent, 107));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* renamed from: LJ */
    public final boolean x0(KRA context) {
        o.LJIIIZ(context, "context");
        return o.LJ(context.LIZ, "DETAIL_ECOM_SEARCH");
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final /* bridge */ /* synthetic */ boolean x0(KRA kra) {
        return x0(kra);
    }
}
