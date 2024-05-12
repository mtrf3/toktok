package com.bytedance.android.livesdk.model.message;

import X.C278817o;
import X.CR6;
import X.DIX;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class PartnershipCardChangeMessage extends CR6 {

    @InterfaceC65349Pkn("change_mode")
    public int changeMode;

    @InterfaceC65349Pkn("sequence_id")
    public Integer sequenceId;

    @InterfaceC65349Pkn("task_id")
    public String taskId;

    public final String toString() {
        StringBuilder LIZJ = C278817o.LIZJ(", change_mode=");
        LIZJ.append(this.changeMode);
        if (this.sequenceId != null) {
            LIZJ.append(", sequence_id=");
            LIZJ.append(this.sequenceId);
        }
        if (this.taskId != null) {
            LIZJ.append(", task_id=");
            LIZJ.append(this.taskId);
        }
        return DIX.LIZLLL(LIZJ, 0, 2, "PartnershipCardChangeMessage{", '}');
    }

    public PartnershipCardChangeMessage() {
        this.type = EnumC31509CYf.PARTNERSHIP_CARD_CHANGE_MESSAGE;
    }
}
