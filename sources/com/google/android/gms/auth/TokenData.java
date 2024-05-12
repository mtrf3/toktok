package com.google.android.gms.auth;

import X.C64363PNv;
import X.C67592Qfs;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new C67592Qfs();
    public final int LJLIL;
    public final String zzb;
    public final Long zzc;
    public final boolean zzd;
    public final boolean zze;
    public final List zzf;
    public final String zzg;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), this.zzf, this.zzg});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.zzb, tokenData.zzb) || !C64363PNv.LIZ(this.zzc, tokenData.zzc) || this.zzd != tokenData.zzd || this.zze != tokenData.zze || !C64363PNv.LIZ(this.zzf, tokenData.zzf) || !C64363PNv.LIZ(this.zzg, tokenData.zzg)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJJZ(parcel, 3, this.zzc);
        C79057V0z.LJJJZ(parcel, 4, this.zzd);
        C79057V0z.LJJJZ(parcel, 5, this.zze);
        C79057V0z.LJLI(parcel, 6, this.zzf);
        C79057V0z.LJJZZIII(parcel, 7, this.zzg, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.LJLIL = i;
        QH7.LJI(str);
        this.zzb = str;
        this.zzc = l;
        this.zzd = z;
        this.zze = z2;
        this.zzf = list;
        this.zzg = str2;
    }
}
