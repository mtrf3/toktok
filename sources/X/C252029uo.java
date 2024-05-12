package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.9uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252029uo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", "homepage_profile");
        if (z) {
            str2 = "username";
        } else {
            str2 = "nickname";
        }
        c35936E8m.LIZLLL("banner_type", str2);
        c35936E8m.LIZLLL("click", str);
        if (z2) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c35936E8m.LIZLLL("result", str3);
        FMX.LJIIL("update_username_banner_click", c35936E8m.LIZ);
    }
}
