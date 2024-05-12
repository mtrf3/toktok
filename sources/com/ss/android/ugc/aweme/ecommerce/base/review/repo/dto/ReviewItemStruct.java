package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C07670Rv;
import X.C08880Wm;
import X.C1FJ;
import X.C1FL;
import X.C1NE;
import X.C279017q;
import X.C69659RVn;
import X.C69660RVo;
import X.C69699RXb;
import X.C69700RXc;
import X.C69701RXd;
import X.C69702RXe;
import X.EnumC27721AuL;
import X.InterfaceC27632Asu;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReviewItemStruct implements Parcelable, InterfaceC27632Asu {
    public static final Parcelable.Creator<ReviewItemStruct> CREATOR = new C69660RVo();
    public int brickName;

    @InterfaceC65349Pkn("digg_count")
    public final Integer diggCount;

    @InterfaceC65349Pkn("is_anonymous")
    public final Boolean isAnonymous;

    @InterfaceC65349Pkn("is_digged")
    public final Boolean isDigged;

    @InterfaceC65349Pkn("is_owner")
    public final Boolean isOwner;

    @InterfaceC65349Pkn("is_updated")
    public final boolean isUpdated;

    @InterfaceC65349Pkn("review")
    public final MainReview review;

    @InterfaceC65349Pkn("link")
    public final String reviewLink;

    @InterfaceC65349Pkn("review_source_name")
    public final String reviewSourceName;

    @InterfaceC65349Pkn("review_source_type")
    public final Integer reviewSourceType;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    @InterfaceC65349Pkn("sku_specification")
    public final String specification;

    @InterfaceC65349Pkn("review_tags")
    public final List<ReviewTags> tags;

    @InterfaceC65349Pkn("review_user")
    public final User user;

    /* loaded from: classes13.dex */
    public static final class MainReview implements Parcelable {
        public static final Parcelable.Creator<MainReview> CREATOR = new C69701RXd();

        @InterfaceC65349Pkn("append_review")
        public final AppendReview appendReview;

        @InterfaceC65349Pkn("display_review_text")
        public final List<DisplayReviewText> displayReviewTexts;

        @InterfaceC65349Pkn("has_origin_text")
        public final Boolean hasOriginText;

        @InterfaceC65349Pkn("media")
        public final List<ReviewMedia> media;

        @InterfaceC65349Pkn("rating")
        public final String rating;

        @InterfaceC65349Pkn("reply_main_review")
        public final String reply;

        @InterfaceC65349Pkn("review_aspect_items")
        public final List<ReviewAspectItem> reviewAspectItems;

        @InterfaceC65349Pkn("review_id")
        public final String reviewId;

        @InterfaceC65349Pkn("review_timestamp")
        public final String reviewTimeStamp;

        @InterfaceC65349Pkn("review_timestamp_fmt")
        public final String reviewTimestampFmt;

        @InterfaceC65349Pkn("display_text")
        public final String text;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainReview)) {
                return false;
            }
            MainReview mainReview = (MainReview) obj;
            return o.LJ(this.reviewId, mainReview.reviewId) && o.LJ(this.rating, mainReview.rating) && o.LJ(this.text, mainReview.text) && o.LJ(this.reviewTimeStamp, mainReview.reviewTimeStamp) && o.LJ(this.appendReview, mainReview.appendReview) && o.LJ(this.reply, mainReview.reply) && o.LJ(this.hasOriginText, mainReview.hasOriginText) && o.LJ(this.displayReviewTexts, mainReview.displayReviewTexts) && o.LJ(this.reviewAspectItems, mainReview.reviewAspectItems) && o.LJ(this.media, mainReview.media) && o.LJ(this.reviewTimestampFmt, mainReview.reviewTimestampFmt);
        }

        public final int hashCode() {
            String str = this.reviewId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.rating;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.text;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.reviewTimeStamp;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            AppendReview appendReview = this.appendReview;
            int hashCode5 = (hashCode4 + (appendReview == null ? 0 : appendReview.hashCode())) * 31;
            String str5 = this.reply;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.hasOriginText;
            int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<DisplayReviewText> list = this.displayReviewTexts;
            int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            List<ReviewAspectItem> list2 = this.reviewAspectItems;
            int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<ReviewMedia> list3 = this.media;
            int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
            String str6 = this.reviewTimestampFmt;
            return hashCode10 + (str6 != null ? str6.hashCode() : 0);
        }

        public final boolean LIZ() {
            List<DisplayReviewText> list;
            String str = this.text;
            if ((str == null || ujb.o.LJJJJJL(str)) && ((list = this.displayReviewTexts) == null || list.isEmpty())) {
                return false;
            }
            return true;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MainReview(reviewId=");
            sb.append(this.reviewId);
            sb.append(", rating=");
            sb.append(this.rating);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", reviewTimeStamp=");
            sb.append(this.reviewTimeStamp);
            sb.append(", appendReview=");
            sb.append(this.appendReview);
            sb.append(", reply=");
            sb.append(this.reply);
            sb.append(", hasOriginText=");
            sb.append(this.hasOriginText);
            sb.append(", displayReviewTexts=");
            sb.append(this.displayReviewTexts);
            sb.append(", reviewAspectItems=");
            sb.append(this.reviewAspectItems);
            sb.append(", media=");
            sb.append(this.media);
            sb.append(", reviewTimestampFmt=");
            return C07670Rv.LIZIZ(sb, this.reviewTimestampFmt, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.reviewId);
            out.writeString(this.rating);
            out.writeString(this.text);
            out.writeString(this.reviewTimeStamp);
            AppendReview appendReview = this.appendReview;
            if (appendReview == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                appendReview.writeToParcel(out, i);
            }
            out.writeString(this.reply);
            Boolean bool = this.hasOriginText;
            if (bool == null) {
                out.writeInt(0);
            } else {
                C1FL.LJ(out, 1, bool);
            }
            List<DisplayReviewText> list = this.displayReviewTexts;
            if (list == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
                while (LIZIZ.hasNext()) {
                    ((DisplayReviewText) LIZIZ.next()).writeToParcel(out, i);
                }
            }
            List<ReviewAspectItem> list2 = this.reviewAspectItems;
            if (list2 == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
                while (LIZIZ2.hasNext()) {
                    ((ReviewAspectItem) LIZIZ2.next()).writeToParcel(out, i);
                }
            }
            List<ReviewMedia> list3 = this.media;
            if (list3 == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ3 = C279017q.LIZIZ(out, 1, list3);
                while (LIZIZ3.hasNext()) {
                    ((ReviewMedia) LIZIZ3.next()).writeToParcel(out, i);
                }
            }
            out.writeString(this.reviewTimestampFmt);
        }

        public MainReview(String str, String str2, String str3, String str4, AppendReview appendReview, String str5, Boolean bool, List<DisplayReviewText> list, List<ReviewAspectItem> list2, List<ReviewMedia> list3, String str6) {
            this.reviewId = str;
            this.rating = str2;
            this.text = str3;
            this.reviewTimeStamp = str4;
            this.appendReview = appendReview;
            this.reply = str5;
            this.hasOriginText = bool;
            this.displayReviewTexts = list;
            this.reviewAspectItems = list2;
            this.media = list3;
            this.reviewTimestampFmt = str6;
        }

        public /* synthetic */ MainReview(String str, String str2, String str3, String str4, AppendReview appendReview, String str5, Boolean bool, List list, List list2, List list3, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? null : appendReview, (i & 32) != 0 ? null : str5, bool, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : list3, (i & 1024) == 0 ? str6 : null);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewItemStruct)) {
            return false;
        }
        ReviewItemStruct reviewItemStruct = (ReviewItemStruct) obj;
        return o.LJ(this.review, reviewItemStruct.review) && o.LJ(this.specification, reviewItemStruct.specification) && o.LJ(this.skuId, reviewItemStruct.skuId) && o.LJ(this.diggCount, reviewItemStruct.diggCount) && o.LJ(this.isDigged, reviewItemStruct.isDigged) && o.LJ(this.isOwner, reviewItemStruct.isOwner) && o.LJ(this.user, reviewItemStruct.user) && o.LJ(this.tags, reviewItemStruct.tags) && o.LJ(this.isAnonymous, reviewItemStruct.isAnonymous) && o.LJ(this.reviewSourceType, reviewItemStruct.reviewSourceType) && o.LJ(this.reviewSourceName, reviewItemStruct.reviewSourceName) && o.LJ(this.reviewLink, reviewItemStruct.reviewLink) && this.isUpdated == reviewItemStruct.isUpdated;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        MainReview mainReview = this.review;
        int hashCode = (mainReview == null ? 0 : mainReview.hashCode()) * 31;
        String str = this.specification;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.skuId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.diggCount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isDigged;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isOwner;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        User user = this.user;
        int hashCode7 = (hashCode6 + (user == null ? 0 : user.hashCode())) * 31;
        List<ReviewTags> list = this.tags;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool3 = this.isAnonymous;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.reviewSourceType;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.reviewSourceName;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reviewLink;
        int hashCode12 = (hashCode11 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isUpdated;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode12 + i;
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    /* loaded from: classes13.dex */
    public static final class AppendReview implements Parcelable {
        public static final Parcelable.Creator<AppendReview> CREATOR = new C69702RXe();

        @InterfaceC65349Pkn("days_from_purchase")
        public final String daysForPruchase;

        @InterfaceC65349Pkn("media")
        public final List<ReviewMedia> media;

        @InterfaceC65349Pkn("reply_append_review")
        public final String reply;

        @InterfaceC65349Pkn("text")
        public final String text;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppendReview)) {
                return false;
            }
            AppendReview appendReview = (AppendReview) obj;
            return o.LJ(this.text, appendReview.text) && o.LJ(this.daysForPruchase, appendReview.daysForPruchase) && o.LJ(this.reply, appendReview.reply) && o.LJ(this.media, appendReview.media);
        }

        public final int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.daysForPruchase;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.reply;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<ReviewMedia> list = this.media;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AppendReview(text=");
            LIZ.append(this.text);
            LIZ.append(", daysForPruchase=");
            LIZ.append(this.daysForPruchase);
            LIZ.append(", reply=");
            LIZ.append(this.reply);
            LIZ.append(", media=");
            return C1NE.LIZIZ(LIZ, this.media, ')', LIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.text);
            out.writeString(this.daysForPruchase);
            out.writeString(this.reply);
            List<ReviewMedia> list = this.media;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ReviewMedia) LIZIZ.next()).writeToParcel(out, i);
            }
        }

        public AppendReview(String str, String str2, String str3, List<ReviewMedia> list) {
            this.text = str;
            this.daysForPruchase = str2;
            this.reply = str3;
            this.media = list;
        }

        public /* synthetic */ AppendReview(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
        }
    }

    /* loaded from: classes13.dex */
    public static final class DisplayReviewText implements Parcelable {

        @InterfaceC65349Pkn("plain_text")
        public final String plainText;

        @InterfaceC65349Pkn("tag_key")
        public final String tagKey;

        @InterfaceC65349Pkn("tag_text")
        public final String tagText;

        @InterfaceC65349Pkn("text_type")
        public final Integer textType;
        public static final C69700RXc Companion = new C69700RXc();
        public static final Parcelable.Creator<DisplayReviewText> CREATOR = new C69699RXb();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayReviewText)) {
                return false;
            }
            DisplayReviewText displayReviewText = (DisplayReviewText) obj;
            return o.LJ(this.textType, displayReviewText.textType) && o.LJ(this.plainText, displayReviewText.plainText) && o.LJ(this.tagKey, displayReviewText.tagKey) && o.LJ(this.tagText, displayReviewText.tagText);
        }

        public final int hashCode() {
            Integer num = this.textType;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.plainText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.tagKey;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tagText;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            int intValue;
            o.LJIIIZ(out, "out");
            Integer num = this.textType;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeString(this.plainText);
            out.writeString(this.tagKey);
            out.writeString(this.tagText);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DisplayReviewText(textType=");
            LIZ.append(this.textType);
            LIZ.append(", plainText=");
            LIZ.append(this.plainText);
            LIZ.append(", tagKey=");
            LIZ.append(this.tagKey);
            LIZ.append(", tagText=");
            return q.LIZIZ(LIZ, this.tagText, ')', LIZ);
        }

        public DisplayReviewText(Integer num, String str, String str2, String str3) {
            this.textType = num;
            this.plainText = str;
            this.tagKey = str2;
            this.tagText = str3;
        }

        public /* synthetic */ DisplayReviewText(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewItemStruct(review=");
        sb.append(this.review);
        sb.append(", specification=");
        sb.append(this.specification);
        sb.append(", skuId=");
        sb.append(this.skuId);
        sb.append(", diggCount=");
        sb.append(this.diggCount);
        sb.append(", isDigged=");
        sb.append(this.isDigged);
        sb.append(", isOwner=");
        sb.append(this.isOwner);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", isAnonymous=");
        sb.append(this.isAnonymous);
        sb.append(", reviewSourceType=");
        sb.append(this.reviewSourceType);
        sb.append(", reviewSourceName=");
        sb.append(this.reviewSourceName);
        sb.append(", reviewLink=");
        sb.append(this.reviewLink);
        sb.append(", isUpdated=");
        return C08880Wm.LIZJ(sb, this.isUpdated, ')');
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.brickName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        MainReview mainReview = this.review;
        if (mainReview == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mainReview.writeToParcel(out, i);
        }
        out.writeString(this.specification);
        out.writeString(this.skuId);
        Integer num = this.diggCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool = this.isDigged;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.isOwner;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        User user = this.user;
        if (user == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            user.writeToParcel(out, i);
        }
        List<ReviewTags> list = this.tags;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ReviewTags) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Boolean bool3 = this.isAnonymous;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        Integer num2 = this.reviewSourceType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.reviewSourceName);
        out.writeString(this.reviewLink);
        out.writeInt(this.isUpdated ? 1 : 0);
    }

    public static ReviewItemStruct LIZ(ReviewItemStruct reviewItemStruct, Integer num, Boolean bool) {
        MainReview mainReview = reviewItemStruct.review;
        String str = reviewItemStruct.specification;
        String str2 = reviewItemStruct.skuId;
        Boolean bool2 = reviewItemStruct.isOwner;
        User user = reviewItemStruct.user;
        List<ReviewTags> list = reviewItemStruct.tags;
        Boolean bool3 = reviewItemStruct.isAnonymous;
        Integer num2 = reviewItemStruct.reviewSourceType;
        String str3 = reviewItemStruct.reviewSourceName;
        String str4 = reviewItemStruct.reviewLink;
        boolean z = reviewItemStruct.isUpdated;
        reviewItemStruct.getClass();
        return new ReviewItemStruct(mainReview, str, str2, num, bool, bool2, user, list, bool3, num2, str3, str4, z);
    }

    /* loaded from: classes13.dex */
    public static final class User implements Parcelable {
        public static final Parcelable.Creator<User> CREATOR = new C69659RVn();

        @InterfaceC65349Pkn("avatar")
        public final Image avatar;

        @InterfaceC65349Pkn("default_avatar")
        public final Icon defaultAvatar;

        @InterfaceC65349Pkn("user_id")
        public final String id;

        @InterfaceC65349Pkn("link")
        public final String link;

        @InterfaceC65349Pkn("name")
        public final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public User() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return o.LJ(this.id, user.id) && o.LJ(this.name, user.name) && o.LJ(this.avatar, user.avatar) && o.LJ(this.link, user.link) && o.LJ(this.defaultAvatar, user.defaultAvatar);
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.avatar;
            int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            String str3 = this.link;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Icon icon = this.defaultAvatar;
            return hashCode4 + (icon != null ? icon.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("User(id=");
            LIZ.append(this.id);
            LIZ.append(", name=");
            LIZ.append(this.name);
            LIZ.append(", avatar=");
            LIZ.append(this.avatar);
            LIZ.append(", link=");
            LIZ.append(this.link);
            LIZ.append(", defaultAvatar=");
            LIZ.append(this.defaultAvatar);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.id);
            out.writeString(this.name);
            out.writeParcelable(this.avatar, i);
            out.writeString(this.link);
            Icon icon = this.defaultAvatar;
            if (icon == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                icon.writeToParcel(out, i);
            }
        }

        public User(String str, String str2, Image image, String str3, Icon icon) {
            this.id = str;
            this.name = str2;
            this.avatar = image;
            this.link = str3;
            this.defaultAvatar = icon;
        }

        public /* synthetic */ User(String str, String str2, Image image, String str3, Icon icon, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : image, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? icon : null);
        }
    }

    public ReviewItemStruct(MainReview mainReview, String str, String str2, Integer num, Boolean bool, Boolean bool2, User user, List<ReviewTags> list, Boolean bool3, Integer num2, String str3, String str4, boolean z) {
        this.review = mainReview;
        this.specification = str;
        this.skuId = str2;
        this.diggCount = num;
        this.isDigged = bool;
        this.isOwner = bool2;
        this.user = user;
        this.tags = list;
        this.isAnonymous = bool3;
        this.reviewSourceType = num2;
        this.reviewSourceName = str3;
        this.reviewLink = str4;
        this.isUpdated = z;
        this.brickName = EnumC27721AuL.REVIEW.getValue();
    }

    public /* synthetic */ ReviewItemStruct(MainReview mainReview, String str, String str2, Integer num, Boolean bool, Boolean bool2, User user, List list, Boolean bool3, Integer num2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainReview, (i & 2) != 0 ? null : str, str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : user, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : str3, (i & 2048) == 0 ? str4 : null, (i & 4096) != 0 ? false : z);
    }
}
