package com.bytedance.android.livesdk.service.assets.giftlist.colddata;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class GiftColdMetaData {

    @InterfaceC65349Pkn("hash")
    public final String hash;

    @InterfaceC65349Pkn("num_gifts")
    public final int numGifts;

    /* JADX WARN: Multi-variable type inference failed */
    public GiftColdMetaData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public GiftColdMetaData(String str, int i) {
        this.hash = str;
        this.numGifts = i;
    }

    public /* synthetic */ GiftColdMetaData(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
    }
}
