package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiftListPanelResponse {

    @InterfaceC65349Pkn("status_code")
    public final int code;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("status_msg")
    public final String msg;

    @InterfaceC65349Pkn("senders")
    public final List<GiftSender> senders;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftListPanelResponse)) {
            return false;
        }
        GiftListPanelResponse giftListPanelResponse = (GiftListPanelResponse) obj;
        return this.code == giftListPanelResponse.code && o.LJ(this.msg, giftListPanelResponse.msg) && o.LJ(this.senders, giftListPanelResponse.senders) && this.hasMore == giftListPanelResponse.hasMore && o.LJ(this.cursor, giftListPanelResponse.cursor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.code * 31;
        String str = this.msg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<GiftSender> list = this.senders;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.hasMore;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        Long l = this.cursor;
        return i3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftListPanelResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", senders=");
        LIZ.append(this.senders);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", cursor=");
        return JBR.LJ(LIZ, this.cursor, ')', LIZ);
    }

    public GiftListPanelResponse(int i, String str, List<GiftSender> list, boolean z, Long l) {
        this.code = i;
        this.msg = str;
        this.senders = list;
        this.hasMore = z;
        this.cursor = l;
    }
}
