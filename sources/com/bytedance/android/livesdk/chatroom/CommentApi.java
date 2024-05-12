package com.bytedance.android.livesdk.chatroom;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatEmojiListData;
import com.bytedance.android.livesdk.chatroom.model.ChatExtra;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.model.EmoteChatResult;
import com.bytedance.android.livesdk.chatroom.model.QuickComment;
import java.util.HashMap;

/* loaded from: classes6.dex */
public interface CommentApi {
    @E8L("/webcast/room/chat_emoji_list/")
    AbstractC73672Svk<C28467BFf<ChatEmojiListData>> queryChatEmojiList(@InterfaceC64986Pew("emoji_count") long j);

    @E8L("/webcast/room/quick_chat_list/")
    AbstractC73672Svk<C28467BFf<QuickComment>> queryQuickComments(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2, @InterfaceC64986Pew("is_subscribing") boolean z, @InterfaceC64986Pew("scenes_list") String str, @InterfaceC64986Pew("extra") String str2);

    @E8M("/webcast/screen_chat/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Barrage>> sendBarrage(@InterfaceC36229EJt HashMap<String, String> hashMap);

    @E8M("/webcast/room/chat/event/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> sendChatEvent(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("event") int i);

    @E8M("/webcast/room/emote_chat/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<EmoteChatResult>> sendEmote(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("emote_id_list") String str);

    @E8M("/webcast/room/chat/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse<ChatResult, ChatExtra>> sendTextMessage(@InterfaceC36229EJt HashMap<String, String> hashMap);
}
