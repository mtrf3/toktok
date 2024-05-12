package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class InvitationSwitch extends F9E {

    @InterfaceC65349Pkn("extra_base")
    public SwitchExtraBase extraBase;

    @InterfaceC65349Pkn("extra_for_open")
    public SwitchExtraForOpen extraForOpen;

    @InterfaceC65349Pkn("game_id")
    public Long gameId;

    @InterfaceC65349Pkn("game_kind")
    public int gameKind;

    @InterfaceC65349Pkn("id")
    public Long id;

    @InterfaceC65349Pkn("id_str")
    public String idStr;

    @InterfaceC65349Pkn("message")
    public String message;

    @InterfaceC65349Pkn("play_kind")
    public Long playKind;

    @InterfaceC65349Pkn("status")
    public Long status;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.id;
        Long l2 = this.gameId;
        Long l3 = this.playKind;
        Long l4 = this.status;
        String str = this.message;
        SwitchExtraBase switchExtraBase = this.extraBase;
        SwitchExtraForOpen switchExtraForOpen = this.extraForOpen;
        String str2 = this.idStr;
        return new Object[]{l, l, Integer.valueOf(this.gameKind), l2, l2, l3, l3, l4, l4, str, str, switchExtraBase, switchExtraBase, switchExtraForOpen, switchExtraForOpen, str2, str2};
    }
}
