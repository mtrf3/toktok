package com.ss.ugc.android.editor.base.data;

import X.C36446ESc;
import X.C43588H8u;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CoverUrl extends F9E implements Parcelable {
    public static final Parcelable.Creator<CoverUrl> CREATOR = new C36446ESc();
    public String cover_hd;
    public String cover_large;
    public String cover_medium;
    public String cover_thumb;

    /* JADX WARN: Multi-variable type inference failed */
    public CoverUrl() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CoverUrl copy$default(CoverUrl coverUrl, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coverUrl.cover_hd;
        }
        if ((i & 2) != 0) {
            str2 = coverUrl.cover_thumb;
        }
        if ((i & 4) != 0) {
            str3 = coverUrl.cover_medium;
        }
        if ((i & 8) != 0) {
            str4 = coverUrl.cover_large;
        }
        return coverUrl.copy(str, str2, str3, str4);
    }

    public final CoverUrl copy(String cover_hd, String cover_thumb, String cover_medium, String cover_large) {
        o.LJIIIZ(cover_hd, "cover_hd");
        o.LJIIIZ(cover_thumb, "cover_thumb");
        o.LJIIIZ(cover_medium, "cover_medium");
        o.LJIIIZ(cover_large, "cover_large");
        return new CoverUrl(cover_hd, cover_thumb, cover_medium, cover_large);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.cover_hd, this.cover_thumb, this.cover_medium, this.cover_large};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.cover_hd);
        out.writeString(this.cover_thumb);
        out.writeString(this.cover_medium);
        out.writeString(this.cover_large);
    }

    public final String getCover_hd() {
        return this.cover_hd;
    }

    public final String getCover_large() {
        return this.cover_large;
    }

    public final String getCover_medium() {
        return this.cover_medium;
    }

    public final String getCover_thumb() {
        return this.cover_thumb;
    }

    public final void setCover_hd(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.cover_hd = str;
    }

    public final void setCover_large(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.cover_large = str;
    }

    public final void setCover_medium(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.cover_medium = str;
    }

    public final void setCover_thumb(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.cover_thumb = str;
    }

    public CoverUrl(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "cover_hd", str2, "cover_thumb", str3, "cover_medium", str4, "cover_large");
        this.cover_hd = str;
        this.cover_thumb = str2;
        this.cover_medium = str3;
        this.cover_large = str4;
    }

    public /* synthetic */ CoverUrl(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
