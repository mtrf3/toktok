package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tc3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74999Tc3<T> implements InterfaceC64592gB {
    public final /* synthetic */ C74996Tc0 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC75014TcI LJLJJI;

    public C74999Tc3(C74996Tc0 c74996Tc0, String str, int i, InterfaceC75014TcI interfaceC75014TcI) {
        this.LJLIL = c74996Tc0;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = interfaceC75014TcI;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C28467BFf it = (C28467BFf) obj;
        o.LJIIIIZZ(it, "it");
        if (C74947TbD.LJIJI(it)) {
            C28733BPl.LJIILIIL().LJIIIIZZ(this.LJLIL.LIZJ, C113554cx.LJJLIIIIJ(new OSZ("action", "zoomGuestToMax"), new OSZ("linkMicId", this.LJLILLLLZI), new OSZ("httpresult", "success")));
            C74824TYe.LIZ.LJJIFFI(this.LJLJI, Long.valueOf(C74998Tc2.LIZJ(this.LJLILLLLZI)).toString(), "enlarge");
            InterfaceC75014TcI interfaceC75014TcI = this.LJLJJI;
            if (interfaceC75014TcI != null) {
                interfaceC75014TcI.LIZIZ(this.LJLILLLLZI);
                return;
            }
            return;
        }
        this.LJLIL.LJIIIIZZ(null, this.LJLJJI, this.LJLILLLLZI, it.statusCode, it.LJ.message);
    }
}
