package com.ss.android.ugc.aweme.choosemusic.activity;

import X.ActivityC86117Xqz;
import X.AnonymousClass636;
import X.C158056If;
import X.C16880lQ;
import X.C1B3;
import X.C2YJ;
import X.C60996Nwm;
import X.C63057Oov;
import X.C63081OpJ;
import X.C65803Ps7;
import X.C6D8;
import X.C76800UCe;
import X.C84910XUc;
import X.EnumC122984sA;
import X.H9C;
import X.InterfaceC45040Hm0;
import X.InterfaceC65784Pro;
import X.K0Y;
import X.KO4;
import X.LTT;
import X.TCT;
import X.ViewOnClickListenerC85609Xin;
import X.XVF;
import X.XWK;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS32S0101000_15;
import Y.ALAdapterS12S0100000_15;
import Y.AUListenerS102S0100000_15;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ChooseMusicActivity extends ActivityC86117Xqz implements InterfaceC45040Hm0 {
    public static final /* synthetic */ int LJLLJ = 0;
    public TuxTextView LJLIL;
    public RelativeLayout LJLILLLLZI;
    public TextView LJLJI;
    public TuxTextView LJLJJI;
    public RelativeLayout LJLJJL;
    public TextView LJLJJLL;
    public ViewPagerBottomSheetBehavior LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final IAVPerformance LJLLI = AVExternalServiceImpl.LIZ().provideAVPerformance();
    public TCT LJLLILLLL;

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("music_homepage");
        return analysis;
    }

    public final void LLFII() {
        this.LJLJI = (TextView) findViewById(R.id.mi_);
        this.LJLJJLL = (TextView) findViewById(R.id.brw);
        if (LLFZ() && !KO4.LIZ()) {
            try {
                Boolean enableLocalMusicEntrance = C2YJ.LIZIZ.LIZ.getEnableLocalMusicEntrance();
                o.LJIIIIZZ(enableLocalMusicEntrance, "get().getEnableLocalMusicEntrance()");
                if (enableLocalMusicEntrance.booleanValue()) {
                    this.LJLJI.setVisibility(0);
                    this.LJLJJLL.setVisibility(0);
                    C16880lQ.LJIJI(this.LJLJI, new ViewOnClickListenerC85609Xin(new ACListenerS32S0101000_15(2, this, 11), true));
                    C16880lQ.LJIJI(this.LJLJJLL, new ViewOnClickListenerC85609Xin(new ACListenerS32S0101000_15(0, this, 5), true));
                    return;
                }
            } catch (C158056If e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.LJLJI.setVisibility(8);
        this.LJLJJLL.setVisibility(8);
    }

    public final boolean LLFZ() {
        if (C6D8.LIZLLL() || this.LJLJLLL) {
            return false;
        }
        TCT tct = this.LJLLILLLL;
        if (tct.LJIIJ.getVisibility() != 8 || tct.LJIIJJI.getVisibility() != 8) {
            return false;
        }
        return true;
    }

    public final void LLIIIILZ() {
        if (!((ChooseMusicWithSceneViewModel) ViewModelProviders.of(this).get(ChooseMusicWithSceneViewModel.class)).LJLILLLLZI) {
            return;
        }
        AVExternalServiceImpl.LIZ().publishService().setCurMusic(null, 0);
        Intent intent = new Intent();
        intent.putExtra("is_cancel_current_choose_music", true);
        setResult(-1, intent);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        KeyboardUtils.LIZIZ(this.LJLIL);
        overridePendingTransition(0, R.anim.ag);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (K0Y.LIZ(this)) {
            return;
        }
        LLIIIILZ();
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        String str;
        String str2;
        MusicModel musicModel;
        C65803Ps7.LIZIZ(this);
        Mission mission = ((ChooseMusicWithSceneViewModel) ViewModelProviders.of(this).get(ChooseMusicWithSceneViewModel.class)).LJLJJI;
        if (mission != null) {
            str = mission.getMusicId();
        } else {
            str = null;
        }
        BaseChooseMusicFragment baseChooseMusicFragment = (BaseChooseMusicFragment) getSupportFragmentManager().LJJJI(R.id.dm7);
        if (baseChooseMusicFragment != null && (musicModel = baseChooseMusicFragment.LJLLLLLL) != null) {
            str2 = String.valueOf(musicModel.getId());
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str2, str)) {
            new H9C().LJIIJJI(((ChooseMusicWithSceneViewModel) ViewModelProviders.of(this).get(ChooseMusicWithSceneViewModel.class)).LJLJJI, 1);
            ((ChooseMusicWithSceneViewModel) ViewModelProviders.of(this).get(ChooseMusicWithSceneViewModel.class)).LJLJJI = null;
        }
        super.onDestroy();
        this.LJLLI.leave(this, "music_select");
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.LJLLI.end(OpenMusicPanelPerformanceMonitor.INSTANCE, "animation_finished");
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        this.LJLLI.pause(this, "music_select", C16880lQ.LLJJIJIIJIL(getIntent(), "creation_id"), C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_way"));
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", true);
        super.onResume();
        if (this.LJLJLJ == 2) {
            XVF.LJIILLIIL("video_shoot_page");
        } else {
            XVF.LJIILLIIL("video_edit_page");
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", false);
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

    public final void LLII(boolean z) {
        if (z) {
            this.LJLLILLLL.LJIIZILJ = true;
            if (AnonymousClass636.LJIILJJIL(this)) {
                LTT.LIZJ(this);
            } else {
                LTT.LJ(this);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new AUListenerS102S0100000_15(this, 9));
            ofFloat.addListener(new ALAdapterS12S0100000_15(this, 3));
            ofFloat.start();
            return;
        }
        if (!C63057Oov.LIZ()) {
            return;
        }
        this.LJLLILLLL.LJIIZILJ = false;
        LTT.LIZJ(this);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new AUListenerS102S0100000_15(this, 10));
        ofFloat2.addListener(new ALAdapterS12S0100000_15(this, 4));
        if (this.LJLJJL.getVisibility() != 8) {
            return;
        }
        ofFloat2.start();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        this.LJLLI.step(OpenMusicPanelPerformanceMonitor.INSTANCE, "choose_music_created");
        this.LJLLI.enter(this, "music_select");
        overridePendingTransition(R.anim.ae, 0);
        setContentView(R.layout.dw);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.mo6);
        this.LJLIL = tuxTextView;
        tuxTextView.setText(C16880lQ.LLJJIJIIJIL(getIntent(), "title"));
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.brx);
        this.LJLJJI = tuxTextView2;
        tuxTextView2.setText(C16880lQ.LLJJIJIIJIL(getIntent(), "title"));
        this.LJLILLLLZI = (RelativeLayout) findViewById(R.id.l_5);
        this.LJLJJL = (RelativeLayout) findViewById(R.id.bru);
        if (AVExternalServiceImpl.LIZ().anchorService().newRoundCornerUXOptimization()) {
            this.LJLILLLLZI.setBackgroundResource(R.drawable.a_l);
            this.LJLJJL.setBackgroundResource(R.drawable.a_l);
        }
        if (C63057Oov.LIZ()) {
            this.LJLJJL.setVisibility(0);
            this.LJLILLLLZI.setVisibility(8);
        } else {
            this.LJLJJL.setVisibility(8);
            this.LJLILLLLZI.setVisibility(0);
        }
        if (AVExternalServiceImpl.LIZ().anchorService().newRoundCornerUXOptimization()) {
            this.LJLILLLLZI.setBackgroundResource(R.drawable.a_l);
            this.LJLJJL.setBackgroundResource(R.drawable.a_l);
        }
        this.LJLLILLLL = new TCT(this, findViewById(R.id.j7n));
        this.LJLJLLL = getIntent().getBooleanExtra("hide_local_music", false);
        this.LJLL = getIntent().getBooleanExtra("long_video", false);
        LLFII();
        C16880lQ.LJIIJ(new ACListenerS24S0101000_5(1, this, 11), findViewById(R.id.lcd));
        C16880lQ.LJIIJ(new ACListenerS24S0101000_5(2, this, 15), findViewById(R.id.brv));
        final Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(getIntent(), "arguments");
        if (LJJLIIIIJ != null) {
            Mission newInstanceForMusic = Mission.newInstanceForMusic(LJJLIIIIJ.getString("mission_id"), LJJLIIIIJ.getString("mission_music_id"), LJJLIIIIJ.getString("enter_from"));
            CommerceMissionServiceImpl.LJIIIIZZ().LJFF(this).HX(newInstanceForMusic);
            ((ChooseMusicWithSceneViewModel) ViewModelProviders.of(this).get(ChooseMusicWithSceneViewModel.class)).LJLJJI = newInstanceForMusic;
        }
        findViewById(R.id.k83).setMinimumHeight(C63081OpJ.LJJJJLI(this));
        if (C63057Oov.LIZ()) {
            LLII(false);
        }
        ViewPagerBottomSheetBehavior LIZ = ViewPagerBottomSheetBehavior.LIZ(findViewById(R.id.c8m));
        this.LJLJL = LIZ;
        LIZ.LJIILLIIL = new XWK(this);
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LJLJL;
        viewPagerBottomSheetBehavior.LJI = true;
        viewPagerBottomSheetBehavior.setPeekHeight(C60996Nwm.LIZLLL(this) + C60996Nwm.LJ(this));
        final FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.LJJJI(R.id.dm7) == null) {
            this.LJLJLJ = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            AVExternalServiceImpl.LIZ().publishService().setMusicChooseType(this.LJLJLJ);
            final String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "challenge");
            final String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "creation_id");
            final String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_way");
            final String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(getIntent(), "reuse_original_sound_id");
            final UrlModel urlModel = (UrlModel) getIntent().getSerializableExtra("reuse_original_sound_url");
            final int intExtra = getIntent().getIntExtra("reuse_original_sound_length", 0);
            final MusicModel musicModel = (MusicModel) getIntent().getSerializableExtra("music_model");
            final boolean booleanExtra = getIntent().getBooleanExtra("music_allow_clear", false);
            final boolean booleanExtra2 = getIntent().getBooleanExtra("music_allow_cut", false);
            final boolean booleanExtra3 = getIntent().getBooleanExtra("music_is_photomv", false);
            final boolean booleanExtra4 = getIntent().getBooleanExtra("is_mv_theme_music", false);
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            int i = this.LJLJLJ;
            EnumC122984sA enumC122984sA = EnumC122984sA.BtnConfirm;
            boolean z2 = this.LJLL;
            if (!LLFZ() || !KO4.LIZ()) {
                z = false;
            } else {
                z = true;
            }
            c1b3.LJIIIIZZ(R.id.dm7, 1, C84910XUc.LIZ(i, LLJJIJIIJIL, musicModel, enumC122984sA, booleanExtra, booleanExtra3, LJJLIIIIJ, LLJJIJIIJIL3, LLJJIJIIJIL2, z2 ? 1 : 0, booleanExtra2, LLJJIJIIJIL4, urlModel, intExtra, booleanExtra4, z, "", true), "choose_music_fragment_tag");
            c1b3.LJIILJJIL();
            TCT tct = this.LJLLILLLL;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = new InterfaceC65784Pro() { // from class: X.XWA
                @Override // X.InterfaceC65784Pro
                public final Object invoke() {
                    String str;
                    ChooseMusicActivity chooseMusicActivity = ChooseMusicActivity.this;
                    FragmentManager fragmentManager = supportFragmentManager;
                    String str2 = LLJJIJIIJIL;
                    MusicModel musicModel2 = musicModel;
                    boolean z3 = booleanExtra;
                    boolean z4 = booleanExtra3;
                    Bundle bundle2 = LJJLIIIIJ;
                    String str3 = LLJJIJIIJIL3;
                    String str4 = LLJJIJIIJIL2;
                    boolean z5 = booleanExtra2;
                    String str5 = LLJJIJIIJIL4;
                    UrlModel urlModel2 = urlModel;
                    int i2 = intExtra;
                    boolean z6 = booleanExtra4;
                    chooseMusicActivity.LLFII();
                    BaseChooseMusicFragment baseChooseMusicFragment = (BaseChooseMusicFragment) fragmentManager.LJJJI(R.id.dm7);
                    if (baseChooseMusicFragment != null) {
                        str = baseChooseMusicFragment.LJLJL;
                    } else {
                        str = "";
                    }
                    int i3 = chooseMusicActivity.LJLJLJ;
                    EnumC122984sA enumC122984sA2 = EnumC122984sA.BtnConfirm;
                    boolean z7 = chooseMusicActivity.LJLL;
                    boolean z8 = false;
                    if (chooseMusicActivity.LLFZ() && KO4.LIZ()) {
                        z8 = true;
                    }
                    ChooseMusicFragment LIZ2 = C84910XUc.LIZ(i3, str2, musicModel2, enumC122984sA2, z3, z4, bundle2, str3, str4, z7 ? 1 : 0, z5, str5, urlModel2, i2, z6, z8, str, false);
                    if (baseChooseMusicFragment != null) {
                        if (baseChooseMusicFragment.LJLJJLL && C63057Oov.LIZ()) {
                            baseChooseMusicFragment.Hl(Boolean.FALSE);
                        }
                        C1B3 c1b32 = new C1B3(fragmentManager);
                        c1b32.LJIIJ(LIZ2, "choose_music_fragment_tag", R.id.dm7);
                        c1b32.LJIILJJIL();
                    } else {
                        C1B3 c1b33 = new C1B3(fragmentManager);
                        c1b33.LJIIIIZZ(R.id.dm7, 1, LIZ2, "choose_music_fragment_tag");
                        c1b33.LJIILJJIL();
                    }
                    return C76800UCe.LIZ;
                }
            };
            tct.getClass();
            tct.LJIILJJIL = interfaceC65784Pro;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
        Iterator<Fragment> it = getSupportFragmentManager().LJJJJLI().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }
}
