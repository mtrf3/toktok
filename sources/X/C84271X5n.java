package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.IDDListenerS59S0100000_15;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.X5n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84271X5n implements InterfaceC84275X5r {
    public final UrlModel LIZ;
    public final String LIZIZ;
    public final CountDownLatch LIZJ;
    public final String LIZLLL;
    public int LJ = -1;
    public IDDListenerS59S0100000_15 LJFF;
    public C84274X5q LJI;

    public final void LIZ() {
        List<String> list;
        UrlModel urlModel = this.LIZ;
        if (urlModel == null || TextUtils.isEmpty(urlModel.getUri()) || !(!C79004UzY.LJJIFFI(urlModel.getUrlList()))) {
            CountDownLatch countDownLatch = this.LIZJ;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Download Music Beat illegal beat url: ");
            LIZ.append(V0N.LJJIZ(this.LIZ));
            H7B.LIZJ(X1D.LIZIZ(LIZ));
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HttpHeader("Accept-Encoding", " "));
        this.LJFF = new IDDListenerS59S0100000_15(this, 1);
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(V0N.LJIILL(this.LIZ));
        UrlModel urlModel2 = this.LIZ;
        o.LJIIIZ(urlModel2, "<this>");
        List<String> urlList = urlModel2.getUrlList();
        if (urlList != null) {
            list = ORZ.LLJILJILJ(urlList);
            ((ArrayList) list).remove(V0N.LJIILL(urlModel2));
        } else {
            list = C61878OQg.INSTANCE;
        }
        with.LJIIIIZZ = list;
        with.LJ = C66591QBn.LIZ;
        with.LIZJ = this.LIZLLL;
        with.LJII = 3;
        with.LJIIJ = "music_beat_file";
        with.LJIIL = this.LJFF;
        with.LJJI = true;
        with.LJI = arrayList;
        this.LJ = with.LIZJ();
    }

    @Override // X.InterfaceC84275X5r
    public final void cancel() {
        Downloader.getInstance(EF7.LIZIZ()).removeSubThreadListener(this.LJ, this.LJFF);
        this.LJI = null;
    }

    @Override // X.InterfaceC84275X5r
    public final void release() {
        Downloader.getInstance(EF7.LIZIZ()).removeSubThreadListener(this.LJ, this.LJFF);
        this.LJI = null;
    }

    public C84271X5n(UrlModel urlModel, String str, String str2, CountDownLatch countDownLatch) {
        this.LIZ = urlModel;
        this.LIZIZ = str2;
        this.LIZJ = countDownLatch;
        StringBuilder LIZ = X1D.LIZ();
        String MUSIC_RHYTHM_DIR = C66591QBn.LIZ;
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
        this.LIZLLL = LIZIZ;
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        o.LJIIIIZZ(MUSIC_RHYTHM_DIR, "MUSIC_RHYTHM_DIR");
        c37246Eja.getClass();
        C37246Eja.LIZIZ(MUSIC_RHYTHM_DIR);
    }
}
