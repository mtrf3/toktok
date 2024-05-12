package com.ss.android.ugc.aweme.poi.uiwidget.gallery;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C58564Mye;
import X.C58565Myf;
import X.C58567Myh;
import X.C59954Nfy;
import X.C5H3;
import X.C61169NzZ;
import X.C65803Ps7;
import X.C81075Vrr;
import Y.ACListenerS32S0400000_10;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PoiGalleryActivity extends ActivityC86117Xqz {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public C81075Vrr LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public PoiGalleryActivity() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.requiredArg(this, C58564Mye.LJLIL, "poi_gallery_images", ArrayList.class);
        this.LJLILLLLZI = routeArgExtension.requiredArg(this, C58565Myf.LJLIL, "poi_gallery_index", Integer.class);
        this.LJLJI = routeArgExtension.optionalArg(this, C58567Myh.LJLIL, "poi_gallery_anchor_data", ArrayList.class);
    }

    public final int LLFII() {
        int i;
        if (((Number) this.LJLILLLLZI.getValue()).intValue() < 0) {
            return 0;
        }
        int intValue = ((Number) this.LJLILLLLZI.getValue()).intValue();
        ArrayList arrayList = (ArrayList) this.LJLIL.getValue();
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (intValue >= i) {
            return 0;
        }
        return ((Number) this.LJLILLLLZI.getValue()).intValue();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity", "onCreate", true);
        super.onCreate(bundle);
        setTheme(R.style.ux);
        setContentView(R.layout.c0s);
        overridePendingTransition(R.anim.df, R.anim.dg);
        ViewPager viewPager = (ViewPager) findViewById(R.id.hu7);
        View findViewById = findViewById(R.id.hu4);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.poi_gallery_page_indicator)");
        C59954Nfy c59954Nfy = (C59954Nfy) findViewById;
        C81075Vrr c81075Vrr = new C81075Vrr(LLFII(), this, (ArrayList) this.LJLIL.getValue());
        c81075Vrr.LJLJJL = (ArrayList) this.LJLJI.getValue();
        this.LJLJJI = c81075Vrr;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.hu3);
        View findViewById2 = findViewById(R.id.hu0);
        C81075Vrr c81075Vrr2 = this.LJLJJI;
        if (c81075Vrr2 != null) {
            viewPager.setAdapter(c81075Vrr2);
            c59954Nfy.setViewPager(viewPager);
            viewPager.setCurrentItem(LLFII());
            C16880lQ.LJJJ((TuxIconView) findViewById(R.id.htz), new ACListenerS32S0400000_10(this, findViewById2, frameLayout, viewPager, 1));
            activityConfiguration(C61169NzZ.LJLIL);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryActivity", "onCreate", false);
            return;
        }
        o.LJIJI("pageAdapter");
        throw null;
    }
}
