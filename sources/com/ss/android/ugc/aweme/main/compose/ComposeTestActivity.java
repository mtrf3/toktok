package com.ss.android.ugc.aweme.main.compose;

import X.ActivityC86117Xqz;
import X.C10A;
import X.C15990jz;
import X.C40431iJ;
import X.C65803Ps7;
import X.V7L;
import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ComposeTestActivity extends ActivityC86117Xqz {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.compose.ComposeTestActivity", "onWindowFocusChanged", true);
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
        ComposeView composeView;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.compose.ComposeTestActivity", "onCreate", true);
        super.onCreate(bundle);
        C40431iJ content = V7L.LIZIZ;
        o.LJIIIZ(content, "content");
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        if ((childAt instanceof ComposeView) && (composeView = (ComposeView) childAt) != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(content);
        } else {
            ComposeView composeView2 = new ComposeView(this, null, 6);
            composeView2.setParentCompositionContext(null);
            composeView2.setContent(content);
            View decorView = getWindow().getDecorView();
            o.LJIIIIZZ(decorView, "window.decorView");
            if (ViewTreeLifecycleOwner.get(decorView) == null) {
                ViewTreeLifecycleOwner.set(decorView, this);
            }
            if (ViewTreeViewModelStoreOwner.get(decorView) == null) {
                ViewTreeViewModelStoreOwner.set(decorView, this);
            }
            if (C10A.LIZ(decorView) == null) {
                C10A.LIZIZ(decorView, this);
            }
            setContentView(composeView2, C15990jz.LIZ);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.compose.ComposeTestActivity", "onCreate", false);
    }
}
