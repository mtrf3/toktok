package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class AnchorPrivilegeItem {

    @InterfaceC65349Pkn("da_info")
    public final DaInfo daInfo;

    @InterfaceC65349Pkn("item_type")
    public final Integer itemType;

    @InterfaceC65349Pkn("opt_show_text")
    public final String optShowText;

    @InterfaceC65349Pkn("selling_item_type")
    public final Integer sellingItemType;

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorPrivilegeItem() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final DaInfo getDaInfo() {
        return this.daInfo;
    }

    public final Integer getItemType() {
        return this.itemType;
    }

    public final String getOptShowText() {
        return this.optShowText;
    }

    public final Integer getSellingItemType() {
        return this.sellingItemType;
    }

    public AnchorPrivilegeItem(Integer num, Integer num2, String str, DaInfo daInfo) {
        this.itemType = num;
        this.sellingItemType = num2;
        this.optShowText = str;
        this.daInfo = daInfo;
    }

    public /* synthetic */ AnchorPrivilegeItem(Integer num, Integer num2, String str, DaInfo daInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : daInfo);
    }
}
