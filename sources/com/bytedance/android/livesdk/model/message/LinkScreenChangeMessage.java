package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class LinkScreenChangeMessage extends CR6 {

    @InterfaceC65349Pkn("enlarge_status_syn")
    public LinkerEnlargeStatusSynContent enlargeStatusSyn;

    @InterfaceC65349Pkn("guest_cancel_enlarge")
    public LinkerGuestCancelEnlargeContent guestCancelEnlarge;

    @InterfaceC65349Pkn("message_type")
    public int messageType;

    public LinkScreenChangeMessage() {
        this.type = EnumC31509CYf.LINK_SCREEN_CHANGE_MESSAGE;
    }
}
