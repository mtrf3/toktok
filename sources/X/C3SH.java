package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui.MafChatListWidget;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui.MafChatListWidget$onRefresh$1", f = "MafChatListWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3SH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MafChatListWidget LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3SH(MafChatListWidget mafChatListWidget, InterfaceC67352kd<? super C3SH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mafChatListWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3SH(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        MafChatListWidget mafChatListWidget = this.LJLIL;
        mafChatListWidget.LJLJLLL.submitList(mafChatListWidget.LJLLI);
        if (!((C82093Kb) this.LJLIL.LJZI.getValue()).LJLJJI) {
            notifyDataSetChanged();
        }
        this.LJLIL.LJLJL.postValue(EnumC94693nd.SUCCESS);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}