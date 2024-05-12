package com.bytedance.lobby.instagram;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C66498Q7y;
import X.C66504Q8e;
import X.Q8M;
import X.QB3;
import X.QCI;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;

/* loaded from: classes12.dex */
public class InstagramAuth extends InstagramProvider<AuthResult> implements QB3 {
    public LobbyViewModel LJLJJI;

    @Override // X.QB3
    public final /* synthetic */ void Ml0(int i) {
    }

    @Override // X.QB3
    public final /* synthetic */ void onDestroy() {
    }

    public InstagramAuth(QCI qci) {
        super(LobbyCore.getApplication(), qci);
    }

    @Override // X.QB3
    public final void us(Bundle bundle, ActivityC45651qj activityC45651qj) {
        C66498Q7y.LIZ(this.LJLJJI, this.LJLJI.LIZIZ);
    }

    @Override // X.QB3
    public final void za(Bundle bundle, ActivityC45651qj activityC45651qj) {
        this.LJLJJI = LobbyViewModel.gv0(activityC45651qj);
        if (!LJJZZIII()) {
            C66498Q7y.LIZIZ(this.LJLJJI, "instagram", 1);
            return;
        }
        QCI qci = this.LJLJI;
        String str = qci.LIZJ;
        String string = qci.LIZLLL.getString("ig_login_auth_url");
        String string2 = this.LJLJI.LIZLLL.getString("ig_redirect_url");
        String string3 = this.LJLJI.LIZLLL.getString("ig_scope", "basic");
        String string4 = this.LJLJI.LIZLLL.getString("ig_response_type", "code");
        Intent intent = new Intent(activityC45651qj, (Class<?>) InstagramAuthActivity.class);
        intent.putExtra("client_id", str);
        intent.putExtra("login_auth_url", string);
        intent.putExtra("redirect_url", string2);
        intent.putExtra("response_type", string4);
        intent.putExtra("scope", string3);
        C16880lQ.LJI(activityC45651qj, intent, 458);
    }

    @Override // X.QB3
    public final void q50(ActivityC45651qj activityC45651qj, int i, int i2, Intent intent) {
        Q8M q8m = new Q8M(this.LJLJI.LIZIZ, 1);
        if (intent == null) {
            q8m.LIZ = false;
            q8m.LIZIZ = new C66504Q8e(1, "No intent data received after launching InstagramAuthActivity", "redirect_and_get_token");
            this.LJLJJI.hv0(new AuthResult(q8m));
            return;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1) {
                    q8m.LIZ = false;
                    q8m.LIZIZ = new C66504Q8e(7, "Unidentified result code in InstagramAuthActivity", "redirect_and_get_token");
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("code", C16880lQ.LLJJIJIIJIL(intent, "ig_result_code"));
                    q8m.LIZ = true;
                    q8m.LJIIJ = bundle;
                }
            } else {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "ig_result_error_info");
                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "error_stage");
                q8m.LIZ = false;
                q8m.LIZIZ = new C66504Q8e(3, LLJJIJIIJIL, LLJJIJIIJIL2);
            }
        } else {
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "ig_result_error_info");
            String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, "error_stage");
            q8m.LIZ = false;
            q8m.LIZIZ = new C66504Q8e(4, LLJJIJIIJIL3, LLJJIJIIJIL4);
        }
        this.LJLJJI.hv0(new AuthResult(q8m));
    }
}
