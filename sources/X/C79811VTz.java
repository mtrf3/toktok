package X;

import android.content.Context;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.lynx.tasm.base.LLog;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.VTz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79811VTz extends AbsDownloadListener {
    public final WeakReference<LynxAlphaVideo> LJLIL;
    public final android.net.Uri LJLILLLLZI;
    public final String LJLJI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download resource success, and directUrl is ");
        C13870gZ.LIZJ(LIZ, this.LJLJI, LIZ, 2, "x-alpha-video");
        LynxAlphaVideo lynxAlphaVideo = this.LJLIL.get();
        if (lynxAlphaVideo != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            VNU vnu = lynxAlphaVideo.mContext;
            o.LJFF(vnu, "it.lynxContext");
            Context LLLLLLJ = C16880lQ.LLLLLLJ(vnu);
            o.LJFF(LLLLLLJ, "it.lynxContext.applicationContext");
            File LLIIIL = C16880lQ.LLIIIL(LLLLLLJ);
            o.LJFF(LLIIIL, "it.lynxContext.applicationContext.cacheDir");
            LIZ2.append(LLIIIL.getAbsolutePath());
            LIZ2.append('/');
            LIZ2.append(this.LJLILLLLZI.getLastPathSegment());
            lynxAlphaVideo.LJJIII(X1D.LIZIZ(LIZ2), this.LJLJI);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download resource failed and resource is ");
        LIZ.append(this.LJLJI);
        LIZ.append(", error msg is ");
        LIZ.append(baseException);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LLog.LIZLLL(2, "x-alpha-video", LIZIZ);
        LynxAlphaVideo lynxAlphaVideo = this.LJLIL.get();
        if (lynxAlphaVideo != null) {
            lynxAlphaVideo.LJJI(-12, LIZIZ, lynxAlphaVideo.LJLL);
            lynxAlphaVideo.mContext.LJIIJ(this.LJLJI, "video", LIZIZ);
        }
    }

    public C79811VTz(LynxAlphaVideo view, android.net.Uri uri, String directUrl) {
        o.LJIIJ(view, "view");
        o.LJIIJ(directUrl, "directUrl");
        this.LJLILLLLZI = uri;
        this.LJLJI = directUrl;
        this.LJLIL = new WeakReference<>(view);
    }
}
