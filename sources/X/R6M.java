package X;

import android.content.Context;
import com.bytedance.lobby.auth.AuthResult;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R6M implements QBC {
    public final /* synthetic */ C5H3<R6L> LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ SKL LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    public R6M(C62822Ol8 c62822Ol8, Context context, SKL skl, AqS162S0100000_12 aqS162S0100000_12) {
        this.LJLIL = c62822Ol8;
        this.LJLILLLLZI = context;
        this.LJLJI = skl;
        this.LJLJJI = aqS162S0100000_12;
    }

    @Override // X.QBC
    public final void onAuthResult(AuthResult authResult) {
        o.LJIIIZ(authResult, "authResult");
        if (authResult.mIsSuccessful) {
            String str = authResult.mToken;
            o.LJIIIIZZ(str, "authResult.token");
            long j = authResult.mExpiryDateInMillis / 1000;
            R6L value = this.LJLIL.getValue();
            o.LJIIIIZZ(value, "getSugTOFbFriendsSubtitle$lambda$1(...)");
            value.LIZ("597615686992125", "facebook", str, j, C113554cx.LJJJLIIL(), new R6N(this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
            return;
        }
        C66504Q8e c66504Q8e = authResult.mErrorCause;
        if (c66504Q8e == null) {
            return;
        }
        C16880lQ.LLLLIIL(c66504Q8e);
    }
}
