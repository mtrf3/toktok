package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BusinessLinksCountResponse extends F9E implements Serializable {

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    @InterfaceC65349Pkn("total")
    public final int total;

    public static /* synthetic */ BusinessLinksCountResponse copy$default(BusinessLinksCountResponse businessLinksCountResponse, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = businessLinksCountResponse.statusCode;
        }
        if ((i3 & 2) != 0) {
            str = businessLinksCountResponse.statusMsg;
        }
        if ((i3 & 4) != 0) {
            i2 = businessLinksCountResponse.total;
        }
        return businessLinksCountResponse.copy(i, str, i2);
    }

    public final BusinessLinksCountResponse copy(int i, String statusMsg, int i2) {
        o.LJIIIZ(statusMsg, "statusMsg");
        return new BusinessLinksCountResponse(i, statusMsg, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.statusMsg, Integer.valueOf(this.total)};
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final int getTotal() {
        return this.total;
    }

    public BusinessLinksCountResponse(int i, String statusMsg, int i2) {
        o.LJIIIZ(statusMsg, "statusMsg");
        this.statusCode = i;
        this.statusMsg = statusMsg;
        this.total = i2;
    }
}
