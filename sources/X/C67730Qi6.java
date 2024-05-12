package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: X.Qi6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67730Qi6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1000) {
                switch (c) {
                    case 1:
                        z = C67315QbP.LJIILIIL(parcel, readInt);
                        break;
                    case 2:
                        strArr = C67315QbP.LJIIIIZZ(parcel, readInt);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) C67315QbP.LJI(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) C67315QbP.LJI(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = C67315QbP.LJIILIIL(parcel, readInt);
                        break;
                    case 6:
                        str = C67315QbP.LJII(parcel, readInt);
                        break;
                    case 7:
                        str2 = C67315QbP.LJII(parcel, readInt);
                        break;
                    case '\b':
                        z3 = C67315QbP.LJIILIIL(parcel, readInt);
                        break;
                    default:
                        C67315QbP.LJJII(parcel, readInt);
                        break;
                }
            } else {
                i = C67315QbP.LJIJJLI(parcel, readInt);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CredentialRequest(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialRequest[i];
    }
}
