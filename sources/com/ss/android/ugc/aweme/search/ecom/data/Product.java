package com.ss.android.ugc.aweme.search.ecom.data;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.UC7;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Product {

    @InterfaceC65349Pkn("activity_info")
    public final ActivityInfo activityInfo;

    @InterfaceC65349Pkn("biz_type")
    public final Integer bizType;

    @InterfaceC65349Pkn("cover")
    public final String cover;

    @InterfaceC65349Pkn("currency_position")
    public final Integer currencyPosition;

    @InterfaceC65349Pkn("currency_symbol")
    public final String currencySymbol;

    @InterfaceC65349Pkn("detail_url")
    public final String detailUrl;

    @InterfaceC65349Pkn("elastic_title")
    public final String elasticTitle;

    @InterfaceC65349Pkn("extra")
    public final ExtraInfo extra;

    @InterfaceC65349Pkn("format_origin_price_number")
    public final String formatOriginPriceNumber;

    @InterfaceC65349Pkn("format_price")
    public final String formatPrice;

    @InterfaceC65349Pkn("format_price_number")
    public final String formatPriceNumber;

    @InterfaceC65349Pkn("product_id_str")
    public final String idStr;

    @InterfaceC65349Pkn("img")
    public final List<String> imgUrlList;

    @InterfaceC65349Pkn("platform")
    public final Integer platform;

    @InterfaceC65349Pkn("product_id")
    public final Long productId;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("source_from")
    public final String sourceFrom;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public Product() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 524287, 0 == true ? 1 : 0);
    }

    /* loaded from: classes9.dex */
    public static final class ActivityInfo {

        @InterfaceC65349Pkn("icon")
        public final UrlModel iconUrl;

        @InterfaceC65349Pkn("name")
        public final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public ActivityInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityInfo)) {
                return false;
            }
            ActivityInfo activityInfo = (ActivityInfo) obj;
            return o.LJ(this.name, activityInfo.name) && o.LJ(this.iconUrl, activityInfo.iconUrl);
        }

        public final int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            UrlModel urlModel = this.iconUrl;
            return hashCode + (urlModel != null ? urlModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ActivityInfo(name=");
            LIZ.append(this.name);
            LIZ.append(", iconUrl=");
            return C31461Li.LIZLLL(LIZ, this.iconUrl, ')', LIZ);
        }

        public ActivityInfo(String str, UrlModel urlModel) {
            this.name = str;
            this.iconUrl = urlModel;
        }

        public /* synthetic */ ActivityInfo(String str, UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : urlModel);
        }
    }

    /* loaded from: classes9.dex */
    public static final class ExtraInfo {

        @InterfaceC65349Pkn("is_pinned")
        public final int isPinned;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExtraInfo) && this.isPinned == ((ExtraInfo) obj).isPinned;
        }

        public final int hashCode() {
            return this.isPinned;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ExtraInfo(isPinned=");
            return b0.LIZJ(LIZ, this.isPinned, ')', LIZ);
        }

        public ExtraInfo(int i) {
            this.isPinned = i;
        }
    }

    public final String LIZ() {
        String str = this.idStr;
        if (str == null || str.length() == 0) {
            return String.valueOf(this.productId);
        }
        return this.idStr;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int i;
        Long l = this.productId;
        int i2 = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i3 = hashCode * 31;
        String str = this.idStr;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str2 = this.title;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        String str3 = this.cover;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        String str4 = this.elasticTitle;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        List<String> list = this.imgUrlList;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        String str5 = this.formatPrice;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        String str6 = this.currencySymbol;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i10 = (i9 + hashCode8) * 31;
        String str7 = this.formatPriceNumber;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i11 = (i10 + hashCode9) * 31;
        String str8 = this.formatOriginPriceNumber;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i12 = (i11 + hashCode10) * 31;
        Integer num = this.currencyPosition;
        if (num == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num.hashCode();
        }
        int i13 = (i12 + hashCode11) * 31;
        ActivityInfo activityInfo = this.activityInfo;
        if (activityInfo == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = activityInfo.hashCode();
        }
        int i14 = (i13 + hashCode12) * 31;
        String str9 = this.schema;
        if (str9 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str9.hashCode();
        }
        int i15 = (i14 + hashCode13) * 31;
        String str10 = this.detailUrl;
        if (str10 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str10.hashCode();
        }
        int i16 = (i15 + hashCode14) * 31;
        Integer num2 = this.platform;
        if (num2 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num2.hashCode();
        }
        int i17 = (i16 + hashCode15) * 31;
        String str11 = this.sourceFrom;
        if (str11 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str11.hashCode();
        }
        int i18 = (i17 + hashCode16) * 31;
        String str12 = this.source;
        if (str12 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str12.hashCode();
        }
        int i19 = (i18 + hashCode17) * 31;
        ExtraInfo extraInfo = this.extra;
        if (extraInfo == null) {
            i = 0;
        } else {
            i = extraInfo.isPinned;
        }
        int i20 = (i19 + i) * 31;
        Integer num3 = this.bizType;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return i20 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Product(productId=");
        sb.append(this.productId);
        sb.append(", idStr=");
        sb.append(this.idStr);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", elasticTitle=");
        sb.append(this.elasticTitle);
        sb.append(", imgUrlList=");
        sb.append(this.imgUrlList);
        sb.append(", formatPrice=");
        sb.append(this.formatPrice);
        sb.append(", currencySymbol=");
        sb.append(this.currencySymbol);
        sb.append(", formatPriceNumber=");
        sb.append(this.formatPriceNumber);
        sb.append(", formatOriginPriceNumber=");
        sb.append(this.formatOriginPriceNumber);
        sb.append(", currencyPosition=");
        sb.append(this.currencyPosition);
        sb.append(", activityInfo=");
        sb.append(this.activityInfo);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", detailUrl=");
        sb.append(this.detailUrl);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", sourceFrom=");
        sb.append(this.sourceFrom);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", bizType=");
        return UC7.LIZ(sb, this.bizType, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Product) {
            return o.LJ(((Product) obj).productId, this.productId);
        }
        return false;
    }

    public Product(Long l, String str, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, String str8, Integer num, ActivityInfo activityInfo, String str9, String str10, Integer num2, String str11, String str12, ExtraInfo extraInfo, Integer num3) {
        this.productId = l;
        this.idStr = str;
        this.title = str2;
        this.cover = str3;
        this.elasticTitle = str4;
        this.imgUrlList = list;
        this.formatPrice = str5;
        this.currencySymbol = str6;
        this.formatPriceNumber = str7;
        this.formatOriginPriceNumber = str8;
        this.currencyPosition = num;
        this.activityInfo = activityInfo;
        this.schema = str9;
        this.detailUrl = str10;
        this.platform = num2;
        this.sourceFrom = str11;
        this.source = str12;
        this.extra = extraInfo;
        this.bizType = num3;
    }

    public /* synthetic */ Product(Long l, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, Integer num, ActivityInfo activityInfo, String str9, String str10, Integer num2, String str11, String str12, ExtraInfo extraInfo, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : activityInfo, (i & 4096) != 0 ? null : str9, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str10, (i & 16384) != 0 ? null : num2, (32768 & i) != 0 ? null : str11, (65536 & i) != 0 ? null : str12, (131072 & i) != 0 ? null : extraInfo, (i & 262144) != 0 ? null : num3);
    }
}
