package com.facebook;

import X.ActivityC45651qj;
import X.C1B3;
import X.C38891fp;
import X.C40700FyC;
import X.C65803Ps7;
import X.EF7;
import X.Q4W;
import X.Q5A;
import X.Q6D;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.login.LoginFragment;
import com.zhiliaoapp.musically.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public class FacebookActivity extends ActivityC45651qj {
    public Fragment LJLIL;

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
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

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.LJLIL;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        if (!u.LJII()) {
            u.LJIIJ(EF7.LIZIZ());
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!u.LJII()) {
            Context applicationContext = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            o.LJIIIIZZ(applicationContext, "applicationContext");
            u.LJIIJ(applicationContext);
        }
        setContentView(R.layout.w3);
        if (o.LJ("PassThrough", intent.getAction())) {
            Intent requestIntent = getIntent();
            o.LJIIIIZZ(requestIntent, "requestIntent");
            Q4W LJIIJ = Q5A.LJIIJ(Q5A.LJIILIIL(requestIntent));
            Intent intent2 = getIntent();
            o.LJIIIIZZ(intent2, "intent");
            setResult(0, Q5A.LJI(intent2, null, LJIIJ));
            finish();
            return;
        }
        Intent intent3 = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        Fragment LJJJIL = supportFragmentManager.LJJJIL("SingleFragment");
        Fragment fragment = LJJJIL;
        if (LJJJIL == null) {
            if (o.LJ("FacebookDialogFragment", intent3.getAction())) {
                FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
                facebookDialogFragment.setRetainInstance(true);
                facebookDialogFragment.show(supportFragmentManager, "SingleFragment");
                fragment = facebookDialogFragment;
            } else {
                LoginFragment loginFragment = new LoginFragment();
                loginFragment.setRetainInstance(true);
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIIIZZ(R.id.bip, 1, loginFragment, "SingleFragment");
                c1b3.LJIILJJIL();
                fragment = loginFragment;
            }
        }
        this.LJLIL = fragment;
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            o.LJIIIZ(prefix, "prefix");
            o.LJIIIZ(writer, "writer");
            Q6D.LIZ.getClass();
            if (o.LJ(null, Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable unused) {
        }
    }
}
