package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;

/* renamed from: X.R0o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68854R0o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        if (c != 5) {
                            C67315QbP.LJJII(parcel, readInt);
                        } else {
                            str3 = C67315QbP.LJII(parcel, readInt);
                        }
                    } else {
                        str2 = C67315QbP.LJII(parcel, readInt);
                    }
                } else {
                    str = C67315QbP.LJII(parcel, readInt);
                }
            } else {
                bArr = C67315QbP.LIZJ(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new PublicKeyCredentialUserEntity(str, str2, str3, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialUserEntity[i];
    }
}
