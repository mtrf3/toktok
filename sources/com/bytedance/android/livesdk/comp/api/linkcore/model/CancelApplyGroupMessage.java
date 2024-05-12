package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class CancelApplyGroupMessage {
    public final List<GroupPlayer> leaver;
    public final LinkLayerMessage linkLayerMessage;
    public final GroupPlayer operator;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CancelApplyGroupMessage copy$default(CancelApplyGroupMessage cancelApplyGroupMessage, LinkLayerMessage linkLayerMessage, List list, GroupPlayer groupPlayer, int i, Object obj) {
        if ((i & 1) != 0) {
            linkLayerMessage = cancelApplyGroupMessage.linkLayerMessage;
        }
        if ((i & 2) != 0) {
            list = cancelApplyGroupMessage.leaver;
        }
        if ((i & 4) != 0) {
            groupPlayer = cancelApplyGroupMessage.operator;
        }
        return cancelApplyGroupMessage.copy(linkLayerMessage, list, groupPlayer);
    }

    public final CancelApplyGroupMessage copy(LinkLayerMessage linkLayerMessage, List<GroupPlayer> list, GroupPlayer groupPlayer) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        return new CancelApplyGroupMessage(linkLayerMessage, list, groupPlayer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelApplyGroupMessage)) {
            return false;
        }
        CancelApplyGroupMessage cancelApplyGroupMessage = (CancelApplyGroupMessage) obj;
        return o.LJ(this.linkLayerMessage, cancelApplyGroupMessage.linkLayerMessage) && o.LJ(this.leaver, cancelApplyGroupMessage.leaver) && o.LJ(this.operator, cancelApplyGroupMessage.operator);
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
        LIZ.append("CancelApplyGroupMessage(linkLayerMessage=");
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

    public CancelApplyGroupMessage(LinkLayerMessage linkLayerMessage, List<GroupPlayer> list, GroupPlayer groupPlayer) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        this.linkLayerMessage = linkLayerMessage;
        this.leaver = list;
        this.operator = groupPlayer;
    }
}
