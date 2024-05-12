package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ForceFeed {

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("feed_id")
    public final String feedId;

    @InterfaceC65349Pkn("feed_type")
    public final Integer feedType;

    public static /* synthetic */ ForceFeed copy$default(ForceFeed forceFeed, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forceFeed.feedId;
        }
        if ((i & 2) != 0) {
            num = forceFeed.feedType;
        }
        if ((i & 4) != 0) {
            str2 = forceFeed.authorId;
        }
        return forceFeed.copy(str, num, str2);
    }

    public final ForceFeed copy(String str, Integer num, String str2) {
        return new ForceFeed(str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForceFeed)) {
            return false;
        }
        ForceFeed forceFeed = (ForceFeed) obj;
        return o.LJ(this.feedId, forceFeed.feedId) && o.LJ(this.feedType, forceFeed.feedType) && o.LJ(this.authorId, forceFeed.authorId);
    }

    public int hashCode() {
        String str = this.feedId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.feedType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.authorId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForceFeed(feedId=");
        LIZ.append(this.feedId);
        LIZ.append(", feedType=");
        LIZ.append(this.feedType);
        LIZ.append(", authorId=");
        return q.LIZIZ(LIZ, this.authorId, ')', LIZ);
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getFeedId() {
        return this.feedId;
    }

    public final Integer getFeedType() {
        return this.feedType;
    }

    public ForceFeed(String str, Integer num, String str2) {
        this.feedId = str;
        this.feedType = num;
        this.authorId = str2;
    }
}
