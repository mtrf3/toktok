package X;

import com.ss.android.ugc.aweme.download.DownloadAwemeVideoServiceImpl;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gkc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42406Gkc implements InterfaceC47650In0 {
    public final /* synthetic */ AbstractC42411Gkh LIZ;
    public final /* synthetic */ DownloadAwemeVideoServiceImpl LIZIZ;
    public final /* synthetic */ List<String> LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF = "video_2_sticker";

    @Override // X.InterfaceC47650In0
    public final void onFailed() {
        DownloadAwemeVideoServiceImpl downloadAwemeVideoServiceImpl = this.LIZIZ;
        List<String> list = this.LIZJ;
        downloadAwemeVideoServiceImpl.LIZIZ(this.LIZ, this.LIZLLL, this.LJ, this.LJFF, list);
    }

    @Override // X.InterfaceC47650In0
    public final void onSuccess(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        File file = new File(filePath);
        RuntimeBehaviorServiceImpl.LJ().LIZ("download_success");
        this.LIZ.LIZLLL();
        this.LIZ.LIZJ(100, file.length(), file.length());
        this.LIZ.LJ("local", filePath);
    }

    public C42406Gkc(C42412Gki c42412Gki, DownloadAwemeVideoServiceImpl downloadAwemeVideoServiceImpl, List list, String str, String str2) {
        this.LIZ = c42412Gki;
        this.LIZIZ = downloadAwemeVideoServiceImpl;
        this.LIZJ = list;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
