package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C1FJ;
import X.C1FL;
import X.C1NE;
import X.C26866AgY;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ReviewImageItem implements Parcelable {
    public static final Parcelable.Creator<ReviewImageItem> CREATOR = new C26866AgY();

    @InterfaceC65349Pkn("images")
    public final List<Image> images;

    @InterfaceC65349Pkn("is_owner")
    public final Boolean isOwner;

    @InterfaceC65349Pkn("media")
    public final List<ReviewMedia> media;

    @InterfaceC65349Pkn("rating")
    public final Integer rating;

    @InterfaceC65349Pkn("review_id")
    public final String reviewId;

    @InterfaceC65349Pkn("review_timestamp")
    public final String reviewTimeStamp;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewImageItem)) {
            return false;
        }
        ReviewImageItem reviewImageItem = (ReviewImageItem) obj;
        return o.LJ(this.reviewId, reviewImageItem.reviewId) && o.LJ(this.images, reviewImageItem.images) && o.LJ(this.reviewTimeStamp, reviewImageItem.reviewTimeStamp) && o.LJ(this.isOwner, reviewImageItem.isOwner) && o.LJ(this.rating, reviewImageItem.rating) && o.LJ(this.media, reviewImageItem.media);
    }

    public final int hashCode() {
        String str = this.reviewId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Image> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.reviewTimeStamp;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isOwner;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.rating;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<ReviewMedia> list2 = this.media;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReviewImageItem(reviewId=");
        LIZ.append(this.reviewId);
        LIZ.append(", images=");
        LIZ.append(this.images);
        LIZ.append(", reviewTimeStamp=");
        LIZ.append(this.reviewTimeStamp);
        LIZ.append(", isOwner=");
        LIZ.append(this.isOwner);
        LIZ.append(", rating=");
        LIZ.append(this.rating);
        LIZ.append(", media=");
        return C1NE.LIZIZ(LIZ, this.media, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.reviewId);
        List<Image> list = this.images;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeParcelable((Parcelable) LIZIZ.next(), i);
            }
        }
        out.writeString(this.reviewTimeStamp);
        Boolean bool = this.isOwner;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Integer num = this.rating;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        List<ReviewMedia> list2 = this.media;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
        while (LIZIZ2.hasNext()) {
            ((ReviewMedia) LIZIZ2.next()).writeToParcel(out, i);
        }
    }

    public ReviewImageItem(String str, List<Image> list, String str2, Boolean bool, Integer num, List<ReviewMedia> list2) {
        this.reviewId = str;
        this.images = list;
        this.reviewTimeStamp = str2;
        this.isOwner = bool;
        this.rating = num;
        this.media = list2;
    }

    public /* synthetic */ ReviewImageItem(String str, List list, String str2, Boolean bool, Integer num, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, bool, (i & 16) != 0 ? null : num, (i & 32) == 0 ? list2 : null);
    }
}
