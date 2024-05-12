package X;

import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.X5m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84270X5m implements InterfaceC84877XSv {
    public final String LIZ;
    public final CountDownLatch LIZIZ;
    public final String LIZJ;
    public int LIZLLL = -1;
    public C84268X5k LJ;
    public C84276X5s LJFF;

    @Override // X.InterfaceC84877XSv
    public final void cancel() {
        Downloader.getInstance(EF7.LIZIZ()).removeSubThreadListener(this.LIZLLL, this.LJ);
        this.LJFF = null;
    }

    @Override // X.InterfaceC84877XSv
    public final void release() {
        Downloader.getInstance(EF7.LIZIZ()).removeSubThreadListener(this.LIZLLL, this.LJ);
        this.LJFF = null;
    }

    public C84270X5m(UrlModel urlModel, String str, String str2, CountDownLatch countDownLatch) {
        this.LIZ = str2;
        this.LIZIZ = countDownLatch;
        StringBuilder LIZ = X1D.LIZ();
        String MUSIC_RHYTHM_DIR = C66590QBm.LIZ;
        LIZ.append(MUSIC_RHYTHM_DIR);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C38352F3k.LIZJ(str));
        LIZ2.append(".json");
        LIZ.append(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(X1D.LIZIZ(LIZ), "getRhythmMusicFilePath(musicPath)");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C38352F3k.LIZJ(str));
        LIZ3.append(".json");
        String LIZIZ = X1D.LIZIZ(LIZ3);
        o.LJIIIIZZ(LIZIZ, "getMusicRhythmFileName(musicPath)");
        this.LIZJ = LIZIZ;
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        o.LJIIIIZZ(MUSIC_RHYTHM_DIR, "MUSIC_RHYTHM_DIR");
        c37246Eja.getClass();
        C37246Eja.LIZIZ(MUSIC_RHYTHM_DIR);
    }
}
