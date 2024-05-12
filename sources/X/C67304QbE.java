package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;

/* renamed from: X.QbE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67304QbE implements Parcelable.Creator<WebImage> {
    @Override // android.os.Parcelable.Creator
    public final WebImage createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        android.net.Uri uri = null;
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
                            i3 = C67315QbP.LJIJJLI(parcel, readInt);
                        }
                    } else {
                        i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    }
                } else {
                    uri = (android.net.Uri) C67315QbP.LJI(parcel, readInt, android.net.Uri.CREATOR);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new WebImage(i, uri, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WebImage[] newArray(int i) {
        return new WebImage[i];
    }
}
