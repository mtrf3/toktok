package com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C49460Jb6;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C78840Uwu;
import X.InterfaceC191547fS;
import X.K3G;
import Y.AObserverS76S0100000_8;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.viewmodel.SearchEffectListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchEffectListActivity extends ActivityC86117Xqz implements InterfaceC191547fS {
    public View LJLILLLLZI;
    public String LJLJI;
    public String LJLJJL;
    public final K3G LJLJJLL;
    public String LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 280));
    public String LJLJJI = "tiktok_effects";

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public SearchEffectListActivity() {
        K3G k3g = new K3G();
        k3g.setLoadMoreListener(this);
        this.LJLJJLL = k3g;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        String str = this.LJLJI;
        if (str != null) {
            ((SearchEffectListViewModel) this.LJLIL.getValue()).gv0(str, this.LJLJJI, this.LJLJJLL.getBasicItemCount(), this.LJLJL, null);
            this.LJLJJLL.showLoadMoreLoading();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.cep);
        getIntent().getIntExtra("type", 0);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "alasrc");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "tiktok_effects";
        }
        this.LJLJJI = LLJJIJIIJIL;
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "title");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = getString(R.string.qcg);
        }
        this.LJLJJL = LLJJIJIIJIL2;
        this.LJLJI = C16880lQ.LLJJIJIIJIL(getIntent(), "keyword");
        this.LJLJL = C16880lQ.LLJJIJIIJIL(getIntent(), "search_id");
        String str = this.LJLJI;
        if (str != null) {
            ((SearchEffectListViewModel) this.LJLIL.getValue()).gv0(str, this.LJLJJI, this.LJLJJLL.getBasicItemCount(), this.LJLJL, new C49460Jb6(this, SystemClock.elapsedRealtime()));
        }
        ((SearchEffectListViewModel) this.LJLIL.getValue()).LJLIL.observe(this, new AObserverS76S0100000_8(this, 53));
        View findViewById = findViewById(R.id.l_2);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.title_bar)");
        C252709vu c252709vu = (C252709vu) findViewById;
        C235119Kp c235119Kp = new C235119Kp();
        String str2 = this.LJLJJL;
        if (str2 == null) {
            str2 = "";
        }
        C78840Uwu.LJJIZ(c235119Kp, str2, new AqS158S0100000_8(this, 606));
        c252709vu.setNavActions(c235119Kp);
        View findViewById2 = findViewById(R.id.ftq);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.list)");
        ((RecyclerView) findViewById2).setAdapter(this.LJLJJLL);
        View findViewById3 = findViewById(R.id.cfe);
        o.LJII(findViewById3, "null cannot be cast to non-null type android.view.ViewStub");
        View inflate = ((ViewStub) findViewById3).inflate();
        o.LJIIIIZZ(inflate, "findViewById<View>(R.id.…b) as ViewStub).inflate()");
        this.LJLILLLLZI = inflate;
        inflate.setVisibility(0);
        this.LJLJJLL.setLoadEmptyText("");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity", "onCreate", false);
    }
}
