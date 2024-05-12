package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.animatedemoji.component.ChatRoomAlphaVideoComponent$ChatRoomMsgCheckObserver$executeAmbientAniCheckJob$1", f = "ChatRoomAlphaVideoComponent.kt", l = {543}, m = "invokeSuspend")
/* renamed from: X.4kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118294kb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ChatRoomAlphaVideoComponent LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ List<C109544Rq> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C118294kb(ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent, boolean z, List<? extends C109544Rq> list, InterfaceC67352kd<? super C118294kb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = chatRoomAlphaVideoComponent;
        this.LJLJI = z;
        this.LJLJJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C118294kb(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            ArrayList LJFF = C1JX.LJFF(obj);
            LJFF.addAll(this.LJLJJI);
            ChatRoomAlphaVideoComponent chatRoomAlphaVideoComponent = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            this.LJLIL = 1;
            if (chatRoomAlphaVideoComponent.LIZIZ(LJFF, this, z) == enumC58928NAu) {
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
