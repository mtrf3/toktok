package com.google.android.gms.cast;

import X.C64363PNv;
import X.C79057V0z;
import X.C90073ZWr;
import X.C90210Zao;
import X.C90468Zey;
import X.C90496ZfQ;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
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
public class MediaQueueData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaQueueData> CREATOR = new C90073ZWr();
    public String zza;
    public String zzb;
    public int zzc;
    public String zzd;
    public MediaQueueContainerMetadata zze;
    public int zzf;
    public List<MediaQueueItem> zzg;
    public int zzh;
    public long zzi;

    public final void LJJJJZI() {
        this.zza = null;
        this.zzb = null;
        this.zzc = 0;
        this.zzd = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = 0;
        this.zzi = -1L;
    }

    public final JSONObject LJJJJL() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                jSONObject.put("id", this.zza);
            }
            if (!TextUtils.isEmpty(this.zzb)) {
                jSONObject.put("entity", this.zzb);
            }
            switch (this.zzc) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.zzd)) {
                jSONObject.put("name", this.zzd);
            }
            MediaQueueContainerMetadata mediaQueueContainerMetadata = this.zze;
            if (mediaQueueContainerMetadata != null) {
                jSONObject.put("containerMetadata", mediaQueueContainerMetadata.LJJJJL());
            }
            String LIZIZ = C90496ZfQ.LIZIZ(Integer.valueOf(this.zzf));
            if (LIZIZ != null) {
                jSONObject.put("repeatMode", LIZIZ);
            }
            List<MediaQueueItem> list = this.zzg;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<MediaQueueItem> it = this.zzg.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().LJJIII());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.zzh);
            long j = this.zzi;
            if (j != -1) {
                jSONObject.put("startTime", C90468Zey.LIZ(j));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), this.zzg, Integer.valueOf(this.zzh), Long.valueOf(this.zzi)});
    }

    public MediaQueueData() {
        LJJJJZI();
    }

    public /* synthetic */ MediaQueueData(MediaQueueData mediaQueueData) {
        this.zza = mediaQueueData.zza;
        this.zzb = mediaQueueData.zzb;
        this.zzc = mediaQueueData.zzc;
        this.zzd = mediaQueueData.zzd;
        this.zze = mediaQueueData.zze;
        this.zzf = mediaQueueData.zzf;
        this.zzg = mediaQueueData.zzg;
        this.zzh = mediaQueueData.zzh;
        this.zzi = mediaQueueData.zzi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueData)) {
            return false;
        }
        MediaQueueData mediaQueueData = (MediaQueueData) obj;
        if (TextUtils.equals(this.zza, mediaQueueData.zza) && TextUtils.equals(this.zzb, mediaQueueData.zzb) && this.zzc == mediaQueueData.zzc && TextUtils.equals(this.zzd, mediaQueueData.zzd) && C64363PNv.LIZ(this.zze, mediaQueueData.zze) && this.zzf == mediaQueueData.zzf && C64363PNv.LIZ(this.zzg, mediaQueueData.zzg) && this.zzh == mediaQueueData.zzh && this.zzi == mediaQueueData.zzi) {
            return true;
        }
        return false;
    }

    public static void LJJJJZ(MediaQueueData mediaQueueData, JSONObject jSONObject) {
        JSONObject optJSONObject;
        mediaQueueData.LJJJJZI();
        if (jSONObject == null) {
            return;
        }
        mediaQueueData.zza = C90468Zey.LIZIZ("id", jSONObject);
        mediaQueueData.zzb = C90468Zey.LIZIZ("entity", jSONObject);
        String optString = jSONObject.optString("queueType");
        switch (optString.hashCode()) {
            case -1803151310:
                if (optString.equals("PODCAST_SERIES")) {
                    mediaQueueData.zzc = 5;
                    break;
                }
                break;
            case -1758903120:
                if (optString.equals("RADIO_STATION")) {
                    mediaQueueData.zzc = 4;
                    break;
                }
                break;
            case -1632865838:
                if (optString.equals("PLAYLIST")) {
                    mediaQueueData.zzc = 2;
                    break;
                }
                break;
            case -1319760993:
                if (optString.equals("AUDIOBOOK")) {
                    mediaQueueData.zzc = 3;
                    break;
                }
                break;
            case -1088524588:
                if (optString.equals("TV_SERIES")) {
                    mediaQueueData.zzc = 6;
                    break;
                }
                break;
            case 62359119:
                if (optString.equals("ALBUM")) {
                    mediaQueueData.zzc = 1;
                    break;
                }
                break;
            case 73549584:
                if (optString.equals("MOVIE")) {
                    mediaQueueData.zzc = 9;
                    break;
                }
                break;
            case 393100598:
                if (optString.equals("VIDEO_PLAYLIST")) {
                    mediaQueueData.zzc = 7;
                    break;
                }
                break;
            case 902303413:
                if (optString.equals("LIVE_TV")) {
                    mediaQueueData.zzc = 8;
                    break;
                }
                break;
        }
        mediaQueueData.zzd = C90468Zey.LIZIZ("name", jSONObject);
        if (jSONObject.has("containerMetadata") && (optJSONObject = jSONObject.optJSONObject("containerMetadata")) != null) {
            C90210Zao c90210Zao = new C90210Zao();
            MediaQueueContainerMetadata.LJJJJZ(c90210Zao.LIZ, optJSONObject);
            mediaQueueData.zze = new MediaQueueContainerMetadata(c90210Zao.LIZ);
        }
        Integer LIZ = C90496ZfQ.LIZ(jSONObject.optString("repeatMode"));
        if (LIZ != null) {
            mediaQueueData.zzf = LIZ.intValue();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            mediaQueueData.zzg = arrayList;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    try {
                        arrayList.add(new MediaQueueItem(optJSONObject2));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        mediaQueueData.zzh = jSONObject.optInt("startIndex", mediaQueueData.zzh);
        if (!jSONObject.has("startTime")) {
            return;
        }
        mediaQueueData.zzi = C90468Zey.LIZJ(jSONObject.optDouble("startTime", mediaQueueData.zzi));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List unmodifiableList;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzc);
        C79057V0z.LJJZZIII(parcel, 5, this.zzd, false);
        C79057V0z.LJJZZI(parcel, 6, this.zze, i, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 7, this.zzf);
        List<MediaQueueItem> list = this.zzg;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C79057V0z.LJLIIL(parcel, 8, unmodifiableList, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 9, this.zzh);
        C79057V0z.LJJLJLI(parcel, 10, this.zzi);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MediaQueueData(String str, String str2, int i, String str3, MediaQueueContainerMetadata mediaQueueContainerMetadata, int i2, List<MediaQueueItem> list, int i3, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = str3;
        this.zze = mediaQueueContainerMetadata;
        this.zzf = i2;
        this.zzg = list;
        this.zzh = i3;
        this.zzi = j;
    }
}
