package X;

import kotlin.jvm.internal.o;

/* renamed from: X.26l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C530726l extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe> {
    public final /* synthetic */ Object LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C530726l(int i, int i2, Object obj) {
        super(3);
        this.LJLIL = obj;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC24420xa<?> interfaceC24420xa, C24570xp c24570xp, InterfaceC24350xT interfaceC24350xT) {
        C24570xp c24570xp2 = c24570xp;
        C1JX.LJIIIZ(interfaceC24420xa, "<anonymous parameter 0>", c24570xp2, "slots", interfaceC24350xT, "<anonymous parameter 2>");
        if (o.LJ(this.LJLIL, c24570xp2.LJJIL(this.LJLILLLLZI, this.LJLJI))) {
            int i = this.LJLJI;
            InterfaceC24520xk.LIZ.getClass();
            c24570xp2.LJJIJIL(i, C24500xi.LIZIZ);
            return C76800UCe.LIZ;
        }
        "Slot table is out of sync".toString();
        C24780yA.LIZJ("Slot table is out of sync");
        throw null;
    }
}
