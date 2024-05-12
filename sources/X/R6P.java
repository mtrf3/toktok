package X;

import android.content.Intent;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R6P implements InterfaceC69020R6y {
    public final AuthResult LIZ;
    public final InterfaceC69001R6f LIZIZ;

    public final void LIZ(int i) {
        InterfaceC69001R6f interfaceC69001R6f = this.LIZIZ;
        AuthResult authResult = this.LIZ;
        AuthorizeActivity authorizeActivity = (AuthorizeActivity) interfaceC69001R6f;
        if (i == -1) {
            authorizeActivity.LLIIIZ(authResult, false);
            return;
        }
        authorizeActivity.getClass();
        authorizeActivity.LLIIIJ(0, new Intent());
        authorizeActivity.finish();
    }

    public R6P(AuthResult authResult, AuthorizeActivity authorizeActivity) {
        o.LJIIIZ(authResult, "authResult");
        this.LIZ = authResult;
        this.LIZIZ = authorizeActivity;
    }
}
