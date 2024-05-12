package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.internal.p000authapi.zbu;

/* renamed from: X.QmQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67998QmQ implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                credential = (Credential) C67315QbP.LJI(parcel, readInt, Credential.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zbu(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zbu[i];
    }
}
