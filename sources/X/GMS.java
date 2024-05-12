package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class GMS extends AbsDownloadListener {
    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        GMQ.LJ = false;
        GMQ.LJFF = false;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        GMQ.LJ = true;
        InterfaceC88472Yns<? super DownloadInfo, C76800UCe> interfaceC88472Yns = GMQ.LIZLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(entity);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        GMQ.LJ = false;
        GMQ.LJFF = false;
        C43882HKc.LIZLLL(0, "edit_post_download_video_error_rate", new JSONObject(), true);
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = GMQ.LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        int i;
        String str;
        GMQ.LJ = false;
        GMQ.LJFF = false;
        if (baseException == null) {
            i = 1149;
        } else if (baseException.getErrorCode() != 0) {
            i = baseException.getErrorCode();
        } else {
            i = 1148;
        }
        JSONObject jSONObject = new JSONObject();
        if (baseException == null || (str = baseException.getErrorMessage()) == null) {
            str = "";
        }
        jSONObject.put("error_msg", str);
        C43882HKc.LIZLLL(i, "edit_post_download_video_error_rate", jSONObject, true);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = GMQ.LIZJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }
}
