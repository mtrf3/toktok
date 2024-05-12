package com.google.android.gms.fido.fido2.api.common;

import X.C67551QfD;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new C67551QfD();
    public final int zza;
    public final short zzb;
    public final short zzc;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Short.valueOf(this.zzb), Short.valueOf(this.zzc)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        if (this.zza != uvmEntry.zza || this.zzb != uvmEntry.zzb || this.zzc != uvmEntry.zzc) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zza);
        short s = this.zzb;
        parcel.writeInt(262146);
        parcel.writeInt(s);
        short s2 = this.zzc;
        parcel.writeInt(262147);
        parcel.writeInt(s2);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public UvmEntry(int i, short s, short s2) {
        this.zza = i;
        this.zzb = s;
        this.zzc = s2;
    }
}
