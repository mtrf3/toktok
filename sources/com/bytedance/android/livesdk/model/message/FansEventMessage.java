package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import webcast.data.FansLevelInfo;

/* loaded from: classes6.dex */
public final class FansEventMessage extends CR6 {

    @InterfaceC65349Pkn("data")
    public FansEventData data;

    @InterfaceC65349Pkn("event_type")
    public int eventType;

    @InterfaceC65349Pkn("fans_level_info")
    public FansLevelInfo fansLevelInfo;

    @InterfaceC65349Pkn("user")
    public User user;

    public FansEventMessage() {
        this.type = EnumC31509CYf.FANS_EVENT_MESSAGE;
    }
}
