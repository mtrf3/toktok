package com.ss.android.ugc.aweme.geofencing.ui;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C170736mz;
import X.C41090GAs;
import X.C43212Gxc;
import X.C61878OQg;
import X.C65803Ps7;
import X.C73318Sq2;
import X.C79004UzY;
import X.GAX;
import X.GBO;
import X.GGS;
import X.ORZ;
import Y.ACListenerS27S0100000_7;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GeoFencingStatusActivity extends GBO {
    public static final /* synthetic */ int LJLJJL = 0;
    public GAX LJLJI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        GGS.LIZ.getClass();
        return GGS.LIZJ;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        GAX gax = this.LJLJI;
        if (gax != null) {
            LLIIIILZ(gax.getCurrentList());
        } else {
            o.LJIJI("regionDeleteAdapter");
            throw null;
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        ((C73318Sq2) C41090GAs.LIZIZ.getValue()).LIZLLL();
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

    public final void LLIIIILZ(List<TranslatedRegion> list) {
        if (getIntent().getBooleanExtra("extra.read_only", false)) {
            finish();
            return;
        }
        Intent intent = new Intent();
        C79004UzY.LJJJJI(intent, list);
        setResult(-1, intent);
        finish();
    }

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ee);
        List LJIJJ = C79004UzY.LJIJJ(getIntent());
        if (LJIJJ == null) {
            LJIJJ = C61878OQg.INSTANCE;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("extra.read_only", false);
        if (booleanExtra) {
            ((TextView) _$_findCachedViewById(R.id.dr5)).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, this));
            ((TextView) _$_findCachedViewById(R.id.dr5)).setText(R.string.s3z);
            ((TextView) _$_findCachedViewById(R.id.dr7)).setText(R.string.s3r);
        } else {
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.dr5), new ACListenerS27S0100000_7(this, 186));
        }
        this.LJLJI = new GAX(this, LJIJJ, booleanExtra);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.drh);
        GAX gax = this.LJLJI;
        if (gax != null) {
            recyclerView.setAdapter(gax);
            recyclerView.setLayoutManager(new LinearLayoutManager());
            C16880lQ.LJJJZ((C170736mz) _$_findCachedViewById(R.id.drj), new ACListenerS27S0100000_7(this, 187));
            C41090GAs.LIZJ(null, null);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onCreate", false);
            return;
        }
        o.LJIJI("regionDeleteAdapter");
        throw null;
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        List LJIJJ;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null || (LJIJJ = C79004UzY.LJIJJ(intent)) == null) {
            return;
        }
        GAX gax = this.LJLJI;
        if (gax != null) {
            gax.LJLJI = ORZ.LLJILJILJ(LJIJJ);
            gax.notifyDataSetChanged();
        } else {
            o.LJIJI("regionDeleteAdapter");
            throw null;
        }
    }
}
