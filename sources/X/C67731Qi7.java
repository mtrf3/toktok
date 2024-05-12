package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;

/* renamed from: X.Qi7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67731Qi7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 1000) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                i = C67315QbP.LJIJJLI(parcel, readInt);
                            }
                        } else {
                            i2 = C67315QbP.LJIJJLI(parcel, readInt);
                        }
                    } else {
                        z3 = C67315QbP.LJIILIIL(parcel, readInt);
                    }
                } else {
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                }
            } else {
                z = C67315QbP.LJIILIIL(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CredentialPickerConfig(z, z2, i, i2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
