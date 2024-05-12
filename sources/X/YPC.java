package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class YPC implements Parcelable.Creator<UserAddressRequest> {
    @Override // android.os.Parcelable.Creator
    public final UserAddressRequest createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                arrayList = C67315QbP.LJIIJJI(parcel, readInt, CountrySpecification.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new UserAddressRequest(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UserAddressRequest[] newArray(int i) {
        return new UserAddressRequest[i];
    }
}
