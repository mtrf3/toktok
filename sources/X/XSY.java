package X;

import Y.ACallableS37S0110000_15;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XSY implements IAVInfoService.IGetInfoCallback<Integer> {
    public final /* synthetic */ C84857XSb LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ Boolean LJFF;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Integer num) {
        int intValue = num.intValue();
        this.LIZ.LIZIZ().step("av_music_download", "music audioLegal");
        if (intValue < 0) {
            C84857XSb c84857XSb = this.LIZ;
            c84857XSb.getClass();
            C10K.LIZIZ(new ACallableS37S0110000_15(c84857XSb, false, 0), C10K.LJIIIIZZ, null);
            C84857XSb c84857XSb2 = this.LIZ;
            long j = this.LIZIZ;
            C37246Eja c37246Eja = C37247Ejb.LIZIZ;
            String str = this.LIZJ;
            c37246Eja.getClass();
            c84857XSb2.LIZJ("", j, intValue, "", C37246Eja.LJI(str), -2);
            C84857XSb c84857XSb3 = this.LIZ;
            c84857XSb3.LIZIZ.LIZ(c84857XSb3.LIZ(-2));
            return;
        }
        C84857XSb c84857XSb4 = this.LIZ;
        long j2 = this.LIZLLL;
        long j3 = this.LIZIZ;
        C78886Uxe.LJJJJI(j2, j3, c84857XSb4.LJIIIIZZ, c84857XSb4.LJ, c84857XSb4.LIZ.isNeedSetCookie(), c84857XSb4.LJIIL);
        C48137Iur.LIZJ(c84857XSb4.LJII, Long.valueOf(j2), Long.valueOf(j3), c84857XSb4.LJ, c84857XSb4.LJIIIIZZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c84857XSb4.LJ);
        LIZ.append(", MusicDownloadSuccess: musicId=");
        LIZ.append(c84857XSb4.LJII);
        LIZ.append(", url=");
        YE1.LIZLLL(LIZ, c84857XSb4.LJIIIIZZ, ", curUrl=", "", " isPrivate=");
        LIZ.append(c84857XSb4.LIZ.isNeedSetCookie());
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        C84857XSb c84857XSb5 = this.LIZ;
        long j4 = this.LJ;
        String str2 = this.LIZJ;
        Boolean bool = this.LJFF;
        c84857XSb5.LIZIZ().step("av_music_download", "audio2wavebean");
        CountDownLatch countDownLatch = c84857XSb5.LIZJ;
        if (countDownLatch != null) {
            try {
                countDownLatch.await(1500L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Download Music, countDownLatch await error: ");
                LIZ2.append(e);
                H7B.LIZJ(X1D.LIZIZ(LIZ2));
            }
        }
        c84857XSb5.LIZIZ().step("av_music_download", "await countDownLatch");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Download Music get wave data duration: ");
        LIZ3.append(System.currentTimeMillis() - j4);
        LIZ3.append(" currentTime: ");
        LIZ3.append(System.currentTimeMillis());
        H7B.LIZ(X1D.LIZIZ(LIZ3));
        if (c84857XSb5.LJIIJ) {
            c84857XSb5.LIZIZ.onProgress(100);
        }
        c84857XSb5.LIZIZ().end("av_music_download", "fetch end");
        C84274X5q c84274X5q = c84857XSb5.LJIILLIIL;
        if (c84274X5q != null) {
            String musicId = c84857XSb5.LJII;
            o.LJIIIIZZ(musicId, "musicId");
            c84274X5q.LIZLLL(musicId, c84857XSb5);
        }
        c84857XSb5.LIZIZ.LIZIZ(str2, null, bool);
    }

    public XSY(C84857XSb c84857XSb, long j, String str, long j2, long j3, Boolean bool) {
        this.LIZ = c84857XSb;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = bool;
    }
}
