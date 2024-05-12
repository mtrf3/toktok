package com.bytedance.android.livesdk.service.assets.giftlist.colddata;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GiftColdData {
    public final Map<Long, Gift> LIZ;
    public final boolean LIZIZ;

    @InterfaceC65349Pkn("metadata")
    public final GiftColdMetaData metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public GiftColdData() {
        this(null, false, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftColdData)) {
            return false;
        }
        GiftColdData giftColdData = (GiftColdData) obj;
        return o.LJ(this.LIZ, giftColdData.LIZ) && this.LIZIZ == giftColdData.LIZIZ && o.LJ(this.metadata, giftColdData.metadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Map<Long, Gift> map = this.LIZ;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        GiftColdMetaData giftColdMetaData = this.metadata;
        return i2 + (giftColdMetaData != null ? giftColdMetaData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftColdData(giftList=");
        LIZ.append(this.LIZ);
        LIZ.append(", isFromCache=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", metadata=");
        LIZ.append(this.metadata);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GiftColdData(Map<Long, ? extends Gift> map, boolean z, GiftColdMetaData giftColdMetaData) {
        this.LIZ = map;
        this.LIZIZ = z;
        this.metadata = giftColdMetaData;
    }

    public /* synthetic */ GiftColdData(Map map, boolean z, GiftColdMetaData giftColdMetaData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : giftColdMetaData);
    }
}
