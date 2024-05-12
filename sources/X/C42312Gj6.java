package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import kotlin.jvm.internal.o;

/* renamed from: X.Gj6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42312Gj6 implements Parcelable.Creator<RecommendHashtag> {
    @Override // android.os.Parcelable.Creator
    public final RecommendHashtag createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new RecommendHashtag(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final RecommendHashtag[] newArray(int i) {
        return new RecommendHashtag[i];
    }
}
