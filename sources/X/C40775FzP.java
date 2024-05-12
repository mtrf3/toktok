package X;

import com.ss.android.ugc.aweme.IAccountUserService;

/* renamed from: X.FzP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40775FzP implements G09 {
    @Override // X.G09
    public final boolean LLJJJIL() {
        IAccountUserService LJIILL = HG3.LJIILL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("needPrivateAccountTips isLogin:");
        RBX rbx = (RBX) LJIILL;
        LIZ.append(rbx.isLogin());
        LIZ.append(",isChildrenMode:");
        LIZ.append(rbx.isChildrenMode());
        LIZ.append(",notifyPrivatePolicy:");
        LIZ.append(rbx.getCurUser().notifyPrivatePolicy);
        LIZ.append(",isNewUser:");
        LIZ.append(rbx.isNewUser());
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        if (rbx.isLogin() && !rbx.isChildrenMode() && rbx.getCurUser().notifyPrivatePolicy && rbx.isNewUser()) {
            return true;
        }
        return false;
    }
}
