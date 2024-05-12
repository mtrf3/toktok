package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V29 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC43021mU, C76800UCe> {
    public final /* synthetic */ float LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V29(float f) {
        super(1);
        this.LJLIL = f;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC43021mU interfaceC43021mU) {
        InterfaceC43021mU drawWithContent = interfaceC43021mU;
        o.LJIIIZ(drawWithContent, "$this$drawWithContent");
        float LIZLLL = C10430b1.LIZLLL(drawWithContent.LIZIZ()) * this.LJLIL;
        float LIZIZ = C10430b1.LIZIZ(drawWithContent.LIZIZ());
        C33681Tw LJJIII = drawWithContent.LJJIII();
        long LIZIZ2 = LJJIII.LIZIZ();
        LJJIII.LIZ().LJIIL();
        LJJIII.LIZ.LIZIZ(0.0f, 0.0f, LIZLLL, LIZIZ, 1);
        drawWithContent.LJJLIIIIJ();
        LJJIII.LIZ().LJIIJ();
        LJJIII.LIZJ(LIZIZ2);
        return C76800UCe.LIZ;
    }
}
