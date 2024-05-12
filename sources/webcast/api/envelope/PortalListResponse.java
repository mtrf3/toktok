package webcast.api.envelope;

import X.DIX;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes6.dex */
public final class PortalListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class PortalInfo {

        @InterfaceC65349Pkn("ddl_second")
        public int ddlSecond;

        @InterfaceC65349Pkn("envelope_diamonds")
        public int envelopeDiamonds;

        @InterfaceC65349Pkn("id")
        public String id;

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

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            sb.append(", send_at_second=");
            sb.append(this.sendAtSecond);
            sb.append(", ddl_second=");
            sb.append(this.ddlSecond);
            sb.append(", envelope_diamonds=");
            sb.append(this.envelopeDiamonds);
            sb.append(", portal_diamonds=");
            sb.append(this.portalDiamonds);
            if (this.senderDisplayId != null) {
                sb.append(", sender_display_id=");
                sb.append(this.senderDisplayId);
            }
            if (this.senderId != null) {
                sb.append(", sender_id=");
                sb.append(this.senderId);
            }
            if (this.senderAvatar != null) {
                sb.append(", sender_avatar=");
                sb.append(this.senderAvatar);
            }
            sb.append(", trans_count=");
            sb.append(this.transCount);
            return DIX.LIZLLL(sb, 0, 2, "PortalInfo{", '}');
        }
    }

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("portal")
        public List<PortalInfo> portal;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (!this.portal.isEmpty()) {
                sb.append(", portal=");
                sb.append(this.portal);
            }
            return DIX.LIZLLL(sb, 0, 2, "ResponseData{", '}');
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        return DIX.LIZLLL(sb, 0, 2, "PortalListResponse{", '}');
    }
}
