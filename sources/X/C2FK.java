package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {77}, m = "invokeSuspend")
/* renamed from: X.2FK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC35811ar LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<C1OJ> LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C1OH LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FK(C1OH c1oh, InterfaceC35811ar interfaceC35811ar, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = z;
        this.LJLJJL = c1oh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2FK(this.LJLJJL, this.LJLJI, interfaceC67352kd, this.LJLJJI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC35811ar<C1OJ> interfaceC35811ar;
        C0X8 c1oi;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                interfaceC35811ar = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C1OJ value = this.LJLJI.getValue();
            if (value != null) {
                boolean z = this.LJLJJI;
                C1OH c1oh = this.LJLJJL;
                interfaceC35811ar = this.LJLJI;
                if (z) {
                    c1oi = new C1OK(value);
                } else {
                    c1oi = new C1OI(value);
                }
                if (c1oh != null) {
                    this.LJLIL = interfaceC35811ar;
                    this.LJLILLLLZI = 1;
                    if (c1oh.LIZIZ(c1oi, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
            return C76800UCe.LIZ;
        }
        interfaceC35811ar.setValue(null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
