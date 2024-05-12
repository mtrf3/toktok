package com.bytedance.lobby.line;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1GE;
import X.C66498Q7y;
import X.C66504Q8e;
import X.C66531Q9f;
import X.Q8M;
import X.Q9S;
import X.Q9T;
import X.Q9Z;
import X.QB3;
import X.QCI;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.auth.LineLoginResult;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS78S1100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class LineAuth extends LineProvider<AuthResult> implements QB3 {
    public LobbyViewModel LJLJJI;

    @Override // X.QB3
    public final /* synthetic */ void Ml0(int i) {
    }

    @Override // X.QB3
    public final /* synthetic */ void onDestroy() {
    }

    public final void gv0() {
        Bundle bundle = new Bundle();
        bundle.putInt("line_response_ordinal", Q9T.INTERNAL_ERROR.ordinal());
        Q8M q8m = new Q8M("line", 1);
        q8m.LIZ = false;
        q8m.LIZIZ = new C66504Q8e(3, "Line login is blocked");
        q8m.LJIIJ = bundle;
        this.LJLJJI.hv0(new AuthResult(q8m));
    }

    public LineAuth(QCI qci) {
        super(LobbyCore.getApplication(), qci);
    }

    @Override // X.QB3
    public final void us(Bundle bundle, ActivityC45651qj activityC45651qj) {
        C66498Q7y.LIZ(this.LJLJJI, this.LJLJI.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.QB3
    public final void za(Bundle bundle, ActivityC45651qj context) {
        this.LJLJJI = (LobbyViewModel) ViewModelProviders.of(context).get(LobbyViewModel.class);
        if (!LJJZZIII()) {
            C66498Q7y.LIZIZ(this.LJLJJI, "line", 1);
            return;
        }
        try {
            String channelId = this.LJLJI.LIZJ;
            TokenCert cert = TokenCert.with("bpea-line_androidsdk_2005");
            o.LJIIIZ(context, "context");
            o.LJIIIZ(channelId, "channelId");
            o.LJIIIZ(cert, "cert");
            C66531Q9f LJIJJ = C1GE.LJIJJ(cert, "Line", "getLoginIntent", new AqS78S1100000_11(channelId, context, 14));
            o.LJIIIZ(LJIJJ, "<this>");
            if (LJIJJ.LIZ == 0) {
                C16880lQ.LJI(context, (Intent) LJIJJ.LIZJ, 1);
            } else {
                gv0();
            }
        } catch (Throwable th) {
            Q8M q8m = new Q8M(this.LJLJI.LIZIZ, 1);
            q8m.LIZ = false;
            q8m.LIZIZ = new C66504Q8e(6, th.getMessage());
            this.LJLJJI.hv0(new AuthResult(q8m));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.QB3
    public final void q50(ActivityC45651qj activityC45651qj, int i, int i2, Intent intent) {
        LineProfile lineProfile;
        LineAccessToken lineAccessToken;
        long j;
        LineAccessToken lineAccessToken2;
        String str;
        String str2;
        TokenCert cert = TokenCert.with("bpea-line_androidsdk_2006");
        o.LJIIIZ(cert, "cert");
        C66531Q9f LJIJJ = C1GE.LJIJJ(cert, "Line", "getLoginResultFromIntent", new AqS161S0100000_11(intent, 107));
        Q9S q9s = (Q9S) LJIJJ.LIZJ;
        if (LJIJJ.LIZ != 0 || q9s == null) {
            gv0();
            return;
        }
        int i3 = Q9Z.LIZ[q9s.LIZ().ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                Bundle bundle = new Bundle();
                bundle.putInt("line_response_ordinal", q9s.LIZ().ordinal());
                Q8M q8m = new Q8M("line", 1);
                q8m.LIZ = false;
                q8m.LIZIZ = new C66504Q8e(3, q9s.LIZ.errorData.message);
                q8m.LJIIJ = bundle;
                this.LJLJJI.hv0(new AuthResult(q8m));
                return;
            }
            Q8M q8m2 = new Q8M("line", 1);
            q8m2.LIZ = false;
            q8m2.LIZIZ = new C66504Q8e(4, "Line login cancelled by user");
            this.LJLJJI.hv0(new AuthResult(q8m2));
            return;
        }
        LineLoginResult lineLoginResult = q9s.LIZ;
        LineCredential lineCredential = lineLoginResult.lineCredential;
        if (lineCredential == null || (lineProfile = lineLoginResult.lineProfile) == null) {
            return;
        }
        Q8M q8m3 = new Q8M("line", 1);
        q8m3.LIZ = true;
        if (lineCredential == null || (lineAccessToken = lineCredential.accessToken) == null) {
            j = 0;
        } else {
            j = lineAccessToken.expiresInMillis;
        }
        q8m3.LJII = j;
        String str3 = "";
        if (lineCredential == null || (lineAccessToken2 = lineCredential.accessToken) == null || (str = lineAccessToken2.accessToken) == null) {
            str = "";
        }
        q8m3.LJ = str;
        if (lineProfile != null && (str2 = lineProfile.userId) != null) {
            str3 = str2;
        }
        q8m3.LIZLLL = str3;
        this.LJLJJI.hv0(new AuthResult(q8m3));
    }
}
