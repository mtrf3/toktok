package com.google.android.gms.cast;

import X.C37355ElL;
import X.C64363PNv;
import X.C79057V0z;
import X.C90075ZWt;
import X.C90214Zas;
import X.C90468Zey;
import X.C90469Zez;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class MediaStatus extends AbstractSafeParcelable {
    public static final long COMMAND_SKIP_BACKWARD = 32;
    public static final long COMMAND_SKIP_FORWARD = 16;
    public String LJLIL;
    public MediaInfo zza;
    public long zzb;
    public int zzc;
    public double zzd;
    public int zze;
    public int zzf;
    public long zzg;
    public long zzh;
    public double zzi;
    public boolean zzj;
    public long[] zzk;
    public int zzl;
    public int zzm;
    public JSONObject zzo;
    public int zzp;
    public boolean zzr;
    public AdBreakStatus zzs;
    public VideoInfo zzt;
    public MediaLiveSeekableRange zzu;
    public MediaQueueData zzv;
    public static final C90469Zez zzw = new C90469Zez("MediaStatus");
    public static final Parcelable.Creator<MediaStatus> CREATOR = new C90075ZWt();
    public final List<MediaQueueItem> zzq = new ArrayList();
    public final SparseArray<Integer> zzx = new SparseArray<>();
    public final C90214Zas zzy = new C90214Zas(this);

    public final boolean LJJJJZI(long j) {
        return (j & this.zzh) != 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Long.valueOf(this.zzb), Integer.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze), Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Double.valueOf(this.zzi), Boolean.valueOf(this.zzj), Integer.valueOf(Arrays.hashCode(this.zzk)), Integer.valueOf(this.zzl), Integer.valueOf(this.zzm), String.valueOf(this.zzo), Integer.valueOf(this.zzp), this.zzq, Boolean.valueOf(this.zzr), this.zzs, this.zzt, this.zzu, this.zzv});
    }

    public final Integer LJJJJL(int i) {
        return this.zzx.get(i);
    }

    public final MediaQueueItem LJJJJZ(int i) {
        Integer num = this.zzx.get(i);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) ListProtector.get(this.zzq, num.intValue());
    }

    public final void LJJL(List<MediaQueueItem> list) {
        this.zzq.clear();
        this.zzx.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                MediaQueueItem mediaQueueItem = (MediaQueueItem) ListProtector.get(list, i);
                this.zzq.add(mediaQueueItem);
                this.zzx.put(mediaQueueItem.zzc, Integer.valueOf(i));
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        if (this.zzo != null) {
            z = false;
        } else {
            z = true;
        }
        if (mediaStatus.zzo != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2 && this.zzb == mediaStatus.zzb && this.zzc == mediaStatus.zzc && this.zzd == mediaStatus.zzd && this.zze == mediaStatus.zze && this.zzf == mediaStatus.zzf && this.zzg == mediaStatus.zzg && this.zzi == mediaStatus.zzi && this.zzj == mediaStatus.zzj && this.zzl == mediaStatus.zzl && this.zzm == mediaStatus.zzm && this.zzp == mediaStatus.zzp && Arrays.equals(this.zzk, mediaStatus.zzk) && C90468Zey.LJFF(Long.valueOf(this.zzh), Long.valueOf(mediaStatus.zzh)) && C90468Zey.LJFF(this.zzq, mediaStatus.zzq) && C90468Zey.LJFF(this.zza, mediaStatus.zza) && (((jSONObject = this.zzo) == null || (jSONObject2 = mediaStatus.zzo) == null || C37355ElL.LIZ(jSONObject, jSONObject2)) && this.zzr == mediaStatus.zzr && C90468Zey.LJFF(this.zzs, mediaStatus.zzs) && C90468Zey.LJFF(this.zzt, mediaStatus.zzt) && C90468Zey.LJFF(this.zzu, mediaStatus.zzu) && C64363PNv.LIZ(this.zzv, mediaStatus.zzv))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0316, code lost:
    
        if (r12 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0328, code lost:
    
        if (r1 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03a1, code lost:
    
        if (r1.zzd != null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a5, code lost:
    
        if (r1.zze == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03a7, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x039d, code lost:
    
        if (r1 != null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01fb, code lost:
    
        if (r1 != 3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0219, code lost:
    
        if (r9 != 2) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x021c, code lost:
    
        if (r0 == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011f, code lost:
    
        if (r13.zzk != null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0383  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJJLIIL(int r14, org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaStatus.LJJJLIIL(int, org.json.JSONObject):int");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.zzo;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.LJLIL = jSONObject;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zza, i, false);
        C79057V0z.LJJLJLI(parcel, 3, this.zzb);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzc);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 5, this.zzd);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 6, this.zze);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 7, this.zzf);
        C79057V0z.LJJLJLI(parcel, 8, this.zzg);
        C79057V0z.LJJLJLI(parcel, 9, this.zzh);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 10, this.zzi);
        C79057V0z.LJJJZ(parcel, 11, this.zzj);
        C79057V0z.LJJLL(parcel, 12, this.zzk);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 13, this.zzl);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 14, this.zzm);
        C79057V0z.LJJZZIII(parcel, 15, this.LJLIL, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 16, this.zzp);
        C79057V0z.LJLIIL(parcel, 17, this.zzq, false);
        C79057V0z.LJJJZ(parcel, 18, this.zzr);
        C79057V0z.LJJZZI(parcel, 19, this.zzs, i, false);
        C79057V0z.LJJZZI(parcel, 20, this.zzt, i, false);
        C79057V0z.LJJZZI(parcel, 21, this.zzu, i, false);
        C79057V0z.LJJZZI(parcel, 22, this.zzv, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MediaStatus(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List<MediaQueueItem> list, boolean z2, AdBreakStatus adBreakStatus, VideoInfo videoInfo, MediaLiveSeekableRange mediaLiveSeekableRange, MediaQueueData mediaQueueData) {
        this.zza = mediaInfo;
        this.zzb = j;
        this.zzc = i;
        this.zzd = d;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = j2;
        this.zzh = j3;
        this.zzi = d2;
        this.zzj = z;
        this.zzk = jArr;
        this.zzl = i4;
        this.zzm = i5;
        this.LJLIL = str;
        if (str != null) {
            try {
                this.zzo = new JSONObject(str);
            } catch (JSONException unused) {
                this.zzo = null;
                this.LJLIL = null;
            }
        } else {
            this.zzo = null;
        }
        this.zzp = i6;
        if (list != null && !list.isEmpty()) {
            LJJL(list);
        }
        this.zzr = z2;
        this.zzs = adBreakStatus;
        this.zzt = videoInfo;
        this.zzu = mediaLiveSeekableRange;
        this.zzv = mediaQueueData;
    }
}
