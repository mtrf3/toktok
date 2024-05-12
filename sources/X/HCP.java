package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCP implements Parcelable.Creator<ProfileParametersModel> {
    @Override // android.os.Parcelable.Creator
    public final ProfileParametersModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new ProfileParametersModel(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ProfileParametersModel[] newArray(int i) {
        return new ProfileParametersModel[i];
    }
}
