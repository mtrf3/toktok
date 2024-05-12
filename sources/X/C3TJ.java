package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListSingleChatVH;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListSingleChatVH$relationBtn$2$1$1", f = "SessionListSingleChatVH.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3TJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TJ extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ SessionListSingleChatVH LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3TJ(SessionListSingleChatVH sessionListSingleChatVH, InterfaceC67352kd<? super C3TJ> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = sessionListSingleChatVH;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3TJ(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C3TO c3to = (C3TO) this.LJLIL.LJLLILLLL;
        if (c3to == null) {
            return Boolean.FALSE;
        }
        C3TG.LIZ.LIZ(C771431a.LIZ().LIZJ(c3to.getSessionId()), "relation");
        return Boolean.FALSE;
    }
}
