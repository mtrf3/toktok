package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.6CK, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6CK extends TBS implements InterfaceC88472Yns<User, C76800UCe> {
    public C6CK(Object obj) {
        super(1, obj, C6CJ.class, "selectUserCallback", "selectUserCallback(Lcom/ss/android/ugc/aweme/profile/model/User;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(User user) {
        AbstractC156316Bn abstractC156316Bn = (AbstractC156316Bn) this.receiver;
        AbstractC156406Bw mInputView = abstractC156316Bn.getMInputView();
        if (mInputView != null) {
            mInputView.setCurModel(user);
        }
        AbstractC156406Bw mInputView2 = abstractC156316Bn.getMInputView();
        if (mInputView2 != null) {
            mInputView2.LJIIJ();
        }
        abstractC156316Bn.LJFF();
        return C76800UCe.LIZ;
    }
}
