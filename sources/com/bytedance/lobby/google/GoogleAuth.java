package com.bytedance.lobby.google;

import X.AbstractC67709Qhl;
import X.AbstractC67715Qhr;
import X.ActivityC45651qj;
import X.C0NY;
import X.C16880lQ;
import X.C1GE;
import X.C40644FxI;
import X.C66498Q7y;
import X.C66504Q8e;
import X.C67637Qgb;
import X.C67646Qgk;
import X.C67673QhB;
import X.C67692QhU;
import X.C67700Qhc;
import X.C67704Qhg;
import X.C67713Qhp;
import X.C67717Qht;
import X.C67718Qhu;
import X.C67756QiW;
import X.C77119UOl;
import X.ETK;
import X.InterfaceC67706Qhi;
import X.InterfaceC67740QiG;
import X.Q8M;
import X.QB3;
import X.QCI;
import X.QH7;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.google.GoogleAuth;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes12.dex */
public class GoogleAuth extends GoogleProvider<AuthResult> implements QB3, InterfaceC67706Qhi {
    public static final boolean LJLJLLL = C77119UOl.LIZIZ;
    public int LJLJJI;
    public Bundle LJLJJL;
    public WeakReference<ActivityC45651qj> LJLJJLL;
    public boolean LJLJL;
    public C67756QiW LJLJLJ;

