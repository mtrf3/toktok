package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* renamed from: X.9si */
/* loaded from: classes5.dex */
public final class C250729si {
    public static boolean LIZ;

    public static /* synthetic */ void LIZIZ(Context context, String str, String str2) {
        LIZ(context, str, str2, null, false);
    }

    public static void LIZJ(Context context, final String str, final String str2, java.util.Map map) {
        String str3;
        Long l;
        boolean z = true;
        if (TextUtils.isEmpty(str) || (!o.LJJJLIIL(str, "http", false) && !o.LJJJLIIL(str, "https", false))) {
            SmartRouter.buildRoute(context, str).open();
            return;
        }
        if (!LIZ) {
            LIZ = true;
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            AbstractC40122Fos abstractC40122Fos = new AbstractC40122Fos() { // from class: X.9ur
                @Override // X.AbstractC40122Fos
                public final String LJI() {
                    return "pa_incentive";
                }

                {
                    InterfaceC252079ut interfaceC252079ut = new InterfaceC252079ut() { // from class: X.9uq
                        @Override // X.InterfaceC252079ut
                        public final void LIZ(SparkContext sparkContext) {
                            String str4;
                            String LJI;
                            kotlin.jvm.internal.o.LJIIIZ(sparkContext, "sparkContext");
                            String str5 = sparkContext.url;
                            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str5), "url");
                            if (queryParameter != null) {
                                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                                String str6 = "";
                                if (abstractC247499nV == null || (str4 = abstractC247499nV.LJIIIIZZ()) == null) {
                                    str4 = "";
                                }
                                String LIZIZ = LIZIZ(queryParameter, "device_id", str4);
                                AbstractC247499nV abstractC247499nV2 = (AbstractC247499nV) C95J.LIZ(0);
                                if (abstractC247499nV2 != null && (LJI = abstractC247499nV2.LJI()) != null) {
                                    str6 = LJI;
                                }
                                String LIZIZ2 = LIZIZ(LIZIZ, "carrier_region", str6);
                                String encode = URLEncoder.encode(queryParameter);
                                kotlin.jvm.internal.o.LJIIIIZZ(encode, "URLEncoder.encode(originUrl)");
                                String encode2 = URLEncoder.encode(LIZIZ2);
                                kotlin.jvm.internal.o.LJIIIIZZ(encode2, "URLEncoder.encode(finalUrl)");
                                sparkContext.LJJIJLIJ(o.LJJJJZ(str5, encode, encode2, false));
                            }
                        }

                        public static String LIZIZ(String str4, String str5, String str6) {
                            boolean z2;
                            String str7;
                            if (s.LJJLIIIJL(str4, C42398GkU.LIZIZ(str5, '='), 0, false, 6) == -1) {
                                String str8 = str4 + "&" + str5 + "=" + str6;
                                kotlin.jvm.internal.o.LJIIIIZZ(str8, "sb.toString()");
                                return str8;
                            }
                            if (str4.length() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                try {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(str5);
                                    LIZ2.append('=');
                                    int LJJLIIIJL = s.LJJLIIIJL(str4, X1D.LIZIZ(LIZ2), 0, false, 6);
                                    if (LJJLIIIJL != -1) {
                                        StringBuilder sb = new StringBuilder();
                                        String substring = str4.substring(0, LJJLIIIJL);
                                        kotlin.jvm.internal.o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                        sb.append(substring);
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append(str5);
                                        LIZ3.append('=');
                                        sb.append(X1D.LIZIZ(LIZ3));
                                        sb.append(str6);
                                        int LJJLIIIJL2 = s.LJJLIIIJL(str4, "&", LJJLIIIJL, false, 4);
                                        if (LJJLIIIJL2 != -1) {
                                            String substring2 = str4.substring(LJJLIIIJL2);
                                            kotlin.jvm.internal.o.LJIIIIZZ(substring2, "(this as java.lang.String).substring(startIndex)");
                                            sb.append(substring2);
                                        }
                                        str7 = sb.toString();
                                    } else {
                                        str7 = str4;
                                    }
                                    kotlin.jvm.internal.o.LJIIIIZZ(str7, "if (index != -1) {\n     …        url\n            }");
                                    return str7;
                                } catch (StringIndexOutOfBoundsException unused) {
                                    return str4;
                                }
                            }
                            return str8;
                        }
                    };
                    List<InterfaceC252079ut> list = C252069us.LIZ;
                    ((ArrayList) list).add(interfaceC252079ut);
                    ((ArrayList) list).add(new InterfaceC252079ut() { // from class: X.9uu
                        @Override // X.InterfaceC252079ut
                        public final void LIZ(SparkContext sparkContext) {
                            JSONObject jSONObject;
                            String str4;
                            kotlin.jvm.internal.o.LJIIIZ(sparkContext, "sparkContext");
                            android.net.Uri originUri = UriProtector.parse(UriProtector.getQueryParameter(UriProtector.parse(sparkContext.LJIILLIIL()), "url"));
                            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(sparkContext.LJIILLIIL()), "touch_point_event_params");
                            String str5 = "";
                            if (queryParameter == null) {
                                queryParameter = "";
                            }
                            try {
                                jSONObject = new JSONObject(queryParameter);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            String queryParameter2 = UriProtector.getQueryParameter(originUri, "enter_from");
                            String queryParameter3 = UriProtector.getQueryParameter(originUri, "enable_prefetch");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("region", UriProtector.getQueryParameter(originUri, "region"));
                            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                            if (abstractC247499nV != null && abstractC247499nV.LJIILLIIL()) {
                                str4 = "1";
                            } else {
                                str4 = CardStruct.IStatusCode.DEFAULT;
                            }
                            jSONObject2.put("is_login", str4);
                            if (jSONObject != null) {
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    jSONObject2.put(next, jSONObject.get(next));
                                }
                            }
                            String jSONObject3 = jSONObject2.toString();
                            kotlin.jvm.internal.o.LJIIIIZZ(jSONObject3, "extraQuery.toString()");
                            sparkContext.LJJIIJ("_enable_stay_time_report", "1");
                            if (queryParameter2 != null) {
                                sparkContext.LJJIIJ("_enter_from", queryParameter2);
                            }
                            if (queryParameter3 != null) {
                                sparkContext.LJJIIJ("enable_prefetch", queryParameter3);
                            }
                            sparkContext.LJJIIJ("_extra_query", jSONObject3);
                            kotlin.jvm.internal.o.LJIIIIZZ(originUri, "originUri");
                            String path = originUri.getPath();
                            if (path != null) {
                                str5 = path;
                            }
                            sparkContext.LJJIIJ("_project_name", str5);
                        }
                    });
                }

