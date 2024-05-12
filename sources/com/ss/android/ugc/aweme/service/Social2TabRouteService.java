package com.ss.android.ugc.aweme.service;

import X.ActivityC45651qj;
import X.C188727au;
import X.C3SZ;
import X.C45804HyK;
import X.C49636Jdw;
import X.C50431Jql;
import X.C50433Jqn;
import X.C50438Jqs;
import X.C50450Jr4;
import X.C50469JrN;
import X.C50650JuI;
import X.C50652JuK;
import X.C50947Jz5;
import X.C50948Jz6;
import X.FMX;
import X.LHM;
import X.O5Y;
import X.Z9N;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabRouteService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Social2TabRouteService implements ISocial2TabRouteService {
    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabRouteService
    public final void LIZ(Context context, String sourcePage, String enterFrom) {
        String str;
        String str2;
        ActivityC45651qj LJJIFFI;
        Aweme aweme;
        o.LJIIIZ(sourcePage, "sourcePage");
        o.LJIIIZ(enterFrom, "enterFrom");
        if (LHM.LIZIZ.LIZ().checkSearchRestriction()) {
            return;
        }
        if (context == null || (LJJIFFI = C45804HyK.LJJIFFI(context)) == null || (aweme = C3SZ.LIZ(LJJIFFI).LJLJLLL) == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        C50947Jz5 newBuilder = C50948Jz6.Companion.newBuilder();
        newBuilder.LJ = str;
        newBuilder.LIZ = enterFrom;
        newBuilder.LJIIL = true;
        newBuilder.LIZLLL = sourcePage;
        C50948Jz6 LIZIZ = newBuilder.LIZIZ();
        C50652JuK c50652JuK = new C50652JuK(new C50650JuI(new C50433Jqn(enterFrom, null, false, false, null, null, 0, 0, false, 510, null), null, new C50469JrN(null, str, null, null, null, null, 61, null), null, new C49636Jdw(Long.valueOf(O5Y.LJIJJ())), null, null, 106, null), new C50438Jqs(null, new C50431Jql(0, 0, null, null, "enter", enterFrom, null, 79, null), 1, null));
        SearchResultParam param = new SearchResultParam();
        param.setSearchFrom(enterFrom);
        Z9N z9n = Z9N.LIZIZ;
        o.LJIIIIZZ(param, "param");
        z9n.LIZ.LLJJ(new C50450Jr4(context, param, LIZIZ, c50652JuK, enterFrom));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", "enter");
        if (z9n.LJII()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("has_coin_task", str2);
        FMX.LJIIL("enter_search_blankpage", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", enterFrom);
        c188727au2.LJIIIZ("enter_method", "enter");
        FMX.LJIIL("enter_search", c188727au2.LIZ);
    }
}
