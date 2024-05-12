package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.21Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21Y extends AbstractC65781Prl implements InterfaceC88472Yns<DownloadInfo, Boolean> {
    public static final C21Y LJLIL = new C21Y();

    public C21Y() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(DownloadInfo downloadInfo) {
        DownloadInfo it = downloadInfo;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(o.LJ(it.getMimeType(), "live_music_accompaniment"));
    }
}
