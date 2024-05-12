package com.google.android.gms.fido.fido2.api.common;

import X.C64363PNv;
import X.C68747QyV;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new C68747QyV();
    public final UvmEntries zza;
    public final zzf zzb;
    public final AuthenticationExtensionsCredPropsOutputs zzc;
    public final zzh zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        if (!C64363PNv.LIZ(this.zza, authenticationExtensionsClientOutputs.zza) || !C64363PNv.LIZ(this.zzb, authenticationExtensionsClientOutputs.zzb) || !C64363PNv.LIZ(this.zzc, authenticationExtensionsClientOutputs.zzc) || !C64363PNv.LIZ(this.zzd, authenticationExtensionsClientOutputs.zzd)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.zza, i, false);
        C79057V0z.LJJZZI(parcel, 2, this.zzb, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.zzc, i, false);
        C79057V0z.LJJZZI(parcel, 4, this.zzd, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar) {
        this.zza = uvmEntries;
        this.zzb = zzfVar;
        this.zzc = authenticationExtensionsCredPropsOutputs;
        this.zzd = zzhVar;
    }
}
