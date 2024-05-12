package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.TKa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74456TKa extends AbstractC65781Prl implements InterfaceC88472Yns<C74460TKe, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ TKR LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74456TKa(Context context, float f, float f2, int i, TKR tkr, boolean z, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = i;
        this.LJLJJL = tkr;
        this.LJLJJLL = z;
        this.LJLJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C74460TKe c74460TKe) {
        C74460TKe receiver = c74460TKe;
        o.LJIIIZ(receiver, "$receiver");
        receiver.LIZLLL = (int) TKQ.LIZIZ(this.LJLIL, this.LJLILLLLZI);
        receiver.LJ = (int) TKQ.LIZIZ(this.LJLIL, this.LJLJI);
        int i = this.LJLJJI;
        receiver.LJFF = i;
        receiver.LJI = i;
        TKR tkr = this.LJLJJL;
        receiver.LIZ = tkr.LJLIL;
        receiver.LJIJ = true;
        receiver.LJIIIIZZ = tkr.LJZ;
        receiver.LJIIZILJ = tkr.LJZI;
        receiver.LJJIJIIJI = tkr.LJZL;
        receiver.LJJIJIIJIL = tkr.LL;
        receiver.LJIIJJI = tkr.LLD;
        receiver.LJIIL = tkr.LLF;
        receiver.LJIL = tkr.LJLILLLLZI;
        receiver.LJJIJIL = tkr.LJLLJ;
        receiver.LJJIJL = tkr.LJLLL;
        receiver.LIZIZ = (int) TKQ.LIZIZ(this.LJLIL, tkr.LJLJJI);
        receiver.LIZJ = (int) TKQ.LIZIZ(this.LJLIL, this.LJLJJL.LJLJI);
        TKR tkr2 = this.LJLJJL;
        receiver.LJIJJ = tkr2.LJLJJL;
        receiver.LJIJI = tkr2.LLFF;
        receiver.LJJII = tkr2.LLIIII;
        receiver.LJJIL = true;
        receiver.LJJIIJ = tkr2.LLIIIJ;
        receiver.LJJIIJZLJL = tkr2.LLIIIZ;
        receiver.LJJIIZ = tkr2.LLIIJI;
        receiver.LJJIII = this.LJLJJLL;
        InterfaceC88472Yns<? super C74462TKg, C76800UCe> interfaceC88472Yns = tkr2.LJLZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(receiver);
        }
        this.LJLJL.invoke(receiver);
        return C76800UCe.LIZ;
    }
}
