package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HCS implements Parcelable.Creator<HighLightVideoParametersModel> {
    @Override // android.os.Parcelable.Creator
    public final HighLightVideoParametersModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new HighLightVideoParametersModel(readString, readString2, readString3, readString4, z, readString5, readString6, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final HighLightVideoParametersModel[] newArray(int i) {
        return new HighLightVideoParametersModel[i];
    }
}
