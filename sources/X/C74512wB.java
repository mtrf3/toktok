package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.2wB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74512wB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, String str, String str2, boolean z) {
        String str3;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("load_image", str);
        c188727au.LJ(j, "load_duration");
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_success", str3);
        if (str2 != null) {
            c188727au.LJI("error_message", str2);
        }
        FMX.LJIIL("avatar_component_load_success", c188727au.LIZ);
    }
}
