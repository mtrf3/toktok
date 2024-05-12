package X;

import com.ss.android.ugc.aweme.profile.presenter.UserIdResponse;

/* renamed from: X.Xnh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85913Xnh extends C8BR<C8BS<UserIdResponse>, InterfaceC85917Xnl> {
    public final String LJLJJI;

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        String str;
        UserIdResponse userIdResponse;
        UserIdResponse userIdResponse2;
        T t = this.LJLIL;
        String str2 = null;
        if (t != 0 && (userIdResponse2 = (UserIdResponse) t.getData()) != null) {
            str = userIdResponse2.user_id;
        } else {
            str = null;
        }
        T t2 = this.LJLIL;
        if (t2 != 0 && (userIdResponse = (UserIdResponse) t2.getData()) != null) {
            str2 = userIdResponse.sec_uid;
        }
        if (str != null && str2 != null) {
            ((InterfaceC85917Xnl) this.LJLILLLLZI).g90(str, str2);
        }
    }

    public C85913Xnh() {
        StringBuilder LIZ = X1D.LIZ();
        this.LJLJJI = JBR.LJFF(LIZ, EFJ.LIZJ, "/aweme/v1/user/uniqueid/", LIZ);
        LJJ(new C85912Xng(this));
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        ((InterfaceC85917Xnl) this.LJLILLLLZI).F30();
    }
}
