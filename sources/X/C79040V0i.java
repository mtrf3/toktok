package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.tux.compose.TuxTextKt$TuxText$7$1$1$1$change$1", f = "TuxText.kt", l = {166}, m = "invokeSuspend")
/* renamed from: X.V0i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79040V0i extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C11P>, Object> {
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;

    public C79040V0i(InterfaceC67352kd<? super C79040V0i> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79040V0i c79040V0i = new C79040V0i(interfaceC67352kd);
        c79040V0i.LJLJI = obj;
        return c79040V0i;
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
            InterfaceC37471dX interfaceC37471dX = (InterfaceC37471dX) this.LJLJI;
            this.LJLILLLLZI = 1;
            obj = C0UM.LIZIZ(interfaceC37471dX, C11I.Main, true, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C11P> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
