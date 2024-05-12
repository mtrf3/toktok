package X;

import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$onLoadSuccess$1$8", f = "SharePanelViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3S7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3S7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SharePanelViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3S7(SharePanelViewModel sharePanelViewModel, InterfaceC67352kd<? super C3S7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = sharePanelViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3S7(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        SharePanelViewModel sharePanelViewModel = this.LJLIL;
        InterfaceC83893Qz interfaceC83893Qz = sharePanelViewModel.LJLILLLLZI;
        if (interfaceC83893Qz != null) {
            interfaceC83893Qz.ks(sharePanelViewModel.LJ());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
