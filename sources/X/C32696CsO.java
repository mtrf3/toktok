package X;

import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;

/* renamed from: X.CsO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32696CsO {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static GuideInfoResponse.UserStats LJ;
    public static XKQ LJI;
    public static String LIZLLL = "";
    public static String LJFF = "";

    public static boolean LIZJ() {
        if (LIZIZ || LIZ) {
            return true;
        }
        return false;
    }

    public static void LIZ(String str) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        BZI LIZ2 = C28787BRn.LIZ("gift_panel_education_entrance_preview");
        GuideInfoResponse.UserStats userStats = LJ;
        Long l5 = null;
        if (userStats != null) {
            l = Long.valueOf(userStats.giftPanelShowCnt);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "gift_panel_show_cnt");
        GuideInfoResponse.UserStats userStats2 = LJ;
        if (userStats2 != null) {
            l2 = Long.valueOf(userStats2.shortcutGiftClickCnt);
        } else {
            l2 = null;
        }
        LIZ2.LJIJJ(l2, "convenient_gift_click_cnt");
        GuideInfoResponse.UserStats userStats3 = LJ;
        if (userStats3 != null) {
            l3 = Long.valueOf(userStats3.giftGuidePopupShowCnt);
        } else {
            l3 = null;
        }
        LIZ2.LJIJJ(l3, "gift_guide_popup_show_cnt");
        GuideInfoResponse.UserStats userStats4 = LJ;
        if (userStats4 != null) {
            l4 = Long.valueOf(userStats4.likeCnt);
        } else {
            l4 = null;
        }
        LIZ2.LJIJJ(l4, "like_cnt");
        GuideInfoResponse.UserStats userStats5 = LJ;
        if (userStats5 != null) {
            l5 = Long.valueOf(userStats5.watchDuration);
        }
        LIZ2.LJIJJ(l5, "watch_duration");
        LIZ2.LJIJJ(str, "show_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(long j, int i) {
        C780334l c780334l = C780334l.LJLIL;
        XKQ xkq = LJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        LJI = XKX.LIZLLL(c780334l, C78613UtF.LIZJ, null, new C32838Cug(j, i, null), 2);
    }
}
