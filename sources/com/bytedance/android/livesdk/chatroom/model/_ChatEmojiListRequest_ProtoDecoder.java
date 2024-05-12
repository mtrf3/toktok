package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ChatEmojiListRequest_ProtoDecoder implements InterfaceC31105CIr<ChatEmojiListRequest> {
    @Override // X.InterfaceC31105CIr
    public final ChatEmojiListRequest LIZ(Q9H q9h) {
        ChatEmojiListRequest chatEmojiListRequest = new ChatEmojiListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    chatEmojiListRequest.emojiCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return chatEmojiListRequest;
            }
        }
    }
}
