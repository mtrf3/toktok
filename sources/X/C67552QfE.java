package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import java.util.ArrayList;

/* renamed from: X.QfE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67552QfE implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                arrayList = C67315QbP.LJIIJJI(parcel, readInt, UvmEntry.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new UvmEntries(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UvmEntries[i];
    }
}
