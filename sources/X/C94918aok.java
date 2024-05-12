package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$resolveOnBoarding$1$2", f = "MainFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aok, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94918aok extends AbstractC65782Prm implements InterfaceC88471Ynr<C76800UCe, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C94919aol LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94918aok(C94919aol c94919aol, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c94919aol;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94918aok(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C76800UCe c76800UCe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c76800UCe, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLILLLLZI.Ol().LJLJJL = true;
        return C76800UCe.LIZ;
    }
}
