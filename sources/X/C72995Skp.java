package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.Skp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72995Skp extends AbstractC65781Prl implements InterfaceC88472Yns<DownloadInfo, C76800UCe> {
    public static final C72995Skp LJLIL = new C72995Skp();

    public C72995Skp() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(DownloadInfo downloadInfo) {
        String str;
        DownloadInfo downloadInfo2 = downloadInfo;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download start, url: ");
        Integer num = null;
        if (downloadInfo2 != null) {
            str = downloadInfo2.getUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", id: ");
        if (downloadInfo2 != null) {
            num = Integer.valueOf(downloadInfo2.getId());
        }
        QZY.LIZJ(LIZ, num, LIZ, "LiveReplayVideoClip");
        C72991Skl.LIZLLL = System.currentTimeMillis();
        return C76800UCe.LIZ;
    }
}
