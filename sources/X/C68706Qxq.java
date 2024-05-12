package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CardRequirements;
import java.util.ArrayList;

/* renamed from: X.Qxq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68706Qxq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList<Integer> arrayList = null;
        boolean z = false;
        int i = 0;
        boolean z2 = true;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            i = C67315QbP.LJIJJLI(parcel, readInt);
                        }
                    } else {
                        z = C67315QbP.LJIILIIL(parcel, readInt);
                    }
                } else {
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                }
            } else {
                arrayList = C67315QbP.LJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CardRequirements(arrayList, z2, z, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CardRequirements[i];
    }
}
