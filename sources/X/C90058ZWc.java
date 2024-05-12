package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.LaunchOptions;

/* renamed from: X.ZWc, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90058ZWc implements Parcelable.Creator<LaunchOptions> {
    @Override // android.os.Parcelable.Creator
    public final LaunchOptions createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        boolean z = false;
        String str = null;
        CredentialsData credentialsData = null;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            credentialsData = (CredentialsData) C67315QbP.LJI(parcel, readInt, CredentialsData.CREATOR);
                        }
                    } else {
                        z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    }
                } else {
                    str = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                z = C67315QbP.LJIILIIL(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new LaunchOptions(z, str, z2, credentialsData);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LaunchOptions[] newArray(int i) {
        return new LaunchOptions[i];
    }
}
