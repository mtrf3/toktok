package com.ss.android.ugc.aweme.ttep;

import X.AbstractActivityC44111HSx;
import X.C13860gY;
import X.C145995oB;
import X.C1536161d;
import X.C163326b2;
import X.C16880lQ;
import X.C17N;
import X.C1B3;
import X.C1B6;
import X.C2R5;
import X.C2U8;
import X.C2YJ;
import X.C32151Nz;
import X.C38499F9b;
import X.C38987FRv;
import X.C41389GMf;
import X.C41658GWo;
import X.C41660GWq;
import X.C42326GjK;
import X.C43014GuQ;
import X.C43150Gwc;
import X.C43154Gwg;
import X.C43212Gxc;
import X.C43841HIn;
import X.C43846HIs;
import X.C44024HPo;
import X.C44172HVg;
import X.C44228HXk;
import X.C44241HXx;
import X.C44272HZc;
import X.C44284HZo;
import X.C44298Ha2;
import X.C44350Has;
import X.C44378HbK;
import X.C44384HbQ;
import X.C44422Hc2;
import X.C45848Hz2;
import X.C45857HzB;
import X.C45864HzI;
import X.C45922I0o;
import X.C46193IAz;
import X.C48331Ixz;
import X.C48343IyB;
import X.C52912Kpg;
import X.C58314Muc;
import X.C5HC;
import X.C60903NvH;
import X.C61328O5c;
import X.C63942P7q;
import X.C65803Ps7;
import X.C6FB;
import X.C73343SqR;
import X.C77413UZt;
import X.C78598Ut0;
import X.C78688UuS;
import X.C82622Wbi;
import X.C83576Wr6;
import X.C83651WsJ;
import X.C83661WsT;
import X.C83728WtY;
import X.C83932Wwq;
import X.FMX;
import X.FRD;
import X.G6C;
import X.G8G;
import X.H78;
import X.H8V;
import X.HA3;
import X.HA4;
import X.HB3;
import X.HB4;
import X.HEM;
import X.HEO;
import X.HEP;
import X.HF7;
import X.HOZ;
import X.HTP;
import X.HVR;
import X.HX2;
import X.HX3;
import X.HX4;
import X.HXA;
import X.HXE;
import X.HXF;
import X.HXH;
import X.HXM;
import X.HXO;
import X.HXT;
import X.HXW;
import X.HYQ;
import X.HZQ;
import X.I0N;
import X.I0V;
import X.I37;
import X.I3K;
import X.I3X;
import X.I8N;
import X.InterfaceC144185lG;
import X.InterfaceC44086HRy;
import X.InterfaceC45540Hu4;
import X.InterfaceC45889Hzh;
import X.InterfaceC45925I0r;
import X.InterfaceC45979I2t;
import X.InterfaceC45999I3n;
import X.InterfaceC80245VeT;
import X.InterfaceC83624Wrs;
import X.InterfaceC84498XEg;
import X.KMP;
import X.LSC;
import X.QD3;
import X.TFH;
import X.U1F;
import X.V0N;
import X.WG0;
import X.WLB;
import X.WLT;
import X.WLY;
import X.WM7;
import X.WRQ;
import X.X1D;
import Y.AObjectS52S0101000_7;
import Y.AObjectS86S0100000_7;
import Y.AObjectS88S0100000_13;
import Y.AObserverS75S0100000_7;
import Y.ARunnableS11S0101000_7;
import Y.ARunnableS12S0101000_8;
import Y.IDRunnableS6S0101000;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
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
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager;
import com.ss.android.ugc.aweme.shortvideo.ui.task.CacheChooseMediaViewHolderTask;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMusicListTask;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.runtime.VEMem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes8.dex */
public class TTEPEffectPreviewActivity extends AbstractActivityC44111HSx implements InterfaceC45540Hu4, WLY, HA3, InterfaceC44086HRy, HXW {
    public static final /* synthetic */ int LLIL = 0;
    public C82622Wbi LJLL;
    public WLB LJLLI;
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
    public C45848Hz2 LLFZ;
    public HXO LLI;
    public FrameLayout LLIIII;
    public int LLIIIJ;
    public boolean LLIIIL;
    public I8N LLIIIZ;
    public WRQ LLIIJI;
    public I3X LLIIJLIL;
    public HYQ LLIIL;
    public boolean LLIILII;
    public I37 LLIILZL;
    public I0N LLIIZ;
    public final List<InterfaceC144185lG> LJLLJ = new ArrayList();
    public final List<C5HC> LJLLL = new ArrayList();
    public final SafeHandler LJLLLL = new SafeHandler(this);
    public final HXT LLFII = new HXT();
    public boolean LLIFFJFJJ = false;
    public boolean LLII = false;
    public volatile boolean LLIIIILZ = true;

