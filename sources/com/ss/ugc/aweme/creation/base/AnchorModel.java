package com.ss.ugc.aweme.creation.base;

import X.HIO;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AnchorModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AnchorModel> CREATOR = new HIO();

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("fixed")
    public Boolean fixed;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("keyword")
    public String keyword;

    @InterfaceC65349Pkn("language")
    public String language;

    @InterfaceC65349Pkn("sub_type")
    public String subType;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("url")
    public String url;

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorModel() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.type);
        parcel.writeString(this.subType);
        parcel.writeString(this.keyword);
        parcel.writeString(this.url);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.language);
        parcel.writeString(this.content);
        parcel.writeString(this.extra);
        Boolean bool = this.fixed;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Boolean getFixed() {
        return this.fixed;
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

    public final String getSubType() {
        return this.subType;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFixed(Boolean bool) {
        this.fixed = bool;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setSubType(String str) {
        this.subType = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public AnchorModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.type = i;
        this.subType = str;
        this.keyword = str2;
        this.url = str3;
        this.iconUrl = str4;
        this.language = str5;
        this.content = str6;
        this.extra = str7;
        this.fixed = bool;
    }

    public /* synthetic */ AnchorModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : str7, (i2 & 256) == 0 ? bool : null);
    }
}
