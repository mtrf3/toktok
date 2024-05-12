package com.bytedance.lobby.facebook;

import X.ActivityC45651qj;
import X.AnonymousClass036;
import X.BMV;
import X.C1GE;
import X.C66421Q4z;
import X.C66452Q6e;
import X.C66453Q6f;
import X.C66496Q7w;
import X.C66498Q7y;
import X.C66504Q8e;
import X.EnumC66383Q3n;
import X.Q4W;
import X.Q51;
import X.Q5U;
import X.Q6B;
import X.Q82;
import X.Q85;
import X.Q86;
import X.Q8C;
import X.Q8K;
import X.Q8M;
import X.QB3;
import X.QCI;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import java.util.HashMap;
import kotlin.jvm.internal.AqS11S0202000_11;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public class FacebookAuth extends FacebookProvider<AuthResult> implements QB3, Q82<Q8C> {
    public Q85 LJLJJL;
    public LobbyViewModel LJLJJLL;
    public C66453Q6f LJLJL;

    @Override // X.QB3
    public final /* synthetic */ void Ml0(int i) {
    }

    @Override // X.Q82
    public final void onCancel() {
        Q8M q8m = new Q8M("facebook", 1);
        q8m.LIZ = false;
        q8m.LIZIZ = new C66504Q8e(4, "Facebook login cancelled");
        this.LJLJJLL.hv0(new AuthResult(q8m));
    }

    @Override // X.QB3
    public final void onDestroy() {
        C66453Q6f c66453Q6f = this.LJLJL;
        if (c66453Q6f != null) {
            Q85 callbackManager = this.LJLJJL;
            o.LJIIIZ(callbackManager, "callbackManager");
            C66452Q6e c66452Q6e = c66453Q6f.LIZ;
            if (c66452Q6e != null) {
                Q8K q8k = callbackManager.LIZ;
                c66452Q6e.getLoginManager().getClass();
                if (q8k instanceof Q6B) {
                    int requestCode = Q5U.Login.toRequestCode();
                    ((HashMap) ((Q6B) q8k).LIZ).remove(Integer.valueOf(requestCode));
                } else {
                    throw new Q4W("Unexpected CallbackManager, please use the provided Factory.");
                }
            }
            C66453Q6f c66453Q6f2 = this.LJLJL;
            C66452Q6e c66452Q6e2 = c66453Q6f2.LIZ;
            if (c66452Q6e2 != null) {
                c66452Q6e2.onDetachedFromWindow();
            }
            c66453Q6f2.LIZ = null;
            this.LJLJL = null;
        }
    }

    public FacebookAuth(QCI qci) {
        super(LobbyCore.getApplication(), qci);
    }

    @Override // X.Q82
    public final void MA(Q86 q86) {
        Q8M q8m = new Q8M("facebook", 1);
        q8m.LIZ = false;
        q8m.LIZIZ = new C66504Q8e(q86);
        this.LJLJJLL.hv0(new AuthResult(q8m));
    }

    @Override // X.Q82
    public final void onSuccess(Q8C q8c) {
        Q8C q8c2 = q8c;
        AccessToken accessToken = q8c2.LIZ.LIZ;
        String str = accessToken.token;
        String[] strArr = (String[]) accessToken.permissions.toArray(new String[0]);
        Bundle bundle = new Bundle();
        bundle.putStringArray("fb_granted_permissions", strArr);
        C66421Q4z c66421Q4z = new C66421Q4z(AnonymousClass036.LIZJ("fields", "id,name,first_name,middle_name,last_name,token_for_business", "access_token", str), Q51.GET);
        final C66496Q7w c66496Q7w = new C66496Q7w(this, str, q8c2, bundle);
        GraphRequest graphRequest = c66421Q4z.LIZ;
        BMV bmv = new BMV() { // from class: X.Q84
            @Override // X.BMV
            public final void LIZ(C66381Q3l c66381Q3l) {
                ((C66496Q7w) c66496Q7w).LIZ(new C67821QjZ(c66381Q3l));
            }
        };
        graphRequest.getClass();
        u.LJIIIIZZ(EnumC66383Q3n.GRAPH_API_DEBUG_INFO);
        u.LJIIIIZZ(EnumC66383Q3n.GRAPH_API_DEBUG_WARNING);
        graphRequest.LJ = bmv;
        c66421Q4z.LIZ.LIZLLL();
    }

    @Override // X.QB3
    public final void us(Bundle bundle, ActivityC45651qj activityC45651qj) {
        C66498Q7y.LIZ(this.LJLJJLL, this.LJLJI.LIZIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L10;
     */
    @Override // X.QB3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void za(android.os.Bundle r8, X.ActivityC45651qj r9) {
        /*
            r7 = this;
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r9)
            java.lang.Class<com.bytedance.lobby.internal.LobbyViewModel> r0 = com.bytedance.lobby.internal.LobbyViewModel.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.bytedance.lobby.internal.LobbyViewModel r0 = (com.bytedance.lobby.internal.LobbyViewModel) r0
            r7.LJLJJLL = r0
            boolean r0 = r7.LJJZZIII()
            r2 = 1
            if (r0 != 0) goto L1d
            com.bytedance.lobby.internal.LobbyViewModel r1 = r7.LJLJJLL
            java.lang.String r0 = "facebook"
            X.C66498Q7y.LIZIZ(r1, r0, r2)
            return
        L1d:
            X.Q85 r1 = new X.Q85
            X.Q6B r0 = new X.Q6B
            r0.<init>()
            r1.<init>(r0)
            r7.LJLJJL = r1
            if (r8 == 0) goto L37
            java.lang.String r0 = "fb_read_permissions"
            java.lang.String r3 = r8.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L39
        L37:
            java.lang.String r3 = "public_profile"
        L39:
            X.Q6f r1 = new X.Q6f
            r1.<init>(r9)
            r7.LJLJL = r1
            java.lang.String[] r2 = new java.lang.String[r2]
            r0 = 0
            r2[r0] = r3
            X.Q6e r1 = r1.LIZ
            if (r1 != 0) goto Laa
        L49:
            X.Q6f r2 = r7.LJLJL
            X.Q85 r1 = r7.LJLJJL
            r2.getClass()
            java.lang.String r0 = "callbackManager"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.Q6e r6 = r2.LIZ
            if (r6 != 0) goto L78
        L59:
            X.Q3m r0 = com.facebook.AccessToken.Companion
            r0.getClass()
            com.facebook.AccessToken r0 = X.C66382Q3m.LIZIZ()
            if (r0 == 0) goto L6d
            X.Q5h r0 = com.facebook.login.LoginManager.LJIIIZ
            com.facebook.login.LoginManager r0 = r0.LIZ()
            r0.LIZLLL()
        L6d:
            X.Q6f r0 = r7.LJLJL
            X.Q6e r0 = r0.LIZ
            if (r0 != 0) goto L74
        L73:
            return
        L74:
            r0.performClick()
            goto L73
        L78:
            X.Q8K r5 = r1.LIZ
            X.Q7v r4 = new X.Q7v
            r4.<init>(r7)
            com.facebook.login.LoginManager r3 = r6.getLoginManager()
            r3.getClass()
            boolean r0 = r5 instanceof X.Q6B
            if (r0 == 0) goto Lb2
            r1 = r5
            X.Q6B r1 = (X.Q6B) r1
            X.Q5U r0 = X.Q5U.Login
            int r0 = r0.toRequestCode()
            X.Q6M r2 = new X.Q6M
            r2.<init>()
            java.util.Map<java.lang.Integer, X.Q6C> r1 = r1.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r0, r2)
            X.Q8K r0 = r6.LLFF
            if (r0 != 0) goto L59
            r6.LLFF = r5
            goto L59
        Laa:
            java.util.List r0 = X.ORY.LJJZZIII(r2)
            r1.setReadPermissions(r0)
            goto L49
        Lb2:
            X.Q4W r1 = new X.Q4W
            java.lang.String r0 = "Unexpected CallbackManager, please use the provided Factory."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.facebook.FacebookAuth.za(android.os.Bundle, X.1qj):void");
    }

    @Override // X.QB3
    public final void q50(ActivityC45651qj activityC45651qj, int i, int i2, Intent intent) {
        Q85 q85 = this.LJLJJL;
        if (q85 != null) {
            TokenCert cert = TokenCert.with("bpea-facebook_androidsdk_2003");
            o.LJIIIZ(cert, "cert");
            C1GE.LJIJJ(cert, "Facebook", "onActivityResult", new AqS11S0202000_11(i, i2, intent, q85, 1));
        } else {
            Q8M q8m = new Q8M("facebook", 1);
            q8m.LIZ = false;
            q8m.LIZIZ = new C66504Q8e(3, "Facebook CallbackManager is null");
            this.LJLJJLL.hv0(new AuthResult(q8m));
        }
    }
}
