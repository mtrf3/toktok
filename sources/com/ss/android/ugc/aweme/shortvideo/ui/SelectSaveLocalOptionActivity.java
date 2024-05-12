package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AbstractC234519Ih;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C41076GAe;
import X.C41080GAi;
import X.C43212Gxc;
import X.C44674Hg6;
import X.C47261Igj;
import X.C65803Ps7;
import X.C9KF;
import X.GBO;
import X.GGS;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SelectSaveLocalOptionActivity extends GBO {
    public static VideoPublishEditModel LJLJJL;
    public static final List<Integer> LJLJJLL = C47261Igj.LJJIJIL(Integer.valueOf(R.string.j8d), Integer.valueOf(R.string.chs), Integer.valueOf(R.string.chr));
    public C252709vu LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        GGS.LIZ.getClass();
        return GGS.LIZJ;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        if (!C44674Hg6.LIZ()) {
            overridePendingTransition(R.anim.n, R.anim.m);
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

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onCreate", true);
        super.onCreate(bundle);
        getIntent().getBooleanExtra("mute_download", false);
        getIntent().getBooleanExtra("download_gray_tag", false);
        setContentView(R.layout.blp);
        View findViewById = findViewById(R.id.l_2);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.title_bar)");
        this.LJLJI = (C252709vu) findViewById;
        View findViewById2 = findViewById(R.id.j9c);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.rv)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(new C41076GAe(LJLJJLL, getIntent().getIntExtra("extra_save_option", 0), this, new C41080GAi(this)));
        C252709vu c252709vu = this.LJLJI;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
            C234529Ii c234529Ii = new C234529Ii();
            if (C44674Hg6.LIZ()) {
                i = R.raw.icon_x_mark;
            } else {
                i = R.raw.icon_arrow_left_ltr;
            }
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = i;
            c234529Ii.LIZIZ(new AqS157S0100000_7(this, 295));
            abstractC234519IhArr[0] = c234529Ii;
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, abstractC234519IhArr);
            String string = getString(R.string.q9l);
            o.LJIIIIZZ(string, "getString(R.string.save_to_album)");
            LIZLLL.LIZJ = string;
            c235119Kp.LIZJ = LIZLLL;
            c235119Kp.LIZLLL = true;
            c252709vu.setNavActions(c235119Kp);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onCreate", false);
            return;
        }
        o.LJIJI("mTitleBar");
        throw null;
    }
}
