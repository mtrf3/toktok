package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", f = "Clickable.kt", l = {557}, m = "invokeSuspend")
/* renamed from: X.2CF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1OH LJLILLLLZI;
    public final /* synthetic */ C1OJ LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CF(C1OH c1oh, C1OJ c1oj, InterfaceC67352kd<? super C2CF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1oh;
        this.LJLJI = c1oj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2CF(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C1OH c1oh = this.LJLILLLLZI;
            C1OK c1ok = new C1OK(this.LJLJI);
            this.LJLIL = 1;
            if (c1oh.LIZIZ(c1ok, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
