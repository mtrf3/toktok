package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class ApplyParams extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public Long anchorId;

    @InterfaceC65349Pkn("guest_supported_layout")
    public Long guestSupportedLayout;

    @InterfaceC65349Pkn("guest_supported_vendor")
    public Long guestSupportedVendor;

    @InterfaceC65349Pkn("layout")
    public Long layout;

    @InterfaceC65349Pkn("link_duration")
    public Long linkDuration;

    @InterfaceC65349Pkn("link_type")
    public Long linkType;

    @InterfaceC65349Pkn("payed_money")
    public Long payedMoney;

    @InterfaceC65349Pkn("position")
    public Long position;

    @InterfaceC65349Pkn("required_mic_idx")
    public Long requiredMicIdx;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        Long l2 = this.linkType;
        Long l3 = this.guestSupportedVendor;
        Long l4 = this.guestSupportedLayout;
        Long l5 = this.payedMoney;
        Long l6 = this.linkDuration;
        Long l7 = this.position;
        Long l8 = this.layout;
        Long l9 = this.anchorId;
        Long l10 = this.requiredMicIdx;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4, l5, l5, l6, l6, l7, l7, l8, l8, l9, l9, l10, l10};
    }
}
