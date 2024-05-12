package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class TicketMasterAnchorExtra {

    @InterfaceC65349Pkn("location_type")
    public final String locationType;

    @InterfaceC65349Pkn("sub_title")
    public final String subTitle;

    @InterfaceC65349Pkn("tm_item_type")
    public final String tmItemType;

    /* JADX WARN: Multi-variable type inference failed */
    public TicketMasterAnchorExtra() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public TicketMasterAnchorExtra(String str, String str2, String str3) {
        this.subTitle = str;
        this.tmItemType = str2;
        this.locationType = str3;
    }

    public /* synthetic */ TicketMasterAnchorExtra(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
