package com.google.android.gms.fido.fido2.api.common;

import X.C64363PNv;
import X.C68739QyN;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new C68739QyN();
    public final String zza;
    public final String zzb;
    public final byte[] zzc;
    public final AuthenticatorAttestationResponse zzd;
    public final AuthenticatorAssertionResponse zze;
    public final AuthenticatorErrorResponse zzf;
    public final AuthenticationExtensionsClientOutputs zzg;
    public final String zzh;

    public final AuthenticatorResponse LJJJJL() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.zzd;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.zze;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.zzf;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zze, this.zzd, this.zzf, this.zzg, this.zzh});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        if (!C64363PNv.LIZ(this.zza, publicKeyCredential.zza) || !C64363PNv.LIZ(this.zzb, publicKeyCredential.zzb) || !Arrays.equals(this.zzc, publicKeyCredential.zzc) || !C64363PNv.LIZ(this.zzd, publicKeyCredential.zzd) || !C64363PNv.LIZ(this.zze, publicKeyCredential.zze) || !C64363PNv.LIZ(this.zzf, publicKeyCredential.zzf) || !C64363PNv.LIZ(this.zzg, publicKeyCredential.zzg) || !C64363PNv.LIZ(this.zzh, publicKeyCredential.zzh)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJJLIIIJ(parcel, 3, this.zzc, false);
        C79057V0z.LJJZZI(parcel, 4, this.zzd, i, false);
        C79057V0z.LJJZZI(parcel, 5, this.zze, i, false);
        C79057V0z.LJJZZI(parcel, 6, this.zzf, i, false);
        C79057V0z.LJJZZI(parcel, 7, this.zzg, i, false);
        C79057V0z.LJJZZIII(parcel, 8, this.zzh, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z = true;
        if (authenticatorAttestationResponse == null ? authenticatorAssertionResponse == null ? authenticatorErrorResponse == null : authenticatorErrorResponse != null : authenticatorAssertionResponse != null || authenticatorErrorResponse != null) {
            z = false;
        }
        QH7.LIZIZ(z);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = str3;
    }
}
