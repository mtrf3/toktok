package com.google.android.gms.cast;

import X.C64363PNv;
import X.C79057V0z;
import X.C90072ZWq;
import X.C90468Zey;
import X.C90497ZfR;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.google.android.gms.common.images.WebImage;
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
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaQueueContainerMetadata> CREATOR = new C90072ZWq();
    public int zza;
    public String zzb;
    public List<MediaMetadata> zzc;
    public List<WebImage> zzd;
    public double zze;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, Double.valueOf(this.zze)});
    }

    public final JSONObject LJJJJL() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.zza;
            if (i != 0) {
                if (i == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.zzb)) {
                jSONObject.put("title", this.zzb);
            }
            List<MediaMetadata> list = this.zzc;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<MediaMetadata> it = this.zzc.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().LJJJLIIL());
                }
                jSONObject.put("sections", jSONArray);
            }
            List<WebImage> list2 = this.zzd;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", C90497ZfR.LIZIZ(this.zzd));
            }
            jSONObject.put("containerDuration", this.zze);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public MediaQueueContainerMetadata() {
        this.zza = 0;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public /* synthetic */ MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata) {
        this.zza = mediaQueueContainerMetadata.zza;
        this.zzb = mediaQueueContainerMetadata.zzb;
        this.zzc = mediaQueueContainerMetadata.zzc;
        this.zzd = mediaQueueContainerMetadata.zzd;
        this.zze = mediaQueueContainerMetadata.zze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        if (this.zza == mediaQueueContainerMetadata.zza && TextUtils.equals(this.zzb, mediaQueueContainerMetadata.zzb) && C64363PNv.LIZ(this.zzc, mediaQueueContainerMetadata.zzc) && C64363PNv.LIZ(this.zzd, mediaQueueContainerMetadata.zzd) && this.zze == mediaQueueContainerMetadata.zze) {
            return true;
        }
        return false;
    }

    public MediaQueueContainerMetadata(int i) {
        this.zza = 0;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public static void LJJJJZ(MediaQueueContainerMetadata mediaQueueContainerMetadata, JSONObject jSONObject) {
        mediaQueueContainerMetadata.zza = 0;
        mediaQueueContainerMetadata.zzb = null;
        mediaQueueContainerMetadata.zzc = null;
        mediaQueueContainerMetadata.zzd = null;
        mediaQueueContainerMetadata.zze = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        String optString = jSONObject.optString("containerType", "");
        int hashCode = optString.hashCode();
        if (hashCode != 6924225) {
            if (hashCode == 828666841 && optString.equals("GENERIC_CONTAINER")) {
                mediaQueueContainerMetadata.zza = 0;
            }
        } else if (optString.equals("AUDIOBOOK_CONTAINER")) {
            mediaQueueContainerMetadata.zza = 1;
        }
        mediaQueueContainerMetadata.zzb = C90468Zey.LIZIZ("title", jSONObject);
        JSONArray optJSONArray = jSONObject.optJSONArray("sections");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            mediaQueueContainerMetadata.zzc = arrayList;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    MediaMetadata mediaMetadata = new MediaMetadata();
                    mediaMetadata.LJJL(optJSONObject);
                    arrayList.add(mediaMetadata);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("containerImages");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            mediaQueueContainerMetadata.zzd = arrayList2;
            try {
                arrayList2.clear();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    try {
                        arrayList2.add(new WebImage(JSONArrayProtectorUtils.getJSONObject(optJSONArray2, i2)));
                    } catch (IllegalArgumentException unused) {
                    }
                }
            } catch (JSONException unused2) {
            }
        }
        mediaQueueContainerMetadata.zze = jSONObject.optDouble("containerDuration", mediaQueueContainerMetadata.zze);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List unmodifiableList;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zza);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        List<MediaMetadata> list = this.zzc;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C79057V0z.LJLIIL(parcel, 4, unmodifiableList, false);
        List<WebImage> list3 = this.zzd;
        if (list3 != null) {
            list2 = Collections.unmodifiableList(list3);
        }
        C79057V0z.LJLIIL(parcel, 5, list2, false);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 6, this.zze);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MediaQueueContainerMetadata(int i, double d, String str, List list, List list2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = list;
        this.zzd = list2;
        this.zze = d;
    }
}
