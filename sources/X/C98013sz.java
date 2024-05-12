package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment$logEnterQuickChat$1$hasDraft$1", f = "BaseQuickChatRoomFragment.kt", l = {252}, m = "invokeSuspend")
/* renamed from: X.3sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98013sz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ BaseQuickChatRoomFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C98013sz(BaseQuickChatRoomFragment baseQuickChatRoomFragment, InterfaceC67352kd<? super C98013sz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = baseQuickChatRoomFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C98013sz(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            BaseQuickChatRoomViewModel Al = this.LJLILLLLZI.Al();
            this.LJLIL = 1;
            obj = Al.LJLIL.LJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C792239a c792239a = (C792239a) obj;
        if (!C78685UuP.LJJJZ(c792239a.LIZ) && c792239a.LIZIZ == null && !C1GE.LJIILIIL(c792239a.LIZJ)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
