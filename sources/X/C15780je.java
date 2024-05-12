package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.0je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15780je {
    public static final C15780je LIZ = new C15780je();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C519121z.LJLIL);

    public static final void LIZ(DownloadInfo downloadInfo, boolean z) {
        o.LJIIIZ(downloadInfo, "downloadInfo");
        ((C84261X5d) LIZIZ.getValue()).clearDownloadData(downloadInfo.getId(), z);
        if (z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(downloadInfo.getSavePath());
            LIZ2.append(downloadInfo.getName());
            C31880CfE.LJ(new File(X1D.LIZIZ(LIZ2)));
        }
    }
}
