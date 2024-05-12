package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import kotlin.jvm.internal.o;

/* renamed from: X.Gwb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43149Gwb implements Parcelable.Creator<BeautyMetadata> {
    @Override // android.os.Parcelable.Creator
    public final BeautyMetadata createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new BeautyMetadata(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final BeautyMetadata[] newArray(int i) {
        return new BeautyMetadata[i];
    }
}
