package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public final class X2V extends X2H {
    public final /* synthetic */ InterfaceC84183X2d LJLILLLLZI;

    public X2V(InterfaceC84183X2d interfaceC84183X2d) {
        this.LJLILLLLZI = interfaceC84183X2d;
    }

    @Override // X.InterfaceC84181X2b
    public final void LJJJJZ(DownloadInfo downloadInfo) {
        try {
            this.LJLILLLLZI.LJJJJZ(downloadInfo);
        } catch (BaseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // X.InterfaceC84181X2b
    public final boolean LJJJLL(DownloadInfo downloadInfo) {
        return this.LJLILLLLZI.LJJJLL(downloadInfo);
    }
}
