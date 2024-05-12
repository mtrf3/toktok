package com.google.android.gms.fido.fido2.api.common;

import X.C64363PNv;
import X.C68844R0e;
import X.C68851R0l;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new C68844R0e();
    public final PublicKeyCredentialRpEntity zza;
    public final PublicKeyCredentialUserEntity zzb;
    public final byte[] zzc;
    public final List zzd;
    public final Double zze;
    public final List zzf;
    public final AuthenticatorSelectionCriteria zzg;
    public final Integer zzh;
    public final TokenBinding zzi;
    public final AttestationConveyancePreference zzj;
    public final AuthenticationExtensions zzk;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk});
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (!C64363PNv.LIZ(this.zza, publicKeyCredentialCreationOptions.zza) || !C64363PNv.LIZ(this.zzb, publicKeyCredentialCreationOptions.zzb) || !Arrays.equals(this.zzc, publicKeyCredentialCreationOptions.zzc) || !C64363PNv.LIZ(this.zze, publicKeyCredentialCreationOptions.zze) || !this.zzd.containsAll(publicKeyCredentialCreationOptions.zzd) || !publicKeyCredentialCreationOptions.zzd.containsAll(this.zzd) || ((list = this.zzf) != null ? (list2 = publicKeyCredentialCreationOptions.zzf) == null || !list.containsAll(list2) || !publicKeyCredentialCreationOptions.zzf.containsAll(this.zzf) : publicKeyCredentialCreationOptions.zzf != null) || !C64363PNv.LIZ(this.zzg, publicKeyCredentialCreationOptions.zzg) || !C64363PNv.LIZ(this.zzh, publicKeyCredentialCreationOptions.zzh) || !C64363PNv.LIZ(this.zzi, publicKeyCredentialCreationOptions.zzi) || !C64363PNv.LIZ(this.zzj, publicKeyCredentialCreationOptions.zzj) || !C64363PNv.LIZ(this.zzk, publicKeyCredentialCreationOptions.zzk)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String attestationConveyancePreference;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zza, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.zzb, i, false);
        C79057V0z.LJJLIIIJ(parcel, 4, this.zzc, false);
        C79057V0z.LJLIIL(parcel, 5, this.zzd, false);
        C79057V0z.LJJLIIIJJI(parcel, 6, this.zze);
        C79057V0z.LJLIIL(parcel, 7, this.zzf, false);
        C79057V0z.LJJZZI(parcel, 8, this.zzg, i, false);
        C79057V0z.LJJLJ(parcel, 9, this.zzh);
        C79057V0z.LJJZZI(parcel, 10, this.zzi, i, false);
        AttestationConveyancePreference attestationConveyancePreference2 = this.zzj;
        if (attestationConveyancePreference2 == null) {
            attestationConveyancePreference = null;
        } else {
            attestationConveyancePreference = attestationConveyancePreference2.toString();
        }
        C79057V0z.LJJZZIII(parcel, 11, attestationConveyancePreference, false);
        C79057V0z.LJJZZI(parcel, 12, this.zzk, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        QH7.LJIIIIZZ(publicKeyCredentialRpEntity);
        this.zza = publicKeyCredentialRpEntity;
        QH7.LJIIIIZZ(publicKeyCredentialUserEntity);
        this.zzb = publicKeyCredentialUserEntity;
        QH7.LJIIIIZZ(bArr);
        this.zzc = bArr;
        QH7.LJIIIIZZ(list);
        this.zzd = list;
        this.zze = d;
        this.zzf = list2;
        this.zzg = authenticatorSelectionCriteria;
        this.zzh = num;
        this.zzi = tokenBinding;
        if (str != null) {
            try {
                this.zzj = AttestationConveyancePreference.fromString(str);
            } catch (C68851R0l e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.zzj = null;
        }
        this.zzk = authenticationExtensions;
    }
}
