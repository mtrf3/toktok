package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.mention.viewmodel.MentionPanelViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.group.mention.view.MentionPanelViewDelegate$registerObserver$1$1$1", f = "MentionPanelViewDelegate.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3XV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ MentionPanelViewModel LJLILLLLZI;
    public final /* synthetic */ C3XR LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3XV(MentionPanelViewModel mentionPanelViewModel, C3XR c3xr, InterfaceC67352kd<? super C3XV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mentionPanelViewModel;
        this.LJLJI = c3xr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3XV c3xv = new C3XV(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c3xv.LJLIL = obj;
        return c3xv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        XKX.LIZLLL(interfaceC70422pa, null, null, new C3XS(this.LJLILLLLZI, this.LJLJI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new C3XU(this.LJLILLLLZI, this.LJLJI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new C3XW(this.LJLILLLLZI, this.LJLJI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new C3XX(this.LJLILLLLZI, this.LJLJI, null), 3);
        XKX.LIZLLL(interfaceC70422pa, null, null, new C3XY(this.LJLILLLLZI, this.LJLJI, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
