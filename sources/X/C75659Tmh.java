package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tmh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75659Tmh extends AbstractC65781Prl implements InterfaceC88472Yns<EnumC75620Tm4, C76800UCe> {
    public static final C75659Tmh LJLIL = new C75659Tmh();

    public C75659Tmh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EnumC75620Tm4 enumC75620Tm4) {
        EnumC75620Tm4 state = enumC75620Tm4;
        o.LJIIIZ(state, "state");
        if (C75663Tml.LIZ[state.ordinal()] == 1) {
            C0NB.LIZIZ("TopicPairManager", "MultiHostState change to Linked, dealWhenFirstFrameRander()");
            C73411SrX c73411SrX = C75650TmY.LJFF;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
        }
        return C76800UCe.LIZ;
    }
}
