package com.ss.android.ugc.aweme.accountxbridge;

import X.AbstractC37594EpC;
import X.C47261Igj;
import X.C58096Mr6;
import X.C61214O0s;
import X.C77908Uhs;
import X.C77912Uhw;
import X.OT7;
import java.util.List;

/* loaded from: classes11.dex */
public final class AccountBDXBridgeService implements IAccountBDXBridgeService {
    @Override // com.ss.android.ugc.aweme.accountxbridge.IAccountBDXBridgeService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        return C47261Igj.LJJIJIIJI(C61214O0s.class, C77912Uhw.class, OT7.class, C77908Uhs.class);
    }

    public static IAccountBDXBridgeService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IAccountBDXBridgeService.class, false);
        if (LIZ != null) {
            return (IAccountBDXBridgeService) LIZ;
        }
        if (C58096Mr6.LJLLI == null) {
            synchronized (IAccountBDXBridgeService.class) {
                if (C58096Mr6.LJLLI == null) {
                    C58096Mr6.LJLLI = new AccountBDXBridgeService();
                }
            }
        }
        return C58096Mr6.LJLLI;
    }
}
