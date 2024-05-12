package X;

import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NME extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final NME LJLIL = new NME();

    public NME() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(DownloadInfo.class);
        if (LIZ != null) {
            return ((DownloadInfo) LIZ).getUrl();
        }
        throw new C58623Mzb(DownloadInfo.class);
    }
}
