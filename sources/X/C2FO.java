package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {50, 52}, m = "invokeSuspend")
/* renamed from: X.2FO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C07070Pn<Float, C1JM> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FO(C07070Pn<Float, C1JM> c07070Pn, InterfaceC67352kd<? super C2FO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c07070Pn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2FO(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C07070Pn<Float, C1JM> c07070Pn = this.LJLILLLLZI;
            Float f = new Float(1.0f);
            this.LJLIL = 1;
            if (c07070Pn.LIZLLL(f, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C07070Pn<Float, C1JM> c07070Pn2 = this.LJLILLLLZI;
        Float f2 = new Float(0.0f);
        C1JB c1jb = C18740oQ.LIZ;
        this.LJLIL = 2;
        if (C07070Pn.LIZIZ(c07070Pn2, f2, c1jb, null, this, 12) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
