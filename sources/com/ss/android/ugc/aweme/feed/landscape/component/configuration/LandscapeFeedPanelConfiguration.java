package com.ss.android.ugc.aweme.feed.landscape.component.configuration;

import X.C8VV;
import X.KRA;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.IPanelConfigurationProtocol;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LandscapeFeedPanelConfiguration implements IPanelConfigurationProtocol {
    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final void LLLLLLLLL(BasePanelUIComponent basePanelUIComponent) {
        BasePanelUIComponent component = basePanelUIComponent;
        o.LJIIIZ(component, "component");
        C8VV.LIZJ(component, new AqS170S0100000_4(component, 986));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final boolean x0(KRA context) {
        o.LJIIIZ(context, "context");
        return o.LJ(context.LIZ, "Landscape");
    }
}
