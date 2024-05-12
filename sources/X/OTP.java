package X;

import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedCheckResult;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTP implements InterfaceC73463SsN<AuthorizedPage> {
    public final /* synthetic */ InterfaceC61956OTg LJLIL;

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    public OTP(OTM otm) {
        this.LJLIL = otm;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LIZ(new AuthorizedPage(-1, null, null, null, null, null, false, false, 254, null));
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(AuthorizedPage authorizedPage) {
        AuthorizedCheckResult checkResult;
        AuthorizedPage t = authorizedPage;
        o.LJIIIZ(t, "t");
        if (t.getCheckResult() != null && (checkResult = t.getCheckResult()) != null && checkResult.getResultCode() != null) {
            this.LJLIL.LIZ(t);
            return;
        }
        Integer statusCode = t.getStatusCode();
        if (statusCode == null || statusCode.intValue() != 0) {
            this.LJLIL.LIZ(t);
        } else {
            this.LJLIL.LIZIZ(t);
        }
    }
}
