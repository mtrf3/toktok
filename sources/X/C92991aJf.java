package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aJf, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92991aJf extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC33691Tx, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C43041mW LJLJJI;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLJJL;
    public final /* synthetic */ InterfaceC24760y8<Float> LJLJJLL;
    public final /* synthetic */ InterfaceC24760y8<Float> LJLJL;
    public final /* synthetic */ InterfaceC24760y8<Float> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92991aJf(float f, long j, long j2, C43041mW c43041mW, C1JE c1je, C1JE c1je2, C1JE c1je3, C1JE c1je4) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = c43041mW;
        this.LJLJJL = c1je;
        this.LJLJJLL = c1je2;
        this.LJLJL = c1je3;
        this.LJLJLJ = c1je4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC33691Tx interfaceC33691Tx) {
        InterfaceC33691Tx Canvas = interfaceC33691Tx;
        o.LJIIIZ(Canvas, "$this$Canvas");
        float abs = Math.abs(this.LJLJJLL.getValue().floatValue() - this.LJLJL.getValue().floatValue());
        float floatValue = this.LJLJL.getValue().floatValue() + (((this.LJLJJL.getValue().intValue() * 216.0f) % 360.0f) - 90.0f) + this.LJLJLJ.getValue().floatValue();
        float f = this.LJLIL;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        C43041mW c43041mW = this.LJLJJI;
        float f2 = 2;
        float f3 = (((f / (C92057a4b.LIZIZ / f2)) * 57.29578f) / 2.0f) + floatValue;
        float max = Math.max(abs, 0.1f);
        float f4 = c43041mW.LIZ / f2;
        float LIZLLL = C10430b1.LIZLLL(Canvas.LIZIZ()) - (f2 * f4);
        C14720hw.LIZIZ(Canvas, j2, 0.0f, 360.0f, C78923UyF.LIZ(f4, f4), C1DF.LIZIZ(LIZLLL, LIZLLL), c43041mW);
        C14720hw.LIZIZ(Canvas, j, f3, max, C78923UyF.LIZ(f4, f4), C1DF.LIZIZ(LIZLLL, LIZLLL), c43041mW);
        return C76800UCe.LIZ;
    }
}
