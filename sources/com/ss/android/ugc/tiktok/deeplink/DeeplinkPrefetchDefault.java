package com.ss.android.ugc.tiktok.deeplink;

import X.FDP;
import X.FDQ;
import android.content.Context;

/* loaded from: classes7.dex */
public final class DeeplinkPrefetchDefault implements IDeepLinkSecurityService {
    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    public final boolean LIZIZ(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    public final void LIZJ(Context context) {
    }

    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    public final FDQ LIZ(FDP fdp) {
        return new FDQ();
    }
}
