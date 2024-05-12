package com.google.android.gms.auth;

import X.C64363PNv;
import X.C67345Qbt;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new C67345Qbt();
    public final int LJLIL;
    public final long LJLILLLLZI;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), this.zzc, Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf});
    }

    public final String toString() {
        String str;
        int i = this.zzd;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "RENAMED_TO";
                    }
                } else {
                    str = "RENAMED_FROM";
                }
            } else {
                str = "REMOVED";
            }
        } else {
            str = "ADDED";
        }
        return "AccountChangeEvent {accountName = " + this.zzc + ", changeType = " + str + ", changeData = " + this.zzf + ", eventIndex = " + this.zze + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        if (this.LJLIL != accountChangeEvent.LJLIL || this.LJLILLLLZI != accountChangeEvent.LJLILLLLZI || !C64363PNv.LIZ(this.zzc, accountChangeEvent.zzc) || this.zzd != accountChangeEvent.zzd || this.zze != accountChangeEvent.zze || !C64363PNv.LIZ(this.zzf, accountChangeEvent.zzf)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJLJLI(parcel, 2, this.LJLILLLLZI);
        C79057V0z.LJJZZIII(parcel, 3, this.zzc, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzd);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 5, this.zze);
        C79057V0z.LJJZZIII(parcel, 6, this.zzf, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AccountChangeEvent(int i, int i2, int i3, long j, String str, String str2) {
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        QH7.LJIIIIZZ(str);
        this.zzc = str;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str2;
    }
}
