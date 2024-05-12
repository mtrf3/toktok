package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import kotlin.jvm.internal.o;

/* renamed from: X.I8v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46137I8v implements Parcelable.Creator<ReuseSoundAndEffectModel> {
    @Override // android.os.Parcelable.Creator
    public final ReuseSoundAndEffectModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
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
        return new ReuseSoundAndEffectModel(readString, readString2, readInt, readInt2, z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final ReuseSoundAndEffectModel[] newArray(int i) {
        return new ReuseSoundAndEffectModel[i];
    }
}
