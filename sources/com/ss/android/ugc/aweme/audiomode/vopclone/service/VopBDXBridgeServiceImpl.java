package com.ss.android.ugc.aweme.audiomode.vopclone.service;

import X.C47261Igj;
import X.C58096Mr6;
import X.C86848Y6q;
import X.InterfaceC37666EqM;
import java.util.List;

/* loaded from: classes11.dex */
public final class VopBDXBridgeServiceImpl implements IVopBDXBridgeService {
    public static IVopBDXBridgeService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IVopBDXBridgeService.class, false);
        if (LIZ != null) {
            return (IVopBDXBridgeService) LIZ;
        }
        if (C58096Mr6.LLIZ == null) {
            synchronized (IVopBDXBridgeService.class) {
                if (C58096Mr6.LLIZ == null) {
                    C58096Mr6.LLIZ = new VopBDXBridgeServiceImpl();
                }
            }
        }
        return C58096Mr6.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopBDXBridgeService
    public final List<Class<? extends InterfaceC37666EqM>> provideXBridgetIDLMethodList() {
        return C47261Igj.LJJIJ(C86848Y6q.class);
    }
}
