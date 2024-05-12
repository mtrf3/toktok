package com.ss.android.ugc.aweme.profile.ui;

import X.ActivityC45651qj;
import X.C00F;
import X.C16880lQ;
import X.C1B3;
import X.C252819w5;
import X.C252859w9;
import X.C57082Lw;
import X.C65803Ps7;
import X.InterfaceC252839w7;
import X.YUO;
import Y.AObjectS11S0001000_6;
import Y.AObserverS72S0100000_4;
import Y.IDxS305S0100000_4;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ProfileEditActivity extends YUO {
    public static final /* synthetic */ int LJLJJI = 0;
    public InterfaceC252839w7<MusProfileEditFragment> LJLJI;

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC252839w7<MusProfileEditFragment> interfaceC252839w7 = this.LJLJI;
        if (interfaceC252839w7 != null) {
            interfaceC252839w7.get().xm();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        ActivityC45651qj mo49getActivity;
        View currentFocus;
        InterfaceC252839w7<MusProfileEditFragment> interfaceC252839w7 = this.LJLJI;
        if (interfaceC252839w7 == null) {
            return super.dispatchTouchEvent(ev);
        }
        MusProfileEditFragment musProfileEditFragment = interfaceC252839w7.get();
        musProfileEditFragment.getClass();
        o.LJIIIZ(ev, "ev");
        if (ev.getAction() == 0 && (mo49getActivity = musProfileEditFragment.mo49getActivity()) != null && (currentFocus = mo49getActivity.getCurrentFocus()) != null && (currentFocus instanceof EditText)) {
            int[] iArr = {0, 0};
            currentFocus.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int height = currentFocus.getHeight() + i2;
            int width = currentFocus.getWidth() + i;
            if (ev.getX() <= i || ev.getX() >= width || ev.getY() <= i2 || ev.getY() >= height) {
                ActivityC45651qj requireActivity = musProfileEditFragment.requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                Object LLILL = C16880lQ.LLILL(requireActivity, "input_method");
                o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                if (((InputMethodManager) LLILL).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2)) {
                    return true;
                }
            }
        }
        if (super.dispatchTouchEvent(ev)) {
            return true;
        }
        return false;
    }

    @Override // X.YUO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", true);
        activityConfiguration(new AObjectS11S0001000_6(2, 0));
        super.onCreate(bundle);
        setContentView(R.layout.uv);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        InterfaceC252839w7<MusProfileEditFragment> interfaceC252839w7 = this.LJLJI;
        if (interfaceC252839w7 != null && !interfaceC252839w7.get().LLJZIJLIL) {
            MusProfileEditFragment musProfileEditFragment = this.LJLJI.get();
            Bundle bundle2 = new Bundle();
            if (getIntent() != null) {
                bundle2.putInt("jump_school_edit", getIntent().getIntExtra("jump_school_edit", 0));
                if (TextUtils.equals(C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from"), "message")) {
                    bundle2.putInt("need_focus_id_input", 3);
                } else {
                    bundle2.putInt("need_focus_id_input", getIntent().getIntExtra("need_focus_id_input", 0));
                }
                bundle2.putInt("need_focus_id_input", getIntent().getIntExtra("need_focus_id_input", 0));
                bundle2.putString("enter_from", C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from"));
                bundle2.putString("enter_method", C16880lQ.LLJJIJIIJIL(getIntent(), "enter_method"));
                bundle2.putBoolean("change_to_ba", getIntent().getBooleanExtra("change_to_ba", false));
                getIntent();
                bundle2.putBoolean("aivatar_notif_permission", getIntent().getBooleanExtra("aivatar_notif_permission", false));
            }
            musProfileEditFragment.setArguments(bundle2);
            c1b3.LJIIJ(this.LJLJI.get(), "user_profile_edit_fragment", R.id.dm7);
            c1b3.LJIILJJIL();
        }
        if ((C00F.LIZ(31744, 0, "show_email_consent_page_scene", true) == 4 || C00F.LIZ(31744, 0, "show_email_consent_page_scene", true) == 3) && C252819w5.LIZ("profile_page")) {
            C57082Lw.LIZ.LIZIZ("email_consent_status").observe(this, new AObserverS72S0100000_4(this, 4));
            C252859w9.LIZ().LIZ(new IDxS305S0100000_4(this, 23));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC252839w7<MusProfileEditFragment> interfaceC252839w7 = this.LJLJI;
        if (interfaceC252839w7 != null) {
            interfaceC252839w7.get().onActivityResult(i, i2, intent);
        }
    }
}
