package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class DonationInfoMessage extends CR6 {

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("donation_total")
    public String totalMoney;

    @InterfaceC65349Pkn("donation_user_count")
    public long totalUser;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return false;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        return false;
    }

    public DonationInfoMessage() {
        this.type = EnumC31509CYf.DONATION_INFO;
    }
}
