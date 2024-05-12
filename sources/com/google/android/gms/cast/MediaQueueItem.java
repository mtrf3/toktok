package com.google.android.gms.cast;

import X.C37355ElL;
import X.C79057V0z;
import X.C90074ZWs;
import X.C90213Zar;
import X.C90468Zey;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class MediaQueueItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaQueueItem> CREATOR = new C90074ZWs();
    public String LJLIL;
    public MediaInfo zzb;
    public int zzc;
    public boolean zzd;
    public double zze;
    public double zzf;
    public double zzg;
    public long[] zzh;
    public JSONObject zzi;
    public final C90213Zar zzj;

    public final JSONObject LJJIII() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.zzb;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.LJJJJL());
            }
            int i = this.zzc;
            if (i != 0) {
                jSONObject.put("itemId", i);
            }
            jSONObject.put("autoplay", this.zzd);
            if (!Double.isNaN(this.zze)) {
                jSONObject.put("startTime", this.zze);
            }
            double d = this.zzf;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.zzg);
            if (this.zzh != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.zzh) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.zzi;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(this.zzc), Boolean.valueOf(this.zzd), Double.valueOf(this.zze), Double.valueOf(this.zzf), Double.valueOf(this.zzg), Integer.valueOf(Arrays.hashCode(this.zzh)), String.valueOf(this.zzi)});
    }

    public MediaQueueItem(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null);
        LJJJJL(jSONObject);
    }

    public final boolean LJJJJL(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        int i;
        if (jSONObject.has("media")) {
            this.zzb = new MediaInfo(JSONObjectProtectorUtils.getJSONObject(jSONObject, "media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.zzc != (i = JSONObjectProtectorUtils.getInt(jSONObject, "itemId"))) {
            this.zzc = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.zzd != (z2 = JSONObjectProtectorUtils.getBoolean(jSONObject, "autoplay"))) {
            this.zzd = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.zze) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.zze) > 1.0E-7d)) {
            this.zze = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = JSONObjectProtectorUtils.getDouble(jSONObject, "playbackDuration");
            if (Math.abs(d - this.zzf) > 1.0E-7d) {
                this.zzf = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = JSONObjectProtectorUtils.getDouble(jSONObject, "preloadTime");
            if (Math.abs(d2 - this.zzg) > 1.0E-7d) {
                this.zzg = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "activeTrackIds");
            int length = jSONArray.length();
            long[] jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = JSONArrayProtectorUtils.getLong(jSONArray, i2);
            }
            long[] jArr2 = this.zzh;
            if (jArr2 != null && jArr2.length == length) {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.zzh[i3] == jArr[i3]) {
                    }
                }
            }
            this.zzh = jArr;
            z = true;
            break;
        }
        if (jSONObject.has("customData")) {
            this.zzi = JSONObjectProtectorUtils.getJSONObject(jSONObject, "customData");
            return true;
        }
        return z;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        JSONObject jSONObject = this.zzi;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = mediaQueueItem.zzi;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || C37355ElL.LIZ(jSONObject, jSONObject2)) && C90468Zey.LJFF(this.zzb, mediaQueueItem.zzb) && this.zzc == mediaQueueItem.zzc && this.zzd == mediaQueueItem.zzd && (((Double.isNaN(this.zze) && Double.isNaN(mediaQueueItem.zze)) || this.zze == mediaQueueItem.zze) && this.zzf == mediaQueueItem.zzf && this.zzg == mediaQueueItem.zzg && Arrays.equals(this.zzh, mediaQueueItem.zzh))) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.zzi;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.LJLIL = jSONObject;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zzb, i, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zzc);
        C79057V0z.LJJJZ(parcel, 4, this.zzd);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 5, this.zze);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 6, this.zzf);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 7, this.zzg);
        C79057V0z.LJJLL(parcel, 8, this.zzh);
        C79057V0z.LJJZZIII(parcel, 9, this.LJLIL, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MediaQueueItem(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.zzj = new C90213Zar(this);
        this.zzb = mediaInfo;
        this.zzc = i;
        this.zzd = z;
        this.zze = d;
        this.zzf = d2;
        this.zzg = d3;
        this.zzh = jArr;
        this.LJLIL = str;
        if (str != null) {
            try {
                this.zzi = new JSONObject(str);
                return;
            } catch (JSONException unused) {
                this.zzi = null;
                this.LJLIL = null;
                return;
            }
        }
        this.zzi = null;
    }
}
