package com.google.android.gms.fido.fido2.api.common;

import X.C62819Ol5;
import X.C68738QyM;
import X.C79057V0z;
import X.G0D;
import X.QH7;
import X.YV9;
import X.YVA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new C68738QyM();
    public final byte[] zza;
    public final byte[] zzb;
    public final byte[] zzc;
    public final String[] zzd;

    public final byte[] LJJJJL() {
        return this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc))});
    }

    public final String toString() {
        G0D LJJIJIL = C62819Ol5.LJJIJIL(this);
        YV9 yv9 = YVA.LIZ;
        byte[] bArr = this.zza;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.zzb;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr2, bArr2.length), "clientDataJSON");
        byte[] bArr3 = this.zzc;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr3, bArr3.length), "attestationObject");
        LJJIJIL.LIZIZ(Arrays.toString(this.zzd), "transports");
        return LJJIJIL.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        if (!Arrays.equals(this.zza, authenticatorAttestationResponse.zza) || !Arrays.equals(this.zzb, authenticatorAttestationResponse.zzb) || !Arrays.equals(this.zzc, authenticatorAttestationResponse.zzc)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJ(parcel, 2, this.zza, false);
        C79057V0z.LJJLIIIJ(parcel, 3, this.zzb, false);
        C79057V0z.LJJLIIIJ(parcel, 4, this.zzc, false);
        C79057V0z.LJL(parcel, 5, this.zzd);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        QH7.LJIIIIZZ(bArr);
        this.zza = bArr;
        QH7.LJIIIIZZ(bArr2);
        this.zzb = bArr2;
        QH7.LJIIIIZZ(bArr3);
        this.zzc = bArr3;
        QH7.LJIIIIZZ(strArr);
        this.zzd = strArr;
    }
}
