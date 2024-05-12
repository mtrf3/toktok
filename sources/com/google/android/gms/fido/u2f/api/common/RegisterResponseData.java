package com.google.android.gms.fido.u2f.api.common;

import X.C62819Ol5;
import X.C64363PNv;
import X.C67333Qbh;
import X.C68740QyO;
import X.C79057V0z;
import X.G0D;
import X.YV9;
import X.YVA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new C68740QyO();
    public final byte[] zza;
    public final ProtocolVersion zzb;
    public final String zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(Arrays.hashCode(this.zza)), this.zzc});
    }

    public final String toString() {
        G0D LJJIJIL = C62819Ol5.LJJIJIL(this);
        LJJIJIL.LIZIZ(this.zzb, "protocolVersion");
        YV9 yv9 = YVA.LIZ;
        byte[] bArr = this.zza;
        LJJIJIL.LIZIZ(yv9.LIZIZ(bArr, bArr.length), "registerData");
        String str = this.zzc;
        if (str != null) {
            LJJIJIL.LIZIZ(str, "clientDataString");
        }
        return LJJIJIL.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        if (!C64363PNv.LIZ(this.zzb, registerResponseData.zzb) || !Arrays.equals(this.zza, registerResponseData.zza) || !C64363PNv.LIZ(this.zzc, registerResponseData.zzc)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJ(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb.toString(), false);
        C79057V0z.LJJZZIII(parcel, 4, this.zzc, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public RegisterResponseData(String str, byte[] bArr, String str2) {
        this.zza = bArr;
        try {
            this.zzb = ProtocolVersion.fromString(str);
            this.zzc = str2;
        } catch (C67333Qbh e) {
            throw new IllegalArgumentException(e);
        }
    }
}
