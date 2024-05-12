package X;

/* renamed from: X.CBo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30920CBo extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public static final C30920CBo LJLIL = new C30920CBo();

    public C30920CBo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            UFK.LIZJ(C47261Igj.LJJIJ(1), 512, EnumC30915CBj.SUB_GOAL_PIN_CARD);
        } else {
            UFK.LIZIZ(C47261Igj.LJJIJ(1), 512, EnumC30915CBj.SUB_GOAL_PIN_CARD);
        }
        return C76800UCe.LIZ;
    }
}
