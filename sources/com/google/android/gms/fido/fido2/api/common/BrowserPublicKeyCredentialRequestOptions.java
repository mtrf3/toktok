package com.google.android.gms.fido.fido2.api.common;

import X.C64363PNv;
import X.C68857R0r;
import X.C79057V0z;
import X.QH7;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new C68857R0r();
    public final PublicKeyCredentialRequestOptions zza;
    public final Uri zzb;
    public final byte[] zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        if (!C64363PNv.LIZ(this.zza, browserPublicKeyCredentialRequestOptions.zza) || !C64363PNv.LIZ(this.zzb, browserPublicKeyCredentialRequestOptions.zzb)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zza, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.zzb, i, false);
        C79057V0z.LJJLIIIJ(parcel, 4, this.zzc, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        boolean z;
        boolean z2;
        QH7.LJIIIIZZ(publicKeyCredentialRequestOptions);
        this.zza = publicKeyCredentialRequestOptions;
        QH7.LJIIIIZZ(uri);
        boolean z3 = true;
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        QH7.LIZ("origin scheme must be non-empty", z);
        if (uri.getAuthority() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        QH7.LIZ("origin authority must be non-empty", z2);
        this.zzb = uri;
        if (bArr != null && bArr.length != 32) {
            z3 = false;
        }
        QH7.LIZ("clientDataHash must be 32 bytes long", z3);
        this.zzc = bArr;
    }
}
