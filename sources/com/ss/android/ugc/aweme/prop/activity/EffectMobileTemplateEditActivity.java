package com.ss.android.ugc.aweme.prop.activity;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C63081OpJ;
import X.C65803Ps7;
import X.C74186T9q;
import X.C78880UxY;
import X.GHB;
import X.InterfaceC36571c5;
import X.TAP;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.prop.fragment.MobileEffectDoneFragment;
import com.ss.android.ugc.aweme.prop.fragment.MobileEffectEditFragment;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneInitState;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EffectMobileTemplateEditActivity extends ActivityC86117Xqz implements TAP {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTemplateEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        GHB ghb;
        InterfaceC36571c5 LJJJI = getSupportFragmentManager().LJJJI(R.id.dm4);
        Boolean bool = null;
        if ((LJJJI instanceof GHB) && (ghb = (GHB) LJJJI) != null) {
            bool = Boolean.valueOf(ghb.onBackPressed());
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            super.onBackPressed();
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

    @Override // X.TAP
    public final void LJJJLL(String effectId) {
        o.LJIIIZ(effectId, "effectId");
        setResult(-1, new Intent().putExtra("published_effect_id", effectId));
        finish();
    }

    @Override // X.TAP
    public final void LJLLI(EffectDoneInitState doneState) {
        o.LJIIIZ(doneState, "doneState");
        MobileEffectDoneFragment mobileEffectDoneFragment = new MobileEffectDoneFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("mobile_effect_done_state", doneState);
        mobileEffectDoneFragment.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(mobileEffectDoneFragment, null, R.id.dm4);
        c1b3.LJIILJJIL();
    }

    @Override // X.TAP
    public final void LJLLJ(String draftId) {
        o.LJIIIZ(draftId, "draftId");
        setResult(-1, new Intent().putExtra("save_draft_id", draftId));
        finish();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        MobileEffectData mobileEffectData;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTemplateEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.eo);
        View findViewById = findViewById(R.id.pg);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Context context = findViewById.getContext();
            o.LJIIIIZZ(context, "this.context");
            layoutParams.height = C63081OpJ.LJJJJLI(context);
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null) {
            mobileEffectData = (MobileEffectData) LLJJIJI.getParcelable("effect_init_data");
        } else {
            mobileEffectData = null;
        }
        if (!(mobileEffectData instanceof MobileEffectData)) {
            mobileEffectData = null;
        }
        if (mobileEffectData == null) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTemplateEditActivity", "onCreate", false);
            return;
        }
        MobileEffectEditFragment mobileEffectEditFragment = new MobileEffectEditFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("effect_init_data", mobileEffectData);
        mobileEffectEditFragment.setArguments(bundle2);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(mobileEffectEditFragment, null, R.id.dm4);
        c1b3.LJIILJJIL();
        Map<String, String> map = C74186T9q.LIZJ(mobileEffectData).LIZ;
        o.LJIIIIZZ(map, "it.builder()");
        C78880UxY.LJJLIIIJL("mobile_effect_edit_entrance", map);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.activity.EffectMobileTemplateEditActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment LJJJI = getSupportFragmentManager().LJJJI(R.id.dm4);
        if (LJJJI != null) {
            LJJJI.onActivityResult(i, i, intent);
        }
    }
}
