package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.TKc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74458TKc extends AbstractC65781Prl implements InterfaceC88472Yns<C74461TKf, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ TKR LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74458TKc(Context context, float f, float f2, TKR tkr, boolean z, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = tkr;
        this.LJLJJL = z;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C74461TKf c74461TKf) {
        C74461TKf receiver = c74461TKf;
        o.LJIIIZ(receiver, "$receiver");
        receiver.LIZLLL = (int) TKO.LIZIZ(this.LJLIL, this.LJLILLLLZI);
        receiver.LJ = (int) TKO.LIZIZ(this.LJLIL, this.LJLJI);
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
        receiver.LIZIZ = (int) TKO.LIZIZ(this.LJLIL, tkr.LJLJJI);
        receiver.LIZJ = (int) TKO.LIZIZ(this.LJLIL, this.LJLJJI.LJLJI);
        TKR tkr2 = this.LJLJJI;
        receiver.LJIJJ = tkr2.LJLJJL;
        receiver.LJIJI = tkr2.LLFF;
        receiver.LJJIJL = tkr2.LLI;
        receiver.LJJIJLIJ = tkr2.LLIFFJFJJ;
        receiver.LJJII = tkr2.LLIIII;
        receiver.LJJIL = true;
        receiver.LJJIZ = this.LJLJJL;
        InterfaceC88472Yns<? super C74462TKg, C76800UCe> interfaceC88472Yns = tkr2.LJLZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(receiver);
        }
        this.LJLJJLL.invoke(receiver);
        return C76800UCe.LIZ;
    }
}
