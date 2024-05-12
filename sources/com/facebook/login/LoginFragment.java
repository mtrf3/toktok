package com.facebook.login;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C1AS;
import X.C221018lt;
import X.C29S;
import X.C3C5;
import X.C66382Q3m;
import X.C66427Q5f;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.ORZ;
import X.Q4W;
import X.Q5I;
import X.Q5O;
import X.UPG;
import X.X1D;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public class LoginFragment extends Fragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public String LJLIL;
    public LoginClient LJLILLLLZI;
    public LoginClient.Request LJLJI;

    public final LoginClient vl() {
        LoginClient loginClient = this.LJLILLLLZI;
        if (loginClient != null) {
            return loginClient;
        }
        o.LJIJI("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        LoginMethodHandler LJIIIIZZ = vl().LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZIZ();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        View findViewById;
        super.onPause();
        View view = getView();
        if (view == null || (findViewById = view.findViewById(R.id.biq)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLIL == null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            mo49getActivity.finish();
            return;
        }
        LoginClient vl = vl();
        LoginClient.Request request = this.LJLJI;
        LoginClient.Request request2 = vl.pendingRequest;
        if (request2 != null && vl.currentHandler >= 0) {
            return;
        }
        if (request != null) {
            if (request2 == null) {
                AccessToken.Companion.getClass();
                if (!C66382Q3m.LIZJ() || vl.LIZLLL()) {
                    vl.pendingRequest = request;
                    ArrayList arrayList = new ArrayList();
                    Q5O q5o = request.loginBehavior;
                    Q5I q5i = request.loginTargetApp;
                    Q5I q5i2 = Q5I.INSTAGRAM;
                    if (q5i == q5i2) {
                        if (!u.LJIILIIL && q5o.allowsInstagramAppAuth()) {
                            arrayList.add(new InstagramAppLoginMethodHandler(vl));
                        }
                    } else {
                        if (q5o.allowsGetTokenAuth()) {
                            arrayList.add(new GetTokenLoginMethodHandler(vl));
                        }
                        if (!u.LJIILIIL && q5o.allowsKatanaAuth()) {
                            arrayList.add(new KatanaProxyLoginMethodHandler(vl));
                        }
                    }
                    if (q5o.allowsCustomTabAuth()) {
                        arrayList.add(new CustomTabLoginMethodHandler(vl));
                    }
                    if (q5o.allowsWebViewAuth()) {
                        arrayList.add(new WebViewLoginMethodHandler(vl));
                    }
                    if (request.loginTargetApp != q5i2 && q5o.allowsDeviceAuth()) {
                        arrayList.add(new DeviceAuthMethodHandler(vl));
                    }
                    Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
                    if (array != null) {
                        vl.handlersToTry = (LoginMethodHandler[]) array;
                        vl.LJIIL();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            } else {
                throw new Q4W("Attempted to authorize while a request is pending.");
            }
        }
        if (!UPG.LJLLLL || request == null) {
            return;
        }
        String LLD = ORZ.LLD(request.permissions, null, null, null, null, 63);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("fb_permissions", LLD);
        FMX.LJIIL("fb_inner_permission_track", c188727au.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fbSdkPermissionInnerCheck: ");
        LIZ.append(LLD);
        C221018lt.LIZ("yjy", X1D.LIZIZ(LIZ));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        LoginClient loginClient;
        Bundle LJJLIIIIJ;
        super.onCreate(bundle);
        if (bundle == null || (loginClient = (LoginClient) bundle.getParcelable("loginClient")) == null) {
            loginClient = new LoginClient(this);
        } else if (loginClient.fragment == null) {
            loginClient.fragment = this;
        } else {
            throw new Q4W("Can't set fragment once it is already set.");
        }
        this.LJLILLLLZI = loginClient;
        vl().onCompletedListener = new C1AS(this);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        ComponentName callingActivity = mo49getActivity.getCallingActivity();
        if (callingActivity != null) {
            this.LJLIL = callingActivity.getPackageName();
        }
        Intent intent = mo49getActivity.getIntent();
        if (intent != null && (LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "com.facebook.LoginFragment:Request")) != null) {
            this.LJLJI = (LoginClient.Request) LJJLIIIIJ.getParcelable("request");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", vl());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        vl().LJIIJJI(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.w5, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.biq);
        vl().backgroundProcessingListener = new C66427Q5f(findViewById);
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
