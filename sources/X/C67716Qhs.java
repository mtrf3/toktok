package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: X.Qhs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67716Qhs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
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
                        credentialPickerConfig = (CredentialPickerConfig) C67315QbP.LJI(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = C67315QbP.LJIILIIL(parcel, readInt);
                        break;
                    case 3:
                        z2 = C67315QbP.LJIILIIL(parcel, readInt);
                        break;
                    case 4:
                        strArr = C67315QbP.LJIIIIZZ(parcel, readInt);
                        break;
                    case 5:
                        z3 = C67315QbP.LJIILIIL(parcel, readInt);
                        break;
                    case 6:
                        str = C67315QbP.LJII(parcel, readInt);
                        break;
                    case 7:
                        str2 = C67315QbP.LJII(parcel, readInt);
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
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
