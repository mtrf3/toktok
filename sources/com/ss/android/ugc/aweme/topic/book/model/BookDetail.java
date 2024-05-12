package com.ss.android.ugc.aweme.topic.book.model;

import X.C78920UyC;
import X.C7PR;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookDetail {

    @InterfaceC65349Pkn("author_name")
    public final String author;

    @InterfaceC65349Pkn("cover")
    public final UrlModel cover;

    @InterfaceC65349Pkn("description")
    public final String desc;

    @InterfaceC65349Pkn("have_reviewed")
    public final Boolean hasReviewed;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("is_collected")
    public final Boolean isCollected;

    @InterfaceC65349Pkn("review_count")
    public final Long reviewCount;

    @InterfaceC65349Pkn("show_stat_count_trigger")
    public final Long reviewCountThreshold;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("topic_rating")
    public final Float topicRating;

    /* JADX WARN: Multi-variable type inference failed */
    public BookDetail() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.author;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int hashCode5 = (hashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Float f = this.topicRating;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Long l = this.reviewCount;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.hasReviewed;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.reviewCountThreshold;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool2 = this.isCollected;
        return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicRawInfo LIZ() {
        return new TopicRawInfo(Integer.valueOf(C7PR.BOOK.getType()), this.id, this.title, this.cover, this.author, null, 0 == true ? 1 : 0, this.topicRating, this.isCollected, 96, 0 == true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BookDetail(id=");
        LIZ.append(this.id);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", author=");
        LIZ.append(this.author);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", topicRating=");
        LIZ.append(this.topicRating);
        LIZ.append(", reviewCount=");
        LIZ.append(this.reviewCount);
        LIZ.append(", hasReviewed=");
        LIZ.append(this.hasReviewed);
        LIZ.append(", reviewCountThreshold=");
        LIZ.append(this.reviewCountThreshold);
        LIZ.append(", isCollected=");
        return C78920UyC.LIZIZ(LIZ, this.isCollected, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BookDetail)) {
            return false;
        }
        BookDetail bookDetail = (BookDetail) obj;
        if (!o.LJ(bookDetail.id, this.id) || !o.LJ(bookDetail.title, this.title) || !o.LJ(bookDetail.author, this.author)) {
            return false;
        }
        return true;
    }

    public BookDetail(String str, String str2, String str3, String str4, UrlModel urlModel, Float f, Long l, Boolean bool, Long l2, Boolean bool2) {
        this.id = str;
        this.title = str2;
        this.author = str3;
        this.desc = str4;
        this.cover = urlModel;
        this.topicRating = f;
        this.reviewCount = l;
        this.hasReviewed = bool;
        this.reviewCountThreshold = l2;
        this.isCollected = bool2;
    }

    public /* synthetic */ BookDetail(String str, String str2, String str3, String str4, UrlModel urlModel, Float f, Long l, Boolean bool, Long l2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : urlModel, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : l2, (i & 512) == 0 ? bool2 : null);
    }
}
