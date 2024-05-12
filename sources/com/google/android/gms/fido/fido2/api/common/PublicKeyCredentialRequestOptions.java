package com.google.android.gms.fido.fido2.api.common;

import X.C58634Mzm;
import X.C64363PNv;
import X.C68843R0d;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new C68843R0d();
    public final byte[] zza;
    public final Double zzb;
    public final String zzc;
    public final List zzd;
    public final Integer zze;
    public final TokenBinding zzf;
    public final zzay zzg;
    public final AuthenticationExtensions zzh;
    public final Long zzi;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi});
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        if (!Arrays.equals(this.zza, publicKeyCredentialRequestOptions.zza) || !C64363PNv.LIZ(this.zzb, publicKeyCredentialRequestOptions.zzb) || !C64363PNv.LIZ(this.zzc, publicKeyCredentialRequestOptions.zzc) || ((list = this.zzd) != null ? (list2 = publicKeyCredentialRequestOptions.zzd) == null || !list.containsAll(list2) || !publicKeyCredentialRequestOptions.zzd.containsAll(this.zzd) : publicKeyCredentialRequestOptions.zzd != null) || !C64363PNv.LIZ(this.zze, publicKeyCredentialRequestOptions.zze) || !C64363PNv.LIZ(this.zzf, publicKeyCredentialRequestOptions.zzf) || !C64363PNv.LIZ(this.zzg, publicKeyCredentialRequestOptions.zzg) || !C64363PNv.LIZ(this.zzh, publicKeyCredentialRequestOptions.zzh) || !C64363PNv.LIZ(this.zzi, publicKeyCredentialRequestOptions.zzi)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String zzayVar;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJ(parcel, 2, this.zza, false);
        C79057V0z.LJJLIIIJJI(parcel, 3, this.zzb);
        C79057V0z.LJJZZIII(parcel, 4, this.zzc, false);
        C79057V0z.LJLIIL(parcel, 5, this.zzd, false);
        C79057V0z.LJJLJ(parcel, 6, this.zze);
        C79057V0z.LJJZZI(parcel, 7, this.zzf, i, false);
        zzay zzayVar2 = this.zzg;
        if (zzayVar2 == null) {
            zzayVar = null;
        } else {
            zzayVar = zzayVar2.toString();
        }
        C79057V0z.LJJZZIII(parcel, 8, zzayVar, false);
        C79057V0z.LJJZZI(parcel, 9, this.zzh, i, false);
        C79057V0z.LJJZ(parcel, 10, this.zzi);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, List list, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l) {
        QH7.LJIIIIZZ(bArr);
        this.zza = bArr;
        this.zzb = d;
        QH7.LJIIIIZZ(str);
        this.zzc = str;
        this.zzd = list;
        this.zze = num;
        this.zzf = tokenBinding;
        this.zzi = l;
        if (str2 != null) {
            try {
                this.zzg = zzay.zza(str2);
            } catch (C58634Mzm e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = authenticationExtensions;
    }
}
