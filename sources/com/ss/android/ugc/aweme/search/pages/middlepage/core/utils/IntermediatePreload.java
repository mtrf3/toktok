package com.ss.android.ugc.aweme.search.pages.middlepage.core.utils;

import X.AbstractC73672Svk;
import X.C38827FLr;
import X.C50293JoX;
import X.C50431Jql;
import X.C50469JrN;
import X.C50650JuI;
import X.C50669Jub;
import X.C50671Jud;
import X.C50699Jv5;
import X.C50700Jv6;
import X.C50704JvA;
import X.C50708JvE;
import X.C50720JvQ;
import X.C50721JvR;
import X.C50722JvS;
import X.C50723JvT;
import X.C50744Jvo;
import X.C50768JwC;
import X.C50789JwX;
import X.C50837JxJ;
import X.C50948Jz6;
import X.C51096K3o;
import X.C56662Kg;
import X.InterfaceC88472Yns;
import X.JPF;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.SuggestWordsApi;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class IntermediatePreload implements X8M<SuggestWordsApi.SuggestApi, AbstractC73672Svk<String>> {
    public boolean isFirstRequest = true;
    public static final C50720JvQ Companion = new C50720JvQ();
    public static final int $stable = 8;

    public final boolean isFirstRequest() {
        return this.isFirstRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // X.X8D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean enable(android.os.Bundle r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L51
            java.lang.String r0 = "search_enter_param"
            java.io.Serializable r4 = r7.getSerializable(r0)
        L9:
            com.ss.android.ugc.aweme.search.model.SearchResultParam r4 = (com.ss.android.ugc.aweme.search.model.SearchResultParam) r4
            if (r4 == 0) goto L4f
            X.Jz6 r1 = r4.getSearchEnterParam()
        L11:
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r0 = "IntermediatePreload is enable:"
            r3.append(r0)
            if (r4 == 0) goto L4d
            java.lang.String r0 = r4.getKeyword()
        L20:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r0 == 0) goto L4b
            if (r1 == 0) goto L49
            java.lang.String r1 = r1.getEnterSearchFrom()
        L2d:
            java.lang.String r0 = "mall"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L4b
            r0 = 1
        L36:
            r3.append(r0)
            X.X1D.LIZIZ(r3)
            if (r4 == 0) goto L42
            java.lang.String r5 = r4.getKeyword()
        L42:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L53
            return r2
        L49:
            r1 = r5
            goto L2d
        L4b:
            r0 = 0
            goto L36
        L4d:
            r0 = r5
            goto L20
        L4f:
            r1 = r5
            goto L11
        L51:
            r4 = r5
            goto L9
        L53:
            boolean r0 = X.C50723JvT.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.middlepage.core.utils.IntermediatePreload.enable(android.os.Bundle):boolean");
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

    private final void appendHintHolderIfHave(JPF jpf, C50948Jz6 c50948Jz6) {
        if (c50948Jz6 != null && o.LJ("1", c50948Jz6.obtainLogData("is_from_video")) && this.isFirstRequest) {
            this.isFirstRequest = false;
            jpf.LJFF = c50948Jz6.getSearchHint();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public AbstractC73672Svk<String> preload(Bundle bundle, InterfaceC88472Yns<? super Class<SuggestWordsApi.SuggestApi>, ? extends SuggestWordsApi.SuggestApi> create) {
        Serializable serializable;
        C50431Jql c50431Jql;
        Serializable serializable2;
        C50948Jz6 c50948Jz6;
        String str;
        String str2;
        C50700Jv6 c50700Jv6;
        o.LJIIIZ(create, "create");
        if (bundle != null) {
            bundle.putString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", "intermediate_preload");
        }
        Integer num = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("search_global_param");
        } else {
            serializable = null;
        }
        if (serializable instanceof C50431Jql) {
            c50431Jql = (C50431Jql) serializable;
        } else {
            c50431Jql = null;
        }
        if (bundle != null) {
            serializable2 = bundle.getSerializable("search_enter_param");
        } else {
            serializable2 = null;
        }
        SearchResultParam searchResultParam = (SearchResultParam) serializable2;
        if (searchResultParam != null) {
            c50948Jz6 = searchResultParam.getSearchEnterParam();
        } else {
            c50948Jz6 = null;
        }
        List<SearchHistory> historyList = C50837JxJ.LJIIL(null, null).LJFF(C50837JxJ.LJIILJJIL());
        C50671Jud c50671Jud = C50669Jub.LIZIZ;
        C50669Jub LIZ = c50671Jud.LIZ();
        o.LJIIIIZZ(historyList, "historyList");
        LIZ.LIZ = historyList;
        if (c50948Jz6 != null) {
            str = c50948Jz6.getGroupId();
            str2 = c50948Jz6.getEnterSearchFrom();
        } else {
            str = null;
            str2 = null;
        }
        String LJ = C50293JoX.LJ(str, str2);
        if (LJ == null) {
            LJ = "";
        }
        C50699Jv5 c50699Jv5 = new C50699Jv5(new C50650JuI(null, null, new C50469JrN(null, LJ, null, null, null, null, 61, null), null, null, null, null, 123, null));
        if (C51096K3o.LIZ() && c50431Jql != null) {
            c50699Jv5.LIZIZ(new C50704JvA(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, System.currentTimeMillis(), c50431Jql.getBlankPageEnterForm(), c50431Jql.getBlankPageEnterMethod()));
        }
        JPF jpf = new JPF();
        jpf.LIZ = "100011";
        jpf.LIZIZ = LJ;
        jpf.LJ = Integer.valueOf(C50723JvT.LIZ(C50721JvR.LJLIL, C50722JvS.LJLIL));
        appendHintHolderIfHave(jpf, c50948Jz6);
        if (C51096K3o.LIZ()) {
            c50699Jv5.LIZIZ(new C50708JvE(true));
            c50700Jv6 = (C50700Jv6) ((C50744Jvo) c50699Jv5.LJII.getValue()).LIZIZ();
        } else {
            c50700Jv6 = null;
        }
        jpf.LJI = C50699Jv5.LJIIIIZZ(null, c50699Jv5.LIZLLL().LIZIZ(), c50700Jv6);
        jpf.LJII = Integer.valueOf(c50699Jv5.LJFF() ? 1 : 0);
        jpf.LJIIIIZZ = c50699Jv5.LJ().LIZIZ().M();
        if (a.LJFF().LJJJJI()) {
            num = 1;
        }
        jpf.LJIIIZ = num;
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0 && c50789JwX.LIZLLL == 0) {
            c50789JwX.LIZLLL = System.currentTimeMillis();
        }
        return create.invoke(SuggestWordsApi.SuggestApi.class).getSuggestWordsWithRawStringSingle(jpf.LIZ, jpf.LIZIZ, null, jpf.LJFF, jpf.LJ, null, c50671Jud.LIZ().LIZLLL(), jpf.LJI, jpf.LJII, jpf.LJIIIIZZ, "", "", "", "qrec", jpf.LJIIIZ);
    }
}
