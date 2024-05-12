package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.zzap;
import com.google.android.gms.cast.zzar;

/* renamed from: X.ZWl, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90067ZWl implements Parcelable.Creator<zzar> {
    @Override // android.os.Parcelable.Creator
    public final zzar createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        zzap zzapVar = null;
        zzap zzapVar2 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    zzapVar2 = (zzap) C67315QbP.LJI(parcel, readInt, zzap.CREATOR);
                }
            } else {
                zzapVar = (zzap) C67315QbP.LJI(parcel, readInt, zzap.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzar(zzapVar, zzapVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzar[] newArray(int i) {
        return new zzar[i];
    }
}
