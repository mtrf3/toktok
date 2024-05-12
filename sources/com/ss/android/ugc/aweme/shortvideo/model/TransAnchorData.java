package com.ss.android.ugc.aweme.shortvideo.model;

import X.C05040Hs;
import X.C07670Rv;
import X.C1FJ;
import X.C47261Igj;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TransAnchorData implements Parcelable {

    @InterfaceC65349Pkn("add_time")
    public final Long addTime;

    @InterfaceC65349Pkn("anchor_content")
    public final String anchorContent;

    @InterfaceC65349Pkn("anchor_icon")
    public final UrlModel anchorIcon;

    @InterfaceC65349Pkn("anchor_tag")
    public final String anchorTag;

    @InterfaceC65349Pkn("business_type")
    public final int businessType;

    @InterfaceC65349Pkn("can_delete")
    public final boolean canDelete;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("language")
    public final String language;

    @InterfaceC65349Pkn("source")
    public final Integer source;

    @InterfaceC65349Pkn("subtype")
    public final String subtype;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("url")
    public final String url;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<TransAnchorData> CREATOR = new Creator();

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<TransAnchorData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransAnchorData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new TransAnchorData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (UrlModel) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransAnchorData[] newArray(int i) {
            return new TransAnchorData[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent) {
        this(i, anchorContent, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8188, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent, String str) {
        this(i, anchorContent, str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8184, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent, String str, String str2) {
        this(i, anchorContent, str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8176, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent, String str, String str2, Integer num) {
        this(i, anchorContent, str, str2, num, null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8160, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent, String str, String str2, Integer num, String str3) {
        this(i, anchorContent, str, str2, num, str3, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8128, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel) {
        this(i, anchorContent, str, str2, num, str3, urlModel, false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8064, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z) {
        this(i, anchorContent, str, str2, num, str3, urlModel, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7936, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4) {
        this(i, anchorContent, str, str2, num, str3, urlModel, z, str4, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7680, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4, String str5) {
        this(i, anchorContent, str, str2, num, str3, urlModel, z, str4, str5, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7168, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4, String str5, Long l) {
        this(i, anchorContent, str, str2, num, str3, urlModel, z, str4, str5, l, null, 0 == true ? 1 : 0, 6144, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransAnchorData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4, String str5, Long l, String str6) {
        this(i, anchorContent, str, str2, num, str3, urlModel, z, str4, str5, l, str6, null, 4096, 0 == true ? 1 : 0);
        o.LJIIIZ(anchorContent, "anchorContent");
    }

    public static /* synthetic */ TransAnchorData copy$default(TransAnchorData transAnchorData, int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transAnchorData.businessType;
        }
        if ((i2 & 2) != 0) {
            str = transAnchorData.anchorContent;
        }
        if ((i2 & 4) != 0) {
            str2 = transAnchorData.title;
        }
        if ((i2 & 8) != 0) {
            str3 = transAnchorData.anchorTag;
        }
        if ((i2 & 16) != 0) {
            num = transAnchorData.source;
        }
        if ((i2 & 32) != 0) {
            str4 = transAnchorData.id;
        }
        if ((i2 & 64) != 0) {
            urlModel = transAnchorData.anchorIcon;
        }
        if ((i2 & 128) != 0) {
            z = transAnchorData.canDelete;
        }
        if ((i2 & 256) != 0) {
            str5 = transAnchorData.url;
        }
        if ((i2 & 512) != 0) {
            str6 = transAnchorData.language;
        }
        if ((i2 & 1024) != 0) {
            l = transAnchorData.addTime;
        }
        if ((i2 & 2048) != 0) {
            str7 = transAnchorData.extra;
        }
        if ((i2 & 4096) != 0) {
            str8 = transAnchorData.subtype;
        }
        return transAnchorData.copy(i, str, str2, str3, num, str4, urlModel, z, str5, str6, l, str7, str8);
    }

    public final TransAnchorData copy(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4, String str5, Long l, String str6, String str7) {
        o.LJIIIZ(anchorContent, "anchorContent");
        return new TransAnchorData(i, anchorContent, str, str2, num, str3, urlModel, z, str4, str5, l, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransAnchorData)) {
            return false;
        }
        TransAnchorData transAnchorData = (TransAnchorData) obj;
        return this.businessType == transAnchorData.businessType && o.LJ(this.anchorContent, transAnchorData.anchorContent) && o.LJ(this.title, transAnchorData.title) && o.LJ(this.anchorTag, transAnchorData.anchorTag) && o.LJ(this.source, transAnchorData.source) && o.LJ(this.id, transAnchorData.id) && o.LJ(this.anchorIcon, transAnchorData.anchorIcon) && this.canDelete == transAnchorData.canDelete && o.LJ(this.url, transAnchorData.url) && o.LJ(this.language, transAnchorData.language) && o.LJ(this.addTime, transAnchorData.addTime) && o.LJ(this.extra, transAnchorData.extra) && o.LJ(this.subtype, transAnchorData.subtype);
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
        StringBuilder sb = new StringBuilder("TransAnchorData(businessType=");
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

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final TransAnchorData transFromCreateAnchorInfo(CreateAnchorInfo anchorInfo) {
            boolean z;
            o.LJIIIZ(anchorInfo, "anchorInfo");
            int type = anchorInfo.getType();
            String content = anchorInfo.getContent();
            String keyword = anchorInfo.getKeyword();
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(C47261Igj.LJII(anchorInfo.getIconUrl()));
            urlModel.setUri(Uri.decode(anchorInfo.getIconUrl()));
            String url = anchorInfo.getUrl();
            String extra = anchorInfo.getExtra();
            Boolean canDelete = anchorInfo.getCanDelete();
            if (canDelete != null) {
                z = canDelete.booleanValue();
            } else {
                z = true;
            }
            return new TransAnchorData(type, content, keyword, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, urlModel, z, url, 0 == true ? 1 : 0, 0 == true ? 1 : 0, extra, 0 == true ? 1 : 0, 5688, 0 == true ? 1 : 0);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.businessType);
        out.writeString(this.anchorContent);
        out.writeString(this.title);
        out.writeString(this.anchorTag);
        Integer num = this.source;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.id);
        out.writeSerializable(this.anchorIcon);
        out.writeInt(this.canDelete ? 1 : 0);
        out.writeString(this.url);
        out.writeString(this.language);
        Long l = this.addTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.extra);
        out.writeString(this.subtype);
    }

    public TransAnchorData(int i, String anchorContent, String str, String str2, Integer num, String str3, UrlModel urlModel, boolean z, String str4, String str5, Long l, String str6, String str7) {
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

    public /* synthetic */ TransAnchorData(int i, String str, String str2, String str3, Integer num, String str4, UrlModel urlModel, boolean z, String str5, String str6, Long l, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : num, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? null : urlModel, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? "" : str5, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? Long.MAX_VALUE : l, (i2 & 2048) != 0 ? "" : str7, (i2 & 4096) == 0 ? str8 : "");
    }
}
