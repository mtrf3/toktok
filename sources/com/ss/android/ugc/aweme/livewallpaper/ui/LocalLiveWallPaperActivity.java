package com.ss.android.ugc.aweme.livewallpaper.ui;

import X.ASL;
import X.AbstractC030309z;
import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C118514kx;
import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C31268COy;
import X.C38816FLg;
import X.C39061g6;
import X.C39579Fg7;
import X.C45804HyK;
import X.C62011OVj;
import X.C65803Ps7;
import X.C73305Spp;
import X.C73306Spq;
import X.C78840Uwu;
import X.C79004UzY;
import X.C82802Wec;
import X.C9KF;
import X.FMX;
import X.InterfaceC252739vx;
import X.KL2;
import X.OW8;
import X.OWA;
import X.OWB;
import X.OWC;
import X.OWE;
import X.ProgressDialogC43241Gy5;
import X.X1D;
import X.X5R;
import Y.ACListenerS21S0101000_2;
import Y.AObjectS14S0001000_13;
import Y.ARunnableS11S1100000_10;
import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.i0;
import defpackage.s1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import o3.IDaS89S0000000_3;
import o3.h0;

/* loaded from: classes11.dex */
public class LocalLiveWallPaperActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJLJ = 0;
    public RecyclerView LJLIL;
    public C73305Spp LJLILLLLZI;
    public OW8 LJLJI;
    public boolean LJLJJI;
    public OWC LJLJJL;
    public boolean LJLJJLL;
    public String LJLJL;

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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", true);
        super.onResume();
        List<LiveWallPaperBean> LIZJ = C31268COy.LJI.LIZJ();
        if (this.LJLILLLLZI != null) {
            if (C79004UzY.LJJIFFI(LIZJ)) {
                this.LJLILLLLZI.setVisibility(0);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_live_wallpaper;
                c2068389v.LJ = Integer.valueOf(R.attr.gp);
                C73305Spp c73305Spp = this.LJLILLLLZI;
                C73306Spq c73306Spq = new C73306Spq();
                c73306Spq.LIZJ = 0;
                c73306Spq.LIZIZ = c2068389v;
                c73306Spq.LIZJ(getString(R.string.tts));
                c73306Spq.LIZIZ(getString(R.string.ttr));
                c73305Spp.setStatus(c73306Spq);
            } else {
                if (!this.LJLJJI) {
                    this.LJLJJI = true;
                    if (!C79004UzY.LJJIFFI(LIZJ)) {
                        for (LiveWallPaperBean liveWallPaperBean : LIZJ) {
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("group_id", liveWallPaperBean.getId());
                            c188727au.LJIIIZ("enter_from", "paper_set");
                            FMX.LJIIL("wall_paper_show", c188727au.LIZ);
                        }
                    }
                }
                this.LJLILLLLZI.setVisibility(8);
            }
        }
        OW8 ow8 = this.LJLJI;
        if (ow8 != null) {
            ((ArrayList) ow8.LJLIL).clear();
            if (!C79004UzY.LJJIFFI(LIZJ)) {
                ((ArrayList) ow8.LJLIL).addAll(LIZJ);
            }
            ow8.notifyDataSetChanged();
        }
        if (this.LJLJJLL) {
            this.LJLJJLL = false;
            if (!C79004UzY.LJJIFFI(LIZJ)) {
                LiveWallPaperBean liveWallPaperBean2 = (LiveWallPaperBean) ListProtector.get(LIZJ, 0);
                if (!TextUtils.isEmpty(liveWallPaperBean2.getVideoUri()) && !TextUtils.isEmpty(liveWallPaperBean2.getVideoUrl())) {
                    LLFII(liveWallPaperBean2);
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", false);
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

    public final void LLFII(LiveWallPaperBean liveWallPaperBean) {
        if (this.LJLJJL == null) {
            OWC owc = new OWC(this);
            this.LJLJJL = owc;
            owc.LJ = new OWE(this, liveWallPaperBean);
        }
        OWC owc2 = this.LJLJJL;
        String videoUrl = liveWallPaperBean.getVideoUrl();
        String videoUri = liveWallPaperBean.getVideoUri();
        owc2.getClass();
        o.LJIIIZ(videoUrl, "videoUrl");
        o.LJIIIZ(videoUri, "videoUri");
        if (owc2.LIZIZ == null) {
            Activity activity = owc2.LIZ;
            ProgressDialogC43241Gy5 LIZIZ = ProgressDialogC43241Gy5.LIZIZ(activity, activity.getString(R.string.hv9));
            LIZIZ.setIndeterminate(false);
            owc2.LIZIZ = LIZIZ;
        }
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = owc2.LIZIZ;
        o.LJI(progressDialogC43241Gy5);
        progressDialogC43241Gy5.setProgress(0);
        String LIZIZ2 = C62011OVj.LIZIZ();
        String LJFF = i0.LJFF(LIZIZ2, "temp");
        if (!C39579Fg7.LIZIZ(LJFF)) {
            C39579Fg7.LJ(LJFF, false);
        }
        StringBuilder LIZ = X1D.LIZ();
        String LIZIZ3 = b1.LIZIZ(videoUri, LIZ, ".mp4", LIZ);
        String LJFF2 = i0.LJFF(LIZIZ2, LIZIZ3);
        owc2.LIZJ = i0.LJFF(LJFF, LIZIZ3);
        if (C39579Fg7.LIZIZ(LJFF2)) {
            C39579Fg7.LJIL(owc2.LIZJ);
            C38816FLg.LIZJ(new ARunnableS11S1100000_10(owc2, LJFF2, 7));
        } else {
            X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(videoUrl);
            with.LIZJ = LIZIZ3;
            with.LJ = LJFF;
            with.LJII = 3;
            with.LJJI = true;
            with.LJIIL = new OWB(owc2, LJFF2);
            with.LIZJ();
            owc2.LIZLLL.postDelayed(new ARunnableS46S0100000_10(owc2, 105), TimeUnit.SECONDS.toMillis(60L));
        }
        String str = this.LJLJL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("wallpaper_start_download", c188727au.LIZ);
    }

    public void findWallpapersTvClick(View view) {
        FMX.onEventV3("click_find_wallpapers");
        C39061g6 c39061g6 = new C39061g6("//search");
        c39061g6.LIZIZ("keyword", "Live Wallpaper");
        c39061g6.LIZIZ("display_keyword", "Live Wallpaper");
        c39061g6.LIZIZ("enter_from", "wallpaper_record");
        c39061g6.LIZIZ("previous_page", "wallpaper_record");
        c39061g6.LIZIZ("enter_method", "wallpaper_record");
        SmartRouter.buildRoute(this, c39061g6.LIZJ()).open();
    }

    public void howSetWallpapersTvClick(View view) {
        FMX.onEventV3("click_how_to_set_wallpapers");
        C118514kx c118514kx = new C118514kx();
        View dialogView = View.inflate(this, R.layout.du0, null);
        ASL asl = new ASL();
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.ttn);
        o.LJIIIIZZ(string, "context.getString(R.string.wallpaper_how_to_set)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS151S0100000_1(c118514kx, 917));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        asl.LIZ.LJLLL = c235119Kp;
        o.LJIIIIZZ(dialogView, "dialogView");
        asl.LIZ.LJLLI = dialogView;
        asl.LJI(0);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        c118514kx.LIZ = tuxSheet;
        UgCommonServiceImpl.LJIJ().LIZIZ();
        View findViewById = dialogView.findViewById(R.id.kfw);
        o.LJIIIIZZ(findViewById, "dialogView.findViewById<…ageView>(R.id.step_1_img)");
        C82802Wec.LJIIJJI((ImageView) findViewById, "58ebd6efcfde32e9d844bd9b920b671c", null);
        View findViewById2 = dialogView.findViewById(R.id.kg0);
        o.LJIIIIZZ(findViewById2, "dialogView.findViewById<…ageView>(R.id.step_2_img)");
        C82802Wec.LJIIJJI((ImageView) findViewById2, "07330e27017db16bbdaf1cdf9153533b", null);
        View findViewById3 = dialogView.findViewById(R.id.kfu);
        o.LJIIIIZZ(findViewById3, "dialogView.findViewById(R.id.step_1_desc)");
        C118514kx.LIZ(this, (TextView) findViewById3, R.raw.icon_arrow_turn_up_right);
        View findViewById4 = dialogView.findViewById(R.id.kfy);
        o.LJIIIIZZ(findViewById4, "dialogView.findViewById(R.id.step_2_desc)");
        C118514kx.LIZ(this, (TextView) findViewById4, R.raw.icon_2pt_live_wallpaper);
        TuxSheet tuxSheet2 = c118514kx.LIZ;
        if (tuxSheet2 != null) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this);
            o.LJI(LJJIFFI);
            FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "context.fragmentActivity)!!.supportFragmentManager");
            tuxSheet2.show(supportFragmentManager, "");
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", true);
        activityConfiguration(new AObjectS14S0001000_13(1, 3));
        super.onCreate(bundle);
        setContentView(R.layout.dty);
        this.LJLIL = (RecyclerView) findViewById(R.id.isn);
        this.LJLILLLLZI = (C73305Spp) findViewById(R.id.kf_);
        View findViewById = findViewById(R.id.d_r);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0101000_2(1, this, 1), findViewById);
            h0.LJIJI(findViewById, new IDaS89S0000000_3(5));
        }
        View findViewById2 = findViewById(R.id.e8_);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0101000_2(3, this, 2), findViewById2);
            h0.LJIJI(findViewById2, new IDaS89S0000000_3(5));
        }
        C252709vu c252709vu = (C252709vu) findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIL(c235119Kp, getString(R.string.ttf), this);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_gear;
        String label = getString(R.string.b48);
        o.LJIIIZ(label, "label");
        LIZJ.LJII = label;
        LIZJ.LIZ = new InterfaceC252739vx() { // from class: X.OWD
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                boolean z;
                LocalLiveWallPaperActivity localLiveWallPaperActivity = LocalLiveWallPaperActivity.this;
                localLiveWallPaperActivity.getClass();
                LiveWallPaperBean liveWallPaperBean = C31268COy.LJI.LIZLLL;
                if (liveWallPaperBean != null) {
                    z = liveWallPaperBean.isShouldMute();
                } else {
                    z = false;
                }
                new OWN().LIZ(localLiveWallPaperActivity, z, "history", null);
            }
        };
        c235119Kp.LIZIZ(LIZJ);
        c252709vu.setNavActions(c235119Kp);
        this.LJLIL.setLayoutManager(new WrapGridLayoutManager(3, 1, false));
        this.LJLIL.setHasFixedSize(true);
        OW8 ow8 = new OW8();
        this.LJLJI = ow8;
        ow8.LJLILLLLZI = new OWA(this);
        RecyclerView recyclerView = this.LJLIL;
        final int LIZJ2 = (int) KL2.LIZJ(this, 1.0f);
        recyclerView.LJII(new AbstractC030309z(LIZJ2) { // from class: X.4lO
            public final int LJLIL;

            {
                this.LJLIL = LIZJ2;
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
                GridLayoutManager gridLayoutManager;
                AbstractC028509h abstractC028509h;
                o.LJIIIZ(outRect, "outRect");
                o.LJIIIZ(view, "view");
                o.LJIIIZ(parent, "parent");
                o.LJIIIZ(state, "state");
                C0A2 layoutManager = parent.getLayoutManager();
                if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null || (abstractC028509h = gridLayoutManager.LLIILII) == null) {
                    return;
                }
                int LJJJJIZL = RecyclerView.LJJJJIZL(view);
                int i = gridLayoutManager.LLIIIL;
                if (abstractC028509h.LJFF(LJJJJIZL) == 1) {
                    int LJ = abstractC028509h.LJ(LJJJJIZL, i);
                    int i2 = this.LJLIL;
                    outRect.left = (LJ * i2) / i;
                    outRect.right = i2 - (((LJ + 1) * i2) / i);
                    if (abstractC028509h.LIZLLL(LJJJJIZL, i) > 0) {
                        outRect.top = this.LJLIL;
                    }
                }
            }
        }, -1);
        this.LJLIL.setAdapter(this.LJLJI);
        this.LJLJJLL = getIntent().getBooleanExtra("is_first_install_launch", false);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "from");
        this.LJLJL = LLJJIJIIJIL;
        if (LLJJIJIIJIL == null) {
            this.LJLJL = "plugin";
        }
        String str = this.LJLJL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("enter_local_live_wallpaper", c188727au.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", false);
    }
}
