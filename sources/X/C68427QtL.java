package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import java.util.ArrayList;

/* renamed from: X.QtL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68427QtL implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        Bundle bundle = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                if (c != 2) {
                    C67315QbP.LJJII(parcel, readInt);
                } else {
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, RetrieveBytesResponse.BlockstoreData.CREATOR);
                }
            } else {
                bundle = C67315QbP.LIZIZ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new RetrieveBytesResponse(bundle, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RetrieveBytesResponse[i];
    }
}
