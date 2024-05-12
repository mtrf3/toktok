package com.bytedance.creativex.camerakit.camera.session.recorder.impl;

import X.C221108m2;
import X.C34392Dee;
import X.C38350F3i;
import X.C43045Guv;
import X.C62822Ol8;
import X.C79146V4k;
import X.C83652WsK;
import X.C83911WwV;
import X.C83932Wwq;
import X.C83959WxH;
import X.C83964WxM;
import X.C83981Wxd;
import X.EnumC83890WwA;
import X.InterfaceC83670Wsc;
import X.InterfaceC83697Wt3;
import X.InterfaceC83727WtX;
import X.InterfaceC83759Wu3;
import X.InterfaceC83829WvB;
import X.InterfaceC83863Wvj;
import X.InterfaceC83865Wvl;
import X.InterfaceC83868Wvo;
import X.InterfaceC83886Ww6;
import X.InterfaceC83927Wwl;
import X.SurfaceHolderCallbackC83912WwW;
import X.V3N;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.audio.VEAudioCaptureHolder;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.runtime.VERuntime;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class RecorderImpl implements GenericLifecycleObserver, InterfaceC83829WvB {
    public volatile boolean LJLIL;
    public volatile boolean LJLL;
    public final String LJLLI;
    public final String LJLLILLLL;
    public long LJLLJ;
    public final C83911WwV LJLLLLLL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 33));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 23));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 25));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 24));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 29));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 27));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 32));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 26));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 30));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 31));

    @Override // X.InterfaceC83829WvB
    public final InterfaceC83868Wvo LIZ() {
        return (InterfaceC83868Wvo) this.LJLLLL.getValue();
    }

    @Override // X.InterfaceC83829WvB
    public final InterfaceC83759Wu3 LIZJ() {
        return (InterfaceC83759Wu3) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC83829WvB
    public final InterfaceC83886Ww6 LIZLLL() {
        return (InterfaceC83886Ww6) this.LJLJLLL.getValue();
    }

    @Override // X.InterfaceC83829WvB
    public final VERecorder LJ() {
        return (VERecorder) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC83829WvB
    public final InterfaceC83670Wsc getAudioController() {
        return (InterfaceC83670Wsc) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC83829WvB
    public final InterfaceC83863Wvj getCameraController() {
        return (InterfaceC83863Wvj) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC83829WvB
    public final InterfaceC83727WtX getEffectController() {
        return (InterfaceC83727WtX) this.LJLJL.getValue();
    }

    @Override // X.InterfaceC83829WvB
    public final InterfaceC83865Wvl getMediaController() {
        return (InterfaceC83865Wvl) this.LJLJJLL.getValue();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    public final void init() {
        Surface surface;
        long j;
        if (this.LJLIL) {
            return;
        }
        long j2 = 0;
        C43045Guv.LIZLLL(new AqS164S0100000_14(this, 28), 0L);
        String str = "";
        if (this.LJLLLLLL.LJLJJI.LLJIJIL()) {
            SurfaceHolder surfaceHolder = this.LJLLLLLL.LJLJJI.getSurfaceHolder();
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(new SurfaceHolderCallbackC83912WwW(this));
            }
            SurfaceHolder surfaceHolder2 = this.LJLLLLLL.LJLJJI.getSurfaceHolder();
            if (surfaceHolder2 != null && (surface = surfaceHolder2.getSurface()) != null && surface.isValid()) {
                LIZIZ();
                getMediaController().u8(surface, "", C34392Dee.LJLIL);
            }
        }
        if (this.LJLLLLLL.LJLJJI.LLJL().invoke().booleanValue()) {
            VERuntime.getInstance().enableRefactorRecorder(true);
            if (!this.LJLLLLLL.LJLJJI.LJJIIJ()) {
                VERuntime.getInstance().enableAudioCapture(true);
            }
        }
        this.LJLLJ = System.currentTimeMillis();
        VEVolumeParam vEVolumeParam = new VEVolumeParam();
        vEVolumeParam.bgmPlayVolume = this.LJLLLLLL.LJLJJI.LJJJJIZL().LJII();
        vEVolumeParam.enhanceSysPlayVolume = this.LJLLLLLL.LJLJJI.LJJJJIZL().LIZ();
        LIZ().LIZJ();
        if (!this.LJLLLLLL.LJLJJI.LJJJJJL().LJIIJJI()) {
            LJ().LIZIZ.setVolume(vEVolumeParam);
        }
        LJ().LIZIZ.enableEffectAmazing(this.LJLLLLLL.LJLJJI.LLZZZIL());
        LJ().LIZIZ.enableNewAudioCapture(this.LJLLLLLL.LJLJJI.LJJIIJ());
        InterfaceC83697Wt3 interfaceC83697Wt3 = this.LJLLLLLL.LJLJJL;
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZIZ("ve_video_encode_settings");
        }
        VEVideoEncodeSettings LJJLIIIJ = C79146V4k.LJJLIIIJ(this.LJLLLLLL.LJLJJI);
        InterfaceC83697Wt3 interfaceC83697Wt32 = this.LJLLLLLL.LJLJJL;
        if (interfaceC83697Wt32 != null) {
            interfaceC83697Wt32.LIZ("ve_video_encode_settings");
        }
        InterfaceC83697Wt3 interfaceC83697Wt33 = this.LJLLLLLL.LJLJJL;
        if (interfaceC83697Wt33 != null) {
            interfaceC83697Wt33.LIZIZ("ve_audio_encode_settings");
        }
        VEAudioEncodeSettings Build = new VEAudioEncodeSettings.Builder().Build();
        o.LJIIIIZZ(Build, "VEAudioEncodeSettings\n  …apply {\n        }.Build()");
        InterfaceC83697Wt3 interfaceC83697Wt34 = this.LJLLLLLL.LJLJJL;
        if (interfaceC83697Wt34 != null) {
            interfaceC83697Wt34.LIZ("ve_audio_encode_settings");
        }
        InterfaceC83697Wt3 interfaceC83697Wt35 = this.LJLLLLLL.LJLJJL;
        if (interfaceC83697Wt35 != null) {
            interfaceC83697Wt35.LIZIZ("ve_preview_settings");
        }
        VEPreviewSettings LJJLIIIIJ = C79146V4k.LJJLIIIIJ(this.LJLLLLLL.LJLJJI);
        InterfaceC83697Wt3 interfaceC83697Wt36 = this.LJLLLLLL.LJLJJL;
        if (interfaceC83697Wt36 != null) {
            interfaceC83697Wt36.LIZ("ve_preview_settings");
        }
        InterfaceC83697Wt3 interfaceC83697Wt37 = this.LJLLLLLL.LJLJJL;
        if (interfaceC83697Wt37 != null) {
            interfaceC83697Wt37.LIZIZ("ve_recorder_init");
        }
        if (this.LJLLLLLL.LJLJJI.LJLJL()) {
            LJ().LIZLLL(LJJLIIIJ, Build, LJJLIIIIJ, false);
        } else {
            LJ().LIZLLL(LJJLIIIJ, Build, LJJLIIIIJ, getCameraController().LJJIFFI());
        }
        Effect effect = this.LJLLLLLL.LJLJLJ;
        if (effect != null) {
            VERecorder LJ = LJ();
            VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
            vEEffectFilterParam.effectPath = effect.getUnzipPath();
            vEEffectFilterParam.useLongId = true;
            Long LJJIZ = C38350F3i.LJJIZ(effect.getEffectId());
            if (LJJIZ != null) {
                j = LJJIZ.longValue();
            } else {
                j = 0;
            }
            vEEffectFilterParam.longStickerId = j;
            Long LJJIZ2 = C38350F3i.LJJIZ(effect.getEffectId());
            if (LJJIZ2 != null) {
                j2 = LJJIZ2.longValue();
            }
            vEEffectFilterParam.longRequestId = j2;
            String extra = effect.getExtra();
            if (extra != null) {
                str = extra;
            }
            vEEffectFilterParam.stickerTag = str;
            vEEffectFilterParam.needReload = false;
            if (V3N.LJJI(effect)) {
                vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.MUSIC;
            }
            if (V3N.LJJIFFI(effect)) {
                vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.AUDIO_SPEED;
            }
            if (V3N.LJIL(effect)) {
                vEEffectFilterParam.multicamMode = true;
            }
            LJ.LIZIZ.switchEffect(vEEffectFilterParam);
        }
        InterfaceC83697Wt3 interfaceC83697Wt38 = this.LJLLLLLL.LJLJJL;
        if (interfaceC83697Wt38 != null) {
            interfaceC83697Wt38.LIZ("ve_recorder_init");
        }
        InterfaceC83697Wt3 interfaceC83697Wt39 = this.LJLLLLLL.LJLJJL;
        if (interfaceC83697Wt39 != null) {
            interfaceC83697Wt39.LIZIZ("ve_recorder_init_to_camera_init");
        }
        if (this.LJLLLLLL.LJLJJI.LJJJJJL().LJIIJJI()) {
            LJ().LIZIZ.setVolume(vEVolumeParam);
        }
        if (this.LJLLLLLL.LJLJJI.LLLIIL()) {
            int[] LJIILIIL = this.LJLLLLLL.LJLJJI.LJJJJJL().LJIILIIL();
            if (LJIILIIL.length == 2) {
                VESize vESize = new VESize(LJIILIIL[0], LJIILIIL[1]);
                LJ().LIZIZ.setDisplaySettings(this.LJLLLLLL.LJLJJI.LJJJJJL().LJJIII(vESize));
            }
        }
        if (this.LJLLLLLL.LJLJJI.LLLLLZL()) {
            VERecorder LJ2 = LJ();
            C83959WxH c83959WxH = C83959WxH.LIZ;
            LJ2.getClass();
            LJ2.LIZIZ.startPreviewAsync(null, new C83981Wxd(c83959WxH));
        }
        VERecorder enableFastCVProcessArbiter = LJ();
        boolean LLII = this.LJLLLLLL.LJLJJI.LLII();
        o.LJIIIZ(enableFastCVProcessArbiter, "$this$enableFastCVProcessArbiter");
        enableFastCVProcessArbiter.LIZIZ.enableFastCVProcess(0, LLII);
        this.LJLIL = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LJLLLLLL.LJLJJI.LJJIIJ() && !this.LJLLLLLL.LJLJJI.LJJZ()) {
            getAudioController().release(C83652WsK.LIZ("bpea-audio_capture_tools_release_onpause"));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLLLLLL.LJLJJI.LJJIIJ()) {
            InterfaceC83927Wwl recorderContext = this.LJLLLLLL.LJLJJI;
            o.LJIIIZ(recorderContext, "recorderContext");
            if (recorderContext.LLJL().invoke().booleanValue()) {
                getAudioController().LJFF().addCaptureListener(LJ().LIZIZ.getAudioConsumer());
            } else {
                getAudioController().LJFF().addCaptureListener(VEAudioCaptureHolder.INSTANCE);
            }
            if (!this.LJLLLLLL.LJLJJI.LJJZ()) {
                getAudioController().init("record");
            }
        }
    }

    @Override // X.InterfaceC83829WvB
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void release() {
        C83964WxM.LIZ.LIZ("camera ON_DESTROY ");
        getCameraController().LIZLLL();
        LJ().LJ();
    }

    @Override // X.InterfaceC83829WvB
    public final void LIZIZ() {
        String str;
        boolean z;
        getEffectController().da();
        if (this.LJLL || this.LJLLL.getValue() != EnumC83890WwA.DUET) {
            return;
        }
        C83964WxM.LIZ.LIZJ("initDuet() called");
        if (this.LJLLLLLL.LJLJJI.LLLLZI().LIZJ()) {
            str = null;
        } else {
            str = this.LJLLILLLL;
        }
        if (!this.LJLLLLLL.LJLJJI.LLJL().invoke().booleanValue()) {
            getMediaController().LLZZJLIL(0L, 0L, str, false, false);
        }
        InterfaceC83886Ww6 LIZLLL = LIZLLL();
        String str2 = this.LJLLI;
        if (this.LJLLLLLL.LJLJJI.LLLLZI().LJI() * 1.3333333333333333d > this.LJLLLLLL.LJLJJI.LLLLZI().LIZLLL()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLLLLL.LJLJJI.LLLLZI().LIZIZ();
        LIZLLL.LIZ(str2, str, z);
        LIZLLL().LIZJ();
        this.LJLL = true;
    }

    @Override // X.InterfaceC83829WvB
    public final long getInitRecorderTime() {
        return this.LJLLJ;
    }

    public RecorderImpl(C83911WwV c83911WwV) {
        this.LJLLLLLL = c83911WwV;
        this.LJLLI = c83911WwV.LJLJJI.LLLLZI().LIZ();
        this.LJLLILLLL = c83911WwV.LJLJJI.LLLLZI().LJIIIIZZ();
    }

    @Override // X.InterfaceC83829WvB
    public final void LLLLLJIL(C83932Wwq c83932Wwq, String workSpacePath) {
        o.LJIIIZ(workSpacePath, "workSpacePath");
        VERecorder LJ = LJ();
        if (LJ.LIZIZ.changeResManager(c83932Wwq) == 0) {
            LJ.LIZ = c83932Wwq;
        }
        getEffectController().T9();
    }
}
