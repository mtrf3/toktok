package com.google.android.gms.cast;

import X.C37355ElL;
import X.C64363PNv;
import X.C79057V0z;
import X.C90066ZWk;
import X.C90468Zey;
import X.C90469Zez;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class MediaLoadRequestData extends AbstractSafeParcelable {
    public String LJLIL;
    public final MediaInfo zzc;
    public final MediaQueueData zzd;
    public final Boolean zze;
    public final long zzf;
    public final double zzg;
    public final long[] zzh;
    public final JSONObject zzi;
    public final String zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public long zzn;
    public static final C90469Zez zzb = new C90469Zez("MediaLoadRequestData");
    public static final Parcelable.Creator<MediaLoadRequestData> CREATOR = new C90066ZWk();

    public final JSONObject LJJIII() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.zzc;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.LJJJJL());
            }
            MediaQueueData mediaQueueData = this.zzd;
            if (mediaQueueData != null) {
                jSONObject.put("queueData", mediaQueueData.LJJJJL());
            }
            jSONObject.putOpt("autoplay", this.zze);
            long j = this.zzf;
            if (j != -1) {
                jSONObject.put("currentTime", C90468Zey.LIZ(j));
            }
            jSONObject.put("playbackRate", this.zzg);
            jSONObject.putOpt("credentials", this.zzj);
            jSONObject.putOpt("credentialsType", this.zzk);
            jSONObject.putOpt("atvCredentials", this.zzl);
            jSONObject.putOpt("atvCredentialsType", this.zzm);
            if (this.zzh != null) {
                JSONArray jSONArray = new JSONArray();
                int i = 0;
                while (true) {
                    long[] jArr = this.zzh;
                    if (i >= jArr.length) {
                        break;
                    }
                    jSONArray.put(i, jArr[i]);
                    i++;
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            jSONObject.putOpt("customData", this.zzi);
            jSONObject.put("requestId", this.zzn);
            return jSONObject;
        } catch (JSONException unused) {
            zzb.getClass();
            return new JSONObject();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, this.zzd, this.zze, Long.valueOf(this.zzf), Double.valueOf(this.zzg), this.zzh, String.valueOf(this.zzi), this.zzj, this.zzk, this.zzl, this.zzm, Long.valueOf(this.zzn)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLoadRequestData)) {
            return false;
        }
        MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
        if (C37355ElL.LIZ(this.zzi, mediaLoadRequestData.zzi) && C64363PNv.LIZ(this.zzc, mediaLoadRequestData.zzc) && C64363PNv.LIZ(this.zzd, mediaLoadRequestData.zzd) && C64363PNv.LIZ(this.zze, mediaLoadRequestData.zze) && this.zzf == mediaLoadRequestData.zzf && this.zzg == mediaLoadRequestData.zzg && Arrays.equals(this.zzh, mediaLoadRequestData.zzh) && C64363PNv.LIZ(this.zzj, mediaLoadRequestData.zzj) && C64363PNv.LIZ(this.zzk, mediaLoadRequestData.zzk) && C64363PNv.LIZ(this.zzl, mediaLoadRequestData.zzl) && C64363PNv.LIZ(this.zzm, mediaLoadRequestData.zzm) && this.zzn == mediaLoadRequestData.zzn) {
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
        C79057V0z.LJJZZI(parcel, 2, this.zzc, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.zzd, i, false);
        C79057V0z.LJJL(parcel, 4, this.zze);
        C79057V0z.LJJLJLI(parcel, 5, this.zzf);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 6, this.zzg);
        C79057V0z.LJJLL(parcel, 7, this.zzh);
        C79057V0z.LJJZZIII(parcel, 8, this.LJLIL, false);
        C79057V0z.LJJZZIII(parcel, 9, this.zzj, false);
        C79057V0z.LJJZZIII(parcel, 10, this.zzk, false);
        C79057V0z.LJJZZIII(parcel, 11, this.zzl, false);
        C79057V0z.LJJZZIII(parcel, 12, this.zzm, false);
        C79057V0z.LJJLJLI(parcel, 13, this.zzn);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.zzc = mediaInfo;
        this.zzd = mediaQueueData;
        this.zze = bool;
        this.zzf = j;
        this.zzg = d;
        this.zzh = jArr;
        this.zzi = jSONObject;
        this.zzj = str;
        this.zzk = str2;
        this.zzl = str3;
        this.zzm = str4;
        this.zzn = j2;
    }
}
