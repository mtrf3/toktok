package com.google.android.gms.maps.model;

import X.C16880lQ;
import X.C68792QzE;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public final int zzb;
    public static final String zza = C16880lQ.LJLLJ(StreetViewSource.class);
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new C68792QzE();
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb)});
    }

    public final String toString() {
        String str;
        int i = this.zzb;
        if (i != 0) {
            if (i != 1) {
                str = C16880lQ.LLLZ("UNKNOWN(%s)", new Object[]{Integer.valueOf(i)});
            } else {
                str = "OUTDOOR";
            }
        } else {
            str = "DEFAULT";
        }
        return C16880lQ.LLLZ("StreetViewSource:%s", new Object[]{str});
    }

    public StreetViewSource(int i) {
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StreetViewSource) && this.zzb == ((StreetViewSource) obj).zzb) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zzb);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
