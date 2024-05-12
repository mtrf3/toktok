package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CreateChannelParam {

    @InterfaceC65349Pkn("common")
    public LinkCommonBean common;

    @InterfaceC65349Pkn("config")
    public InitConfig config;

    @InterfaceC65349Pkn("multi_guest_req_extra")
    public BizCreateChannelParams extra;

    @InterfaceC65349Pkn("layout_id")
    public String layoutId;

    @InterfaceC65349Pkn("live_room_mode")
    public Long liveRoomMode;

    @InterfaceC65349Pkn("myself")
    public UserBean player;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateChannelParam)) {
            return false;
        }
        CreateChannelParam createChannelParam = (CreateChannelParam) obj;
        return o.LJ(this.common, createChannelParam.common) && o.LJ(this.player, createChannelParam.player) && o.LJ(this.config, createChannelParam.config) && o.LJ(this.layoutId, createChannelParam.layoutId) && o.LJ(this.extra, createChannelParam.extra) && o.LJ(this.liveRoomMode, createChannelParam.liveRoomMode);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.layoutId, (this.config.hashCode() + ((this.player.hashCode() + (this.common.hashCode() * 31)) * 31)) * 31, 31);
        BizCreateChannelParams bizCreateChannelParams = this.extra;
        int i = 0;
        if (bizCreateChannelParams == null) {
            hashCode = 0;
        } else {
            hashCode = bizCreateChannelParams.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Long l = this.liveRoomMode;
        if (l != null) {
            i = l.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreateChannelParam(common=");
        LIZ.append(this.common);
        LIZ.append(", player=");
        LIZ.append(this.player);
        LIZ.append(", config=");
        LIZ.append(this.config);
        LIZ.append(", layoutId=");
        LIZ.append(this.layoutId);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", liveRoomMode=");
        return JBR.LJ(LIZ, this.liveRoomMode, ')', LIZ);
    }

    public CreateChannelParam(LinkCommonBean common, UserBean player, InitConfig config, String layoutId, BizCreateChannelParams bizCreateChannelParams, Long l) {
        o.LJIIIZ(common, "common");
        o.LJIIIZ(player, "player");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(layoutId, "layoutId");
        this.common = common;
        this.player = player;
        this.config = config;
        this.layoutId = layoutId;
        this.extra = bizCreateChannelParams;
        this.liveRoomMode = l;
    }

    public /* synthetic */ CreateChannelParam(LinkCommonBean linkCommonBean, UserBean userBean, InitConfig initConfig, String str, BizCreateChannelParams bizCreateChannelParams, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(linkCommonBean, userBean, initConfig, str, (i & 16) != 0 ? null : bizCreateChannelParams, l);
    }
}
