package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* renamed from: X.Qyj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68761Qyj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    j2 = C67315QbP.LJJ(parcel, readInt);
                }
            } else {
                j = C67315QbP.LJJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new TimeInterval(j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TimeInterval[i];
    }
}