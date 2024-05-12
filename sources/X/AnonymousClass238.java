package X;

import kotlin.jvm.internal.o;

/* renamed from: X.238, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass238 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC43021mU, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ InterfaceC12040dc LJLILLLLZI;
    public final /* synthetic */ C11890dN LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass238(float f, InterfaceC12040dc interfaceC12040dc, C11890dN c11890dN) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = interfaceC12040dc;
        this.LJLJI = c11890dN;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC43021mU interfaceC43021mU) {
        InterfaceC43021mU onDrawWithContent = interfaceC43021mU;
        o.LJIIIZ(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.LJJLIIIIJ();
        float f = this.LJLIL;
        InterfaceC12040dc interfaceC12040dc = this.LJLILLLLZI;
        C11890dN c11890dN = this.LJLJI;
        C33681Tw LJJIII = onDrawWithContent.LJJIII();
        long LIZIZ = LJJIII.LIZIZ();
        LJJIII.LIZ().LJIIL();
        C14690ht c14690ht = LJJIII.LIZ;
        c14690ht.LJI(f, 0.0f);
        c14690ht.LIZLLL(C10370av.LIZIZ);
        C14720hw.LJ(onDrawWithContent, interfaceC12040dc, c11890dN);
        LJJIII.LIZ().LJIIJ();
        LJJIII.LIZJ(LIZIZ);
        return C76800UCe.LIZ;
    }
}
