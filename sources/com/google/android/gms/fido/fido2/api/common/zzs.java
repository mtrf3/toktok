package com.google.android.gms.fido.fido2.api.common;

import X.C68860R0u;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes12.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C68860R0u();
    public final List zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.zza)});
    }

    public zzs(List list) {
        QH7.LJIIIIZZ(list);
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        if (!this.zza.containsAll(zzsVar.zza) || !zzsVar.zza.containsAll(this.zza)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJLIIL(parcel, 1, this.zza, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
