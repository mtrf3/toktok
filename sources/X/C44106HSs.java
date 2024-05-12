package X;

import android.text.TextUtils;

/* renamed from: X.HSs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44106HSs {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(android.net.Uri uri) {
        if (TextUtils.equals(uri.getHost(), "stickers")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "draw_ad");
            c188727au.LJIIIZ("prop_id", uri.getLastPathSegment());
            FMX.LJIIL("enter_prop_detail", c188727au.LIZ);
        }
    }
}
