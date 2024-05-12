package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.XSa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84856XSa implements InterfaceC84877XSv {
    public final MusicModel LIZ;
    public final InterfaceC84273X5p LIZIZ;
    public final CountDownLatch LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final Context LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final C58238MtO LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public C84276X5s LJIILLIIL;

    public final IAVPerformance LIZIZ() {
        return (IAVPerformance) this.LJIILL.getValue();
    }

    @Override // X.InterfaceC84877XSv
    public final void cancel() {
        C58238MtO c58238MtO = this.LJIIJJI;
        String musicId = this.LJII;
        o.LJIIIIZZ(musicId, "musicId");
        c58238MtO.getClass();
        Integer num = c58238MtO.LIZ.get(musicId);
        if (num != null) {
            if (!Downloader.getInstance(EF7.LIZIZ()).isDownloading(num.intValue())) {
                Downloader.getInstance(EF7.LIZIZ()).removeTaskSubListener(num.intValue());
            } else {
                Downloader.getInstance(EF7.LIZIZ()).cancel(num.intValue());
            }
        }
        c58238MtO.LIZ.remove(musicId);
        this.LIZIZ.onCancel();
        String str = this.LJ;
        String str2 = this.LJII;
        String str3 = this.LJIIIIZZ;
        boolean isNeedSetCookie = this.LIZ.isNeedSetCookie();
        boolean z = this.LJIIL;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("trace", str);
        c198517qh.LIZ.put("music_id", str2);
        c198517qh.LIZ.put("fileUrlList", str3);
        c198517qh.LIZ.put("downloadStrategy", 3);
        c198517qh.LIZ.put("is_private", Boolean.valueOf(isNeedSetCookie));
        c198517qh.LIZ.put("isUseTTPlayer", Boolean.FALSE);
        c198517qh.LIZ.put("isHitCache", Boolean.valueOf(z));
        C09900aA.LJIIJJI("aweme_music_download_error_rate", 1, c198517qh.LJ());
    }

    @Override // X.InterfaceC84877XSv
    public final void release() {
        C58238MtO c58238MtO = this.LJIIJJI;
        Iterator<Map.Entry<String, Integer>> it = c58238MtO.LIZ.entrySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().getValue().intValue();
            if (!Downloader.getInstance(EF7.LIZIZ()).isDownloading(intValue)) {
                Downloader.getInstance(EF7.LIZIZ()).removeTaskSubListener(intValue);
            } else {
                Downloader.getInstance(EF7.LIZIZ()).cancel(intValue);
            }
        }
        c58238MtO.LIZ.clear();
        this.LJIILLIIL = null;
    }

    public final XAL LIZ(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        return new XAL(i, this.LJI.getString(R.string.igp));
    }

    public static /* synthetic */ void LIZLLL(C84856XSa c84856XSa, Integer num, String str, String str2, int i) {
        String str3 = str2;
        String str4 = "";
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 32) == 0) {
            str4 = null;
        }
        c84856XSa.LIZJ(str, 0L, 0, str3, str4, num);
    }

    public final void LIZJ(String str, long j, int i, String str2, String str3, Integer num) {
        int i2;
        boolean z;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        String str4 = this.LJII;
        String str5 = this.LJIIIIZZ;
        String str6 = this.LJ;
        boolean isNeedSetCookie = this.LIZ.isNeedSetCookie();
        boolean z2 = this.LJIIL;
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            C198517qh c198517qh = new C198517qh();
            String str7 = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    str7 = new java.net.URI(str2).getHost();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    C36922EeM.LJ("music url illegal");
                }
            }
            c198517qh.LIZ.put("hostname", str7);
            c198517qh.LIZ.put("trace", str6);
            c198517qh.LIZ.put("music_id", str4);
            c198517qh.LIZ.put("fileUrlList", str5);
            c198517qh.LIZ.put("downloadStrategy", 3);
            c198517qh.LIZ.put("fileMagic", str3);
            c198517qh.LIZ.put("code", String.valueOf(i));
            c198517qh.LIZ.put("size", Long.valueOf(j));
            c198517qh.LIZ.put("is_private", Boolean.valueOf(isNeedSetCookie));
            c198517qh.LIZ.put("isUseTTPlayer", Boolean.FALSE);
            c198517qh.LIZ.put("errorDesc", str);
            c198517qh.LIZ.put("isHitCache", Boolean.valueOf(z2));
            C09900aA.LJIIJJI("aweme_music_download_error_rate", i2, c198517qh.LJ());
        } else {
            z = false;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            C48387Iyt c48387Iyt = C48136Iuq.LIZ;
            jSONObject.put("netWorkQuality", c48387Iyt.LIZIZ().toString());
            jSONObject.put("netWorkSpeed", (int) c48387Iyt.LIZJ());
            jSONObject.put("errorDesc", str);
            jSONObject.put("errorUrl", str2);
            jSONObject.put("is_network_available", z);
            jSONObject.put("isUseTTPlayer", false);
            jSONObject.put("isHitCache", z2);
            FUA.LIZIZ("aweme_music_download_log", "aweme_music", jSONObject);
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJ);
        LIZ.append(", MusicDownloadError: errocode=");
        LIZ.append(num);
        LIZ.append("errorMsg=");
        LIZ.append(str);
        LIZ.append("musicId=");
        LIZ.append(this.LJII);
        LIZ.append(", url=");
        YE1.LIZLLL(LIZ, this.LJIIIIZZ, ", curUrl=", str2, " isPrivate=");
        LIZ.append(this.LIZ.isNeedSetCookie());
        LIZ.append(" fileMagic=");
        LIZ.append(str3);
        LIZ.append(" fileSize=");
        C06510Nj.LIZIZ(LIZ, j, " veErrorCode=", i);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
    }

    public C84856XSa(Context context, MusicModel musicModel, XTK xtk, CountDownLatch countDownLatch, boolean z, boolean z2, String str, int i) {
        boolean z3;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(musicModel, "musicModel");
        this.LIZ = musicModel;
        this.LIZIZ = xtk;
        this.LIZJ = countDownLatch;
        this.LIZLLL = z2;
        this.LJ = str;
        this.LJFF = i;
        this.LJI = C16880lQ.LLLLL(context);
        this.LJII = musicModel.getMusicId();
        this.LJIIIIZZ = C44384HbQ.LLJIJIL(musicModel.getUrl());
        this.LJIIIZ = C66589QBl.LIZIZ().LIZ();
        if (z || countDownLatch != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJIIJ = z3;
        this.LJIIJJI = new C58238MtO();
        this.LJIILIIL = -1L;
        this.LJIILJJIL = C221108m2.LIZIZ(OVK.LJLIL);
        this.LJIILL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 865));
    }
}
