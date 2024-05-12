package com.bytedance.android.livesdk.model.message;

import X.C278817o;
import X.CR6;
import X.DIX;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.WM7;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public final class RankTextMessage extends CR6 {

    @InterfaceC65349Pkn("cur_user_id")
    public long curUserId;

    @InterfaceC65349Pkn("other_get_badge_msg")
    public Text otherGetBadgeMsg;

    @InterfaceC65349Pkn("owner_idx_after_update")
    public Long ownerIdxAfterUpdate;

    @InterfaceC65349Pkn("owner_idx_before_update")
    public Long ownerIdxBeforeUpdate;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    @InterfaceC65349Pkn("self_get_badge_msg")
    public Text selfGetBadgeMsg;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.baseMessage != null) {
            return true;
        }
        return false;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", scene=");
        LIZJ.append(this.scene);
        if (this.ownerIdxBeforeUpdate != null) {
            LIZJ.append(", owner_idx_before_update=");
            LIZJ.append(this.ownerIdxBeforeUpdate);
        }
        if (this.ownerIdxAfterUpdate != null) {
            LIZJ.append(", owner_idx_after_update=");
            LIZJ.append(this.ownerIdxAfterUpdate);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "RankTextMessage{", '}');
    }

    public RankTextMessage() {
        this.type = EnumC31509CYf.RANK_TEXT_MESSAGE;
    }
}
