package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AvatarUpdateInfoStruct;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GL6 implements Parcelable.Creator<ChangeAvatarModel> {
    @Override // android.os.Parcelable.Creator
    public final ChangeAvatarModel createFromParcel(Parcel parcel) {
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
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
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
        return new ChangeAvatarModel(z, z2, readString, readString2, z3, z4, parcel.readString(), AvatarUpdateInfoStruct.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ChangeAvatarModel[] newArray(int i) {
        return new ChangeAvatarModel[i];
    }
}
