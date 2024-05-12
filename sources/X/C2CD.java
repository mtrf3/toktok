package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.kt", l = {322}, m = "invokeSuspend")
/* renamed from: X.2CD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C31441Lg LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CD(C31441Lg c31441Lg, InterfaceC67352kd<? super C2CD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c31441Lg;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2CD c2cd = new C2CD(this.LJLJI, interfaceC67352kd);
        c2cd.LJLILLLLZI = obj;
        return c2cd;
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
            InterfaceC37501da interfaceC37501da = (InterfaceC37501da) this.LJLILLLLZI;
            C2CC c2cc = new C2CC(this.LJLJI, null);
            this.LJLIL = 1;
            if (C0UR.LIZIZ(interfaceC37501da, c2cc, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
