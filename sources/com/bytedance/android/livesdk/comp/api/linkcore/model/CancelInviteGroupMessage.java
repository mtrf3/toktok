package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class CancelInviteGroupMessage {
    public final List<GroupPlayer> leaver;
    public final LinkLayerMessage linkLayerMessage;
    public final GroupPlayer operator;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CancelInviteGroupMessage copy$default(CancelInviteGroupMessage cancelInviteGroupMessage, LinkLayerMessage linkLayerMessage, List list, GroupPlayer groupPlayer, int i, Object obj) {
        if ((i & 1) != 0) {
            linkLayerMessage = cancelInviteGroupMessage.linkLayerMessage;
        }
        if ((i & 2) != 0) {
            list = cancelInviteGroupMessage.leaver;
        }
        if ((i & 4) != 0) {
            groupPlayer = cancelInviteGroupMessage.operator;
        }
        return cancelInviteGroupMessage.copy(linkLayerMessage, list, groupPlayer);
    }

    public final CancelInviteGroupMessage copy(LinkLayerMessage linkLayerMessage, List<GroupPlayer> list, GroupPlayer groupPlayer) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        return new CancelInviteGroupMessage(linkLayerMessage, list, groupPlayer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelInviteGroupMessage)) {
            return false;
        }
        CancelInviteGroupMessage cancelInviteGroupMessage = (CancelInviteGroupMessage) obj;
        return o.LJ(this.linkLayerMessage, cancelInviteGroupMessage.linkLayerMessage) && o.LJ(this.leaver, cancelInviteGroupMessage.leaver) && o.LJ(this.operator, cancelInviteGroupMessage.operator);
    }

    public int hashCode() {
        int hashCode = this.linkLayerMessage.hashCode() * 31;
        List<GroupPlayer> list = this.leaver;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        GroupPlayer groupPlayer = this.operator;
        return hashCode2 + (groupPlayer != null ? groupPlayer.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CancelInviteGroupMessage(linkLayerMessage=");
        LIZ.append(this.linkLayerMessage);
        LIZ.append(", leaver=");
        LIZ.append(this.leaver);
        LIZ.append(", operator=");
        LIZ.append(this.operator);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final List<GroupPlayer> getLeaver() {
        return this.leaver;
    }

    public final LinkLayerMessage getLinkLayerMessage() {
        return this.linkLayerMessage;
    }

    public final GroupPlayer getOperator() {
        return this.operator;
    }

    public CancelInviteGroupMessage(LinkLayerMessage linkLayerMessage, List<GroupPlayer> list, GroupPlayer groupPlayer) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        this.linkLayerMessage = linkLayerMessage;
        this.leaver = list;
        this.operator = groupPlayer;
    }
}
