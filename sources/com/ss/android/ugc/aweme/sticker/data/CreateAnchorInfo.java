package com.ss.android.ugc.aweme.sticker.data;

import X.C05040Hs;
import X.C08880Wm;
import X.C1FL;
import X.C42889GsP;
import X.C43588H8u;
import X.C79062V1e;
import X.G9W;
import X.HH1;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreateAnchorInfo implements Serializable, Parcelable {
    public Long addTime;
    public final Boolean canDelete;
    public final String content;
    public final boolean display;
    public final String extra;
    public String iconUrl;
    public final String keyword;
    public final String language;
    public final String subtype;

    @InterfaceC65349Pkn("third_id")
    public String thirdId;

    @InterfaceC65349Pkn("time")
    public String time;
    public final int type;
    public final String url;
    public static final C42889GsP Companion = new C42889GsP();
    public static final Parcelable.Creator<CreateAnchorInfo> CREATOR = new G9W();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAnchorInfo(int i, String keyword, String content) {
        this(i, keyword, null, 0 == true ? 1 : 0, content, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 8172, 0 == true ? 1 : 0);
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(content, "content");
    }

    public static /* synthetic */ CreateAnchorInfo copy$default(CreateAnchorInfo createAnchorInfo, int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = createAnchorInfo.type;
        }
        if ((i2 & 2) != 0) {
            str = createAnchorInfo.keyword;
        }
        if ((i2 & 4) != 0) {
            str2 = createAnchorInfo.url;
        }
        if ((i2 & 8) != 0) {
            str3 = createAnchorInfo.language;
        }
        if ((i2 & 16) != 0) {
            str4 = createAnchorInfo.content;
        }
        if ((i2 & 32) != 0) {
            str5 = createAnchorInfo.iconUrl;
        }
        if ((i2 & 64) != 0) {
            l = createAnchorInfo.addTime;
        }
        if ((i2 & 128) != 0) {
            str6 = createAnchorInfo.extra;
        }
        if ((i2 & 256) != 0) {
            str7 = createAnchorInfo.thirdId;
        }
        if ((i2 & 512) != 0) {
            str8 = createAnchorInfo.time;
        }
        if ((i2 & 1024) != 0) {
            str9 = createAnchorInfo.subtype;
        }
        if ((i2 & 2048) != 0) {
            bool = createAnchorInfo.canDelete;
        }
        if ((i2 & 4096) != 0) {
            z = createAnchorInfo.display;
        }
        return createAnchorInfo.copy(i, str, str2, str3, str4, str5, l, str6, str7, str8, str9, bool, z);
    }

    public final CreateAnchorInfo copy(int i, String keyword, String url, String language, String content, String str, Long l, String str2, String thirdId, String time, String str3, Boolean bool, boolean z) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(thirdId, "thirdId");
        o.LJIIIZ(time, "time");
        return new CreateAnchorInfo(i, keyword, url, language, content, str, l, str2, thirdId, time, str3, bool, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAnchorInfo)) {
            return false;
        }
        CreateAnchorInfo createAnchorInfo = (CreateAnchorInfo) obj;
        return this.type == createAnchorInfo.type && o.LJ(this.keyword, createAnchorInfo.keyword) && o.LJ(this.url, createAnchorInfo.url) && o.LJ(this.language, createAnchorInfo.language) && o.LJ(this.content, createAnchorInfo.content) && o.LJ(this.iconUrl, createAnchorInfo.iconUrl) && o.LJ(this.addTime, createAnchorInfo.addTime) && o.LJ(this.extra, createAnchorInfo.extra) && o.LJ(this.thirdId, createAnchorInfo.thirdId) && o.LJ(this.time, createAnchorInfo.time) && o.LJ(this.subtype, createAnchorInfo.subtype) && o.LJ(this.canDelete, createAnchorInfo.canDelete) && this.display == createAnchorInfo.display;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = C79062V1e.LJ(this.content, C79062V1e.LJ(this.language, C79062V1e.LJ(this.url, C79062V1e.LJ(this.keyword, this.type * 31, 31), 31), 31), 31);
        String str = this.iconUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Long l = this.addTime;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.extra;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.time, C79062V1e.LJ(this.thirdId, (i3 + hashCode3) * 31, 31), 31);
        String str3 = this.subtype;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (LJ2 + hashCode4) * 31;
        Boolean bool = this.canDelete;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i5 = (i4 + i) * 31;
        boolean z = this.display;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        return i5 + i6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreateAnchorInfo(type=");
        sb.append(this.type);
        sb.append(", keyword=");
        sb.append(this.keyword);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", addTime=");
        sb.append(this.addTime);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", thirdId=");
        sb.append(this.thirdId);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", canDelete=");
        sb.append(this.canDelete);
        sb.append(", display=");
        return C08880Wm.LIZJ(sb, this.display, ')');
    }

    public final Long getAddTime() {
        return this.addTime;
    }

    public final Boolean getCanDelete() {
        return this.canDelete;
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean getDisplay() {
        return this.display;
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

    public final String getThirdId() {
        return this.thirdId;
    }

    public final String getTime() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setAddTime(Long l) {
        this.addTime = l;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setThirdId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.thirdId = str;
    }

    public final void setTime(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.time = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.type);
        out.writeString(this.keyword);
        out.writeString(this.url);
        out.writeString(this.language);
        out.writeString(this.content);
        out.writeString(this.iconUrl);
        Long l = this.addTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.extra);
        out.writeString(this.thirdId);
        out.writeString(this.time);
        out.writeString(this.subtype);
        Boolean bool = this.canDelete;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeInt(this.display ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAnchorInfo(int i, String str, String str2, String str3) {
        this(i, str, str2, null, str3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 8168, 0 == true ? 1 : 0);
        HH1.LIZ(str, "keyword", str2, "url", str3, "content");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4) {
        this(i, str, str2, str3, str4, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 8160, 0 == true ? 1 : 0);
        C43588H8u.LIZLLL(str, "keyword", str2, "url", str3, "language", str4, "content");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5) {
        this(i, str, str2, str3, str4, str5, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 8128, 0 == true ? 1 : 0);
        C43588H8u.LIZLLL(str, "keyword", str2, "url", str3, "language", str4, "content");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l) {
        this(i, str, str2, str3, str4, str5, l, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 8064, 0 == true ? 1 : 0);
        C43588H8u.LIZLLL(str, "keyword", str2, "url", str3, "language", str4, "content");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6) {
        this(i, str, str2, str3, str4, str5, l, str6, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 7936, 0 == true ? 1 : 0);
        C43588H8u.LIZLLL(str, "keyword", str2, "url", str3, "language", str4, "content");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAnchorInfo(int i, String keyword, String url, String language, String content, String str, Long l, String str2, String thirdId) {
        this(i, keyword, url, language, content, str, l, str2, thirdId, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 7680, 0 == true ? 1 : 0);
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(thirdId, "thirdId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAnchorInfo(int i, String keyword, String url, String language, String content, String str, Long l, String str2, String thirdId, String time) {
        this(i, keyword, url, language, content, str, l, str2, thirdId, time, null, 0 == true ? 1 : 0, false, 7168, 0 == true ? 1 : 0);
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(thirdId, "thirdId");
        o.LJIIIZ(time, "time");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAnchorInfo(int i, String keyword, String url, String language, String content, String str, Long l, String str2, String thirdId, String time, String str3) {
        this(i, keyword, url, language, content, str, l, str2, thirdId, time, str3, null, false, 6144, 0 == true ? 1 : 0);
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(thirdId, "thirdId");
        o.LJIIIZ(time, "time");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateAnchorInfo(int i, String keyword, String url, String language, String content, String str, Long l, String str2, String thirdId, String time, String str3, Boolean bool) {
        this(i, keyword, url, language, content, str, l, str2, thirdId, time, str3, bool, false, 4096, null);
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(thirdId, "thirdId");
        o.LJIIIZ(time, "time");
    }

    public CreateAnchorInfo(int i, String keyword, String url, String language, String content, String str, Long l, String str2, String thirdId, String time, String str3, Boolean bool, boolean z) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(thirdId, "thirdId");
        o.LJIIIZ(time, "time");
        this.type = i;
        this.keyword = keyword;
        this.url = url;
        this.language = language;
        this.content = content;
        this.iconUrl = str;
        this.addTime = l;
        this.extra = str2;
        this.thirdId = thirdId;
        this.time = time;
        this.subtype = str3;
        this.canDelete = bool;
        this.display = z;
    }

    public /* synthetic */ CreateAnchorInfo(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, Boolean bool, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? Long.valueOf(SystemClock.elapsedRealtime()) : l, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) == 0 ? str9 : "", (i2 & 2048) != 0 ? Boolean.TRUE : bool, (i2 & 4096) != 0 ? true : z);
    }
}
