package com.ss.ugc.android.editor.base.data;

import X.C16880lQ;
import X.C36445ESb;
import X.C79062V1e;
import X.HH1;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MusicItem implements Parcelable {
    public static final Parcelable.Creator<MusicItem> CREATOR = new C36445ESb();
    public String author;
    public CoverUrl coverUrl;
    public int duration;
    public String fileName;
    public long id;
    public String musicUrs;
    public String previewUrl;
    public String title;
    public String uri;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicItem() {
        this(0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MusicItem copy$default(MusicItem musicItem, long j, String str, String str2, String str3, int i, String str4, CoverUrl coverUrl, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = musicItem.id;
        }
        if ((i2 & 2) != 0) {
            str = musicItem.title;
        }
        if ((i2 & 4) != 0) {
            str2 = musicItem.author;
        }
        if ((i2 & 8) != 0) {
            str3 = musicItem.uri;
        }
        if ((i2 & 16) != 0) {
            i = musicItem.duration;
        }
        if ((i2 & 32) != 0) {
            str4 = musicItem.previewUrl;
        }
        if ((i2 & 64) != 0) {
            coverUrl = musicItem.coverUrl;
        }
        if ((i2 & 128) != 0) {
            str5 = musicItem.fileName;
        }
        if ((i2 & 256) != 0) {
            str6 = musicItem.musicUrs;
        }
        return musicItem.copy(j, str, str2, str3, i, str4, coverUrl, str5, str6);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.uri;
    }

    public final int component5() {
        return this.duration;
    }

    public final String component6() {
        return this.previewUrl;
    }

    public final CoverUrl component7() {
        return this.coverUrl;
    }

    public final String component8() {
        return this.fileName;
    }

    public final MusicItem copy(long j, String title, String author, String uri, int i, String str, CoverUrl coverUrl, String str2, String str3) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(uri, "uri");
        return new MusicItem(j, title, author, uri, i, str, coverUrl, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicItem)) {
            return false;
        }
        MusicItem musicItem = (MusicItem) obj;
        return this.id == musicItem.id && o.LJ(this.title, musicItem.title) && o.LJ(this.author, musicItem.author) && o.LJ(this.uri, musicItem.uri) && this.duration == musicItem.duration && o.LJ(this.previewUrl, musicItem.previewUrl) && o.LJ(this.coverUrl, musicItem.coverUrl) && o.LJ(this.fileName, musicItem.fileName) && o.LJ(this.musicUrs, musicItem.musicUrs);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.id);
        out.writeString(this.title);
        out.writeString(this.author);
        out.writeString(this.uri);
        out.writeInt(this.duration);
        out.writeString(this.previewUrl);
        CoverUrl coverUrl = this.coverUrl;
        if (coverUrl == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            coverUrl.writeToParcel(out, i);
        }
        out.writeString(this.fileName);
        out.writeString(this.musicUrs);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = (C79062V1e.LJ(this.uri, C79062V1e.LJ(this.author, C79062V1e.LJ(this.title, C16880lQ.LLJIJIL(this.id) * 31, 31), 31), 31) + this.duration) * 31;
        String str = this.previewUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        CoverUrl coverUrl = this.coverUrl;
        if (coverUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = coverUrl.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.fileName;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.musicUrs;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicItem(id=");
        LIZ.append(this.id);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", author=");
        LIZ.append(this.author);
        LIZ.append(", uri=");
        LIZ.append(this.uri);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", previewUrl=");
        LIZ.append(this.previewUrl);
        LIZ.append(", coverUrl=");
        LIZ.append(this.coverUrl);
        LIZ.append(", fileName=");
        LIZ.append(this.fileName);
        LIZ.append(", musicUrs=");
        return q.LIZIZ(LIZ, this.musicUrs, ')', LIZ);
    }

    public final String getMusicUrs() {
        return this.musicUrs;
    }

    public final void setMusicUrs(String str) {
        this.musicUrs = str;
    }

    public MusicItem(long j, String str, String str2, String str3, int i, String str4, CoverUrl coverUrl, String str5, String str6) {
        HH1.LIZ(str, "title", str2, "author", str3, "uri");
        this.id = j;
        this.title = str;
        this.author = str2;
        this.uri = str3;
        this.duration = i;
        this.previewUrl = str4;
        this.coverUrl = coverUrl;
        this.fileName = str5;
        this.musicUrs = str6;
    }

    public /* synthetic */ MusicItem(long j, String str, String str2, String str3, int i, String str4, CoverUrl coverUrl, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? str4 : "", (i2 & 64) != 0 ? null : coverUrl, (i2 & 128) != 0 ? null : str5, (i2 & 256) == 0 ? str6 : null);
    }
}
