package X;

import com.bytedance.touchpoint.core.model.Animation;
import com.bytedance.touchpoint.core.model.ReferralFeedBanner;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import kotlin.jvm.internal.AqS170S0100000_4;

/* renamed from: X.9nH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247359nH extends AbsDownloadListener {
    public final /* synthetic */ C247339nF LJLIL;
    public final /* synthetic */ Animation LJLILLLLZI;
    public final /* synthetic */ ReferralFeedBanner LJLJI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String targetFilePath;
        if (downloadInfo != null && (targetFilePath = downloadInfo.getTargetFilePath()) != null) {
            File file = new File(targetFilePath);
            C247409nM c247409nM = C247339nF.LJI;
            String str = this.LJLILLLLZI.lottieMd5;
            c247409nM.getClass();
            if (C247409nM.LIZ(file, str)) {
                this.LJLIL.LJIIIIZZ(file, this.LJLILLLLZI.lottieMd5, new AqS170S0100000_4(this, 1424));
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        int i;
        C247339nF c247339nF = this.LJLIL;
        c247339nF.LIZJ = false;
        c247339nF.LIZIZ++;
        c247339nF.LIZJ(this.LJLJI);
        ReferralFeedBanner referralFeedBanner = this.LJLJI;
        int i2 = referralFeedBanner.LIZ;
        Integer num = referralFeedBanner.LIZJ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        C247749nu.LIZ(0, i2, i, "");
    }

    public C247359nH(C247339nF c247339nF, Animation animation, ReferralFeedBanner referralFeedBanner) {
        this.LJLIL = c247339nF;
        this.LJLILLLLZI = animation;
        this.LJLJI = referralFeedBanner;
    }
}
