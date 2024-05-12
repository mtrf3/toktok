package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KAo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51278KAo {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ(android.net.Uri routeUri) {
        o.LJIIIZ(routeUri, "routeUri");
        String LJJJJI = C78926UyI.LJJJJI(routeUri, "deeplink_from_scene");
        if (LJJJJI == null) {
            LJJJJI = "";
        }
        return o.LJ(LJJJJI, "mall_ug_search");
    }

    public static final boolean LIZ(android.net.Uri uri, String str) {
        if (C78857UxB.LJJJIL(C78926UyI.LJJJJI(uri, str))) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(android.net.Uri routeUri, String str) {
        int i;
        o.LJIIIZ(routeUri, "routeUri");
        if (!LIZIZ(routeUri)) {
            return;
        }
        String LJJJJI = C78926UyI.LJJJJI(routeUri, "previous_page");
        String str2 = "";
        if (LJJJJI == null) {
            LJJJJI = "";
        }
        String LJJJJI2 = C78926UyI.LJJJJI(routeUri, "deeplink_type");
        if (LJJJJI2 == null) {
            LJJJJI2 = "";
        }
        String LJJJJI3 = C78926UyI.LJJJJI(routeUri, "top_product_ids");
        if (LJJJJI3 == null) {
            LJJJJI3 = "";
        }
        String LJJJJI4 = C78926UyI.LJJJJI(routeUri, "creative_id");
        if (LJJJJI4 == null) {
            LJJJJI4 = "";
        }
        String LJJJJI5 = C78926UyI.LJJJJI(routeUri, "campaign_id");
        if (LJJJJI5 == null) {
            LJJJJI5 = "";
        }
        String uri = routeUri.toString();
        o.LJIIIIZZ(uri, "routeUri.toString()");
        String LJJJJI6 = C78926UyI.LJJJJI(routeUri, "deeplink_from_scene");
        if (LJJJJI6 != null) {
            str2 = LJJJJI6;
        }
        if (str == null || str.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        C76542zS.LIZJ("rd_tiktokec_deeplink_start", new KBB(LJJJJI, i, LJJJJI2, LJJJJI3, LJJJJI4, LJJJJI5, uri, str, str2));
    }
}
