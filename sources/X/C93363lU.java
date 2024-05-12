package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.3lU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93363lU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str) {
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(eventSender, "eventSender");
        C1HQ c1hq = new C1HQ();
        c1hq.put("chat_type", str);
        eventSender.LIZIZ("inner_push_alert_show", c1hq);
    }

    public static void LIZJ(String str) {
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(eventSender, "eventSender");
        C1HQ c1hq = new C1HQ();
        c1hq.put("action_type", str);
        eventSender.LIZIZ("search_contact", c1hq);
    }

    public static void LIZ(String str, String str2, boolean z) {
        String str3;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "eventSender");
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.put("is_master", str3);
        LIZ3.put("enter_method", str2);
        LIZ3.put("conversation_id", str);
        LIZ2.LIZIZ("enter_group_setting", LIZ3);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4) {
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "eventSender", "conversation_id", str, "chat_type", str2);
        LIZ3.put("to_status", str3);
        LIZ2.LIZIZ(str4, LIZ3);
    }
}
