package X;

import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AFL extends AbstractC65781Prl implements InterfaceC88472Yns<SY4, C76800UCe> {
    public static final AFL LJLIL = new AFL();

    public AFL() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SY4 sy4) {
        SY4 configButton = sy4;
        o.LJIIIZ(configButton, "$this$configButton");
        configButton.setEnabled(false);
        configButton.setSupportClickWhenDisable(true);
        return C76800UCe.LIZ;
    }
}
