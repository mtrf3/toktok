package com.ss.android.ugc.aweme.cutsame;

import X.C43588H8u;
import X.C45121HnJ;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CutSameVideo extends F9E implements Parcelable {
    public static final Parcelable.Creator<CutSameVideo> CREATOR = new C45121HnJ();

    @InterfaceC65349Pkn("cover_uri")
    public final String coverUri;

    @InterfaceC65349Pkn("cover_url")
    public final String coverUrl;

    @InterfaceC65349Pkn("video_uri")
    public final String videoUri;

    @InterfaceC65349Pkn("video_url")
    public final String videoUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public CutSameVideo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.videoUri, this.videoUrl, this.coverUri, this.coverUrl};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.videoUri);
        out.writeString(this.videoUrl);
        out.writeString(this.coverUri);
        out.writeString(this.coverUrl);
    }

    public CutSameVideo(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "videoUri", str2, "videoUrl", str3, "coverUri", str4, "coverUrl");
        this.videoUri = str;
        this.videoUrl = str2;
        this.coverUri = str3;
        this.coverUrl = str4;
    }

    public /* synthetic */ CutSameVideo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
