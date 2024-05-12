package X;

import Y.ARunnableS46S0100000_10;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.b1;

/* loaded from: classes11.dex */
public final class OW4 extends AbsDownloadListener {
    public final /* synthetic */ OW3 LJLIL;

    public OW4(OW6 ow6) {
        this.LJLIL = ow6;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        if (this.LJLIL.LIZIZ != null && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
            int curBytes = (int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f);
            OW3 ow3 = this.LJLIL;
            ow3.getClass();
            ow3.LJIIIIZZ = curBytes;
            C38816FLg.LIZJ(this.LJLIL.LJIIJ);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String groupId;
        OW3 ow3 = this.LJLIL;
        String targetFilePath = downloadInfo.getTargetFilePath();
        OW6 ow6 = (OW6) ow3;
        if (targetFilePath != null) {
            ow6.LJI = targetFilePath;
            if (targetFilePath.length() == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("LiveWallPaperHelper download file size == 0: ");
                LIZ.append(ow6.LIZLLL);
                C36922EeM.LJFF(new Exception(X1D.LIZIZ(LIZ)));
                C39579Fg7.LJIL(ow6.LJI);
                C38816FLg.LIZJ(new ARunnableS46S0100000_10(ow6, 101));
                C62011OVj.LJII(1, "file size == 0");
            } else {
                String trim = targetFilePath.trim();
                String substring = trim.substring(trim.lastIndexOf("/") + 1);
                StringBuilder LIZ2 = X1D.LIZ();
                String LJFF = JBR.LJFF(LIZ2, ow6.LJ, substring, LIZ2);
                ow6.LJII = LJFF;
                C39579Fg7.LIZLLL(targetFilePath, LJFF);
                C39579Fg7.LJIL(ow6.LJI);
                C38816FLg.LIZJ(new ARunnableS46S0100000_10(ow6, 102));
                C62011OVj.LJII(0, "");
            }
        } else {
            ow6.getClass();
        }
        OW3 ow32 = this.LJLIL;
        C45441HsT.LIZIZ(ow32.LIZ, "live_photo", ow32.LIZLLL, 1);
        Aweme aweme = this.LJLIL.LIZ;
        if (aweme == null) {
            groupId = "-1";
        } else {
            groupId = aweme.getGroupId();
        }
        C62011OVj.LJIIJJI("share", groupId, true);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String groupId;
        String str;
        OW3 ow3 = this.LJLIL;
        if (ow3.LIZIZ == null) {
            return;
        }
        OW6 ow6 = (OW6) ow3;
        C39579Fg7.LJIL(ow6.LJI);
        C38816FLg.LIZJ(new ARunnableS46S0100000_10(ow6, 101));
        if (baseException != null) {
            Aweme aweme = this.LJLIL.LIZ;
            if (aweme != null && aweme.getVideo() != null && !TextUtils.isEmpty(this.LJLIL.LIZ.getAid()) && !TextUtils.isEmpty(this.LJLIL.LIZ.getVideo().getVideoId())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("aid ");
                LIZ.append(this.LJLIL.LIZ.getAid());
                LIZ.append(" vid ");
                LIZ.append(this.LJLIL.LIZ.getVideo().getVideoId());
                str = X1D.LIZIZ(LIZ);
            } else {
                str = "";
            }
            StringBuilder LIZJ = b1.LIZJ("download video fail ", str);
            LIZJ.append(baseException.getErrorMessage());
            LIZJ.append(" error code ");
            LIZJ.append(baseException.getErrorCode());
            C62011OVj.LJII(1, X1D.LIZIZ(LIZJ));
        }
        Aweme aweme2 = this.LJLIL.LIZ;
        if (aweme2 == null) {
            groupId = "-1";
        } else {
            groupId = aweme2.getGroupId();
        }
        C62011OVj.LJIIJJI("share", groupId, false);
    }
}
