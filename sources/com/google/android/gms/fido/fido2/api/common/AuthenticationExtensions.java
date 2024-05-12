package com.google.android.gms.fido.fido2.api.common;

import X.C64363PNv;
import X.C79057V0z;
import X.R3D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new R3D();
    public final FidoAppIdExtension zza;
    public final zzs zzb;
    public final UserVerificationMethodExtension zzc;
    public final zzz zzd;
    public final zzab zze;
    public final zzad zzf;
    public final zzu zzg;
    public final zzag zzh;
    public final GoogleThirdPartyPaymentExtension zzi;
    public final zzai zzj;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        if (!C64363PNv.LIZ(this.zza, authenticationExtensions.zza) || !C64363PNv.LIZ(this.zzb, authenticationExtensions.zzb) || !C64363PNv.LIZ(this.zzc, authenticationExtensions.zzc) || !C64363PNv.LIZ(this.zzd, authenticationExtensions.zzd) || !C64363PNv.LIZ(this.zze, authenticationExtensions.zze) || !C64363PNv.LIZ(this.zzf, authenticationExtensions.zzf) || !C64363PNv.LIZ(this.zzg, authenticationExtensions.zzg) || !C64363PNv.LIZ(this.zzh, authenticationExtensions.zzh) || !C64363PNv.LIZ(this.zzi, authenticationExtensions.zzi) || !C64363PNv.LIZ(this.zzj, authenticationExtensions.zzj)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zza, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.zzb, i, false);
        C79057V0z.LJJZZI(parcel, 4, this.zzc, i, false);
        C79057V0z.LJJZZI(parcel, 5, this.zzd, i, false);
        C79057V0z.LJJZZI(parcel, 6, this.zze, i, false);
        C79057V0z.LJJZZI(parcel, 7, this.zzf, i, false);
        C79057V0z.LJJZZI(parcel, 8, this.zzg, i, false);
        C79057V0z.LJJZZI(parcel, 9, this.zzh, i, false);
        C79057V0z.LJJZZI(parcel, 10, this.zzi, i, false);
        C79057V0z.LJJZZI(parcel, 11, this.zzj, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzaiVar) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzsVar;
        this.zzd = zzzVar;
        this.zze = zzabVar;
        this.zzf = zzadVar;
        this.zzg = zzuVar;
        this.zzh = zzagVar;
        this.zzi = googleThirdPartyPaymentExtension;
        this.zzj = zzaiVar;
    }
}
