package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;

/* renamed from: X.Qz9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68787Qz9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        float f = 0.0f;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    f = C67315QbP.LJIJ(parcel, readInt);
                }
            } else {
                str = C67315QbP.LJII(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new StreetViewPanoramaLink(str, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLink[i];
    }
}
