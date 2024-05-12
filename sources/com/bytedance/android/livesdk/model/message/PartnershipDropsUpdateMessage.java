package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class PartnershipDropsUpdateMessage extends CR6 {

    @InterfaceC65349Pkn("anchor_uid")
    public long anchorUid;

    @InterfaceC65349Pkn("change_mode")
    public int changeMode;

    @InterfaceC65349Pkn("drops_id")
    public String dropsId;

    @InterfaceC65349Pkn("event_id")
    public String eventId;

    @InterfaceC65349Pkn("task_id")
    public String taskId;

    public PartnershipDropsUpdateMessage() {
        this.type = EnumC31509CYf.PARTNERSHIP_DROPS_UPDATE_MESSAGE;
        this.dropsId = "";
        this.taskId = "";
        this.eventId = "";
    }
}
