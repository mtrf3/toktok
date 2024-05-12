package X;

import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$resolveOnBoarding$1$1", f = "MainFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aoj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94917aoj extends AbstractC65782Prm implements InterfaceC88473Ynt<C76800UCe, C76800UCe, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C94917aoj(InterfaceC67352kd interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(C76800UCe c76800UCe, C76800UCe c76800UCe2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        InterfaceC67352kd<? super C76800UCe> continuation = interfaceC67352kd;
        o.LJIIIZ(c76800UCe, "<anonymous parameter 0>");
        o.LJIIIZ(c76800UCe2, "<anonymous parameter 1>");
        o.LJIIIZ(continuation, "continuation");
        return new C94917aoj(continuation).invokeSuspend(C76800UCe.LIZ);
    }
}
