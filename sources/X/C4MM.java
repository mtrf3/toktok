package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4MM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MM {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ2 = C4WC.LIZIZ.LIZ(str);
        if (LIZ2 != null && C79004UzY.LJJJJIZL(LIZ2) == 0) {
            z = true;
        }
        return !z;
    }

    public static void LIZJ(String str, String str2, String str3) {
        String str4;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C77800Ug8.LIZ(LIZ2, "onEventV3");
        String LIZJ = C38352F3k.LIZJ(str);
        o.LJIIIIZZ(LIZJ, "md5Hex(conversationId)");
        LIZ3.put("conversation_id", LIZJ);
        if (LIZ(str)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.put("is_recommended_chat", str4);
        if (str2 != null) {
            LIZ3.put("emoji_id", str2);
        }
        if (str3 != null) {
            LIZ3.put("enter_method", str3);
        }
        LIZ2.LIZIZ("greeting_emoji", LIZ3);
    }

    public static void LIZIZ(String uid, String str, List emojis, boolean z, String str2) {
        String str3;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(emojis, "emojis");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        StringBuilder sb = new StringBuilder();
        int size = emojis.size();
        for (int i = 0; i < size; i++) {
            sb.append(((Emoji) ListProtector.get(emojis, i)).getId());
            if (i != emojis.size() - 1) {
                sb.append(",");
            }
        }
        c1hq.put("conversation_id", str);
        c1hq.put("to_user_id", uid);
        if (LIZ(str)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_recommended_chat", str3);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "emojiId.toString()");
        c1hq.put("emoji_id", sb2);
        if (str2 != null) {
            c1hq.put("enter_method", str2);
        }
        if (z) {
            onEventV3.LIZIZ("greeting_emoji_alert_close", c1hq);
        } else {
            onEventV3.LIZIZ("greeting_emoji_alert_show", c1hq);
        }
    }
}
