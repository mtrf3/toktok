package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class RivalsParams extends F9E {

    @InterfaceC65349Pkn("client_log_id")
    public String clientLogId = "";

    @InterfaceC65349Pkn("entrance")
    public int entrance;

    @InterfaceC65349Pkn("is_official_channel")
    public boolean isOfficialChannel;

    @InterfaceC65349Pkn("panel_style_version")
    public long panelStyleVersion;

    @InterfaceC65349Pkn("rivals_type")
    public Long rivalsType;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("top_living_suggest_uid")
    public long topLivingSuggestUid;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.rivalsType;
        Long l2 = this.roomId;
        return new Object[]{l, l, l2, l2};
    }
}
