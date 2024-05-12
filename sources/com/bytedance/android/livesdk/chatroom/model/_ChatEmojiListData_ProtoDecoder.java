package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _ChatEmojiListData_ProtoDecoder implements InterfaceC31105CIr<ChatEmojiListData> {
    public static ChatEmojiListData LIZIZ(Q9H q9h) {
        ChatEmojiListData chatEmojiListData = new ChatEmojiListData();
        chatEmojiListData.emojiList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    chatEmojiListData.emojiList.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return chatEmojiListData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ChatEmojiListData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
