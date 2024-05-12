package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import java.util.HashSet;

/* renamed from: X.QbS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67318QbS implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        HashSet hashSet = new HashSet();
        zzw zzwVar = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                str3 = C67315QbP.LJII(parcel, readInt);
                                hashSet.add(5);
                            }
                        } else {
                            str2 = C67315QbP.LJII(parcel, readInt);
                            hashSet.add(4);
                        }
                    } else {
                        str = C67315QbP.LJII(parcel, readInt);
                        hashSet.add(3);
                    }
                } else {
                    zzwVar = (zzw) C67315QbP.LJI(parcel, readInt, zzw.CREATOR);
                    hashSet.add(2);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
                hashSet.add(1);
            }
        }
        if (parcel.dataPosition() == LJJIII) {
            return new zzu(hashSet, i, zzwVar, str, str2, str3);
        }
        throw new C67308QbI(C64.LIZIZ("Overread allowed size end=", LJJIII), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
