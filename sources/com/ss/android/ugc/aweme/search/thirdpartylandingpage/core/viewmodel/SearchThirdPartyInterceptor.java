package com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel;

import X.C16880lQ;
import X.C188727au;
import X.C35975E9z;
import X.C38430F6k;
import X.C40342FsQ;
import X.C40343FsR;
import X.C48841JEv;
import X.C60126Nik;
import X.C60131Nip;
import X.C60974NwQ;
import X.C60976NwS;
import X.C60977NwT;
import X.C60978NwU;
import X.C60984Nwa;
import X.C60986Nwc;
import X.C62712d9;
import X.C78613UtF;
import X.C78685UuP;
import X.C78966Uyw;
import X.FP2;
import X.FP7;
import X.FP9;
import X.InterfaceC60721NsL;
import X.NYZ;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.model.SearchLandingPageButtonInfo;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.model.SearchLandingPageExtraData;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class SearchThirdPartyInterceptor implements IInterceptor {
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
        if (!TextUtils.equals(X1D.LIZIZ(LIZ), "search_third_party")) {
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
            if (!TextUtils.equals(X1D.LIZIZ(LIZ2), "search_third_party/")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        Intent extra;
        String LLJJIJIIJIL;
        long j;
        boolean z;
        SearchLandingPageExtraData searchLandingPageExtraData = null;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        boolean z2 = false;
        if (uri == null || context == null || (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL((extra = routeIntent.getExtra()), "url")) == null) {
            return false;
        }
        String url = Uri.decode(LLJJIJIIJIL);
        o.LJIIIIZZ(url, "url");
        String builder = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", url).appendQueryParameter("use_spark", "1").toString();
        o.LJIIIIZZ(builder, "parse(SearchLandingPageC…)\n            .toString()");
        if (!C38430F6k.LIZ) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new FP2(null), 3);
            C38430F6k.LIZ = true;
        }
        FP9 fp9 = new FP9();
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new FP7(fp9, null), 3);
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        sparkContext.bid = "search_third_party";
        sparkContext.LJJIJLIJ(builder);
        sparkContext.LJJIIJ("nav_btn_type", "more");
        sparkContext.LJJIFFI(1, "show_web_url");
        sparkContext.LJJIJL(new C60126Nik());
        sparkContext.LJII(InterfaceC60721NsL.class, new NYZ());
        sparkContext.LJJIJIL(new C60978NwU());
        sparkContext.LJJIJIIJI(new C60976NwS());
        sparkContext.LJJI(new C60984Nwa(C38430F6k.LIZ, fp9));
        sparkContext.LJJ(new C60974NwQ(C38430F6k.LIZ, fp9));
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, sparkContext).LIZIZ();
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(extra, "click_time");
        if (LLJJIJIIJIL2 != null) {
            j = CastLongProtector.parseLong(LLJJIJIIJIL2);
        } else {
            j = -1;
        }
        C35975E9z.LIZ = j;
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(extra, "business_event_keys");
        if (C78685UuP.LJJJZ(LLJJIJIIJIL3)) {
            try {
                JSONObject LJJJLIIL = C78966Uyw.LJJJLIIL(LLJJIJIIJIL3);
                if (LJJJLIIL != null) {
                    C60977NwT.LIZLLL(LJJJLIIL);
                }
            } catch (Exception unused) {
                C60977NwT.LIZLLL(null);
            }
        } else {
            C60977NwT.LIZLLL(null);
        }
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(extra, "mob_extra");
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        try {
            searchLandingPageExtraData = (SearchLandingPageExtraData) GsonProtectorUtils.fromJson(LIZ, LLJJIJIIJIL4, SearchLandingPageExtraData.class);
        } catch (s unused2) {
        }
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(extra, "business_event_tracking");
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(extra, "report_event_tracking");
        if (LLJJIJIIJIL5 == null || LLJJIJIIJIL5.length() == 0) {
            if (searchLandingPageExtraData != null) {
                LIZ(LLJJIJIIJIL4, searchLandingPageExtraData, false, url);
            }
        } else {
            JSONObject LJJJLIIL2 = C78966Uyw.LJJJLIIL(LLJJIJIIJIL5);
            if (LJJJLIIL2 != null) {
                for (Map.Entry<String, Object> entry : JsonExtKt.toMap(LJJJLIIL2).entrySet()) {
                    C60977NwT.LIZ.LJI(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        if (LLJJIJIIJIL6 == null || LLJJIJIIJIL6.length() == 0) {
            if (searchLandingPageExtraData != null) {
                LIZ(LLJJIJIIJIL4, searchLandingPageExtraData, true, url);
            }
        } else {
            JSONObject LJJJLIIL3 = C78966Uyw.LJJJLIIL(LLJJIJIIJIL6);
            if (LJJJLIIL3 != null) {
                Uri.Builder builder2 = C60131Nip.LIZ;
                builder2.appendQueryParameter("report_url", url);
                builder2.appendQueryParameter("report_type", "outstation_res");
                for (Map.Entry<String, Object> entry2 : JsonExtKt.toMap(LJJJLIIL3).entrySet()) {
                    C60131Nip.LIZ.appendQueryParameter(entry2.getKey(), entry2.getValue().toString());
                }
            }
        }
        String LLJJIJIIJIL7 = C16880lQ.LLJJIJIIJIL(extra, "should_hide_report_function");
        if (LLJJIJIIJIL7 != null) {
            z = Boolean.parseBoolean(LLJJIJIIJIL7);
        } else {
            z = false;
        }
        C60986Nwc.LJII = z;
        String LLJJIJIIJIL8 = C16880lQ.LLJJIJIIJIL(extra, "bottom_button");
        if (LLJJIJIIJIL8 != null) {
            try {
                C60986Nwc.LJI = (SearchLandingPageButtonInfo) GsonProtectorUtils.fromJson(LIZ, LLJJIJIIJIL8, SearchLandingPageButtonInfo.class);
            } catch (s unused3) {
            }
        }
        String LLJJIJIIJIL9 = C16880lQ.LLJJIJIIJIL(extra, "enable_page_num");
        if (LLJJIJIIJIL9 != null) {
            z2 = Boolean.parseBoolean(LLJJIJIIJIL9);
        }
        C60986Nwc.LJ = z2;
        return true;
    }

    public static void LIZ(String str, SearchLandingPageExtraData searchLandingPageExtraData, boolean z, String str2) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (z) {
            Uri.Builder builder = C60131Nip.LIZ;
            builder.appendQueryParameter("object_id", searchLandingPageExtraData.getSearchResultId());
            builder.appendQueryParameter("report_url", str2);
            builder.appendQueryParameter("img_url", searchLandingPageExtraData.getCardImageUrl());
            builder.appendQueryParameter("title", searchLandingPageExtraData.getCardTitle());
            builder.appendQueryParameter("page_type", searchLandingPageExtraData.getPageType());
            builder.appendQueryParameter("report_type", "outstation_res");
            return;
        }
        C188727au c188727au = C60977NwT.LIZ;
        c188727au.LJI("enter_from", searchLandingPageExtraData.getEnterFrom());
        c188727au.LJI("page_type", searchLandingPageExtraData.getPageType());
        c188727au.LJI("search_keyword", searchLandingPageExtraData.getSearchKeyWord());
        c188727au.LJI("token_type", searchLandingPageExtraData.getTokenType());
        c188727au.LJI("search_id", searchLandingPageExtraData.getSearchId());
        c188727au.LJI("search_result_id", searchLandingPageExtraData.getSearchResultId());
        if (o.LJ(searchLandingPageExtraData.getListItemId(), "")) {
            return;
        }
        c188727au.LJI("list_item_id", searchLandingPageExtraData.getListItemId());
        c188727au.LJI("list_result_type", searchLandingPageExtraData.getListItemType());
    }
}
