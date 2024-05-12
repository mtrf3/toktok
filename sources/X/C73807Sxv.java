package X;

import com.ss.android.ugc.aweme.account.login.v2.network.CheckUserNameResponse;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Sxv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73807Sxv {
    public AbstractC73798Sxm<CheckUserNameResponse> LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C9WA.LJLIL);
    public final C73808Sxw LIZJ = C73808Sxw.LJLIL;

    public final void LIZIZ() {
        AbstractC73798Sxm<CheckUserNameResponse> abstractC73798Sxm = this.LIZ;
        if (abstractC73798Sxm != null) {
            o.LJI(abstractC73798Sxm);
            if (!abstractC73798Sxm.isDisposed()) {
                AbstractC73798Sxm<CheckUserNameResponse> abstractC73798Sxm2 = this.LIZ;
                o.LJI(abstractC73798Sxm2);
                abstractC73798Sxm2.dispose();
            }
        }
    }

    public final void LIZ(String name, AbstractC73798Sxm<CheckUserNameResponse> abstractC73798Sxm) {
        o.LJIIIZ(name, "name");
        LIZIZ();
        this.LIZ = abstractC73798Sxm;
        ((HashMap) this.LIZIZ.getValue()).put("unique_id", name);
        NetworkProxyAccount.LIZ.LIZLLL("/aweme/v1/unique/id/check/", (HashMap) this.LIZIZ.getValue()).LIZJ(this.LIZJ).LJII(C73969T1h.LIZIZ()).LJIIL(abstractC73798Sxm);
    }
}
