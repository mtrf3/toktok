package com.ss.android.ugc.aweme.offlinemode.api;

import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class InspectItemResponse {

    @InterfaceC65349Pkn("impr_id")
    public final String imprId;

    @InterfaceC65349Pkn("item_status")
    public final String itemStatus;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public InspectItemResponse() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public InspectItemResponse(int i, String str, String str2, String str3) {
        HH1.LIZ(str, "statusMsg", str2, "imprId", str3, "itemStatus");
        this.statusCode = i;
        this.statusMsg = str;
        this.imprId = str2;
        this.itemStatus = str3;
    }

    public /* synthetic */ InspectItemResponse(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
