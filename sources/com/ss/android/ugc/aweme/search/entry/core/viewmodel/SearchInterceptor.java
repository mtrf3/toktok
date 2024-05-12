package com.ss.android.ugc.aweme.search.entry.core.viewmodel;

import X.AnonymousClass114;
import X.C16880lQ;
import X.C221178m9;
import X.C2U8;
import X.C36524EVc;
import X.C45804HyK;
import X.C50431Jql;
import X.C50443Jqx;
import X.C50600JtU;
import X.C50652JuK;
import X.C50699Jv5;
import X.C50720JvQ;
import X.C50768JwC;
import X.C50945Jz3;
import X.C50947Jz5;
import X.C50948Jz6;
import X.C51096K3o;
import X.C62712d9;
import X.C63081OpJ;
import X.DZU;
import X.EnumC51264KAa;
import X.KB1;
import X.KBF;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.MiddleForSearchFromEC;
import com.ss.android.ugc.aweme.impl.LauncherTaskApiImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.utils.IntermediatePreload;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class SearchInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        String str2;
        String str3;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        StringBuilder LIZ = X1D.LIZ();
        String str4 = null;
        if (routeIntent != null && (uri4 = routeIntent.getUri()) != null) {
            str = uri4.getHost();
        } else {
            str = null;
        }
        LIZ.append(str);
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
            str2 = uri3.getPath();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        if (!TextUtils.equals(X1D.LIZIZ(LIZ), "search")) {
            StringBuilder LIZ2 = X1D.LIZ();
            if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
                str3 = uri2.getHost();
            } else {
                str3 = null;
            }
            LIZ2.append(str3);
            if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                str4 = uri.getPath();
            }
            LIZ2.append(str4);
            if (!TextUtils.equals(X1D.LIZIZ(LIZ2), "search/")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Bundle bundle;
        Set<String> set;
        int i;
        Bundle LLJJIJI;
        if (routeIntent != null && routeIntent.getUri() != null && context != null) {
            Uri uri = routeIntent.getUri();
            Intent extra = routeIntent.getExtra();
            if (extra != null) {
                bundle = C16880lQ.LLJJIJI(extra);
            } else {
                bundle = null;
            }
            Intent extra2 = routeIntent.getExtra();
            if (extra2 != null && (LLJJIJI = C16880lQ.LLJJIJI(extra2)) != null) {
                set = LLJJIJI.keySet();
            } else {
                set = null;
            }
            String str = "";
            if (bundle != null && set != null) {
                Uri.Builder buildUpon = uri.buildUpon();
                for (String str2 : set) {
                    Object LLJJIII = C16880lQ.LLJJIII(bundle, str2);
                    if (LLJJIII == null) {
                        LLJJIII = "";
                    }
                    buildUpon.appendQueryParameter(str2, String.valueOf(LLJJIII));
                }
                uri = buildUpon.build();
            }
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null && a.LJIIIZ().LIZJ()) {
                AnonymousClass114.LIZ(LJIJJ, R.string.g9g);
                return true;
            }
            o.LJIIIIZZ(uri, "uri");
            Bundle animationBundle = routeIntent.getAnimationBundle();
            C50768JwC c50768JwC = C50768JwC.LIZ;
            c50768JwC.LIZLLL();
            IEcomSearchService LJJIJL = C63081OpJ.LJJIJL();
            LJJIJL.LIZ(uri, null, "before_schema");
            KBF LJJIJIIJI = LJJIJL.LJJIJIIJI(uri);
            Uri LJJIIJZLJL = LJJIJL.LJJIIJZLJL(uri, LJJIJIIJI);
            if (LJJIJIIJI == KBF.FROM_UG_DEEPLINK_BUT_NOT_HAVE_FUNCTION) {
                SmartRoute LJFF = LJJIJL.LJFF(context);
                if (LJFF != null) {
                    LJFF.open();
                }
            } else {
                C36524EVc.LIZ(2000L, 2, 8);
                C50947Jz5 newBuilder = C50948Jz6.Companion.newBuilder();
                C50652JuK LIZ = C50945Jz3.LIZ(LJJIIJZLJL, newBuilder);
                C50948Jz6 LIZIZ = newBuilder.LIZIZ();
                SearchResultParam searchResultParam = new SearchResultParam();
                C50945Jz3.LIZIZ(LJJIIJZLJL, searchResultParam);
                searchResultParam.setSearchEnterParam(LIZIZ);
                LJJIJL.LJJJI(LJJIIJZLJL, LJJIJIIJI, LIZ.getImmutableData().getSearchEcommerceModel(), searchResultParam);
                c50768JwC.LIZJ(searchResultParam);
                C50699Jv5 c50699Jv5 = new C50699Jv5(LIZ.getImmutableData());
                if (DZU.LJLILLLLZI.LJJII()) {
                    String enterSearchFrom = LIZIZ.getEnterSearchFrom();
                    if (enterSearchFrom != null) {
                        str = enterSearchFrom;
                    }
                    c50699Jv5.LIZIZ(new C50443Jqx(str));
                    if (!c50699Jv5.LJ().LIZIZ().LJLJI) {
                        if (C51096K3o.LIZ()) {
                            C2U8.LIZ(new C221178m9());
                        }
                        LauncherTaskApiImpl.LJIIIIZZ().LIZJ();
                        C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
                        if (searchEnterParam != null) {
                            i = searchEnterParam.getEcSearchEntranceValue();
                        } else {
                            i = -100;
                        }
                        if (KB1.LJII(i)) {
                            IMiddleForSearchFromEC LJIILIIL = MiddleForSearchFromEC.LJIILIIL();
                            LJIILIIL.LIZJ();
                            LJIILIIL.LIZLLL(EnumC51264KAa.START);
                            searchResultParam.isECEntrance = true;
                            searchResultParam.isECEntranceMiddlePreload = true;
                            LJIILIIL.LJ(searchResultParam);
                        } else {
                            C50720JvQ c50720JvQ = IntermediatePreload.Companion;
                            C50431Jql globalData = LIZ.getMutableData().getGlobalData();
                            c50720JvQ.getClass();
                            C50720JvQ.LIZ(searchResultParam, globalData);
                        }
                    }
                }
                LJJIJL.LIZ(null, searchResultParam, "after_schema");
                C50600JtU.LIZ(context, searchResultParam, LIZIZ, animationBundle, LIZ, routeIntent);
            }
            return true;
        }
        return false;
    }
}
