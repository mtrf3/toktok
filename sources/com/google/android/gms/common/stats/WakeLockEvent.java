package com.google.android.gms.common.stats;

import X.C67321QbV;
import X.C79057V0z;
import X.YE1;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes12.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C67321QbV();
    public final int LJLIL;
    public final long zzb;
    public int zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final int zzg;
    public final List<String> zzh;
    public final String zzi;
    public final long zzj;
    public int zzk;
    public final String zzl;
    public final float zzm;
    public final long zzn;
    public final boolean zzo;
    public long zzp = -1;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.LJLIL = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int LJJJJL() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long LJJJJZ() {
        return this.zzp;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long LJJJJZI() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String LJJJLIIL() {
        String join;
        List<String> list = this.zzh;
        String str = this.zzd;
        int i = this.zzg;
        String str2 = "";
        if (list == null) {
            join = "";
        } else {
            join = TextUtils.join(",", list);
        }
        int i2 = this.zzk;
        String str3 = this.zze;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.zzl;
        if (str4 == null) {
            str4 = "";
        }
        float f = this.zzm;
        String str5 = this.zzf;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.zzo;
        StringBuilder sb = new StringBuilder(str2.length() + str4.length() + str3.length() + String.valueOf(str).length() + 51 + String.valueOf(join).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i2);
        YE1.LIZLLL(sb, "\t", str3, "\t", str4);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJLJLI(parcel, 2, this.zzb);
        C79057V0z.LJJZZIII(parcel, 4, this.zzd, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 5, this.zzg);
        C79057V0z.LJLI(parcel, 6, this.zzh);
        C79057V0z.LJJLJLI(parcel, 8, this.zzj);
        C79057V0z.LJJZZIII(parcel, 10, this.zze, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 11, this.zzc);
        C79057V0z.LJJZZIII(parcel, 12, this.zzi, false);
        C79057V0z.LJJZZIII(parcel, 13, this.zzl, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 14, this.zzk);
        C79057V0z.LJJLIIIJJIZ(parcel, 15, this.zzm);
        C79057V0z.LJJLJLI(parcel, 16, this.zzn);
        C79057V0z.LJJZZIII(parcel, 17, this.zzf, false);
        C79057V0z.LJJJZ(parcel, 18, this.zzo);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
