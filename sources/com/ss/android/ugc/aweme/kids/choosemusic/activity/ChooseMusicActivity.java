package com.ss.android.ugc.aweme.kids.choosemusic.activity;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C60996Nwm;
import X.C63081OpJ;
import X.C65803Ps7;
import X.InterfaceC45040Hm0;
import X.XWL;
import Y.IDCListenerS10S0101000;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.ChooseMusicFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;

/* loaded from: classes16.dex */
public class ChooseMusicActivity extends ActivityC86117Xqz implements InterfaceC45040Hm0 {
    public static final /* synthetic */ int LJLJJL = 0;
    public TextView LJLIL;
    public boolean LJLILLLLZI;
    public ViewPagerBottomSheetBehavior LJLJI;
    public int LJLJJI;

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLFII() {
        if (!this.LJLILLLLZI) {
            return;
        }
        AVExternalServiceImpl.LIZ().publishService().setCurMusic(null, 0);
        Intent intent = new Intent();
        intent.putExtra("is_cancel_current_choose_music", true);
        setResult(-1, intent);
    }

    @Override // X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("music_homepage");
        return analysis;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        KeyboardUtils.LIZIZ(this.LJLIL);
        overridePendingTransition(0, R.anim.ag);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLFII();
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        AVExternalServiceImpl.LIZ().provideAVPerformance().leave(this, "music_select");
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        AVExternalServiceImpl.LIZ().provideAVPerformance().pause(this, "music_select", C16880lQ.LLJJIJIIJIL(getIntent(), "creation_id"), C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_way"));
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        AVExternalServiceImpl.LIZ().provideAVPerformance().enter(this, "music_select");
        overridePendingTransition(R.anim.ae, 0);
        setContentView(R.layout.bg1);
        TextView textView = (TextView) findViewById(R.id.mo6);
        this.LJLIL = textView;
        textView.setText(C16880lQ.LLJJIJIIJIL(getIntent(), "title"));
        C16880lQ.LJIIJ(new IDCListenerS10S0101000(4, this, 6), findViewById(R.id.aej));
        Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(getIntent(), "arguments");
        findViewById(R.id.k83).setMinimumHeight(C63081OpJ.LJJJJLI(this));
        ViewPagerBottomSheetBehavior LIZ = ViewPagerBottomSheetBehavior.LIZ(findViewById(R.id.c8m));
        this.LJLJI = LIZ;
        LIZ.LJIILLIIL = new XWL(this);
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LJLJI;
        viewPagerBottomSheetBehavior.LJI = true;
        viewPagerBottomSheetBehavior.setPeekHeight(C60996Nwm.LIZLLL(this) + C60996Nwm.LJ(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.LJJJI(R.id.dm7) == null) {
            this.LJLJJI = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            AVExternalServiceImpl.LIZ().publishService().setMusicChooseType(this.LJLJJI);
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "challenge");
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "creation_id");
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(getIntent(), "shoot_way");
            Serializable serializableExtra = getIntent().getSerializableExtra("music_model");
            boolean booleanExtra = getIntent().getBooleanExtra("music_allow_clear", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("music_is_photomv", false);
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            int i = this.LJLJJI;
            ChooseMusicFragment chooseMusicFragment = new ChooseMusicFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
            bundle2.putSerializable("challenge", LLJJIJIIJIL);
            bundle2.putSerializable("music_model", serializableExtra);
            bundle2.putBoolean("music_allow_clear", booleanExtra);
            bundle2.putString("creation_id", LLJJIJIIJIL2);
            bundle2.putString("shoot_way", LLJJIJIIJIL3);
            bundle2.putBoolean("music_is_photomv", booleanExtra2);
            if (LJJLIIIIJ != null) {
                bundle2.putAll(LJJLIIIIJ);
            }
            chooseMusicFragment.setArguments(bundle2);
            c1b3.LJIIIIZZ(R.id.dm7, 1, chooseMusicFragment, null);
            c1b3.LJIILJJIL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }
}
