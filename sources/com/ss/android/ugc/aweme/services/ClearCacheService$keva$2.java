package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import com.bytedance.keva.Keva;

/* loaded from: classes11.dex */
public final class ClearCacheService$keva$2 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final ClearCacheService$keva$2 INSTANCE = new ClearCacheService$keva$2();

    public ClearCacheService$keva$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("ClearCacheService");
    }
}
