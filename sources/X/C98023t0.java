package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment$logEnterQuickChat$1", f = "BaseQuickChatRoomFragment.kt", l = {251}, m = "invokeSuspend")
/* renamed from: X.3t0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98023t0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BaseQuickChatRoomFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C98023t0(BaseQuickChatRoomFragment baseQuickChatRoomFragment, InterfaceC67352kd<? super C98023t0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = baseQuickChatRoomFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C98023t0(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLILLLLZI.Al();
            XIA xia = C78613UtF.LIZJ;
            C98013sz c98013sz = new C98013sz(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xia, c98013sz, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C4ID quickChatEventParams = this.LJLILLLLZI.xl();
        String LIZ = C3Y4.LIZ();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(quickChatEventParams, "quickChatEventParams");
        o.LJIIIZ(onEventV3, "onEventV3");
        C3Y4.LJ("enter_from", quickChatEventParams.LIZ);
        C3Y4.LJ("enter_method", "chat_panel");
        onEventV3.LIZIZ("enter_chat", C113554cx.LJJLIIIJILLIZJL(C4IC.LIZ(quickChatEventParams), C113554cx.LJJL(new OSZ("if_draft", C98033t1.LIZ.get(Boolean.valueOf(booleanValue))), new OSZ("process_id", LIZ))));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
