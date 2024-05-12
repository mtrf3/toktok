package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.IOException;

/* renamed from: X.X4d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84235X4d implements X5L {
    public final C84234X4c LIZ;
    public final C65205PiT LIZIZ;
    public final X5B LIZJ;

    @Override // X.X5L
    public final void LIZ(X59 x59) {
        this.LIZIZ.LJLIL.LIZIZ(x59.LIZ, x59.LIZJ);
        this.LIZ.LIZIZ.addAndGet(x59.LIZJ);
    }

    public C84235X4d(DownloadInfo downloadInfo, C84252X4u c84252X4u, C84234X4c c84234X4c) {
        this.LIZ = c84234X4c;
        C65205PiT LJII = X4P.LJII(X4H.LJFF(downloadInfo.getId(), null).LJIIIIZZ("flush_buffer_size_byte", -1), downloadInfo, downloadInfo.getTempPath(), downloadInfo.getTempName());
        long startOffset = downloadInfo.getStartOffset();
        try {
            LJII.LJLIL.seek(c84234X4c.LIZIZ() - (startOffset < 0 ? 0L : startOffset));
            this.LIZIZ = LJII;
            this.LIZJ = new X5B(c84252X4u, this);
        } catch (IOException e) {
            throw new BaseException(1054, e);
        }
    }
}
