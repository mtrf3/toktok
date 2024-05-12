package com.ss.android.ugc.aweme.notice.api.bean;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class LinkBusinessExtra extends F9E {

    @InterfaceC65349Pkn("item_id")
    public final String itemId;

    @InterfaceC65349Pkn("link_id")
    public final String linkId;

    @InterfaceC65349Pkn("share_type")
    public final int shareType;

    @InterfaceC65349Pkn("type")
    public final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkBusinessExtra() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.type, this.linkId, this.itemId, Integer.valueOf(this.shareType)};
    }

    public LinkBusinessExtra(String str, String str2, String str3, int i) {
        HH1.LIZ(str, "type", str2, "linkId", str3, "itemId");
        this.type = str;
        this.linkId = str2;
        this.itemId = str3;
        this.shareType = i;
    }

    public /* synthetic */ LinkBusinessExtra(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? -1 : i);
    }
}
