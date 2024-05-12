package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity$onCreate$4", f = "BaAutoReplyEditActivity.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.9Yz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238859Yz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ BaAutoReplyEditActivity LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238859Yz(long j, BaAutoReplyEditActivity baAutoReplyEditActivity, InterfaceC67352kd<? super C238859Yz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = j;
        this.LJLJJI = baAutoReplyEditActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C238859Yz c238859Yz = new C238859Yz(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c238859Yz.LJLILLLLZI = obj;
        return c238859Yz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        Object obj2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            if (this.LJLJI != 0) {
                IBaAutoMessageService iBaAutoMessageService = this.LJLJJI.LJLJI;
                this.LJLILLLLZI = interfaceC70422pa;
                this.LJLIL = 1;
                obj = iBaAutoMessageService.LJIIIIZZ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C9Z0(this.LJLJJI, null), 2);
            return C76800UCe.LIZ;
        }
        List list = (List) obj;
        if (list != null) {
            long j = this.LJLJI;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((C9Z3) obj2).LIZ == j) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C9Z3 c9z3 = (C9Z3) obj2;
            if (c9z3 != null) {
                this.LJLJJI.LJLJJI = c9z3;
                XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C9Z0(this.LJLJJI, null), 2);
                return C76800UCe.LIZ;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
