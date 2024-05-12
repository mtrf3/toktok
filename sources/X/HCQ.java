package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.SocialParametersModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCQ implements Parcelable.Creator<SocialParametersModel> {
    @Override // android.os.Parcelable.Creator
    public final SocialParametersModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new SocialParametersModel(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SocialParametersModel[] newArray(int i) {
        return new SocialParametersModel[i];
    }
}
