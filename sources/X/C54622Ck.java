package X;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54622Ck extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, C23560wC, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC35811ar<C25730zh> LJLILLLLZI;
    public final /* synthetic */ InterfaceC24760y8<C0UL> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54622Ck(InterfaceC35811ar<C25730zh> interfaceC35811ar, InterfaceC24760y8<C0UL> interfaceC24760y8, InterfaceC67352kd<? super C54622Ck> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = interfaceC24760y8;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        XKX.LIZLLL(this.LJLILLLLZI.getValue().LIZLLL(), null, null, new C54612Cj(this.LJLJI, this.LJLIL, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, C23560wC c23560wC, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        long j = c23560wC.LIZ;
        C54622Ck c54622Ck = new C54622Ck(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c54622Ck.LJLIL = j;
        return c54622Ck.invokeSuspend(C76800UCe.LIZ);
    }
}
