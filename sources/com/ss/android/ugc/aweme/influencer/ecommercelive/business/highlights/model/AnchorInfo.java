package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorInfo implements Serializable {

    @InterfaceC65349Pkn("can_delete")
    public final Boolean canDelete;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("keyword")
    public final String keyword;

    @InterfaceC65349Pkn("language")
    public final String language;

    @InterfaceC65349Pkn("subtype")
    public final String subtype;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    @InterfaceC65349Pkn("url")
    public final String url;

    public static /* synthetic */ AnchorInfo copy$default(AnchorInfo anchorInfo, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = anchorInfo.type;
        }
        if ((i & 2) != 0) {
            str = anchorInfo.subtype;
        }
        if ((i & 4) != 0) {
            str2 = anchorInfo.keyword;
        }
        if ((i & 8) != 0) {
            str3 = anchorInfo.url;
        }
        if ((i & 16) != 0) {
            str4 = anchorInfo.language;
        }
        if ((i & 32) != 0) {
            str5 = anchorInfo.content;
        }
        if ((i & 64) != 0) {
            str6 = anchorInfo.extra;
        }
        if ((i & 128) != 0) {
            str7 = anchorInfo.iconUrl;
        }
        if ((i & 256) != 0) {
            bool = anchorInfo.canDelete;
        }
        return anchorInfo.copy(num, str, str2, str3, str4, str5, str6, str7, bool);
    }

    public final AnchorInfo copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        return new AnchorInfo(num, str, str2, str3, str4, str5, str6, str7, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorInfo)) {
            return false;
        }
        AnchorInfo anchorInfo = (AnchorInfo) obj;
        return o.LJ(this.type, anchorInfo.type) && o.LJ(this.subtype, anchorInfo.subtype) && o.LJ(this.keyword, anchorInfo.keyword) && o.LJ(this.url, anchorInfo.url) && o.LJ(this.language, anchorInfo.language) && o.LJ(this.content, anchorInfo.content) && o.LJ(this.extra, anchorInfo.extra) && o.LJ(this.iconUrl, anchorInfo.iconUrl) && o.LJ(this.canDelete, anchorInfo.canDelete);
    }

    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.subtype;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.keyword;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.language;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.content;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.extra;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.iconUrl;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.canDelete;
        return hashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorInfo(type=");
        LIZ.append(this.type);
        LIZ.append(", subtype=");
        LIZ.append(this.subtype);
        LIZ.append(", keyword=");
        LIZ.append(this.keyword);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", language=");
        LIZ.append(this.language);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", iconUrl=");
        LIZ.append(this.iconUrl);
        LIZ.append(", canDelete=");
        return C78920UyC.LIZIZ(LIZ, this.canDelete, ')', LIZ);
    }

    public final Boolean getCanDelete() {
        return this.canDelete;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public AnchorInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.type = num;
        this.subtype = str;
        this.keyword = str2;
        this.url = str3;
        this.language = str4;
        this.content = str5;
        this.extra = str6;
        this.iconUrl = str7;
        this.canDelete = bool;
    }

    public /* synthetic */ AnchorInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", bool);
    }
}
