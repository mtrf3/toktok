package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$updateConversationCache$1", f = "ChatRoomViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3F7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ChatRoomViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3F7(ChatRoomViewModel chatRoomViewModel, InterfaceC67352kd<? super C3F7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = chatRoomViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3F7(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(this.LJLIL.LJLIL.getConversationId());
        if (LIZ != null) {
            C4WC.LJJ(LIZ);
            if (LIZ.isFiltered()) {
                C115284fk.LJIILIIL().LJJII(LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
