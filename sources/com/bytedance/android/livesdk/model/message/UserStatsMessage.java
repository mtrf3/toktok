package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class UserStatsMessage extends CR6 {

    @InterfaceC65349Pkn("action_type")
    public long mActionType;

    @InterfaceC65349Pkn("content")
    public String mContent;

    @InterfaceC65349Pkn("user_id")
    public long mUserId;

    public UserStatsMessage() {
        this.type = EnumC31509CYf.USER_STATS;
    }
}
