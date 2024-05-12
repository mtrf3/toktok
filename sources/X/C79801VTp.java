package X;

import android.content.Context;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.VTp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79801VTp extends AbsDownloadListener {
    public final WeakReference<LynxBytedLottieView> LJLIL;
    public final android.net.Uri LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        LynxBytedLottieView lynxBytedLottieView = this.LJLIL.get();
        if (lynxBytedLottieView != null) {
            String uuid = UUID.randomUUID().toString();
            o.LJFF(uuid, "UUID.randomUUID().toString()");
            lynxBytedLottieView.LJLLLL = uuid;
            StringBuilder LIZ = X1D.LIZ();
            VNU vnu = lynxBytedLottieView.mContext;
            o.LJFF(vnu, "view.lynxContext");
            Context LLLLLLJ = C16880lQ.LLLLLLJ(vnu);
            o.LJFF(LLLLLLJ, "view.lynxContext.applicationContext");
            File LLIIIL = C16880lQ.LLIIIL(LLLLLLJ);
            o.LJFF(LLIIIL, "view.lynxContext.applicationContext.cacheDir");
            LIZ.append(LLIIIL.getAbsolutePath());
            LIZ.append('/');
            LIZ.append(this.LJLILLLLZI.getEncodedPath());
            C04650Gf.LJFF(X1D.LIZIZ(LIZ), lynxBytedLottieView, lynxBytedLottieView.LLII);
        }
    }

    public C79801VTp(LynxBytedLottieView view, android.net.Uri uri) {
        o.LJIIJ(view, "view");
        this.LJLILLLLZI = uri;
        this.LJLIL = new WeakReference<>(view);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        LynxBytedLottieView lynxBytedLottieView = this.LJLIL.get();
        if (lynxBytedLottieView != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("byted-lottie setSrc Failed, directUrl is ");
            LIZ.append(this.LJLILLLLZI.getPath());
            LIZ.append(", ");
            LIZ.append("error msg is ");
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = null;
            }
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            String str2 = lynxBytedLottieView.LJLL;
            if (str2 == null) {
                str2 = "";
            }
            lynxBytedLottieView.LJJI(1, LIZIZ, str2);
            lynxBytedLottieView.mContext.LJIIJ(lynxBytedLottieView.LJLL, "lottie", LIZIZ);
        }
    }
}
