package com.google.android.gms.fido.fido2.api.common;

import X.C62819Ol5;
import X.C68742QyQ;
import X.C79057V0z;
import X.G0D;
import X.QH7;
import X.YV9;
import X.YVA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new C68742QyQ();
    public final byte[] zza;
    public final byte[] zzb;
    public final byte[] zzc;
    public final byte[] zzd;
    public final byte[] zze;

    public final byte[] LJJJJL() {
        return this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zze))});
    }

    public final String toString() {
        G0D LJJIJIL = C62819Ol5.LJJIJIL(this);
        YV9 yv9 = YVA.LIZ;
        byte[] bArr = this.zza;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.zzb;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr2, bArr2.length), "clientDataJSON");
        byte[] bArr3 = this.zzc;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr3, bArr3.length), "authenticatorData");
        byte[] bArr4 = this.zzd;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr4, bArr4.length), "signature");
        byte[] bArr5 = this.zze;
        if (bArr5 != null) {
            LJJIJIL.LIZIZ(yv9.LIZIZ(bArr5, bArr5.length), "userHandle");
        }
        return LJJIJIL.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        if (!Arrays.equals(this.zza, authenticatorAssertionResponse.zza) || !Arrays.equals(this.zzb, authenticatorAssertionResponse.zzb) || !Arrays.equals(this.zzc, authenticatorAssertionResponse.zzc) || !Arrays.equals(this.zzd, authenticatorAssertionResponse.zzd) || !Arrays.equals(this.zze, authenticatorAssertionResponse.zze)) {
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
        C79057V0z.LJJLIIIJ(parcel, 5, this.zzd, false);
        C79057V0z.LJJLIIIJ(parcel, 6, this.zze, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        QH7.LJIIIIZZ(bArr);
        this.zza = bArr;
        QH7.LJIIIIZZ(bArr2);
        this.zzb = bArr2;
        QH7.LJIIIIZZ(bArr3);
        this.zzc = bArr3;
        QH7.LJIIIIZZ(bArr4);
        this.zzd = bArr4;
        this.zze = bArr5;
    }
}
