package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorDebugUtils$showDebugWarningMessage$1$1", f = "AnchorDebugUtils.kt", l = {23}, m = "invokeSuspend")
/* renamed from: X.2dT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62912dT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62912dT(String str, InterfaceC67352kd<? super C62912dT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C62912dT(this.LJLILLLLZI, interfaceC67352kd);
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
            if (C1JD.LIZJ(500L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            String str = this.LJLILLLLZI;
            C26227ARb c26227ARb = new C26227ARb(topActivity);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(". Contact to zhangtianyu.0539 if you need.");
            c26227ARb.LIZIZ(X1D.LIZIZ(LIZ));
            c26227ARb.LJFF("Warning");
            UC0.LIZJ(c26227ARb, C62922dU.LJLIL);
            c26227ARb.LJI().LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
