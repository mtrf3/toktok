package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiftSupporterPanelResponse {

    @InterfaceC65349Pkn("status_code")
    public final int code;

    @InterfaceC65349Pkn("data")
    public final GiftSupporterPanelInfo data;

    @InterfaceC65349Pkn("status_msg")
    public final String msg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftSupporterPanelResponse)) {
            return false;
        }
        GiftSupporterPanelResponse giftSupporterPanelResponse = (GiftSupporterPanelResponse) obj;
        return this.code == giftSupporterPanelResponse.code && o.LJ(this.msg, giftSupporterPanelResponse.msg) && o.LJ(this.data, giftSupporterPanelResponse.data);
    }

    public final int hashCode() {
        int i = this.code * 31;
        String str = this.msg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        GiftSupporterPanelInfo giftSupporterPanelInfo = this.data;
        return hashCode + (giftSupporterPanelInfo != null ? giftSupporterPanelInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftSupporterPanelResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public GiftSupporterPanelResponse(int i, String str, GiftSupporterPanelInfo giftSupporterPanelInfo) {
        this.code = i;
        this.msg = str;
        this.data = giftSupporterPanelInfo;
    }
}
