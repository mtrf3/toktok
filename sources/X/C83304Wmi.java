package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import djb.IDaS27S0000000_14;
import java.net.UnknownHostException;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.Wmi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83304Wmi extends AbsDownloadListener {
    public final AbstractC83312Wmq<Effect, C76800UCe> LJLIL;
    public final InterfaceC83286WmQ<Effect, C76800UCe> LJLILLLLZI;
    public long LJLJI;
    public final C64962gm LJLJJI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        this.LJLJI = System.currentTimeMillis();
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        XKX.LIZLLL(this.LJLJJI, EXT.LIZ, null, new C83305Wmj(this, null), 2);
    }

    public C83304Wmi(AbstractC83312Wmq task, C83310Wmo c83310Wmo) {
        o.LJIIIZ(task, "task");
        this.LJLIL = task;
        this.LJLILLLLZI = c83310Wmo;
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        this.LJLJJI = C48841JEv.LIZ(EXT.LIZ.plus(LJIILIIL).plus(new IDaS27S0000000_14(CoroutineExceptionHandler.LJJJJIZL, 1)));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        String stackTraceString;
        int i;
        this.LJLIL.LIZ(4);
        AbstractC83312Wmq<Effect, C76800UCe> abstractC83312Wmq = this.LJLIL;
        int i2 = -1;
        if (baseException != null) {
            str = baseException.getMessage();
        } else {
            str = null;
        }
        new IZ3(baseException, i2, str);
        abstractC83312Wmq.getClass();
        this.LJLILLLLZI.LIZ(this.LJLIL);
        C6BK c6bk = new C6BK();
        Throwable th = baseException;
        while (true) {
            if (th != null) {
                if (th instanceof UnknownHostException) {
                    stackTraceString = "UnknownHostException";
                    break;
                }
                th = th.getCause();
            } else {
                stackTraceString = android.util.Log.getStackTraceString(baseException);
                break;
            }
        }
        o.LJIIIIZZ(stackTraceString, "getStackTraceString(e)");
        c6bk.LIZ.put("errorDesc", stackTraceString);
        if (baseException != null) {
            i = baseException.getErrorCode();
        } else {
            i = 0;
        }
        c6bk.LIZ.put("errorCode", Integer.valueOf(i));
        C43882HKc.LIZLLL(1, "aweme_tool_draft_amazing_infosticker_update_download_error", c6bk.LJ(), true);
    }
}
