package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Wee, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82804Wee extends AbsDownloadListener {
    public final /* synthetic */ C82803Wed<Object> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            C82803Wed<Object> c82803Wed = this.LJLIL;
            String str = this.LJLILLLLZI;
            C82802Wec c82802Wec = C82802Wec.LIZ;
            String str2 = c82803Wed.LJLIL;
            c82802Wec.getClass();
            C82802Wec.LJIIIIZZ(str2, "success", str);
            C82802Wec.LJIIZILJ(c82803Wed.LJLIL);
            return;
        }
        C82803Wed<Object> c82803Wed2 = this.LJLIL;
        String str3 = this.LJLILLLLZI;
        C82802Wec c82802Wec2 = C82802Wec.LIZ;
        String str4 = c82803Wed2.LJLIL;
        c82802Wec2.getClass();
        C82802Wec.LJIIIIZZ(str4, "fail", str3);
        C82802Wec.LJIIZILJ(c82803Wed2.LJLIL);
    }

    public C82804Wee(C82803Wed<Object> c82803Wed, String str) {
        this.LJLIL = c82803Wed;
        this.LJLILLLLZI = str;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException e) {
        o.LJIIIZ(e, "e");
        C82802Wec c82802Wec = C82802Wec.LIZ;
        String str = this.LJLIL.LJLIL;
        String str2 = this.LJLILLLLZI;
        c82802Wec.getClass();
        C82802Wec.LJIIIIZZ(str, "fail", str2);
        C82802Wec.LJIIZILJ(this.LJLIL.LJLIL);
    }
}
