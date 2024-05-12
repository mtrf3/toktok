package com.google.android.gms.fido.fido2.api.common;

import X.C64363PNv;
import X.C68854R0o;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new C68854R0o();
    public final byte[] zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        if (!Arrays.equals(this.zza, publicKeyCredentialUserEntity.zza) || !C64363PNv.LIZ(this.zzb, publicKeyCredentialUserEntity.zzb) || !C64363PNv.LIZ(this.zzc, publicKeyCredentialUserEntity.zzc) || !C64363PNv.LIZ(this.zzd, publicKeyCredentialUserEntity.zzd)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJ(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zzc, false);
        C79057V0z.LJJZZIII(parcel, 5, this.zzd, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PublicKeyCredentialUserEntity(String str, String str2, String str3, byte[] bArr) {
        QH7.LJIIIIZZ(bArr);
        this.zza = bArr;
        QH7.LJIIIIZZ(str);
        this.zzb = str;
        this.zzc = str2;
        QH7.LJIIIIZZ(str3);
        this.zzd = str3;
    }
}
