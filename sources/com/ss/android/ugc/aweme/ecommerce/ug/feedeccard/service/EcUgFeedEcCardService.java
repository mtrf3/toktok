package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service;

import X.C47261Igj;
import X.C55214Lli;
import X.C58096Mr6;
import java.util.List;

/* loaded from: classes11.dex */
public final class EcUgFeedEcCardService implements IFeedEcCardService {
    public static IFeedEcCardService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IFeedEcCardService.class, false);
        if (LIZ != null) {
            return (IFeedEcCardService) LIZ;
        }
        if (C58096Mr6.g0 == null) {
            synchronized (IFeedEcCardService.class) {
                if (C58096Mr6.g0 == null) {
                    C58096Mr6.g0 = new EcUgFeedEcCardService();
                }
            }
        }
        return C58096Mr6.g0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService
    public final List<Object> LIZIZ() {
        return C47261Igj.LJJIJ(C55214Lli.LJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x006b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r1) >= (r4.getNoInterestIntervalNotShow() * 60000)) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0151 A[EDGE_INSN: B:19:0x0151->B:20:0x0151 BREAK  A[LOOP:0: B:10:0x00f5->B:26:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[LOOP:0: B:10:0x00f5->B:26:?, LOOP_END, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest> LIZ(com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData r16, java.util.List<com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo> r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.EcUgFeedEcCardService.LIZ(com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData, java.util.List, java.lang.Object):java.util.List");
    }
}
