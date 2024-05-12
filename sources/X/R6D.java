package X;

import android.content.Intent;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import yq4.a;

/* loaded from: classes12.dex */
public final class R6D implements InterfaceC69021R6z {
    public final AuthResult LIZ;
    public final InterfaceC69002R6g LIZIZ;

    public R6D(AuthResult authResult, AuthorizeActivity authorizeActivity) {
        this.LIZ = authResult;
        this.LIZIZ = authorizeActivity;
    }

    public final void LIZ(int i, String str) {
        InterfaceC69002R6g interfaceC69002R6g = this.LIZIZ;
        if (interfaceC69002R6g != null) {
            AuthResult authResult = this.LIZ;
            AuthorizeActivity authorizeActivity = (AuthorizeActivity) interfaceC69002R6g;
            if (authorizeActivity.isFinishing()) {
                return;
            }
            String str2 = "";
            if (i == -1) {
                if (authResult != null) {
                    str2 = QBU.LIZ(authResult.mProviderId);
                }
                C68972R5c.LJFF(true, 56004, str2, authorizeActivity, null);
            } else if (i == 0) {
                if (authResult != null) {
                    str2 = QBU.LIZ(authResult.mProviderId);
                }
                C68972R5c.LJFF(true, -3005, str2, authorizeActivity, null);
            }
            if (authResult == null || i != 1) {
                authorizeActivity.LLIIIJ(0, new Intent());
                authorizeActivity.finish();
                return;
            }
            String LJ = a.LIZIZ().LJ();
            if ((LJ == null || LJ.isEmpty()) && str != null && !str.isEmpty()) {
                a.LIZIZ().LJIL(str);
            }
            authorizeActivity.LLIIIZ(authResult, false);
        }
    }
}
