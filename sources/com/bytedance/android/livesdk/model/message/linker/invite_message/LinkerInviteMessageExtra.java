package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import java.util.List;

/* loaded from: classes14.dex */
public class LinkerInviteMessageExtra extends F9E {

    @InterfaceC65349Pkn("duration")
    public int duration;

    @InterfaceC65349Pkn("invite_type")
    public int inviteType;

    @InterfaceC65349Pkn("extra")
    public InviterRivalExtra inviterRivalExtra;

    @InterfaceC65349Pkn("layout")
    public int layout;

    @InterfaceC65349Pkn("match_type")
    public int matchType;

    @InterfaceC65349Pkn("other_users")
    public List<InviterRivalExtra> otherRivalExtra;

    @InterfaceC65349Pkn("sub_type")
    public int subType;

    @InterfaceC65349Pkn("theme")
    public String theme;

    @InterfaceC65349Pkn("tips")
    public String tips;

    @InterfaceC65349Pkn("topic_info")
    public CohostTopic topicInfo;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.matchType), Integer.valueOf(this.inviteType), Integer.valueOf(this.subType), this.theme, Integer.valueOf(this.duration), Integer.valueOf(this.layout), this.tips};
    }
}
