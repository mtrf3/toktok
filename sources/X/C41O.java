package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import fjb.a;
import kotlin.jvm.internal.AqS151S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$setupChatNoticeFlowEngine$1", f = "BaseChatPanel.kt", l = {1195}, m = "invokeSuspend")
/* renamed from: X.41O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41O extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public BaseChatPanel LJLIL;
    public C1036745b LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ BaseChatPanel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41O(BaseChatPanel baseChatPanel, InterfaceC67352kd<? super C41O> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = baseChatPanel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41O(this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C1036745b LJI;
        BaseChatPanel baseChatPanel;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i == 1) {
                LJI = this.LJLILLLLZI;
                baseChatPanel = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            LJI = this.LJLJJI.LJI();
            if (LJI != null) {
                baseChatPanel = this.LJLJJI;
                baseChatPanel.LJIIL(LJI, new C1028942b(baseChatPanel.LJLJLLL, new AqS151S0100000_1(baseChatPanel, 1050), baseChatPanel.LJLJJI, baseChatPanel.LJLJJL));
                this.LJLIL = baseChatPanel;
                this.LJLILLLLZI = LJI;
                this.LJLJI = 1;
                if (baseChatPanel.LIZ(LJI, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        if (baseChatPanel.LJLJJI.hasChatHistory()) {
            LJI.LJIILIIL();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
