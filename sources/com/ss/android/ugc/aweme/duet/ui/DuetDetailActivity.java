package com.ss.android.ugc.aweme.duet.ui;

import X.ActivityC86117Xqz;
import X.AnonymousClass036;
import X.C16880lQ;
import X.C188727au;
import X.C1B3;
import X.C65803Ps7;
import X.FMX;
import X.GCQ;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DuetDetailActivity extends ActivityC86117Xqz {
    public HashMap<String, String> LJLJL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public String LJLIL = "";
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public String LJLJJI = "";
    public String LJLJJL = "";
    public String LJLJJLL = "";
    public final long LJLJLJ = System.currentTimeMillis();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        C188727au c188727au = new C188727au();
        c188727au.LJ(System.currentTimeMillis() - this.LJLJLJ, "duration");
        c188727au.LJII(this.LJLJL);
        FMX.LJIIL("anchor_stay_time", c188727au.LIZ);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onCreate", true);
        activityConfiguration(GCQ.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.cqq);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_method");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        this.LJLILLLLZI = LLJJIJIIJIL;
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        this.LJLIL = LLJJIJIIJIL2;
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "id");
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "";
        }
        this.LJLJI = LLJJIJIIJIL3;
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "origin_item_id");
        if (LLJJIJIIJIL4 == null) {
            LLJJIJIIJIL4 = "";
        }
        this.LJLJJI = LLJJIJIIJIL4;
        String LLJJIJIIJIL5 = C16880lQ.LLJJIJIIJIL(getIntent(), "author_id");
        if (LLJJIJIIJIL5 == null) {
            LLJJIJIIJIL5 = "";
        }
        this.LJLJJL = LLJJIJIIJIL5;
        String LLJJIJIIJIL6 = C16880lQ.LLJJIJIIJIL(getIntent(), "group_id");
        if (LLJJIJIIJIL6 != null) {
            str = LLJJIJIIJIL6;
        }
        this.LJLJJLL = str;
        if (getIntent().getSerializableExtra("anchor_event_map") instanceof HashMap) {
            this.LJLJL = (HashMap) getIntent().getSerializableExtra("anchor_event_map");
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        Fragment LJJJIL = supportFragmentManager.LJJJIL("duet_detail_fragment_tag");
        if (LJJJIL == null) {
            String groupId = this.LJLJI;
            String hostAid = this.LJLJJI;
            String enterFrom = this.LJLIL;
            String enterMethod = this.LJLILLLLZI;
            String str2 = this.LJLJJL;
            String str3 = this.LJLJJLL;
            o.LJIIIZ(groupId, "groupId");
            o.LJIIIZ(hostAid, "hostAid");
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(enterMethod, "enterMethod");
            LJJJIL = new DuetDetailFragment();
            Bundle LIZJ = AnonymousClass036.LIZJ("origin_item_id", hostAid, "enter_from", enterFrom);
            LIZJ.putString("enter_method", enterMethod);
            LIZJ.putString("id", groupId);
            LIZJ.putString("author_id", str2);
            LIZJ.putString("from_group_id", str3);
            LIZJ.putString("detail_aweme_from", enterFrom);
            LJJJIL.setArguments(LIZJ);
        }
        LJJJIL.setUserVisibleHint(true);
        c1b3.LJIIJ(LJJJIL, "duet_detail_fragment_tag", R.id.bs8);
        c1b3.LJIILJJIL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onCreate", false);
    }
}
