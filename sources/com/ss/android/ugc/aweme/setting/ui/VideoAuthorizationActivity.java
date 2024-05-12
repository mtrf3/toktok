package com.ss.android.ugc.aweme.setting.ui;

import X.ActivityC45651qj;
import X.C214738bl;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C41260GHg;
import X.C42949GtN;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65803Ps7;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.T16;
import X.YUP;
import Y.AObserverS69S0100000_1;
import Y.AObserverS75S0100000_7;
import Y.AfS53S0200000_4;
import Y.AfS59S0100000_7;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.commercialize.advideo.VideoAuthorizationApi;
import com.ss.android.ugc.aweme.setting.ui.vm.VideoAuthorizationViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoAuthorizationActivity extends YUP {
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 173));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 174));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 172));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 175));
    public final C214738bl LJLJL = new C214738bl(C65352Pkq.LIZ(VideoAuthorizationViewModel.class), new AqS157S0100000_7((ActivityC45651qj) this, 177), new AqS157S0100000_7((ActivityC45651qj) this, 176));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final int LLFII() {
        return ((Number) this.LJLJJL.getValue()).intValue();
    }

    public final String LLFZ() {
        return (String) this.LJLJI.getValue();
    }

    public final String LLII() {
        return (String) this.LJLJJI.getValue();
    }

    public final long LLIIIILZ() {
        return ((Number) this.LJLJJLL.getValue()).longValue();
    }

    public final VideoAuthorizationViewModel LLIIIJ() {
        return (VideoAuthorizationViewModel) this.LJLJL.getValue();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        ((C73318Sq2) LLIIIJ().LJLJJLL.getValue()).LIZLLL();
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

    public static String LLIIIZ(long j) {
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        return new BDDateFormat("l").LIZIZ(j * 1000, locale);
    }

    @Override // X.YUP, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity", "onCreate", true);
        activityConfiguration(C41260GHg.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.fl);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 178));
        c235119Kp.LIZLLL(LIZJ);
        c252709vu.setNavActions(c235119Kp);
        LLIIIJ().LJLIL.observe(this, new AObserverS69S0100000_1(this, 61));
        LLIIIJ().LJLJI.observe(this, new AObserverS75S0100000_7(this, 16));
        LLIIIJ().LJLJJL.observe(this, new AObserverS69S0100000_1(this, 62));
        VideoAuthorizationViewModel LLIIIJ = LLIIIJ();
        String baUid = LLFZ();
        o.LJIIIIZZ(baUid, "baUid");
        String itemId = LLII();
        o.LJIIIIZZ(itemId, "itemId");
        int LLFII = LLFII();
        long LLIIIILZ = LLIIIILZ();
        LLIIIJ.LJLIL.setValue(Boolean.TRUE);
        VideoAuthorizationApi.LIZ.getClass();
        C78999UzT.LJFF(((VideoAuthorizationApi) C42949GtN.LIZIZ.getValue()).getVideoInvitationInfo(baUid, itemId, LLFII, LLIIIILZ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(LLIIIJ, 64), new AfS53S0200000_4(this, LLIIIJ, 28)), (C73318Sq2) LLIIIJ.LJLJJLL.getValue());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity", "onCreate", false);
    }
}
