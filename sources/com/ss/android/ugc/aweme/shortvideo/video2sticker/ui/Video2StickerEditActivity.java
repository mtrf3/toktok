package com.ss.android.ugc.aweme.shortvideo.video2sticker.ui;

import X.C10K;
import X.C1JI;
import X.C38891fp;
import X.C42157Ggb;
import X.C44273HZd;
import X.C44274HZe;
import X.C44275HZf;
import X.C60903NvH;
import X.C65803Ps7;
import X.C68M;
import X.C77413UZt;
import X.C78932UyO;
import X.FragmentC44278HZi;
import X.FragmentC44279HZj;
import X.GBO;
import X.OQN;
import X.WM7;
import X.WMA;
import X.WMH;
import Y.ACallableS105S0100000_2;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.shortvideo.video2sticker.Video2StickerEditRootScene;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class Video2StickerEditActivity extends GBO {
    public Video2StickerEditRootScene LJLJI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.video2sticker.ui.Video2StickerEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        Video2StickerEditRootScene video2StickerEditRootScene = this.LJLJI;
        if (video2StickerEditRootScene != null) {
            C10K.LIZJ(new ACallableS105S0100000_2(video2StickerEditRootScene, 5));
            super.finish();
        } else {
            o.LJIJI("rootScene");
            throw null;
        }
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Video2StickerEditRootScene video2StickerEditRootScene = this.LJLJI;
        if (video2StickerEditRootScene != null) {
            if (!video2StickerEditRootScene.onBackPressed()) {
                super.onBackPressed();
                return;
            }
            return;
        }
        o.LJIJI("rootScene");
        throw null;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.video2sticker.ui.Video2StickerEditActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().clearFlags(1024);
        OQN.LJIILIIL(this);
        getWindow().setNavigationBarColor(-16777216);
        getWindow().getDecorView().setBackgroundColor(-16777216);
        setContentView(R.layout.ew);
        C60903NvH.LJIIJJI().LJIJ();
        C60903NvH.LJIIJJI().LJFF().init();
        C44275HZf c44275HZf = new C44275HZf(this, Video2StickerEditRootScene.class);
        C44274HZe c44274HZe = new C44274HZe(this);
        Activity activity = c44275HZf.LIZ;
        Class<? extends WMH> cls = c44275HZf.LIZIZ;
        C1JI.LJII();
        C44273HZd.LIZ(activity, "LifeCycleFragment");
        WM7 LIZ = c44274HZe.LIZ(activity.getClass().getClassLoader(), cls.getName());
        if (C78932UyO.LJ(activity)) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            FragmentC44278HZi fragmentC44278HZi = (FragmentC44278HZi) fragmentManager.findFragmentByTag("LifeCycleFragment");
            if (fragmentC44278HZi != null) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.remove(fragmentC44278HZi);
                C78932UyO.LIZ(fragmentManager, beginTransaction, true);
            }
            C42157Ggb c42157Ggb = new C42157Ggb(activity);
            FragmentC44278HZi fragmentC44278HZi2 = new FragmentC44278HZi();
            FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
            beginTransaction2.add(R.id.dd8, fragmentC44278HZi2, "LifeCycleFragment");
            fragmentC44278HZi2.LJLILLLLZI = new WMA(R.id.dd8, c42157Ggb, LIZ, FragmentC44279HZj.LIZ(activity, "LifeCycleFragment", true, true), false);
            C78932UyO.LIZ(fragmentManager, beginTransaction2, true);
        }
        C68M LJIIJ = C68M.LJIIJ();
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        if (C77413UZt.LJIILL(LJIIJ.LJIIIZ())) {
            LJIIJ.LJIJ(applicationContext);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.video2sticker.ui.Video2StickerEditActivity", "onCreate", false);
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Video2StickerEditRootScene video2StickerEditRootScene = this.LJLJI;
        if (video2StickerEditRootScene != null) {
            video2StickerEditRootScene.onActivityResult(i, i2, intent);
        } else {
            o.LJIJI("rootScene");
            throw null;
        }
    }
}
