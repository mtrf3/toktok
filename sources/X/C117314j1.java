package X;

import Y.IDfS126S0100000_1;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.scrolltobottomindicator.ScrollToBottomIndicator;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.scrolltobottomindicator.ScrollToBottomIndicator$observeMsgCount$1", f = "ScrollToBottomIndicator.kt", l = {164}, m = "invokeSuspend")
/* renamed from: X.4j1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117314j1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ScrollToBottomIndicator LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117314j1(ScrollToBottomIndicator scrollToBottomIndicator, InterfaceC67352kd<? super C117314j1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = scrollToBottomIndicator;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C117314j1(this.LJLILLLLZI, interfaceC67352kd);
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
            ScrollToBottomIndicator scrollToBottomIndicator = this.LJLILLLLZI;
            InterfaceC65462ha interfaceC65462ha = (InterfaceC65462ha) scrollToBottomIndicator.LJLJI.LIZJ;
            IDfS126S0100000_1 iDfS126S0100000_1 = new IDfS126S0100000_1(scrollToBottomIndicator, 6);
            this.LJLIL = 1;
            if (interfaceC65462ha.collect(iDfS126S0100000_1, this) == enumC58928NAu) {
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
