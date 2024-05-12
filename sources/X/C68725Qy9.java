package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.InstrumentInfo;

/* renamed from: X.Qy9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68725Qy9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        i = C67315QbP.LJIJJLI(parcel, readInt);
                    }
                } else {
                    str2 = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new InstrumentInfo(str, str2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InstrumentInfo[i];
    }
}
