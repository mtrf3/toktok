package X;

import Y.IDCListenerS163S0100000_11;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class Q5B implements View.OnClickListener {
    public final /* synthetic */ Q6Y LJLIL;

    public final LoginManager LIZ() {
        Q5I targetApp;
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            LoginManager LIZ = LoginManager.LJIIIZ.LIZ();
            Q5V defaultAudience = this.LJLIL.getDefaultAudience();
            o.LJIIIZ(defaultAudience, "defaultAudience");
            LIZ.LIZIZ = defaultAudience;
            Q5O loginBehavior = this.LJLIL.getLoginBehavior();
            o.LJIIIZ(loginBehavior, "loginBehavior");
            LIZ.LIZ = loginBehavior;
            if (!C40700FyC.LIZ(this)) {
                try {
                    targetApp = Q5I.FACEBOOK;
                } catch (Throwable unused) {
                }
                o.LJIIIZ(targetApp, "targetApp");
                LIZ.LJI = targetApp;
                String authType = this.LJLIL.getAuthType();
                o.LJIIIZ(authType, "authType");
                LIZ.LIZLLL = authType;
                C40700FyC.LIZ(this);
                LIZ.LJII = false;
                LIZ.LJIIIIZZ = this.LJLIL.getShouldSkipAccountDeduplication();
                LIZ.LJ = this.LJLIL.getMessengerPageId();
                LIZ.LJFF = this.LJLIL.getResetMessengerState();
                return LIZ;
            }
            targetApp = null;
            o.LJIIIZ(targetApp, "targetApp");
            LIZ.LJI = targetApp;
            String authType2 = this.LJLIL.getAuthType();
            o.LJIIIZ(authType2, "authType");
            LIZ.LIZLLL = authType2;
            C40700FyC.LIZ(this);
            LIZ.LJII = false;
            LIZ.LJIIIIZZ = this.LJLIL.getShouldSkipAccountDeduplication();
            LIZ.LJ = this.LJLIL.getMessengerPageId();
            LIZ.LJFF = this.LJLIL.getResetMessengerState();
            return LIZ;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public final void LIZIZ() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            LoginManager LIZ = LIZ();
            if (this.LJLIL.getAndroidxActivityResultRegistryOwner() != null) {
                Q8K q8k = this.LJLIL.LLFF;
                if (q8k == null) {
                    q8k = new Q6B();
                }
                InterfaceC008701r activityResultRegistryOwner = this.LJLIL.getAndroidxActivityResultRegistryOwner();
                Q6Y q6y = this.LJLIL;
                List<String> list = q6y.LJLLILLLL.LIZIZ;
                String loggerID = q6y.getLoggerID();
                LIZ.getClass();
                o.LJIIIZ(activityResultRegistryOwner, "activityResultRegistryOwner");
                o.LJIIIZ(list, OHQ.LIZIZ);
                LoginClient.Request LIZ2 = LIZ.LIZ(new C37349ElF(list));
                if (loggerID != null) {
                    LIZ2.authId = loggerID;
                }
                LIZ.LJFF(new Q8H(activityResultRegistryOwner, q8k), LIZ2);
                return;
            }
            if (this.LJLIL.getFragment() != null) {
                Fragment fragment = this.LJLIL.getFragment();
                Q6Y q6y2 = this.LJLIL;
                List<String> list2 = q6y2.LJLLILLLL.LIZIZ;
                String loggerID2 = q6y2.getLoggerID();
                LIZ.getClass();
                o.LJIIIZ(fragment, "fragment");
                LIZ.LIZJ(new C66426Q5e(fragment), list2, loggerID2);
                return;
            }
            if (this.LJLIL.getNativeFragment() != null) {
                android.app.Fragment fragment2 = this.LJLIL.getNativeFragment();
                Q6Y q6y3 = this.LJLIL;
                List<String> list3 = q6y3.LJLLILLLL.LIZIZ;
                String loggerID3 = q6y3.getLoggerID();
                LIZ.getClass();
                o.LJIIIZ(fragment2, "fragment");
                LIZ.LIZJ(new C66426Q5e(fragment2), list3, loggerID3);
                return;
            }
            Activity activity = this.LJLIL.getActivity();
            Q6Y q6y4 = this.LJLIL;
            List<String> list4 = q6y4.LJLLILLLL.LIZIZ;
            String loggerID4 = q6y4.getLoggerID();
            LIZ.getClass();
            o.LJIIIZ(activity, "activity");
            LoginClient.Request LIZ3 = LIZ.LIZ(new C37349ElF(list4));
            if (loggerID4 != null) {
                LIZ3.authId = loggerID4;
            }
            LIZ.LJFF(new C66428Q5g(activity), LIZ3);
        } catch (Throwable unused) {
        }
    }

    public Q5B(Q6Y q6y) {
        this.LJLIL = q6y;
    }

    public final void LIZJ(Context context) {
        String string;
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            LoginManager LIZ = LIZ();
            Q6Y q6y = this.LJLIL;
            if (q6y.LJLJLLL) {
                String string2 = q6y.getResources().getString(R.string.dh9);
                String string3 = this.LJLIL.getResources().getString(R.string.dh5);
                Profile.Companion.getClass();
                Profile profile = Q5L.LIZLLL.LIZ().LIZJ;
                if (profile != null && profile.name != null) {
                    string = C16880lQ.LLLZ(this.LJLIL.getResources().getString(R.string.dha), new Object[]{profile.name});
                } else {
                    string = this.LJLIL.getResources().getString(R.string.dhb);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new IDCListenerS163S0100000_11(LIZ, 2)).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                if (!new C03880Dg(2).LIZJ(300000, "android/app/AlertDialog", "show", create, new Object[0], "void", new C65300Pk0(false, "()V", "-7433607383588622575")).LIZ) {
                    create.show();
                    return;
                }
                return;
            }
            LIZ.LIZLLL();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            Q6Y q6y = this.LJLIL;
            q6y.getClass();
            if (!C40700FyC.LIZ(q6y)) {
                try {
                    View.OnClickListener onClickListener = q6y.LJLJI;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                } catch (Throwable unused) {
                }
            }
            C66382Q3m c66382Q3m = AccessToken.Companion;
            c66382Q3m.getClass();
            AccessToken LIZIZ = C66382Q3m.LIZIZ();
            c66382Q3m.getClass();
            if (C66382Q3m.LIZJ()) {
                LIZJ(this.LJLIL.getContext());
            } else {
                LIZIZ();
            }
            this.LJLIL.getContext();
            Bundle bundle = new Bundle();
            if (LIZIZ != null) {
                i = 0;
            } else {
                i = 1;
            }
            bundle.putInt("logging_in", i);
            c66382Q3m.getClass();
            bundle.putInt("access_token_expired", C66382Q3m.LIZJ() ? 1 : 0);
        } catch (Throwable unused2) {
        }
    }
}
