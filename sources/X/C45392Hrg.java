package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Hrg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45392Hrg implements InterfaceC47650In0 {
    public final /* synthetic */ C45387Hrb LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.InterfaceC47650In0
    public final void onFailed() {
        this.LIZ.LIZJ(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.InterfaceC47650In0
    public final void onSuccess(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        File file = new File(filePath);
        RuntimeBehaviorServiceImpl.LJ().LIZ("download_success");
        DownloadInfo downloadInfo = new DownloadInfo();
        X4W x4w = new X4W();
        downloadInfo.setCurBytes(file.length());
        downloadInfo.setTotalBytes(file.length());
        AbsDownloadListener absDownloadListener = this.LIZ.LIZIZ;
        if (absDownloadListener != null) {
            absDownloadListener.onProgress(downloadInfo);
        }
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        String LJLLJ = s.LJLLJ(filePath, separator);
        String LJLZ = s.LJLZ(filePath, separator, filePath);
        AbsDownloadListener absDownloadListener2 = this.LIZ.LIZIZ;
        if (absDownloadListener2 != null) {
            x4w.LIZ = LJLLJ;
            x4w.LIZLLL = LJLZ;
            absDownloadListener2.onSuccessed(x4w.LIZ());
        }
    }

    public C45392Hrg(C45387Hrb c45387Hrb, String str, String str2, String str3) {
        this.LIZ = c45387Hrb;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
