package com.ss.android.ugc.aweme.trending.ui;

import X.C16880lQ;
import X.C65803Ps7;
import X.C78685UuP;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendingDetailActivity extends DetailActivity {
    public final Map<Integer, View> LLFII = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
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

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (getIntent().getBooleanExtra("show_billboard", false) != false) goto L12;
     */
    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.detail.ui.DetailFragment LLFII(X.M89 r5) {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            android.os.Bundle r3 = X.C16880lQ.LLJJIJI(r0)
            if (r3 != 0) goto Lf
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        Lf:
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.FEED_TYPE"
            r0 = 71
            r3.putInt(r1, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "trending_entrance"
            java.lang.String r0 = X.C16880lQ.LLJJIJIIJIL(r0, r1)
            r3.putString(r1, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r2 = "show_billboard"
            java.lang.String r1 = X.C16880lQ.LLJJIJIIJIL(r0, r2)
            if (r1 == 0) goto L5f
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
        L3a:
            java.lang.String r0 = "true"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L4d
            android.content.Intent r0 = r4.getIntent()
            r1 = 0
            boolean r0 = r0.getBooleanExtra(r2, r1)
            if (r0 == 0) goto L4e
        L4d:
            r1 = 1
        L4e:
            r3.putBoolean(r2, r1)
            java.lang.String r0 = "feed_param"
            r3.putSerializable(r0, r5)
            com.ss.android.ugc.aweme.trending.ui.TrendingDetailFragment r0 = new com.ss.android.ugc.aweme.trending.ui.TrendingDetailFragment
            r0.<init>()
            r0.setArguments(r3)
            return r0
        L5f:
            r1 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity.LLFII(X.M89):com.ss.android.ugc.aweme.detail.ui.DetailFragment");
    }

    @Override // com.ss.android.ugc.aweme.detail.ui.DetailActivity, X.YUC, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String LLJJIJIIJIL;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onCreate", true);
        if (o.LJ(C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from"), "homepage_hot") || (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from")) == null || LLJJIJIIJIL.length() == 0) {
            str = "trending_inflow_page";
        } else if (C78685UuP.LJJJZ(C16880lQ.LLJJIJIIJIL(getIntent(), "is_from_trending_card"))) {
            str = "general_search";
        } else {
            str = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        }
        getIntent().putExtra("refer", str);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onCreate", false);
    }
}
