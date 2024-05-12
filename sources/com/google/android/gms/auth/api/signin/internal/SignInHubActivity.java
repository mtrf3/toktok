package com.google.android.gms.auth.api.signin.internal;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C65803Ps7;
import X.C67691QhT;
import X.C67695QhX;
import X.C78598Ut0;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes12.dex */
public class SignInHubActivity extends ActivityC45651qj {
    public static boolean LJLJJLL;
    public boolean LJLIL;
    public SignInConfiguration LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public Intent LJLJJL;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        LJLJJLL = false;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public final void LLFII(int i) {
        Status status = new Status(i, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        LJLJJLL = false;
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            LLFII(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(intent, "config");
            LJJLIIIIJ.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) LJJLIIIIJ.getParcelable("config");
            if (signInConfiguration == null) {
                setResult(0);
                finish();
                return;
            }
            this.LJLILLLLZI = signInConfiguration;
            if (bundle == null) {
                if (LJLJJLL) {
                    setResult(0);
                    LLFII(12502);
                    return;
                }
                LJLJJLL = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.LJLILLLLZI);
                try {
                    C78598Ut0.LJIJJ(intent2, this);
                    startActivityForResult(intent2, 40962);
                    return;
                } catch (ActivityNotFoundException unused) {
                    this.LJLIL = true;
                    LLFII(17);
                    return;
                }
            }
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.LJLJI = z;
            if (z) {
                this.LJLJJI = bundle.getInt("signInResultCode");
                Intent intent3 = (Intent) bundle.getParcelable("signInResultData");
                intent3.getClass();
                this.LJLJJL = intent3;
                getSupportLoaderManager().LIZJ(0, null, new C67695QhX(this));
                LJLJJLL = false;
                return;
            }
            return;
        }
        intent.getAction();
        finish();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.LJLJI);
        if (this.LJLJI) {
            bundle.putInt("signInResultCode", this.LJLJJI);
            bundle.putParcelable("signInResultData", this.LJLJJL);
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.LJLIL) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.zbc) != null) {
                C67691QhT LIZ = C67691QhT.LIZ(this);
                GoogleSignInOptions googleSignInOptions = this.LJLILLLLZI.zbb;
                synchronized (LIZ) {
                    LIZ.LIZ.LIZLLL(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.LJLJI = true;
                this.LJLJJI = i2;
                this.LJLJJL = intent;
                getSupportLoaderManager().LIZJ(0, null, new C67695QhX(this));
                LJLJJLL = false;
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                LLFII(intExtra);
                return;
            }
        }
        LLFII(8);
    }
}
