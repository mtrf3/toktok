package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zax;

/* renamed from: X.QkV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67879QkV implements Parcelable.Creator<zax> {
    @Override // android.os.Parcelable.Creator
    public final zax createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            scopeArr = (Scope[]) C67315QbP.LJIIJ(parcel, readInt, Scope.CREATOR);
                        }
                    } else {
                        i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    }
                } else {
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zax(i, i2, i3, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zax[] newArray(int i) {
        return new zax[i];
    }
}
