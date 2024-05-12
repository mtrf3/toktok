package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.QbT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67319QbT implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        int i = 0;
        zzs zzsVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            zzsVar = (zzs) C67315QbP.LJI(parcel, readInt, zzs.CREATOR);
                            hashSet.add(4);
                        }
                    } else {
                        i2 = C67315QbP.LJIJJLI(parcel, readInt);
                        hashSet.add(3);
                    }
                } else {
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, zzu.CREATOR);
                    hashSet.add(2);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
                hashSet.add(1);
            }
        }
        if (parcel.dataPosition() == LJJIII) {
            return new zzo(hashSet, i, arrayList, i2, zzsVar);
        }
        throw new C67308QbI(C64.LIZIZ("Overread allowed size end=", LJJIII), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
