package X;

import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.21X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21X extends AbstractC65781Prl implements InterfaceC88471Ynr<DownloadInfo, BaseException, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ Accompaniment LJLILLLLZI;
    public final /* synthetic */ QXX LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21X(long j, Accompaniment accompaniment, QXX qxx) {
        super(2);
        this.LJLIL = j;
        this.LJLILLLLZI = accompaniment;
        this.LJLJI = qxx;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        DownloadInfo downloadInfo2 = downloadInfo;
        BaseException baseException2 = baseException;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FileDownload-onFailed, albumId: ");
        LIZ.append(this.LJLIL);
        LIZ.append(", accompanimentId: ");
        LIZ.append(this.LJLILLLLZI.id);
        LIZ.append(", exception: ");
        if (baseException2 != null) {
            str = baseException2.getErrorMessage();
        } else {
            str = null;
        }
        C1EW.LIZLLL(LIZ, str, LIZ, "AccompanimentManager");
        if (baseException2 != null && baseException2.getErrorCode() == 1006) {
            C30868C9o.LIZJ(R.string.mev);
        }
        if (downloadInfo2 != null) {
            long j = this.LJLIL;
            Accompaniment accompaniment = this.LJLILLLLZI;
            QXX qxx = this.LJLJI;
            List<Accompaniment> list = C14270hD.LJLLLLLL.get(Long.valueOf(j));
            if (list != null) {
                list.remove(accompaniment);
            }
            C14270hD.LIZ(j);
            C14270hD.LJIIL(j);
            if (qxx != null) {
                new C1VT(downloadInfo2, accompaniment);
            }
        }
        return C76800UCe.LIZ;
    }
}
