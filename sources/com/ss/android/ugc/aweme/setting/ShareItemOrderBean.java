package com.ss.android.ugc.aweme.setting;

import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public class ShareItemOrderBean {

    @InterfaceC65349Pkn("action_id")
    public String actionId;

    @InterfaceC65349Pkn("action_name")
    public String actionName;

    @InterfaceC65349Pkn("group_id")
    public Integer groupId;

    @InterfaceC65349Pkn("idx")
    public int idx;

    public final int LIZ() {
        Integer num = this.groupId;
        if (num == null || num.intValue() < 0) {
            return -1;
        }
        return this.groupId.intValue();
    }

    public ShareItemOrderBean(String str) {
        this.actionId = str;
    }
}
