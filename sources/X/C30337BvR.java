package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BvR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30337BvR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_age_gate_change_popup");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "action_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(DataChannel dataChannel, String str) {
        if (str != null) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_ukr_safety_warning_popup_click");
            LIZ2.LJIILLIIL(dataChannel);
            LIZ2.LJIJJ(str, "action_type");
            LIZ2.LJJIIJZLJL();
            return;
        }
        C77800Ug8.LJ("livesdk_ukr_safety_warning_popup_show", dataChannel);
    }
}
