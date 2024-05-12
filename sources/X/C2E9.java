package X;

import Y.IDfS125S0100000;
import fjb.a;
import kotlin.jvm.internal.IDqS32S0300000;

@InterfaceC65848Psq(c = "androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1", f = "LazyNearestItemsRange.kt", l = {66}, m = "invokeSuspend")
/* renamed from: X.2E9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2E9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<Integer> LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<Integer> LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<Integer> LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<C40517FvF> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2E9(InterfaceC65784Pro<Integer> interfaceC65784Pro, InterfaceC65784Pro<Integer> interfaceC65784Pro2, InterfaceC65784Pro<Integer> interfaceC65784Pro3, InterfaceC35811ar<C40517FvF> interfaceC35811ar, InterfaceC67352kd<? super C2E9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = interfaceC65784Pro2;
        this.LJLJJI = interfaceC65784Pro3;
        this.LJLJJL = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2E9(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            C3C3 LJJJJZI = C78966Uyw.LJJJJZI(new IDqS32S0300000(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, (InterfaceC65784Pro<Integer>) 10));
            IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(this.LJLJJL, 22);
            this.LJLIL = 1;
            if (LJJJJZI.collect(iDfS125S0100000, this) == enumC58928NAu) {
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
