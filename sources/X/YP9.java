package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbw;

/* loaded from: classes16.dex */
public final class YP9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    str = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzbw(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbw[i];
    }
}
