package com.google.android.gms.fido.fido2.api.common;

import X.C79057V0z;
import X.QH7;
import X.R3L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new R3L();
    public final String zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public FidoAppIdExtension(String str) {
        QH7.LJIIIIZZ(str);
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoAppIdExtension)) {
            return false;
        }
        return this.zza.equals(((FidoAppIdExtension) obj).zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
