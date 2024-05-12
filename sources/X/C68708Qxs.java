package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import java.util.ArrayList;

/* renamed from: X.Qxs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68708Qxs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                arrayList = C67315QbP.LJIIIZ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new ShippingAddressRequirements(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ShippingAddressRequirements[i];
    }
}
