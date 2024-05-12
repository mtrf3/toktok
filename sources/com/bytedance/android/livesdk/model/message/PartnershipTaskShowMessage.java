package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class PartnershipTaskShowMessage extends CR6 {

    @InterfaceC65349Pkn("change_mode")
    public int changeMode;

    @InterfaceC65349Pkn("has_show_task")
    public boolean hasShowTask;

    @InterfaceC65349Pkn("task_id")
    public String taskId = "";

    public PartnershipTaskShowMessage() {
        this.type = EnumC31509CYf.PARTNERSHIP_TASK_SHOW_MESSAGE;
    }
}
