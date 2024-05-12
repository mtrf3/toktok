package X;

import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49391wl extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC07280Qi, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C31431Lf LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49391wl(boolean z, boolean z2, boolean z3, C31431Lf c31431Lf, InterfaceC70422pa interfaceC70422pa) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = c31431Lf;
        this.LJLJJL = interfaceC70422pa;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC07280Qi interfaceC07280Qi) {
        InterfaceC07280Qi semantics = interfaceC07280Qi;
        o.LJIIIZ(semantics, "$this$semantics");
        C0QX c0qx = new C0QX(new IDqS420S0100000(this.LJLJJI, 82), new IDqS420S0100000(this.LJLJJI, 83), this.LJLIL);
        if (this.LJLILLLLZI) {
            C07260Qg.LJ.LIZ(semantics, C07260Qg.LIZ[6], c0qx);
        } else {
            C07260Qg.LIZLLL.LIZ(semantics, C07260Qg.LIZ[5], c0qx);
        }
        if (this.LJLJI) {
            semantics.LIZJ(C0QY.LIZLLL, new C0QK(null, new C49351wh(this.LJLJJL, this.LJLILLLLZI, this.LJLJJI)));
        }
        return C76800UCe.LIZ;
    }
}
