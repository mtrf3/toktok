package X;

import com.bytedance.ies.ugc.aweme.network.zstd.ZstdDictUpdateTask;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FUJ extends AbsDownloadListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ ZstdDictUpdateTask LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Downloader onStart with ");
        if (downloadInfo != null) {
            str = downloadInfo.getUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        C37348ElE c37348ElE = C37348ElE.LIZ;
        String version = this.LJLIL;
        String targetFilePath = downloadInfo.getTargetFilePath();
        o.LJIIIIZZ(targetFilePath, "entity.targetFilePath");
        synchronized (c37348ElE) {
            o.LJIIIZ(version, "version");
            C37348ElE.LIZIZ.storeString(version, targetFilePath);
        }
    }

    public FUJ(String str, ZstdDictUpdateTask zstdDictUpdateTask) {
        this.LJLIL = str;
        this.LJLILLLLZI = zstdDictUpdateTask;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Downloader onFailed with ");
        String str2 = null;
        if (downloadInfo != null) {
            str = downloadInfo.getUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(": ");
        LIZ.append(baseException);
        X1D.LIZIZ(LIZ);
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("dict_id", this.LJLIL);
        c198517qh.LIZ.put("params", GsonProtectorUtils.toJson(new Gson(), this.LJLILLLLZI.LJLIL.getValue()));
        if (baseException != null) {
            num = Integer.valueOf(baseException.getErrorCode());
        } else {
            num = null;
        }
        c198517qh.LIZ.put("err_code", num);
        if (baseException != null) {
            str2 = baseException.getErrorMessage();
        }
        c198517qh.LIZ.put("err_msg", str2);
        FUA.LIZJ("zstd_dict_download_error", c198517qh.LJ());
    }
}
