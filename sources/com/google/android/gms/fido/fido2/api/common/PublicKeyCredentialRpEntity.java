package com.google.android.gms.fido.fido2.api.common;

import X.C64363PNv;
import X.C68855R0p;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new C68855R0p();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        if (!C64363PNv.LIZ(this.zza, publicKeyCredentialRpEntity.zza) || !C64363PNv.LIZ(this.zzb, publicKeyCredentialRpEntity.zzb) || !C64363PNv.LIZ(this.zzc, publicKeyCredentialRpEntity.zzc)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zzc, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        QH7.LJIIIIZZ(str);
        this.zza = str;
        QH7.LJIIIIZZ(str2);
        this.zzb = str2;
        this.zzc = str3;
    }
}
