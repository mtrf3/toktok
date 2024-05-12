package com.bytedance.android.livesdk.model;

import X.CR6;
import X.DIX;
import X.EnumC31509CYf;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public final class EnvelopePortalMessage extends CR6 {
    public boolean LJLIL = true;

    @InterfaceC65349Pkn("portal_display")
    public int portalDisplay;

    @InterfaceC65349Pkn("portal_info")
    public PortalInfo portalInfo;

    @InterfaceC65349Pkn("portal_trans_target")
    public PortalTransTarget portalTransTarget;

    @InterfaceC65349Pkn("portal_view")
    public int portalView;

    /* loaded from: classes6.dex */
    public static final class PortalInfo extends F9E {

        @InterfaceC65349Pkn("ddl_second")
        public int ddlSecond;

        @InterfaceC65349Pkn("envelope_diamonds")
        public int envelopeDiamonds;

        @InterfaceC65349Pkn("id")
        public String id;

        @InterfaceC65349Pkn("idc")
        public String idc;

        @InterfaceC65349Pkn("portal_diamonds")
        public int portalDiamonds;

        @InterfaceC65349Pkn("send_at_second")
        public int sendAtSecond;

        @InterfaceC65349Pkn("sender_avatar")
        public ImageModel senderAvatar;

        @InterfaceC65349Pkn("sender_display_id")
        public String senderDisplayId;

        @InterfaceC65349Pkn("sender_id")
        public String senderId;

        @InterfaceC65349Pkn("touch_count")
        public int touchCount;

        @InterfaceC65349Pkn("trans_count")
        public int transCount;

        @Override // X.F9E
        public final Object[] getObjects() {
            String str = this.id;
            String str2 = this.idc;
            String str3 = this.senderDisplayId;
            String str4 = this.senderId;
            ImageModel imageModel = this.senderAvatar;
            return new Object[]{str, str, str2, str2, Integer.valueOf(this.sendAtSecond), Integer.valueOf(this.ddlSecond), Integer.valueOf(this.envelopeDiamonds), Integer.valueOf(this.portalDiamonds), str3, str3, str4, str4, imageModel, imageModel, Integer.valueOf(this.transCount)};
        }
    }

    /* loaded from: classes6.dex */
    public static final class PortalTransTarget extends F9E {

        @InterfaceC65349Pkn("anchor_avatar")
        public ImageModel anchorAvatar;

        @InterfaceC65349Pkn("anchor_display_id")
        public String anchorDisplayId;

        @InterfaceC65349Pkn("anchor_id")
        public String anchorId;

        @InterfaceC65349Pkn("envelope_diamonds")
        public int envelopeDiamonds;

        @InterfaceC65349Pkn("room_id")
        public String roomId;

        @InterfaceC65349Pkn("send_room_cover")
        public ImageModel sendRoomCover;

        @Override // X.F9E
        public final Object[] getObjects() {
            String str = this.roomId;
            ImageModel imageModel = this.sendRoomCover;
            String str2 = this.anchorDisplayId;
            String str3 = this.anchorId;
            ImageModel imageModel2 = this.anchorAvatar;
            return new Object[]{str, str, imageModel, imageModel, str2, str2, str3, str3, imageModel2, imageModel2, Integer.valueOf(this.envelopeDiamonds)};
        }
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.portalInfo != null) {
            sb.append(", portal_info=");
            sb.append(this.portalInfo);
        }
        if (this.portalTransTarget != null) {
            sb.append(", portal_trans_target=");
            sb.append(this.portalTransTarget);
        }
        sb.append(", portal_view=");
        sb.append(this.portalView);
        sb.append(", portal_display=");
        sb.append(this.portalDisplay);
        return DIX.LIZLLL(sb, 0, 2, "EnvelopePortalMessage{", '}');
    }

    public EnvelopePortalMessage() {
        this.type = EnumC31509CYf.ENVELOPE_PORTAL_MESSAGE;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        return this.LJLIL;
    }
}
