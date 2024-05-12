package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HHi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43810HHi implements Parcelable.Creator<AutoCutMediaModel> {
    @Override // android.os.Parcelable.Creator
    public final AutoCutMediaModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new AutoCutMediaModel(readString, readString2, readInt, readInt2, z, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readFloat(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final AutoCutMediaModel[] newArray(int i) {
        return new AutoCutMediaModel[i];
    }
}
