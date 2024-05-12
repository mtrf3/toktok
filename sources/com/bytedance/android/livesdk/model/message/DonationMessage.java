package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.DIX;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class DonationMessage extends CR6 {

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("sponsor")
    public List<User> sponsor;

    @InterfaceC65349Pkn("total")
    public Long total;

    @InterfaceC65349Pkn("user")
    public List<User> user;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        if (this.currency != null) {
            sb.append(", currency=");
            sb.append(this.currency);
        }
        List<User> list = this.sponsor;
        if (list != null && !list.isEmpty()) {
            sb.append(", sponsor=");
            sb.append(this.sponsor);
        }
        List<User> list2 = this.user;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", user=");
            sb.append(this.user);
        }
        return DIX.LIZLLL(sb, 0, 2, "DonationMessage{", '}');
    }

    public DonationMessage() {
        this.type = EnumC31509CYf.DONATION_MESSAGE;
    }
}
