package com.ss.android.ugc.aweme.nows.ui;

import X.AbstractActivityC162676Zz;
import X.C142575if;
import X.C147265qE;
import X.C147485qa;
import X.C16880lQ;
import X.C29901Fi;
import X.C42024GeS;
import X.C42025GeT;
import X.C42330GjO;
import X.C42691GpD;
import X.C5MM;
import X.C60903NvH;
import X.C65803Ps7;
import X.C6IA;
import X.C6IB;
import X.C78894Uxm;
import X.InterfaceC147215q9;
import X.OSZ;
import X.WMA;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class NowsEditActivity extends AbstractActivityC162676Zz {
    public static final /* synthetic */ int LJLLJ = 0;
    public NowsEditRootScene LJLJLLL;
    public C42691GpD LJLL;
    public NavigationScene LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.nows.ui.NowsEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
        NowsEditRootScene nowsEditRootScene = this.LJLJLLL;
        if (nowsEditRootScene != null) {
            Activity requireActivity = nowsEditRootScene.requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C6IB.LIZIZ(requireActivity);
            View requireViewById = nowsEditRootScene.requireViewById(R.id.egy);
            o.LJIIIIZZ(requireViewById, "requireViewById<ViewGroup>(R.id.image_container)");
            View[] viewArr = new ViewGroup[2];
            FrameLayout frameLayout = nowsEditRootScene.LJLJL;
            if (frameLayout != null) {
                int i = 0;
                viewArr[0] = frameLayout;
                viewArr[1] = requireViewById;
                do {
                    View view = viewArr[i];
                    Activity requireActivity2 = nowsEditRootScene.requireActivity();
                    o.LJIIIIZZ(requireActivity2, "requireActivity()");
                    C6IA.LJII(requireActivity2, view);
                    i++;
                } while (i < 2);
                InterfaceC147215q9 interfaceC147215q9 = nowsEditRootScene.LLIIIL;
                if (interfaceC147215q9 != null) {
                    interfaceC147215q9.LJIJI();
                    return;
                }
                return;
            }
            o.LJIJI("surfaceContainer");
            throw null;
        }
        o.LJIJI("rootScene");
        throw null;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        NavigationScene navigationScene = this.LJLLI;
        if (navigationScene != null && navigationScene.onBackPressed()) {
            return;
        }
        NowsEditRootScene nowsEditRootScene = this.LJLJLLL;
        if (nowsEditRootScene != null) {
            if (nowsEditRootScene.onBackPressed()) {
                return;
            }
            super.onBackPressed();
            return;
        }
        o.LJIJI("rootScene");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C42691GpD c42691GpD = this.LJLL;
        if (c42691GpD != null) {
            c42691GpD.LJII();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        C42691GpD c42691GpD = this.LJLL;
        if (c42691GpD != null) {
            c42691GpD.LIZJ();
        }
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.nows.ui.NowsEditActivity", "onResume", true);
        super.onResume();
        C42691GpD c42691GpD = this.LJLL;
        if (c42691GpD != null) {
            c42691GpD.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.nows.ui.NowsEditActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.nows.ui.NowsEditActivity", "onStart", true);
        super.onStart();
        C42691GpD c42691GpD = this.LJLL;
        if (c42691GpD != null) {
            c42691GpD.LJFF();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.nows.ui.NowsEditActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        C42691GpD c42691GpD = this.LJLL;
        if (c42691GpD != null) {
            c42691GpD.LJI();
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

    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.nows.ui.NowsEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.f3);
        overridePendingTransition(0, 0);
        C60903NvH.LJIIJJI().LJIJ();
        this.LJLJLLL = new NowsEditRootScene((NowsShootActivityArg) getIntent().getParcelableExtra("now_shoot_activity_arg"));
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null) {
            NowsEditRootScene nowsEditRootScene = this.LJLJLLL;
            if (nowsEditRootScene != null) {
                nowsEditRootScene.mArguments = LLJJIJI;
            } else {
                o.LJIJI("rootScene");
                throw null;
            }
        }
        NowsEditRootScene nowsEditRootScene2 = this.LJLJLLL;
        if (nowsEditRootScene2 != null) {
            NavigationScene LIZ = C42025GeT.LIZ(nowsEditRootScene2);
            OSZ osz = new OSZ(LIZ, new WMA(R.id.ja3, new C42024GeS(this), LIZ, new C78894Uxm(), new C42330GjO(), true));
            this.LJLLI = (NavigationScene) osz.getFirst();
            C42691GpD c42691GpD = new C42691GpD((WMA) osz.getSecond());
            this.LJLL = c42691GpD;
            c42691GpD.LIZIZ(this, null);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.nows.ui.NowsEditActivity", "onCreate", false);
            return;
        }
        o.LJIJI("rootScene");
        throw null;
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10004 && i2 == -1) {
            if (intent != null && intent.hasExtra("custom_sticker") && intent.hasExtra("custom_sticker_image_info")) {
                Effect effect = (Effect) intent.getParcelableExtra("custom_sticker");
                CustomStickerInfo customStickerInfo = (CustomStickerInfo) intent.getParcelableExtra("custom_sticker_image_info");
                NowsEditRootScene nowsEditRootScene = this.LJLJLLL;
                if (nowsEditRootScene != null) {
                    if (effect != null) {
                        if (customStickerInfo != null) {
                            C142575if c142575if = nowsEditRootScene.LJLLILLLL;
                            if (c142575if != null) {
                                c142575if.DM().setValue(C5MM.LIZLLL(0L));
                                C147265qE c147265qE = nowsEditRootScene.LLILL;
                                C147485qa c147485qa = new C147485qa(effect, customStickerInfo);
                                C29901Fi c29901Fi = c147265qE.LIZ;
                                o.LJII(c29901Fi, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<com.ss.android.ugc.gamora.editor.ImageStickerAdapterInfo>");
                                c29901Fi.LJII(c147485qa);
                                return;
                            }
                            o.LJIJI("editPreviewApi");
                            throw null;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                o.LJIJI("rootScene");
                throw null;
            }
            return;
        }
        NowsEditRootScene nowsEditRootScene2 = this.LJLJLLL;
        if (nowsEditRootScene2 != null) {
            nowsEditRootScene2.onActivityResult(i, i2, intent);
        } else {
            o.LJIJI("rootScene");
            throw null;
        }
    }
}
