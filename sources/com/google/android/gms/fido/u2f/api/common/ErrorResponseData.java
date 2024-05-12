package com.google.android.gms.fido.u2f.api.common;

import X.C62819Ol5;
import X.C64363PNv;
import X.C68744QyS;
import X.C79057V0z;
import X.G0D;
import X.G0E;
import X.G0F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new C68744QyS();
    public final ErrorCode zza;
    public final String zzb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        G0D LJJIJIL = C62819Ol5.LJJIJIL(this);
        String valueOf = String.valueOf(this.zza.getCode());
        G0F g0f = new G0F();
        ((G0E) LJJIJIL.LJLJJI).LIZJ = g0f;
        LJJIJIL.LJLJJI = g0f;
        g0f.LIZIZ = valueOf;
        g0f.LIZ = "errorCode";
        String str = this.zzb;
        if (str != null) {
            LJJIJIL.LIZIZ(str, "errorMessage");
        }
        return LJJIJIL.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        if (!C64363PNv.LIZ(this.zza, errorResponseData.zza) || !C64363PNv.LIZ(this.zzb, errorResponseData.zzb)) {
            return false;
        }
        return true;
    }

    public ErrorResponseData(int i, String str) {
        this.zza = ErrorCode.toErrorCode(i);
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zza.getCode());
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
