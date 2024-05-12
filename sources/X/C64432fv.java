package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {51}, m = "invokeSuspend")
/* renamed from: X.2fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64432fv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC70422pa, InterfaceC64672gJ<Object>, InterfaceC67352kd<? super C76800UCe>, Object> LJLJI;
    public final /* synthetic */ InterfaceC64672gJ<Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C64432fv(InterfaceC88473Ynt<? super InterfaceC70422pa, ? super InterfaceC64672gJ<Object>, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88473Ynt, InterfaceC64672gJ<Object> interfaceC64672gJ, InterfaceC67352kd<? super C64432fv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC88473Ynt;
        this.LJLJJI = interfaceC64672gJ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C64432fv c64432fv = new C64432fv(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c64432fv.LJLILLLLZI = obj;
        return c64432fv;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            Object obj2 = this.LJLILLLLZI;
            InterfaceC88473Ynt<InterfaceC70422pa, InterfaceC64672gJ<Object>, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88473Ynt = this.LJLJI;
            InterfaceC64672gJ<Object> interfaceC64672gJ = this.LJLJJI;
            this.LJLIL = 1;
            if (interfaceC88473Ynt.invoke(obj2, interfaceC64672gJ, this) == enumC58928NAu) {
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
