package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.C65352Pkq;
import X.C8W0;
import X.InterfaceC65350Pko;
import com.ss.android.ugc.aweme.IToolsBusinessService;
import com.ss.android.ugc.aweme.assem.TikTokToolsAssem;
import com.ss.android.ugc.aweme.assem.ToolsActivityAssem;

/* loaded from: classes10.dex */
public final class ToolsBusinessServiceImpl implements IToolsBusinessService {
    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC65350Pko<? extends C8W0> getTikToktoolsAssem() {
        return C65352Pkq.LIZ(TikTokToolsAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IToolsBusinessService
    public InterfaceC65350Pko<? extends C8W0> getToolsActivityAssem() {
        return C65352Pkq.LIZ(ToolsActivityAssem.class);
    }

    public static IToolsBusinessService createIToolsBusinessServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IToolsBusinessService.class, z);
        if (LIZ != null) {
            return (IToolsBusinessService) LIZ;
        }
        if (C58096Mr6.c6 == null) {
            synchronized (IToolsBusinessService.class) {
                if (C58096Mr6.c6 == null) {
                    C58096Mr6.c6 = new ToolsBusinessServiceImpl();
                }
            }
        }
        return C58096Mr6.c6;
    }
}
