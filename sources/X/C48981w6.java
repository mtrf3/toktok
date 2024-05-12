package X;

import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1w6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48981w6 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC07280Qi, C76800UCe> {
    public final /* synthetic */ C0QW LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI = null;
    public final /* synthetic */ String LJLJJI = null;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48981w6(C0QW c0qw, String str, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        super(1);
        this.LJLIL = c0qw;
        this.LJLILLLLZI = str;
        this.LJLJJL = z;
        this.LJLJJLL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC07280Qi interfaceC07280Qi) {
        InterfaceC07280Qi semantics = interfaceC07280Qi;
        o.LJIIIZ(semantics, "$this$semantics");
        C0QW c0qw = this.LJLIL;
        if (c0qw != null) {
            C07260Qg.LIZJ(semantics, c0qw.LIZ);
        }
        C07260Qg.LIZ(semantics, this.LJLILLLLZI, new IDqS420S0100000(this.LJLJJLL, 85));
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJI;
        if (interfaceC65784Pro != null) {
            semantics.LIZJ(C0QY.LIZJ, new C0QK(this.LJLJJI, new IDqS420S0100000(interfaceC65784Pro, 86)));
        }
        if (!this.LJLJJL) {
            semantics.LIZJ(C07230Qd.LJIIIIZZ, C76800UCe.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
