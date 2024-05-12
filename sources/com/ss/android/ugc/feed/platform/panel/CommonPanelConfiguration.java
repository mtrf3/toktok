package com.ss.android.ugc.feed.platform.panel;

import X.C8VV;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class CommonPanelConfiguration implements IPanelConfigurationProtocol {
    public abstract void LIZ(BasePanelUIComponent basePanelUIComponent);

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final void LLLLLLLLL(BasePanelUIComponent basePanelUIComponent) {
        BasePanelUIComponent component = basePanelUIComponent;
        o.LJIIIZ(component, "component");
        C8VV.LIZJ(component, new AqS174S0100000_8(component, 265));
        LIZ(component);
    }
}
