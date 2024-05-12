package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HBE implements Parcelable.Creator<PaidContentVideoModel> {
    @Override // android.os.Parcelable.Creator
    public final PaidContentVideoModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PaidContentVideoModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PaidContentVideoModel[] newArray(int i) {
        return new PaidContentVideoModel[i];
    }
}
