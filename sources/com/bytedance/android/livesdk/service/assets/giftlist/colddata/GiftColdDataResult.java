package com.bytedance.android.livesdk.service.assets.giftlist.colddata;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GiftColdDataResult {

    @InterfaceC65349Pkn("gifts")
    public final List<Gift> giftList;

    @InterfaceC65349Pkn("metadata")
    public final GiftColdMetaData metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public GiftColdDataResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftColdDataResult)) {
            return false;
        }
        GiftColdDataResult giftColdDataResult = (GiftColdDataResult) obj;
        return o.LJ(this.giftList, giftColdDataResult.giftList) && o.LJ(this.metadata, giftColdDataResult.metadata);
    }

    public final int hashCode() {
        List<Gift> list = this.giftList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        GiftColdMetaData giftColdMetaData = this.metadata;
        return hashCode + (giftColdMetaData != null ? giftColdMetaData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftColdDataResult(giftList=");
        LIZ.append(this.giftList);
        LIZ.append(", metadata=");
        LIZ.append(this.metadata);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GiftColdDataResult(List<? extends Gift> list, GiftColdMetaData giftColdMetaData) {
        this.giftList = list;
        this.metadata = giftColdMetaData;
    }

    public /* synthetic */ GiftColdDataResult(List list, GiftColdMetaData giftColdMetaData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : giftColdMetaData);
    }
}
