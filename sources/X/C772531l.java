package X;

import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMReadMessageAnalytics$reportReadMessage$1$2", f = "IMReadMessageAnalytics.kt", l = {89}, m = "invokeSuspend")
/* renamed from: X.31l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C772531l extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C31F LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C772531l(C31F c31f, InterfaceC67352kd<? super C772531l> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c31f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C772531l(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(800L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C31F c31f = this.LJLILLLLZI;
        List<C109544Rq> list = C84823Uo.LIZIZ;
        if (!((ArrayList) list).isEmpty()) {
            c31f.LIZIZ(ORZ.LLJI(list), false);
            ((ArrayList) list).clear();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
