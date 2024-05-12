package com.ss.android.ugc.aweme.kids.discovery.detail;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C85040XZc;
import X.OB3;
import X.OB6;
import X.OB7;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DiscoveryFeedActivity extends OB3 {
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 249));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, LiveCoverMinSizeSetting.DEFAULT));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 251));

    @Override // X.OB3
    public final String LLIIIJ() {
        return "discovery_feed_fragment";
    }

    @Override // X.OB3, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.OB3, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.OB3, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.OB3, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.OB3, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.OB3
    public final String LLFII() {
        return (String) this.LJLJJI.getValue();
    }

    @Override // X.OB3
    public final OB7 LLIIIILZ() {
        return new C85040XZc((String) this.LJLJJI.getValue(), ((Boolean) this.LJLJJLL.getValue()).booleanValue());
    }

    @Override // X.OB3
    public final String LLFZ() {
        return C16880lQ.LLJJIJIIJIL(getIntent(), "current_id");
    }

    @Override // X.OB3
    public final String LLII() {
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "title");
        if (LLJJIJIIJIL == null) {
            return "";
        }
        return LLJJIJIIJIL;
    }

    @Override // X.OB3
    public final String getEnterFrom() {
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL == null) {
            return "";
        }
        return LLJJIJIIJIL;
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

    @Override // X.ActivityC45651qj, android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String name, Context context, AttributeSet attrs) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        View onCreateView = super.onCreateView(name, context, attrs);
        if (((Number) this.LJLJJL.getValue()).intValue() == 1) {
            OB6.LIZ = "category_id";
        } else if (((Number) this.LJLJJL.getValue()).intValue() == 0) {
            OB6.LIZ = "trending_content_id";
        }
        OB6.LIZIZ = (String) this.LJLJJI.getValue();
        return onCreateView;
    }
}
