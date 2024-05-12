package com.ss.android.ugc.aweme.creative.model.audio;

import X.GPV;
import X.HH1;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.SongInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SongInfo implements Parcelable {
    public static final Parcelable.Creator<SongInfo> CREATOR = new Parcelable.Creator<SongInfo>() { // from class: X.6Lq
        @Override // android.os.Parcelable.Creator
        public final SongInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new SongInfo(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final SongInfo[] newArray(int i) {
            return new SongInfo[i];
        }
    };

    @GPV
    @InterfaceC65349Pkn("music_id")
    public final long musicId;

    @GPV
    @InterfaceC65349Pkn("name")
    public final String name;

    @GPV
    @InterfaceC65349Pkn("song_id")
    public final long songId;

    @GPV
    @InterfaceC65349Pkn("url")
    public final String url;

    @GPV
    @InterfaceC65349Pkn("vid")
    public final String vid;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SongInfo() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 31
            r0 = r10
            r4 = r3
            r5 = r3
            r6 = r1
            r9 = r3
            r0.<init>(r1, r3, r4, r5, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.audio.SongInfo.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.songId);
        out.writeString(this.name);
        out.writeString(this.vid);
        out.writeString(this.url);
        out.writeLong(this.musicId);
    }

    public SongInfo(long j, String str, String str2, String str3, long j2) {
        HH1.LIZ(str, "name", str2, "vid", str3, "url");
        this.songId = j;
        this.name = str;
        this.vid = str2;
        this.url = str3;
        this.musicId = j2;
    }

    public /* synthetic */ SongInfo(long j, String str, String str2, String str3, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? 0L : j2);
    }
}
