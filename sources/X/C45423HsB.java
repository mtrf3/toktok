package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* renamed from: X.HsB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45423HsB extends C45424HsC {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC45785Hy1 LJLILLLLZI;
    public final /* synthetic */ AVMusic LJLJI;

    @Override // X.C45424HsC, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (!C39579Fg7.LIZIZ(this.LJLIL)) {
            InterfaceC45785Hy1 interfaceC45785Hy1 = this.LJLILLLLZI;
            if (interfaceC45785Hy1 != null) {
                interfaceC45785Hy1.LIZIZ(this.LJLJI, false);
            }
            C6BJ.LIZJ(false, this.LJLJI, null);
            return;
        }
        InterfaceC45785Hy1 interfaceC45785Hy12 = this.LJLILLLLZI;
        if (interfaceC45785Hy12 != null) {
            interfaceC45785Hy12.LIZIZ(this.LJLJI, true);
        }
        C6BJ.LIZJ(true, this.LJLJI, null);
    }

    @Override // X.C45424HsC, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        InterfaceC45785Hy1 interfaceC45785Hy1 = this.LJLILLLLZI;
        if (interfaceC45785Hy1 != null) {
            interfaceC45785Hy1.LIZIZ(this.LJLJI, false);
        }
        C6BJ.LIZJ(false, this.LJLJI, baseException);
    }

    public C45423HsB(String str, C45777Hxt c45777Hxt, AVMusic aVMusic) {
        this.LJLIL = str;
        this.LJLILLLLZI = c45777Hxt;
        this.LJLJI = aVMusic;
    }
}
