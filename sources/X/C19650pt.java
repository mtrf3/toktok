package X;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19650pt {
    public static final /* synthetic */ int LIZ = 0;

    public static DownloadInfo LIZ(String url) {
        o.LJIIIZ(url, "url");
        List<DownloadInfo> allDownloadInfo = Downloader.getInstance(C15380j0.LIZLLL()).getAllDownloadInfo();
        if (allDownloadInfo != null) {
            for (DownloadInfo downloadInfo : allDownloadInfo) {
                if (downloadInfo != null && TextUtils.equals(downloadInfo.getUrl(), url)) {
                    return downloadInfo;
                }
            }
            return null;
        }
        return null;
    }
}
