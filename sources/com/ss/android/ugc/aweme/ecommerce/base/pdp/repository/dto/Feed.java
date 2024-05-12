package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Feed {

    @InterfaceC65349Pkn("extra")
    public final FeedExtra extra;

    @InterfaceC65349Pkn("type")
    public final Integer feedType;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("product")
    public final FeedProduct product;

    /* JADX WARN: Multi-variable type inference failed */
    public Feed() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feed)) {
            return false;
        }
        Feed feed = (Feed) obj;
        return o.LJ(this.id, feed.id) && o.LJ(this.feedType, feed.feedType) && o.LJ(this.product, feed.product) && o.LJ(this.extra, feed.extra);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.feedType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        FeedProduct feedProduct = this.product;
        int hashCode3 = (hashCode2 + (feedProduct == null ? 0 : feedProduct.hashCode())) * 31;
        FeedExtra feedExtra = this.extra;
        return hashCode3 + (feedExtra != null ? feedExtra.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Feed(id=");
        LIZ.append(this.id);
        LIZ.append(", feedType=");
        LIZ.append(this.feedType);
        LIZ.append(", product=");
        LIZ.append(this.product);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public Feed(String str, Integer num, FeedProduct feedProduct, FeedExtra feedExtra) {
        this.id = str;
        this.feedType = num;
        this.product = feedProduct;
        this.extra = feedExtra;
    }

    public /* synthetic */ Feed(String str, Integer num, FeedProduct feedProduct, FeedExtra feedExtra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 1 : num, (i & 4) != 0 ? null : feedProduct, (i & 8) != 0 ? null : feedExtra);
    }
}
