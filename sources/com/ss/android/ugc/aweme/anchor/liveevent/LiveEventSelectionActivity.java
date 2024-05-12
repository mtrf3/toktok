package com.ss.android.ugc.aweme.anchor.liveevent;

import X.C04330Ez;
import X.C1B3;
import X.C1B6;
import X.C31413CUn;
import X.C61878OQg;
import X.C65803Ps7;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.anchor.AnchorBaseActivity;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.liveevent.LiveEventSelectionFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LiveEventSelectionActivity extends AnchorBaseActivity {
    public LiveEventSelectionFragment LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.ActivityC86117Xqz, X.KMV
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

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.liveevent.LiveEventSelectionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity
    public final void LLFII() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        if (this.LJLJL == null) {
            this.LJLJL = new LiveEventSelectionFragment();
        }
        LiveEventSelectionFragment liveEventSelectionFragment = this.LJLJL;
        if (liveEventSelectionFragment != null) {
            LIZ.LJIIIIZZ(R.id.dm2, 1, liveEventSelectionFragment, null);
            LIZ.LJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // com.ss.android.ugc.aweme.anchor.AnchorBaseActivity, X.InterfaceC42726Gpm
    public final void LJJJIL(LiveEventModule liveEventModule) {
        List list;
        LiveEventSelectionFragment liveEventSelectionFragment = this.LJLJL;
        if (liveEventSelectionFragment != null && liveEventModule != null) {
            liveEventSelectionFragment.LJLJJLL = liveEventModule;
            liveEventSelectionFragment._$_findCachedViewById(R.id.avw).setClickable(true);
            View _$_findCachedViewById = liveEventSelectionFragment._$_findCachedViewById(R.id.avw);
            Context context = liveEventSelectionFragment.getContext();
            o.LJI(context);
            _$_findCachedViewById.setBackground(new ColorDrawable(C04330Ez.LIZIZ(context, R.color.c7)));
            TextView textView = (TextView) liveEventSelectionFragment._$_findCachedViewById(R.id.avw);
            Context context2 = liveEventSelectionFragment.getContext();
            o.LJI(context2);
            textView.setTextColor(C04330Ez.LIZIZ(context2, R.color.bc));
            C31413CUn c31413CUn = liveEventSelectionFragment.LJLJL;
            if (c31413CUn == null || (list = c31413CUn.LJLIL) == null) {
                list = C61878OQg.INSTANCE;
            }
            for (Object obj : list) {
                if ((obj instanceof LiveEventModule) && !o.LJ(obj, liveEventModule)) {
                    LiveEventModule liveEventModule2 = (LiveEventModule) obj;
                    if (!ujb.o.LJJJJIZL(liveEventModule2.id, liveEventModule.id, true)) {
                        liveEventModule2.LIZ = false;
                    }
                }
            }
            C31413CUn c31413CUn2 = liveEventSelectionFragment.LJLJL;
            if (c31413CUn2 != null) {
                c31413CUn2.notifyDataSetChanged();
            }
        }
    }
}
