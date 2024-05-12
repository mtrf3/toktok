package X;

/* renamed from: X.3C7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3C7 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ AbstractC72932td<Object> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<C3C8, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<C3C8, Throwable, C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<C3C8, Object, C76800UCe> LJLJJI;
    public final /* synthetic */ C3C8 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3C7(AbstractC72932td<Object> abstractC72932td, InterfaceC88472Yns<C3C8, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<C3C8, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<C3C8, Object, C76800UCe> interfaceC88471Ynr2, C3C8 c3c8) {
        super(0);
        this.LJLIL = abstractC72932td;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = interfaceC88471Ynr2;
        this.LJLJJL = c3c8;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC88471Ynr<C3C8, Object, C76800UCe> interfaceC88471Ynr;
        AbstractC72932td<Object> abstractC72932td = this.LJLIL;
        if (abstractC72932td instanceof C72922tc) {
            InterfaceC88472Yns<C3C8, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(this.LJLJJL);
            }
        } else if (abstractC72932td instanceof C3C1) {
            InterfaceC88471Ynr<C3C8, Throwable, C76800UCe> interfaceC88471Ynr2 = this.LJLJI;
            if (interfaceC88471Ynr2 != null) {
                interfaceC88471Ynr2.invoke(this.LJLJJL, ((C3C1) abstractC72932td).LIZ);
            }
        } else if ((abstractC72932td instanceof C72912tb) && (interfaceC88471Ynr = this.LJLJJI) != null) {
            interfaceC88471Ynr.invoke(this.LJLJJL, ((C72912tb) abstractC72932td).LIZ);
        }
        return C76800UCe.LIZ;
    }
}
