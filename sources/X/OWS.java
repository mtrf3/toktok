package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes11.dex */
public final class OWS extends AbsDownloadListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C60408NnI LJLJJI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.getTargetFilePath() != null) {
            if (TextUtils.isEmpty(downloadInfo.getTargetFilePath())) {
                C30868C9o.LJI("Failed to save image");
                return;
            }
            C60408NnI c60408NnI = this.LJLJJI;
            Context context = this.LJLIL;
            String str = this.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI);
            LIZ.append("long_click_img.tmp");
            String LIZIZ = X1D.LIZIZ(LIZ);
            c60408NnI.getClass();
            ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(context);
            if (LIZIZ2 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(LIZIZ)) {
                C30868C9o.LJI("Failed to save image");
            } else {
                new C77276UUm(LIZIZ2, TokenCert.with("bpea-webcast-hybrid-common-webview-save-image")).LIZ(new OWT(LIZIZ, str, context), "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        C30868C9o.LJI("Failed to save image");
    }

    public OWS(C60408NnI c60408NnI, Context context, String str, String str2) {
        this.LJLJJI = c60408NnI;
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
