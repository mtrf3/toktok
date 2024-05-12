package com.ss.android.ugc.aweme.mix.editname;

import X.C16880lQ;
import X.C65803Ps7;
import X.C8C5;
import X.C8C8;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ChangePlaylistNameActivity extends C8C5 {
    public long LJLJJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public String LJLJJL = "";

    @Override // X.C8C5, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // X.C8C5, X.ActivityC86117Xqz, X.KMV
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C8C5
    public final Fragment LLFII() {
        Intent intent = getIntent();
        if (intent != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "user_last_name");
            String str = "";
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            this.LJLILLLLZI = LLJJIJIIJIL;
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "mix_id");
            if (LLJJIJIIJIL2 == null) {
                LLJJIJIIJIL2 = "";
            }
            this.LJLJI = LLJJIJIIJIL2;
            this.LJLJJI = intent.getLongExtra("moderated_rename_timestamp", 0L);
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
            if (LLJJIJIIJIL3 != null) {
                str = LLJJIJIIJIL3;
            }
            this.LJLJJL = str;
        }
        return C8C8.LIZIZ(EditPlayListNameFragment.LJLJL, 2, this.LJLILLLLZI, this.LJLJI, null, Long.valueOf(this.LJLJJI), this.LJLJJL, 8);
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

    @Override // X.C8C5, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onCreate", false);
    }
}
