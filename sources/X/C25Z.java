package X;

import kotlin.jvm.internal.o;

/* renamed from: X.25Z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25Z extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC43021mU, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ C0SX LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25Z(float f, C0SX c0sx) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = c0sx;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC43021mU interfaceC43021mU) {
        InterfaceC43021mU drawWithContent = interfaceC43021mU;
        o.LJIIIZ(drawWithContent, "$this$drawWithContent");
        drawWithContent.LJJLIIIIJ();
        if (!C23390vv.LIZJ(this.LJLIL, 0.0f)) {
            float density = drawWithContent.getDensity() * this.LJLIL;
            float LIZIZ = C10430b1.LIZIZ(drawWithContent.LIZIZ()) - (density / 2);
            C14720hw.LJFF(drawWithContent, this.LJLILLLLZI.LIZIZ, C78923UyF.LIZ(0.0f, LIZIZ), C78923UyF.LIZ(C10430b1.LIZLLL(drawWithContent.LIZIZ()), LIZIZ), density, 0.0f, 496);
        }
        return C76800UCe.LIZ;
    }
}
