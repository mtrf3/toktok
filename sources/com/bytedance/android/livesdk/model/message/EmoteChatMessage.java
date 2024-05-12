package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import webcast.data.MsgFilter;
import webcast.data.UserIdentity;

/* loaded from: classes6.dex */
public class EmoteChatMessage extends CR6 {

    @InterfaceC65349Pkn("emote_list")
    public List<EmoteModel> emoteList;

    @InterfaceC65349Pkn("msg_filter")
    public MsgFilter msgFilter;

    @InterfaceC65349Pkn("user")
    public User user;

    @InterfaceC65349Pkn("user_identity")
    public UserIdentity userIdentity;

    @Override // X.CR6
    public final boolean supportDisplayText() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        List<EmoteModel> list;
        if (this.user != null && (list = this.emoteList) != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public EmoteChatMessage() {
        this.type = EnumC31509CYf.EMOTE_CHAT;
    }
}
