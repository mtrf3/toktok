package X;

import Y.IDeS153S0200000_15;
import Y.IDeS363S0100000_42;
import Y.IDfS134S0100000_42;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$resolveOnBoarding$1", f = "MainFragment.kt", l = {1932}, m = "invokeSuspend")
/* renamed from: X.aol, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94919aol extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MainFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94919aol(MainFragment mainFragment, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mainFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94919aol(this.LJLILLLLZI, completion);
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
            MainFragment mainFragment = this.LJLILLLLZI;
            IDeS363S0100000_42 iDeS363S0100000_42 = new IDeS363S0100000_42(new IDeS153S0200000_15(new C3CJ(mainFragment.LJLJLLL, mainFragment.LJLL, new C94917aoj(null)), new C94918aok(this, null), 0), 3);
            IDfS134S0100000_42 iDfS134S0100000_42 = new IDfS134S0100000_42(this, 6);
            this.LJLIL = 1;
            if (iDeS363S0100000_42.collect(iDfS134S0100000_42, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
