package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H6i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43524H6i implements Parcelable.Creator<DMMediaModel> {
    @Override // android.os.Parcelable.Creator
    public final DMMediaModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new DMMediaModel(readInt, readString, readString2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final DMMediaModel[] newArray(int i) {
        return new DMMediaModel[i];
    }
}