                @Override // X.AbstractC40122Fos
                public final void LJ(SparkContext sparkContext, String str4) {
                    kotlin.jvm.internal.o.LJIIIZ(sparkContext, "sparkContext");
                    super.LJ(sparkContext, str4);
                    Iterator it = ((ArrayList) C252069us.LIZ).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC252079ut) it.next()).LIZ(sparkContext);
                    }
                }
            };
            c40342FsQ.getClass();
            C40342FsQ.LJI(abstractC40122Fos);
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean LIZ2 = C60829Nu5.LIZ();
        OpenResultCallback openResultCallback = new OpenResultCallback() { // from class: X.9sk
            @Override // com.bytedance.router.OpenResultCallback
            public final void onActionResult(Object obj) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onEmpty() {
                C113134cH.LIZ(this);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onFail(String str4, String str5) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onIntercept(String str4) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMatched(String str4) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMissed(String str4) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onOpen(Intent intent) {
                C113134cH.LIZIZ(this, intent);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                String str4;
                String path = str;
                String enterFrom = str2;
                kotlin.jvm.internal.o.LJIIIZ(path, "path");
                kotlin.jvm.internal.o.LJIIIZ(enterFrom, "enterFrom");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", 1);
                    jSONObject.put("path", path);
                    jSONObject.put("enter_from", enterFrom);
                    AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                    if (abstractC247499nV != null) {
                        str4 = abstractC247499nV.LJIIJ();
                    } else {
                        str4 = null;
                    }
                    jSONObject.put("region", str4);
                } catch (JSONException unused) {
                }
                C09900aA.LJI("touchpoint_router_monitor", jSONObject, null, null);
            }
        };
        android.net.Uri parse = UriProtector.parse(str);
        kotlin.jvm.internal.o.LJIIIIZZ(parse, "Uri.parse(url)");
        String path = parse.getPath();
        if (path != null && o.LJJJJ(path, "template.js", false)) {
            str3 = "aweme://lynxview/";
        } else {
            z = false;
            str3 = "aweme://webview/";
        }
        Uri.Builder LIZIZ = C1EU.LIZIZ(str3, "url", str);
        C247579nd c247579nd = (C247579nd) C95J.LIZ(1003);
        if ((c247579nd != null && c247579nd.LIZIZ()) || z) {
            LIZIZ.appendQueryParameter("use_spark", "1");
        }
        if (z) {
            LIZIZ.appendQueryParameter("target_handler", "pa_incentive");
        } else {
            LIZIZ.appendQueryParameter("target_handler", "crossPlatform,pa_incentive");
        }
        LIZIZ.appendQueryParameter("business_from", "pa_incentive");
        LIZIZ.appendQueryParameter("touch_point_click_time", String.valueOf(currentTimeMillis));
        LIZIZ.appendQueryParameter("has_webview_warm_up", String.valueOf(LIZ2 ? 1 : 0));
        LIZIZ.appendQueryParameter("touch_point_event_params", String.valueOf(map));
        long j = 0;
        Long l2 = null;
        if (C250139rl.LIZIZ && C250139rl.LIZ > 0) {
            C250139rl.LIZIZ = false;
            l = Long.valueOf(System.currentTimeMillis() - C250139rl.LIZ);
        } else {
            l = null;
        }
        if (C250139rl.LJ) {
            C250139rl.LJ = false;
            if (C250139rl.LIZJ > 0) {
                j = System.currentTimeMillis() - C250139rl.LIZJ;
            }
            l2 = Long.valueOf(j);
        }
        if (l != null || l2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (l != null) {
                linkedHashMap.put("warmup_click_diff_time", String.valueOf(l.longValue()));
            }
            if (l2 != null) {
                linkedHashMap.put("render_first_frame_click_diff_time", String.valueOf(l2.longValue()));
            }
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                interfaceC247459nR.LIZIZ("incentive_warmup", linkedHashMap);
            }
        }
        String uri = LIZIZ.build().toString();
        kotlin.jvm.internal.o.LJIIIIZZ(uri, "builder.build().toString()");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, uri);
        buildRoute.withCallback(openResultCallback);
        buildRoute.open();
    }

    public static void LIZ(Context context, String url, String enterfrom, java.util.Map map, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        kotlin.jvm.internal.o.LJIIIZ(enterfrom, "enterfrom");
        if (z) {
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                abstractC247499nV.LIZJ(new C250739sj(context, url, enterfrom, map));
                return;
            }
            return;
        }
        LIZJ(context, url, enterfrom, map);
    }
}
