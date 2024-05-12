package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MultiInviteResponse {

    @InterfaceC65349Pkn("battle_id")
    public Long battleId;

    @InterfaceC65349Pkn("battle_team_user")
    public List<TeamUser> battleTeamUser;

    @InterfaceC65349Pkn("gift_mode_meta")
    public GiftModeMeta giftModeMeta;

    @InterfaceC65349Pkn("invite_scene")
    public int meanwhileInviteScene;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiInviteResponse() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public MultiInviteResponse(Long l, int i, List<TeamUser> list) {
        this.battleId = l;
        this.meanwhileInviteScene = i;
        this.battleTeamUser = list;
    }

    public /* synthetic */ MultiInviteResponse(Long l, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : l, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : list);
    }
}
