package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class RoomVerifyMessage extends CR6 {

    @InterfaceC65349Pkn("close_room")
    public Boolean closeRoom;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("notice_type")
    public Long noticeType;

    @InterfaceC65349Pkn("action")
    public int verifyAction;

    public RoomVerifyMessage() {
        this.type = EnumC31509CYf.ROOM_VERIFY;
    }
}
