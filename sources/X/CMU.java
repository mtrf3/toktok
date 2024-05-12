package X;

import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes6.dex */
public final class CMU {
    public static final java.util.Set<Long> LIZ = new LinkedHashSet();

    public static ChatMessage LIZ(long j, String str, User user, int i, C1FC c1fc, boolean z, boolean z2, Long l, String str2) {
        long j2;
        List<EmoteWithIndex> list;
        ChatMessage chatMessage = new ChatMessage();
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = -System.currentTimeMillis();
        }
        if (z) {
            LIZ.add(Long.valueOf(j2));
        }
        chatMessage.chatId = j2;
        chatMessage.LJLIL = String.valueOf(j2);
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        commonMessageData.messageId = j2;
        commonMessageData.showMsg = true;
        commonMessageData.describe = str2;
        chatMessage.baseMessage = commonMessageData;
        chatMessage.content = str;
        chatMessage.inputType = i;
        chatMessage.userInfo = user;
        chatMessage.isLocalInsertMsg = true;
        if (!z2) {
            user.setBadgeList(C61878OQg.INSTANCE);
        }
        if (c1fc != null) {
            list = (List) c1fc.LJLJI;
        } else {
            list = null;
        }
        chatMessage.f117emotes = list;
        return chatMessage;
    }
}
