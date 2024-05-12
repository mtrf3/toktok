package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StrokeStyle;

/* renamed from: X.Qyy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68776Qyy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        StampStyle stampStyle = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            if (c != 6) {
                                C67315QbP.LJJII(parcel, readInt);
                            } else {
                                stampStyle = (StampStyle) C67315QbP.LJI(parcel, readInt, StampStyle.CREATOR);
                            }
                        } else {
                            z = C67315QbP.LJIILIIL(parcel, readInt);
                        }
                    } else {
                        i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    }
                } else {
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                }
            } else {
                f = C67315QbP.LJIJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new StrokeStyle(f, i, i2, z, stampStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StrokeStyle[i];
    }
}
