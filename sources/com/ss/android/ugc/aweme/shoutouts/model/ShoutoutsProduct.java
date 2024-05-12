package com.ss.android.ugc.aweme.shoutouts.model;

import X.C07670Rv;
import X.C47959Irz;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShoutoutsProduct {

    @InterfaceC65349Pkn("creator_uid")
    public final String creatorUid;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("posted")
    public final boolean posted;

    @InterfaceC65349Pkn("price")
    public final ShoutoutsPrice price;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("rating_avg")
    public final float ratingAvg;

    @InterfaceC65349Pkn("rating_cnt")
    public final int ratingCnt;

    @InterfaceC65349Pkn("restrict")
    public final ShoutoutsOrderRestrict restrict;

    @InterfaceC65349Pkn("show_rating")
    public final boolean showRating;

    @InterfaceC65349Pkn("sold_cnt")
    public final int soldCnt;

    @InterfaceC65349Pkn("status")
    public final int status;

    @InterfaceC65349Pkn("video_info")
    public final Aweme videoInfo;

    public static /* synthetic */ ShoutoutsProduct copy$default(ShoutoutsProduct shoutoutsProduct, Aweme aweme, ShoutoutsPrice shoutoutsPrice, String str, float f, int i, int i2, String str2, boolean z, boolean z2, ShoutoutsOrderRestrict shoutoutsOrderRestrict, int i3, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aweme = shoutoutsProduct.videoInfo;
        }
        if ((i4 & 2) != 0) {
            shoutoutsPrice = shoutoutsProduct.price;
        }
        if ((i4 & 4) != 0) {
            str = shoutoutsProduct.description;
        }
        if ((i4 & 8) != 0) {
            f = shoutoutsProduct.ratingAvg;
        }
        if ((i4 & 16) != 0) {
            i = shoutoutsProduct.ratingCnt;
        }
        if ((i4 & 32) != 0) {
            i2 = shoutoutsProduct.soldCnt;
        }
        if ((i4 & 64) != 0) {
            str2 = shoutoutsProduct.productId;
        }
        if ((i4 & 128) != 0) {
            z = shoutoutsProduct.showRating;
        }
        if ((i4 & 256) != 0) {
            z2 = shoutoutsProduct.posted;
        }
        if ((i4 & 512) != 0) {
            shoutoutsOrderRestrict = shoutoutsProduct.restrict;
        }
        if ((i4 & 1024) != 0) {
            i3 = shoutoutsProduct.status;
        }
        if ((i4 & 2048) != 0) {
            str3 = shoutoutsProduct.creatorUid;
        }
        return shoutoutsProduct.copy(aweme, shoutoutsPrice, str, f, i, i2, str2, z, z2, shoutoutsOrderRestrict, i3, str3);
    }

    public final ShoutoutsProduct copy(Aweme aweme, ShoutoutsPrice shoutoutsPrice, String str, float f, int i, int i2, String str2, boolean z, boolean z2, ShoutoutsOrderRestrict shoutoutsOrderRestrict, int i3, String str3) {
        return new ShoutoutsProduct(aweme, shoutoutsPrice, str, f, i, i2, str2, z, z2, shoutoutsOrderRestrict, i3, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsProduct)) {
            return false;
        }
        ShoutoutsProduct shoutoutsProduct = (ShoutoutsProduct) obj;
        return o.LJ(this.videoInfo, shoutoutsProduct.videoInfo) && o.LJ(this.price, shoutoutsProduct.price) && o.LJ(this.description, shoutoutsProduct.description) && Float.compare(this.ratingAvg, shoutoutsProduct.ratingAvg) == 0 && this.ratingCnt == shoutoutsProduct.ratingCnt && this.soldCnt == shoutoutsProduct.soldCnt && o.LJ(this.productId, shoutoutsProduct.productId) && this.showRating == shoutoutsProduct.showRating && this.posted == shoutoutsProduct.posted && o.LJ(this.restrict, shoutoutsProduct.restrict) && this.status == shoutoutsProduct.status && o.LJ(this.creatorUid, shoutoutsProduct.creatorUid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Aweme aweme = this.videoInfo;
        int i = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i2 = hashCode * 31;
        ShoutoutsPrice shoutoutsPrice = this.price;
        if (shoutoutsPrice == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = shoutoutsPrice.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.description;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int LIZIZ = (((C47959Irz.LIZIZ(this.ratingAvg, (i3 + hashCode3) * 31, 31) + this.ratingCnt) * 31) + this.soldCnt) * 31;
        String str2 = this.productId;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i4 = (LIZIZ + hashCode4) * 31;
        boolean z = this.showRating;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        if (!this.posted) {
            i5 = 0;
        }
        int i8 = (i7 + i5) * 31;
        ShoutoutsOrderRestrict shoutoutsOrderRestrict = this.restrict;
        if (shoutoutsOrderRestrict == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = shoutoutsOrderRestrict.hashCode();
        }
        int i9 = (((i8 + hashCode5) * 31) + this.status) * 31;
        String str3 = this.creatorUid;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i9 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShoutoutsProduct(videoInfo=");
        sb.append(this.videoInfo);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", ratingAvg=");
        sb.append(this.ratingAvg);
        sb.append(", ratingCnt=");
        sb.append(this.ratingCnt);
        sb.append(", soldCnt=");
        sb.append(this.soldCnt);
        sb.append(", productId=");
        sb.append(this.productId);
        sb.append(", showRating=");
        sb.append(this.showRating);
        sb.append(", posted=");
        sb.append(this.posted);
        sb.append(", restrict=");
        sb.append(this.restrict);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", creatorUid=");
        return C07670Rv.LIZIZ(sb, this.creatorUid, ')');
    }

    public final String getCreatorUid() {
        return this.creatorUid;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getPosted() {
        return this.posted;
    }

    public final ShoutoutsPrice getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final float getRatingAvg() {
        return this.ratingAvg;
    }

    public final int getRatingCnt() {
        return this.ratingCnt;
    }

    public final ShoutoutsOrderRestrict getRestrict() {
        return this.restrict;
    }

    public final boolean getShowRating() {
        return this.showRating;
    }

    public final int getSoldCnt() {
        return this.soldCnt;
    }

    public final int getStatus() {
        return this.status;
    }

    public final Aweme getVideoInfo() {
        return this.videoInfo;
    }

    public ShoutoutsProduct(Aweme aweme, ShoutoutsPrice shoutoutsPrice, String str, float f, int i, int i2, String str2, boolean z, boolean z2, ShoutoutsOrderRestrict shoutoutsOrderRestrict, int i3, String str3) {
        this.videoInfo = aweme;
        this.price = shoutoutsPrice;
        this.description = str;
        this.ratingAvg = f;
        this.ratingCnt = i;
        this.soldCnt = i2;
        this.productId = str2;
        this.showRating = z;
        this.posted = z2;
        this.restrict = shoutoutsOrderRestrict;
        this.status = i3;
        this.creatorUid = str3;
    }
}
