package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.Skr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72997Skr extends AbstractC65781Prl implements InterfaceC88472Yns<DownloadInfo, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ A90 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72997Skr(float f, A90 a90) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = a90;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(DownloadInfo downloadInfo) {
        int i;
        DownloadInfo downloadInfo2 = downloadInfo;
        int i2 = 0;
        if (downloadInfo2 != null) {
            i = downloadInfo2.getDownloadProcess();
        } else {
            i = 0;
        }
        C0NB.LIZIZ("LiveReplayVideoClip", String.valueOf(i));
        if (downloadInfo2 != null) {
            i2 = downloadInfo2.getDownloadProcess();
        }
        float f = i2;
        float f2 = this.LJLIL;
        float f3 = 100;
        this.LJLILLLLZI.LIZLLL((((f3 - f2) / f3) * f) + f2);
        return C76800UCe.LIZ;
    }
}
