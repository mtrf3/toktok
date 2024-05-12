package com.ss.android.ugc.aweme.router;

import X.C30591Hz;
import X.C38281F0r;
import X.C47261Igj;
import X.C62712d9;
import X.M66;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ujb.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class UrlPathParamsInterceptor implements IInterceptor {
    public final ArrayList<String> LJLIL = C47261Igj.LJII("aweme://challenge/detail/:id", "aweme://music/detail/:id", "aweme://assmusic/category/:cid", "aweme://music/category/:mc_id", "aweme://user/profile/:uid", "aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type", "aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type/:enter_from", "aweme://story/detail/:id", "aweme://aweme/detail/:id", "aweme://aweme/detaillist/:id", "aweme://tuwen/detail/:id", "aweme://aweme/zhima/:type", "aweme://stickers/detail/:id", "aweme://user/qna/profile/:to_user_id", "aweme://user/ask/:id", "aweme://qna/detail/:id", "aweme://library/detail/:id", "aweme://add_yours/hub/:uid");
    public String LJLILLLLZI = "";

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        if (str != null && (!o.LJJJLIIL(str, "//", false) || (str = i0.LJFF("aweme:", str)) != null)) {
            str2 = o.LJJJJZ(str, M66.LIZIZ.getCustomScheme(), "aweme", false);
        }
        Iterator<String> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            String atypicalUrl = it.next();
            if (C30591Hz.LJIL(atypicalUrl, str2)) {
                kotlin.jvm.internal.o.LJIIIIZZ(atypicalUrl, "atypicalUrl");
                this.LJLILLLLZI = atypicalUrl;
                return true;
            }
        }
        this.LJLILLLLZI = "";
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        boolean z;
        String str;
        String str2;
        Set<String> queryParameterNames;
        String str3;
        Uri uri;
        if (TextUtils.isEmpty(this.LJLILLLLZI)) {
            return false;
        }
        List LJLJJL = s.LJLJJL(this.LJLILLLLZI, new String[]{"/:"}, 0, 6);
        if (!LJLJJL.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = "";
        } else {
            str = (String) ListProtector.get(LJLJJL, 0);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C38281F0r c38281F0r = new C38281F0r(str);
        List LJIIL = C30591Hz.LJIIL(this.LJLILLLLZI);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str2 = uri.toString();
        } else {
            str2 = null;
        }
        List LJIIL2 = C30591Hz.LJIIL(str2);
        int size = LJIIL.size();
        for (int i = 1; i < size; i++) {
            if (i < size) {
                String key = (String) ListProtector.get(LJIIL, i);
                String str4 = (String) ListProtector.get(LJIIL2, i);
                kotlin.jvm.internal.o.LJIIIIZZ(key, "key");
                String substring = key.substring(1);
                kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                c38281F0r.LIZLLL(substring, str4);
            }
        }
        if (routeIntent != null) {
            Uri uri2 = routeIntent.getUri();
            if (uri2 != null && (queryParameterNames = UriProtector.getQueryParameterNames(uri2)) != null) {
                for (String str5 : queryParameterNames) {
                    if (!TextUtils.isEmpty(str5)) {
                        Uri uri3 = routeIntent.getUri();
                        if (uri3 != null) {
                            str3 = UriProtector.getQueryParameter(uri3, str5);
                        } else {
                            str3 = null;
                        }
                        c38281F0r.LIZLLL(str5, str3);
                    }
                }
            }
            routeIntent.setUrl(c38281F0r.LJ());
        }
        this.LJLILLLLZI = "";
        return false;
    }
}
