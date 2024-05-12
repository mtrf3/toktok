package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;

/* renamed from: X.QyX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68749QyX implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        boolean z = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C67315QbP.LJJII(parcel, readInt);
            } else {
                z = C67315QbP.LJIILIIL(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new AuthenticationExtensionsCredPropsOutputs(z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensionsCredPropsOutputs[i];
    }
}
