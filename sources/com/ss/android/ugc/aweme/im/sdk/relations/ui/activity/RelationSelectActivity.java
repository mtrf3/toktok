package com.ss.android.ugc.aweme.im.sdk.relations.ui.activity;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C65803Ps7;
import X.GD2;
import X.InterfaceC27853AwT;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.fragment.RelationSelectFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RelationSelectActivity extends ActivityC86117Xqz implements InterfaceC27853AwT {
    public static final /* synthetic */ int LJLJI = 0;
    public Fragment LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

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

    @Override // X.InterfaceC27853AwT
    public final String getPageName() {
        return "contact_list";
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if ((r2 - r1.bottom) != 0) goto L31;
     */
    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackPressed() {
        /*
            r5 = this;
            androidx.fragment.app.Fragment r4 = r5.LJLIL
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.sdk.relations.ui.fragment.RelationSelectFragment
            if (r0 == 0) goto L28
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.ui.fragment.RelationSelectFragment"
            kotlin.jvm.internal.o.LJII(r4, r0)
            com.ss.android.ugc.aweme.im.sdk.relations.ui.fragment.RelationSelectFragment r4 = (com.ss.android.ugc.aweme.im.sdk.relations.ui.fragment.RelationSelectFragment) r4
            X.3lJ r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L64
            X.1qj r0 = r4.mo49getActivity()
            r3 = 1
            if (r0 != 0) goto L2f
        L18:
            X.3lJ r1 = r4.LJLILLLLZI
            kotlin.jvm.internal.o.LJI(r1)
            X.3ld r0 = r1.LJLLJ
            if (r0 == 0) goto L29
            boolean r0 = r0.LJLJJI
            if (r0 != r3) goto L29
            r1.LJIIIZ()
        L28:
            return
        L29:
            android.app.Activity r0 = r1.LJLIL
            r0.finish()
            goto L28
        L2f:
            X.1qj r0 = r4.mo49getActivity()
            if (r0 == 0) goto L68
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L68
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L68
            int r2 = r0.getHeight()
        L45:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            X.1qj r0 = r4.mo49getActivity()
            if (r0 == 0) goto L5f
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5f
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L5f
            r0.getWindowVisibleDisplayFrame(r1)
        L5f:
            int r0 = r1.bottom
            int r2 = r2 - r0
            if (r2 == 0) goto L18
        L64:
            super.onBackPressed()
            goto L28
        L68:
            r2 = 0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity.onBackPressed():void");
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onCreate", true);
        activityConfiguration(GD2.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.b0h);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        Fragment LJJJIL = supportFragmentManager.LJJJIL("relation_fragment_tag");
        this.LJLIL = LJJJIL;
        if (LJJJIL == null) {
            RelationSelectFragment relationSelectFragment = new RelationSelectFragment();
            this.LJLIL = relationSelectFragment;
            relationSelectFragment.setArguments(C16880lQ.LLJJIJI(getIntent()));
        }
        Fragment fragment = this.LJLIL;
        o.LJI(fragment);
        c1b3.LJIIJ(fragment, "relation_fragment_tag", R.id.de6);
        c1b3.LJI();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.LJLIL;
        if (fragment != null) {
            o.LJI(fragment);
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
