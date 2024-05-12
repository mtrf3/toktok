package com.ss.android.ugc.aweme.shortvideo.ui;

import X.ActivityC86117Xqz;
import X.C00F;
import X.C03880Dg;
import X.C145995oB;
import X.C16880lQ;
import X.C1DG;
import X.C32151Nz;
import X.C38891fp;
import X.C42326GjK;
import X.C43150Gwc;
import X.C43882HKc;
import X.C44018HPi;
import X.C44172HVg;
import X.C45804HyK;
import X.C46125I8j;
import X.C58096Mr6;
import X.C5S1;
import X.C61099NyR;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C6BK;
import X.C78605Ut7;
import X.C79000UzU;
import X.FMX;
import X.G8G;
import X.GXR;
import X.H78;
import X.HPI;
import X.HQ7;
import X.HR2;
import X.HR3;
import X.HR5;
import X.HRJ;
import X.HVO;
import X.HVR;
import X.OHQ;
import X.RunnableC23230vf;
import X.U1F;
import X.WM7;
import X.X1D;
import Y.AObjectS127S0200000_7;
import Y.AObjectS12S0001000_7;
import Y.AObjectS24S0000000_7;
import Y.AObjectS42S0110000_7;
import Y.AObjectS44S0400000_7;
import Y.AObjectS52S0101000_7;
import Y.ARunnableS11S0400000_7;
import Y.ARunnableS14S0000000_7;
import Y.ARunnableS14S0101000_10;
import Y.IDeS403S0100000_7;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.DuetDownloadService;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.util.StitchDownloadServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.tools.IStitchDownloadService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class VideoRecordPermissionActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJJI = 0;
    public final ToolSafeHandler LJLIL = new ToolSafeHandler(this);
    public final boolean LJLILLLLZI;
    public ARunnableS11S0400000_7 LJLJI;

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public final void LLFII() {
        int i;
        String LLJJIJIIJIL;
        boolean LJIIIIZZ;
        boolean z;
        Intent intent = getIntent();
        String[] LJIL = C45804HyK.LJIL();
        if (intent.hasExtra("exterior_record_model")) {
            ExteriorRecordModel exteriorRecordModel = (ExteriorRecordModel) intent.getParcelableExtra("exterior_record_model");
            if (exteriorRecordModel.recordPageType.getType() == HR3.PHOTO_SEARCH.getType() || exteriorRecordModel.recordPageType.getType() == HR3.AIGC.getType()) {
                i = exteriorRecordModel.recordPageType.getType();
                LJIL = new String[]{"android.permission.CAMERA"};
                LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "shoot_way");
                LJIIIIZZ = C1DG.LJIIIIZZ();
                if (!Objects.equals(LLJJIJIIJIL, "direct_shoot") || Objects.equals(LLJJIJIIJIL, "single_song") || Objects.equals(LLJJIJIIJIL, "duet") || Objects.equals(LLJJIJIIJIL, "stitch") || Objects.equals(LLJJIJIIJIL, "prop_page") || Objects.equals(LLJJIJIIJIL, "mv_page") || Objects.equals(LLJJIJIIJIL, "collection_music") || Objects.equals(LLJJIJIIJIL, "comment_reply") || Objects.equals(LLJJIJIIJIL, "ugc_template") || Objects.equals(LLJJIJIIJIL, "answer") || Objects.equals(LLJJIJIIJIL, "sub_only_video_page")) {
                    z = true;
                } else {
                    z = false;
                }
                if (LJIIIIZZ && (C78605Ut7.LIZJ(LJIL) || (z && C46125I8j.LIZIZ()))) {
                    overridePendingTransition(0, 0);
                    ToolSafeHandler toolSafeHandler = this.LJLIL;
                    RunnableC23230vf runnableC23230vf = new RunnableC23230vf(10, this);
                    if (!toolSafeHandler.LJLILLLLZI) {
                        toolSafeHandler.post(runnableC23230vf);
                        return;
                    }
                    return;
                }
                if (i != HR3.PHOTO_SEARCH.getType() || i == HR3.AIGC.getType()) {
                    LLII(LJIL, TokenCert.with("bpea-photo_search_only_reuqest_camera_permission_record"));
                }
                if (!C79000UzU.LJ(intent) && this.LJLILLLLZI) {
                    TokenCert with = TokenCert.with("bpea-tools_request_camera_audio_permission_record_new");
                    HR5 hr5 = new HR5(this);
                    hr5.LJLJLJ = new AObjectS44S0400000_7(this, LJIL, hr5, with, 0);
                    hr5.LJLJLLL = new AObjectS127S0200000_7(this, LJIL, 1);
                    String[] LJIILL = C78605Ut7.LJIILL(LJIL);
                    o.LJIIIZ(LJIILL, OHQ.LIZIZ);
                    FMX.LJIIL("permission_rationale_page_show", HVO.LIZ(LJIILL, this, null));
                    if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPagePermissionRationaleDialog", "show", hr5, new Object[0], "void", new C65300Pk0(false, "()V", "956596784555099128")).LIZ) {
                        hr5.show();
                    }
                    this.LJLJI = new ARunnableS11S0400000_7(with, this, LJIL, hr5, 2);
                    U1F.LJFF(this, 7);
                    return;
                }
                LLII(LJIL, TokenCert.with("bpea-tools_request_camera_audio_permission_record"));
                return;
            }
        }
        i = -1;
        LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "shoot_way");
        LJIIIIZZ = C1DG.LJIIIIZZ();
        if (!Objects.equals(LLJJIJIIJIL, "direct_shoot")) {
        }
        z = true;
        if (LJIIIIZZ) {
        }
        if (i != HR3.PHOTO_SEARCH.getType()) {
        }
        LLII(LJIL, TokenCert.with("bpea-photo_search_only_reuqest_camera_permission_record"));
    }

    public final void LLIIIILZ() {
        G8G.LIZ.step("av_video_record_init", "startVideoRecordActivity");
        if (isFinishing() || isDestroyed() || isDestroyed()) {
            C43150Gwc.LIZ("2");
            return;
        }
        HRJ.LIZ.execute(new ARunnableS14S0000000_7(2));
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        C44018HPi.LIZJ(this, getIntent(), new AObjectS42S0110000_7(this, 0));
    }

    public VideoRecordPermissionActivity() {
        this.LJLILLLLZI = C00F.LIZ(31744, 0, "studio_authorization_optimization_shooting_page_style", true) == 1;
        this.LJLJI = null;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZ(this);
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        ARunnableS11S0400000_7 aRunnableS11S0400000_7 = this.LJLJI;
        if (aRunnableS11S0400000_7 != null) {
            aRunnableS11S0400000_7.run();
            this.LJLJI = null;
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
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

    public static boolean LLFZ(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("enter_record_from_other_platform", false)) {
            return false;
        }
        return true;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        IStitchDownloadService iStitchDownloadService;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", true);
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = (DuetAndStitchRouterConfig) getIntent().getParcelableExtra("duet_and_stitch_router_config");
        String str = "";
        if (duetAndStitchRouterConfig != null) {
            str = duetAndStitchRouterConfig.enterMethod;
        }
        boolean equals = "duet_and_stitch_jsb".equals(str);
        if (equals) {
            activityConfiguration(new AObjectS12S0001000_7(1, 0));
        }
        super.onCreate(bundle);
        if (Boolean.valueOf(equals).booleanValue() && duetAndStitchRouterConfig != null) {
            String str2 = duetAndStitchRouterConfig.type;
            if ("use_duet".equals(str2)) {
                DuetDownloadService.LIZJ().LIZIZ(this, duetAndStitchRouterConfig);
            } else if ("use_stitch".equals(str2)) {
                Object LIZ = C58096Mr6.LIZ(IStitchDownloadService.class, false);
                if (LIZ != null) {
                    iStitchDownloadService = (IStitchDownloadService) LIZ;
                } else {
                    if (C58096Mr6.f7 == null) {
                        synchronized (IStitchDownloadService.class) {
                            if (C58096Mr6.f7 == null) {
                                C58096Mr6.f7 = new StitchDownloadServiceImpl();
                            }
                        }
                    }
                    iStitchDownloadService = C58096Mr6.f7;
                }
                iStitchDownloadService.LIZ(this, duetAndStitchRouterConfig);
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
            return;
        }
        G8G.LIZ.start("av_video_record_init", "startToolPermissionActivity");
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Intent intent2 = getIntent();
        c42326GjK.getClass();
        C42326GjK.LIZJ(this, intent2, bundle);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI(WM7.SCENE_SERVICE, "permission_enter");
        GXR.LIZ("tools_performance_permission", c145995oB.LIZ);
        boolean booleanExtra = getIntent().getBooleanExtra("enter_record_directly_from_system", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("recreate_record_activity_support", false);
        if (booleanExtra) {
            C43150Gwc.LIZIZ("camera_error", "2", "recording");
            finish();
        } else if (LLFZ(getIntent()) && C44172HVg.LJ()) {
            C43150Gwc.LIZIZ("camera_error", "2", "recording");
            finish();
        } else {
            Intent intent3 = getIntent();
            if ((intent3 != null && "main".equals(C16880lQ.LLJJIJIIJIL(intent3, "from"))) || LLFZ(getIntent()) || (((intent = getIntent()) != null && TextUtils.equals(C16880lQ.LLJJIJIIJIL(intent, "shoot_way"), "ec_photo_search")) || !C44172HVg.LJ() || booleanExtra2)) {
                LLFII();
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Recording status:");
                LIZ2.append(C44172HVg.LIZ());
                LIZ2.append(" recreatedSupport: ");
                LIZ2.append(booleanExtra2);
                H78.LIZ(X1D.LIZIZ(LIZ2));
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("event", "isRecording");
                c6bk.LIZ.put("user_info", C44172HVg.LIZ());
                C43882HKc.LIZIZ("record", c6bk.LJ());
                HQ7 hq7 = C44172HVg.LJIJ;
                if (hq7 != null && hq7.getCurrentUser() != null && hq7.getCurrentUser().LJIIL()) {
                    Context applicationContext = getApplicationContext();
                    if (C38891fp.LJLJI && applicationContext == null) {
                        applicationContext = C38891fp.LJLILLLLZI;
                    }
                    C5S1 c5s1 = new C5S1(applicationContext);
                    c5s1.LIZJ(R.string.pya);
                    c5s1.LJ();
                    C43150Gwc.LIZIZ("camera_error", "2", "recording");
                } else {
                    Context applicationContext2 = getApplicationContext();
                    if (C38891fp.LJLJI && applicationContext2 == null) {
                        applicationContext2 = C38891fp.LJLILLLLZI;
                    }
                    C5S1 c5s12 = new C5S1(applicationContext2);
                    c5s12.LIZJ(R.string.gl9);
                    c5s12.LJ();
                    C43150Gwc.LIZIZ("camera_error", "2", "recording");
                }
                finish();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZJ(this, intent, null);
        if (LLFZ(intent)) {
            LLFII();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        getIntent();
        c42326GjK.getClass();
        C42326GjK.LJI(this, bundle);
    }

    public final void LLII(String[] strArr, TokenCert cert) {
        overridePendingTransition(0, 0);
        HVR hvr = HVR.LIZ;
        Map LIZIZ = HVR.LIZIZ(this);
        HPI hpi = new HPI() { // from class: X.HQH
            @Override // X.HPI
            public final void LIZ(int[] iArr, String[] strArr2) {
                VideoRecordPermissionActivity videoRecordPermissionActivity = VideoRecordPermissionActivity.this;
                C44108HSu.LJIIIIZZ(videoRecordPermissionActivity.getIntent(), HRG.SUCCESS, null);
                videoRecordPermissionActivity.LLIIIILZ();
            }
        };
        AObjectS24S0000000_7 aObjectS24S0000000_7 = new AObjectS24S0000000_7(0);
        AObjectS52S0101000_7 aObjectS52S0101000_7 = new AObjectS52S0101000_7(2, this, 16);
        AObjectS52S0101000_7 aObjectS52S0101000_72 = new AObjectS52S0101000_7(2, this, 19);
        o.LJIIIZ(cert, "cert");
        HVR.LJI(hvr, this, strArr, new HR2(this, strArr, LIZIZ, aObjectS24S0000000_7, aObjectS52S0101000_7, aObjectS52S0101000_72), hpi, cert);
    }

    public final void LLIIIJ(String[] strArr, final HR5 hr5, TokenCert tokenCert) {
        HVO.LIZJ(strArr, this, "shoot_page");
        C61099NyR.LIZIZ.LIZIZ(this, tokenCert).LIZ(strArr).LIZJ(new IDeS403S0100000_7(new HPI() { // from class: X.HR6
            @Override // X.HPI
            public final void LIZ(int[] iArr, String[] strArr2) {
                VideoRecordPermissionActivity videoRecordPermissionActivity = VideoRecordPermissionActivity.this;
                HR5 hr52 = hr5;
                videoRecordPermissionActivity.getClass();
                HVO.LIZIZ(strArr2, iArr, videoRecordPermissionActivity, "shoot_page");
                if (C78605Ut7.LIZIZ(iArr)) {
                    ToolSafeHandler toolSafeHandler = videoRecordPermissionActivity.LJLIL;
                    ARunnableS14S0101000_10 aRunnableS14S0101000_10 = new ARunnableS14S0101000_10(7, videoRecordPermissionActivity, 8);
                    if (!toolSafeHandler.LJLILLLLZI) {
                        toolSafeHandler.post(aRunnableS14S0101000_10);
                        return;
                    }
                    return;
                }
                hr52.LJIJJ();
                if (C78605Ut7.LJIL(hr52.LJLJI, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"})) {
                    TuxTextView tuxTextView = hr52.LJLJL;
                    if (tuxTextView == null) {
                        return;
                    }
                    tuxTextView.setText(hr52.getContext().getString(R.string.rth));
                    return;
                }
                TuxTextView tuxTextView2 = hr52.LJLJL;
                if (tuxTextView2 == null) {
                    return;
                }
                tuxTextView2.setText(hr52.getContext().getString(R.string.rtj));
            }
        }, 2));
    }
}
