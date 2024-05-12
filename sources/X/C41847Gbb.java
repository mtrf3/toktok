package X;

import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS12S0010000_7;
import kotlin.jvm.internal.AqS3S1001000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gbb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41847Gbb implements E0U {
    public final /* synthetic */ C44428Hc8 LJLIL;
    public final /* synthetic */ ForwardVideo LJLILLLLZI;
    public final /* synthetic */ VideoDownloadPartialResult LJLJI;
    public final /* synthetic */ ForwardMediaDownloader.DownloadListener LJLJJI;
    public final /* synthetic */ String LJLJJL;

    @Override // X.E0U
    public final void LJJJJI(String str) {
        long j;
        C41848Gbc c41848Gbc = C41848Gbc.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("internal callback,onConnected,");
        LIZ.append(str);
        C41848Gbc.LIZLLL(X1D.LIZIZ(LIZ));
        long LIZIZ = this.LJLIL.LIZIZ(TimeUnit.MILLISECONDS);
        int sourceDuration = this.LJLILLLLZI.getSourceDuration();
        VideoDownloadPartialResult videoDownloadPartialResult = this.LJLJI;
        if (videoDownloadPartialResult != null) {
            j = videoDownloadPartialResult.getCacheSizeFromZero();
        } else {
            j = 0;
        }
        C41848Gbc.LJ(c41848Gbc, 2, LIZIZ, sourceDuration, j, null, 48);
    }

    @Override // X.E0U
    public final void LJJJLIIL(String str) {
        long j;
        C44428Hc8 stopwatch = this.LJLIL;
        o.LJIIIIZZ(stopwatch, "stopwatch");
        if (stopwatch.LIZIZ) {
            stopwatch.LJ();
        }
        C41848Gbc.LIZJ.put(this.LJLJJL, 100);
        C41848Gbc c41848Gbc = C41848Gbc.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("internal callback,onFinished,url:");
        LIZ.append(str);
        C41848Gbc.LIZLLL(X1D.LIZIZ(LIZ));
        long LIZIZ = this.LJLIL.LIZIZ(TimeUnit.MILLISECONDS);
        int sourceDuration = this.LJLILLLLZI.getSourceDuration();
        VideoDownloadPartialResult videoDownloadPartialResult = this.LJLJI;
        if (videoDownloadPartialResult != null) {
            j = videoDownloadPartialResult.getCacheSizeFromZero();
        } else {
            j = 0;
        }
        C41848Gbc.LJ(c41848Gbc, 1, LIZIZ, sourceDuration, j, null, 48);
        this.LJLJJI.onSuccess("");
    }

    @Override // X.E0U
    public final void LJIIJ(String str, boolean z) {
        long j;
        C41848Gbc c41848Gbc = C41848Gbc.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("internal callback,onOpenResult,");
        LIZ.append(str);
        LIZ.append(",result:");
        LIZ.append(z);
        C41848Gbc.LIZLLL(X1D.LIZIZ(LIZ));
        long LIZIZ = this.LJLIL.LIZIZ(TimeUnit.MILLISECONDS);
        int sourceDuration = this.LJLILLLLZI.getSourceDuration();
        VideoDownloadPartialResult videoDownloadPartialResult = this.LJLJI;
        if (videoDownloadPartialResult != null) {
            j = videoDownloadPartialResult.getCacheSizeFromZero();
        } else {
            j = 0;
        }
        C41848Gbc.LJ(c41848Gbc, 3, LIZIZ, sourceDuration, j, new AqS12S0010000_7(z, 13), 16);
        this.LJLJJI.onFileHeaderInfoReady(z);
    }

    @Override // X.E0U
    public final void LJJJJJ(String str, float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onProgress:progress:");
        LIZ.append(f);
        LIZ.append(",url:");
        LIZ.append(str);
        C41848Gbc.LIZLLL(X1D.LIZIZ(LIZ));
        C41848Gbc.LIZJ.put(this.LJLJJL, Integer.valueOf((int) (f * 100)));
    }

    @Override // X.E0U
    public final void LJJJ(String str, int i, int i2, String str2) {
        long j;
        C44428Hc8 stopwatch = this.LJLIL;
        o.LJIIIIZZ(stopwatch, "stopwatch");
        if (stopwatch.LIZIZ) {
            stopwatch.LJ();
        }
        C41848Gbc.LIZJ.put(this.LJLJJL, 0);
        C41848Gbc c41848Gbc = C41848Gbc.LIZ;
        StringBuilder LJ = AnonymousClass028.LJ("internal callback,onError,", str, ",errorCode:", i, ",ext:");
        LJ.append(i2);
        LJ.append(",msg:");
        LJ.append(str2);
        C41848Gbc.LIZLLL(X1D.LIZIZ(LJ));
        long LIZIZ = this.LJLIL.LIZIZ(TimeUnit.MILLISECONDS);
        int sourceDuration = this.LJLILLLLZI.getSourceDuration();
        VideoDownloadPartialResult videoDownloadPartialResult = this.LJLJI;
        if (videoDownloadPartialResult != null) {
            j = videoDownloadPartialResult.getCacheSizeFromZero();
        } else {
            j = 0;
        }
        C41848Gbc.LJ(c41848Gbc, -1, LIZIZ, sourceDuration, j, new AqS3S1001000_7(i, str2, 0), 16);
        ForwardMediaDownloader.DownloadListener.DefaultImpls.onError$default(this.LJLJJI, i, str2, null, null, 8, null);
    }

    public C41847Gbb(C44428Hc8 c44428Hc8, ForwardVideo forwardVideo, VideoDownloadPartialResult videoDownloadPartialResult, ForwardMediaDownloader.DownloadListener downloadListener, String str) {
        this.LJLIL = c44428Hc8;
        this.LJLILLLLZI = forwardVideo;
        this.LJLJI = videoDownloadPartialResult;
        this.LJLJJI = downloadListener;
        this.LJLJJL = str;
    }
}
