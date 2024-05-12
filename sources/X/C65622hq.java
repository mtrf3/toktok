package X;

import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$checkFollowBackDialogShow$1$1", f = "SharePanelWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65622hq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SharePanelWidget LJLIL;
    public final /* synthetic */ List<User> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C65622hq(SharePanelWidget sharePanelWidget, List<? extends User> list, InterfaceC67352kd<? super C65622hq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = sharePanelWidget;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65622hq(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJII(this.LJLILLLLZI, true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
