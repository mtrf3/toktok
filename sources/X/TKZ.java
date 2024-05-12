package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKZ extends AbstractC65781Prl implements InterfaceC88472Yns<C74463TKh, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ TKR LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TKZ(Context context, float f, float f2, TKR tkr, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = tkr;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C74463TKh c74463TKh) {
        C74463TKh receiver = c74463TKh;
        o.LJIIIZ(receiver, "$receiver");
        receiver.LIZLLL = (int) TKP.LIZ(this.LJLIL, this.LJLILLLLZI);
        receiver.LJ = (int) TKP.LIZ(this.LJLIL, this.LJLJI);
        TKR tkr = this.LJLJJI;
        receiver.LIZ = tkr.LJLIL;
        receiver.LJIJ = true;
        receiver.LJIIIIZZ = tkr.LJZ;
        receiver.LJIIZILJ = tkr.LJZI;
        receiver.LJIIJJI = tkr.LLD;
        receiver.LJIIL = tkr.LLF;
        receiver.LJIL = tkr.LJLILLLLZI;
        receiver.LJJIJIIJI = tkr.LJLLJ;
        receiver.LJJIJIIJIL = tkr.LJLLL;
        receiver.LIZIZ = (int) TKP.LIZ(this.LJLIL, tkr.LJLJJI);
        TKR tkr2 = this.LJLJJI;
        receiver.LJIJJ = tkr2.LJLJJL;
        receiver.LJIJI = tkr2.LLFF;
        InterfaceC88472Yns<? super C74462TKg, C76800UCe> interfaceC88472Yns = tkr2.LJLZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(receiver);
        }
        this.LJLJJL.invoke(receiver);
        return C76800UCe.LIZ;
    }
}
