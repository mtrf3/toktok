package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class PartnershipPunishMessage extends CR6 {

    @InterfaceC65349Pkn("punish_info")
    public PunishEventInfo punishInfo;

    public PartnershipPunishMessage() {
        this.type = EnumC31509CYf.PARTNERSHIP_PUNISH_MESSAGE;
    }
}
