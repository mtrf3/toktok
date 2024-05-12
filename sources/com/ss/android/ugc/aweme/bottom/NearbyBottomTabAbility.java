package com.ss.android.ugc.aweme.bottom;

import X.AbstractC53895LDf;
import X.ActivityC45651qj;
import X.C116694i1;
import X.C188727au;
import X.C2NH;
import X.C3SZ;
import X.C40328FsC;
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
import X.C54045LIz;
import X.C55096Ljo;
import X.C55230Lly;
import X.FMX;
import X.LJ1;
import X.LJ5;
import X.LLE;
import X.LQ8;
import X.O5Y;
import X.Z9N;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.interfaces.INearbyBottomTabAbility;
import com.ss.android.ugc.aweme.interfaces.INearbyFeedAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public abstract class NearbyBottomTabAbility implements INearbyBottomTabAbility, LLE {
    public final Context LJLIL;

    public NearbyBottomTabAbility(Context context) {
        this.LJLIL = context;
        C116694i1.LIZ(C45804HyK.LJJIFFI(context)).hv0(this);
    }

    @Override // com.ss.android.ugc.aweme.interfaces.INearbyBottomTabAbility
    public final void U4(String sourcePage, String enterFrom) {
        String str;
        String str2;
        o.LJIIIZ(sourcePage, "sourcePage");
        o.LJIIIZ(enterFrom, "enterFrom");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
        if (LJJIFFI == null) {
            return;
        }
        if (a.LJIIIZ().LIZJ()) {
            C40328FsC.LIZLLL(LJJIFFI, R.string.g9g);
            return;
        }
        Aweme aweme = C3SZ.LIZ(LJJIFFI).LJLJLLL;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        C50947Jz5 newBuilder = C50948Jz6.Companion.newBuilder();
        newBuilder.LJ = str;
        newBuilder.LIZ = enterFrom;
        newBuilder.LJIIL = true;
        newBuilder.LIZLLL = sourcePage;
        C50948Jz6 LIZIZ = newBuilder.LIZIZ();
        C50652JuK c50652JuK = new C50652JuK(new C50650JuI(new C50433Jqn(enterFrom, null, false, false, null, null, 0, 0, false, 510, null), null, new C50469JrN(null, str, null, null, null, null, 61, null), null, new C49636Jdw(Long.valueOf(O5Y.LJIJJ())), null, null, 106, null), new C50438Jqs(null, new C50431Jql(0, 0, null, null, enterFrom, "enter", null, 79, null), 1, null));
        SearchResultParam param = new SearchResultParam();
        param.setSearchFrom(enterFrom);
        Z9N z9n = Z9N.LIZIZ;
        Context context = this.LJLIL;
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

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        LJ1 LJII;
        String str4;
        AbstractC53895LDf rv0;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLIL);
        if (LJJIFFI == null) {
            return;
        }
        LJ5.LIZIZ = o.LJ(str, "Nearby");
        if (NearbyTabConfig.LIZLLL()) {
            C54045LIz.LIZ.getClass();
            if (C54045LIz.LIZ()) {
                return;
            }
            if (o.LJ(str, "Nearby")) {
                if (NearbyTabConfig.LJI()) {
                    LJ5.LJIIJ(LJJIFFI);
                }
                INearbyFeedAbility iNearbyFeedAbility = (INearbyFeedAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), INearbyFeedAbility.class, null);
                if (iNearbyFeedAbility != null) {
                    iNearbyFeedAbility.Kr();
                }
                if (NearbyFeedServiceImpl.LJJI().LJI() && o.LJ(str3, "publish_landing")) {
                    if (str2 == null || (rv0 = Hox.LJLLI.LIZ(LJJIFFI).rv0(str2)) == null || (str4 = rv0.LJIIL()) == null) {
                        str4 = str2;
                    }
                    LQ8.LIZ(str4, str3);
                }
            }
            if (!o.LJ(str2, "Nearby")) {
                return;
            }
            INearbyFeedAbility iNearbyFeedAbility2 = (INearbyFeedAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJJIFFI, null), INearbyFeedAbility.class, null);
            if (iNearbyFeedAbility2 != null) {
                iNearbyFeedAbility2.Kr();
            }
            LJ1 LJII2 = LJ5.LJII(LJJIFFI);
            if (LJII2 != null && LJII2.LJLJJI && (LJII = LJ5.LJII(LJJIFFI)) != null) {
                LJII.LIZJ();
            }
            C2NH.LIZ.post(new ARunnableS45S0100000_9(LJJIFFI, 20));
        }
    }
}
