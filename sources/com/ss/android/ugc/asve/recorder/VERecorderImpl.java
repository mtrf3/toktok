package com.ss.android.ugc.asve.recorder;

import X.C221108m2;
import X.C62822Ol8;
import X.C63912P6m;
import X.C6QQ;
import X.C76800UCe;
import X.C79146V4k;
import X.C83652WsK;
import X.C83733Wtd;
import X.C83854Wva;
import X.C83869Wvp;
import X.C83870Wvq;
import X.C83908WwS;
import X.C83920Wwe;
import X.C83932Wwq;
import X.C83933Wwr;
import X.C83963WxL;
import X.C83964WxM;
import X.C83981Wxd;
import X.C84026WyM;
import X.HY1;
import X.InterfaceC65784Pro;
import X.InterfaceC83670Wsc;
import X.InterfaceC83697Wt3;
import X.InterfaceC83707WtD;
import X.InterfaceC83727WtX;
import X.InterfaceC83759Wu3;
import X.InterfaceC83863Wvj;
import X.InterfaceC83865Wvl;
import X.InterfaceC83867Wvn;
import X.InterfaceC83886Ww6;
import X.InterfaceC83927Wwl;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import X.TCM;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.audio.VEAudioCaptureHolder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VERecorderImpl implements GenericLifecycleObserver, InterfaceC83867Wvn {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C84026WyM LJLJL;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public InterfaceC88474Ynu<? super Integer, ? super Integer, ? super String, ? super VERecorder, C76800UCe> LJLL;
    public final C62822Ol8 LJLLI;
    public final Context LJLLILLLL;
    public final InterfaceC83927Wwl LJLLJ;
    public final LifecycleOwner LJLLL;
    public final C83733Wtd LJLLLL;
    public final InterfaceC65784Pro<Boolean> LJLLLLLL;
    public final InterfaceC83697Wt3 LJLZ;

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83886Ww6 LIZLLL() {
        return (InterfaceC83886Ww6) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC83867Wvn
    public final VERecorder LJ() {
        return (VERecorder) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJII(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83670Wsc getAudioController() {
        return (InterfaceC83670Wsc) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83727WtX getEffectController() {
        return (InterfaceC83727WtX) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83865Wvl getMediaController() {
        return (InterfaceC83865Wvl) this.LJLLI.getValue();
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

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83863Wvj getCameraController() {
        return (VECameraController) this.LJLJJL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LJLLJ.LJJIIJ() && !this.LJLLJ.LJJZ()) {
            getAudioController().release(C83652WsK.LIZ("bpea-audio_capture_tools_release_onpause"));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLLJ.LJJIIJ()) {
            InterfaceC83927Wwl recorderContext = this.LJLLJ;
            o.LJIIIZ(recorderContext, "recorderContext");
            if (recorderContext.LLJL().invoke().booleanValue()) {
                getAudioController().LJFF().addCaptureListener(LJ().LIZIZ.getAudioConsumer());
            } else {
                getAudioController().LJFF().addCaptureListener(VEAudioCaptureHolder.INSTANCE);
            }
            if (!this.LJLLJ.LJJZ()) {
                getAudioController().init("record");
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void release() {
        C83964WxM.LIZ.LIZ("camera ON_DESTROY ");
        ((VECameraController) this.LJLJJL.getValue()).LIZLLL();
        LJ().LJ();
    }

    @Override // X.InterfaceC83867Wvn
    public final InterfaceC83759Wu3 LIZJ() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC83867Wvn
    public final void LIZ(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArrayList) this.LJLJLLL.getValue()).add(listener);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LIZIZ(AqS173S0100000_7 aqS173S0100000_7) {
        this.LJLJLJ = aqS173S0100000_7;
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJFF(C83869Wvp c83869Wvp) {
        LJ().LIZIZ.addCommonCallback(c83869Wvp);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJI(C83870Wvq c83870Wvq) {
        C63912P6m c63912P6m;
        VERecorder LJ = LJ();
        if (c83870Wvq == null) {
            c63912P6m = null;
        } else {
            LJ.getClass();
            c63912P6m = new C63912P6m(LJ, c83870Wvq);
        }
        LJ.LIZIZ.setOnFrameAvailableListenerExt(c63912P6m);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIIIZZ(C83854Wva c83854Wva) {
        LJ().LIZIZ.setOnInfoListener(c83854Wva);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIIZ(C83869Wvp c83869Wvp) {
        LJ().LIZIZ.setCommonCallback(c83869Wvp);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIJ(C83869Wvp c83869Wvp) {
        LJ().LIZIZ.removeCommonCallback(c83869Wvp);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LJIIJJI(IDqS456S0100000_14 callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLL = callback;
    }

    public final void LJIIL(boolean z) {
        if (this.LJLLLLLL.invoke().booleanValue()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLLL.getValue()).iterator();
        while (it.hasNext()) {
            InterfaceC83707WtD interfaceC83707WtD = (InterfaceC83707WtD) it.next();
            if (this.LJLLJ.LLJL().invoke().booleanValue()) {
                interfaceC83707WtD.LIZIZ(!z ? 1 : 0);
            } else {
                interfaceC83707WtD.LIZIZ(z ? 1 : 0);
            }
        }
    }

    public final void LJIILJJIL(int i) {
        if (this.LJLLLLLL.invoke().booleanValue()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.LJLJLLL.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC83707WtD) it.next()).LIZ(i);
        }
        if (i == 0) {
            VERecorder LJ = LJ();
            LJ.LIZIZ.slamGetTextBitmap(new TCM());
        }
    }

    @Override // X.InterfaceC83867Wvn
    public final void LLLLLJLJLL(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArrayList) this.LJLJLLL.getValue()).remove(listener);
    }

    @Override // X.InterfaceC83867Wvn
    public final void LLLLLJIL(C83932Wwq c83932Wwq, String workSpacePath) {
        o.LJIIIZ(workSpacePath, "workSpacePath");
        VERecorder LJ = LJ();
        if (LJ.LIZIZ.changeResManager(c83932Wwq) == 0) {
            LJ.LIZ = c83932Wwq;
        }
        getEffectController().T9();
    }

    public final void LJIILIIL(int i, int i2, String str) {
        boolean booleanValue = this.LJLLLLLL.invoke().booleanValue();
        if (i == 1000) {
            if (booleanValue && this.LJLLJ.t()) {
                return;
            }
            VECameraController vECameraController = (VECameraController) this.LJLJJL.getValue();
            if (vECameraController != null) {
                vECameraController.LJJIIZ();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
            }
        } else if (i == 1001) {
            VECameraController vECameraController2 = (VECameraController) this.LJLJJL.getValue();
            if (vECameraController2 != null) {
                vECameraController2.LJJIIZI();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
            }
        }
        if (booleanValue) {
            return;
        }
        if (i == 1040) {
            HY1.LIZ = Integer.valueOf(i2);
        } else if (i == 1041) {
            HY1.LIZIZ = Integer.valueOf(i2);
        }
        InterfaceC88474Ynu<? super Integer, ? super Integer, ? super String, ? super VERecorder, C76800UCe> interfaceC88474Ynu = this.LJLL;
        if (interfaceC88474Ynu != null) {
            interfaceC88474Ynu.invoke(Integer.valueOf(i), Integer.valueOf(i2), str, LJ());
        }
    }

    public VERecorderImpl(Context context, LifecycleOwner lifecycleOwner, InterfaceC83927Wwl interfaceC83927Wwl, C83733Wtd c83733Wtd, InterfaceC83697Wt3 interfaceC83697Wt3, InterfaceC65784Pro interceptCallback) {
        o.LJIIIZ(interceptCallback, "interceptCallback");
        this.LJLLILLLL = context;
        this.LJLLJ = interfaceC83927Wwl;
        this.LJLLL = lifecycleOwner;
        this.LJLLLL = c83733Wtd;
        this.LJLLLLLL = interceptCallback;
        this.LJLZ = interfaceC83697Wt3;
        this.LJLIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 502));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 497));
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 499));
        this.LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 498));
        this.LJLJJL = LIZIZ;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 495));
        this.LJLJL = new C84026WyM(interfaceC83927Wwl, LJ(), interceptCallback);
        this.LJLJLLL = C221108m2.LIZIZ(C83908WwS.LJLIL);
        C6QQ.LIZ(new AqS164S0100000_14(this, 496));
        if (interfaceC83927Wwl.LJLJJL()) {
            VERecorder LJ = LJ();
            LJ.LIZIZ.addCommonCallback(new C83920Wwe(this));
        } else {
            VERecorder LJ2 = LJ();
            LJ2.LIZIZ.addRecorderStateListener(new C83933Wwr(this));
        }
        VEVolumeParam vEVolumeParam = new VEVolumeParam();
        vEVolumeParam.bgmPlayVolume = interfaceC83927Wwl.LJJJJIZL().LJII();
        vEVolumeParam.enhanceSysPlayVolume = interfaceC83927Wwl.LJJJJIZL().LIZ();
        if (!interfaceC83927Wwl.LJJJJJL().LJIIJJI()) {
            LJ().LIZIZ.setVolume(vEVolumeParam);
        }
        LJ().LIZIZ.enableEffectAmazing(interfaceC83927Wwl.LLZZZIL());
        VERecorder LJ3 = LJ();
        LJ3.LIZIZ.enableNewAudioCapture(interfaceC83927Wwl.LJJIIJ());
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZIZ("ve_video_encode_settings");
        }
        VEVideoEncodeSettings LJJLIIIJ = C79146V4k.LJJLIIIJ(interfaceC83927Wwl);
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZ("ve_video_encode_settings");
        }
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZIZ("ve_audio_encode_settings");
        }
        VEAudioEncodeSettings Build = new VEAudioEncodeSettings.Builder().Build();
        o.LJIIIIZZ(Build, "VEAudioEncodeSettings\n  …apply {\n        }.Build()");
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZ("ve_audio_encode_settings");
        }
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZIZ("ve_preview_settings");
        }
        VEPreviewSettings LJJLIIIIJ = C79146V4k.LJJLIIIIJ(interfaceC83927Wwl);
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZ("ve_preview_settings");
        }
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZIZ("ve_recorder_init");
        }
        if (interfaceC83927Wwl.LJLJL()) {
            LJ().LIZLLL(LJJLIIIJ, Build, LJJLIIIIJ, false);
        } else {
            LJ().LIZLLL(LJJLIIIJ, Build, LJJLIIIIJ, ((VECameraController) LIZIZ.getValue()).LJJIFFI());
        }
        if (interfaceC83697Wt3 != null) {
            interfaceC83697Wt3.LIZ("ve_recorder_init");
            interfaceC83697Wt3.LIZIZ("ve_recorder_init_to_camera_init");
        }
        if (interfaceC83927Wwl.LJJJJJL().LJIIJJI()) {
            LJ().LIZIZ.setVolume(vEVolumeParam);
        }
        if (interfaceC83927Wwl.LLLIIL()) {
            int[] LJIILIIL = interfaceC83927Wwl.LJJJJJL().LJIILIIL();
            if (LJIILIIL.length == 2) {
                VESize vESize = new VESize(LJIILIIL[0], LJIILIIL[1]);
                VERecorder LJ4 = LJ();
                LJ4.LIZIZ.setDisplaySettings(interfaceC83927Wwl.LJJJJJL().LJJIII(vESize));
            }
        }
        if (interfaceC83927Wwl.LLLLLZL()) {
            VERecorder LJ5 = LJ();
            C83963WxL c83963WxL = C83963WxL.LIZ;
            LJ5.getClass();
            LJ5.LIZIZ.startPreviewAsync(null, new C83981Wxd(c83963WxL));
        }
        VERecorder enableFastCVProcessArbiter = LJ();
        boolean LLII = interfaceC83927Wwl.LLII();
        o.LJIIIZ(enableFastCVProcessArbiter, "$this$enableFastCVProcessArbiter");
        enableFastCVProcessArbiter.LIZIZ.enableFastCVProcess(0, LLII);
        this.LJLLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 501));
    }
}
