package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Zkl, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90827Zkl extends C90485ZfF {
    public static final String LJJIII = "urn:x-cast:".concat("com.google.cast.media");
    public long LJ;
    public MediaStatus LJFF;
    public Long LJI;
    public C90128ZYu LJII;
    public int LJIIIIZZ;
    public final C90483ZfD LJIIIZ;
    public final C90483ZfD LJIIJ;
    public final C90483ZfD LJIIJJI;
    public final C90483ZfD LJIIL;
    public final C90483ZfD LJIILIIL;
    public final C90483ZfD LJIILJJIL;
    public final C90483ZfD LJIILL;
    public final C90483ZfD LJIILLIIL;
    public final C90483ZfD LJIIZILJ;
    public final C90483ZfD LJIJ;
    public final C90483ZfD LJIJI;
    public final C90483ZfD LJIJJ;
    public final C90483ZfD LJIJJLI;
    public final C90483ZfD LJIL;
    public final C90483ZfD LJJ;
    public final C90483ZfD LJJI;
    public final C90483ZfD LJJIFFI;
    public C67649Qgn<SessionState> LJJII;

    public final long LJIILJJIL() {
        MediaLiveSeekableRange mediaLiveSeekableRange;
        MediaStatus mediaStatus = this.LJFF;
        if (mediaStatus == null || (mediaLiveSeekableRange = mediaStatus.zzu) == null) {
            return 0L;
        }
        long j = mediaLiveSeekableRange.zzc;
        if (!mediaLiveSeekableRange.zze) {
            return LJ(1.0d, j, -1L);
        }
        return j;
    }

    public final long LJIILL() {
        MediaInfo mediaInfo;
        MediaStatus mediaStatus = this.LJFF;
        MediaInfo mediaInfo2 = null;
        if (mediaStatus != null) {
            mediaInfo2 = mediaStatus.zza;
        }
        long j = 0;
        if (mediaInfo2 == null || mediaStatus == null) {
            return 0L;
        }
        Long l = this.LJI;
        if (l != null) {
            if (l.equals(4294967296000L)) {
                MediaStatus mediaStatus2 = this.LJFF;
                if (mediaStatus2.zzu != null) {
                    return Math.min(l.longValue(), LJIILJJIL());
                }
                MediaInfo mediaInfo3 = mediaStatus2.zza;
                if (mediaInfo3 == null || mediaInfo3.zzg >= 0) {
                    long longValue = l.longValue();
                    MediaStatus mediaStatus3 = this.LJFF;
                    if (mediaStatus3 != null && (mediaInfo = mediaStatus3.zza) != null) {
                        j = mediaInfo.zzg;
                    }
                    return Math.min(longValue, j);
                }
            }
            return l.longValue();
        }
        if (this.LJ == 0) {
            return 0L;
        }
        double d = mediaStatus.zzd;
        long j2 = mediaStatus.zzg;
        int i = mediaStatus.zze;
        if (d == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || i != 2) {
            return j2;
        }
        return LJ(d, j2, mediaInfo2.zzg);
    }

    public C90827Zkl() {
        super(LJJIII);
        this.LJIIIIZZ = -1;
        C90483ZfD c90483ZfD = new C90483ZfD(86400000L);
        this.LJIIIZ = c90483ZfD;
        C90483ZfD c90483ZfD2 = new C90483ZfD(86400000L);
        this.LJIIJ = c90483ZfD2;
        C90483ZfD c90483ZfD3 = new C90483ZfD(86400000L);
        this.LJIIJJI = c90483ZfD3;
        C90483ZfD c90483ZfD4 = new C90483ZfD(86400000L);
        this.LJIIL = c90483ZfD4;
        C90483ZfD c90483ZfD5 = new C90483ZfD(10000L);
        this.LJIILIIL = c90483ZfD5;
        C90483ZfD c90483ZfD6 = new C90483ZfD(86400000L);
        this.LJIILJJIL = c90483ZfD6;
        C90483ZfD c90483ZfD7 = new C90483ZfD(86400000L);
        this.LJIILL = c90483ZfD7;
        C90483ZfD c90483ZfD8 = new C90483ZfD(86400000L);
        this.LJIILLIIL = c90483ZfD8;
        C90483ZfD c90483ZfD9 = new C90483ZfD(86400000L);
        this.LJIIZILJ = c90483ZfD9;
        C90483ZfD c90483ZfD10 = new C90483ZfD(86400000L);
        C90483ZfD c90483ZfD11 = new C90483ZfD(86400000L);
        this.LJIJ = c90483ZfD11;
        C90483ZfD c90483ZfD12 = new C90483ZfD(86400000L);
        this.LJIJI = c90483ZfD12;
        C90483ZfD c90483ZfD13 = new C90483ZfD(86400000L);
        this.LJIJJ = c90483ZfD13;
        C90483ZfD c90483ZfD14 = new C90483ZfD(86400000L);
        C90483ZfD c90483ZfD15 = new C90483ZfD(86400000L);
        this.LJIJJLI = c90483ZfD15;
        C90483ZfD c90483ZfD16 = new C90483ZfD(86400000L);
        this.LJJ = c90483ZfD16;
        this.LJIL = new C90483ZfD(86400000L);
        C90483ZfD c90483ZfD17 = new C90483ZfD(86400000L);
        this.LJJI = c90483ZfD17;
        C90483ZfD c90483ZfD18 = new C90483ZfD(86400000L);
        C90483ZfD c90483ZfD19 = new C90483ZfD(86400000L);
        this.LJJIFFI = c90483ZfD19;
        LIZ(c90483ZfD);
        LIZ(c90483ZfD2);
        LIZ(c90483ZfD3);
        LIZ(c90483ZfD4);
        LIZ(c90483ZfD5);
        LIZ(c90483ZfD6);
        LIZ(c90483ZfD7);
        LIZ(c90483ZfD8);
        LIZ(c90483ZfD9);
        LIZ(c90483ZfD10);
        LIZ(c90483ZfD11);
        LIZ(c90483ZfD12);
        LIZ(c90483ZfD13);
        LIZ(c90483ZfD14);
        LIZ(c90483ZfD15);
        LIZ(c90483ZfD16);
        LIZ(c90483ZfD16);
        LIZ(c90483ZfD17);
        LIZ(c90483ZfD18);
        LIZ(c90483ZfD19);
        LJI();
    }

    public final void LJI() {
        this.LJ = 0L;
        this.LJFF = null;
        Iterator<C90483ZfD> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            it.next().LJFF(2002);
        }
    }

    public final void LJIIIIZZ() {
        C90128ZYu c90128ZYu = this.LJII;
        if (c90128ZYu != null) {
            c90128ZYu.LIZ.getClass();
            Iterator it = ((CopyOnWriteArrayList) c90128ZYu.LIZ.LJI).iterator();
            while (it.hasNext()) {
                ((InterfaceC90123ZYp) it.next()).LIZIZ();
            }
            Iterator it2 = ((CopyOnWriteArrayList) c90128ZYu.LIZ.LJII).iterator();
            while (it2.hasNext()) {
                ((AbstractC90122ZYo) it2.next()).LIZJ();
            }
        }
    }

    public final void LJIIIZ() {
        C90128ZYu c90128ZYu = this.LJII;
        if (c90128ZYu != null) {
            Iterator it = ((CopyOnWriteArrayList) c90128ZYu.LIZ.LJI).iterator();
            while (it.hasNext()) {
                ((InterfaceC90123ZYp) it.next()).LJI();
            }
            Iterator it2 = ((CopyOnWriteArrayList) c90128ZYu.LIZ.LJII).iterator();
            while (it2.hasNext()) {
                ((AbstractC90122ZYo) it2.next()).LIZLLL();
            }
        }
    }

    public final void LJIIJ() {
        C90128ZYu c90128ZYu = this.LJII;
        if (c90128ZYu != null) {
            Iterator it = ((CopyOnWriteArrayList) c90128ZYu.LIZ.LJI).iterator();
            while (it.hasNext()) {
                ((InterfaceC90123ZYp) it.next()).LJIIJ();
            }
            Iterator it2 = ((CopyOnWriteArrayList) c90128ZYu.LIZ.LJII).iterator();
            while (it2.hasNext()) {
                ((AbstractC90122ZYo) it2.next()).LJ();
            }
        }
    }

    public final void LJIIJJI() {
        C90128ZYu c90128ZYu = this.LJII;
        if (c90128ZYu != null) {
            c90128ZYu.LIZ.getClass();
            C90639Zhj c90639Zhj = c90128ZYu.LIZ;
            for (C90130ZYw c90130ZYw : ((ConcurrentHashMap) c90639Zhj.LJIIIZ).values()) {
                if (c90639Zhj.LJIIIZ() && !c90130ZYw.LIZLLL) {
                    c90130ZYw.LJ.LIZIZ.removeCallbacks(c90130ZYw.LIZJ);
                    c90130ZYw.LIZLLL = true;
                    c90130ZYw.LJ.LIZIZ.postDelayed(c90130ZYw.LIZJ, c90130ZYw.LIZIZ);
                } else if (!c90639Zhj.LJIIIZ() && c90130ZYw.LIZLLL) {
                    c90130ZYw.LJ.LIZIZ.removeCallbacks(c90130ZYw.LIZJ);
                    c90130ZYw.LIZLLL = false;
                }
                if (c90130ZYw.LIZLLL && (c90639Zhj.LJIIJ() || c90639Zhj.LJJI() || c90639Zhj.LJIILIIL() || c90639Zhj.LJIIL())) {
                    c90639Zhj.LJJII(c90130ZYw.LIZ);
                }
            }
            Iterator it = ((CopyOnWriteArrayList) c90128ZYu.LIZ.LJI).iterator();
            while (it.hasNext()) {
                ((InterfaceC90123ZYp) it.next()).LIZLLL();
            }
            Iterator it2 = ((CopyOnWriteArrayList) c90128ZYu.LIZ.LJII).iterator();
            while (it2.hasNext()) {
                ((AbstractC90122ZYo) it2.next()).LJI();
            }
        }
    }

    public final void LJIILIIL() {
        synchronized (this.LIZLLL) {
            Iterator<C90483ZfD> it = this.LIZLLL.iterator();
            while (it.hasNext()) {
                it.next().LJFF(2002);
            }
        }
        LJI();
    }

    public final long LJIILLIIL() {
        MediaStatus mediaStatus = this.LJFF;
        if (mediaStatus != null) {
            return mediaStatus.zzb;
        }
        throw new C90478Zf8();
    }

    public static C90479Zf9 LJFF(JSONObject jSONObject) {
        MediaError LJJJJL = MediaError.LJJJJL(jSONObject);
        C90479Zf9 c90479Zf9 = new C90479Zf9();
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        c90479Zf9.LIZ = LJJJJL;
        return c90479Zf9;
    }

    public static int[] LJIIL(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = JSONArrayProtectorUtils.getInt(jSONArray, i);
        }
        return iArr;
    }

    public final void LJII(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.LJIIIIZZ = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        C90469Zez c90469Zez = this.LIZ;
        str.concat(" message is missing a sequence number.");
        c90469Zez.getClass();
    }

    public final long LJ(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJ;
        if (elapsedRealtime < 0 || elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public final void LIZLLL(InterfaceC90481ZfB interfaceC90481ZfB, int i, long j, int i2, Integer num, JSONObject jSONObject) {
        if (j == -1 || j >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long LIZIZ = LIZIZ();
            try {
                jSONObject2.put("requestId", LIZIZ);
                jSONObject2.put("type", "QUEUE_UPDATE");
                jSONObject2.put("mediaSessionId", LJIILLIIL());
                if (i != 0) {
                    jSONObject2.put("currentItemId", i);
                }
                if (i2 != 0) {
                    jSONObject2.put("jump", i2);
                }
                String LIZIZ2 = C90496ZfQ.LIZIZ(num);
                if (LIZIZ2 != null) {
                    jSONObject2.put("repeatMode", LIZIZ2);
                }
                if (j != -1) {
                    jSONObject2.put("currentTime", C90468Zey.LIZ(j));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
                int i3 = this.LJIIIIZZ;
                if (i3 != -1) {
                    jSONObject2.put("sequenceNumber", i3);
                }
            } catch (JSONException unused) {
            }
            LIZJ(LIZIZ, jSONObject2.toString());
            this.LJIJI.LIZ(LIZIZ, new C90826Zkk(this, interfaceC90481ZfB));
            return;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("playPosition cannot be negative: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
