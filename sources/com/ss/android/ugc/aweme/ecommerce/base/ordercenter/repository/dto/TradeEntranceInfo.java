package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TradeEntranceInfo implements Serializable {

    @InterfaceC65349Pkn("title_en")
    public String entryName;

    @InterfaceC65349Pkn("icon_dark_url")
    public String iconDarkUrl;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("tips")
    public String tips;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("to_review_count")
    public Integer toReviewCount;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public TradeEntranceInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TradeEntranceInfo copy$default(TradeEntranceInfo tradeEntranceInfo, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = tradeEntranceInfo.type;
        }
        if ((i & 2) != 0) {
            str = tradeEntranceInfo.tips;
        }
        if ((i & 4) != 0) {
            str2 = tradeEntranceInfo.schema;
        }
        if ((i & 8) != 0) {
            str3 = tradeEntranceInfo.title;
        }
        if ((i & 16) != 0) {
            str4 = tradeEntranceInfo.entryName;
        }
        if ((i & 32) != 0) {
            str5 = tradeEntranceInfo.iconUrl;
        }
        if ((i & 64) != 0) {
            str6 = tradeEntranceInfo.iconDarkUrl;
        }
        if ((i & 128) != 0) {
            num2 = tradeEntranceInfo.toReviewCount;
        }
        return tradeEntranceInfo.copy(num, str, str2, str3, str4, str5, str6, num2);
    }

    public final TradeEntranceInfo copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Integer num2) {
        return new TradeEntranceInfo(num, str, str2, str3, str4, str5, str6, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeEntranceInfo)) {
            return false;
        }
        TradeEntranceInfo tradeEntranceInfo = (TradeEntranceInfo) obj;
        return o.LJ(this.type, tradeEntranceInfo.type) && o.LJ(this.tips, tradeEntranceInfo.tips) && o.LJ(this.schema, tradeEntranceInfo.schema) && o.LJ(this.title, tradeEntranceInfo.title) && o.LJ(this.entryName, tradeEntranceInfo.entryName) && o.LJ(this.iconUrl, tradeEntranceInfo.iconUrl) && o.LJ(this.iconDarkUrl, tradeEntranceInfo.iconDarkUrl) && o.LJ(this.toReviewCount, tradeEntranceInfo.toReviewCount);
    }

    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.tips;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.schema;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entryName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconUrl;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iconDarkUrl;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.toReviewCount;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TradeEntranceInfo(type=");
        LIZ.append(this.type);
        LIZ.append(", tips=");
        LIZ.append(this.tips);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", entryName=");
        LIZ.append(this.entryName);
        LIZ.append(", iconUrl=");
        LIZ.append(this.iconUrl);
        LIZ.append(", iconDarkUrl=");
        LIZ.append(this.iconDarkUrl);
        LIZ.append(", toReviewCount=");
        return s0.LIZJ(LIZ, this.toReviewCount, ')', LIZ);
    }

    public final String getEntryName() {
        return this.entryName;
    }

    public final String getIconDarkUrl() {
        return this.iconDarkUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTips() {
        return this.tips;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getToReviewCount() {
        return this.toReviewCount;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setEntryName(String str) {
        this.entryName = str;
    }

    public final void setIconDarkUrl(String str) {
        this.iconDarkUrl = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTips(String str) {
        this.tips = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setToReviewCount(Integer num) {
        this.toReviewCount = num;
    }

    public TradeEntranceInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Integer num2) {
        this.type = num;
        this.tips = str;
        this.schema = str2;
        this.title = str3;
        this.entryName = str4;
        this.iconUrl = str5;
        this.iconDarkUrl = str6;
        this.toReviewCount = num2;
    }

    public /* synthetic */ TradeEntranceInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Integer.valueOf(OrderEntranceType.CLOSE.ordinal()) : num, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null, (i & 128) != 0 ? 0 : num2);
    }
}
