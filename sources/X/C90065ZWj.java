package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.zzap;

/* renamed from: X.ZWj, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90065ZWj implements Parcelable.Creator<zzap> {
    @Override // android.os.Parcelable.Creator
    public final zzap createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        f3 = C67315QbP.LJIJ(parcel, readInt);
                    }
                } else {
                    f2 = C67315QbP.LJIJ(parcel, readInt);
                }
            } else {
                f = C67315QbP.LJIJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzap(f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzap[] newArray(int i) {
        return new zzap[i];
    }
}
