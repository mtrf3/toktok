package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GGK implements Parcelable.Creator<CommerceToolsTcmModel> {
    @Override // android.os.Parcelable.Creator
    public final CommerceToolsTcmModel createFromParcel(Parcel parcel) {
        boolean z;
        TCMPostPageSubmitTextModel createFromParcel;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = TCMPostPageSubmitTextModel.CREATOR.createFromParcel(parcel);
        }
        TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel = createFromParcel;
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
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
        String readString7 = parcel.readString();
        int readInt = parcel.readInt();
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        return new CommerceToolsTcmModel(z, readString, readString2, readString3, tCMPostPageSubmitTextModel, readString4, readString5, readString6, z2, z3, z4, readString7, readInt, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final CommerceToolsTcmModel[] newArray(int i) {
        return new CommerceToolsTcmModel[i];
    }
}
