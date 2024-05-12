package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CredentialsData;

/* renamed from: X.ZWh, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90063ZWh implements Parcelable.Creator<CredentialsData> {
    @Override // android.os.Parcelable.Creator
    public final CredentialsData createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    str2 = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CredentialsData(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialsData[] newArray(int i) {
        return new CredentialsData[i];
    }
}
