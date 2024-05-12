package com.google.android.gms.fido.fido2.api.common;

import X.C62819Ol5;
import X.C63828P3g;
import X.C64363PNv;
import X.C68743QyR;
import X.C79057V0z;
import X.G0D;
import X.G0E;
import X.G0F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new C68743QyR();
    public final ErrorCode zza;
    public final String zzb;
    public final int zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(this.zzc)});
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
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        if (!C64363PNv.LIZ(this.zza, authenticatorErrorResponse.zza) || !C64363PNv.LIZ(this.zzb, authenticatorErrorResponse.zzb) || !C64363PNv.LIZ(Integer.valueOf(this.zzc), Integer.valueOf(authenticatorErrorResponse.zzc))) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zza.getCode());
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzc);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            this.zza = ErrorCode.toErrorCode(i);
            this.zzb = str;
            this.zzc = i2;
        } catch (C63828P3g e) {
            throw new IllegalArgumentException(e);
        }
    }
}
