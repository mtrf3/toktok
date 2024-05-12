package com.google.android.gms.cast;

import X.C79057V0z;
import X.C90064ZWi;
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
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    public final long zzb;
    public final long zzc;
    public final boolean zzd;
    public final boolean zze;
    public static final C90469Zez zza = new C90469Zez("MediaLiveSeekableRange");
    public static final Parcelable.Creator<MediaLiveSeekableRange> CREATOR = new C90064ZWi();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zzb), Long.valueOf(this.zzc), Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze)});
    }

    public static MediaLiveSeekableRange LJJJJL(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("start") && jSONObject.has("end")) {
            try {
                long LIZJ = C90468Zey.LIZJ(JSONObjectProtectorUtils.getDouble(jSONObject, "start"));
                double d = JSONObjectProtectorUtils.getDouble(jSONObject, "end");
                return new MediaLiveSeekableRange(LIZJ, C90468Zey.LIZJ(d), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
            } catch (JSONException unused) {
                C90469Zez c90469Zez = zza;
                "Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObject.toString());
                c90469Zez.getClass();
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLiveSeekableRange)) {
            return false;
        }
        MediaLiveSeekableRange mediaLiveSeekableRange = (MediaLiveSeekableRange) obj;
        if (this.zzb == mediaLiveSeekableRange.zzb && this.zzc == mediaLiveSeekableRange.zzc && this.zzd == mediaLiveSeekableRange.zzd && this.zze == mediaLiveSeekableRange.zze) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLJLI(parcel, 2, this.zzb);
        C79057V0z.LJJLJLI(parcel, 3, this.zzc);
        C79057V0z.LJJJZ(parcel, 4, this.zzd);
        C79057V0z.LJJJZ(parcel, 5, this.zze);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MediaLiveSeekableRange(long j, long j2, boolean z, boolean z2) {
        this.zzb = Math.max(j, 0L);
        this.zzc = Math.max(j2, 0L);
        this.zzd = z;
        this.zze = z2;
    }
}
