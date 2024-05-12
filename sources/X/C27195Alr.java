package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.TrackParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Alr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27195Alr implements Parcelable.Creator<TrackParams> {
    @Override // android.os.Parcelable.Creator
    public final TrackParams createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new TrackParams(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final TrackParams[] newArray(int i) {
        return new TrackParams[i];
    }
}
