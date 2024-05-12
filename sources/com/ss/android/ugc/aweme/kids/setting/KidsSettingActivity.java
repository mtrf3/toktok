package com.ss.android.ugc.aweme.kids.setting;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25917AFd;
import X.C25926AFm;
import X.C65803Ps7;
import X.C9KF;
import X.EF7;
import X.InterfaceC25921AFh;
import X.Q8U;
import Y.ACListenerS24S0100000_4;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class KidsSettingActivity extends ActivityC86117Xqz {
    public int LJLILLLLZI;
    public long LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C25917AFd LJLIL = new C25917AFd();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.ft, R.anim.g2);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onResume", true);
        super.onResume();
        C25917AFd c25917AFd = this.LJLIL;
        c25917AFd.getClass();
        c25917AFd.LIZ = this;
        List list = (List) c25917AFd.LIZIZ.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC25921AFh) obj).LJII()) {
                arrayList.add(obj);
            }
        }
        c25917AFd.LIZ(this, arrayList);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onResume", false);
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onCreate", true);
        activityConfiguration(C25926AFm.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bgs);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.dhz);
        o.LJIIIIZZ(string, "getString(R.string.com_setting_title)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 1133));
        c235119Kp.LIZLLL(LIZJ);
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
        String string2 = getString(R.string.quz);
        o.LJIIIIZZ(string2, "getString(R.string.setting_musically_version)");
        ((TextView) _$_findCachedViewById(R.id.n3b)).setText(Q8U.LIZIZ(new Object[]{EF7.LJII(), String.valueOf(EF7.LJI())}, 2, string2, "format(format, *args)").concat(""));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.n3b), new ACListenerS24S0100000_4(this, 253));
        this.LJLIL.LIZ(this, null);
        List<String> LIZ = KidsSettingsServiceImpl.LJIIJJI().LIZ();
        int childCount = ((ViewGroup) _$_findCachedViewById(R.id.g61)).getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((ViewGroup) _$_findCachedViewById(R.id.g61)).getChildAt(i);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof String) && !TextUtils.isEmpty((CharSequence) tag) && LIZ.contains(tag)) {
                    childAt.setVisibility(8);
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity", "onCreate", false);
    }
}
