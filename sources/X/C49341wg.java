package X;

/* renamed from: X.1wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49341wg extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C0SQ LJLIL;
    public final /* synthetic */ InterfaceC23370vt LJLILLLLZI;
    public final /* synthetic */ InterfaceC24760y8<Boolean> LJLJI;
    public final /* synthetic */ InterfaceC24760y8<C10370av> LJLJJI;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC88472Yns<InterfaceC23370vt, C10370av>> LJLJJL;
    public final /* synthetic */ InterfaceC35811ar<C10370av> LJLJJLL;
    public final /* synthetic */ InterfaceC24760y8<Float> LJLJL;
    public final /* synthetic */ C72242sW LJLJLJ;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC88472Yns<C23430vz, C76800UCe>> LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C49341wg(C0SQ c0sq, InterfaceC23370vt interfaceC23370vt, InterfaceC24760y8<Boolean> interfaceC24760y8, InterfaceC24760y8<C10370av> interfaceC24760y82, InterfaceC24760y8<? extends InterfaceC88472Yns<? super InterfaceC23370vt, C10370av>> interfaceC24760y83, InterfaceC35811ar<C10370av> interfaceC35811ar, InterfaceC24760y8<Float> interfaceC24760y84, C72242sW c72242sW, InterfaceC24760y8<? extends InterfaceC88472Yns<? super C23430vz, C76800UCe>> interfaceC24760y85) {
        super(0);
        this.LJLIL = c0sq;
        this.LJLILLLLZI = interfaceC23370vt;
        this.LJLJI = interfaceC24760y8;
        this.LJLJJI = interfaceC24760y82;
        this.LJLJJL = interfaceC24760y83;
        this.LJLJJLL = interfaceC35811ar;
        this.LJLJL = interfaceC24760y84;
        this.LJLJLJ = c72242sW;
        this.LJLJLLL = interfaceC24760y85;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        long j;
        if (this.LJLJI.getValue().booleanValue()) {
            C0SQ c0sq = this.LJLIL;
            long j2 = this.LJLJJI.getValue().LIZ;
            C10370av invoke = this.LJLJJL.getValue().invoke(this.LJLILLLLZI);
            InterfaceC35811ar<C10370av> interfaceC35811ar = this.LJLJJLL;
            long j3 = invoke.LIZ;
            if (C78923UyF.LJIILL(j3)) {
                j = C10370av.LJI(interfaceC35811ar.getValue().LIZ, j3);
            } else {
                j = C10370av.LIZLLL;
            }
            c0sq.LIZIZ(this.LJLJL.getValue().floatValue(), j2, j);
            long LIZ = this.LJLIL.LIZ();
            C72242sW c72242sW = this.LJLJLJ;
            InterfaceC23370vt interfaceC23370vt = this.LJLILLLLZI;
            InterfaceC24760y8<InterfaceC88472Yns<C23430vz, C76800UCe>> interfaceC24760y8 = this.LJLJLLL;
            if (!C23490w5.LIZ(LIZ, c72242sW.element)) {
                c72242sW.element = LIZ;
                InterfaceC88472Yns<C23430vz, C76800UCe> value = interfaceC24760y8.getValue();
                if (value != null) {
                    value.invoke(new C23430vz(interfaceC23370vt.LJIJ(C78996UzQ.LJJJJIZL(LIZ))));
                }
            }
        } else {
            this.LJLIL.dismiss();
        }
        return C76800UCe.LIZ;
    }
}
