package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class PromoteInfo {

    @InterfaceC65349Pkn("PromoteOther")
    public int promoteOther;

    @InterfaceC65349Pkn("promote_other_message")
    public PromoteOtherMessage promoteOtherMessage;

    public PromoteInfo() {
    }

    public PromoteInfo(int i, PromoteOtherMessage promoteOtherMessage) {
        this.promoteOther = i;
        this.promoteOtherMessage = promoteOtherMessage;
    }
}
