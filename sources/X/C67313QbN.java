package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zan;
import java.util.ArrayList;

/* renamed from: X.QbN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67313QbN implements Parcelable.Creator<zan> {
    @Override // android.os.Parcelable.Creator
    public final zan createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        int i = 0;
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        str = C67315QbP.LJII(parcel, readInt);
                    }
                } else {
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, zal.CREATOR);
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zan(i, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zan[] newArray(int i) {
        return new zan[i];
    }
}
