package X;

import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM$onFacebookAuth$1", f = "RecUserAfterAuthPopupVM.kt", l = {56}, m = "invokeSuspend")
/* renamed from: X.9Tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237459Tp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ RecUserAfterAuthPopupVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237459Tp(RecUserAfterAuthPopupVM recUserAfterAuthPopupVM, InterfaceC67352kd<? super C237459Tp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = recUserAfterAuthPopupVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237459Tp(this.LJLILLLLZI, interfaceC67352kd);
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
            RecUserAfterAuthPopupVM recUserAfterAuthPopupVM = this.LJLILLLLZI;
            InterfaceC237509Tu interfaceC237509Tu = recUserAfterAuthPopupVM.LJLJJL;
            EnumC58085Mqv LIZ = C58084Mqu.LIZ(recUserAfterAuthPopupVM.LJLIL);
            this.LJLIL = 1;
            obj = interfaceC237509Tu.LIZ(LIZ, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        RecUserAfterAuthPopupVM recUserAfterAuthPopupVM2 = this.LJLILLLLZI;
        new C243529h6(recUserAfterAuthPopupVM2.LJLIL, recUserAfterAuthPopupVM2.LJLILLLLZI, booleanValue, "facebook").LIZLLL(null);
        return Boolean.valueOf(booleanValue);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
