package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder$initListener$3", f = "SessionListViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3TI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TI extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ SessionListViewHolder LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3TI(SessionListViewHolder sessionListViewHolder, InterfaceC67352kd<? super C3TI> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = sessionListViewHolder;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3TI(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C3TG.LIZ.LIZ(this.LJLIL.LLFZ, "relation");
        return Boolean.FALSE;
    }
}
