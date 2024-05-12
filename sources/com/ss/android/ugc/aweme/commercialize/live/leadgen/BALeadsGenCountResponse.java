package com.ss.android.ugc.aweme.commercialize.live.leadgen;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BALeadsGenCountResponse extends F9E implements Serializable {

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    public static /* synthetic */ BALeadsGenCountResponse copy$default(BALeadsGenCountResponse bALeadsGenCountResponse, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bALeadsGenCountResponse.statusCode;
        }
        if ((i3 & 2) != 0) {
            str = bALeadsGenCountResponse.statusMsg;
        }
        if ((i3 & 4) != 0) {
            i2 = bALeadsGenCountResponse.count;
        }
        return bALeadsGenCountResponse.copy(i, str, i2);
    }

    public final BALeadsGenCountResponse copy(int i, String statusMsg, int i2) {
        o.LJIIIZ(statusMsg, "statusMsg");
        return new BALeadsGenCountResponse(i, statusMsg, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.statusMsg, Integer.valueOf(this.count)};
    }

    public final int getCount() {
        return this.count;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public BALeadsGenCountResponse(int i, String statusMsg, int i2) {
        o.LJIIIZ(statusMsg, "statusMsg");
        this.statusCode = i;
        this.statusMsg = statusMsg;
        this.count = i2;
    }
}
