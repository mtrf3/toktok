package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.TKb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74457TKb extends AbstractC65781Prl implements InterfaceC88472Yns<C74459TKd, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ TKR LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ InterfaceC88472Yns LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74457TKb(Context context, float f, float f2, int i, TKR tkr, int i2, int i3, boolean z, boolean z2, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = i;
        this.LJLJJL = tkr;
        this.LJLJJLL = i2;
        this.LJLJL = i3;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
        this.LJLL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C74459TKd c74459TKd) {
        C74459TKd receiver = c74459TKd;
        o.LJIIIZ(receiver, "$receiver");
        receiver.LIZLLL = (int) TKL.LIZIZ(this.LJLIL, this.LJLILLLLZI);
        receiver.LJ = (int) TKL.LIZIZ(this.LJLIL, this.LJLJI);
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
        receiver.LJIILIIL = this.LJLJJLL;
        receiver.LJIILJJIL = this.LJLJL;
        receiver.LJIL = tkr.LJLILLLLZI;
        receiver.LJJIJIL = tkr.LJLLJ;
        receiver.LJJIJL = tkr.LJLLL;
        receiver.LIZIZ = (int) TKL.LIZIZ(this.LJLIL, tkr.LJLJJI);
        receiver.LIZJ = (int) TKL.LIZIZ(this.LJLIL, this.LJLJJL.LJLJI);
        TKR tkr2 = this.LJLJJL;
        receiver.LJIJJ = tkr2.LJLJJL;
        receiver.LJIJI = tkr2.LLFF;
        receiver.LJJII = tkr2.LLIIII;
        receiver.LJJIL = true;
        receiver.LJJIZ = this.LJLJLJ;
        receiver.LJJIIJ = tkr2.LLIIIJ;
        receiver.LJJIIJZLJL = tkr2.LLIIIZ;
        receiver.LJJIII = this.LJLJLLL;
        InterfaceC88472Yns<? super C74462TKg, C76800UCe> interfaceC88472Yns = tkr2.LJLZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(receiver);
        }
        this.LJLL.invoke(receiver);
        return C76800UCe.LIZ;
    }
}
