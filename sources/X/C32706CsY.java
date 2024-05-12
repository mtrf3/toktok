package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.list.viewholder.LiveGiftAbsViewHolderV2$initImageAndData$1$onLoadSuccess$1", f = "LiveGiftAbsViewHolderV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.CsY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32706CsY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC32678Cs6 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32706CsY(AbstractC32678Cs6 abstractC32678Cs6, long j, boolean z, long j2, String str, InterfaceC67352kd<? super C32706CsY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC32678Cs6;
        this.LJLILLLLZI = j;
        this.LJLJI = z;
        this.LJLJJI = j2;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32706CsY(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        AbstractC32678Cs6 abstractC32678Cs6 = this.LJLIL;
        long j = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        long j2 = this.LJLJJI;
        String str = this.LJLJJL;
        abstractC32678Cs6.getClass();
        if (str == null) {
            str = "";
        }
        C32710Csc.LJI(0, "", str, j, j2, z ? 1 : 0);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
