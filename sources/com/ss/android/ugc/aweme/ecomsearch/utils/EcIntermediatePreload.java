package com.ss.android.ugc.aweme.ecomsearch.utils;

import X.AbstractC73672Svk;
import X.C38827FLr;
import X.C50948Jz6;
import X.C62814Ol0;
import X.KAA;
import X.KAM;
import X.KB1;
import X.KB4;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.ecomsearch.repo.EcSuggestWordsApi;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcIntermediatePreload implements X8M<EcSuggestWordsApi.SuggestApi, AbstractC73672Svk<String>> {
    public static final KAM Companion = new KAM();
    public static String ecomUserActions;
    public static String suggestPreResponseStr;
    public boolean isFirstRequest = true;

    public final boolean isFirstRequest() {
        return this.isFirstRequest;
    }

    private final String obtainReqSource(C50948Jz6 c50948Jz6) {
        String value;
        String middleReqSource;
        if (c50948Jz6 != null && c50948Jz6.getEcSearchEntranceData() != null) {
            ECSearchEntranceData ecSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
            if (ecSearchEntranceData != null && (middleReqSource = ecSearchEntranceData.getMiddleReqSource()) != null) {
                return middleReqSource;
            }
        } else {
            KB4 LJFF = KB1.LJFF(KB1.LIZ(c50948Jz6));
            if (LJFF != null && (value = LJFF.getValue()) != null) {
                return value;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // X.X8D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean enable(android.os.Bundle r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L52
            java.lang.String r0 = "search_enter_param"
            java.io.Serializable r6 = r9.getSerializable(r0)
        L9:
            com.ss.android.ugc.aweme.search.model.SearchResultParam r6 = (com.ss.android.ugc.aweme.search.model.SearchResultParam) r6
            if (r6 == 0) goto L50
            X.Jz6 r5 = r6.getSearchEnterParam()
        L11:
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            java.lang.String r0 = "EcIntermediatePreload is enable:"
            r4.append(r0)
            if (r6 == 0) goto L4e
            java.lang.String r0 = r6.getKeyword()
        L20:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L4c
            if (r5 == 0) goto L4a
            java.lang.String r1 = r5.getEnterSearchFrom()
        L2e:
            java.lang.String r0 = "mall"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L4c
            r0 = 1
        L37:
            r4.append(r0)
            X.X1D.LIZIZ(r4)
            if (r6 == 0) goto L43
            java.lang.String r7 = r6.getKeyword()
        L43:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L54
            return r3
        L4a:
            r1 = r7
            goto L2e
        L4c:
            r0 = 0
            goto L37
        L4e:
            r0 = r7
            goto L20
        L50:
            r5 = r7
            goto L11
        L52:
            r6 = r7
            goto L9
        L54:
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            X.KAr r0 = X.EnumC51281KAr.MALL
            int r0 = r0.getValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r3] = r0
            X.KAr r0 = X.EnumC51281KAr.HOMEPAGE_MALL
            int r0 = r0.getValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r2] = r0
            java.util.List r1 = X.C47261Igj.LJJIJIIJI(r1)
            int r0 = X.KB1.LIZ(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.utils.EcIntermediatePreload.enable(android.os.Bundle):boolean");
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(0, Api.LIZ, false, 5);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIJ(exception, "exception");
        throw exception;
    }

    public final void setFirstRequest(boolean z) {
        this.isFirstRequest = z;
    }

    private final void appendHintHolderIfHave(KAA kaa, C50948Jz6 c50948Jz6) {
        if (c50948Jz6 != null && C62814Ol0.LJIIJ(c50948Jz6) && this.isFirstRequest) {
            this.isFirstRequest = false;
            kaa.LJ = c50948Jz6.getSearchHint();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0243  */
    @Override // X.X8M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.AbstractC73672Svk<java.lang.String> preload(android.os.Bundle r38, X.InterfaceC88472Yns<? super java.lang.Class<com.ss.android.ugc.aweme.ecomsearch.repo.EcSuggestWordsApi.SuggestApi>, ? extends com.ss.android.ugc.aweme.ecomsearch.repo.EcSuggestWordsApi.SuggestApi> r39) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.utils.EcIntermediatePreload.preload(android.os.Bundle, X.Yns):X.Svk");
    }
}
