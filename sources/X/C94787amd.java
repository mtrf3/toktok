package X;

import com.bytedance.ugc.effectcreator.main.MainImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainImpl$onFireEvent$1", f = "MainImpl.kt", l = {127}, m = "invokeSuspend")
/* renamed from: X.amd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94787amd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MainImpl LJLILLLLZI;
    public final /* synthetic */ AbstractC93769aWD LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94787amd(MainImpl mainImpl, AbstractC93769aWD abstractC93769aWD, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mainImpl;
        this.LJLJI = abstractC93769aWD;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94787amd(this.LJLILLLLZI, this.LJLJI, completion);
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
            C3BJ<AbstractC93769aWD> c3bj = this.LJLILLLLZI.mainEventFlow;
            AbstractC93769aWD abstractC93769aWD = this.LJLJI;
            this.LJLIL = 1;
            if (c3bj.emit(abstractC93769aWD, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
