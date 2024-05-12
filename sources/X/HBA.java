package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HBA implements Parcelable.Creator<MicDataModel> {
    @Override // android.os.Parcelable.Creator
    public final MicDataModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        o.LJIIIZ(parcel, "parcel");
        float readFloat = parcel.readFloat();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new MicDataModel(readFloat, z, z2, z3, z4, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final MicDataModel[] newArray(int i) {
        return new MicDataModel[i];
    }
}
