package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.Hxw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45780Hxw extends C45424HsC {
    public final /* synthetic */ C45776Hxs LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.C45424HsC, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        this.LJLIL.LJIIIIZZ.sendEmptyMessage(1);
        this.LJLIL.LJI = true;
        C6BJ.LIZ(null, this.LJLILLLLZI, this.LJLJI, true);
    }

    @Override // X.C45424HsC, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        this.LJLIL.LJIIIIZZ.sendEmptyMessage(1);
        C6BJ.LIZ(baseException, this.LJLILLLLZI, this.LJLJI, false);
    }

    public C45780Hxw(C45776Hxs c45776Hxs, String str, String str2) {
        this.LJLIL = c45776Hxs;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