    @Override // X.HA3
    public final boolean LJJL() {
        return false;
    }

    @Override // X.InterfaceC44086HRy
    public final ViewGroup LJJLIIIJL() {
        return null;
    }

    @Override // X.HA3
    public final void LJLZ(MusicModel musicModel, String str) {
    }

    @Override // X.HA3
    public final void LJZL() {
    }

    @Override // X.GBO
    public final boolean LLII() {
        return true;
    }

    @Override // X.HXW
    public final String getTag() {
        return "TTEPEffectPreviewActivity";
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC c5hc) {
    }

    @Override // X.InterfaceC44086HRy
    public final FrameLayout.LayoutParams LJJJJ() {
        View view = this.LJZI;
        if (view == null) {
            return null;
        }
        return (FrameLayout.LayoutParams) view.getLayoutParams();
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
        C45848Hz2 c45848Hz2 = this.LLFZ;
        if (c45848Hz2 != null) {
            c45848Hz2.LLJJI();
        }
    }

    @Override // X.HA3
    public final HA4 LLILII() {
        return new HA4(null, null);
    }

    public final InterfaceC45979I2t LLILLIZIL() {
        WLB wlb = this.LJLLI;
        if (wlb == null) {
            return null;
        }
        return wlb.pb0().LIZ();
    }

    public final I0N LLILLJJLI() {
        if (this.LLIIZ == null) {
            this.LLIIZ = (I0N) this.LJLL.LJIIIIZZ(null, I0N.class);
        }
        return this.LLIIZ;
    }

    public final InterfaceC45925I0r LLILLL() {
        return (InterfaceC45925I0r) this.LLFZ.getDiContainer().LJIIIIZZ(null, InterfaceC45925I0r.class);
    }

    public final void LLIZLLLIL() {
        this.LLIIJI.e8().LLLLLJIL(new C83932Wwq(new C43841HIn(this.LJLLILLLL.cameraComponentModel.mWorkspace)), this.LJLLILLLL.cameraComponentModel.mWorkspace.y().getAbsolutePath());
        this.LLIIJI.gc0();
    }

    @Override // X.HA3
    public final HA4 getPreDownloadMusicData() {
        return new HA4(null, null);
    }

    public TTEPEffectPreviewActivity() {
        new ArrayList();
        this.LLIILII = false;
    }

