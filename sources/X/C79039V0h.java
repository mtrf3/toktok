package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.tux.compose.TuxTextKt$TuxText$7$1$1$1$1$up$1", f = "TuxText.kt", l = {176}, m = "invokeSuspend")
/* renamed from: X.V0h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79039V0h extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C11P>, Object> {
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;

    public C79039V0h(InterfaceC67352kd<? super C79039V0h> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79039V0h c79039V0h = new C79039V0h(interfaceC67352kd);
        c79039V0h.LJLJI = obj;
        return c79039V0h;
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
            obj = C0UM.LIZLLL(interfaceC37471dX, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C11P c11p = (C11P) obj;
        if (c11p != null) {
            if (c11p.LIZLLL != c11p.LJI) {
                c11p.LIZ();
                return c11p;
            }
            return c11p;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C11P> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
