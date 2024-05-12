package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mfq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57398Mfq extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final C57398Mfq LJLIL = new C57398Mfq();

    public C57398Mfq() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        C57399Mfr.LJ = false;
        C10K.LIZIZ(CallableC57400Mfs.LJLIL, C10K.LJI, null);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LIZLLL(C57399Mfr.LIZLLL, "popup_round");
        c188727au.LJIIIZ("click_option", "delay");
        FMX.LJIIL("sleep_reminder_popup_B_ok_delay", c188727au.LIZ);
        return C76800UCe.LIZ;
    }
}