    public final void LLILIL() {
        C45848Hz2 c45848Hz2;
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
            c45848Hz2 = new C45848Hz2(this.LJLLILLLL, null, this.LJLL, new C58314Muc());
        } else {
            c45848Hz2 = new C45848Hz2(this.LJLLILLLL, C16880lQ.LLJJIJI(intent), this.LJLL, new C61328O5c());
        }
        this.LLFZ = c45848Hz2;
        this.LLFZ.LJLILLLLZI = new IDRunnableS6S0101000(6, this, 37);
        HEP LIZ = C44272HZc.LIZ(this, C45848Hz2.class);
        LIZ.LJI = false;
        LIZ.LJII = new InterfaceC80245VeT() { // from class: X.HX9
            @Override // X.InterfaceC80245VeT
            public final WM7 LIZ(ClassLoader classLoader, String str) {
                TTEPEffectPreviewActivity tTEPEffectPreviewActivity = TTEPEffectPreviewActivity.this;
                tTEPEffectPreviewActivity.getClass();
                if (TextUtils.equals(C45848Hz2.class.getName(), str)) {
                    return tTEPEffectPreviewActivity.LLFZ;
                }
                return null;
            }
        };
        LIZ.LIZLLL = false;
        LIZ.LJ = false;
        LIZ.LJFF = R.id.irq;
        this.LLI = LIZ.LIZ();
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
                runOnUiThread(new IDRunnableS6S0101000(7, this, 36));
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
        C44284HZo c44284HZo = C44284HZo.LIZJ;
        c44284HZo.LIZIZ = null;
        InterfaceC84498XEg interfaceC84498XEg = c44284HZo.LIZ;
        if (interfaceC84498XEg != null) {
            interfaceC84498XEg.destroy();
        }
        c44284HZo.LIZ = null;
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
        AVCommerceServiceImpl.LJIIJ().LJ();
        G8G.LIZ.leave(this, "record");
        C44422Hc2.LIZIZ();
        if (!this.LLIILII) {
            C41658GWo.LIZLLL().LJ = Boolean.FALSE;
            this.LLIILII = false;
        }
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
        ShortVideoContext shortVideoContext = this.LJLLILLLL;
        if (shortVideoContext != null) {
            G8G.LIZ.pause(this, "record", shortVideoContext.shootWay, shortVideoContext.LJI());
        }
        VEMem.getInstance().uploadVirtualMemSize(1);
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onResume", true);
        H78.LIZ("TTEPEffectPreviewActivity => onResume start");
        super.onResume();
        ShortVideoContext shortVideoContext = this.LJLLILLLL;
        if (shortVideoContext != null && shortVideoContext.mIsFromDraft) {
            C2U8.LIZ(new HEM());
        }
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
        H78.LIZ("TTEPEffectPreviewActivity => onResume end");
        HTP.LJLJL.LIZJ(this, this.LJLZ);
        HVR.LIZ.LJIIIZ(this, new AObjectS52S0101000_7(2, this, 0));
        VEMem.getInstance().uploadVirtualMemSize(0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onStart", true);
        super.onStart();
        C45857HzB.LIZ(new C44024HPo());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onStart", false);
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

    @Override // X.InterfaceC44086HRy
    public final FrameLayout LLIILZL() {
        return this.LJLZ;
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
        InterfaceC45999I3n interfaceC45999I3n;
        C45848Hz2 c45848Hz2 = this.LLFZ;
        if (c45848Hz2 != null && (interfaceC45999I3n = (InterfaceC45999I3n) c45848Hz2.getDiContainer().LJIIIIZZ(null, InterfaceC45999I3n.class)) != null) {
            interfaceC45999I3n.Uw(z);
        }
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
        InterfaceC45999I3n interfaceC45999I3n;
        C45848Hz2 c45848Hz2 = this.LLFZ;
        if (c45848Hz2 != null && (interfaceC45999I3n = (InterfaceC45999I3n) c45848Hz2.getDiContainer().LJIIIIZZ(null, InterfaceC45999I3n.class)) != null) {
            interfaceC45999I3n.cG(z);
        }
    }

    public final void LLILZ(Bundle bundle) {
        List<String> list;
        String str;
        boolean z;
        boolean z2;
        if (bundle != null) {
            ShortVideoContext shortVideoContext = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            this.LJLLILLLL = shortVideoContext;
            if (shortVideoContext != null && shortVideoContext.mShoutOutsData != null) {
                C41658GWo.LIZLLL().LJ = Boolean.TRUE;
            }
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
        if (getIntent().getBooleanExtra("reuse_mvtheme_enter", false)) {
            this.LJLLILLLL.enterMvThemeEffect = (Effect) getIntent().getParcelableExtra("extra_mv_effect");
        }
        int intExtra = getIntent().getIntExtra("extra_ttep_enter_preview_page", 0);
        if (intExtra == 1) {
            this.LJLLILLLL.enterFrom = "effect_qr_scan";
        } else if (intExtra == 2) {
            this.LJLLILLLL.enterFrom = "effect_internal_moderation";
        } else {
            throw new UnsupportedOperationException(KMP.LJ("This mode is not supported:", intExtra));
        }
        this.LLFF = C16880lQ.LLJJIJIIJIL(getIntent(), "extra_sticker_from");
        this.LLFFF = C16880lQ.LLJJIJIIJIL(getIntent(), "grade_key");
        ShortVideoContext shortVideoContext2 = this.LJLLILLLL;
        if (shortVideoContext2 != null && (str = shortVideoContext2.shootWay) != null) {
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
        ShortVideoContext shortVideoContext3 = this.LJLLILLLL;
        LIZLLL.LIZIZ = shortVideoContext3.shootWay;
        HB4.LJFF(shortVideoContext3.creativeInfo);
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ViewModelProviders.of(this).get(ShortVideoContextViewModel.class);
        ShortVideoContext shortVideoContext4 = this.LJLLILLLL;
        shortVideoContextViewModel.LJLIL = shortVideoContext4;
        shortVideoContextViewModel.LJLILLLLZI.put("shoot_mode", Integer.valueOf(shortVideoContext4.shootMode));
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
            CommerceToolsTcmServiceImpl.LJIJJ().LJIILIIL(this.LJLLILLLL.creativeModel.commerceModel.getTcmModel());
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "music_origin");
        ShortVideoContext shortVideoContext5 = this.LJLLILLLL;
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "original";
        }
        shortVideoContext5.LJJIL(LLJJIJIIJIL);
        C44228HXk.LJIIJ();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            InterfaceC45889Hzh interfaceC45889Hzh = (InterfaceC45889Hzh) this.LLFZ.getDiContainer().LJIIIIZZ(null, InterfaceC45889Hzh.class);
            if (interfaceC45889Hzh != null) {
                interfaceC45889Hzh.dismissSuperEntranceEvent();
            }
            InterfaceC45889Hzh interfaceC45889Hzh2 = (InterfaceC45889Hzh) this.LLFZ.getDiContainer().LJIIIIZZ(null, InterfaceC45889Hzh.class);
            if (interfaceC45889Hzh2 != null) {
                interfaceC45889Hzh2.dismissUploadPopEntranceEvent();
            }
            InterfaceC45889Hzh interfaceC45889Hzh3 = (InterfaceC45889Hzh) this.LLFZ.getDiContainer().LJIIIIZZ(null, InterfaceC45889Hzh.class);
            if (interfaceC45889Hzh3 != null) {
                interfaceC45889Hzh3.dismissLivePopupEvent();
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
        long j;
        String LJI;
        int i;
        int i2;
        byte b;
        boolean z;
        boolean z2;
        AVMusic extractAVMusic;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", true);
        C41658GWo.LIZLLL().LJ = Boolean.FALSE;
        C83728WtY.LIZIZ.LIZ(HX4.TTEP_PREVIEW);
        C44298Ha2 c44298Ha2 = G8G.LIZ;
        c44298Ha2.enter(this, "record");
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Intent intent = getIntent();
        c42326GjK.getClass();
        C42326GjK.LIZJ(this, intent, bundle);
        LLILZ(bundle);
        c44298Ha2.step("av_video_record_init", "init recorderModule start");
        WG0.LJI.LJIIIZ(this);
        ShortVideoContext shortVideoContext = this.LJLLILLLL;
        if (shortVideoContext != null && (extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel)) != null && extractAVMusic.getDuration() > 0) {
            this.LJLLILLLL.LJJIJLIJ(extractAVMusic.getDuration());
        }
        C44172HVg.LIZJ();
        C78688UuS.LJIIJ(this, new AqS173S0100000_7(this, 293));
        C44384HbQ.LJII(this, new AqS173S0100000_7(this, 294));
        C44384HbQ.LJJIZ(this);
        C60903NvH.LJIIJJI().LJIJJLI();
        C82622Wbi c82622Wbi = C44384HbQ.LJJIZ(this).LJLLL;
        this.LJLL = c82622Wbi;
        this.LLIIJI = (WRQ) c82622Wbi.LJ(WRQ.class, null);
        this.LLIIJLIL = (I3X) this.LJLL.LJ(I3X.class, null);
        this.LLIIL = (HYQ) this.LJLL.LJ(HYQ.class, null);
        this.LJLLI = (WLB) this.LJLL.LJ(WLB.class, null);
        this.LJLLLLLL = this.LLIIJI.e20();
        this.LJZI = this.LLIIJI.K5();
        boolean LIZ = new C44378HbK(this.LJLLILLLL).LIZ();
        SafeHandler safeHandler = this.LJLLLL;
        ARunnableS11S0101000_7 aRunnableS11S0101000_7 = new ARunnableS11S0101000_7(3, this, 4);
        if (LIZ) {
            j = 2000;
        } else {
            j = 0;
        }
        safeHandler.postDelayed(aRunnableS11S0101000_7, j);
        if (LIZ) {
            this.LLIIJI.Os(C83661WsT.LIZIZ, true);
        }
        this.LLIIJI.ip0().LIZIZ(this, new AObjectS86S0100000_7(this, 243));
        this.LLIIJI.R40(new C73343SqR());
        this.LLIIJI.LLL().observe(this, new AObserverS75S0100000_7(this, 63));
        InterfaceC83624Wrs e8 = this.LLIIJI.e8();
        if (this.LJLLILLLL.LJI() == null) {
            LJI = "";
        } else {
            LJI = this.LJLLILLLL.LJI();
        }
        e8.setControllerCallback(new C163326b2(LJI));
        this.LLIILZL = (I37) this.LJLL.LJ(I37.class, null);
        if (C43846HIs.LIZ(this.LJLLILLLL)) {
            i = 3;
            I0V i0v = new I0V(this, this.LLIIJI.e8(), LLILLJJLI(), this.LJLLLLLL, new C45922I0o(this, this.LLIIJI, this.LJLL), this.LJLL, this);
            ((WLT) i0v.LJLJJL.LIZIZ).bh().LIZIZ(i0v.LJLJL, i0v.LJLLLL);
        } else {
            i = 3;
        }
        this.LLIIJI.Is0().LIZLLL(this, new AObjectS86S0100000_7(this, 244));
        this.LLIIJLIL.Ra0().LIZLLL(this, new AObjectS88S0100000_13(this, 3));
        c44298Ha2.step("av_video_record_init", "init recorderModule end");
        H78.LIZ("TTEPEffectPreviewActivity => onCreate start");
        C41658GWo.LIZLLL().getClass();
        C41660GWq.LIZ = false;
        c44298Ha2.step("av_video_record_init", "onCreate");
        C45857HzB.LIZ(new C44024HPo());
        C45857HzB.LIZ(new C45864HzI(this));
        C45857HzB.LIZ(new TFH());
        C60903NvH.LJIIJJI().LJJIIJ();
        C48343IyB.LIZ(this, G6C.LIZ, this);
        super.onCreate(bundle);
        if (getIntent().getIntExtra("translation_type", 0) == i) {
            U1F.LJFF(this, i);
        }
        getWindow().addFlags(128);
        setContentView(R.layout.fp);
        if (getResources().getConfiguration() != null) {
            i2 = getResources().getConfiguration().screenWidthDp;
        } else {
            i2 = 0;
        }
        this.LLIIIJ = i2;
        if (!C17N.LJIIIIZZ(this)) {
            H78.LIZ("RecordConditionCheck.check() false");
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", false);
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
        c44298Ha2.step("av_video_record_init", "init stickerModule start");
        C46193IAz c46193IAz = (C46193IAz) this.LJLL.LJ(C46193IAz.class, null);
        c46193IAz.If0(new HX2(this));
        I3X i3x = this.LLIIJLIL;
        if (i3x != null) {
            i3x.Rr0().LIZLLL(this, new AObjectS86S0100000_7(c46193IAz, 245));
        }
        c46193IAz.LLZL().LIZIZ(new C44241HXx());
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
                C1B3 LIZ2 = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LIZ2.LJJI((Fragment) it.next());
                }
                LIZ2.LJI();
            }
        }
        C44298Ha2 c44298Ha22 = G8G.LIZ;
        c44298Ha22.step("av_video_record_init", "init stickerModule end");
        this.LJLLILLLL.tabs = getIntent().getIntExtra("tabs", 0);
        C45857HzB.LIZ(new HX3());
        H8V.LIZIZ(this.LJLLILLLL);
        C44172HVg.LIZJ.getClass();
        C38987FRv.LJI(LSC.valueOf("SHOOT"));
        getLifecycle().addObserver(AudioFocusManager.LIZ(this));
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.fim);
        this.LLIIII = frameLayout2;
        ShortVideoContext shortVideoContext2 = this.LJLLILLLL;
        if (shortVideoContext2 != null && shortVideoContext2.enterMvThemeEffect != null) {
            z = true;
        } else {
            z = false;
        }
        if (!shortVideoContext2.mToLive && !shortVideoContext2.mToStatus && !z && !HXM.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        V0N.LIZLLL(this, frameLayout2, z2, true, this.LJLL);
        this.LJLLLL.post(new ARunnableS12S0101000_8(5, this, 25));
        C1536161d.LJIIJJI = true;
        H78.LIZ("TTEPEffectPreviewActivity => onCreate end");
        C43150Gwc.LIZ = true;
        C43150Gwc.LIZIZ = true;
        C43150Gwc.LIZJ = true;
        this.LJLLILLLL.mShareId = C16880lQ.LLJJIJIIJIL(getIntent(), "share_id");
        this.LJLLILLLL.clientId = C16880lQ.LLJJIJIIJIL(getIntent(), "channel");
        C45857HzB.LIZ(new HZQ());
        C45857HzB.LIZ(new C43154Gwg());
        C45857HzB.LIZ(new HOZ(this, null));
        if (C48331Ixz.LJ() || C48331Ixz.LIZIZ()) {
            c44298Ha22.start("tool_performance_show_album_icon", "activity created");
        }
        C45857HzB.LIZ(new PreloadMediaDataTask(getLifecycle(), this, null));
        C45857HzB.LIZ(new PreloadMusicListTask(getLifecycle()));
        C45857HzB.LIZ(new HXA(this));
        C45857HzB.LIZ(new CacheChooseMediaViewHolderTask(this, getLifecycle(), null));
        c44298Ha22.step("av_video_record_init", "onCreate end");
        this.LLIIJI.xh(false);
        if (HXM.LIZ() && !getIntent().getBooleanExtra("auto_start_recording", false)) {
            LLILIL();
            this.LLIIIILZ = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity", "onCreate", false);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onEvent(C2R5 c2r5) {
        ShortVideoContext shortVideoContext;
        C45848Hz2 c45848Hz2;
        if (C52912Kpg.LIZ() && (c45848Hz2 = this.LLFZ) != null && c45848Hz2.getDiContainer() != null) {
            this.LLFZ.getDiContainer().LJ(InterfaceC45979I2t.class, null);
            this.LLFZ.getDiContainer().LJ(I3K.class, null);
            ((InterfaceC45979I2t) this.LLFZ.getDiContainer().LJ(InterfaceC45979I2t.class, null)).updateBottomTab();
            ((I3K) this.LLFZ.getDiContainer().LJ(I3K.class, null)).g80();
        }
        String str = c2r5.LJLIL;
        if (str != null && (shortVideoContext = this.LJLLILLLL) != null) {
            shortVideoContext.extraSession.commerceData = str;
        }
        C41389GMf.LIZ(this.LJLLILLLL.creativeModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:fragments");
        this.LLIILII = true;
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
        ((ArrayList) this.LJLLJ).add(interfaceC144185lG);
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
        HXE hxe;
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        while (it.hasNext()) {
            if (((C5HC) it.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i == 4) {
            if (this.LLFZ == null) {
                if (getIntent().hasExtra("stitch_params")) {
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            }
            I3X i3x = this.LLIIJLIL;
            if (i3x != null && !i3x.Ue0().LIZ().booleanValue()) {
                return true;
            }
            HXO hxo = this.LLI;
            if ((hxo == null || !hxo.onBackPressed()) && this.LLFZ.getDiContainer() != null && (hxe = (HXE) this.LLFZ.getDiContainer().LJIIIIZZ(null, HXE.class)) != null) {
                hxe.rT("system_back_button", System.currentTimeMillis());
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        C45848Hz2 c45848Hz2;
        HXE hxe;
        boolean z;
        Iterator it = ((ArrayList) this.LJLLJ).iterator();
        while (it.hasNext()) {
            if (((InterfaceC144185lG) it.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1002) {
            if (i2 == -1) {
                ShortVideoContext shortVideoContext = this.LJLLILLLL;
                if (shortVideoContext != null && shortVideoContext.microAppModel != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (intent != null && C16880lQ.LLJJIJI(intent) != null && !z) {
                    Intent intent2 = new Intent();
                    C44172HVg.LIZJ.getClass();
                    intent2.setClass(this, SplashActivity.class);
                    intent2.addFlags(67108864);
                    intent2.putExtras(C16880lQ.LLJJIJI(intent));
                    C78598Ut0.LJIJJ(intent2, this);
                    startActivity(intent2);
                }
                finish();
                return;
            }
            return;
        }
        if (i != 1003 || i2 != -1 || (c45848Hz2 = this.LLFZ) == null || (hxe = (HXE) c45848Hz2.getDiContainer().LJIIIIZZ(null, HXE.class)) == null) {
            return;
        }
        hxe.clear();
    }
}
