package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbqo;

/* loaded from: classes16.dex */
public final class YPA implements Parcelable.Creator<zzbqo> {
    @Override // android.os.Parcelable.Creator
    public final zzbqo createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        str2 = C67315QbP.LJII(parcel, readInt);
                    }
                } else {
                    str = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzbqo(i, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbqo[] newArray(int i) {
        return new zzbqo[i];
    }
}
