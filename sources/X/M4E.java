package X;

import com.ss.android.ugc.aweme.notification.lego.PreloadNoticeTask;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M4E extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final M4E LJLIL = new M4E();

    public M4E() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        M4Q LIZIZ = NoticePerfManager.LIZ.LIZIZ(true);
        if (LIZIZ != null && LIZIZ.LIZ(EnumC55898Lwk.BOOT)) {
            EnumC55898Lwk enumC55898Lwk = EnumC55898Lwk.BOOT_LAZY;
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            PreloadNoticeTask preloadNoticeTask = new PreloadNoticeTask(enumC55898Lwk, curUserId);
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZIZ(preloadNoticeTask, true);
            LJIIIZ.LIZJ();
        }
        return C76800UCe.LIZ;
    }
}
