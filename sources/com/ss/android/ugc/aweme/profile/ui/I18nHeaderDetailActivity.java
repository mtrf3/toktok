package com.ss.android.ugc.aweme.profile.ui;

import X.AnonymousClass636;
import X.C245319jz;
import X.C252669vq;
import X.C65803Ps7;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import Y.ACListenerS21S0100000_1;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class I18nHeaderDetailActivity extends HeaderDetailActivity {
    public boolean LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity, X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
    public final void LLFZ() {
        if (this.LLIFFJFJJ) {
            C245319jz c245319jz = new C245319jz();
            C252669vq c252669vq = new C252669vq();
            String string = getString(R.string.ia9);
            o.LJIIIIZZ(string, "getString(R.string.mus_a…ount_avatar_video_type_0)");
            c252669vq.LIZ = string;
            c252669vq.LJ = new ACListenerS21S0100000_1(new AqS170S0100000_4(this, 562), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            c245319jz.LIZIZ(c252669vq);
            TuxActionSheet LIZJ = c245319jz.LIZJ();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "this.supportFragmentManager");
            LIZJ.show(supportFragmentManager, "uploadAvatar");
            return;
        }
        super.LLFZ();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity
    public final void LLIIIILZ() {
        super.LLIIIILZ();
        this.LLIFFJFJJ = getIntent().getBooleanExtra("handle_with_video_avatar", false);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.ddd);
        if (findViewById != null) {
            findViewById.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.d6, this));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onCreate", false);
    }
}
