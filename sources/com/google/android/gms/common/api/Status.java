package com.google.android.gms.common.api;

import X.C64362PNu;
import X.C64363PNv;
import X.C67750QiQ;
import X.C79057V0z;
import X.C79234V7u;
import X.InterfaceC67754QiU;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class Status extends AbstractSafeParcelable implements InterfaceC67754QiU, ReflectedParcelable {
    public final int LJLIL;
    public final int zzc;
    public final String zzd;
    public final PendingIntent zze;
    public final ConnectionResult zzf;
    public static final Status RESULT_SUCCESS = new Status(0, null);
    public static final Status RESULT_INTERRUPTED = new Status(14, null);
    public static final Status RESULT_INTERNAL_ERROR = new Status(8, null);
    public static final Status RESULT_TIMEOUT = new Status(15, null);
    public static final Status RESULT_CANCELED = new Status(16, null);
    public static final Status zza = new Status(17, null);
    public static final Status RESULT_DEAD_CLIENT = new Status(18, null);
    public static final Parcelable.Creator<Status> CREATOR = new C67750QiQ();

    public Status() {
        throw null;
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.LJLIL = i;
        this.zzc = i2;
        this.zzd = str;
        this.zze = pendingIntent;
        this.zzf = connectionResult;
    }

    public final boolean LJJJJL() {
        return this.zzc <= 0;
    }

    @Override // X.InterfaceC67754QiU
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        String str = this.zzd;
        if (str == null) {
            str = C79234V7u.LJIJ(this.zzc);
        }
        c64362PNu.LIZ(str, "statusCode");
        c64362PNu.LIZ(this.zze, "resolution");
        return c64362PNu.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.LJLIL != status.LJLIL || this.zzc != status.zzc || !C64363PNv.LIZ(this.zzd, status.zzd) || !C64363PNv.LIZ(this.zze, status.zze) || !C64363PNv.LIZ(this.zzf, status.zzf)) {
            return false;
        }
        return true;
    }

    public Status(int i, String str) {
        this(i, null, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zzc);
        C79057V0z.LJJZZIII(parcel, 2, this.zzd, false);
        C79057V0z.LJJZZI(parcel, 3, this.zze, i, false);
        C79057V0z.LJJZZI(parcel, 4, this.zzf, i, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1000, this.LJLIL);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public Status(int i, PendingIntent pendingIntent, String str) {
        this(1, i, str, pendingIntent, null);
    }
}
