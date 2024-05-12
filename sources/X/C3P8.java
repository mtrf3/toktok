package X;

import android.util.ArrayMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3P8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3P8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, C3PB chatType, C3P7 suggestedChatType, int i, C3PE c3pe) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(chatType, "chatType");
        o.LJIIIZ(suggestedChatType, "suggestedChatType");
        o.LJIIIZ(onEventV3, "onEventV3");
        int i2 = 0;
        OSZ[] oszArr = {new OSZ("enter_from", "chat"), new OSZ("conversation_id", String.valueOf(str)), new OSZ("to_user_id", String.valueOf(str2)), new OSZ("chat_type", chatType.getValue()), new OSZ("suggested_chat_type", suggestedChatType.getValue()), new OSZ("action", c3pe.LIZ), new OSZ("num_stickers", String.valueOf(i))};
        ArrayMap arrayMap = new ArrayMap();
        do {
            OSZ osz = oszArr[i2];
            arrayMap.put(osz.getFirst(), osz.getSecond());
            i2++;
        } while (i2 < 7);
        if (c3pe instanceof C3PA) {
            C3PA c3pa = (C3PA) c3pe;
            arrayMap.put("message_type", c3pa.LIZIZ.getValue());
            arrayMap.put("sticker_id", String.valueOf(c3pa.LIZJ));
        }
        onEventV3.LIZIZ("click_suggested_stickers_panel", arrayMap);
    }
}
