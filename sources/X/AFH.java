package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AFH extends AbstractC65781Prl implements InterfaceC88472Yns<SY4, C76800UCe> {
    public static final AFH LJLIL = new AFH();

    public AFH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SY4 sy4) {
        SY4 configButton = sy4;
        o.LJIIIZ(configButton, "$this$configButton");
        configButton.setEnabled(true);
        configButton.setButtonVariant(0);
        C25891AEd c25891AEd = AFF.LIZJ;
        if (c25891AEd != null) {
            c25891AEd.setErrorVisibility(true);
            return C76800UCe.LIZ;
        }
        o.LJIJI("reportReasonReasonList");
        throw null;
    }
}
