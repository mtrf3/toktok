package X;

import Y.IDObserverS227S0100000_42;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$initObserver$3$2$1", f = "MainFragment.kt", l = {693}, m = "invokeSuspend")
/* renamed from: X.aoZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94907aoZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IDqS423S0100000_42 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94907aoZ(IDqS423S0100000_42 iDqS423S0100000_42, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iDqS423S0100000_42;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94907aoZ(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            XLL xll = ((MainFragment) ((IDObserverS227S0100000_42) this.LJLILLLLZI.l0).l0).LJLJLLL;
            C76800UCe c76800UCe = C76800UCe.LIZ;
            this.LJLIL = 1;
            if (xll.emit(c76800UCe, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}