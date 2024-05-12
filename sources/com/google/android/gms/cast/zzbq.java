package com.google.android.gms.cast;

import X.C16880lQ;
import X.C79057V0z;
import X.C90057ZWb;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes29.dex */
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new C90057ZWb();
    public final int zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza)});
    }

    public final String toString() {
        String str;
        int i = this.zza;
        if (i != 0) {
            if (i != 2) {
                str = "UNKNOWN";
            } else {
                str = "INVISIBLE";
            }
        } else {
            str = "STRONG";
        }
        return C16880lQ.LLLZ("joinOptions(connectionType=%s)", new Object[]{str});
    }

    public zzbq() {
    }

    public zzbq(int i) {
        this.zza = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbq) && this.zza == ((zzbq) obj).zza) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zza);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
