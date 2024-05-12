package com.ss.android.ugc.aweme.services.publish;

import X.C07670Rv;
import X.C79062V1e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorTransData implements Serializable {
    public Long addTime;
    public String anchorContent;
    public final UrlModel anchorIcon;
    public final String anchorTag;
    public final int businessType;
    public final boolean canDelete;
    public final String extra;
    public final String id;
    public final String language;
    public final Integer source;
    public String subtype;
    public final String title;
    public final String url;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent) {
        this(i, anchorContent, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8188, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent, String str) {
        this(i, anchorContent, str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8184, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent, String str, String str2) {
        this(i, anchorContent, str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8176, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent, String str, String str2, Integer num) {
        this(i, anchorContent, str, str2, num, null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8160, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent, String str, String str2, Integer num, String str3) {
        this(i, anchorContent, str, str2, num, str3, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8128, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel) {
        this(i, anchorContent, str, str2, num, str3, urlModel, false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8064, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z) {
        this(i, anchorContent, str, str2, num, str3, urlModel, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7936, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4) {
        this(i, anchorContent, str, str2, num, str3, urlModel, z, str4, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7680, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4, String str5) {
        this(i, anchorContent, str, str2, num, str3, urlModel, z, str4, str5, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7168, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4, String str5, Long l) {
        this(i, anchorContent, str, str2, num, str3, urlModel, z, str4, str5, l, null, 0 == true ? 1 : 0, 6144, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchorTransData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4, String str5, Long l, String str6) {
        this(i, anchorContent, str, str2, num, str3, urlModel, z, str4, str5, l, str6, null, 4096, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    public static /* synthetic */ AnchorTransData copy$default(AnchorTransData anchorTransData, int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = anchorTransData.businessType;
        }
        if ((i2 & 2) != 0) {
            str = anchorTransData.anchorContent;
        }
        if ((i2 & 4) != 0) {
            str2 = anchorTransData.title;
        }
        if ((i2 & 8) != 0) {
            str3 = anchorTransData.anchorTag;
        }
        if ((i2 & 16) != 0) {
            num = anchorTransData.source;
        }
        if ((i2 & 32) != 0) {
            str4 = anchorTransData.id;
        }
        if ((i2 & 64) != 0) {
            urlModel = anchorTransData.anchorIcon;
        }
        if ((i2 & 128) != 0) {
            z = anchorTransData.canDelete;
        }
        if ((i2 & 256) != 0) {
            str5 = anchorTransData.url;
        }
        if ((i2 & 512) != 0) {
            str6 = anchorTransData.language;
        }
        if ((i2 & 1024) != 0) {
            l = anchorTransData.addTime;
        }
        if ((i2 & 2048) != 0) {
            str7 = anchorTransData.extra;
        }
        if ((i2 & 4096) != 0) {
            str8 = anchorTransData.subtype;
        }
        return anchorTransData.copy(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8);
    }

    public final AnchorTransData copy(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4, String str5, Long l, String str6, String str7) {
        o.LJIIIZ(anchorContent, "anchorContent");
        return new AnchorTransData(i, anchorContent, str, str2, num, str3, urlModel, z, str4, str5, l, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorTransData)) {
            return false;
        }
        AnchorTransData anchorTransData = (AnchorTransData) obj;
        return this.businessType == anchorTransData.businessType && o.LJ(this.anchorContent, anchorTransData.anchorContent) && o.LJ(this.title, anchorTransData.title) && o.LJ(this.anchorTag, anchorTransData.anchorTag) && o.LJ(this.source, anchorTransData.source) && o.LJ(this.id, anchorTransData.id) && o.LJ(this.anchorIcon, anchorTransData.anchorIcon) && this.canDelete == anchorTransData.canDelete && o.LJ(this.url, anchorTransData.url) && o.LJ(this.language, anchorTransData.language) && o.LJ(this.addTime, anchorTransData.addTime) && o.LJ(this.extra, anchorTransData.extra) && o.LJ(this.subtype, anchorTransData.subtype);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int LJ = C79062V1e.LJ(this.anchorContent, this.businessType * 31, 31);
        String str = this.title;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.anchorTag;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.source;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.id;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        UrlModel urlModel = this.anchorIcon;
        if (urlModel == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = urlModel.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        boolean z = this.canDelete;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        String str4 = this.url;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        String str5 = this.language;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        Long l = this.addTime;
        if (l == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        String str6 = this.extra;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int i12 = (i11 + hashCode9) * 31;
        String str7 = this.subtype;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i12 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnchorTransData(businessType=");
        sb.append(this.businessType);
        sb.append(", anchorContent=");
        sb.append(this.anchorContent);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", anchorTag=");
        sb.append(this.anchorTag);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", anchorIcon=");
        sb.append(this.anchorIcon);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", addTime=");
        sb.append(this.addTime);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", subtype=");
        return C07670Rv.LIZIZ(sb, this.subtype, ')');
    }

    public final Long getAddTime() {
        return this.addTime;
    }

    public final String getAnchorContent() {
        return this.anchorContent;
    }

    public final UrlModel getAnchorIcon() {
        return this.anchorIcon;
    }

    public final String getAnchorTag() {
        return this.anchorTag;
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getSource() {
        return this.source;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setAddTime(Long l) {
        this.addTime = l;
    }

    public final void setAnchorContent(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.anchorContent = str;
    }

    public final void setSubtype(String str) {
        this.subtype = str;
    }

    public AnchorTransData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4, String str5, Long l, String str6, String str7) {
        o.LJIIIZ(anchorContent, "anchorContent");
        this.businessType = i;
        this.anchorContent = anchorContent;
        this.title = str;
        this.anchorTag = str2;
        this.source = num;
        this.id = str3;
        this.anchorIcon = urlModel;
        this.canDelete = z;
        this.url = str4;
        this.language = str5;
        this.addTime = l;
        this.extra = str6;
        this.subtype = str7;
    }

    public /* synthetic */ AnchorTransData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : num, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? null : urlModel, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? "" : str5, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? Long.MAX_VALUE : l, (i2 & 2048) != 0 ? "" : str7, (i2 & 4096) == 0 ? str8 : "");
    }
}
