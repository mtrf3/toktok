package com.google.android.gms.cast;

import X.C79057V0z;
import X.C90076ZWu;
import X.C90468Zey;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class AdBreakInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdBreakInfo> CREATOR = new C90076ZWu();
    public final long zza;
    public final String zzb;
    public final long zzc;
    public final boolean zzd;
    public final String[] zze;
    public final boolean zzf;
    public final boolean zzg;

    public final JSONObject LJJJJL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.zzb);
            jSONObject.put("position", C90468Zey.LIZ(this.zza));
            jSONObject.put("isWatched", this.zzd);
            jSONObject.put("isEmbedded", this.zzf);
            jSONObject.put("duration", C90468Zey.LIZ(this.zzc));
            jSONObject.put("expanded", this.zzg);
            if (this.zze != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.zze) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakInfo)) {
            return false;
        }
        AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
        if (C90468Zey.LJFF(this.zzb, adBreakInfo.zzb) && this.zza == adBreakInfo.zza && this.zzc == adBreakInfo.zzc && this.zzd == adBreakInfo.zzd && Arrays.equals(this.zze, adBreakInfo.zze) && this.zzf == adBreakInfo.zzf && this.zzg == adBreakInfo.zzg) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLJLI(parcel, 2, this.zza);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJLJLI(parcel, 4, this.zzc);
        C79057V0z.LJJJZ(parcel, 5, this.zzd);
        C79057V0z.LJL(parcel, 6, this.zze);
        C79057V0z.LJJJZ(parcel, 7, this.zzf);
        C79057V0z.LJJJZ(parcel, 8, this.zzg);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AdBreakInfo(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.zza = j;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = z;
        this.zze = strArr;
        this.zzf = z2;
        this.zzg = z3;
    }
}
