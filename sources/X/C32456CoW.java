package X;

import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;

/* renamed from: X.CoW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32456CoW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(BZI bzi) {
        bzi.LJIJJ(C32455CoV.LJIILIIL(), "user_id");
        bzi.LJIJJ(C32455CoV.LJIILL(), "room_id");
        bzi.LJIJJ(C32455CoV.LJIIL(), "anchor_id");
    }

    public static void LIZIZ(boolean z) {
        BZI LIZ2;
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        if (c32313CmD.LJIIL()) {
            if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_first_recharge_welcome_entrance_preview")) {
                return;
            } else {
                LIZ2 = C28787BRn.LIZ("livesdk_first_recharge_welcome_entrance_preview");
            }
        } else {
            LIZ2 = C28787BRn.LIZ("livesdk_first_recharge_gift_preview");
            LIZ2.LJIJJ(Long.valueOf(c32313CmD.LJII()), "gift_id");
        }
        LIZ(LIZ2);
        if (z) {
            LIZ2.LJIJJ("call", "preview_type");
        } else {
            LIZ2.LJIJJ("click", "preview_type");
        }
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(String str) {
        BZI LIZIZ = C0N3.LIZIZ("welcome_gift_pack_page_show", str, "gift_enter_from");
        LIZIZ.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZIZ.LJJIIJZLJL();
    }
}
