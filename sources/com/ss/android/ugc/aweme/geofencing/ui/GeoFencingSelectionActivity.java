package com.ss.android.ugc.aweme.geofencing.ui;

import X.C16880lQ;
import X.C221108m2;
import X.C26227ARb;
import X.C41085GAn;
import X.C41090GAs;
import X.C41094GAw;
import X.C43212Gxc;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C73305Spp;
import X.C73318Sq2;
import X.C79004UzY;
import X.GBO;
import X.GGS;
import X.T3D;
import X.UC0;
import Y.ACListenerS27S0100000_7;
import Y.AfS59S0100000_7;
import Y.IDObjectS179S0100000_7;
import Y.IDhS100S0100000_7;
import Y.IDrS46S0100000_7;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GeoFencingSelectionActivity extends GBO {
    public static final /* synthetic */ int LJLLI = 0;
    public C41085GAn LJLJI;
    public List<TranslatedRegion> LJLJJL;
    public C73305Spp LJLJJLL;
    public View LJLJL;
    public boolean LJLJLJ;
    public T3D LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C41094GAw.LJLIL);

    public final void LLIIIILZ() {
        C41090GAs.LIZ(new AqS173S0100000_7(this, 63), new AqS173S0100000_7(this, 64));
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LJII() {
        View view = this.LJLJL;
        if (view != null) {
            view.setVisibility(8);
        }
        _$_findCachedViewById(R.id.dra).setVisibility(8);
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LJLJJLL;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        GGS.LIZ.getClass();
        return GGS.LIZJ;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C41085GAn c41085GAn = this.LJLJI;
        if (c41085GAn != null) {
            c41085GAn.LJLLLLLL();
            List<TranslatedRegion> list = this.LJLJJL;
            if (list != null) {
                if (!list.isEmpty()) {
                    List<TranslatedRegion> list2 = this.LJLJJL;
                    if (list2 != null) {
                        Intent intent = new Intent();
                        C79004UzY.LJJJJI(intent, list2);
                        setResult(-1, intent);
                        finish();
                        return;
                    }
                    o.LJIJI("initialState");
                    throw null;
                }
                C26227ARb c26227ARb = new C26227ARb(this);
                c26227ARb.LJ(R.string.s3q);
                c26227ARb.LIZ(R.string.s3p);
                UC0.LIZJ(c26227ARb, new AqS173S0100000_7(this, 65));
                c26227ARb.LJI().LIZLLL();
                return;
            }
            o.LJIJI("initialState");
            throw null;
        }
        o.LJIJI("regionAdapter");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        ((C73318Sq2) this.LJLJJI.getValue()).dispose();
        T3D t3d = this.LJLJLLL;
        if (t3d != null) {
            t3d.LIZIZ();
        }
        this.LJLJLLL = null;
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
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ed);
        this.LJLJJLL = (C73305Spp) findViewById(R.id.kf_);
        this.LJLJL = findViewById(R.id.dre);
        LJII();
        List<TranslatedRegion> LJIJJ = C79004UzY.LJIJJ(getIntent());
        if (LJIJJ == null) {
            LJIJJ = C61878OQg.INSTANCE;
        }
        this.LJLJJL = LJIJJ;
        Iterator<TranslatedRegion> it = LJIJJ.iterator();
        while (it.hasNext()) {
            it.next().setSelected(true);
        }
        this.LJLJI = new C41085GAn(C61878OQg.INSTANCE, LJIJJ);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.dra);
        C41085GAn c41085GAn = this.LJLJI;
        if (c41085GAn != null) {
            recyclerView.setAdapter(c41085GAn);
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.LJIIJJI(new IDrS46S0100000_7(this, 5));
            C73318Sq2 c73318Sq2 = (C73318Sq2) this.LJLJJI.getValue();
            C41085GAn c41085GAn2 = this.LJLJI;
            if (c41085GAn2 != null) {
                c73318Sq2.LIZ(c41085GAn2.LJLJI.LJJIJL(new IDhS100S0100000_7(c41085GAn2, 8)).LJJJJZI(new AfS59S0100000_7(this, 82)));
                ((TextView) _$_findCachedViewById(R.id.drf)).addTextChangedListener(new IDObjectS179S0100000_7(this, 5));
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.drd), new ACListenerS27S0100000_7(this, 180));
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.dr6), new ACListenerS27S0100000_7(this, 181));
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.drc), new ACListenerS27S0100000_7(this, 182));
                LLIIIILZ();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onCreate", false);
                return;
            }
            o.LJIJI("regionAdapter");
            throw null;
        }
        o.LJIJI("regionAdapter");
        throw null;
    }
}
