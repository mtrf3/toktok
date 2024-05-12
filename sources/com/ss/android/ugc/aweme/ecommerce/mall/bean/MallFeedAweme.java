package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallFeedAweme {

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("aweme_struct")
    public final String awemeStruct;

    @InterfaceC65349Pkn("item_id")
    public final String itemId;

    @InterfaceC65349Pkn("like_count_str")
    public final String likeStr;

    @InterfaceC65349Pkn("number")
    public final Long number;

    @InterfaceC65349Pkn("products")
    public final List<MallProduct> products;

    @InterfaceC65349Pkn("room_id")
    public final String roomId;

    @InterfaceC65349Pkn("seconds")
    public final Long seconds;

    @InterfaceC65349Pkn("user")
    public final MallSkyLightFeedLiveUser user;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallFeedAweme copy$default(MallFeedAweme mallFeedAweme, String str, String str2, Long l, Long l2, String str3, MallSkyLightFeedLiveUser mallSkyLightFeedLiveUser, String str4, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mallFeedAweme.itemId;
        }
        if ((i & 2) != 0) {
            str2 = mallFeedAweme.roomId;
        }
        if ((i & 4) != 0) {
            l = mallFeedAweme.seconds;
        }
        if ((i & 8) != 0) {
            l2 = mallFeedAweme.number;
        }
        if ((i & 16) != 0) {
            str3 = mallFeedAweme.awemeStruct;
        }
        if ((i & 32) != 0) {
            mallSkyLightFeedLiveUser = mallFeedAweme.user;
        }
        if ((i & 64) != 0) {
            str4 = mallFeedAweme.authorId;
        }
        if ((i & 128) != 0) {
            list = mallFeedAweme.products;
        }
        if ((i & 256) != 0) {
            str5 = mallFeedAweme.likeStr;
        }
        return mallFeedAweme.copy(str, str2, l, l2, str3, mallSkyLightFeedLiveUser, str4, list, str5);
    }

    public final MallFeedAweme copy(String str, String str2, Long l, Long l2, String str3, MallSkyLightFeedLiveUser mallSkyLightFeedLiveUser, String str4, List<MallProduct> list, String str5) {
        return new MallFeedAweme(str, str2, l, l2, str3, mallSkyLightFeedLiveUser, str4, list, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallFeedAweme)) {
            return false;
        }
        MallFeedAweme mallFeedAweme = (MallFeedAweme) obj;
        return o.LJ(this.itemId, mallFeedAweme.itemId) && o.LJ(this.roomId, mallFeedAweme.roomId) && o.LJ(this.seconds, mallFeedAweme.seconds) && o.LJ(this.number, mallFeedAweme.number) && o.LJ(this.awemeStruct, mallFeedAweme.awemeStruct) && o.LJ(this.user, mallFeedAweme.user) && o.LJ(this.authorId, mallFeedAweme.authorId) && o.LJ(this.products, mallFeedAweme.products) && o.LJ(this.likeStr, mallFeedAweme.likeStr);
    }

    public int hashCode() {
        String str = this.itemId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.roomId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.seconds;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.number;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.awemeStruct;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MallSkyLightFeedLiveUser mallSkyLightFeedLiveUser = this.user;
        int hashCode6 = (hashCode5 + (mallSkyLightFeedLiveUser == null ? 0 : mallSkyLightFeedLiveUser.hashCode())) * 31;
        String str4 = this.authorId;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<MallProduct> list = this.products;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.likeStr;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallFeedAweme(itemId=");
        LIZ.append(this.itemId);
        LIZ.append(", roomId=");
        LIZ.append(this.roomId);
        LIZ.append(", seconds=");
        LIZ.append(this.seconds);
        LIZ.append(", number=");
        LIZ.append(this.number);
        LIZ.append(", awemeStruct=");
        LIZ.append(this.awemeStruct);
        LIZ.append(", user=");
        LIZ.append(this.user);
        LIZ.append(", authorId=");
        LIZ.append(this.authorId);
        LIZ.append(", products=");
        LIZ.append(this.products);
        LIZ.append(", likeStr=");
        return q.LIZIZ(LIZ, this.likeStr, ')', LIZ);
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAwemeStruct() {
        return this.awemeStruct;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getLikeStr() {
        return this.likeStr;
    }

    public final Long getNumber() {
        return this.number;
    }

    public final List<MallProduct> getProducts() {
        return this.products;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final Long getSeconds() {
        return this.seconds;
    }

    public final MallSkyLightFeedLiveUser getUser() {
        return this.user;
    }

    public MallFeedAweme(String str, String str2, Long l, Long l2, String str3, MallSkyLightFeedLiveUser mallSkyLightFeedLiveUser, String str4, List<MallProduct> list, String str5) {
        this.itemId = str;
        this.roomId = str2;
        this.seconds = l;
        this.number = l2;
        this.awemeStruct = str3;
        this.user = mallSkyLightFeedLiveUser;
        this.authorId = str4;
        this.products = list;
        this.likeStr = str5;
    }

    public /* synthetic */ MallFeedAweme(String str, String str2, Long l, Long l2, String str3, MallSkyLightFeedLiveUser mallSkyLightFeedLiveUser, String str4, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l, (i & 8) != 0 ? null : l2, str3, mallSkyLightFeedLiveUser, str4, list, str5);
    }
}
