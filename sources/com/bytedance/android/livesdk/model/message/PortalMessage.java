package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.CU1;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Portal;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes17.dex */
public class PortalMessage extends CR6 {

    @InterfaceC65349Pkn("next_ping_time")
    public Long nextPingTime;

    @InterfaceC65349Pkn("payload")
    public CU1 payload;

    @InterfaceC65349Pkn("type")
    public int payloadType;

    @InterfaceC65349Pkn("portal")
    public Portal portal;

    @InterfaceC65349Pkn("portal_buy")
    public PortalBuy portalBuy;

    @InterfaceC65349Pkn("portal_finish")
    public PortalFinish portalFinish;

    @InterfaceC65349Pkn("portal_id")
    public long portalId;

    @InterfaceC65349Pkn("portal_invite")
    public PortalInvite portalInvite;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    /* loaded from: classes17.dex */
    public static class PortalBuy implements CU1 {

        @InterfaceC65349Pkn("sugar_daddy")
        public User sugarDaddy;
    }

    /* loaded from: classes6.dex */
    public static class PortalFinish implements CU1 {

        @InterfaceC65349Pkn("lucky_person")
        public User luckyPerson;
    }

    /* loaded from: classes17.dex */
    public static class PortalInvite implements CU1 {

        @InterfaceC65349Pkn("anchor")
        public User anchor;

        @InterfaceC65349Pkn("cover")
        public ImageModel cover;

        @InterfaceC65349Pkn("invite_count_down")
        public long inviteCountDown;

        @InterfaceC65349Pkn("reward_count_down")
        public long rewardCountDown;

        @InterfaceC65349Pkn("sugar_daddy")
        public User sugarDaddy;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public PortalMessage() {
        this.type = EnumC31509CYf.PORTAL_MESSAGE;
    }
}
