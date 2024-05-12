package X;

import kotlin.jvm.internal.o;

/* renamed from: X.23U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C23U extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC43021mU, C76800UCe> {
    public final /* synthetic */ C07070Pn<Float, C1JM> LJLIL;
    public final /* synthetic */ InterfaceC14950iJ LJLILLLLZI;
    public final /* synthetic */ C15010iP LJLJI;
    public final /* synthetic */ C18810oX LJLJJI;
    public final /* synthetic */ AbstractC11740d8 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23U(C07070Pn<Float, C1JM> c07070Pn, InterfaceC14950iJ interfaceC14950iJ, C15010iP c15010iP, C18810oX c18810oX, AbstractC11740d8 abstractC11740d8) {
        super(1);
        this.LJLIL = c07070Pn;
        this.LJLILLLLZI = interfaceC14950iJ;
        this.LJLJI = c15010iP;
        this.LJLJJI = c18810oX;
        this.LJLJJL = abstractC11740d8;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC43021mU interfaceC43021mU) {
        C10390ax c10390ax;
        C0VG c0vg;
        InterfaceC43021mU drawWithContent = interfaceC43021mU;
        o.LJIIIZ(drawWithContent, "$this$drawWithContent");
        drawWithContent.LJJLIIIIJ();
        float LJIIJJI = C78842Uww.LJIIJJI(this.LJLIL.LIZJ().floatValue(), 0.0f, 1.0f);
        if (LJIIJJI != 0.0f) {
            int LIZIZ = this.LJLILLLLZI.LIZIZ((int) (this.LJLJI.LIZIZ >> 32));
            C18830oZ LIZJ = this.LJLJJI.LIZJ();
            if (LIZJ != null && (c0vg = LIZJ.LIZ) != null) {
                c10390ax = c0vg.LIZJ(LIZIZ);
            } else {
                c10390ax = new C10390ax(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float LJJJJIZL = drawWithContent.LJJJJIZL(C18740oQ.LIZIZ);
            float f = LJJJJIZL / 2;
            float f2 = c10390ax.LIZ + f;
            float LIZLLL = C10430b1.LIZLLL(drawWithContent.LIZIZ()) - f;
            if (f2 > LIZLLL) {
                f2 = LIZLLL;
            }
            C14720hw.LJFF(drawWithContent, this.LJLJJL, C78923UyF.LIZ(f2, c10390ax.LIZIZ), C78923UyF.LIZ(f2, c10390ax.LIZLLL), LJJJJIZL, LJIIJJI, 432);
        }
        return C76800UCe.LIZ;
    }
}
