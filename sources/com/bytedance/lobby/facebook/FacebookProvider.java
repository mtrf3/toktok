package com.bytedance.lobby.facebook;

import X.C16880lQ;
import X.C62703OjD;
import X.C77119UOl;
import X.Q4J;
import X.QCI;
import android.app.Application;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.internal.BaseProvider;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public class FacebookProvider<T> extends BaseProvider<T> {
    public final Application LJLJJI;

    @Override // com.bytedance.lobby.internal.BaseProvider
    public final void onCreate() {
        if (u.LJII()) {
            return;
        }
        String applicationId = this.LJLJI.LIZJ;
        o.LJIIIZ(applicationId, "applicationId");
        Q4J.LIZLLL(applicationId, "applicationId");
        u.LIZJ = applicationId;
        try {
            Context applicationContext = C16880lQ.LLLLJI(this.LJLJJI);
            o.LJIIIZ(applicationContext, "applicationContext");
            u.LJIIJ(applicationContext);
            C62703OjD.LIZ(new String[]{"LDU"}, TokenCert.with("bpea-facebook_androidsdk_7423"));
        } catch (Exception e) {
            if (!C77119UOl.LIZIZ) {
            } else {
                throw e;
            }
        }
    }

    public FacebookProvider(Application application, QCI qci) {
        super(application, qci);
        this.LJLJJI = application;
    }
}
