package com.google.android.gms.cast;

import X.C37355ElL;
import X.C79057V0z;
import X.C90062ZWg;
import X.C90207Zal;
import X.C90468Zey;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public String LJLIL;
    public String zzc;
    public int zzd;
    public String zze;
    public MediaMetadata zzf;
    public long zzg;
    public List<MediaTrack> zzh;
    public TextTrackStyle zzi;
    public List<AdBreakInfo> zzj;
    public List<AdBreakClipInfo> zzk;
    public String zzl;
    public VastAdsRequest zzm;
    public long zzn;
    public String zzo;
    public String zzp;
    public String zzq;
    public String zzr;
    public JSONObject zzs;
    public final C90207Zal zzt;
    public static final long zza = -1000;
    public static final Parcelable.Creator<MediaInfo> CREATOR = new C90062ZWg();

    public final JSONObject LJJJJL() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.zzc);
            jSONObject.putOpt("contentUrl", this.zzp);
            int i = this.zzd;
            if (i != 1) {
                if (i != 2) {
                    str = "NONE";
                } else {
                    str = "LIVE";
                }
            } else {
                str = "BUFFERED";
            }
            jSONObject.put("streamType", str);
            String str2 = this.zze;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            MediaMetadata mediaMetadata = this.zzf;
            if (mediaMetadata != null) {
                jSONObject.put("metadata", mediaMetadata.LJJJLIIL());
            }
            long j = this.zzg;
            if (j <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", C90468Zey.LIZ(j));
            }
            if (this.zzh != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<MediaTrack> it = this.zzh.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().LJJJJL());
                }
                jSONObject.put("tracks", jSONArray);
            }
            TextTrackStyle textTrackStyle = this.zzi;
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.LJJJJL());
            }
            JSONObject jSONObject2 = this.zzs;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str3 = this.zzl;
            if (str3 != null) {
                jSONObject.put("entity", str3);
            }
            if (this.zzj != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<AdBreakInfo> it2 = this.zzj.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().LJJJJL());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.zzk != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<AdBreakClipInfo> it3 = this.zzk.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(it3.next().LJJJJL());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            VastAdsRequest vastAdsRequest = this.zzm;
            if (vastAdsRequest != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    String str4 = vastAdsRequest.zza;
                    if (str4 != null) {
                        jSONObject3.put("adTagUrl", str4);
                    }
                    String str5 = vastAdsRequest.zzb;
                    if (str5 != null) {
                        jSONObject3.put("adsResponse", str5);
                    }
                } catch (JSONException unused) {
                }
                jSONObject.put("vmapAdsRequest", jSONObject3);
            }
            long j2 = this.zzn;
            if (j2 != -1) {
                jSONObject.put("startAbsoluteTime", C90468Zey.LIZ(j2));
            }
            jSONObject.putOpt("atvEntity", this.zzo);
            String str6 = this.zzq;
            if (str6 != null) {
                jSONObject.put("hlsSegmentFormat", str6);
            }
            String str7 = this.zzr;
            if (str7 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str7);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, Integer.valueOf(this.zzd), this.zze, this.zzf, Long.valueOf(this.zzg), String.valueOf(this.zzs), this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, Long.valueOf(this.zzn), this.zzo, this.zzq, this.zzr});
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaInfo(org.json.JSONObject r33) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.<init>(org.json.JSONObject):void");
    }

    public final void LJJJJZ(JSONObject jSONObject) {
        long j;
        VastAdsRequest vastAdsRequest;
        String str;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = JSONObjectProtectorUtils.getString(jSONObject2, "id");
                        long j2 = JSONObjectProtectorUtils.getLong(jSONObject2, "position") * 1000;
                        boolean optBoolean = jSONObject2.optBoolean("isWatched");
                        long optLong = jSONObject2.optLong("duration") * 1000;
                        JSONArray optJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (optJSONArray != null) {
                            strArr = new String[optJSONArray.length()];
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                strArr[i2] = JSONArrayProtectorUtils.getString(optJSONArray, i2);
                            }
                        }
                        arrayList.add(new AdBreakInfo(j2, string, optLong, optBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded")));
                    } catch (JSONException e) {
                        e.getMessage();
                    }
                }
                arrayList.clear();
            }
            this.zzj = new ArrayList(arrayList);
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject, "breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONObject jSONObject3 = JSONArrayProtectorUtils.getJSONObject(jSONArray2, i3);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = JSONObjectProtectorUtils.getString(jSONObject3, "id");
                        long optLong2 = jSONObject3.optLong("duration") * 1000;
                        String LIZIZ = C90468Zey.LIZIZ("clickThroughUrl", jSONObject3);
                        String LIZIZ2 = C90468Zey.LIZIZ("contentUrl", jSONObject3);
                        String LIZIZ3 = C90468Zey.LIZIZ("mimeType", jSONObject3);
                        if (LIZIZ3 == null) {
                            LIZIZ3 = C90468Zey.LIZIZ("contentType", jSONObject3);
                        }
                        String LIZIZ4 = C90468Zey.LIZIZ("title", jSONObject3);
                        JSONObject optJSONObject = jSONObject3.optJSONObject("customData");
                        String LIZIZ5 = C90468Zey.LIZIZ("contentId", jSONObject3);
                        String LIZIZ6 = C90468Zey.LIZIZ("posterUrl", jSONObject3);
                        if (jSONObject3.has("whenSkippable")) {
                            j = ((Integer) jSONObject3.get("whenSkippable")).intValue() * 1000;
                        } else {
                            j = -1;
                        }
                        String LIZIZ7 = C90468Zey.LIZIZ("hlsSegmentFormat", jSONObject3);
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        if (optJSONObject2 == null) {
                            vastAdsRequest = null;
                        } else {
                            vastAdsRequest = new VastAdsRequest(C90468Zey.LIZIZ("adTagUrl", optJSONObject2), C90468Zey.LIZIZ("adsResponse", optJSONObject2));
                        }
                        if (optJSONObject == null || optJSONObject.length() == 0) {
                            str = null;
                        } else {
                            str = optJSONObject.toString();
                        }
                        arrayList2.add(new AdBreakClipInfo(string2, LIZIZ4, optLong2, LIZIZ2, LIZIZ3, LIZIZ, str, LIZIZ5, LIZIZ6, j, LIZIZ7, vastAdsRequest));
                    } catch (JSONException e2) {
                        e2.getMessage();
                    }
                }
                arrayList2.clear();
            }
            this.zzk = new ArrayList(arrayList2);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.zzs;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = mediaInfo.zzs;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || C37355ElL.LIZ(jSONObject, jSONObject2)) && C90468Zey.LJFF(this.zzc, mediaInfo.zzc) && this.zzd == mediaInfo.zzd && C90468Zey.LJFF(this.zze, mediaInfo.zze) && C90468Zey.LJFF(this.zzf, mediaInfo.zzf) && this.zzg == mediaInfo.zzg && C90468Zey.LJFF(this.zzh, mediaInfo.zzh) && C90468Zey.LJFF(this.zzi, mediaInfo.zzi) && C90468Zey.LJFF(this.zzj, mediaInfo.zzj) && C90468Zey.LJFF(this.zzk, mediaInfo.zzk) && C90468Zey.LJFF(this.zzl, mediaInfo.zzl) && C90468Zey.LJFF(this.zzm, mediaInfo.zzm) && this.zzn == mediaInfo.zzn && C90468Zey.LJFF(this.zzo, mediaInfo.zzo) && C90468Zey.LJFF(this.zzp, mediaInfo.zzp) && C90468Zey.LJFF(this.zzq, mediaInfo.zzq) && C90468Zey.LJFF(this.zzr, mediaInfo.zzr)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        List unmodifiableList;
        JSONObject jSONObject2 = this.zzs;
        List list = null;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.LJLIL = jSONObject;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zzc, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zzd);
        C79057V0z.LJJZZIII(parcel, 4, this.zze, false);
        C79057V0z.LJJZZI(parcel, 5, this.zzf, i, false);
        C79057V0z.LJJLJLI(parcel, 6, this.zzg);
        C79057V0z.LJLIIL(parcel, 7, this.zzh, false);
        C79057V0z.LJJZZI(parcel, 8, this.zzi, i, false);
        C79057V0z.LJJZZIII(parcel, 9, this.LJLIL, false);
        List<AdBreakInfo> list2 = this.zzj;
        if (list2 == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        C79057V0z.LJLIIL(parcel, 10, unmodifiableList, false);
        List<AdBreakClipInfo> list3 = this.zzk;
        if (list3 != null) {
            list = Collections.unmodifiableList(list3);
        }
        C79057V0z.LJLIIL(parcel, 11, list, false);
        C79057V0z.LJJZZIII(parcel, 12, this.zzl, false);
        C79057V0z.LJJZZI(parcel, 13, this.zzm, i, false);
        C79057V0z.LJJLJLI(parcel, 14, this.zzn);
        C79057V0z.LJJZZIII(parcel, 15, this.zzo, false);
        C79057V0z.LJJZZIII(parcel, 16, this.zzp, false);
        C79057V0z.LJJZZIII(parcel, 17, this.zzq, false);
        C79057V0z.LJJZZIII(parcel, 18, this.zzr, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MediaInfo(String str, int i, String str2, MediaMetadata mediaMetadata, long j, List<MediaTrack> list, TextTrackStyle textTrackStyle, String str3, List<AdBreakInfo> list2, List<AdBreakClipInfo> list3, String str4, VastAdsRequest vastAdsRequest, long j2, String str5, String str6, String str7, String str8) {
        this.zzt = new C90207Zal(this);
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
        this.zzf = mediaMetadata;
        this.zzg = j;
        this.zzh = list;
        this.zzi = textTrackStyle;
        this.LJLIL = str3;
        if (str3 != null) {
            try {
                this.zzs = new JSONObject(str3);
            } catch (JSONException unused) {
                this.zzs = null;
                this.LJLIL = null;
            }
        } else {
            this.zzs = null;
        }
        this.zzj = list2;
        this.zzk = list3;
        this.zzl = str4;
        this.zzm = vastAdsRequest;
        this.zzn = j2;
        this.zzo = str5;
        this.zzp = str6;
        this.zzq = str7;
        this.zzr = str8;
    }
}
