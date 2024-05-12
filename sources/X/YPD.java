package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;

/* loaded from: classes16.dex */
public final class YPD implements Parcelable.Creator<CountrySpecification> {
    @Override // android.os.Parcelable.Creator
    public final CountrySpecification createFromParcel(Parcel parcel) {
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
        return new CountrySpecification(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CountrySpecification[] newArray(int i) {
        return new CountrySpecification[i];
    }
}
