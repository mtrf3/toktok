package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes16.dex */
public final class X45 implements X5K {
    public final /* synthetic */ X44 LIZ;

    @Override // X.X5K
    public final void onSuccess() {
        X44 x44 = this.LIZ;
        x44.getClass();
        try {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZLLL(x44.LIZJ.getId(), X44.LJIILLIIL, "onSaveTempFileSuccess", "Success");
            }
            try {
                x44.LIZIZ();
                DownloadInfo downloadInfo = x44.LIZJ;
                if (downloadInfo == null) {
                    x44.LJI(new BaseException(1087, "onSaveTempFileSuccess DownloadInfo is null"));
                    return;
                }
                downloadInfo.setFirstSuccess(false);
                x44.LIZJ.setSuccessByCache(false);
                if (x44.LIZJ.getDownloadFinishTimeStamp() <= 0) {
                    x44.LIZJ.setDownloadFinishTimeStamp(System.currentTimeMillis());
                }
                x44.LJIIJJI(-3, null);
                x44.LIZLLL.LJJJJLI(x44.LIZJ.getId(), x44.LIZJ.getTotalBytes());
                x44.LIZLLL.LJLJI(x44.LIZJ.getId());
            } catch (BaseException e) {
                x44.LJI(e);
            }
        } catch (Throwable th) {
            x44.LJI(new BaseException(1008, X4Q.LJIIL("onCompleted", th)));
        }
    }

    public X45(X44 x44) {
        this.LIZ = x44;
    }

    @Override // X.X5K
    public final void LIZ(BaseException baseException) {
        String str;
        String str2 = X44.LJIILLIIL;
        int id = this.LIZ.LIZJ.getId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Exception: ");
        if (baseException != null) {
            str = baseException.getErrorMessage();
        } else {
            str = "";
        }
        LIZ.append(str);
        C65210PiY.LJ(id, str2, "saveFileAsTargetName_onFailed", X1D.LIZIZ(LIZ));
        this.LIZ.LJI(baseException);
    }
}
