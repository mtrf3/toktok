package com.google.android.gms.cast;

import X.C79057V0z;
import X.C90070ZWo;
import X.C90468Zey;
import X.C90469Zez;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class AdBreakStatus extends AbstractSafeParcelable {
    public static final int AD_BREAK_CLIP_NOT_SKIPPABLE = -1;
    public final long zzb;
    public final long zzc;
    public final String zzd;
    public final String zze;
    public final long zzf;
    public static final C90469Zez zza = new C90469Zez("AdBreakStatus");
    public static final Parcelable.Creator<AdBreakStatus> CREATOR = new C90070ZWo();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzd, this.zze, Long.valueOf(this.zzf)});
    }

    public static AdBreakStatus LJJJJL(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("currentBreakTime") && jSONObject.has("currentBreakClipTime")) {
            try {
                long j = JSONObjectProtectorUtils.getLong(jSONObject, "currentBreakTime") * 1000;
                long j2 = JSONObjectProtectorUtils.getLong(jSONObject, "currentBreakClipTime") * 1000;
                String LIZIZ = C90468Zey.LIZIZ("breakId", jSONObject);
                String LIZIZ2 = C90468Zey.LIZIZ("breakClipId", jSONObject);
                long optLong = jSONObject.optLong("whenSkippable", -1L);
                if (optLong != -1) {
                    optLong *= 1000;
                }
                return new AdBreakStatus(j, j2, optLong, LIZIZ, LIZIZ2);
            } catch (JSONException unused) {
                zza.getClass();
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        if (this.zzb == adBreakStatus.zzb && this.zzc == adBreakStatus.zzc && C90468Zey.LJFF(this.zzd, adBreakStatus.zzd) && C90468Zey.LJFF(this.zze, adBreakStatus.zze) && this.zzf == adBreakStatus.zzf) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLJLI(parcel, 2, this.zzb);
        C79057V0z.LJJLJLI(parcel, 3, this.zzc);
        C79057V0z.LJJZZIII(parcel, 4, this.zzd, false);
        C79057V0z.LJJZZIII(parcel, 5, this.zze, false);
        C79057V0z.LJJLJLI(parcel, 6, this.zzf);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AdBreakStatus(long j, long j2, long j3, String str, String str2) {
        this.zzb = j;
        this.zzc = j2;
        this.zzd = str;
        this.zze = str2;
        this.zzf = j3;
    }
}
