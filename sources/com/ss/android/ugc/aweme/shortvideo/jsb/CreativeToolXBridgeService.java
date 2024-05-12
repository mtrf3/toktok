package com.ss.android.ugc.aweme.shortvideo.jsb;

import X.C47261Igj;
import X.C58096Mr6;
import X.InterfaceC37666EqM;
import X.NB9;
import java.util.List;

/* loaded from: classes11.dex */
public final class CreativeToolXBridgeService implements ICreativeToolXBridgeService {
    @Override // com.ss.android.ugc.aweme.shortvideo.jsb.ICreativeToolXBridgeService
    public final List<Class<? extends InterfaceC37666EqM>> provideXBridgetIDLMethodList() {
        return C47261Igj.LJII(NB9.class);
    }

    public static ICreativeToolXBridgeService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ICreativeToolXBridgeService.class, false);
        if (LIZ != null) {
            return (ICreativeToolXBridgeService) LIZ;
        }
        if (C58096Mr6.Z6 == null) {
            synchronized (ICreativeToolXBridgeService.class) {
                if (C58096Mr6.Z6 == null) {
                    C58096Mr6.Z6 = new CreativeToolXBridgeService();
                }
            }
        }
        return C58096Mr6.Z6;
    }
}
