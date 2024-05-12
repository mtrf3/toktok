package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper;
import defpackage.i0;

/* renamed from: X.Gk7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42375Gk7<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ ProgressDialogC43241Gy5 LIZIZ;
    public final /* synthetic */ Context LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ String LJI;

    public C42375Gk7(String str, ProgressDialogC43241Gy5 progressDialogC43241Gy5, Context context, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = progressDialogC43241Gy5;
        this.LIZJ = context;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        ShareFromWebHelper.ShareVideoInfoResponse shareVideoInfoResponse = (ShareFromWebHelper.ShareVideoInfoResponse) c10k.LJIIJJI();
        if (shareVideoInfoResponse != null) {
            String str = this.LIZ;
            ProgressDialogC43241Gy5 progressDialogC43241Gy5 = this.LIZIZ;
            Context context = this.LIZJ;
            String str2 = this.LIZLLL;
            String str3 = this.LJ;
            String str4 = this.LJFF;
            String str5 = this.LJI;
            if (shareVideoInfoResponse.statusCode == 0) {
                String str6 = shareVideoInfoResponse.videoInfo.cdnUrl;
                CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C60903NvH.LJIIJJI().LJJIJL().getPathService().LIZIZ(creativeInfo));
                LIZ.append("record");
                String LIZIZ = X1D.LIZIZ(LIZ);
                String LJFF = i0.LJFF(str, ".mp4");
                IDDListenerS58S0100000_7 iDDListenerS58S0100000_7 = new IDDListenerS58S0100000_7(new C43673HCb(progressDialogC43241Gy5, str2, str3, str4, str5, creativeInfo, context), 1);
                DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
                X5R with = downloadServiceManager.getDownloadService().with(str6);
                with.LIZJ = LJFF;
                with.LJ = LIZIZ;
                with.LJII = 3;
                with.LJJI = downloadServiceManager.isAutoRemoveListener();
                with.LJIIL = iDDListenerS58S0100000_7;
                with.LIZJ();
                return null;
            }
            progressDialogC43241Gy5.dismiss();
            ShareFromWebHelper.LIZ(context);
            return null;
        }
        ProgressDialogC43241Gy5 progressDialogC43241Gy52 = this.LIZIZ;
        Context context2 = this.LIZJ;
        progressDialogC43241Gy52.dismiss();
        ShareFromWebHelper.LIZ(context2);
        return null;
    }
}
