package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class LinkMicSignal {

    @InterfaceC65349Pkn("send_uid")
    public String senderInteractId;

    @InterfaceC65349Pkn("send_id")
    public String senderUserId;

    @InterfaceC65349Pkn("target_uid")
    public String targetInteractId;

    @InterfaceC65349Pkn("target_id")
    public String targetUserId;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("ver")
    public String version = "1";

    @InterfaceC65349Pkn("priority")
    public int priority = 1;
}
