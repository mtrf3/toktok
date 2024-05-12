package com.bytedance.lobby.google;

import X.ActivityC45651qj;
import X.C0NY;
import X.C16880lQ;
import X.C66498Q7y;
import X.C66504Q8e;
import X.C67671Qh9;
import X.C67675QhD;
import X.C67798QjC;
import X.C68864R0y;
import X.ETK;
import X.Q8M;
import X.QB3;
import X.QCI;
import X.QH7;
import Y.AObjectS88S0300000_11;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.bytedance.awemelobby.LobbyNonceGenerator;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.account.login.GoogleOneTapLogger;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class GoogleOneTapAuth extends GoogleOneTapProvider<AuthResult> implements QB3 {
    public C67798QjC LJLJJI;
    public LobbyViewModel LJLJJL;
    public String LJLJJLL;
    public Bundle LJLJL;

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

    @Override // X.QB3
    public final /* synthetic */ void onDestroy() {
    }

    public GoogleOneTapAuth(QCI qci) {
        super(LobbyCore.getApplication(), qci);
    }

    public static C66504Q8e gv0(String str) {
        int i;
        try {
            i = CastIntegerProtector.parseInt(str.replaceAll("[^0-9]", ""));
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i != 5 && i != 6) {
            if (i != 7) {
                if (i != 8) {
                    if (i != 15) {
                        if (i != 16) {
                            switch (i) {
                                case 12500:
                                    break;
                                case 12501:
                                    break;
                                case 12502:
                                    break;
                                default:
                                    return new C66504Q8e(3, 8, str);
                            }
                        }
                        return new C66504Q8e(4, i, str);
                    }
                    return new C66504Q8e(-999, i, str);
                }
            } else {
                return new C66504Q8e(5, i, str);
            }
        }
        return new C66504Q8e(3, i, str);
    }

    public final BeginSignInRequest hv0(Boolean bool) {
        C68864R0y c68864R0y = new C68864R0y();
        C67671Qh9 c67671Qh9 = new C67671Qh9();
        c67671Qh9.LIZ = true;
        c67671Qh9.LIZJ = this.LJLJJLL;
        String str = this.LJLJI.LIZJ;
        QH7.LJI(str);
        c67671Qh9.LIZIZ = str;
        c67671Qh9.LIZLLL = bool.booleanValue();
        c68864R0y.LIZIZ = c67671Qh9.LIZ();
        c68864R0y.LJFF = false;
        return c68864R0y.LIZ();
    }

    public final void iv0(C66504Q8e c66504Q8e) {
        Q8M q8m = new Q8M(this.LJLJI.LIZIZ, 1);
        q8m.LIZ = false;
        q8m.LIZIZ = c66504Q8e;
        this.LJLJJL.hv0(new AuthResult(q8m));
    }

    public final Boolean kv0(String str) {
        try {
            String[] split = str.split("\\.");
            if (split.length != 3) {
                return Boolean.FALSE;
            }
            boolean z = true;
            String string = JSONObjectProtectorUtils.getString(new JSONObject(new String(Base64.decode(split[1], 8), "UTF-8")), "nonce");
            String str2 = this.LJLJJLL;
            if (str2 == null || !str2.equals(string)) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public final void jv0(String str, String str2) {
        Bundle bundle = new Bundle();
        Q8M q8m = new Q8M(this.LJLJI.LIZIZ, 1);
        q8m.LIZ = true;
        q8m.LJ = str;
        q8m.LIZLLL = str2;
        q8m.LJIIIZ = this.LJLJJLL;
        q8m.LJIIJ = bundle;
        this.LJLJJL.hv0(new AuthResult(q8m));
        GoogleOneTapLogger.LIZLLL().LIZJ(this.LJLJL);
    }

    @Override // X.QB3
    public final void us(Bundle bundle, ActivityC45651qj activityC45651qj) {
        if (!LJJZZIII()) {
            C66498Q7y.LIZIZ(this.LJLJJL, "google_onetap", 2);
        } else {
            this.LJLJJI.LJI();
        }
    }

    @Override // X.QB3
    public final void za(Bundle bundle, ActivityC45651qj activityC45651qj) {
        this.LJLJJL = LobbyViewModel.gv0(activityC45651qj);
        this.LJLJL = bundle;
        if (!LJJZZIII()) {
            C66498Q7y.LIZIZ(this.LJLJJL, "google_onetap", 1);
            return;
        }
        QH7.LJIIIIZZ(activityC45651qj);
        this.LJLJJI = new C67798QjC((Activity) activityC45651qj, new C67675QhD());
        LobbyNonceGenerator.LIZIZ().LIZ(new AObjectS88S0300000_11(this, activityC45651qj, bundle, 0));
    }

    @Override // X.QB3
    public final void q50(ActivityC45651qj activityC45651qj, int i, int i2, Intent intent) {
        C66504Q8e c66504Q8e;
        if (i != 1) {
            return;
        }
        try {
            SignInCredential LJFF = C67798QjC.LJFF(intent);
            String str = LJFF.zbg;
            String str2 = LJFF.zba;
            if (str != null) {
                if (!kv0(str).booleanValue()) {
                    iv0(new C66504Q8e(6, -1, "Nonce is invalid"));
                } else {
                    jv0(str, str2);
                }
            } else {
                iv0(new C66504Q8e(6, -1, "No ID token or password!"));
            }
        } catch (ETK e) {
            int statusCode = e.getStatusCode();
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
            iv0(c66504Q8e);
        }
    }
}
