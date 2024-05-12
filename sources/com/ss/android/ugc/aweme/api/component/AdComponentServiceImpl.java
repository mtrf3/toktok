package com.ss.android.ugc.aweme.api.component;

import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.api.component.anole.full.AnoleFullAboveInteractionTriggerComponent;
import com.ss.android.ugc.aweme.api.component.anole.left.AnoleLeftTriggerComponent;
import com.ss.android.ugc.aweme.api.component.panel.CommercePanelComponent;

/* loaded from: classes9.dex */
public final class AdComponentServiceImpl implements IAdComponentService {
    @Override // com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService
    public final C65776Prg LIZ() {
        return C65352Pkq.LIZ(CommercePanelComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService
    public final C65776Prg LIZIZ() {
        return C65352Pkq.LIZ(AnoleFullAboveInteractionTriggerComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService
    public final C65776Prg LIZJ() {
        return C65352Pkq.LIZ(AnoleLeftTriggerComponent.class);
    }

    public static IAdComponentService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IAdComponentService.class, false);
        if (LIZ != null) {
            return (IAdComponentService) LIZ;
        }
        if (C58096Mr6.LLIIJLIL == null) {
            synchronized (IAdComponentService.class) {
                if (C58096Mr6.LLIIJLIL == null) {
                    C58096Mr6.LLIIJLIL = new AdComponentServiceImpl();
                }
            }
        }
        return C58096Mr6.LLIIJLIL;
    }
}
