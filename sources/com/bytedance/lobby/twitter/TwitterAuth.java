package com.bytedance.lobby.twitter;

import X.ActivityC45651qj;
import X.C1GE;
import X.C65294Pju;
import X.C65364Pl2;
import X.C66414Q4s;
import X.C66498Q7y;
import X.QB3;
import X.QCI;
import a04.IDfS0S0100000_11;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import kotlin.jvm.internal.AqS11S0202000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class TwitterAuth extends TwitterProvider<AuthResult> implements QB3 {
    public static final /* synthetic */ int LJLJLJ = 0;
    public C65294Pju LJLJJLL;
    public LobbyViewModel LJLJL;

    @Override // X.QB3
    public final /* synthetic */ void Ml0(int i) {
    }

    @Override // X.QB3
    public final void onDestroy() {
        this.LJLJJLL = null;
    }

    public TwitterAuth(QCI qci) {
        super(LobbyCore.getApplication(), qci);
    }

    @Override // X.QB3
    public final void us(Bundle bundle, ActivityC45651qj activityC45651qj) {
        C66498Q7y.LIZ(this.LJLJL, this.LJLJI.LIZIZ);
    }

    @Override // X.QB3
    public final void za(Bundle bundle, ActivityC45651qj activityC45651qj) {
        this.LJLJL = LobbyViewModel.gv0(activityC45651qj);
        if (!LJJZZIII()) {
            C66498Q7y.LIZIZ(this.LJLJL, this.LJLJI.LIZIZ, 1);
            return;
        }
        C65294Pju c65294Pju = new C65294Pju(activityC45651qj);
        this.LJLJJLL = c65294Pju;
        IDfS0S0100000_11 iDfS0S0100000_11 = new IDfS0S0100000_11(this, 0);
        C66414Q4s c66414Q4s = c65294Pju.LIZ;
        if (c66414Q4s != null) {
            c66414Q4s.setCallback(new C65364Pl2(iDfS0S0100000_11));
        }
        C66414Q4s c66414Q4s2 = this.LJLJJLL.LIZ;
        if (c66414Q4s2 == null) {
            return;
        }
        c66414Q4s2.performClick();
    }

    @Override // X.QB3
    public final void q50(ActivityC45651qj activityC45651qj, int i, int i2, Intent intent) {
        C65294Pju c65294Pju = this.LJLJJLL;
        if (c65294Pju != null) {
            TokenCert cert = TokenCert.with("bpea-twitter_androidsdk_2009");
            o.LJIIIZ(cert, "cert");
            C1GE.LJIJJ(cert, "Twitter", "onActivityResult", new AqS11S0202000_11(i, i2, intent, c65294Pju, 3));
        }
    }
}
