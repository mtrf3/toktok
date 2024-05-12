package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* renamed from: X.R0r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68857R0r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        android.net.Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        C67315QbP.LJJII(parcel, readInt);
                    } else {
                        bArr = C67315QbP.LIZJ(parcel, readInt);
                    }
                } else {
                    uri = (android.net.Uri) C67315QbP.LJI(parcel, readInt, android.net.Uri.CREATOR);
                }
            } else {
                publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) C67315QbP.LJI(parcel, readInt, PublicKeyCredentialRequestOptions.CREATOR);
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserPublicKeyCredentialRequestOptions[i];
    }
}
