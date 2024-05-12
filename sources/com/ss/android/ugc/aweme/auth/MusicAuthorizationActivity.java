package com.ss.android.ugc.aweme.auth;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C201037ul;
import X.C243919hj;
import X.C63081OpJ;
import X.C65803Ps7;
import X.C73305Spp;
import X.C73411SrX;
import X.C73969T1h;
import X.T16;
import Y.ACListenerS24S0100000_4;
import Y.AfS19S1100000_4;
import Y.AfS56S0100000_4;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.auth.MusicAuthorizationApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class MusicAuthorizationActivity extends ActivityC86117Xqz {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public C73411SrX LJLJJI;
    public C73305Spp LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.auth.MusicAuthorizationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        C201037ul.LIZ(2, this, false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C73411SrX c73411SrX = this.LJLJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.auth.MusicAuthorizationActivity", "onCreate", true);
        activityConfiguration(C243919hj.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.eq);
        this.LJLJJL = (C73305Spp) findViewById(R.id.kf_);
        _$_findCachedViewById(R.id.kej).getLayoutParams().height = C63081OpJ.LJJJJLI(this);
        C201037ul.LIZ(2, this, true);
        this.LJLIL = C16880lQ.LLJJIJIIJIL(getIntent(), "code");
        this.LJLILLLLZI = C16880lQ.LLJJIJIIJIL(getIntent(), "sec_uid");
        this.LJLJI = C16880lQ.LLJJIJIIJIL(getIntent(), "url");
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.eys), new ACListenerS24S0100000_4(this, 21));
        String str = this.LJLIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.LJLILLLLZI;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LJLJI;
        if (str4 != null) {
            str2 = str4;
        }
        if (str.length() == 0 || str3.length() == 0) {
            finish();
        } else {
            C73305Spp c73305Spp = this.LJLJJL;
            if (c73305Spp != null) {
                c73305Spp.LJFF();
            }
            C73305Spp c73305Spp2 = this.LJLJJL;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
            }
            this.LJLJJI = (C73411SrX) ((MusicAuthorizationApi.MusicAuthorizationOperatorApi) MusicAuthorizationApi.LIZ.getValue()).authMusic(str, str3).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS19S1100000_4(this, str2, 7), new AfS56S0100000_4(this, 164));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.auth.MusicAuthorizationActivity", "onCreate", false);
    }
}
