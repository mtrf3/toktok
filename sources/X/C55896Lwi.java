package X;

import com.ss.android.ugc.aweme.notification.lego.PreloadNoticeTask;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Lwi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55896Lwi extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C55896Lwi LJLIL = new C55896Lwi();

    public C55896Lwi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        EnumC55898Lwk enumC55898Lwk;
        if (L0U.LIZ() && INB.LIZ() == 0) {
            if (NoticePerfManager.LIZ().enableBootPreload) {
                enumC55898Lwk = EnumC55898Lwk.BOOT;
            } else if (NoticePerfManager.LIZ().enableBootLazyPreload) {
                enumC55898Lwk = EnumC55898Lwk.BOOT_LAZY;
            }
            String uid = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(uid, "uid");
            Long LJJIZ = C38350F3i.LJJIZ(uid);
            if (LJJIZ != null && LJJIZ.longValue() > 0 && PreloadNoticeTask.LJLJI.length() == 0) {
                PreloadNoticeTask.LJLJI = uid;
                C36093EEn.LIZ.getClass();
                C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                LJIIIZ.LIZIZ(new PreloadNoticeTask(enumC55898Lwk, uid), true);
                LJIIIZ.LIZJ();
            }
        }
        return C76800UCe.LIZ;
    }
}
