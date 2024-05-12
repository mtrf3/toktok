package com.ss.android.ugc.aweme.ecommerce.ug.popup.service;

import X.ActivityC45651qj;
import X.C12460eI;
import X.C38350F3i;
import X.C38580FCe;
import X.C39468FeK;
import X.C58096Mr6;
import X.C61505OBx;
import X.ED2;
import X.ED3;
import X.EnumC61506OBy;
import X.EnumC62402ce;
import X.IK8;
import X.M27;
import X.OC0;
import X.OLG;
import X.OSZ;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class EcUgPopupService implements IEcUgPopupService {
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void LIZ() {
        IK8.LIZ = true;
    }

    public static IEcUgPopupService LJIILJJIL() {
        Object LIZ = C58096Mr6.LIZ(IEcUgPopupService.class, false);
        if (LIZ != null) {
            return (IEcUgPopupService) LIZ;
        }
        if (C58096Mr6.i0 == null) {
            synchronized (IEcUgPopupService.class) {
                if (C58096Mr6.i0 == null) {
                    C58096Mr6.i0 = new EcUgPopupService();
                }
            }
        }
        return C58096Mr6.i0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final boolean LIZJ(Activity activity) {
        return C38580FCe.LIZIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final boolean LIZLLL(Map<String, ? extends Object> map) {
        return OC0.LIZ(map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final boolean LJ(Map<String, ? extends Object> map) {
        String str;
        Object obj;
        if (map != null && (obj = map.get("from_ec_ug")) != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        return o.LJ(str, EnumC62402ce.VSA.getValue());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void LJII(int i) {
        IK8.LIZ = false;
        if (i > 0) {
            IK8.LIZIZ(i);
        } else {
            if (i != 0) {
                return;
            }
            IK8.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(androidx.fragment.app.Fragment r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "popupSchema"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            boolean r0 = ujb.o.LJJJJJL(r7)
            if (r0 == 0) goto L11
        L10:
            return
        L11:
            r4 = 1
            r3 = 0
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "use_spark"
            java.lang.String r1 = X.ED3.LJ(r2, r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3e
            java.lang.String r0 = r2.getHost()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = X.ED2.LIZ(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "lynxview_popup"
            boolean r0 = ujb.o.LJJJJ(r1, r0, r3)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L40
            java.lang.String r0 = "webview_popup"
            boolean r0 = ujb.o.LJJJJ(r1, r0, r3)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3e
            goto L40
        L3e:
            r0 = 0
            goto L41
        L40:
            r0 = 1
        L41:
            java.lang.String r2 = "extra_landing_deeplink"
            java.lang.String r1 = "aweme://ec/mall_tab_overlay"
            if (r0 == 0) goto L58
            boolean r0 = X.C38580FCe.LIZJ(r7, r4)
            if (r0 == 0) goto L58
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildFragmentRoute(r6, r1)
            r0.withParam(r2, r7)
            r0.open(r3)
            goto L10
        L58:
            boolean r0 = X.C38580FCe.LIZJ(r7, r3)
            if (r0 == 0) goto L69
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildFragmentRoute(r6, r1)
            r0.withParam(r2, r7)
            r0.open(r3)
            goto L10
        L69:
            r0 = 0
            X.C38580FCe.LIZLLL(r0, r6, r7, r3, r4)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService.LJIIIZ(androidx.fragment.app.Fragment, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void LJIIJ(Activity activity, Map<String, ? extends Object> map) {
        if (map == null || !OC0.LIZ(map)) {
            return;
        }
        C61505OBx.LIZ(EnumC61506OBy.RENDER_COMPLETED, activity, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void LJIIJJI(ActivityC45651qj activityC45651qj, Map map) {
        if (map == null || !OC0.LIZ(map)) {
            return;
        }
        C61505OBx.LIZ(EnumC61506OBy.SHOW, activityC45651qj, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void LJIIL(ActivityC45651qj activityC45651qj, Map map) {
        if (map == null || !OC0.LIZ(map)) {
            return;
        }
        C61505OBx.LIZ(EnumC61506OBy.DISMISS, activityC45651qj, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final OSZ LJFF(String shopTabSchema, String str, boolean z) {
        int i;
        o.LJIIIZ(shopTabSchema, "shopTabSchema");
        int i2 = 0;
        try {
            Uri parse = UriProtector.parse(shopTabSchema);
            if (str == null) {
                str = ED3.LJ(parse, "landing_deeplink");
            }
            try {
                if (!ujb.o.LJJJJJL(str)) {
                    OLG.LIZ.getClass();
                    if (OLG.LJ(str)) {
                        return new OSZ("", 0);
                    }
                    if (z) {
                        Integer LJJIL = C38350F3i.LJJIL(ED3.LJ(parse, "after_landing_draw"));
                        if (LJJIL != null) {
                            i = LJJIL.intValue();
                        } else {
                            i = 0;
                        }
                        Integer LJJIL2 = C38350F3i.LJJIL(ED3.LJ(parse, "delay_load_android"));
                        if (LJJIL2 != null) {
                            i2 = LJJIL2.intValue();
                        }
                        if (i > 0) {
                            i2 = -i;
                        }
                    }
                    Uri parse2 = UriProtector.parse(str);
                    Uri.Builder buildUpon = parse2.buildUpon();
                    AqS114S0300000_10 aqS114S0300000_10 = new AqS114S0300000_10(parse2, parse, buildUpon, 12);
                    aqS114S0300000_10.invoke("top_product_ids");
                    aqS114S0300000_10.invoke("product_id_list");
                    aqS114S0300000_10.invoke("campaign_id");
                    aqS114S0300000_10.invoke("creative_id");
                    aqS114S0300000_10.invoke("need_overlay");
                    aqS114S0300000_10.invoke("after_landing_draw");
                    Uri build = buildUpon.appendQueryParameter("delay_load_mall_tab", String.valueOf(i2)).build();
                    o.LJIIIIZZ(build, "landingDeeplinkBuilder.a…                ).build()");
                    str = C38580FCe.LIZ(build, shopTabSchema).toString();
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = null;
        }
        return new OSZ(str, Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void LJI(Context context, String str, String str2) {
        if (context == null || str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        try {
            String LIZ = ED2.LIZ(UriProtector.parse(str).getHost());
            if (ujb.o.LJJJJ(LIZ, "lynxview_popup", false) || ujb.o.LJJJJ(LIZ, "webview_popup", false)) {
                str = ujb.o.LJJJJZI(str, LIZ, s.LJJZZIII("_popup", LIZ), false);
            }
        } catch (Throwable unused) {
        }
        try {
            Uri parse = UriProtector.parse(str);
            o.LJIIIIZZ(parse, "parse(newPopupSchema)");
            str = C38580FCe.LIZ(parse, str2).toString();
        } catch (Throwable unused2) {
        }
        C38580FCe.LIZLLL(context, null, str, false, false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void LJIIIIZZ(Activity activity, boolean z, Map<String, ? extends Object> map) {
        if (map == null || !OC0.LIZ(map) || !C61505OBx.LIZIZ(map)) {
            return;
        }
        C61505OBx.LIZ(EnumC61506OBy.RENDER_COMPLETED, activity, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void LIZIZ(ActivityC45651qj activityC45651qj, M27 iPopupPage, boolean z, Map map) {
        String str;
        o.LJIIIZ(iPopupPage, "iPopupPage");
        if (map == null || !OC0.LIZ(map)) {
            return;
        }
        if (z) {
            C12460eI.LJIIJ(iPopupPage);
        }
        Object obj = map.get("from_ec_ug");
        if (obj != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        if (o.LJ(str, EnumC62402ce.VSA.getValue())) {
            C39468FeK.LJII(null, true);
        }
        if (!C61505OBx.LIZIZ(map)) {
            return;
        }
        C61505OBx.LIZ(EnumC61506OBy.SHOW, activityC45651qj, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService
    public final void LJIILIIL(ActivityC45651qj activityC45651qj, M27 iPopupPage, boolean z, Map map) {
        o.LJIIIZ(iPopupPage, "iPopupPage");
        if (map == null || !OC0.LIZ(map)) {
            return;
        }
        if (z) {
            C12460eI.LJIIIZ(iPopupPage);
        }
        if (!C61505OBx.LIZIZ(map)) {
            return;
        }
        C61505OBx.LIZ(EnumC61506OBy.DISMISS, activityC45651qj, map);
    }
}
