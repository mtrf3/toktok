package com.google.android.gms.cast;

import X.C79057V0z;
import X.C90056ZWa;
import X.C90468Zey;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class AdBreakClipInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdBreakClipInfo> CREATOR = new C90056ZWa();
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public String zzg;
    public final String zzh;
    public final String zzi;
    public final long zzj;
    public final String zzk;
    public final VastAdsRequest zzl;
    public JSONObject zzm;

    public final JSONObject LJJJJL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.zza);
            jSONObject.put("duration", C90468Zey.LIZ(this.zzc));
            long j = this.zzj;
            if (j != -1) {
                jSONObject.put("whenSkippable", C90468Zey.LIZ(j));
            }
            String str = this.zzh;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.zze;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.zzb;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.zzd;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.zzf;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.zzm;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.zzi;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.zzk;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            VastAdsRequest vastAdsRequest = this.zzl;
            if (vastAdsRequest != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    String str8 = vastAdsRequest.zza;
                    if (str8 != null) {
                        jSONObject3.put("adTagUrl", str8);
                    }
                    String str9 = vastAdsRequest.zzb;
                    if (str9 != null) {
                        jSONObject3.put("adsResponse", str9);
                    }
                } catch (JSONException unused) {
                }
                jSONObject.put("vastAdsRequest", jSONObject3);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Long.valueOf(this.zzc), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, Long.valueOf(this.zzj), this.zzk, this.zzl});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakClipInfo)) {
            return false;
        }
        AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
        if (C90468Zey.LJFF(this.zza, adBreakClipInfo.zza) && C90468Zey.LJFF(this.zzb, adBreakClipInfo.zzb) && this.zzc == adBreakClipInfo.zzc && C90468Zey.LJFF(this.zzd, adBreakClipInfo.zzd) && C90468Zey.LJFF(this.zze, adBreakClipInfo.zze) && C90468Zey.LJFF(this.zzf, adBreakClipInfo.zzf) && C90468Zey.LJFF(this.zzg, adBreakClipInfo.zzg) && C90468Zey.LJFF(this.zzh, adBreakClipInfo.zzh) && C90468Zey.LJFF(this.zzi, adBreakClipInfo.zzi) && this.zzj == adBreakClipInfo.zzj && C90468Zey.LJFF(this.zzk, adBreakClipInfo.zzk) && C90468Zey.LJFF(this.zzl, adBreakClipInfo.zzl)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJLJLI(parcel, 4, this.zzc);
        C79057V0z.LJJZZIII(parcel, 5, this.zzd, false);
        C79057V0z.LJJZZIII(parcel, 6, this.zze, false);
        C79057V0z.LJJZZIII(parcel, 7, this.zzf, false);
        C79057V0z.LJJZZIII(parcel, 8, this.zzg, false);
        C79057V0z.LJJZZIII(parcel, 9, this.zzh, false);
        C79057V0z.LJJZZIII(parcel, 10, this.zzi, false);
        C79057V0z.LJJLJLI(parcel, 11, this.zzj);
        C79057V0z.LJJZZIII(parcel, 12, this.zzk, false);
        C79057V0z.LJJZZI(parcel, 13, this.zzl, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AdBreakClipInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, VastAdsRequest vastAdsRequest) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
        this.zzg = str6;
        this.zzh = str7;
        this.zzi = str8;
        this.zzj = j2;
        this.zzk = str9;
        this.zzl = vastAdsRequest;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.zzm = new JSONObject(this.zzg);
                return;
            } catch (JSONException e) {
                e.getMessage();
                this.zzg = null;
                this.zzm = new JSONObject();
                return;
            }
        }
        this.zzm = new JSONObject();
    }
}
