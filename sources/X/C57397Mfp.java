package X;

/* renamed from: X.Mfp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57397Mfp extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final C57397Mfp LJLIL = new C57397Mfp();

    public C57397Mfp() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN arn) {
        C793239k.LIZIZ(arn, "it", null);
        C57399Mfr.LJ = false;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LIZLLL(C57399Mfr.LIZLLL, "popup_round");
        c188727au.LJIIIZ("click_option", "ok");
        FMX.LJIIL("sleep_reminder_popup_B_ok_delay", c188727au.LIZ);
        C10K.LIZIZ(CallableC57401Mft.LJLIL, C10K.LJI, null);
        return C76800UCe.LIZ;
    }
}
