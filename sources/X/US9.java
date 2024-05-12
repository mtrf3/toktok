package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class US9 extends AbstractC65781Prl implements InterfaceC88472Yns<C77193URh, C76800UCe> {
    public static final US9 LJLIL = new US9();

    public US9() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C77193URh c77193URh) {
        C77193URh strategyConfig = c77193URh;
        o.LJIIIZ(strategyConfig, "$this$strategyConfig");
        URF urf = URF.NECESSARY;
        o.LJIIIZ(urf, "<set-?>");
        strategyConfig.LIZ = urf;
        strategyConfig.LIZIZ = new USL(EnumC77147UPn.CONTACT);
        URO uro = URO.NORMAL_TIME_AND_TYPE;
        o.LJIIIZ(uro, "<set-?>");
        strategyConfig.LIZLLL = uro;
        return C76800UCe.LIZ;
    }
}
