package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AEK extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final AEK LJLIL = new AEK();

    public AEK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_and_safety_settings");
        c188727au.LJIIIZ("status", "cancel");
        FMX.LJIIL("click_live_change_privacy_account_popup", c188727au.LIZ);
        return C76800UCe.LIZ;
    }
}
