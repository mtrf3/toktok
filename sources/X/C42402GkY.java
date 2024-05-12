package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import kotlin.jvm.internal.o;

/* renamed from: X.GkY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42402GkY extends AbstractC65781Prl implements InterfaceC88472Yns<Dialog, C76800UCe> {
    public static final C42402GkY LJLIL = new C42402GkY();

    public C42402GkY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Dialog it) {
        IDownloadService iDownloadService;
        o.LJIIIZ(it, "it");
        Integer num = C42403GkZ.LIZIZ;
        if (num != null) {
            int intValue = num.intValue();
            IDownloadService iDownloadService2 = C42403GkZ.LIZ;
            if (iDownloadService2 != null && iDownloadService2.isDownloading(intValue) && (iDownloadService = C42403GkZ.LIZ) != null) {
                iDownloadService.cancel(intValue);
            }
        }
        return C76800UCe.LIZ;
    }
}
