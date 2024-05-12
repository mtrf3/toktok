package com.ss.android.ugc.aweme.mvtemplate.view;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C41198GEw;
import X.C42397GkT;
import X.C65803Ps7;
import X.InterfaceC45040Hm0;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MovieDetailActivity extends ActivityC86117Xqz implements InterfaceC45040Hm0 {
    public int LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public String LJLIL = "";
    public int LJLILLLLZI = 1;
    public String LJLJI = "";
    public String LJLJJI = "";
    public String LJLJJL = "";

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            j = CastLongProtector.parseLong(this.LJLIL);
            try {
                j2 = CastLongProtector.parseLong(this.LJLJJL);
            } catch (Exception e) {
                e = e;
                C16880lQ.LLLLIIL(e);
                Analysis analysis = new Analysis();
                analysis.setLabelName("mv_page");
                analysis.setExt_value(j);
                analysis.setValue(j2);
                o.LJIIIIZZ(analysis, "Analysis().setLabelName(…t_value(id).setValue(aid)");
                return analysis;
            }
        } catch (Exception e2) {
            e = e2;
            j = 0;
        }
        Analysis analysis2 = new Analysis();
        analysis2.setLabelName("mv_page");
        analysis2.setExt_value(j);
        analysis2.setValue(j2);
        o.LJIIIIZZ(analysis2, "Analysis().setLabelName(…t_value(id).setValue(aid)");
        return analysis2;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onCreate", true);
        activityConfiguration(C41198GEw.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.ep);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "mv_id");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        this.LJLIL = LLJJIJIIJIL;
        this.LJLILLLLZI = getIntent().getIntExtra("source_id", 1);
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_method");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        this.LJLJJI = LLJJIJIIJIL2;
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "";
        }
        this.LJLJI = LLJJIJIIJIL3;
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "group_id");
        if (LLJJIJIIJIL4 != null) {
            str = LLJJIJIIJIL4;
        }
        this.LJLJJL = str;
        this.LJLJJLL = getIntent().getIntExtra("type", 0);
        this.LJLJL = getIntent().getBooleanExtra("enter_record_from_feed", false);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        Fragment LJJJIL = supportFragmentManager.LJJJIL("movie_detail_fragment_tag");
        if (LJJJIL == null) {
            String mvId = this.LJLIL;
            String enterFrom = this.LJLJI;
            String groupId = this.LJLJJL;
            String enterMethod = this.LJLJJI;
            int i = this.LJLJJLL;
            int i2 = this.LJLILLLLZI;
            boolean z = this.LJLJL;
            o.LJIIIZ(mvId, "mvId");
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(groupId, "groupId");
            o.LJIIIZ(enterMethod, "enterMethod");
            LJJJIL = new MovieDetailFragment();
            Bundle bundle2 = new Bundle(3);
            bundle2.putString("mv_id", mvId);
            bundle2.putString("enter_from", enterFrom);
            bundle2.putString("enter_method", enterMethod);
            bundle2.putString("group_id", groupId);
            bundle2.putInt("type", i);
            bundle2.putInt("source_id", i2);
            bundle2.putBoolean("enter_record_from_feed", z);
            LJJJIL.setArguments(bundle2);
        }
        LJJJIL.setUserVisibleHint(true);
        c1b3.LJIIJ(LJJJIL, "movie_detail_fragment_tag", R.id.bs8);
        c1b3.LJIILJJIL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AVExternalServiceImpl.LIZ().asyncService(this, "movie_detail", new C42397GkT(this, i, i2, intent));
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
