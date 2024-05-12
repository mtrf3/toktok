package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8L implements Parcelable.Creator<CommonMobParamModel> {
    @Override // android.os.Parcelable.Creator
    public final CommonMobParamModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new CommonMobParamModel(z, readString, z2, readString2, z3, readString3, readString4, z4, parcel.readString(), parcel.readString(), EditDescMobModel.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final CommonMobParamModel[] newArray(int i) {
        return new CommonMobParamModel[i];
    }
}
