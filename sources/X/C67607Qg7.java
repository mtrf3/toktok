package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;

/* renamed from: X.Qg7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67607Qg7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 2:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    bArr = C67315QbP.LIZJ(parcel, readInt);
                    break;
                case 4:
                    bArr2 = C67315QbP.LIZJ(parcel, readInt);
                    break;
                case 5:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 6:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new FidoCredentialDetails(str, str2, bArr, bArr2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FidoCredentialDetails[i];
    }
}
