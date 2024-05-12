package com.google.android.gms.maps.model;

import X.C16880lQ;
import X.C64363PNv;
import X.C68780Qz2;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class PatternItem extends AbstractSafeParcelable {
    public final int zzb;
    public final Float zzc;
    public static final String zza = C16880lQ.LJLLJ(PatternItem.class);
    public static final Parcelable.Creator<PatternItem> CREATOR = new C68780Qz2();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc});
    }

    public String toString() {
        return "[PatternItem: type=" + this.zzb + " length=" + this.zzc + "]";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        if (this.zzb == patternItem.zzb && C64363PNv.LIZ(this.zzc, patternItem.zzc)) {
            return true;
        }
        return false;
    }

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        QH7.LIZ("Invalid PatternItem: type=" + i + " length=" + f, z);
        this.zzb = i;
        this.zzc = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zzb);
        C79057V0z.LJJLIIIJL(parcel, 3, this.zzc);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
