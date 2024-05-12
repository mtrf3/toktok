package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class CohostReserveMessage extends CR6 {

    @InterfaceC65349Pkn("reply_content")
    public ReplyContent replyContent;

    @InterfaceC65349Pkn("reservation_id")
    public long reservationId;

    @InterfaceC65349Pkn("reserve_content")
    public ReserveContent reserveContent;

    @InterfaceC65349Pkn("reserve_type")
    public int reserveType;

    public CohostReserveMessage() {
        this.type = EnumC31509CYf.COHOST_RESERVE_MESSAGE;
    }
}
