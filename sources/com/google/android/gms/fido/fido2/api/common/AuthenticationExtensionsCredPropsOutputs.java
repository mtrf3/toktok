package com.google.android.gms.fido.fido2.api.common;

import X.C68749QyX;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new C68749QyX();
    public final boolean zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    public AuthenticationExtensionsCredPropsOutputs(boolean z) {
        this.zza = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsCredPropsOutputs) || this.zza != ((AuthenticationExtensionsCredPropsOutputs) obj).zza) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJJZ(parcel, 1, this.zza);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
