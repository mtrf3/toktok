package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity$submitWelcomeMessage$1$1$1", f = "BaWelcomeMessageEditActivity.kt", l = {216, 218}, m = "invokeSuspend")
/* renamed from: X.9ZO, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BaWelcomeMessageEditActivity LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9ZO(BaWelcomeMessageEditActivity baWelcomeMessageEditActivity, String str, InterfaceC67352kd<? super C9ZO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baWelcomeMessageEditActivity;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C9ZO c9zo = new C9ZO(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c9zo.LJLILLLLZI = obj;
        return c9zo;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        boolean booleanValue;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                    C141335gf.LIZJ(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
                booleanValue = ((Boolean) obj).booleanValue();
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C9ZN c9zn = this.LJLJI.LJLJJI;
            String content = this.LJLJJI;
            Long l = c9zn.LIZ;
            String str = c9zn.LIZLLL;
            o.LJIIIZ(content, "content");
            C9ZN c9zn2 = new C9ZN(2, l, content, str);
            BaWelcomeMessageEditActivity baWelcomeMessageEditActivity = this.LJLJI;
            if (baWelcomeMessageEditActivity.LJLJJI.LIZIZ == 1) {
                IBaAutoMessageService iBaAutoMessageService = baWelcomeMessageEditActivity.LJLJJL;
                this.LJLILLLLZI = interfaceC70422pa;
                this.LJLIL = 1;
                obj = iBaAutoMessageService.LJIIIZ(c9zn2, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                booleanValue = ((Boolean) obj).booleanValue();
            } else {
                IBaAutoMessageService iBaAutoMessageService2 = baWelcomeMessageEditActivity.LJLJJL;
                this.LJLILLLLZI = interfaceC70422pa;
                this.LJLIL = 2;
                obj = iBaAutoMessageService2.LIZLLL(c9zn2, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                booleanValue = ((Boolean) obj).booleanValue();
            }
        }
        if (booleanValue) {
            C238909Ze.LJ(5);
            C78897Uxp.LJJJLL(this.LJLJI, R.string.rup);
            this.LJLJI.finish();
        } else {
            C78897Uxp.LJJJLL(this.LJLJI, R.string.g5l);
            XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C9ZP(this.LJLJI, null), 2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
