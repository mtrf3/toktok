package X;

import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.innerpush.ui.InnerPushFollowContainer$initButton$1$3", f = "InnerPushFollowContainer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Xqq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86108Xqq extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ C86109Xqr LJLIL;
    public final /* synthetic */ User LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86108Xqq(C86109Xqr c86109Xqr, User user, InterfaceC67352kd<? super C86108Xqq> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = c86109Xqr;
        this.LJLILLLLZI = user;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C86108Xqq(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        PopupWindow popupWindowRef;
        C141335gf.LIZJ(obj);
        boolean LIZIZ = C78966Uyw.LJJIJ().LIZIZ();
        InnerPushMessage curMsg = this.LJLIL.getCurMsg();
        if (curMsg != null) {
            C86496Xx6.LJI(curMsg, "enter_chat");
        }
        boolean LJJIJLIJ = C55888Lwa.LIZIZ.LJJIJLIJ(this.LJLIL.getContext(), this.LJLILLLLZI, !LIZIZ);
        if (LJJIJLIJ && (popupWindowRef = this.LJLIL.getPopupWindowRef()) != null) {
            popupWindowRef.dismiss();
        }
        return Boolean.valueOf(LJJIJLIJ);
    }
}
