package com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.activity;

import X.ActivityC86117Xqz;
import X.C1B3;
import X.C1B6;
import X.C65803Ps7;
import X.GC6;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.fragment.FilterVideoKeywordsListFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FilterVideoKeywordsActivity extends ActivityC86117Xqz {
    public FilterVideoKeywordsListFragment LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.activity.FilterVideoKeywordsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.activity.FilterVideoKeywordsActivity", "onCreate", true);
        activityConfiguration(GC6.LJLIL);
        getWindow().setSoftInputMode(32);
        super.onCreate(bundle);
        setContentView(R.layout.afr);
        FilterVideoKeywordsListFragment filterVideoKeywordsListFragment = (FilterVideoKeywordsListFragment) getSupportFragmentManager().LJJJIL("filter_keywords_list_fragment");
        this.LJLIL = filterVideoKeywordsListFragment;
        if (filterVideoKeywordsListFragment == null) {
            this.LJLIL = new FilterVideoKeywordsListFragment();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            FilterVideoKeywordsListFragment filterVideoKeywordsListFragment2 = this.LJLIL;
            o.LJI(filterVideoKeywordsListFragment2);
            LIZ.LJIIIIZZ(R.id.dm7, 1, filterVideoKeywordsListFragment2, "filter_keywords_list_fragment");
            LIZ.LJI();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.activity.FilterVideoKeywordsActivity", "onCreate", false);
    }
}
