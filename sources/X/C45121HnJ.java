package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.cutsame.CutSameVideo;
import kotlin.jvm.internal.o;

/* renamed from: X.HnJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45121HnJ implements Parcelable.Creator<CutSameVideo> {
    @Override // android.os.Parcelable.Creator
    public final CutSameVideo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CutSameVideo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CutSameVideo[] newArray(int i) {
        return new CutSameVideo[i];
    }
}
