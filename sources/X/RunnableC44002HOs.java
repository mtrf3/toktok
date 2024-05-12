package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import kotlin.jvm.internal.o;

/* renamed from: X.HOs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44002HOs implements Runnable {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ DownloadInfo LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC44004HOu LJLJJL;

    public RunnableC44002HOs(ActivityC45651qj activityC45651qj, String str, DownloadInfo downloadInfo, String str2, InterfaceC44004HOu interfaceC44004HOu) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = str;
        this.LJLJI = downloadInfo;
        this.LJLJJI = str2;
        this.LJLJJL = interfaceC44004HOu;
    }

    public final void LIZ() {
        String savePath;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        String str = this.LJLILLLLZI;
        DownloadInfo downloadInfo = this.LJLJI;
        String str2 = this.LJLJJI;
        InterfaceC44004HOu interfaceC44004HOu = this.LJLJJL;
        android.net.Uri LJIIJ = C268613q.LJIIJ(activityC45651qj, str2);
        if (C268613q.LJIIJJI(activityC45651qj, LJIIJ)) {
            String uri = LJIIJ.toString();
            o.LJIIIIZZ(uri, "fileUri.toString()");
            interfaceC44004HOu.LJFF(uri, str2);
            return;
        }
        if (downloadInfo == null) {
            android.net.Uri LJFF = C268613q.LJFF(activityC45651qj, str2);
            if (LJFF != null) {
                savePath = LJFF.toString();
                o.LJIIIIZZ(savePath, "saveUri.toString()");
            } else {
                savePath = "";
            }
        } else {
            savePath = downloadInfo.getSavePath();
            o.LJIIIIZZ(savePath, "{\n            info.savePath\n        }");
        }
        C44001HOr c44001HOr = new C44001HOr(interfaceC44004HOu, savePath);
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        with.LIZJ = str2;
        with.LJ = savePath;
        with.LJIIJJI = c44001HOr;
        with.LJIIJ = "ecommerce_highlight";
        Integer valueOf = Integer.valueOf(with.LIZJ());
        if (interfaceC44004HOu == null) {
            return;
        }
        interfaceC44004HOu.LIZ(valueOf);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
