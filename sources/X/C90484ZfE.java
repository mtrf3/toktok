package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.zza;

/* renamed from: X.ZfE, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90484ZfE implements Parcelable.Creator<zza> {
    @Override // android.os.Parcelable.Creator
    public final zza createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zza(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i) {
        return new zza[i];
    }
}
