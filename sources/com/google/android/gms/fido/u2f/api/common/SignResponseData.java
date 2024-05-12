package com.google.android.gms.fido.u2f.api.common;

import X.C62819Ol5;
import X.C64363PNv;
import X.C68741QyP;
import X.C79057V0z;
import X.G0D;
import X.QH7;
import X.YV9;
import X.YVA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new C68741QyP();
    public final byte[] zza;
    public final String zzb;
    public final byte[] zzc;
    public final byte[] zzd;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd))});
    }

    public final String toString() {
        G0D LJJIJIL = C62819Ol5.LJJIJIL(this);
        YV9 yv9 = YVA.LIZ;
        byte[] bArr = this.zza;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr, bArr.length), "keyHandle");
        LJJIJIL.LIZIZ(this.zzb, "clientDataString");
        byte[] bArr2 = this.zzc;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr2, bArr2.length), "signatureData");
        byte[] bArr3 = this.zzd;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr3, bArr3.length), "application");
        return LJJIJIL.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        if (!Arrays.equals(this.zza, signResponseData.zza) || !C64363PNv.LIZ(this.zzb, signResponseData.zzb) || !Arrays.equals(this.zzc, signResponseData.zzc) || !Arrays.equals(this.zzd, signResponseData.zzd)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJ(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJLIIIJ(parcel, 4, this.zzc, false);
        C79057V0z.LJJLIIIJ(parcel, 5, this.zzd, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public SignResponseData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        QH7.LJIIIIZZ(bArr);
        this.zza = bArr;
        QH7.LJIIIIZZ(str);
        this.zzb = str;
        QH7.LJIIIIZZ(bArr2);
        this.zzc = bArr2;
        QH7.LJIIIIZZ(bArr3);
        this.zzd = bArr3;
    }
}
