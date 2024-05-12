package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UXA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(boolean z) {
        String str;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_confirmation_popup_show");
        if (z) {
            str = "EEA";
        } else {
            str = "nonEEA";
        }
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) TTL.LIZJ(LIZ2, str, "region")).getCurrentUserId()), "user_id");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(boolean z, EnumC32853Cuv closeReason) {
        String str;
        o.LJIIIZ(closeReason, "closeReason");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_confirmation_popup_close");
        if (z) {
            str = "EEA";
        } else {
            str = "nonEEA";
        }
        LIZ2.LJIJJ(str, "region");
        LIZ2.LJIJJ(closeReason.getDesc$livegift_impl_release(), "close_reason");
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(long j, EnumC32853Cuv closeReason, float f, String triggerKeyword) {
        o.LJIIIZ(closeReason, "closeReason");
        o.LJIIIZ(triggerKeyword, "triggerKeyword");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_guide_popup_close");
        C07250Qf.LIZJ(j, LIZ2, "gift_id", "gift_guide_popup_comment_key_words", "notification_type");
        LIZ2.LJIJJ(triggerKeyword, "trigger_keyword");
        LIZ2.LJIJJ(closeReason.getDesc$livegift_impl_release(), "close_reason");
        LIZ2.LJIL("show_duration", Float.valueOf(f));
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }
}
