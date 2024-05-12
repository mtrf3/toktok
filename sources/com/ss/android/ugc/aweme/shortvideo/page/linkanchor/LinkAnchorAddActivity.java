package com.ss.android.ugc.aweme.shortvideo.page.linkanchor;

import X.ActivityC86117Xqz;
import X.C119244m8;
import X.C16880lQ;
import X.C221108m2;
import X.C239019Zp;
import X.C62822Ol8;
import X.C65803Ps7;
import Y.ACListenerS24S0100000_4;
import Y.AObserverS72S0100000_4;
import Y.IDCListenerS373S0100000_4;
import Y.IDObjectS177S0100000_4;
import Y.IDTListenerS114S0100000_4;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public final class LinkAnchorAddActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJJI = 0;
    public KeyListener LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 824));

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final LinkAnchorViewModel LLFII() {
        return (LinkAnchorViewModel) this.LJLILLLLZI.getValue();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onCreate", true);
        activityConfiguration(C239019Zp.LJLIL);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.dl);
        LLFII().LJLILLLLZI.observe(this, new AObserverS72S0100000_4(this, 26));
        ((TextView) _$_findCachedViewById(R.id.a2z)).addTextChangedListener(new IDObjectS177S0100000_4(this, 14));
        _$_findCachedViewById(R.id.a2z).setOnFocusChangeListener(new IDCListenerS373S0100000_4(this, 4));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.h0t), new ACListenerS24S0100000_4(this, 217));
        C16880lQ.LJJJIL((C119244m8) _$_findCachedViewById(R.id.a32), new ACListenerS24S0100000_4(this, 218));
        _$_findCachedViewById(R.id.h0s).setOnTouchListener(new IDTListenerS114S0100000_4(this, 10));
        LLFII().LJLJI.observe(this, new AObserverS72S0100000_4(this, 27));
        LLFII().LJLJJI.observe(this, new AObserverS72S0100000_4(this, 28));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorAddActivity", "onCreate", false);
    }
}
