package com.ss.android.ugc.feed.platform.cardinsert.data;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CardTypeRequest {

    @InterfaceC65349Pkn("biz_info")
    public final String bizInfo;

    @InterfaceC65349Pkn("card_type")
    public final int cardType;

    /* JADX WARN: Multi-variable type inference failed */
    public CardTypeRequest() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public CardTypeRequest(int i, String bizInfo) {
        o.LJIIIZ(bizInfo, "bizInfo");
        this.cardType = i;
        this.bizInfo = bizInfo;
    }

    public /* synthetic */ CardTypeRequest(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str);
    }
}
