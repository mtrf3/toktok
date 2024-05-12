package X;

import kotlin.jvm.internal.o;

/* renamed from: X.25F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25F extends AbstractC65781Prl implements InterfaceC88473Ynt<EnumC21820tO, InterfaceC24520xk, Integer, C11850dJ> {
    public final /* synthetic */ InterfaceC21550sx LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C0X9 LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25F(int i, int i2, C0X9 c0x9, InterfaceC21550sx interfaceC21550sx, boolean z, boolean z2) {
        super(3);
        this.LJLIL = interfaceC21550sx;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = c0x9;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C11850dJ invoke(EnumC21820tO it, InterfaceC24520xk interfaceC24520xk, Integer num) {
        boolean z;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        num.intValue();
        o.LJIIIZ(it, "it");
        interfaceC24520xk2.LJJIIJ(697243846);
        InterfaceC21550sx interfaceC21550sx = this.LJLIL;
        boolean z2 = this.LJLILLLLZI;
        if (it == EnumC21820tO.UnfocusedEmpty) {
            z = false;
        } else {
            z = this.LJLJI;
        }
        C0X9 c0x9 = this.LJLJJI;
        int i = (this.LJLJJL >> 27) & 14;
        int i2 = this.LJLJJLL;
        long j = ((C11850dJ) interfaceC21550sx.LIZ(z2, z, c0x9, interfaceC24520xk2, i | ((i2 << 3) & 896) | (i2 & 7168)).getValue()).LIZ;
        interfaceC24520xk2.LJJIJIIJIL();
        return new C11850dJ(j);
    }
}
