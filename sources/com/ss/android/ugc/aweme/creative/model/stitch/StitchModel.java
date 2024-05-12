package com.ss.android.ugc.aweme.creative.model.stitch;

import X.C41564GSy;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StitchModel implements Parcelable {
    public static final Parcelable.Creator<StitchModel> CREATOR = new C41564GSy();

    @InterfaceC65349Pkn("stitch_author")
    public StitchUser stitchAuthor;

    @InterfaceC65349Pkn("video_id")
    public String videoId;

    /* JADX WARN: Multi-variable type inference failed */
    public StitchModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchModel)) {
            return false;
        }
        StitchModel stitchModel = (StitchModel) obj;
        return o.LJ(this.stitchAuthor, stitchModel.stitchAuthor) && o.LJ(this.videoId, stitchModel.videoId);
    }

    public final int hashCode() {
        StitchUser stitchUser = this.stitchAuthor;
        int hashCode = (stitchUser == null ? 0 : stitchUser.hashCode()) * 31;
        String str = this.videoId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        StitchUser stitchUser = this.stitchAuthor;
        if (stitchUser == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            stitchUser.writeToParcel(out, i);
        }
        out.writeString(this.videoId);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StitchModel(stitchAuthor=");
        LIZ.append(this.stitchAuthor);
        LIZ.append(", videoId=");
        return q.LIZIZ(LIZ, this.videoId, ')', LIZ);
    }

    public StitchModel(StitchUser stitchUser, String str) {
        this.stitchAuthor = stitchUser;
        this.videoId = str;
    }

    public /* synthetic */ StitchModel(StitchUser stitchUser, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stitchUser, (i & 2) != 0 ? null : str);
    }
}
