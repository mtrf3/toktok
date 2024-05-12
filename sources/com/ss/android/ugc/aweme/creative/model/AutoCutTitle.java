package com.ss.android.ugc.aweme.creative.model;

import X.C45053HmD;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoCutTitle implements Parcelable {
    public static final Parcelable.Creator<AutoCutTitle> CREATOR = new C45053HmD();

    @InterfaceC65349Pkn("autocut_actual_caption_location")
    public final String actualCaptionLocation;

    @InterfaceC65349Pkn("autocut_caption")
    public final String caption;

    @InterfaceC65349Pkn("autocut_caption_font_id")
    public final String captionFontId;

    @InterfaceC65349Pkn("autocut_origin_caption_location")
    public final String originCaptionLocation;

    /* JADX WARN: Multi-variable type inference failed */
    public AutoCutTitle() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutTitle)) {
            return false;
        }
        AutoCutTitle autoCutTitle = (AutoCutTitle) obj;
        return o.LJ(this.caption, autoCutTitle.caption) && o.LJ(this.captionFontId, autoCutTitle.captionFontId) && o.LJ(this.originCaptionLocation, autoCutTitle.originCaptionLocation) && o.LJ(this.actualCaptionLocation, autoCutTitle.actualCaptionLocation);
    }

    public final int hashCode() {
        String str = this.caption;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.captionFontId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originCaptionLocation;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actualCaptionLocation;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.caption);
        out.writeString(this.captionFontId);
        out.writeString(this.originCaptionLocation);
        out.writeString(this.actualCaptionLocation);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTitle(caption=");
        LIZ.append(this.caption);
        LIZ.append(", captionFontId=");
        LIZ.append(this.captionFontId);
        LIZ.append(", originCaptionLocation=");
        LIZ.append(this.originCaptionLocation);
        LIZ.append(", actualCaptionLocation=");
        return q.LIZIZ(LIZ, this.actualCaptionLocation, ')', LIZ);
    }

    public AutoCutTitle(String str, String str2, String str3, String str4) {
        this.caption = str;
        this.captionFontId = str2;
        this.originCaptionLocation = str3;
        this.actualCaptionLocation = str4;
    }

    public /* synthetic */ AutoCutTitle(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
