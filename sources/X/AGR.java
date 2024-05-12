package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.aweme.translation.service.TranslationKevaServiceImpl;
import com.ss.android.ugc.aweme.translation.service.TranslationLangKevaServiceImpl;

/* loaded from: classes5.dex */
public final class AGR implements Runnable {
    public static final AGR LJLIL = new AGR();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (ServiceManager.get() != null && CaptionKevaServiceImpl.LJJJJI() != null) {
                ICaptionKevaService LJJJJI = CaptionKevaServiceImpl.LJJJJI();
                TranslationKevaServiceImpl.LJIIL().LJIIIZ();
                TranslationLangKevaServiceImpl.LJIIZILJ().LIZ();
                LJJJJI.LJJIJL();
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
