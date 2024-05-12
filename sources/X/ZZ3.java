package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.ImageHints;

/* loaded from: classes29.dex */
public final class ZZ3 implements Parcelable.Creator<ImageHints> {
    @Override // android.os.Parcelable.Creator
    public final ImageHints createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        C67315QbP.LJJII(parcel, readInt);
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
        return new ImageHints(i, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ImageHints[] newArray(int i) {
        return new ImageHints[i];
    }
}
