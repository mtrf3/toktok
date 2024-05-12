package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.NewChatRoomFragment;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.NewChatRoomFragment$onBlockUserSuccessEvent$1$1", f = "NewChatRoomFragment.kt", l = {295}, m = "invokeSuspend")
/* renamed from: X.36j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C785336j extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ NewChatRoomFragment LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C785336j(NewChatRoomFragment newChatRoomFragment, ActivityC45651qj activityC45651qj, InterfaceC67352kd<? super C785336j> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = newChatRoomFragment;
        this.LJLJI = activityC45651qj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C785336j(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        IMUser imUser;
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
            C98593tv enterChatParams = this.LJLILLLLZI.getEnterChatParams();
            if (enterChatParams != null && (imUser = enterChatParams.getImUser()) != null) {
                ActivityC45651qj activity = this.LJLJI;
                o.LJIIIIZZ(activity, "activity");
                C784636c c784636c = new C784636c(activity, imUser, "chat", null, null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
                this.LJLIL = 1;
                if (c784636c.LIZLLL(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
