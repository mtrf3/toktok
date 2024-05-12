package com.bytedance.lobby.kakao;

import X.ActivityC45651qj;
import X.C1GE;
import X.C65376PlE;
import X.C65378PlG;
import X.C65430Pm6;
import X.C66498Q7y;
import X.C66504Q8e;
import X.C66579QBb;
import X.InterfaceC88471Ynr;
import X.Q8M;
import X.QB3;
import X.QCI;
import Y.AObjectS13S0001000_9;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.lobby.kakao.KakaoAuth;
import com.bytedance.tpsw.bpea.kakao.auth.model.AccessTokenInfo;
import java.util.List;
import kotlin.jvm.internal.AqS0S2600000_11;
import kotlin.jvm.internal.AqS193S0100000_11;
import kotlin.jvm.internal.AqS1S1501000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class KakaoAuth extends KakaoProvider<AuthResult> implements QB3 {
    public final C65378PlG LJLJJI;
    public LobbyViewModel LJLJJL;

    @Override // X.QB3
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.QB3
    public final void q50(ActivityC45651qj activityC45651qj, int i, int i2, Intent intent) {
    }

    public KakaoAuth(QCI qci) {
        super(qci);
        this.LJLJJI = new C65378PlG();
        new C65376PlE();
    }

    @Override // X.QB3
    public final void Ml0(int i) {
        if (i == 2 || i == 3) {
            C65378PlG c65378PlG = this.LJLJJI;
            c65378PlG.LIZ.logout(new AObjectS13S0001000_9(0, 3));
        }
    }

    public final void gv0(C66504Q8e c66504Q8e) {
        Q8M q8m = new Q8M(this.LJLJI.LIZIZ, 1);
        q8m.LIZ = false;
        q8m.LIZIZ = c66504Q8e;
        this.LJLJJL.hv0(new AuthResult(q8m));
    }

    @Override // X.QB3
    public final void us(Bundle bundle, ActivityC45651qj activityC45651qj) {
        C65378PlG c65378PlG = this.LJLJJI;
        c65378PlG.LIZ.logout(new C66579QBb(2, this));
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [X.Pm6] */
    @Override // X.QB3
    public final void za(Bundle bundle, ActivityC45651qj context) {
        this.LJLJJL = LobbyViewModel.gv0(context);
        if (!LJJZZIII()) {
            C66498Q7y.LIZIZ(this.LJLJJL, this.LJLJI.LIZIZ, 1);
            return;
        }
        ?? r12 = new InterfaceC88471Ynr() { // from class: X.Pm6
            /* JADX WARN: Type inference failed for: r3v0, types: [X.Q7x] */
            @Override // X.InterfaceC88471Ynr
            public final Object invoke(Object obj, Object obj2) {
                C66504Q8e c66504Q8e;
                final KakaoAuth kakaoAuth = KakaoAuth.this;
                final C65375PlD c65375PlD = (C65375PlD) obj;
                Throwable th = (Throwable) obj2;
                kakaoAuth.getClass();
                if (th != null) {
                    if ("KakaoTalk is installed but not connected to Kakao account.".equals(th.getMessage())) {
                        c66504Q8e = new C66504Q8e(9, new Exception(th));
                    } else {
                        c66504Q8e = new C66504Q8e(new Exception(th));
                    }
                    c66504Q8e.setCancelled("user cancelled.".equals(th.getMessage()));
                    kakaoAuth.gv0(c66504Q8e);
                    return null;
                }
                if (c65375PlD == null) {
                    kakaoAuth.gv0(new C66504Q8e(3, "oauth token missing"));
                    return null;
                }
                C65378PlG c65378PlG = kakaoAuth.LJLJJI;
                ?? r3 = new InterfaceC88471Ynr() { // from class: X.Q7x
                    @Override // X.InterfaceC88471Ynr
                    public final Object invoke(Object obj3, Object obj4) {
                        KakaoAuth kakaoAuth2 = KakaoAuth.this;
                        C65375PlD c65375PlD2 = c65375PlD;
                        AccessTokenInfo accessTokenInfo = (AccessTokenInfo) obj3;
                        Throwable th2 = (Throwable) obj4;
                        kakaoAuth2.getClass();
                        if (th2 != null) {
                            C66504Q8e c66504Q8e2 = new C66504Q8e(new Exception(th2));
                            c66504Q8e2.setCancelled(false);
                            kakaoAuth2.gv0(c66504Q8e2);
                            return null;
                        }
                        if (accessTokenInfo == null) {
                            kakaoAuth2.gv0(new C66504Q8e(3, "access token missing"));
                            return null;
                        }
                        Q8M q8m = new Q8M(kakaoAuth2.LJLJI.LIZIZ, 1);
                        q8m.LIZ = true;
                        q8m.LJ = c65375PlD2.LIZ;
                        q8m.LJII = c65375PlD2.LIZIZ.getTime();
                        q8m.LIZLLL = String.valueOf(accessTokenInfo.LIZ);
                        kakaoAuth2.LJLJJL.hv0(new AuthResult(q8m));
                        return null;
                    }
                };
                c65378PlG.getClass();
                c65378PlG.LIZ.accessTokenInfo(new AqS193S0100000_11((C66497Q7x) r3, 7));
                return null;
            }
        };
        C65378PlG c65378PlG = this.LJLJJI;
        c65378PlG.getClass();
        o.LJIIIZ(context, "context");
        if (c65378PlG.LIZ.isKakaoTalkLoginAvailable(context)) {
            C65378PlG c65378PlG2 = this.LJLJJI;
            TokenCert cert = TokenCert.with("bpea-kakao_androidsdk_v2_8657");
            c65378PlG2.getClass();
            o.LJIIIZ(cert, "cert");
            C1GE.LJIJJ(cert, "Kakao", "loginWithKakaoTalk", new AqS1S1501000_11(10012, (Context) context, c65378PlG2, (String) null, (List) null, (List) null, (C65430Pm6) r12, 1));
            return;
        }
        C65378PlG c65378PlG3 = this.LJLJJI;
        TokenCert cert2 = TokenCert.with("bpea-kakao_androidsdk_v2_787");
        c65378PlG3.getClass();
        o.LJIIIZ(cert2, "cert");
        C1GE.LJIJJ(cert2, "Kakao", "loginWithKakaoAccount", new AqS0S2600000_11((Context) context, c65378PlG3, (String) null, (String) null, (List) null, (List) null, (List) null, (C65430Pm6) r12, 1));
    }
}
