package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1wU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49221wU extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC43021mU, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ AbstractC11740d8 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ C43041mW LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49221wU(boolean z, AbstractC11740d8 abstractC11740d8, long j, float f, float f2, long j2, long j3, C43041mW c43041mW) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = abstractC11740d8;
        this.LJLJI = j;
        this.LJLJJI = f;
        this.LJLJJL = f2;
        this.LJLJJLL = j2;
        this.LJLJL = j3;
        this.LJLJLJ = c43041mW;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC43021mU interfaceC43021mU) {
        InterfaceC43021mU onDrawWithContent = interfaceC43021mU;
        o.LJIIIZ(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.LJJLIIIIJ();
        if (this.LJLIL) {
            C14720hw.LJIIIZ(onDrawWithContent, this.LJLILLLLZI, 0L, 0L, this.LJLJI, null, 246);
        } else {
            float LIZIZ = C10340as.LIZIZ(this.LJLJI);
            float f = this.LJLJJI;
            if (LIZIZ < f) {
                float f2 = this.LJLJJL;
                float LIZLLL = C10430b1.LIZLLL(onDrawWithContent.LIZIZ()) - this.LJLJJL;
                float LIZIZ2 = C10430b1.LIZIZ(onDrawWithContent.LIZIZ()) - this.LJLJJL;
                AbstractC11740d8 abstractC11740d8 = this.LJLILLLLZI;
                long j = this.LJLJI;
                C33681Tw LJJIII = onDrawWithContent.LJJIII();
                long LIZIZ3 = LJJIII.LIZIZ();
                LJJIII.LIZ().LJIIL();
                LJJIII.LIZ.LIZIZ(f2, f2, LIZLLL, LIZIZ2, 0);
                C14720hw.LJIIIZ(onDrawWithContent, abstractC11740d8, 0L, 0L, j, null, 246);
                LJJIII.LIZ().LJIIJ();
                LJJIII.LIZJ(LIZIZ3);
            } else {
                C14720hw.LJIIIZ(onDrawWithContent, this.LJLILLLLZI, this.LJLJJLL, this.LJLJL, C78999UzT.LJJI(f, this.LJLJI), this.LJLJLJ, 208);
            }
        }
        return C76800UCe.LIZ;
    }
}
