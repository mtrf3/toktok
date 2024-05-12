package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _ChatEmojiListResponse_ProtoDecoder implements InterfaceC31105CIr<ChatEmojiListResponse> {
    @Override // X.InterfaceC31105CIr
    public final ChatEmojiListResponse LIZ(Q9H q9h) {
        ChatEmojiListResponse chatEmojiListResponse = new ChatEmojiListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    chatEmojiListResponse.data = _ChatEmojiListData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return chatEmojiListResponse;
            }
        }
    }
}
