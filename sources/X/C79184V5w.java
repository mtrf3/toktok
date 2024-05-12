package X;

import fjb.a;
import kotlin.jvm.internal.AqS163S0100000_13;

@InterfaceC65848Psq(c = "tiktok.compose.paging.PagingLazyExtensionKt$LaunchPagingEffect$1", f = "PagingLazyExtension.kt", l = {117}, m = "invokeSuspend")
/* renamed from: X.V5w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79184V5w extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C0UK LJLILLLLZI;
    public final /* synthetic */ V6O<T> LJLJI;
    public final /* synthetic */ V7O LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<V75, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJL;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLJJLL;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C79184V5w(C0UK c0uk, V6O<T> v6o, V7O v7o, InterfaceC88471Ynr<? super V75, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC24760y8<Integer> interfaceC24760y8, InterfaceC24760y8<Integer> interfaceC24760y82, InterfaceC67352kd<? super C79184V5w> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c0uk;
        this.LJLJI = v6o;
        this.LJLJJI = v7o;
        this.LJLJJL = interfaceC88471Ynr;
        this.LJLJJLL = interfaceC24760y8;
        this.LJLJL = interfaceC24760y82;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C79184V5w(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
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
            C3C3 LJJJJZI = C78966Uyw.LJJJJZI(new AqS163S0100000_13(this.LJLILLLLZI, 330));
            V6K v6k = new V6K(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
            this.LJLIL = 1;
            if (LJJJJZI.collect(v6k, this) == enumC58928NAu) {
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
