package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HXD implements Parcelable.Creator<SharedARModel> {
    @Override // android.os.Parcelable.Creator
    public final SharedARModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new SharedARModel(readString, readString2, readString3, z, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final SharedARModel[] newArray(int i) {
        return new SharedARModel[i];
    }
}
