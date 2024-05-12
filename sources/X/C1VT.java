package X;

import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.1VT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VT extends F9E implements Serializable {
    public final DownloadInfo LJLIL;
    public final Accompaniment LJLILLLLZI;

    public static /* synthetic */ C1VT copy$default(C1VT c1vt, DownloadInfo downloadInfo, Accompaniment accompaniment, int i, Object obj) {
        if ((i & 1) != 0) {
            downloadInfo = c1vt.LJLIL;
        }
        if ((i & 2) != 0) {
            accompaniment = c1vt.LJLILLLLZI;
        }
        return c1vt.copy(downloadInfo, accompaniment);
    }

    public final C1VT copy(DownloadInfo downloadInfo, Accompaniment accompaniment) {
        o.LJIIIZ(downloadInfo, "downloadInfo");
        o.LJIIIZ(accompaniment, "accompaniment");
        return new C1VT(downloadInfo, accompaniment);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public final Accompaniment getAccompaniment() {
        return this.LJLILLLLZI;
    }

    public final DownloadInfo getDownloadInfo() {
        return this.LJLIL;
    }

    public C1VT(DownloadInfo downloadInfo, Accompaniment accompaniment) {
        o.LJIIIZ(downloadInfo, "downloadInfo");
        o.LJIIIZ(accompaniment, "accompaniment");
        this.LJLIL = downloadInfo;
        this.LJLILLLLZI = accompaniment;
    }
}
