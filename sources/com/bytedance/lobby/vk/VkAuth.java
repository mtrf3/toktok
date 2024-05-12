package com.bytedance.lobby.vk;

import X.ActivityC45651qj;
import X.C08380Uo;
import X.C66498Q7y;
import X.C66504Q8e;
import X.F9J;
import X.InterfaceC66578QBa;
import X.M6W;
import X.Q8M;
import X.QB3;
import X.QBV;
import X.QBX;
import X.QBZ;
import X.QCI;
import X.X1D;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.tpsw.api.vk.IVKService;

/* loaded from: classes12.dex */
public class VkAuth extends VkProvider<AuthResult> implements QB3, InterfaceC66578QBa {
    public static final QBV[] LJLJL = {QBV.OFFLINE, QBV.FRIENDS};
    public LobbyViewModel LJLJJL;
    public final Application LJLJJLL;

    @Override // X.QB3
    public final /* synthetic */ void Ml0(int i) {
    }

    @Override // X.QB3
    public final /* synthetic */ void onDestroy() {
    }

    public final void jv0() {
        IVKService gv0 = VkProvider.gv0();
        if (gv0 == null) {
            C66498Q7y.LIZIZ(this.LJLJJL, this.LJLJI.LIZIZ, 2);
            return;
        }
        onCreate();
        Application application = this.LJLJJLL;
        if (application != null) {
            F9J.LIZIZ(application, 0, "com.bytedance.lobby.vk").edit().remove("accessToken").remove("uid").remove("VkScopes").apply();
        }
        gv0.LJI(this.LJLJJLL, TokenCert.with("bpea-vk_androidsdk_1211"));
        gv0.LJFF(TokenCert.with("bpea-vk_androidsdk_1210"));
        Q8M q8m = new Q8M(this.LJLJI.LIZIZ, 2);
        q8m.LIZ = true;
        this.LJLJJL.hv0(new AuthResult(q8m));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (0 != 0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iv0(X.ActivityC45651qj r10) {
        /*
            r9 = this;
            com.bytedance.tpsw.api.vk.IVKService r5 = com.bytedance.lobby.vk.VkProvider.gv0()
            r4 = 1
            if (r5 != 0) goto L11
            com.bytedance.lobby.internal.LobbyViewModel r1 = r9.LJLJJL
            X.QCI r0 = r9.LJLJI
            java.lang.String r0 = r0.LIZIZ
            X.C66498Q7y.LIZIZ(r1, r0, r4)
            return
        L11:
            r9.onCreate()
            android.app.Application r0 = r9.LJLJJLL
            r3 = 0
            java.lang.String r6 = "com.bytedance.lobby.vk"
            r8 = 0
            if (r0 != 0) goto L8a
        L1c:
            r7 = r8
        L1d:
            X.QBV[] r8 = com.bytedance.lobby.vk.VkAuth.LJLJL
            boolean r0 = r5.LJ()
            if (r0 != 0) goto L35
        L25:
            X.QBV[] r0 = com.bytedance.lobby.vk.VkAuth.LJLJL
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = "bpea-vk_androidsdk_1209"
            com.bytedance.bpea.cert.token.TokenCert r0 = com.bytedance.bpea.cert.token.TokenCert.with(r0)
            r5.LIZ(r10, r1, r0)
        L34:
            return
        L35:
            android.app.Application r0 = r9.LJLJJLL     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L3a
            goto L25
        L3a:
            android.content.SharedPreferences r2 = X.F9J.LIZIZ(r0, r3, r6)     // Catch: java.lang.Exception -> L63
            java.lang.String r1 = "VkScopes"
            java.lang.String r0 = ""
            java.lang.String r6 = r2.getString(r1, r0)     // Catch: java.lang.Exception -> L63
            if (r6 == 0) goto L25
            int r0 = r6.length()     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L4f
            goto L25
        L4f:
            int r2 = r8.length     // Catch: java.lang.Exception -> L63
            r1 = 0
        L51:
            if (r1 >= r2) goto L65
            r0 = r8[r1]     // Catch: java.lang.Exception -> L63
            java.lang.String r0 = r0.name()     // Catch: java.lang.Exception -> L63
            boolean r0 = r6.contains(r0)     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L60
            goto L25
        L60:
            int r1 = r1 + 1
            goto L51
        L63:
            if (r3 == 0) goto L25
        L65:
            if (r7 != 0) goto L68
            goto L25
        L68:
            F r3 = r7.LIZ
            java.lang.String r3 = (java.lang.String) r3
            S r1 = r7.LIZIZ
            java.lang.String r1 = (java.lang.String) r1
            X.Q8M r2 = new X.Q8M
            X.QCI r0 = r9.LJLJI
            java.lang.String r0 = r0.LIZIZ
            r2.<init>(r0, r4)
            r2.LIZ = r4
            r2.LJ = r3
            r2.LIZLLL = r1
            com.bytedance.lobby.auth.AuthResult r1 = new com.bytedance.lobby.auth.AuthResult
            r1.<init>(r2)
            com.bytedance.lobby.internal.LobbyViewModel r0 = r9.LJLJJL
            r0.hv0(r1)
            goto L34
        L8a:
            android.content.SharedPreferences r1 = X.F9J.LIZIZ(r0, r3, r6)
            java.lang.String r0 = "accessToken"
            java.lang.String r2 = r1.getString(r0, r8)     // Catch: java.lang.ClassCastException -> L1c
            java.lang.String r0 = "uid"
            java.lang.String r1 = r1.getString(r0, r8)     // Catch: java.lang.ClassCastException -> L1c
            if (r2 == 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.ClassCastException -> L1c
            if (r0 != 0) goto L1c
            if (r1 == 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L1c
            if (r0 == 0) goto Lac
            goto L1c
        Lac:
            X.0iV r7 = new X.0iV     // Catch: java.lang.ClassCastException -> L1c
            r7.<init>(r2, r1)     // Catch: java.lang.ClassCastException -> L1c
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.vk.VkAuth.iv0(X.1qj):void");
    }

    public final void kv0(QBZ qbz) {
        IVKService gv0 = VkProvider.gv0();
        if (TextUtils.isEmpty(qbz.LIZ) || gv0 == null) {
            Q8M q8m = new Q8M(this.LJLJI.LIZIZ, 1);
            q8m.LIZ = false;
            q8m.LIZIZ = new C66504Q8e(3, "accessToken == null");
            this.LJLJJL.hv0(new AuthResult(q8m));
            return;
        }
        gv0.LIZJ(this.LJLJJLL, qbz.LIZIZ, qbz.LIZ, qbz.LIZJ, TokenCert.with("bpea-vk_androidsdk_1213"));
        if (this.LJLJJLL != null) {
            StringBuilder sb = new StringBuilder();
            for (QBV qbv : LJLJL) {
                sb.append(qbv.name());
            }
            SharedPreferences.Editor edit = F9J.LIZIZ(this.LJLJJLL, 0, "com.bytedance.lobby.vk").edit();
            edit.putString("VkScopes", sb.toString());
            edit.apply();
        }
        Application application = this.LJLJJLL;
        if (application != null) {
            SharedPreferences.Editor edit2 = F9J.LIZIZ(application, 0, "com.bytedance.lobby.vk").edit();
            edit2.putString("accessToken", qbz.LIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(qbz.LIZIZ);
            LIZ.append("");
            edit2.putString("uid", X1D.LIZIZ(LIZ));
            edit2.apply();
        }
        String str = qbz.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        String LIZ3 = C08380Uo.LIZ(LIZ2, qbz.LIZIZ, "", LIZ2);
        Q8M q8m2 = new Q8M(this.LJLJI.LIZIZ, 1);
        q8m2.LIZ = true;
        q8m2.LJ = str;
        q8m2.LIZLLL = LIZ3;
        this.LJLJJL.hv0(new AuthResult(q8m2));
    }

    public VkAuth(Application application, QCI qci) {
        super(qci);
        this.LJLJJLL = application;
    }

    @Override // X.QB3
    public final void us(Bundle bundle, ActivityC45651qj activityC45651qj) {
        if (!LJJZZIII()) {
            hv0(new M6W(this, activityC45651qj, bundle));
        } else {
            jv0();
        }
    }

    @Override // X.QB3
    public final void za(Bundle bundle, ActivityC45651qj activityC45651qj) {
        this.LJLJJL = LobbyViewModel.gv0(activityC45651qj);
        if (!LJJZZIII()) {
            hv0(new QBX(this, activityC45651qj, bundle));
        } else {
            iv0(activityC45651qj);
        }
    }

    @Override // X.QB3
    public final void q50(ActivityC45651qj activityC45651qj, int i, int i2, Intent intent) {
        IVKService gv0 = VkProvider.gv0();
        if (gv0 == null) {
            C66498Q7y.LIZIZ(this.LJLJJL, this.LJLJI.LIZIZ, 1);
        } else {
            gv0.LIZIZ(i, i2, intent, this, TokenCert.with("bpea-vk_androidsdk_1212"));
        }
    }
}
