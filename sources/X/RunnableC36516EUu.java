package X;

import com.bytedance.common.jato.gfx.DoFrameController;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;

/* renamed from: X.EUu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36516EUu implements Runnable {
    public static final RunnableC36516EUu LJLIL = new RunnableC36516EUu();

    public static void LIZ() {
        C36513EUr c36513EUr = new C36513EUr();
        synchronized (DoFrameController.class) {
            DoFrameController.LIZ(C16880lQ.LLIIIJ(), c36513EUr);
        }
        ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).updateMainLooperServiceDoFrameHandler();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
