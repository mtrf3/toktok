package com.ss.android.ugc.aweme.music.search;

import X.C16880lQ;
import X.C1B3;
import X.C239339aL;
import X.C239349aM;
import X.C65803Ps7;
import X.YUN;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchMusicActivity extends YUN {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        KeyboardUtils.LIZIZ(findViewById(R.id.czx));
        Serializable serializableExtra = getIntent().getSerializableExtra("pinned_music_list");
        Intent intent = new Intent();
        intent.putExtra("pinned_music_list", serializableExtra);
        setResult(-1, intent);
        super.finish();
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

    @Override // X.YUN, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onCreate", true);
        activityConfiguration(C239339aL.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.c2v);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        C239349aM c239349aM = SearchMusicFragment.LJLILLLLZI;
        Intent intent = getIntent();
        c239349aM.getClass();
        o.LJIIIZ(intent, "intent");
        SearchMusicFragment searchMusicFragment = new SearchMusicFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_me", intent.getBooleanExtra("is_me", false));
        bundle2.putString("user_id", C16880lQ.LLJJIJIIJIL(intent, "user_id"));
        bundle2.putString("sec_user_id", C16880lQ.LLJJIJIIJIL(intent, "sec_user_id"));
        bundle2.putString("previous_page", C16880lQ.LLJJIJIIJIL(intent, "previous_page"));
        bundle2.putSerializable("pinned_music_list", intent.getSerializableExtra("pinned_music_list"));
        searchMusicFragment.setArguments(bundle2);
        c1b3.LJIIJ(searchMusicFragment, null, R.id.dgg);
        c1b3.LJIILJJIL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.search.SearchMusicActivity", "onCreate", false);
    }
}
