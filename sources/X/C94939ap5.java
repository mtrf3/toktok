package X;

import Y.IDfS28S0200000_42;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$initObserver$$inlined$launchAndCollectIn$7$1", f = "MainFragment.kt", l = {23}, m = "invokeSuspend")
/* renamed from: X.ap5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94939ap5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C94943ap9 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94939ap5(C94943ap9 c94943ap9, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c94943ap9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C94939ap5 c94939ap5 = new C94939ap5(this.LJLJI, completion);
        c94939ap5.LJLIL = obj;
        return c94939ap5;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
            InterfaceC65462ha interfaceC65462ha = this.LJLJI.LJLILLLLZI;
            IDfS28S0200000_42 iDfS28S0200000_42 = new IDfS28S0200000_42(this, interfaceC70422pa, 27);
            this.LJLILLLLZI = 1;
            if (interfaceC65462ha.collect(iDfS28S0200000_42, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
