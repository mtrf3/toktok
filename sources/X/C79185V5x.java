package X;

import fjb.a;

@InterfaceC65848Psq(c = "tiktok.compose.paging.PagingLazyExtensionKt$LaunchPagingEffect$2", f = "PagingLazyExtension.kt", l = {113}, m = "invokeSuspend")
/* renamed from: X.V5x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79185V5x extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ V6O<T> LJLILLLLZI;
    public final /* synthetic */ V7O LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<V75, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJI;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLJJL;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C79185V5x(V6O<T> v6o, V7O v7o, InterfaceC88471Ynr<? super V75, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC24760y8<Integer> interfaceC24760y8, InterfaceC24760y8<Integer> interfaceC24760y82, InterfaceC67352kd<? super C79185V5x> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = v6o;
        this.LJLJI = v7o;
        this.LJLJJI = interfaceC88471Ynr;
        this.LJLJJL = interfaceC24760y8;
        this.LJLJJLL = interfaceC24760y82;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C79185V5x(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            V6O<T> v6o = this.LJLILLLLZI;
            V7O v7o = this.LJLJI;
            InterfaceC88471Ynr<V75, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88471Ynr = this.LJLJJI;
            InterfaceC24760y8<Integer> interfaceC24760y8 = this.LJLJJL;
            InterfaceC24760y8<Integer> interfaceC24760y82 = this.LJLJJLL;
            this.LJLIL = 1;
            if (V6M.LIZIZ(v6o, v7o, interfaceC88471Ynr, interfaceC24760y8, interfaceC24760y82, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
