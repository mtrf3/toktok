package com.ss.android.ugc.aweme.feed.landscape;

import X.C16880lQ;
import X.C188727au;
import X.C218678i7;
import X.C221108m2;
import X.C2300891g;
import X.C2U8;
import X.C34X;
import X.C44204HWm;
import X.C57872Ox;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C78966Uyw;
import X.FFL;
import X.FMX;
import X.FRW;
import X.GHC;
import X.J1Q;
import X.JAY;
import X.KJ1;
import X.YUG;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.experiments.LandscapeOptExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LandscapeFeedActivity extends YUG implements C34X, J1Q {
    public Aweme LJLJI;
    public boolean LJLJL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final ArrayList<GHC> LJLJJI = new ArrayList<>();
    public String LJLJJL = "";
    public String LJLJJLL = "";
    public final C44204HWm LJLJLJ = new C44204HWm(this);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 114));

    public final void LLFII() {
        setRequestedOrientation(0);
        if (Build.VERSION.SDK_INT < 30) {
            getWindow().getDecorView().setSystemUiVisibility(4871);
            return;
        }
        WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController == null) {
            return;
        }
        insetsController.hide(WindowInsets.Type.systemBars());
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        String str;
        super.finish();
        C2300891g.LIZ.getClass();
        if (C2300891g.LIZIZ) {
            if (getWindowManager().getDefaultDisplay().getRotation() == 3) {
                overridePendingTransition(R.anim.dc, R.anim.de);
            } else {
                overridePendingTransition(R.anim.db, R.anim.dd);
            }
        }
        Aweme aweme = this.LJLJI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C2U8.LIZ(new C57872Ox(str));
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        unRegisterActivityOnKeyDownListener(this.LJLJLJ);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        String str;
        Integer num;
        String str2;
        User author;
        Video video;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onResume", true);
        this.LJLJJL = C218678i7.LIZJ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", C218678i7.LIZJ);
        c188727au.LJIIIZ("enter_method", this.LJLJJLL);
        Aweme aweme = this.LJLJI;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        Aweme aweme2 = this.LJLJI;
        if (aweme2 != null && (video = aweme2.getVideo()) != null) {
            num = Integer.valueOf(video.getDuration());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "item_duration");
        Aweme aweme3 = this.LJLJI;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            str3 = author.getUid();
        }
        c188727au.LJIIIZ("author_id", str3);
        Aweme aweme4 = this.LJLJI;
        if (aweme4 != null && aweme4.isPaidContent) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_collection_item", str2);
        FMX.LJIIL("enter_landscape_screen_page", c188727au.LIZ);
        LLFII();
        this.LJLJJLL = "auto";
        super.onResume();
        registerActivityOnKeyDownListener(this.LJLJLJ);
        IMidAdCellAbility iMidAdCellAbility = JAY.LJFF;
        if (iMidAdCellAbility != null) {
            iMidAdCellAbility.wK(true);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onStart", true);
        super.onStart();
        if (Build.VERSION.SDK_INT >= 29 && this.LJLJL) {
            ((AudioManager) this.LJLJLLL.getValue()).setAllowedCapturePolicy(2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 && this.LJLJL) {
            ((AudioManager) this.LJLJLLL.getValue()).setAllowedCapturePolicy(1);
        }
        IMidAdCellAbility iMidAdCellAbility = JAY.LJFF;
        if (iMidAdCellAbility != null) {
            iMidAdCellAbility.wK(false);
        }
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

    @Override // X.J1Q
    public final String getEnterFrom() {
        return this.LJLJJL;
    }

    @Override // X.YUG, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onCreate", true);
        FMX.onEventV3("landscape_business_on_create");
        FRW.LIZ("landscape_performance_click_to_create");
        FRW.LIZLLL("landscape_performance_create_to_created");
        getWindow().getDecorView().post(KJ1.LJLIL);
        super.onCreate(bundle);
        LLFII();
        boolean booleanExtra = getIntent().getBooleanExtra("block_screen_recording", false);
        this.LJLJL = booleanExtra;
        if (booleanExtra) {
            getWindow().setFlags(FileUtils.BUFFER_SIZE, FileUtils.BUFFER_SIZE);
        }
        C2300891g.LIZ.getClass();
        if (C2300891g.LIZIZ) {
            if (getWindowManager().getDefaultDisplay().getRotation() == 3) {
                overridePendingTransition(R.anim.d9, R.anim.da);
            } else {
                overridePendingTransition(R.anim.d8, R.anim.d_);
            }
        }
        setContentView(R.layout.ei);
        this.LJLJI = C78966Uyw.LJLJJI;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_method");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "unknown";
        }
        this.LJLJJLL = LLJJIJIIJIL;
        FFL LJIIIZ = FFL.LJIIIZ();
        LandscapeOptExperiment.LandscapeOptFeature landscapeOptFeature = LandscapeOptExperiment.LIZ;
        LJIIIZ.getClass();
        LandscapeOptExperiment.LandscapeOptFeature landscapeOptFeature2 = (LandscapeOptExperiment.LandscapeOptFeature) FFL.LJIJ(true, "landscape_feed_optimization", 31744, LandscapeOptExperiment.LandscapeOptFeature.class, landscapeOptFeature);
        if (landscapeOptFeature2 == null || !landscapeOptFeature2.otherOptimization) {
            AwemeService.LIZ().R1(this.LJLJI);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z) {
            LLFII();
        }
    }

    @Override // X.C34X
    public final void registerActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        if (!this.LJLJJI.contains(listener)) {
            Iterator<GHC> it = this.LJLJJI.iterator();
            while (it.hasNext()) {
                GHC next = it.next();
                if (o.LJ(next.getClass(), listener.getClass())) {
                    ArrayList<GHC> arrayList = this.LJLJJI;
                    ListProtector.add(arrayList, arrayList.indexOf(next), listener);
                    return;
                }
            }
            this.LJLJJI.add(listener);
        }
    }

    @Override // X.C34X
    public final void unRegisterActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI.remove(listener);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList<GHC> arrayList = this.LJLJJI;
        if (arrayList != null) {
            Iterator<GHC> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
