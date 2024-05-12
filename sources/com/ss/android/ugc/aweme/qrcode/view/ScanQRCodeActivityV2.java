package com.ss.android.ugc.aweme.qrcode.view;

import X.AbstractC234519Ih;
import X.ActivityC86117Xqz;
import X.C00F;
import X.C109824Ss;
import X.C10K;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C2NU;
import X.C39795Fjb;
import X.C4LD;
import X.C56842Ky;
import X.C58733N3h;
import X.C58737N3l;
import X.C60996Nwm;
import X.C62114OZi;
import X.C62116OZk;
import X.C62122OZq;
import X.C62123OZr;
import X.C62124OZs;
import X.C62125OZt;
import X.C62126OZu;
import X.C62132Oa0;
import X.C65803Ps7;
import X.C6ZT;
import X.C9KF;
import X.DialogC25756A8y;
import X.EF7;
import X.EnumC252729vw;
import X.FMX;
import X.HG3;
import X.InterfaceC252739vx;
import X.InterfaceC26320AUq;
import X.InterfaceC58734N3i;
import X.InterfaceC62130OZy;
import X.InterfaceC62137Oa5;
import X.J9P;
import X.KL2;
import X.M99;
import X.N3P;
import X.OBH;
import X.OX2;
import X.OX5;
import X.OZ2;
import X.QD3;
import X.RBX;
import X.SurfaceHolderCallbackC62131OZz;
import Y.ACallableS113S0100000_10;
import Y.ACallableS37S1100000_10;
import Y.ACallableS59S0300000_10;
import Y.AObjectS29S0000000_6;
import Y.AObjectS52S0101000_7;
import Y.AgS127S0100000_10;
import Y.IDRunnableS6S0101000;
import Y.IDgS348S0100000_7;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVScanSettings;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ScanQRCodeActivityV2 extends ActivityC86117Xqz implements View.OnClickListener, InterfaceC62130OZy, InterfaceC26320AUq {
    public static final /* synthetic */ int LLIIIJ = 0;
    public TextView LJLIL;
    public LinearLayout LJLILLLLZI;
    public C252709vu LJLJI;
    public DialogC25756A8y LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public SurfaceView LJLJLJ;
    public IQRCodeScanner LJLJLLL;
    public OX5 LJLL;
    public C62114OZi LJLLI;
    public AvatarPresenter LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public TextView LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public TextView LJZ;
    public boolean LJZI;
    public ImageView LJZL;
    public FrameLayout LL;
    public RelativeLayout LLD;
    public GestureDetector LLF;
    public ScaleGestureDetector LLFF;
    public GestureDetector LLFFF;
    public boolean LLFZ;
    public C62132Oa0 LLI;
    public QrCodeScanService LLIFFJFJJ;
    public boolean LLII;
    public float LLFII = 1.0f;
    public final C62126OZu LLIIII = new C62126OZu("ScanQRCodeActivityV2");
    public final OX2 LLIIIILZ = new OX2(this);

    @Override // X.InterfaceC26320AUq
    public final void cq(Exception exc) {
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC26320AUq
    public final void yH(AvatarUri avatarUri) {
    }

    public final void LLFII() {
        IQRCodeScanner iQRCodeScanner = this.LJLJLLL;
        if (iQRCodeScanner != null) {
            iQRCodeScanner.closeLight();
        }
        this.LJLLLLLL = false;
        this.LJLLLL.setAlpha(0.8f);
        this.LJLLLL.setText(R.string.hrz);
        Drawable drawable = getResources().getDrawable(R.drawable.c0y);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.LJLLLL.setCompoundDrawables(null, drawable, null, null);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "flash_off");
        FMX.LJIIL("scan_page_click", c188727au.LIZ);
    }

    public final void LLFZ() {
        DialogC25756A8y dialogC25756A8y = this.LJLJJI;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            this.LJLJJI.dismiss();
        }
    }

    public final void LLIIIZ() {
        if (this.LJLJLLL == null) {
            LLIIIILZ(null);
        }
        AVCameraParams aVCameraParams = new AVCameraParams(EF7.LIZIZ(), 1);
        AVScanSettings aVScanSettings = new AVScanSettings();
        aVScanSettings.width = 1280;
        aVScanSettings.height = 720;
        float LJIIIIZZ = C60996Nwm.LJIIIIZZ(this);
        float LJ = C60996Nwm.LJ(this);
        if (C00F.LIZ(31744, 0, "scan_area_enlargement", true) == 1) {
            aVScanSettings.detectRectLeft = 0.0f;
            aVScanSettings.detectRectTop = 0.0f;
            aVScanSettings.detectRectWidth = 1.0f;
            aVScanSettings.detectRectHeight = 1.0f;
        } else {
            aVScanSettings.detectRectLeft = this.LL.getX() / LJIIIIZZ;
            aVScanSettings.detectRectTop = this.LL.getY() / LJ;
            aVScanSettings.detectRectWidth = this.LL.getWidth() / LJIIIIZZ;
            aVScanSettings.detectRectHeight = this.LL.getHeight() / LJ;
        }
        ((C62114OZi) this.LJLL).LJIIJ.LJFF();
        aVScanSettings.detectRequirement = 65536L;
        aVScanSettings.buildChainFlag = 1;
        aVScanSettings.enableDetectRect = true;
        ACallableS59S0300000_10 aCallableS59S0300000_10 = new ACallableS59S0300000_10(aVCameraParams, aVScanSettings, this, 2);
        ExecutorService executorService = C10K.LJI;
        C10K.LIZIZ(aCallableS59S0300000_10, executorService, null).LJ(new AgS127S0100000_10(this, 8), executorService, null).LJ(new AgS127S0100000_10(this, 7), C10K.LJIIIIZZ, null);
    }

    public final void LLIIJI() {
        C10K.LIZJ(new ACallableS113S0100000_10(this, 6));
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C58733N3h.LIZ.LIZIZ(0, "");
        OX5 ox5 = this.LJLL;
        if (ox5 != null) {
            C62114OZi c62114OZi = (C62114OZi) ox5;
            c62114OZi.LIZIZ = null;
            c62114OZi.LIZ = null;
        }
        AvatarPresenter avatarPresenter = this.LJLLILLLL;
        if (avatarPresenter != null) {
            avatarPresenter.dismissProgressDialog();
            this.LJLLILLLL.bindView(null);
        }
        this.LJLL = null;
        C10K.LIZJ(new ACallableS113S0100000_10(this, 3));
        GestureDetector gestureDetector = this.LLF;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        if (this.LJLLLLLL) {
            LLFII();
        }
        this.LJLJLJ.setVisibility(4);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onResume", true);
        this.LLIFFJFJJ.LIZIZ();
        super.onResume();
        this.LJLJLJ.setVisibility(0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onResume", false);
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

    public final void LLII(int i) {
        SurfaceView surfaceView = this.LJLJLJ;
        if (surfaceView != null) {
            surfaceView.postDelayed(new IDRunnableS6S0101000(6, this, 3), i);
        }
    }

    public final void LLIIIILZ(final InterfaceC62137Oa5 interfaceC62137Oa5) {
        this.LJLZ = false;
        AVExternalServiceImpl.LIZ().abilityService().cameraService().getScanner(true, this, this.LJLJLJ.getHolder(), new IAVCameraService.IAVCameraReadyCallback() { // from class: X.Oa1
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVCameraService.IAVCameraReadyCallback
            public final void finish(Object obj) {
                ScanQRCodeActivityV2 scanQRCodeActivityV2 = ScanQRCodeActivityV2.this;
                InterfaceC62137Oa5 interfaceC62137Oa52 = interfaceC62137Oa5;
                IQRCodeScanner iQRCodeScanner = (IQRCodeScanner) obj;
                if (iQRCodeScanner != null) {
                    scanQRCodeActivityV2.LJLJLLL = iQRCodeScanner;
                    if (scanQRCodeActivityV2.LJLL == scanQRCodeActivityV2.LJLLI) {
                        iQRCodeScanner.setScanListener(scanQRCodeActivityV2.LLIIIILZ);
                    }
                } else {
                    scanQRCodeActivityV2.getClass();
                }
                if (interfaceC62137Oa52 != null) {
                    interfaceC62137Oa52.LIZ();
                }
            }
        });
    }

    public final void LLIIIJ(String str) {
        AVScanSettings aVScanSettings = new AVScanSettings();
        aVScanSettings.width = 1280;
        aVScanSettings.height = 720;
        aVScanSettings.buildChainFlag = 1;
        aVScanSettings.detectModelDir = "";
        this.LJLLJ = true;
        this.LJLJLLL.startPicScan(str, aVScanSettings, 1000L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.m_v) {
            if (this.LJLLLLLL) {
                LLFII();
                return;
            }
            IQRCodeScanner iQRCodeScanner = this.LJLJLLL;
            if (iQRCodeScanner != null) {
                iQRCodeScanner.openLight();
            }
            this.LJLLLLLL = true;
            this.LJLLLL.setAlpha(1.0f);
            this.LJLLLL.setText(R.string.hry);
            Drawable drawable = getResources().getDrawable(R.drawable.c0z);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.LJLLLL.setCompoundDrawables(null, drawable, null, null);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("type", "flash_on");
            FMX.LJIIL("scan_page_click", c188727au.LIZ);
            return;
        }
        if (id != R.id.df_ || C6ZT.LIZ(view)) {
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            J9P.LIZIZ(this, "scan", "click_my_qr", null, new IDgS348S0100000_7(this, 0));
            return;
        }
        if (this.LJLJJL) {
            finish();
            return;
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("type", "qr_code");
        FMX.LJIIL("scan_page_click", c188727au2.LIZ);
        C4LD.LIZ.LJFF(this, null, null, null);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LLIIII.LIZ(configuration, "onConfigurationChanged");
        if (this.LLI != null) {
            float LJIIJJI = KL2.LJIIJJI(getBaseContext()) / 2.0f;
            float LJIILL = LJIIJJI - C17N.LJIILL(128.0d);
            float LJIILL2 = C17N.LJIILL(180.0d);
            float LJIILL3 = C17N.LJIILL(435.0d);
            C62132Oa0 c62132Oa0 = this.LLI;
            c62132Oa0.LJLIL = LJIILL2;
            c62132Oa0.LJLILLLLZI = LJIILL3;
            c62132Oa0.LJLJI = LJIILL;
            c62132Oa0.LJLJJI = LJIIJJI + C17N.LJIILL(128.0d);
            c62132Oa0.invalidate();
        }
        this.LJLJLJ.setVisibility(8);
        this.LJLJLJ.setVisibility(0);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String content;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onCreate", true);
        this.LLIIII.LIZ(bundle, "onCreate, init view and data");
        activityConfiguration(new AObjectS29S0000000_6(1));
        super.onCreate(bundle);
        setContentView(R.layout.f6);
        this.LJLJJL = getIntent().getBooleanExtra("enter_from", false);
        this.LJLJJLL = getIntent().getIntExtra("scan_page_from", 0);
        this.LLII = getIntent().getBooleanExtra("camera_only", false);
        this.LJLJL = getIntent().getBooleanExtra("is_kill_self_after_scan", false);
        this.LJLIL = (TextView) findViewById(R.id.mbw);
        this.LJLILLLLZI = (LinearLayout) findViewById(R.id.df_);
        this.LJLJI = (C252709vu) findViewById(R.id.l_2);
        this.LJLLL = false;
        this.LJLJLJ = (SurfaceView) findViewById(R.id.kuj);
        this.LJLLLL = (TextView) findViewById(R.id.m_v);
        this.LJZ = (TextView) findViewById(R.id.m24);
        this.LJZL = (ImageView) findViewById(R.id.jb8);
        findViewById(R.id.mfp);
        this.LL = (FrameLayout) findViewById(R.id.dgc);
        this.LLD = (RelativeLayout) findViewById(R.id.j83);
        this.LJLJLJ.getHolder().addCallback(new SurfaceHolderCallbackC62131OZz(this));
        C16880lQ.LJIIZILJ(this.LJLILLLLZI, this);
        this.LJLIL.setText(getString(R.string.prd));
        C252709vu c252709vu = this.LJLJI;
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZ = new InterfaceC252739vx() { // from class: X.Oa4
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                ScanQRCodeActivityV2.this.finish();
            }
        };
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        LIZLLL.LIZ(getString(R.string.q_s));
        c235119Kp.LIZJ = LIZLLL;
        AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
        C234509Ig c234509Ig = new C234509Ig();
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        if (this.LLII) {
            content = "";
        } else {
            content = getString(R.string.bk4);
        }
        o.LJIIIZ(content, "content");
        c234509Ig.LIZJ = content;
        c234509Ig.LIZ = new C109824Ss(new AObjectS52S0101000_7(0, this, 12));
        abstractC234519IhArr[0] = c234509Ig;
        c235119Kp.LIZIZ(abstractC234519IhArr);
        c235119Kp.LIZJ(0);
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        this.LLIFFJFJJ = QrCodeScanImpl.LJIIJ();
        LLIIIILZ(null);
        C62114OZi c62114OZi = new C62114OZi(this, this);
        this.LJLLI = c62114OZi;
        ArrayList arrayList = new ArrayList();
        c62114OZi.LJIILIIL = arrayList;
        C62116OZk c62116OZk = new C62116OZk(c62114OZi);
        arrayList.add(new C39795Fjb());
        List<InterfaceC58734N3i> list = c62114OZi.LJIILIIL;
        C58733N3h c58733N3h = C58733N3h.LIZ;
        ((ArrayList) list).add(c58733N3h);
        ((ArrayList) c62114OZi.LJIILIIL).add(new C62125OZt(c62116OZk));
        ((ArrayList) c62114OZi.LJIILIIL).add(new C62122OZq(c62116OZk));
        ((ArrayList) c62114OZi.LJIILIIL).add(new C62123OZr(c62116OZk, c62114OZi.LIZ));
        ((ArrayList) c62114OZi.LJIILIIL).add(new C62124OZs(c62116OZk));
        ((ArrayList) c62114OZi.LJIILIIL).add(new OZ2(c62116OZk));
        ArrayList arrayList2 = new ArrayList();
        c62114OZi.LJIILJJIL = arrayList2;
        arrayList2.add(new C39795Fjb());
        ((ArrayList) c62114OZi.LJIILJJIL).add(c58733N3h);
        ((ArrayList) c62114OZi.LJIILJJIL).add(new M99());
        ((ArrayList) c62114OZi.LJIILJJIL).add(new N3P());
        ((ArrayList) c62114OZi.LJIILJJIL).add(new OBH(c62116OZk));
        ((ArrayList) c62114OZi.LJIILJJIL).add(new C58737N3l(c62114OZi.LIZ));
        C62114OZi c62114OZi2 = this.LJLLI;
        this.LJLL = c62114OZi2;
        c62114OZi2.getClass();
        AvatarPresenter avatarPresenter = new AvatarPresenter();
        this.LJLLILLLL = avatarPresenter;
        avatarPresenter.bindView(this);
        this.LJLLILLLL.initHeadUploadHelper(this, null);
        C16880lQ.LJIJI(this.LJLLLL, this);
        if (C2NU.LIZ.LIZIZ()) {
            this.LJZ.setVisibility(8);
            this.LJZI = true;
        } else {
            this.LJZI = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onCreate", false);
    }

    @QD3
    public void onNetStateChangeEvent(C56842Ky c56842Ky) {
        if (isDestroyed()) {
            return;
        }
        if (C2NU.LIZ.LIZIZ()) {
            this.LJZ.setVisibility(8);
            this.LJZI = true;
        } else {
            this.LJZ.setVisibility(0);
            this.LJZI = false;
        }
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.LLF;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        GestureDetector gestureDetector2 = this.LLFFF;
        if (gestureDetector2 != null && gestureDetector2.onTouchEvent(motionEvent)) {
            return true;
        }
        ScaleGestureDetector scaleGestureDetector = this.LLFF;
        if (scaleGestureDetector != null && scaleGestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC26320AUq
    public final void rs0(final String str) {
        if (this.LJLJLLL == null) {
            LLIIIILZ(new InterfaceC62137Oa5() { // from class: X.Oa2
                @Override // X.InterfaceC62137Oa5
                public final void LIZ() {
                    ScanQRCodeActivityV2 scanQRCodeActivityV2 = ScanQRCodeActivityV2.this;
                    String str2 = str;
                    scanQRCodeActivityV2.getClass();
                    C10K.LIZIZ(new ACallableS37S1100000_10(scanQRCodeActivityV2, str2, 3), ExecutorC142245i8.LJLILLLLZI, null);
                }
            });
        } else {
            LLIIIJ(str);
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        OX5 ox5 = this.LJLL;
        if (ox5 != null) {
            ox5.getClass();
        }
        AvatarPresenter avatarPresenter = this.LJLLILLLL;
        if (avatarPresenter != null) {
            avatarPresenter.onActivityResult(i, i2, intent);
        }
    }
}
