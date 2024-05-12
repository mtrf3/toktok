package X;

import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelOperationLayout$checkFollowBackDialogShow$1$1", f = "SharePanelOperationLayout.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2eS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63522eS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C4OF LJLIL;
    public final /* synthetic */ List<User> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C63522eS(C4OF c4of, List<? extends User> list, InterfaceC67352kd<? super C63522eS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c4of;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63522eS(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJFF(this.LJLILLLLZI, true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
