package com.ss.android.ugc.aweme.ftc;

import X.AbstractActivityC44111HSx;
import X.C0I0;
import X.C13860gY;
import X.C145995oB;
import X.C1536161d;
import X.C16880lQ;
import X.C17N;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C2YJ;
import X.C32151Nz;
import X.C38499F9b;
import X.C38987FRv;
import X.C41658GWo;
import X.C42326GjK;
import X.C43014GuQ;
import X.C43150Gwc;
import X.C43154Gwg;
import X.C43212Gxc;
import X.C43841HIn;
import X.C44024HPo;
import X.C44172HVg;
import X.C44217HWz;
import X.C44228HXk;
import X.C44238HXu;
import X.C44298Ha2;
import X.C44350Has;
import X.C44384HbQ;
import X.C44422Hc2;
import X.C45849Hz3;
import X.C45857HzB;
import X.C45864HzI;
import X.C46193IAz;
import X.C48331Ixz;
import X.C5HC;
import X.C60903NvH;
import X.C62822Ol8;
import X.C63942P7q;
import X.C65803Ps7;
import X.C6FB;
import X.C6Z6;
import X.C77413UZt;
import X.C78688UuS;
import X.C82622Wbi;
import X.C83576Wr6;
import X.C83651WsJ;
import X.C83728WtY;
import X.C83932Wwq;
import X.FMX;
import X.FRD;
import X.G8G;
import X.H78;
import X.H8V;
import X.HB3;
import X.HB4;
import X.HEO;
import X.HEP;
import X.HF7;
import X.HTP;
import X.HVR;
import X.HX3;
import X.HX4;
import X.HXF;
import X.HXH;
import X.HXO;
import X.HXP;
import X.HXT;
import X.HYQ;
import X.HZQ;
import X.I0N;
import X.I37;
import X.I3X;
import X.InterfaceC144185lG;
import X.InterfaceC29911Fj;
import X.InterfaceC45540Hu4;
import X.InterfaceC45889Hzh;
import X.InterfaceC45925I0r;
import X.InterfaceC45999I3n;
import X.InterfaceC80245VeT;
import X.LSC;
import X.OI1;
import X.Q8V;
import X.QD3;
import X.U1F;
import X.V0N;
import X.WG0;
import X.WLY;
import X.WM7;
import X.WRQ;
import X.X1D;
import Y.AObjectS52S0101000_7;
import Y.AObjectS86S0100000_7;
import Y.ARunnableS11S0101000_7;
import Y.ARunnableS12S0101000_8;
import Y.IDObserverS9S0101000;
import Y.IDRunnableS6S0101000;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.als.ApiCenter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes8.dex */
public class FTCVideoRecordNewActivity extends AbstractActivityC44111HSx implements InterfaceC45540Hu4, WLY {
    public static final /* synthetic */ int LLIIZ = 0;
    public C82622Wbi LJLLI;
    public ShortVideoContext LJLLILLLL;
    public C83576Wr6 LJLLLLLL;
    public FrameLayout LJLZ;
    public FrameLayout LJZ;
    public View LJZI;
    public FrameLayout LJZL;
    public List<String> LL;
    public Effect LLD;
    public boolean LLF;
    public String LLFF;
    public String LLFFF;
    public C45849Hz3 LLFZ;
    public HXO LLI;
    public FrameLayout LLIIII;
    public int LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public WRQ LLIIJI;
    public I3X LLIIJLIL;
    public HYQ LLIIL;
    public I37 LLIILII;
    public I0N LLIILZL;
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AObjectS52S0101000_7(1, this, 2));
    public final List<InterfaceC144185lG> LJLLJ = new ArrayList();
    public final List<C5HC> LJLLL = new ArrayList();
    public final SafeHandler LJLLLL = new SafeHandler(this);
    public final HXT LLFII = new HXT();
    public boolean LLIFFJFJJ = false;
    public boolean LLII = false;
    public volatile boolean LLIIIILZ = true;

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC c5hc) {
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        return new C43212Gxc(0);
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
        if (this.LJLLILLLL != null) {
            C6FB LLIIIJ = LLIIIJ();
            View view = this.LJZI;
            CameraComponentModel cameraComponentModel = this.LJLLILLLL.cameraComponentModel;
            LLIIIJ.LJII(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, view);
        }
    }

    public final I0N LLILLIZIL() {
        if (this.LLIILZL == null) {
            this.LLIILZL = (I0N) this.LJLLI.LJIIIIZZ(null, I0N.class);
        }
        return this.LLIILZL;
    }

    public final InterfaceC45925I0r LLILLJJLI() {
        return (InterfaceC45925I0r) ((ApiCenter) this.LJLL.getValue()).LIZJ(InterfaceC45925I0r.class);
    }

    public final void LLILZ() {
        this.LLIIJI.e8().LLLLLJIL(new C83932Wwq(new C43841HIn(this.LJLLILLLL.cameraComponentModel.mWorkspace)), this.LJLLILLLL.cameraComponentModel.mWorkspace.y().getAbsolutePath());
    }

    public FTCVideoRecordNewActivity() {
        new ArrayList();
    }

    public final void LLILIL() {
        C45849Hz3 c45849Hz3;
        if (isFinishing()) {
            return;
        }
        G8G.LIZ.step("av_video_record_init", "addFragment");
        H78.LIZ("addFragment PlanC");
        HXO hxo = this.LLI;
        if (hxo != null) {
            hxo.LIZIZ();
            this.LLI = null;
            ((ViewGroup) findViewById(R.id.irq)).removeAllViews();
        }
        Intent intent = getIntent();
        if (intent == null) {
            c45849Hz3 = new C45849Hz3(getIntent());
        } else {
            c45849Hz3 = new C45849Hz3(intent);
        }
        this.LLFZ = c45849Hz3;
        c45849Hz3.LJLILLLLZI = new ARunnableS11S0101000_7(3, this, 3);
        HEP hep = new HEP(this, C45849Hz3.class);
        hep.LJI = false;
        hep.LJII = new InterfaceC80245VeT() { // from class: X.HX8
            @Override // X.InterfaceC80245VeT
            public final WM7 LIZ(ClassLoader classLoader, String str) {
                FTCVideoRecordNewActivity fTCVideoRecordNewActivity = FTCVideoRecordNewActivity.this;
                fTCVideoRecordNewActivity.getClass();
                if (TextUtils.equals(C45849Hz3.class.getName(), str)) {
                    return fTCVideoRecordNewActivity.LLFZ;
                }
                return null;
            }
        };
        hep.LIZLLL = false;
        hep.LJ = false;
        hep.LJFF = R.id.irq;
        this.LLI = hep.LIZ();
    }

    @Override // X.AbstractActivityC44111HSx, X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        Intent intent;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "backurl");
        Intent intent2 = getIntent();
        if (intent2 != null && intent2.getSerializableExtra("micro_app_info") != null) {
            MicroAppModel microAppModel = (MicroAppModel) getIntent().getSerializableExtra("micro_app_info");
            HEO miniAppService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getMiniAppService();
            String str = microAppModel.appId;
            miniAppService.getClass();
            C38499F9b.LIZ.LIZIZ().tryMoveMiniAppActivityToFront(str);
        }
        super.finish();
        if (this.LLFZ != null) {
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                I3X i3x = this.LLIIJLIL;
                if (i3x != null) {
                    i3x.LJJZ(false);
                }
            } else {
                runOnUiThread(new IDRunnableS6S0101000(4, this, 9));
            }
        }
        if (!TextUtils.isEmpty(LLJJIJIIJIL) && (((intent = getIntent()) == null || intent.getSerializableExtra("micro_app_info") == null) && !TextUtils.isEmpty(LLJJIJIIJIL) && !TextUtils.equals("__BACKURL__", LLJJIJIIJIL))) {
            try {
                Uri parse = UriProtector.parse(LLJJIJIIJIL);
                Intent intent3 = new Intent();
                intent3.setData(parse);
                intent3.setAction("android.intent.action.VIEW");
                intent3.addCategory("android.intent.category.BROWSABLE");
                intent3.setComponent(null);
                intent3.setSelector(null);
                startActivityIfNeeded(intent3, -1);
                moveTaskToBack(true);
            } catch (Exception unused) {
            }
        }
        U1F.LIZJ(this, 3);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ShortVideoContext shortVideoContext = this.LJLLILLLL;
        if (shortVideoContext.mToLive || shortVideoContext.duetFromUser != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && getWindow().getDecorView().getRootWindowInsets() == null) {
            return;
        }
        this.LLIIJI.e8().getMediaController().M8(OI1.LIZ((ViewGroup.MarginLayoutParams) this.LJZI.getLayoutParams(), getWindow(), this.LLIIIZ));
    }

    @Override // X.AbstractActivityC44111HSx, X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        HXH.LIZ.clear();
        HXH.LIZIZ.clear();
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C44350Has().LIZ(this, IVideoRecordPreferences.class);
        if (iVideoRecordPreferences != null && iVideoRecordPreferences.isFirstEnterRecordPage(true)) {
            iVideoRecordPreferences.setFirstEnterRecordPage(false);
        }
        C44172HVg.LJI.LJIL();
        C43014GuQ.LJII(false);
        this.LLFZ = null;
        EventBus.LIZJ().LJIJ(this);
        HTP htp = HTP.LJLJL;
        htp.LJLILLLLZI = null;
        htp.LJLIL.sendEmptyMessage(1);
        C43150Gwc.LIZ = false;
        C43150Gwc.LIZIZ = false;
        C43150Gwc.LIZJ = false;
        C41658GWo.LIZLLL().LJFF();
        G8G.LIZ.leave(this, "record");
        C44422Hc2.LIZIZ();
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZ(this);
        C83728WtY.LIZIZ.LIZ.getClass();
        C83651WsJ.LIZ = null;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        this.LLII = false;
        HTP.LJLJL.LIZ();
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        ShortVideoContext shortVideoContext = this.LJLLILLLL;
        c44298Ha2.pause(this, "record", shortVideoContext.shootWay, shortVideoContext.LJI());
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onResume", true);
        H78.LIZ("VideoRecordNewActivity => onResume start");
        super.onResume();
        this.LLII = true;
        if (this.LLIFFJFJJ) {
            HF7 hf7 = C44172HVg.LJJIFFI;
            C77413UZt.LJJIIJ();
            hf7.getClass();
            this.LLIFFJFJJ = false;
        }
        if (C48331Ixz.LJ()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI(WM7.SCENE_SERVICE, "resume_record");
            c145995oB.LJI("shoot_way", this.LJLLILLLL.shootWay);
            c145995oB.LJI("creation_id", this.LJLLILLLL.LJI());
            c145995oB.LJI("enter_from", this.LJLLILLLL.enterFrom);
            HTP.LJLJL.getClass();
            c145995oB.LIZIZ(0L, "dalvikPss");
            c145995oB.LIZIZ(0L, "nativePss");
            c145995oB.LIZIZ(0L, "otherPss");
            c145995oB.LIZIZ(0L, "totalPss");
            FMX.LJIIL("av_memory_log", c145995oB.LIZ);
        }
        H78.LIZ("VideoRecordNewActivity => onResume end");
        HTP.LJLJL.LIZJ(this, this.LJLZ);
        HVR.LIZ.LJIIIZ(this, new AObjectS52S0101000_7(0, this, 17));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onStart", true);
        super.onStart();
        C45857HzB.LIZ(new C44024HPo());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        I3X i3x = this.LLIIJLIL;
        if (i3x != null) {
            i3x.LJJZ(false);
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

    @Override // X.WLY
    public final C83576Wr6 LJJJJJL() {
        return this.LJLLLLLL;
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
        InterfaceC45999I3n interfaceC45999I3n;
        this.LLIIIZ = z;
        C45849Hz3 c45849Hz3 = this.LLFZ;
        if (c45849Hz3 != null && (interfaceC45999I3n = (InterfaceC45999I3n) c45849Hz3.getDiContainer().LJIIIIZZ(null, InterfaceC45999I3n.class)) != null) {
            interfaceC45999I3n.Uw(z);
        }
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
        InterfaceC45999I3n interfaceC45999I3n;
        C45849Hz3 c45849Hz3 = this.LLFZ;
        if (c45849Hz3 != null && (interfaceC45999I3n = (InterfaceC45999I3n) c45849Hz3.getDiContainer().LJIIIIZZ(null, InterfaceC45999I3n.class)) != null) {
            interfaceC45999I3n.cG(z);
        }
    }

    public final void LLILLL(Bundle bundle) {
        List<String> list;
        boolean z;
        boolean z2;
        if (bundle != null) {
            this.LJLLILLLL = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initData with outState,shortVideoContext is NULL:");
            if (this.LJLLILLLL == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C13860gY.LIZIZ(LIZ, z2, LIZ);
        }
        if (this.LJLLILLLL == null) {
            C60903NvH.LJIIJJI().LJIJ();
            this.LJLLILLLL = HB3.LIZJ(C16880lQ.LLJJIJI(getIntent()), this, null);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("initData with intent,shortVideoContext is NULL:");
            if (this.LJLLILLLL == null) {
                z = true;
            } else {
                z = false;
            }
            C13860gY.LIZIZ(LIZ2, z, LIZ2);
        }
        this.LLFF = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_sticker_from");
        this.LLFFF = C16880lQ.LLJJIJIIJIL(getIntent(), "grade_key");
        String str = this.LJLLILLLL.shootWay;
        if (str != null) {
            String str2 = FaceStickerBean.sCurPropSource;
            switch (str.hashCode()) {
                case -1731750228:
                    if (str.equals("single_song")) {
                        str2 = "single_song";
                        break;
                    }
                    break;
                case -1098262888:
                    if (str.equals("prop_reuse")) {
                        str2 = "prop_reuse";
                        break;
                    }
                    break;
                case 3449699:
                    if (str.equals("prop")) {
                        str2 = "homepage_prop_maker";
                        break;
                    }
                    break;
                case 3524221:
                    if (str.equals("scan")) {
                        str2 = "qr_code";
                        break;
                    }
                    break;
                case 669986889:
                    if (str.equals("direct_shoot")) {
                        str2 = "direct_shoot";
                        break;
                    }
                    break;
                case 1402633315:
                    if (str.equals("challenge")) {
                        str2 = "challenge";
                        break;
                    }
                    break;
            }
            FaceStickerBean.sCurPropSource = str2;
        }
        C41658GWo LIZLLL = C41658GWo.LIZLLL();
        ShortVideoContext shortVideoContext = this.LJLLILLLL;
        LIZLLL.LIZIZ = shortVideoContext.shootWay;
        HB4.LJFF(shortVideoContext.creativeInfo);
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ViewModelProviders.of(this).get(ShortVideoContextViewModel.class);
        ShortVideoContext shortVideoContext2 = this.LJLLILLLL;
        shortVideoContextViewModel.LJLIL = shortVideoContext2;
        shortVideoContextViewModel.LJLILLLLZI.put("shoot_mode", Integer.valueOf(shortVideoContext2.shootMode));
        this.LLF = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.LL = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        this.LLD = (Effect) getIntent().getParcelableExtra("first_sticker");
        C16880lQ.LLJJIJIIJIL(getIntent(), "update_effect_id");
        getIntent().getParcelableArrayListExtra("update_effect_extra");
        if (C2YJ.LIZIZ.LIZ.getStickerUpdateApp().booleanValue() && "direct_shoot".equals(this.LJLLILLLL.shootWay) && this.LLD == null && ((list = this.LL) == null || list.size() == 0)) {
            C44172HVg.LJIIZILJ.getClass();
            String LJIIIZ = PropReuseServiceImpl.LJIIJ().LJIIIZ(this);
            if (!TextUtils.isEmpty(LJIIIZ)) {
                ArrayList arrayList = new ArrayList();
                this.LL = arrayList;
                arrayList.add(LJIIIZ);
            }
        }
        if (!TextUtils.isEmpty(C16880lQ.LLJJIJIIJIL(getIntent(), "star_atlas_object"))) {
            this.LJLLILLLL.creativeModel.commerceModel.getTcmModel().setOuterTcmOrder(C16880lQ.LLJJIJIIJIL(getIntent(), "star_atlas_object"));
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "music_origin");
        ShortVideoContext shortVideoContext3 = this.LJLLILLLL;
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "original";
        }
        shortVideoContext3.LJJIL(LLJJIJIIJIL);
        C44228HXk.LJIIJ();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            InterfaceC45889Hzh interfaceC45889Hzh = (InterfaceC45889Hzh) C0I0.LIZ(this).LIZJ(InterfaceC45889Hzh.class);
            if (interfaceC45889Hzh != null) {
                interfaceC45889Hzh.dismissSuperEntranceEvent();
            }
            InterfaceC45889Hzh interfaceC45889Hzh2 = (InterfaceC45889Hzh) C0I0.LIZ(this).LIZJ(InterfaceC45889Hzh.class);
            if (interfaceC45889Hzh2 != null) {
                interfaceC45889Hzh2.dismissUploadPopEntranceEvent();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.LLIIIJ;
        int i2 = configuration.screenWidthDp;
        if (i != i2) {
            this.LLIIIJ = i2;
            C6FB LLIIIJ = LLIIIJ();
            View view = this.LJZI;
            CameraComponentModel cameraComponentModel = this.LJLLILLLL.cameraComponentModel;
            LLIIIJ.LJII(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, view);
        }
    }

    @Override // X.AbstractActivityC44111HSx, X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        byte b;
        boolean z;
        boolean z2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", true);
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        c44298Ha2.enter(this, "record");
        C83728WtY.LIZIZ.LIZ(HX4.SHOOT);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Intent intent = getIntent();
        c42326GjK.getClass();
        C42326GjK.LIZJ(this, intent, bundle);
        LLILLL(bundle);
        WG0.LJI.LJIIIZ(this);
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLLILLLL.creativeModel.musicBuzModel);
        if (extractAVMusic != null && extractAVMusic.getDuration() > 0) {
            this.LJLLILLLL.LJJIJLIJ(extractAVMusic.getDuration());
        }
        C78688UuS.LJIIJ(this, new AqS173S0100000_7(this, 320));
        C44384HbQ.LJII(this, new AqS173S0100000_7(this, 321));
        C82622Wbi c82622Wbi = C44384HbQ.LJJIZ(this).LJLLL;
        this.LJLLI = c82622Wbi;
        this.LLIIJI = (WRQ) c82622Wbi.LJ(WRQ.class, null);
        this.LLIIJLIL = (I3X) this.LJLLI.LJ(I3X.class, null);
        this.LLIIL = (HYQ) this.LJLLI.LJ(HYQ.class, null);
        this.LJLLLLLL = this.LLIIJI.e20();
        this.LJZI = this.LLIIJI.K5();
        this.LJLLLL.postDelayed(new ARunnableS12S0101000_8(3, this, 2), 2000L);
        this.LLIIJI.ip0().LIZIZ(this, new AObjectS86S0100000_7(this, LiveCoverMinSizeSetting.DEFAULT));
        this.LLIIJI.LLL().observe(this, new IDObserverS9S0101000(1, this, 5));
        this.LLIIJLIL.Ra0().LIZLLL(this, new InterfaceC29911Fj() { // from class: X.HJ2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                FTCVideoRecordNewActivity fTCVideoRecordNewActivity = FTCVideoRecordNewActivity.this;
                HJ3 event = (HJ3) obj;
                fTCVideoRecordNewActivity.getClass();
                o.LJIIIZ(event, "event");
                ShortVideoContext shortVideoContext = fTCVideoRecordNewActivity.LJLLILLLL;
                fTCVideoRecordNewActivity.LJLLI.LJ(H9R.class, null);
                CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
                if (cameraComponentModel.mRestoreType == 1 && shortVideoContext.draftToEditFrom == 0 && !cameraComponentModel.isRetakeMode && !shortVideoContext.LJJIFFI()) {
                    C41658GWo.LIZLLL().LJI = "";
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("enter_from", "video_shoot_page");
                    c145995oB.LJI("creation_id", shortVideoContext.LJI());
                    if (shortVideoContext.draftId != 0) {
                        c145995oB.LIZLLL("creation_id", shortVideoContext.LJI());
                    }
                    if (shortVideoContext.draftToEditFrom == 0) {
                        c145995oB.LIZLLL("draft_way", "general_draft_list");
                    }
                    GXR.LIZ("click_draft_edit_cancel", c145995oB.LIZ);
                    if (shortVideoContext.draftToEditFrom == 0) {
                        C60903NvH.LJIIJJI().LJIILL().LJ().refreshData();
                        SmartRoute buildRoute = SmartRouter.buildRoute(fTCVideoRecordNewActivity, "//kids/main");
                        buildRoute.withParam("key_init_page_index", 4);
                        buildRoute.open();
                    }
                }
                Bundle LIZLLL = C60903NvH.LJIIJJI().LJIL().LIZLLL(fTCVideoRecordNewActivity);
                if (LIZLLL != null && LIZLLL.getBoolean("navigate_back_to_main", false)) {
                    C44172HVg.LIZJ.getClass();
                    Intent intent2 = new Intent(fTCVideoRecordNewActivity, (Class<?>) SplashActivity.class);
                    try {
                        C78598Ut0.LJIJJ(intent2, fTCVideoRecordNewActivity);
                        fTCVideoRecordNewActivity.startActivity(intent2);
                    } catch (Exception unused) {
                        C6BK c6bk = new C6BK();
                        c6bk.LIZ.put("event", "crash");
                        C43882HKc.LIZIZ("returnmain", c6bk.LJ());
                    }
                }
                if (shortVideoContext.mFromOtherPlatform) {
                    fTCVideoRecordNewActivity.setResult(-1);
                }
                if (shortVideoContext.cameraComponentModel.isRetakeMode) {
                    H9R.LJII(new C43594H9a(fTCVideoRecordNewActivity, fTCVideoRecordNewActivity.LLIIJLIL.J0(), shortVideoContext, fTCVideoRecordNewActivity.LLIIJI.getCameraFacing()));
                    return;
                }
                if (shortVideoContext.LJJIJIIJI()) {
                    H9R.LJII(new C43599H9f(fTCVideoRecordNewActivity, event.LJLIL));
                    return;
                }
                if (shortVideoContext.cameraComponentModel.mRestoreType != 1) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("current restoreType is ");
                    LIZ.append(shortVideoContext.cameraComponentModel.mRestoreType);
                    H78.LIZJ(X1D.LIZIZ(LIZ));
                    H9R.LJII(new C43600H9g(fTCVideoRecordNewActivity));
                    return;
                }
                H9R.LJII(new C43600H9g(fTCVideoRecordNewActivity));
            }
        });
        this.LLIILII = (I37) this.LJLLI.LJ(I37.class, null);
        H78.LIZ("VideoRecordNewActivity => onCreate start");
        C41658GWo.LIZLLL().getClass();
        c44298Ha2.step("av_video_record_init", "onCreate");
        C45857HzB.LIZ(new C44024HPo());
        C45857HzB.LIZ(new C45864HzI(this));
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            U1F.LJFF(this, 3);
        } else if (getIntent().getIntExtra("translation_type", 0) == 1) {
            U1F.LJFF(this, 1);
        }
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.ayy);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.LLIIIJ = i;
        if (!C17N.LJIIIIZZ(this)) {
            H78.LIZ("RecordConditionCheck.check() false");
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", false);
            return;
        }
        if (FRD.LIZ()) {
            b = 15;
        } else {
            b = 7;
        }
        C63942P7q.LJII(b);
        this.LJLZ = (FrameLayout) findViewById(R.id.j71);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fmm);
        this.LJZ = frameLayout;
        frameLayout.addView(this.LLIIJI.e8().getViewFunction().getView());
        C46193IAz c46193IAz = (C46193IAz) this.LJLLI.LJ(C46193IAz.class, null);
        c46193IAz.If0(new C44217HWz(this));
        this.LLIIJLIL.Rr0().LIZLLL(this, new AObjectS86S0100000_7(c46193IAz, 251));
        c46193IAz.LLZL().LIZIZ(new C44238HXu());
        List<Fragment> LJJJJLI = getSupportFragmentManager().LJJJJLI();
        if (C32151Nz.LJJIIZI(LJJJJLI)) {
            LJJJJLI.getClass();
            ArrayList arrayList = new ArrayList();
            for (Fragment fragment : LJJJJLI) {
                if (Boolean.valueOf(fragment instanceof AbstractStickerFragment).booleanValue()) {
                    arrayList.add(fragment);
                }
            }
            if (C32151Nz.LJJIIZI(arrayList)) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LIZ.LJJI((Fragment) it.next());
                }
                LIZ.LJI();
            }
        }
        C45857HzB.LIZ(new HX3());
        H8V.LIZIZ(this.LJLLILLLL);
        C44172HVg.LIZJ.getClass();
        C38987FRv.LJI(LSC.valueOf("SHOOT"));
        getLifecycle().addObserver(AudioFocusManager.LIZ(this));
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.fim);
        this.LLIIII = frameLayout2;
        ShortVideoContext shortVideoContext = this.LJLLILLLL;
        if (shortVideoContext.enterMvThemeEffect != null) {
            z = true;
        } else {
            z = false;
        }
        if (!shortVideoContext.mToLive && !shortVideoContext.mToStatus && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        V0N.LIZLLL(this, frameLayout2, z2, true, this.LJLLI);
        this.LJLLLL.post(new Q8V(4, this));
        C1536161d.LJIIJJI = true;
        H78.LIZ("VideoRecordNewActivity => onCreate end");
        C43150Gwc.LIZ = true;
        C43150Gwc.LIZIZ = true;
        C43150Gwc.LIZJ = true;
        C45857HzB.LIZ(new HZQ());
        C45857HzB.LIZ(new C43154Gwg());
        this.LJLLLL.postDelayed(new IDRunnableS6S0101000(3, this, 10), 2000L);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onEvent(C6Z6 c6z6) {
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        bundle.putParcelable("save_state_short_video_context", this.LJLLILLLL);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        getIntent();
        c42326GjK.getClass();
        C42326GjK.LJI(this, bundle);
    }

    @QD3(sticky = true)
    public void receiveToast(HXF hxf) {
        if (TextUtils.equals(hxf.LJLIL, "sticker_unlocked")) {
            this.LLIFFJFJJ = true;
            if (this.LLII && !hxf.LJLJI) {
                HF7 hf7 = C44172HVg.LJJIFFI;
                C77413UZt.LJJIIJ();
                hf7.getClass();
                this.LLIFFJFJJ = false;
            }
            EventBus.LIZJ().LJIILLIIL(hxf);
        }
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC c5hc) {
        ((ArrayList) this.LJLLL).add(c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
        this.LJLLJ.add(interfaceC144185lG);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC c5hc) {
        ((ArrayList) this.LJLLL).remove(c5hc);
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG interfaceC144185lG) {
        ((ArrayList) this.LJLLJ).remove(interfaceC144185lG);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        HXP hxp;
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        while (it.hasNext()) {
            if (((C5HC) it.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i == 4) {
            if (this.LLFZ == null) {
                return super.onKeyDown(i, keyEvent);
            }
            I3X i3x = this.LLIIJLIL;
            if (i3x != null && !i3x.Ue0().LIZ().booleanValue()) {
                return true;
            }
            HXO hxo = this.LLI;
            if ((hxo == null || !hxo.onBackPressed()) && this.LLFZ.getDiContainer() != null && (hxp = (HXP) this.LLFZ.getDiContainer().LJIIIIZZ(null, HXP.class)) != null) {
                hxp.Ir();
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        Iterator it = ((ArrayList) this.LJLLJ).iterator();
        while (it.hasNext()) {
            if (((InterfaceC144185lG) it.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            ShortVideoContext shortVideoContext = this.LJLLILLLL;
            if (shortVideoContext != null && shortVideoContext.microAppModel != null) {
                z = true;
            } else {
                z = false;
            }
            if (intent != null && C16880lQ.LLJJIJI(intent) != null && !z) {
                Intent intent2 = new Intent();
                intent2.addFlags(67108864);
                intent2.putExtras(C16880lQ.LLJJIJI(intent));
                SAAService.LIZ().openPublishPage(this, intent2);
            }
            finish();
        }
    }
}
