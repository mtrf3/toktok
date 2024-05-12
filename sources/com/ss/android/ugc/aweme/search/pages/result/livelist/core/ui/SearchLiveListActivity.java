package com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui;

import X.ActivityC86117Xqz;
import X.C1B3;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C49444Jaq;
import X.C49814Jgo;
import X.C50948Jz6;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C78840Uwu;
import X.GEN;
import X.InterfaceC49765Jg1;
import X.InterfaceC49816Jgq;
import X.JTO;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.livelist.core.viewmodel.SearchLiveListEnterParamViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchLiveListActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJI = 0;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 281));

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity", "onWindowFocusChanged", true);
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
        Serializable serializableExtra;
        Serializable serializableExtra2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity", "onCreate", true);
        activityConfiguration(GEN.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.ceo);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l9j);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.ug);
        o.LJIIIIZZ(string, "getString(R.string.SeemorepageName)");
        C78840Uwu.LJJIL(c235119Kp, string, this);
        c252709vu.setNavActions(c235119Kp);
        Intent intent = getIntent();
        if (intent != null && (serializableExtra = intent.getSerializableExtra("param_live_enter")) != null && (serializableExtra instanceof C49444Jaq)) {
            InterfaceC49816Jgq interfaceC49816Jgq = (InterfaceC49816Jgq) this.LJLIL.getValue();
            C49444Jaq c49444Jaq = (C49444Jaq) serializableExtra;
            String searchKeyword = c49444Jaq.getSearchKeyword();
            String str = "";
            if (searchKeyword == null) {
                searchKeyword = "";
            }
            interfaceC49816Jgq.LIZ(new C49814Jgo(searchKeyword, 2));
            SearchLiveListEnterParamViewModel searchLiveListEnterParamViewModel = (SearchLiveListEnterParamViewModel) ViewModelProviders.of(this).get(SearchLiveListEnterParamViewModel.class);
            searchLiveListEnterParamViewModel.getClass();
            searchLiveListEnterParamViewModel.LJLIL = c49444Jaq;
            Intent intent2 = getIntent();
            if (intent2 != null && (serializableExtra2 = intent2.getSerializableExtra("param_search_enter")) != null) {
                if (serializableExtra2 instanceof C50948Jz6) {
                    JTO.LIZ(this).jv0(this, (C50948Jz6) serializableExtra2);
                }
                SearchLiveFragment searchLiveFragment = new SearchLiveFragment();
                SearchResultParam searchResultParam = new SearchResultParam();
                searchResultParam.setKeyword(((InterfaceC49765Jg1) this.LJLIL.getValue()).getKeyword().LJLIL);
                searchResultParam.setEnterMethod(c49444Jaq.getEnterMethod());
                String fromSearchSubtag = c49444Jaq.getFromSearchSubtag();
                if (fromSearchSubtag == null) {
                    fromSearchSubtag = "";
                }
                searchResultParam.setFromSearchSubtag(fromSearchSubtag);
                String preSearchId = c49444Jaq.getPreSearchId();
                if (preSearchId != null) {
                    str = preSearchId;
                }
                searchResultParam.setPreSearchId(str);
                o.LJIIIIZZ(searchResultParam, "SearchResultParam()\n    …rParam.preSearchId ?: \"\")");
                searchLiveFragment.LJLLILLLL = searchResultParam;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIJ(searchLiveFragment, "container", R.id.dm7);
                c1b3.LJI();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity", "onCreate", false);
    }
}
