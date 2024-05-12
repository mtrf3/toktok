package com.google.android.gms.maps.model;

import X.C16880lQ;
import X.C64363PNv;
import X.C68772Qyu;
import X.C68774Qyw;
import X.C79057V0z;
import X.QH7;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class Cap extends AbstractSafeParcelable {
    public final int zzb;
    public final C68772Qyu zzc;
    public final Float zzd;
    public static final String zza = C16880lQ.LJLLJ(Cap.class);
    public static final Parcelable.Creator<Cap> CREATOR = new C68774Qyw();

    public Cap() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final Cap LJJJJL() {
        boolean z;
        int i = this.zzb;
        if (i != 0) {
            boolean z2 = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return this;
                    }
                    if (this.zzc != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    QH7.LJIIJ("bitmapDescriptor must not be null", z);
                    if (this.zzd == null) {
                        z2 = false;
                    }
                    QH7.LJIIJ("bitmapRefWidth must not be null", z2);
                    return new CustomCap(this.zzc, this.zzd.floatValue());
                }
                return new RoundCap();
            }
            return new SquareCap();
        }
        return new ButtCap();
    }

    public String toString() {
        return "[Cap: type=" + this.zzb + "]";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        if (this.zzb == cap.zzb && C64363PNv.LIZ(this.zzc, cap.zzc) && C64363PNv.LIZ(this.zzd, cap.zzd)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zzb);
        C68772Qyu c68772Qyu = this.zzc;
        if (c68772Qyu == null) {
            asBinder = null;
        } else {
            asBinder = c68772Qyu.LIZ.asBinder();
        }
        C79057V0z.LJJLIIIJLJLI(parcel, 3, asBinder);
        C79057V0z.LJJLIIIJL(parcel, 4, this.zzd);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public Cap(int i, C68772Qyu c68772Qyu, Float f) {
        boolean z;
        boolean z2;
        if (f != null && f.floatValue() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (i == 3) {
            if (c68772Qyu != null && z) {
                i = 3;
            } else {
                i = 3;
                z2 = false;
                QH7.LIZ(C16880lQ.LLLZ("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), c68772Qyu, f}), z2);
                this.zzb = i;
                this.zzc = c68772Qyu;
                this.zzd = f;
            }
        }
        z2 = true;
        QH7.LIZ(C16880lQ.LLLZ("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), c68772Qyu, f}), z2);
        this.zzb = i;
        this.zzc = c68772Qyu;
        this.zzd = f;
    }
}
