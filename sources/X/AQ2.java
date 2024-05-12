package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AQ2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC26196APw entranceType, int i, int i2, String str) {
        String str2;
        o.LJIIIZ(entranceType, "entranceType");
        int i3 = AQ1.LIZ[entranceType.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                str2 = "profile_viewers_fix_entrance";
            } else {
                str2 = "profile_viewers_avatar_carousel";
            }
        } else {
            str2 = "profile_viewers_capsule";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LIZLLL(i, "profile_visitor_status");
        c188727au.LIZLLL(i2, "viewers_cnt");
        c188727au.LJIIIZ("action_type", str);
        FMX.LJIIL(str2, c188727au.LIZ);
    }
}
