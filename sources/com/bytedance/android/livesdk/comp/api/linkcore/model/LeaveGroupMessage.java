package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupPlayer;

/* loaded from: classes14.dex */
public final class LeaveGroupMessage extends F9E {
    public final LinkLayerMessage linkLayerMessage;
    public final GroupPlayer operator;

    public static /* synthetic */ LeaveGroupMessage copy$default(LeaveGroupMessage leaveGroupMessage, LinkLayerMessage linkLayerMessage, GroupPlayer groupPlayer, int i, Object obj) {
        if ((i & 1) != 0) {
            linkLayerMessage = leaveGroupMessage.linkLayerMessage;
        }
        if ((i & 2) != 0) {
            groupPlayer = leaveGroupMessage.operator;
        }
        return leaveGroupMessage.copy(linkLayerMessage, groupPlayer);
    }

    public final LeaveGroupMessage copy(LinkLayerMessage linkLayerMessage, GroupPlayer operator) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        o.LJIIIZ(operator, "operator");
        return new LeaveGroupMessage(linkLayerMessage, operator);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.linkLayerMessage, this.operator};
    }

    public final LinkLayerMessage getLinkLayerMessage() {
        return this.linkLayerMessage;
    }

    public final GroupPlayer getOperator() {
        return this.operator;
    }

    public LeaveGroupMessage(LinkLayerMessage linkLayerMessage, GroupPlayer operator) {
        o.LJIIIZ(linkLayerMessage, "linkLayerMessage");
        o.LJIIIZ(operator, "operator");
        this.linkLayerMessage = linkLayerMessage;
        this.operator = operator;
    }
}
