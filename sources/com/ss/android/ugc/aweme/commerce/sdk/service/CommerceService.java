package com.ss.android.ugc.aweme.commerce.sdk.service;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;

/* loaded from: classes13.dex */
public final class CommerceService extends EmptyCommerceService {
    public static ICommerceService createICommerceServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ICommerceService.class, z);
        if (LIZ != null) {
            return (ICommerceService) LIZ;
        }
        if (C58096Mr6.LLL == null) {
            synchronized (ICommerceService.class) {
                if (C58096Mr6.LLL == null) {
                    C58096Mr6.LLL = new CommerceService();
                }
            }
        }
        return C58096Mr6.LLL;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05e7  */
    @Override // com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService, com.ss.android.ugc.aweme.commerce.service.ICommerceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void logCommerceEvents(java.lang.String r4, X.C71367Rzf r5) {
        /*
            Method dump skipped, instructions count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService.logCommerceEvents(java.lang.String, X.Rzf):void");
    }
}
