package com.google.android.gms.cast.framework;

import X.C79057V0z;
import X.ZYP;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes29.dex */
public class CastOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CastOptions> CREATOR = new ZYP();
    public String zza;
    public final List<String> zzb;
    public boolean zzc;
    public LaunchOptions zzd;
    public final boolean zze;
    public final CastMediaOptions zzf;
    public final boolean zzg;
    public final double zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;

    public final List<String> LJJJJL() {
        return Collections.unmodifiableList(this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJLI(parcel, 3, LJJJJL());
        C79057V0z.LJJJZ(parcel, 4, this.zzc);
        C79057V0z.LJJZZI(parcel, 5, this.zzd, i, false);
        C79057V0z.LJJJZ(parcel, 6, this.zze);
        C79057V0z.LJJZZI(parcel, 7, this.zzf, i, false);
        C79057V0z.LJJJZ(parcel, 8, this.zzg);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 9, this.zzh);
        C79057V0z.LJJJZ(parcel, 10, this.zzi);
        C79057V0z.LJJJZ(parcel, 11, this.zzj);
        C79057V0z.LJJJZ(parcel, 12, this.zzk);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CastOptions(String str, List<String> list, boolean z, LaunchOptions launchOptions, boolean z2, CastMediaOptions castMediaOptions, boolean z3, double d, boolean z4, boolean z5, boolean z6) {
        int size;
        this.zza = true == TextUtils.isEmpty(str) ? "" : str;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        ArrayList arrayList = new ArrayList(size);
        this.zzb = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.zzc = z;
        this.zzd = launchOptions == null ? new LaunchOptions() : launchOptions;
        this.zze = z2;
        this.zzf = castMediaOptions;
        this.zzg = z3;
        this.zzh = d;
        this.zzi = z4;
        this.zzj = z5;
        this.zzk = z6;
    }
}