    @Override // com.bytedance.lobby.internal.BaseProvider, X.QB9
    public final boolean LJJZZIII() {
        boolean z;
        if (C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), LobbyCore.getApplication()) == 0) {
            z = true;
            return !super.LJJZZIII() && z;
        }
        z = false;
        if (super.LJJZZIII()) {
        }
    }

    @Override // X.QB3
    public final /* synthetic */ void Ml0(int i) {
    }

    @Override // X.InterfaceC67784Qiy
    public final void v7(int i) {
    }

    @Override // X.QB3
    public final void onDestroy() {
        if (this.LJLJLJ != null) {
            this.LJLJLJ = null;
        }
    }

    public GoogleAuth(QCI qci) {
        super(LobbyCore.getApplication(), qci);
    }

    @Override // X.InterfaceC67784Qiy
    public final void H0(Bundle bundle) {
        final ActivityC45651qj activityC45651qj;
        WeakReference<ActivityC45651qj> weakReference = this.LJLJJLL;
        if (weakReference != null) {
            activityC45651qj = weakReference.get();
        } else {
            activityC45651qj = null;
        }
        if (!this.LJLJL || activityC45651qj == null) {
            return;
        }
        this.LJLJL = false;
        final AbstractC67709Qhl gv0 = gv0(activityC45651qj, hv0(this.LJLJJL));
        jv0(gv0, new InterfaceC67740QiG() { // from class: X.Qh8
            @Override // X.InterfaceC67740QiG
            public final void LIZ(InterfaceC67754QiU interfaceC67754QiU) {
                GoogleAuth googleAuth = GoogleAuth.this;
                ActivityC45651qj activityC45651qj2 = activityC45651qj;
                AbstractC67709Qhl abstractC67709Qhl = gv0;
                googleAuth.getClass();
                GoogleAuth.iv0(activityC45651qj2, abstractC67709Qhl);
            }
        });
    }

    public final GoogleSignInOptions hv0(Bundle bundle) {
        boolean z;
        C67700Qhc c67700Qhc = new C67700Qhc(GoogleSignInOptions.DEFAULT_SIGN_IN);
        boolean z2 = true;
        if (bundle.getBoolean("google_request_profile", true)) {
            ((HashSet) c67700Qhc.LIZ).add(GoogleSignInOptions.zaa);
        }
        if (bundle.getBoolean("google_request_id", true)) {
            ((HashSet) c67700Qhc.LIZ).add(GoogleSignInOptions.zac);
        }
        if (bundle.getBoolean("google_request_email", true)) {
            ((HashSet) c67700Qhc.LIZ).add(GoogleSignInOptions.zab);
        }
        if (bundle.getBoolean("google_request_id_token", true)) {
            String str = this.LJLJI.LIZJ;
            c67700Qhc.LIZLLL = true;
            QH7.LJI(str);
            String str2 = c67700Qhc.LJ;
            if (str2 == null || str2.equals(str)) {
                z = true;
            } else {
                z = false;
            }
            QH7.LIZ("two different server client ids provided", z);
            c67700Qhc.LJ = str;
        }
        if (bundle.getBoolean("google_request_server_auth_code", false)) {
            boolean z3 = bundle.getBoolean("google_force_refresh_token", false);
            String str3 = this.LJLJI.LIZJ;
            c67700Qhc.LIZIZ = true;
            QH7.LJI(str3);
            String str4 = c67700Qhc.LJ;
            if (str4 != null && !str4.equals(str3)) {
                z2 = false;
            }
            QH7.LIZ("two different server client ids provided", z2);
            c67700Qhc.LJ = str3;
            c67700Qhc.LIZJ = z3;
        }
        return c67700Qhc.LIZ();
    }

    public static void iv0(ActivityC45651qj activityC45651qj, AbstractC67709Qhl abstractC67709Qhl) {
        C67717Qht.LIZLLL.getClass();
        C16880lQ.LJI(activityC45651qj, C67692QhU.LIZ(abstractC67709Qhl.LJIIIIZZ(), ((C67704Qhg) abstractC67709Qhl.LJII(C67717Qht.LJFF)).LLIIIL), 101);
    }

    public static void jv0(AbstractC67709Qhl abstractC67709Qhl, final InterfaceC67740QiG interfaceC67740QiG) {
        if (!abstractC67709Qhl.LJIIJ()) {
            return;
        }
        C67717Qht.LIZLLL.getClass();
        C67692QhU.LIZIZ(abstractC67709Qhl, abstractC67709Qhl.LJIIIIZZ(), false).LIZIZ(new InterfaceC67740QiG() { // from class: X.QhG
            @Override // X.InterfaceC67740QiG
            public final void LIZ(InterfaceC67754QiU interfaceC67754QiU) {
                InterfaceC67740QiG interfaceC67740QiG2 = InterfaceC67740QiG.this;
                if (interfaceC67740QiG2 != null) {
                    interfaceC67740QiG2.LIZ(interfaceC67754QiU);
                }
            }
        });
    }

    public final AbstractC67709Qhl gv0(ActivityC45651qj activityC45651qj, GoogleSignInOptions googleSignInOptions) {
        if (this.LJLJLJ == null) {
            C67713Qhp c67713Qhp = new C67713Qhp(activityC45651qj);
            C67718Qhu<GoogleSignInOptions> c67718Qhu = C67717Qht.LIZIZ;
            QH7.LJIIIZ(c67718Qhu, "Api must not be null");
            c67713Qhp.LJI.put(c67718Qhu, googleSignInOptions);
            AbstractC67715Qhr<?, GoogleSignInOptions> abstractC67715Qhr = c67718Qhu.LIZ;
            QH7.LJIIIZ(abstractC67715Qhr, "Base client builder must not be null");
            List<Scope> LIZ = abstractC67715Qhr.LIZ(googleSignInOptions);
            c67713Qhp.LIZIZ.addAll(LIZ);
            c67713Qhp.LIZ.addAll(LIZ);
            c67713Qhp.LJIILIIL.add(this);
            this.LJLJLJ = c67713Qhp.LIZ();
        }
        return this.LJLJLJ;
    }

    @Override // X.QB3
    public final void us(Bundle bundle, ActivityC45651qj activityC45651qj) {
        final LobbyViewModel gv0 = LobbyViewModel.gv0(activityC45651qj);
        if (!LJJZZIII()) {
            C66498Q7y.LIZIZ(gv0, "google", 2);
            return;
        }
        AbstractC67709Qhl gv02 = gv0(activityC45651qj, hv0(bundle));
        if (gv02.LJIIJ()) {
            jv0(gv02, new InterfaceC67740QiG() { // from class: X.QBv
                @Override // X.InterfaceC67740QiG
                public final void LIZ(InterfaceC67754QiU interfaceC67754QiU) {
                    LobbyViewModel lobbyViewModel = LobbyViewModel.this;
                    Status status = (Status) interfaceC67754QiU;
                    if (GoogleAuth.LJLJLLL) {
                        status.getClass();
                    }
                    Q8M q8m = new Q8M("google", 2);
                    q8m.LIZ = status.LJJJJL();
                    lobbyViewModel.hv0(new AuthResult(q8m));
                }
            });
            return;
        }
        Q8M q8m = new Q8M("google", 2);
        q8m.LIZ = false;
        q8m.LIZIZ = new C66504Q8e(new IllegalStateException("GoogleApiClient is not connected yet"));
        gv0.hv0(new AuthResult(q8m));
    }

    @Override // X.QB3
    public final void za(Bundle bundle, final ActivityC45651qj activityC45651qj) {
        LobbyViewModel gv0 = LobbyViewModel.gv0(activityC45651qj);
        if (!LJJZZIII()) {
            C66498Q7y.LIZIZ(gv0, "google", 1);
            return;
        }
        this.LJLJJLL = new WeakReference<>(activityC45651qj);
        this.LJLJJL = bundle;
        final AbstractC67709Qhl gv02 = gv0(activityC45651qj, hv0(bundle));
        if (bundle.getBoolean("google_force_sign_out", true)) {
            gv02.LIZLLL();
            if (gv02.LJIIJ()) {
                jv0(gv02, new InterfaceC67740QiG() { // from class: X.Qh7
                    @Override // X.InterfaceC67740QiG
                    public final void LIZ(InterfaceC67754QiU interfaceC67754QiU) {
                        GoogleAuth googleAuth = GoogleAuth.this;
                        ActivityC45651qj activityC45651qj2 = activityC45651qj;
                        AbstractC67709Qhl abstractC67709Qhl = gv02;
                        googleAuth.getClass();
                        GoogleAuth.iv0(activityC45651qj2, abstractC67709Qhl);
                    }
                });
                return;
            } else {
                this.LJLJL = true;
                return;
            }
        }
        iv0(activityC45651qj, gv02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.QB3
    public final void q50(ActivityC45651qj activityC45651qj, int i, int i2, Intent intent) {
        C67673QhB c67673QhB;
        C67646Qgk LIZLLL;
        C66504Q8e c66504Q8e;
        this.LJLJJLL = new WeakReference<>(activityC45651qj);
        GoogleSignInAccount googleSignInAccount = null;
        if (intent == null) {
            c67673QhB = new C67673QhB(null, Status.RESULT_INTERNAL_ERROR);
        } else {
            Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status == null) {
                    status = Status.RESULT_INTERNAL_ERROR;
                }
                c67673QhB = new C67673QhB(null, status);
            } else {
                c67673QhB = new C67673QhB(googleSignInAccount2, Status.RESULT_SUCCESS);
            }
        }
        GoogleSignInAccount googleSignInAccount3 = c67673QhB.LJLILLLLZI;
        if (!c67673QhB.LJLIL.LJJJJL() || googleSignInAccount3 == null) {
            LIZLLL = C67637Qgb.LIZLLL(C1GE.LIZJ(c67673QhB.LJLIL));
        } else {
            LIZLLL = C67637Qgb.LJ(googleSignInAccount3);
        }
        try {
            e = null;
            googleSignInAccount = (GoogleSignInAccount) LIZLLL.LJIIJ(ETK.class);
        } catch (ETK e) {
            e = e;
        }
        if (googleSignInAccount == null) {
            if (e != null) {
                int statusCode = e.getStatusCode();
                if (statusCode == 7 || statusCode == 8) {
                    int i3 = this.LJLJJI + 1;
                    this.LJLJJI = i3;
                    if (i3 <= 3) {
                        za(this.LJLJJL, activityC45651qj);
                        return;
                    }
                }
                if (statusCode != 5) {
                    if (statusCode != 6) {
                        if (statusCode != 7) {
                            if (statusCode != 8) {
                                if (statusCode != 13) {
                                    if (statusCode != 15) {
                                        if (statusCode != 16) {
                                            switch (statusCode) {
                                                case 12500:
                                                    c66504Q8e = new C66504Q8e(3, statusCode, "Sign in failed with the selected Google account. There is nothing user can do to recover from the sign in failure. Switching to another account may or may not help. Check adb log to see details if any");
                                                    break;
                                                case 12501:
                                                    c66504Q8e = new C66504Q8e(4, statusCode, "The sign in was cancelled by the user. i.e. user cancelled some of the sign in resolutions, e.g. account picking or OAuth consent");
                                                    break;
                                                case 12502:
                                                    c66504Q8e = new C66504Q8e(-999, statusCode, "A sign in process is currently in progress and the current one cannot continue. e.g. the user clicks the SignInButton multiple times and more than one sign in intent was launched");
                                                    break;
                                                default:
                                                    c66504Q8e = new C66504Q8e(7, statusCode, C0NY.LIZIZ("Unknown error code = ", statusCode, ", check documentation"));
                                                    break;
                                            }
                                        } else {
                                            c66504Q8e = new C66504Q8e(4, statusCode, "The result was canceled either due to client disconnect or cancel()");
                                        }
                                    } else {
                                        c66504Q8e = new C66504Q8e(-999, statusCode, "Timed out while awaiting the result");
                                    }
                                } else {
                                    c66504Q8e = new C66504Q8e(7, statusCode, "The operation failed with no more detailed information from Google");
                                }
                            } else {
                                c66504Q8e = new C66504Q8e(3, statusCode, "Google internal error occurred. Retrying should resolve the problem");
                            }
                        } else {
                            c66504Q8e = new C66504Q8e(5, statusCode, "Google network error occurred. Retrying should resolve the problem");
                        }
                    } else {
                        c66504Q8e = new C66504Q8e(3, statusCode, "Completing the operation requires some form of resolution");
                    }
                } else {
                    c66504Q8e = new C66504Q8e(3, statusCode, "The client attempted to connect to the service with an invalid account name specified");
                }
            } else {
                c66504Q8e = new C66504Q8e(6, "GoogleSignInAccount and ApiException are both null");
            }
            Q8M q8m = new Q8M("google", 1);
            q8m.LIZ = false;
            q8m.LIZIZ = c66504Q8e;
            LobbyViewModel.gv0(activityC45651qj).hv0(new AuthResult(q8m));
            return;
        }
        Q8M q8m2 = new Q8M("google", 1);
        q8m2.LIZ = true;
        q8m2.LIZLLL = googleSignInAccount.zad;
        C40644FxI c40644FxI = new C40644FxI();
        c40644FxI.LIZ().putString("email", googleSignInAccount.zaf);
        c40644FxI.LIZ().putString("display_name", googleSignInAccount.zag);
        c40644FxI.LIZ().putString("code", googleSignInAccount.zai);
        q8m2.LJIIJ = c40644FxI.LIZ();
        q8m2.LJ = googleSignInAccount.zae;
        LobbyViewModel.gv0(activityC45651qj).hv0(new AuthResult(q8m2));
    }
}
