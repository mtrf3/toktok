package X;

import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel$storeMessageDraft$1", f = "ChatViewModel.kt", l = {638}, m = "invokeSuspend")
/* renamed from: X.39V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39V extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ChatViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ List<RichTextInfo> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39V(ChatViewModel chatViewModel, String str, String str2, List<RichTextInfo> list, InterfaceC67352kd<? super C39V> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = chatViewModel;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C39V(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            ChatViewModel chatViewModel = this.LJLILLLLZI;
            AbstractC90763hI LIZ = C81273Gx.LIZ(this.LJLJI);
            String str = this.LJLJJI;
            List<RichTextInfo> list = this.LJLJJL;
            this.LJLIL = 1;
            chatViewModel.getClass();
            C76800UCe LJIILJJIL = LIZ.LJIILJJIL(new C792239a(str, chatViewModel.hv0(), list));
            if (LJIILJJIL != enumC58928NAu) {
                LJIILJJIL = C76800UCe.LIZ;
            }
            if (LJIILJJIL == enumC58928NAu) {
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
