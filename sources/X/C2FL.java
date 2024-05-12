package X;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {68}, m = "invokeSuspend")
/* renamed from: X.2FL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FL extends AbstractC65782Prm implements InterfaceC88473Ynt<C1N5, C10370av, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ C1N5 LJLILLLLZI;
    public /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<C1OJ> LJLJJL;
    public final /* synthetic */ C1OH LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FL(C1OH c1oh, InterfaceC35811ar interfaceC35811ar, InterfaceC67352kd interfaceC67352kd, InterfaceC70422pa interfaceC70422pa) {
        super(3, interfaceC67352kd);
        this.LJLJJI = interfaceC70422pa;
        this.LJLJJL = interfaceC35811ar;
        this.LJLJJLL = c1oh;
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
            C1N5 c1n5 = this.LJLILLLLZI;
            XKX.LIZLLL(this.LJLJJI, null, null, new C2FJ(this.LJLJJL, this.LJLJI, this.LJLJJLL, null), 3);
            this.LJLIL = 1;
            obj = c1n5.LJJJLIIL(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        XKX.LIZLLL(this.LJLJJI, null, null, new C2FK(this.LJLJJLL, this.LJLJJL, null, booleanValue), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(C1N5 c1n5, C10370av c10370av, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        long j = c10370av.LIZ;
        InterfaceC70422pa interfaceC70422pa = this.LJLJJI;
        InterfaceC35811ar<C1OJ> interfaceC35811ar = this.LJLJJL;
        C2FL c2fl = new C2FL(this.LJLJJLL, interfaceC35811ar, interfaceC67352kd, interfaceC70422pa);
        c2fl.LJLILLLLZI = c1n5;
        c2fl.LJLJI = j;
        return c2fl.invokeSuspend(C76800UCe.LIZ);
    }
}
