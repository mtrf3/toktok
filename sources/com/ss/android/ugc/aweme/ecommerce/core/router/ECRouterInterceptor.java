package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AbstractActivityC60177NjZ;
import X.ActivityC45651qj;
import X.C141335gf;
import X.C16880lQ;
import X.C1A8;
import X.C27090AkA;
import X.C27739Aud;
import X.C27823Avz;
import X.C27837AwD;
import X.C27920AxY;
import X.C3C5;
import X.C40127Fox;
import X.C62712d9;
import X.C65330PkU;
import X.C65352Pkq;
import X.C70655RoB;
import X.C71058Rug;
import X.C73332uH;
import X.C76800UCe;
import X.C78983UzD;
import X.C79234V7u;
import X.FKM;
import X.InterfaceC40159FpT;
import X.ORY;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import defpackage.e1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ECRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    public static ActivityC45651qj LIZIZ(Uri uri) {
        ActivityC45651qj activityC45651qj;
        String str;
        boolean z;
        Activity activity;
        Activity[] activityStack = ActivityStack.getActivityStack();
        int length = activityStack.length;
        C40127Fox.LIZ.getClass();
        if (C40127Fox.LIZ().enableSparkContainer) {
            Object LJJJLZIJ = ORY.LJJJLZIJ(activityStack);
            if (LJJJLZIJ != null && (LJJJLZIJ instanceof ActivityC45651qj) && (LJJJLZIJ instanceof InterfaceC40159FpT)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object LJJJLZIJ2 = ORY.LJJJLZIJ(activityStack);
                o.LJII(LJJJLZIJ2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                activityC45651qj = (ActivityC45651qj) LJJJLZIJ2;
            } else {
                if (length <= 1 || (activity = activityStack[length - 2]) == null || !(activity instanceof ActivityC45651qj) || !(activity instanceof InterfaceC40159FpT)) {
                    return null;
                }
                o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                activityC45651qj = (ActivityC45651qj) activity;
            }
        } else if (ORY.LJJJLZIJ(activityStack) instanceof AbstractActivityC60177NjZ) {
            Object LJJJLZIJ3 = ORY.LJJJLZIJ(activityStack);
            o.LJII(LJJJLZIJ3, "null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity");
            activityC45651qj = (ActivityC45651qj) LJJJLZIJ3;
        } else {
            if (length <= 1) {
                return null;
            }
            Activity activity2 = activityStack[length - 2];
            if (!(activity2 instanceof AbstractActivityC60177NjZ)) {
                return null;
            }
            o.LJII(activity2, "null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity");
            activityC45651qj = (ActivityC45651qj) activity2;
        }
        if (activityC45651qj == null) {
            return null;
        }
        Uri data = activityC45651qj.getIntent().getData();
        if (data != null) {
            str = UriProtector.getQueryParameter(data, "url");
        } else {
            str = null;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String path = UriProtector.parse(str).getPath();
        String host = UriProtector.parse(str).getHost();
        String path2 = UriProtector.parse(queryParameter).getPath();
        String host2 = UriProtector.parse(queryParameter).getHost();
        if (!ujb.o.LJJJJIZL(path, path2, false) || !ujb.o.LJJJJIZL(host, host2, false)) {
            return null;
        }
        return activityC45651qj;
    }

    public static boolean LIZLLL(Uri uri) {
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        if (queryParameter == null) {
            return false;
        }
        Uri parse = UriProtector.parse(queryParameter);
        if (!ujb.o.LJJJJIZL(parse.getHost(), "oec-api.tiktokv.com", false) && !ujb.o.LJJJJIZL(parse.getHost(), (String) C71058Rug.LIZIZ.getValue(), false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return o.LJ(str, "ec");
    }

    public static boolean LIZJ(RouteIntent routeIntent, String str) {
        boolean z;
        String str2;
        String str3;
        String str4;
        OrderSubmitRequestParam orderSubmitRequestParam;
        String str5;
        Object obj;
        Object obj2;
        boolean z2;
        Boolean bool = ECOspOptimizedV2.LIZ().enterUnify;
        boolean z3 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        String str6 = null;
        if (z) {
            Intent extra = routeIntent.getExtra();
            if (extra != null && C16880lQ.LLJJIJIIJIL(extra, "pdp_from") != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Intent extra2 = routeIntent.getExtra();
            if (extra2 != null) {
                str6 = C16880lQ.LLJJIJIIJIL(extra2, "_hasPrefetchBill");
            }
            boolean LJ = o.LJ(str6, "1");
            routeIntent.getExtra().putExtra("navigate_address_edit_start_time", SystemClock.elapsedRealtime());
            Intent extra3 = routeIntent.getExtra();
            o.LJIIIIZZ(extra3, "routeIntent.extra");
            C79234V7u.LJJIJL(extra3, str);
            if (z2 || LJ) {
                return false;
            }
            if ((o.LJ(C27090AkA.LJ(), Boolean.TRUE) && e1.LIZ(31744, "ecom_osp_async_enter", true, false)) || C27920AxY.LIZ()) {
                z3 = true;
            }
            C27837AwD c27837AwD = new C27837AwD(FKM.LIZIZ(), str);
            Intent extra4 = routeIntent.getExtra();
            o.LJIIIIZZ(extra4, "routeIntent.extra");
            String originUrl = routeIntent.getOriginUrl();
            o.LJIIIIZZ(originUrl, "routeIntent.originUrl");
            c27837AwD.LIZJ(extra4, originUrl, Boolean.valueOf(z3));
        } else {
            Intent extra5 = routeIntent.getExtra();
            if (extra5 != null) {
                str2 = C16880lQ.LLJJIJIIJIL(extra5, "buy_type");
            } else {
                str2 = null;
            }
            Intent extra6 = routeIntent.getExtra();
            if (extra6 != null) {
                str3 = C16880lQ.LLJJIJIIJIL(extra6, "_hasPrefetchBill");
            } else {
                str3 = null;
            }
            routeIntent.getExtra().putExtra("navigate_address_edit_start_time", SystemClock.elapsedRealtime());
            Intent extra7 = routeIntent.getExtra();
            o.LJIIIIZZ(extra7, "routeIntent.extra");
            C79234V7u.LJJIJL(extra7, str);
            Intent extra8 = routeIntent.getExtra();
            if (extra8 != null) {
                str4 = C16880lQ.LLJJIJIIJIL(extra8, "requestParams");
            } else {
                str4 = null;
            }
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str4, C65330PkU.LIZJ(C65352Pkq.LJI(OrderSubmitRequestParam.class)));
                if (!(fromJson instanceof OrderSubmitRequestParam)) {
                    fromJson = null;
                }
                orderSubmitRequestParam = (OrderSubmitRequestParam) fromJson;
            } catch (s unused) {
                orderSubmitRequestParam = null;
            }
            Intent extra9 = routeIntent.getExtra();
            if (extra9 != null) {
                str5 = C16880lQ.LLJJIJIIJIL(extra9, "trackParams");
            } else {
                str5 = null;
            }
            HashMap<String, Object> LJII = C27739Aud.LJII(str5);
            if (orderSubmitRequestParam != null && orderSubmitRequestParam.getOneStepOrderType() != null && !o.LJ(str3, "1")) {
                C27837AwD c27837AwD2 = new C27837AwD(FKM.LIZIZ(), str);
                Intent extra10 = routeIntent.getExtra();
                o.LJIIIIZZ(extra10, "routeIntent.extra");
                String originUrl2 = routeIntent.getOriginUrl();
                o.LJIIIIZZ(originUrl2, "routeIntent.originUrl");
                c27837AwD2.LIZJ(extra10, originUrl2, null);
            } else {
                if (LJII != null) {
                    obj = LJII.get("source_page_type");
                } else {
                    obj = null;
                }
                if (o.LJ(obj, "top_up") && !o.LJ(str3, "1")) {
                    C27837AwD c27837AwD3 = new C27837AwD(FKM.LIZIZ(), str);
                    Intent extra11 = routeIntent.getExtra();
                    o.LJIIIIZZ(extra11, "routeIntent.extra");
                    String originUrl3 = routeIntent.getOriginUrl();
                    o.LJIIIIZZ(originUrl3, "routeIntent.originUrl");
                    c27837AwD3.LIZJ(extra11, originUrl3, null);
                } else {
                    if (o.LJ(str2, CardStruct.IStatusCode.DEFAULT) && C27823Avz.LIZ() == 2 && o.LJ(C27090AkA.LJ(), Boolean.FALSE)) {
                        if (LJII != null) {
                            obj2 = LJII.get("source_page_type");
                        } else {
                            obj2 = null;
                        }
                        if (!o.LJ(obj2, "top_up")) {
                            routeIntent.getExtra().putExtra("postponeBillFetch", true);
                            return false;
                        }
                    }
                    if (o.LJ(str2, CardStruct.IStatusCode.DEFAULT) || o.LJ(str3, "1")) {
                        return false;
                    }
                    if (o.LJ(C27090AkA.LJ(), Boolean.TRUE) && e1.LIZ(31744, "ecom_osp_async_enter", true, false)) {
                        z3 = true;
                    }
                    C27837AwD c27837AwD4 = new C27837AwD(FKM.LIZIZ(), str);
                    Intent extra12 = routeIntent.getExtra();
                    o.LJIIIIZZ(extra12, "routeIntent.extra");
                    String originUrl4 = routeIntent.getOriginUrl();
                    o.LJIIIIZZ(originUrl4, "routeIntent.originUrl");
                    c27837AwD4.LIZJ(extra12, originUrl4, Boolean.valueOf(z3));
                }
            }
            return true;
        }
        return !z3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0429, code lost:
    
        if (r9 == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0240, code lost:
    
        if (r21 == null) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d3  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r53, com.bytedance.router.RouteIntent r54) {
        /*
            Method dump skipped, instructions count: 2644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0215, code lost:
    
        if (r1 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x032f, code lost:
    
        if (r37 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0331, code lost:
    
        r37 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0335, code lost:
    
        if (r42 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0337, code lost:
    
        r14 = X.C16880lQ.LLJJIJIIJIL(r42, "request_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x033b, code lost:
    
        if (r14 != null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x033f, code lost:
    
        r1 = new java.util.HashMap();
        r13 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x034e, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r10, r13) == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0350, code lost:
    
        r11 = X.C16880lQ.LLJJIJIIJIL(r42, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0356, code lost:
    
        if (r11 != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0358, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x035a, code lost:
    
        r7 = X.C16880lQ.LLJJIJIIJIL(r42, "price");
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0360, code lost:
    
        if (r7 != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0362, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0364, code lost:
    
        r5 = X.C16880lQ.LLJJIJIIJIL(r42, "cover");
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x036a, code lost:
    
        if (r5 != null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x036c, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x036e, code lost:
    
        r2 = X.C16880lQ.LLJJIJIIJIL(r42, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0374, code lost:
    
        if (r2 != null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0376, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0378, code lost:
    
        r1.put("title", r11);
        r1.put("price", r7);
        r1.put("cover", r5);
        r1.put("id", r2);
        r1.put("video_anchor", r10.toString());
        r2 = X.C16880lQ.LLJJIJIIJIL(r42, "click_timestamp");
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0391, code lost:
    
        if (r2 != null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0393, code lost:
    
        r2 = "-1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0395, code lost:
    
        r1.put("click_timestamp", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x039c, code lost:
    
        if (r14.length() <= 0) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x039e, code lost:
    
        if (r0 == 0) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03a0, code lost:
    
        r0.put("request_id", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03a3, code lost:
    
        r7 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03a7, code lost:
    
        if (r42 == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03a9, code lost:
    
        r6 = X.C16880lQ.LLJJIJIIJIL(r42, "autoSchema");
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03ad, code lost:
    
        if (r6 != null) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03b2, code lost:
    
        r2 = X.C16880lQ.LLJJIJIIJIL(r42, "isScenePrefetch");
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03b8, code lost:
    
        if (r2 != null) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03bc, code lost:
    
        if (r42 == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03be, code lost:
    
        r4 = X.C16880lQ.LLJJIJIIJIL(r42, "prefetchScene");
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03c2, code lost:
    
        if (r4 != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03c6, code lost:
    
        r1.put("autoSchema", r6);
        r1.put("isPrefetchScene", r7);
        r1.put("prefetchScene", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03d3, code lost:
    
        if (r42 == null) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03d5, code lost:
    
        r4 = java.lang.Boolean.valueOf(r42.getBooleanExtra("live_anchor", false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03e2, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r4, r13) == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03e4, code lost:
    
        r2 = X.C16880lQ.LLJJIJIIJIL(r42, "click_timestamp");
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03e8, code lost:
    
        if (r2 != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03ea, code lost:
    
        r2 = "-1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03ec, code lost:
    
        r1.put("click_timestamp", r2);
        r1.put("live_anchor", r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03fe, code lost:
    
        if (r19 != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0400, code lost:
    
        if (r18 != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0402, code lost:
    
        if (r17 == null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0478, code lost:
    
        r2 = X.C27162AlK.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x047c, code lost:
    
        if (r42 == null) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x047e, code lost:
    
        r40 = X.C16880lQ.LLJJIJIIJIL(r42, "aweme_id");
        r41 = X.C16880lQ.LLJJIJIIJIL(r42, "click_from");
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
    
        return new com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam(r23, r26, r0, r22, r29, r21, 0.0f, java.lang.Float.valueOf(r2), false, r34, false, r36, r37, r1, r43, r40, r41, r44, 1344, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04a4, code lost:
    
        r40 = null;
        r41 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0407, code lost:
    
        if (r19 == null) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0409, code lost:
    
        r6 = r19.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x040f, code lost:
    
        if (r6 > 0.0f) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0411, code lost:
    
        r6 = X.C27162AlK.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0415, code lost:
    
        r32 = java.lang.Float.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0419, code lost:
    
        if (r18 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x041b, code lost:
    
        r2 = r18.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0421, code lost:
    
        if (r2 <= 0.0f) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0425, code lost:
    
        if (r2 <= 1.0f) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0461, code lost:
    
        r2 = r2 * X.C27162AlK.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x042a, code lost:
    
        if (r17 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0430, code lost:
    
        if (r17.booleanValue() == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x045e, code lost:
    
        r33 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x045d, code lost:
    
        return new com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam(r23, r26, r0, r22, r29, r21, r2, r32, r33, r34, false, r36, r37, r1, r43, X.C16880lQ.LLJJIJIIJIL(r42, "aweme_id"), X.C16880lQ.LLJJIJIIJIL(r42, "click_from"), r44, 1024, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0432, code lost:
    
        if (r32 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x043a, code lost:
    
        if (r32.floatValue() >= r2) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x043c, code lost:
    
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0427, code lost:
    
        r2 = X.C27162AlK.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0429, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0466, code lost:
    
        r2 = X.C27162AlK.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x046b, code lost:
    
        if (r6 <= 1.0f) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x046d, code lost:
    
        r6 = X.C27162AlK.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0470, code lost:
    
        r6 = r6 * X.C27162AlK.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0475, code lost:
    
        r32 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04a9, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x03c4, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04ac, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x03af, code lost:
    
        r6 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x03b0, code lost:
    
        if (r42 == null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x033d, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04c3, code lost:
    
        if (r42 != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x04bd, code lost:
    
        if (r42 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x04b7, code lost:
    
        if (r42 != null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x04b1, code lost:
    
        if (r42 == null) goto L283;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam LIZ(android.content.Intent r42, java.lang.String r43, java.lang.Integer r44) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor.LIZ(android.content.Intent, java.lang.String, java.lang.Integer):com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam");
    }

    public static void LJ(String str, RouteIntent routeIntent, String str2) {
        Object LIZ;
        Object LIZ2;
        Object LIZ3;
        Object LIZ4;
        Object LIZ5;
        Object LIZ6;
        Long l;
        try {
            Uri uri = routeIntent.getUri();
            try {
                LIZ2 = C27739Aud.LIZJ(uri, "trackParams");
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            Long l2 = null;
            if (C3C5.m12isFailureimpl(LIZ2)) {
                LIZ2 = null;
            }
            HashMap hashMap = (HashMap) LIZ2;
            if (hashMap == null) {
                hashMap = (HashMap) C1A8.LJIJ(str2, "trackParams");
            }
            try {
                LIZ3 = UriProtector.getQueryParameter(uri, "previous_page");
                C3C5.m7constructorimpl(LIZ3);
            } catch (Throwable th2) {
                LIZ3 = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ3);
            }
            if (C3C5.m12isFailureimpl(LIZ3)) {
                LIZ3 = null;
            }
            Object obj = (String) LIZ3;
            if (obj == null) {
                if (hashMap != null) {
                    obj = hashMap.get("previous_page");
                } else {
                    obj = null;
                }
            }
            try {
                LIZ4 = UriProtector.getQueryParameter(uri, "entrance_form");
                C3C5.m7constructorimpl(LIZ4);
            } catch (Throwable th3) {
                LIZ4 = C141335gf.LIZ(th3);
                C3C5.m7constructorimpl(LIZ4);
            }
            if (C3C5.m12isFailureimpl(LIZ4)) {
                LIZ4 = null;
            }
            Object obj2 = (String) LIZ4;
            if (obj2 == null) {
                if (hashMap != null) {
                    obj2 = hashMap.get("entrance_form");
                } else {
                    obj2 = null;
                }
            }
            try {
                LIZ5 = UriProtector.getQueryParameter(uri, "enter_from_info");
                C3C5.m7constructorimpl(LIZ5);
            } catch (Throwable th4) {
                LIZ5 = C141335gf.LIZ(th4);
                C3C5.m7constructorimpl(LIZ5);
            }
            if (C3C5.m12isFailureimpl(LIZ5)) {
                LIZ5 = null;
            }
            Object obj3 = (String) LIZ5;
            if (obj3 == null) {
                if (hashMap != null) {
                    obj3 = hashMap.get("enter_from_info");
                } else {
                    obj3 = null;
                }
            }
            try {
                LIZ6 = UriProtector.getQueryParameter(uri, "start_click_time");
                C3C5.m7constructorimpl(LIZ6);
            } catch (Throwable th5) {
                LIZ6 = C141335gf.LIZ(th5);
                C3C5.m7constructorimpl(LIZ6);
            }
            if (C3C5.m12isFailureimpl(LIZ6)) {
                LIZ6 = null;
            }
            String str3 = (String) LIZ6;
            if (str3 != null) {
                l = Long.valueOf(CastLongProtector.parseLong(str3));
            } else {
                l = null;
            }
            if (C70655RoB.LIZ().startClickTime) {
                l2 = l;
            }
            HashMap hashMap2 = new HashMap();
            if (obj != null) {
                hashMap2.put("previous_page", obj);
            }
            if (obj2 != null) {
                hashMap2.put("entrance_form", obj2);
            }
            if (obj3 != null) {
                hashMap2.put("enter_from_info", obj3);
            }
            if (l != null) {
                hashMap2.put("start_to_now", Long.valueOf(System.currentTimeMillis() - l.longValue()));
            }
            C73332uH.LIZ(PageNodeMonitorService.LJIIIZ(), str, hashMap2, l2, null, 8);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th6) {
            LIZ = C141335gf.LIZ(th6);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
    }
}
