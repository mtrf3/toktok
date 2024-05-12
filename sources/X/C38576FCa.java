package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FCa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38576FCa {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(android.net.Uri uri, boolean z, String errorInfo, boolean z2) {
        int i;
        int i2;
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(errorInfo, "errorInfo");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            String uri2 = uri.toString();
            o.LJIIIIZZ(uri2, "uri.toString()");
            String LIZLLL = ED3.LIZLLL(uri);
            String LJ = ED3.LJ(uri, "previous_page");
            String LJ2 = ED3.LJ(uri, "deeplink_type");
            String LJ3 = ED3.LJ(uri, "top_product_ids");
            if (ujb.o.LJJJJJL(LJ3)) {
                LJ3 = ED3.LJ(uri, "product_id_list");
            }
            String LJ4 = ED3.LJ(uri, "creative_id");
            String LJ5 = ED3.LJ(uri, "campaign_id");
            String LJ6 = ED3.LJ(uri, "ttclid");
            Boolean LJ7 = C38987FRv.LJ();
            o.LJIIIIZZ(LJ7, "isFirstInstallAndFirstLaunchLowCost()");
            boolean booleanValue = LJ7.booleanValue();
            if (z2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            C76542zS.LIZ("rd_tiktokec_mall_lynx_route", C113554cx.LJJL(new OSZ("is_success", Integer.valueOf(i)), new OSZ("error_info", errorInfo), new OSZ("schema", uri2), new OSZ("url", LIZLLL), new OSZ("previous_page", LJ), new OSZ("deeplink_type", LJ2), new OSZ("top_product_ids", LJ3), new OSZ("creative_id", LJ4), new OSZ("campaign_id", LJ5), new OSZ("ttclid", LJ6), new OSZ("is_first_launch", Integer.valueOf(booleanValue ? 1 : 0)), new OSZ("is_cold_launch", Integer.valueOf(i2))));
        } catch (Throwable unused) {
        }
    }
}
