package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BQw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28770BQw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String enterFrom, String bannerType, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(bannerType, "bannerType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_subscription_community_banner_show");
        LIZ2.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_opt_in");
        LIZ2.LJIJJ(enterFrom, "show_entrance");
        LIZ2.LJIJJ(bannerType, "banner_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(String enterFrom, String bannerType, boolean z, boolean z2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(bannerType, "bannerType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_subscription_community_banner_click");
        LIZ2.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_opt_in");
        LIZ2.LJIJJ(enterFrom, "show_entrance");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z2)) ? 1 : 0), "click_type");
        LIZ2.LJIJJ(bannerType, "banner_type");
        LIZ2.LJJIIJZLJL();
    }
}
