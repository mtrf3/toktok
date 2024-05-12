package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
/* renamed from: X.2ED, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ED extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Object>, Object> {
    public int LJLIL;
    public final /* synthetic */ C32991Rf LJLILLLLZI;
    public final /* synthetic */ InterfaceC13460fu LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2ED(C32991Rf c32991Rf, InterfaceC13460fu interfaceC13460fu, InterfaceC67352kd<? super C2ED> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c32991Rf;
        this.LJLJI = interfaceC13460fu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2ED(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Object> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            C32991Rf c32991Rf = this.LJLILLLLZI;
            InterfaceC13460fu interfaceC13460fu = this.LJLJI;
            this.LJLIL = 1;
            obj = c32991Rf.LJFF(interfaceC13460fu, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
