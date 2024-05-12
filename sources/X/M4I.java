package X;

import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;

/* loaded from: classes10.dex */
public final class M4I extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final M4I LJLIL = new M4I();

    public M4I() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        M4Q LIZIZ = NoticePerfManager.LIZ.LIZIZ(true);
        if (LIZIZ != null) {
            LIZIZ.LIZ(EnumC55898Lwk.BOOT_LAZY);
        }
        return C76800UCe.LIZ;
    }
}
