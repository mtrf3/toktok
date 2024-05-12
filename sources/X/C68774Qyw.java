package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Qyw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68774Qyw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        C68772Qyu c68772Qyu = null;
        IBinder iBinder = null;
        Float f = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        f = C67315QbP.LJIJI(parcel, readInt);
                    }
                } else {
                    iBinder = C67315QbP.LJIJJ(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        if (iBinder != null) {
            c68772Qyu = new C68772Qyu(AbstractBinderC68227Qq7.LLJI(iBinder));
        }
        return new com.google.android.gms.maps.model.Cap(i, c68772Qyu, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new com.google.android.gms.maps.model.Cap[i];
    }
}
