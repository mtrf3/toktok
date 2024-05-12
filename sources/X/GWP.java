package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GWP extends AbstractC65781Prl implements InterfaceC88472Yns<C26231ARf, C76800UCe> {
    public static final GWP LJLIL = new GWP();

    public GWP() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C26231ARf it) {
        o.LJIIIZ(it, "it");
        AVExternalServiceImpl.LIZ().abnormalExitLogService().logRestoreDialogDismiss("tap");
        return C76800UCe.LIZ;
    }
}
