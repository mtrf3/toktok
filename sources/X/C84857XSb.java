package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XSb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84857XSb implements InterfaceC84275X5r {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final MusicModel LIZ;
    public final InterfaceC84870XSo LIZIZ;
    public final CountDownLatch LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final Context LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final C48325Ixt LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public C84274X5q LJIILLIIL;

    public final IAVPerformance LIZIZ() {
        return (IAVPerformance) this.LJIILL.getValue();
    }

    @Override // X.InterfaceC84275X5r
    public final void cancel() {
        C48325Ixt c48325Ixt = this.LJIIJJI;
        String musicId = this.LJII;
        o.LJIIIIZZ(musicId, "musicId");
        c48325Ixt.getClass();
        Integer num = c48325Ixt.LIZ.get(musicId);
        if (num != null) {
            if (!Downloader.getInstance(EF7.LIZIZ()).isDownloading(num.intValue())) {
                Downloader.getInstance(EF7.LIZIZ()).removeTaskSubListener(num.intValue());
            } else {
                Downloader.getInstance(EF7.LIZIZ()).cancel(num.intValue());
            }
        }
        c48325Ixt.LIZ.remove(musicId);
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
        c198517qh.LIZ.put("downloadStrategy", Integer.valueOf(MusicService.LJJLIIIJJI().LJIJJLI()));
        c198517qh.LIZ.put("is_private", Boolean.valueOf(isNeedSetCookie));
        c198517qh.LIZ.put("isUseTTPlayer", Boolean.FALSE);
        c198517qh.LIZ.put("isHitCache", Boolean.valueOf(z));
        C09900aA.LJIIJJI("aweme_music_download_error_rate", 1, c198517qh.LJ());
    }

    @Override // X.InterfaceC84275X5r
    public final void release() {
        C48325Ixt c48325Ixt = this.LJIIJJI;
        Iterator<Map.Entry<String, Integer>> it = c48325Ixt.LIZ.entrySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().getValue().intValue();
            if (!Downloader.getInstance(EF7.LIZIZ()).isDownloading(intValue)) {
                Downloader.getInstance(EF7.LIZIZ()).removeTaskSubListener(intValue);
            } else {
                Downloader.getInstance(EF7.LIZIZ()).cancel(intValue);
            }
        }
        c48325Ixt.LIZ.clear();
        this.LJIILLIIL = null;
    }

    public final XSX LIZ(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        return new XSX(i, this.LJI.getString(R.string.igp));
    }

    public static /* synthetic */ void LIZLLL(C84857XSb c84857XSb, Integer num, String str, String str2, int i) {
        String str3 = str2;
        String str4 = "";
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 32) == 0) {
            str4 = null;
        }
        c84857XSb.LIZJ(str, 0L, 0, str3, str4, num);
    }

    public final void LIZJ(String str, long j, int i, String str2, String str3, Integer num) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        C78886Uxe.LJJJJ(i2, str, this.LJII, this.LJIIIIZZ, this.LJ, str2, j, str3, i, this.LIZ.isNeedSetCookie(), this.LJIIL);
        Context appContext = this.LJI;
        o.LJIIIIZZ(appContext, "appContext");
        C48137Iur.LIZ(this.LJII, this.LJ, this.LJIIIIZZ, str, appContext);
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

    public C84857XSb(Context context, MusicModel musicModel, XTH xth, CountDownLatch countDownLatch, boolean z, boolean z2, String str, int i) {
        UrlModel url;
        boolean z3;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(musicModel, "musicModel");
        this.LIZ = musicModel;
        this.LIZIZ = xth;
        this.LIZJ = countDownLatch;
        this.LIZLLL = z2;
        this.LJ = str;
        this.LJFF = i;
        this.LJI = C16880lQ.LLLLL(context);
        this.LJII = musicModel.getMusicId();
        if (musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO) {
            url = musicModel.getReuseAudioPlayUrl();
        } else {
            url = musicModel.getUrl();
        }
        this.LJIIIIZZ = V0N.LJJIZ(url);
        this.LJIIIZ = XPS.LIZLLL().LIZ();
        if (z || countDownLatch != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJIIJ = z3;
        this.LJIIJJI = C48327Ixv.LIZ();
        this.LJIILIIL = -1L;
        this.LJIILJJIL = C221108m2.LIZIZ(OVL.LJLIL);
        this.LJIILL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 853));
    }
}
