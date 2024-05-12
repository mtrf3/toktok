package com.ss.android.ugc.aweme.music;

import X.C16880lQ;
import X.C35972E9w;
import X.C39905FlN;
import X.C40342FsQ;
import X.C40343FsR;
import X.C60114NiY;
import X.C60116Nia;
import X.C60118Nic;
import X.C60123Nih;
import X.C60134Nis;
import X.C60139Nix;
import X.C62712d9;
import X.OKG;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicThirdPartyInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, "music_third_party_webview")) {
            if (routeIntent != null) {
                str2 = routeIntent.getHost();
            }
            if (!TextUtils.equals(str2, "third_party_common_webview")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        String LLJJIJIIJIL;
        if (context == null || routeIntent == null || (extra = routeIntent.getExtra()) == null) {
            return false;
        }
        C35972E9w.LIZ = extra.getLongExtra("anchor_click_time", -1L);
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(extra, "anchor_subtype");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        if (!TextUtils.equals(routeIntent.getHost(), "music_third_party_webview") || (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(extra, "url")) == null) {
            return false;
        }
        String url = Uri.decode(LLJJIJIIJIL);
        C60114NiY.LIZIZ = C16880lQ.LLJJIJIIJIL(extra, "anchor_id");
        C60114NiY.LIZ.appendQueryParameter("report_type", "third_party_anchor").appendQueryParameter("object_id", C16880lQ.LLJJIJIIJIL(extra, "group_id")).appendQueryParameter("owner_id", C16880lQ.LLJJIJIIJIL(extra, "author_id")).appendQueryParameter("anchor_id", C60114NiY.LIZIZ).appendQueryParameter("report_url", C16880lQ.LLJJIJIIJIL(extra, "url"));
        o.LJIIIIZZ(url, "url");
        String builder = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", url).appendQueryParameter("use_spark", "1").appendQueryParameter("enable_scc", "1").toString();
        o.LJIIIIZZ(builder, "parse(MusicSparkConsts.K…)\n            .toString()");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        sparkContext.bid = "music_third_party";
        sparkContext.LJJIJLIJ(builder);
        sparkContext.LJJIIJ("nav_btn_type", "more");
        sparkContext.LJJIFFI(1, "show_web_url");
        sparkContext.LJJIJL(new C60116Nia());
        sparkContext.LJJIJIL(new C60123Nih());
        sparkContext.LJJIJIIJI(new C60118Nic());
        sparkContext.LJJI(new C39905FlN(LLJJIJIIJIL2));
        sparkContext.LJJ(new C60134Nis());
        sparkContext.LJJ(new C60139Nix());
        OKG.LIZLLL(c40342FsQ, context, sparkContext);
        return true;
    }
}
