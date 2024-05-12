package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;

/* renamed from: X.Qjw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67844Qjw implements Parcelable.Creator<Feature> {
    @Override // android.os.Parcelable.Creator
    public final Feature createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        j = C67315QbP.LJJ(parcel, readInt);
                    }
                } else {
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                }
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new Feature(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Feature[] newArray(int i) {
        return new Feature[i];
    }
}
