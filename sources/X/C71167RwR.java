package X;

import com.google.gson.internal.b;

/* renamed from: X.RwR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71167RwR {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Long l, boolean z, boolean z2) {
        String str;
        if (C71166RwQ.LIZLLL) {
            return;
        }
        if (C71166RwQ.LIZ(l)) {
            C71166RwQ.LIZLLL = true;
            if (z) {
                str = "im";
            } else {
                str = "api";
            }
            C71166RwQ.LJI = str;
            C71166RwQ.LJIIIIZZ = System.currentTimeMillis();
        }
        b.LJJIJIIJIL("rd_tiktokec_entrance_get", new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("anchor_show_type", "live_cart_tag"), new OSZ("entrance_form", "live_cart"), new OSZ("page_name", "live"), new OSZ(WM7.SCENE_SERVICE, "bag"), new OSZ("duration", Long.valueOf(System.currentTimeMillis() - C71195Rwt.LJIIIZ)), new OSZ("user_type", C71166RwQ.LJII), new OSZ("source", C71166RwQ.LJI), new OSZ("has_ec_perm", Integer.valueOf(z2 ? 1 : 0)));
    }
}
