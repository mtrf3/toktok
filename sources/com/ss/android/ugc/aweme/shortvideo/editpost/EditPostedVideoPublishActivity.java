package com.ss.android.ugc.aweme.shortvideo.editpost;

import X.C146035oF;
import X.C15070iV;
import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C41051G9f;
import X.C42000Ge4;
import X.C42007GeB;
import X.C42016GeK;
import X.C42018GeM;
import X.C42022GeQ;
import X.C42029GeX;
import X.C42691GpD;
import X.C43212Gxc;
import X.C58B;
import X.C5HC;
import X.C60178Nja;
import X.C60903NvH;
import X.C61712OJw;
import X.C61713OJx;
import X.C65531Pnj;
import X.C65803Ps7;
import X.C78983UzD;
import X.F53;
import X.GA4;
import X.GBO;
import X.GGS;
import X.H78;
import X.H7R;
import X.HJO;
import X.InterfaceC144185lG;
import X.InterfaceC45540Hu4;
import X.SY4;
import X.WM7;
import X.WMA;
import Y.ACListenerS27S0100000_7;
import Y.AObserverS75S0100000_7;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandTextViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditPostedVideoPublishActivity extends GBO implements InterfaceC45540Hu4 {
    public static final /* synthetic */ int LJZ = 0;
    public TextView LJLJI;
    public TextView LJLJJI;
    public SY4 LJLJJL;
    public TextView LJLJJLL;
    public View LJLJL;
    public NavigationScene LJLJLJ;
    public C41051G9f LJLJLLL;
    public SceneWrapperFragment LJLL;
    public FrameLayout LJLLI;
    public C42691GpD LJLLJ;
    public VideoPublishEditModel LJLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final C42029GeX LJLLILLLL = C42029GeX.LJLIL;
    public final List<InterfaceC144185lG> LJLLLL = new ArrayList();
    public final List<C5HC> LJLLLLLL = new ArrayList();

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        GGS.LIZ.getClass();
        return GGS.LIZJ;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        List<C15070iV<Class<?>, IAVPublishExtension<?>>> list;
        super.onBackPressed();
        C41051G9f c41051G9f = this.LJLJLLL;
        if (c41051G9f != null && (list = c41051G9f.LLII) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) ((C15070iV) it.next()).LIZIZ;
                if (iAVPublishExtension != null) {
                    VideoPublishEditModel videoPublishEditModel = c41051G9f.LJZ;
                    if (videoPublishEditModel != null) {
                        iAVPublishExtension.onBackPressed(C42000Ge4.LJIILJJIL(videoPublishEditModel));
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C42691GpD c42691GpD = this.LJLLJ;
        if (c42691GpD != null) {
            c42691GpD.LJII();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        C42691GpD c42691GpD = this.LJLLJ;
        if (c42691GpD != null) {
            c42691GpD.LIZJ();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onResume", true);
        super.onResume();
        C42691GpD c42691GpD = this.LJLLJ;
        if (c42691GpD != null) {
            c42691GpD.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onStart", true);
        super.onStart();
        C42691GpD c42691GpD = this.LJLLJ;
        if (c42691GpD != null) {
            c42691GpD.LJFF();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        C42691GpD c42691GpD = this.LJLLJ;
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

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
    }

    public final void LLIIIILZ(boolean z) {
        VideoPublishEditModel videoPublishEditModel;
        if (z) {
            TextView textView = this.LJLJI;
            if (textView != null) {
                textView.setVisibility(8);
                if (C42018GeM.LIZ() && !C42016GeK.LIZ() && (videoPublishEditModel = this.LJLLL) != null && H7R.LJJJJLL(videoPublishEditModel) && GA4.LIZ()) {
                    TextView textView2 = this.LJLJJI;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        SY4 sy4 = this.LJLJJL;
                        if (sy4 != null) {
                            sy4.setVisibility(0);
                        } else {
                            o.LJIJI("topSave");
                            throw null;
                        }
                    } else {
                        o.LJIJI("done");
                        throw null;
                    }
                } else {
                    TextView textView3 = this.LJLJJI;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                        SY4 sy42 = this.LJLJJL;
                        if (sy42 != null) {
                            sy42.setVisibility(8);
                        } else {
                            o.LJIJI("topSave");
                            throw null;
                        }
                    } else {
                        o.LJIJI("done");
                        throw null;
                    }
                }
                View view = this.LJLJL;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("title");
                    throw null;
                }
            }
            o.LJIJI("cancel");
            throw null;
        }
        TextView textView4 = this.LJLJI;
        if (textView4 != null) {
            textView4.setVisibility(0);
            TextView textView5 = this.LJLJJI;
            if (textView5 != null) {
                textView5.setVisibility(8);
                SY4 sy43 = this.LJLJJL;
                if (sy43 != null) {
                    sy43.setVisibility(8);
                    View view2 = this.LJLJL;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        return;
                    } else {
                        o.LJIJI("title");
                        throw null;
                    }
                }
                o.LJIJI("topSave");
                throw null;
            }
            o.LJIJI("done");
            throw null;
        }
        o.LJIJI("cancel");
        throw null;
    }

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        VideoPublishEditModel videoPublishEditModel;
        Window window;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", true);
        try {
            super.onCreate(bundle);
        } catch (Exception e) {
            if (F53.LIZIZ(bundle, e) && F53.LIZJ(this)) {
                H78.LIZIZ("EditPostedVideoPublishActivity", "view state restore crash fixed");
            } else {
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
                throw e;
            }
        }
        setContentView(R.layout.e4);
        getWindow().addFlags(128);
        if (!C60178Nja.LIZIZ(this) && (window = getWindow()) != null) {
            window.setFlags(1024, 1024);
            window.getDecorView().setSystemUiVisibility(4102);
        }
        View findViewById = findViewById(R.id.le7);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.top_bar)");
        this.LJLLI = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.cpc);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.edit_post_cancel)");
        TextView textView = (TextView) findViewById2;
        this.LJLJI = textView;
        C16880lQ.LJIJI(textView, new ACListenerS27S0100000_7(this, 0));
        View findViewById3 = findViewById(R.id.cpd);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.edit_post_done)");
        TextView textView2 = (TextView) findViewById3;
        this.LJLJJI = textView2;
        C16880lQ.LJIJI(textView2, new ACListenerS27S0100000_7(this, 1));
        View initView$lambda$0 = findViewById(R.id.lg1);
        if (C58B.LIZ()) {
            initView$lambda$0.getClass();
        }
        o.LJIIIIZZ(initView$lambda$0, "initView$lambda$0");
        C146035oF.LIZJ(initView$lambda$0, new AqS157S0100000_7(this, 7));
        o.LJIIIIZZ(initView$lambda$0, "findViewById<TuxButton>(…)\n            }\n        }");
        this.LJLJJL = (SY4) initView$lambda$0;
        View initView$lambda$1 = findViewById(R.id.cpb);
        o.LJIIIIZZ(initView$lambda$1, "initView$lambda$1");
        C146035oF.LIZJ(initView$lambda$1, new AqS157S0100000_7(this, 8));
        o.LJIIIIZZ(initView$lambda$1, "findViewById<TextView>(R…)\n            }\n        }");
        this.LJLJJLL = (TextView) initView$lambda$1;
        View findViewById4 = findViewById(R.id.cpe);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.edit_post_page_title)");
        this.LJLJL = findViewById4;
        ((ExpandTextViewModel) ViewModelProviders.of(this).get(ExpandTextViewModel.class)).LJLJJL.observe(this, new AObserverS75S0100000_7(this, 0));
        this.LJLL = new SceneWrapperFragment();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        SceneWrapperFragment sceneWrapperFragment = this.LJLL;
        if (sceneWrapperFragment != null) {
            LIZ.LJIIIIZZ(R.id.dm7, 1, sceneWrapperFragment, null);
            LIZ.LJIILLIIL();
            Intent intent = getIntent();
            Serializable serializableExtra = intent.getSerializableExtra("args");
            if (serializableExtra instanceof VideoPublishEditModel) {
                videoPublishEditModel = (VideoPublishEditModel) serializableExtra;
            } else {
                videoPublishEditModel = null;
            }
            this.LJLLL = videoPublishEditModel;
            if (videoPublishEditModel == null) {
                C60903NvH.LJIIJJI().getPublishService().LJIJJLI().getClass();
                H78.LIZJ("edit post page model is null");
                C78983UzD.LJIILL("edit post page model is null");
                super.finish();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
                return;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("creative_model");
            if (parcelableExtra != null) {
                videoPublishEditModel.creativeModel = (CreativeModel) parcelableExtra;
                VideoPublishEditModel videoPublishEditModel2 = this.LJLLL;
                if (videoPublishEditModel2 != null) {
                    if (H7R.LJJJJL(videoPublishEditModel2) && GA4.LIZ()) {
                        findViewById(R.id.ifv).setVisibility(8);
                    }
                    HJO hjo = new HJO((Bundle) null, C41051G9f.class);
                    hjo.LIZJ = false;
                    hjo.LIZLLL = false;
                    hjo.LJ = 0;
                    Bundle bundle2 = new Bundle();
                    VideoPublishEditModel videoPublishEditModel3 = this.LJLLL;
                    o.LJII(videoPublishEditModel3, "null cannot be cast to non-null type java.io.Serializable");
                    bundle2.putSerializable("args", videoPublishEditModel3);
                    bundle2.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
                    bundle2.putInt("extra_stick_point_type", getIntent().getIntExtra("extra_stick_point_type", 0));
                    bundle2.putBoolean("edit_publish_session_end_together", getIntent().getBooleanExtra("edit_publish_session_end_together", false));
                    if (getIntent().getBooleanExtra("review_video_fast_publish", false)) {
                        bundle2.putBoolean("review_video_fast_publish", true);
                    }
                    bundle2.putString("wording", C16880lQ.LLJJIJIIJIL(getIntent(), "wording"));
                    C41051G9f c41051G9f = new C41051G9f();
                    this.LJLJLLL = c41051G9f;
                    SceneWrapperFragment sceneWrapperFragment2 = this.LJLL;
                    if (sceneWrapperFragment2 != null) {
                        sceneWrapperFragment2.LJLIL = c41051G9f;
                        WM7 LIZ2 = C65531Pnj.LIZ(hjo.LIZ(), NavigationScene.class);
                        o.LJII(LIZ2, "null cannot be cast to non-null type com.bytedance.scene.navigation.NavigationScene");
                        NavigationScene navigationScene = (NavigationScene) LIZ2;
                        this.LJLJLJ = navigationScene;
                        C41051G9f c41051G9f2 = this.LJLJLLL;
                        if (c41051G9f2 != null) {
                            c41051G9f2.mArguments = bundle2;
                        }
                        navigationScene.LJLILLLLZI = new C42007GeB(this);
                        C42691GpD c42691GpD = new C42691GpD(new WMA(R.id.jb_, new C42022GeQ(this), navigationScene, this.LJLLILLLL, true));
                        this.LJLLJ = c42691GpD;
                        c42691GpD.LIZIZ(this, bundle);
                        C61713OJx LIZJ = C61712OJw.LIZJ(this);
                        LIZJ.LJI(R.color.ar);
                        LIZJ.LIZLLL(R.color.ar);
                        LIZJ.LIZ(true);
                        LIZJ.LIZJ();
                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
                        return;
                    }
                    o.LJIJI("wraperFragment");
                    throw null;
                }
                "Required value was null.".toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
                throw illegalArgumentException;
            }
            "Required value was null.".toString();
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Required value was null.");
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity", "onCreate", false);
            throw illegalArgumentException2;
        }
        o.LJIJI("wraperFragment");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        C42691GpD c42691GpD = this.LJLLJ;
        if (c42691GpD != null) {
            c42691GpD.LJ(outState);
        }
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLLLLL).add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ListProtector.add(this.LJLLLLLL, 0, listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLLL).add(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLLLLL).remove(listener);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLLLL).remove(listener);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it = ((ArrayList) this.LJLLLLLL).iterator();
        while (it.hasNext()) {
            if (((C5HC) it.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i == 4) {
            System.currentTimeMillis();
            NavigationScene navigationScene = this.LJLJLJ;
            if (navigationScene != null && navigationScene.onBackPressed()) {
                return true;
            }
            super.finish();
            H78.LIZIZ("EditPostedVideoPublishActivity", "system back event");
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator it = ((ArrayList) this.LJLLLL).iterator();
        while (it.hasNext()) {
            if (((InterfaceC144185lG) it.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        SceneWrapperFragment sceneWrapperFragment = this.LJLL;
        if (sceneWrapperFragment != null) {
            if (sceneWrapperFragment.isAdded()) {
                SceneWrapperFragment sceneWrapperFragment2 = this.LJLL;
                if (sceneWrapperFragment2 != null) {
                    sceneWrapperFragment2.onActivityResult(i, i2, intent);
                    return;
                } else {
                    o.LJIJI("wraperFragment");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("wraperFragment");
        throw null;
    }
}
