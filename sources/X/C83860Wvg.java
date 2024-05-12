package X;

import Y.AObjectS123S0200000_7;
import Y.AObjectS139S0100000_14;
import Y.AObjectS42S0101000_5;
import Y.AObjectS54S0101000_9;
import Y.AObjectS57S0101000_14;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83860Wvg implements InterfaceC83624Wrs {
    public final InterfaceC83886Ww6 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public LifecycleOwner LJLJJI;
    public InterfaceC83927Wwl LJLJJL;
    public final C83877Wvx LJLJJLL;
    public final CopyOnWriteArrayList<InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe>> LJLJL;
    public final IDqS456S0100000_14 LJLJLJ;
    public volatile boolean LJLJLLL;
    public boolean LJLL;
    public final LifecycleOwner LJLLI;
    public final InterfaceC83852WvY LJLLILLLL;
    public final InterfaceC65784Pro<InterfaceC82309WSb> LJLLJ;
    public final InterfaceC83867Wvn LJLLL;
    public final InterfaceC65784Pro<InterfaceC83720WtQ> LJLLLL;
    public final InterfaceC65784Pro<Context> LJLLLLLL;
    public final InterfaceC65784Pro<Boolean> LJLZ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJZ;

    public final InterfaceC83879Wvz LIZJ() {
        return (InterfaceC83879Wvz) this.LJLJI.getValue();
    }

    public final InterfaceC83868Wvo LIZLLL() {
        return (InterfaceC83868Wvo) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC83624Wrs
    public final Runnable getDataSourceVideoCompleteListener() {
        return null;
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean x9() {
        return getCameraController().LIZIZ(0.0f);
    }

    @Override // X.InterfaceC83624Wrs
    public final InterfaceC83670Wsc getAudioController() {
        return this.LJLLILLLL.getAudioController();
    }

    @Override // X.InterfaceC83624Wrs
    public final int getBackCameraPos() {
        return this.LJLLILLLL.getCameraController().LJIIIZ().LIZLLL();
    }

    @Override // X.InterfaceC83624Wrs
    public final InterfaceC83863Wvj getCameraController() {
        return this.LJLLILLLL.getCameraController();
    }

    @Override // X.InterfaceC83624Wrs
    public final int getCameraPosition() {
        return this.LJLLILLLL.getCameraController().getCameraPosition();
    }

    @Override // X.InterfaceC83624Wrs
    public final int getCameraPreviewHeight() {
        return this.LJLLILLLL.getCameraController().getCameraPreviewHeight();
    }

    @Override // X.InterfaceC83624Wrs
    public final int getCameraPreviewWidth() {
        return this.LJLLILLLL.getCameraController().getCameraPreviewWidth();
    }

    @Override // X.InterfaceC83624Wrs
    public final List<Integer> getCameraZoomList() {
        return this.LJLLILLLL.getCameraController().getCameraZoomList();
    }

    @Override // X.InterfaceC83624Wrs
    public final int getCurrentCameraType() {
        return this.LJLLILLLL.getCameraController().getCurrentCameraType();
    }

    @Override // X.InterfaceC83624Wrs
    public final InterfaceC83727WtX getEffectController() {
        return this.LJLLILLLL.getEffectController();
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean getExposureCompensationEnable() {
        if (this.LJLL && getCameraECInfo() != null && getCameraController().isSupportedExposureCompensation()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83624Wrs
    public final int getFPS() {
        return this.LJLJJLL.LJLIL;
    }

    @Override // X.InterfaceC83624Wrs
    public final int getFlashMode() {
        return this.LJLLILLLL.getCameraController().getFlashMode();
    }

    @Override // X.InterfaceC83624Wrs
    public final int getFrontCameraPos() {
        return this.LJLLILLLL.getCameraController().LJIIIZ().LJII();
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean getHasSetFocusAreas() {
        return this.LJLLILLLL.getCameraController().getHasSetFocusAreas();
    }

    @Override // X.InterfaceC83624Wrs
    public final long getInitRecorderTime() {
        return this.LJLLILLLL.s4().getInitRecorderTime();
    }

    @Override // X.InterfaceC83624Wrs
    public final float getMaxCameraZoom() {
        return this.LJLLILLLL.getCameraController().LLJJJJJIL();
    }

    @Override // X.InterfaceC83624Wrs
    public final InterfaceC83865Wvl getMediaController() {
        return this.LJLLILLLL.getMediaController();
    }

    @Override // X.InterfaceC83624Wrs
    public final InterfaceC83927Wwl getRecordContext() {
        InterfaceC83927Wwl interfaceC83927Wwl = this.LJLJJL;
        if (interfaceC83927Wwl != null) {
            return interfaceC83927Wwl;
        }
        o.LJIJI("_recorderContext");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final InterfaceC82309WSb getViewFunction() {
        return this.LJLLJ.invoke();
    }

    @Override // X.InterfaceC83624Wrs
    public final void init() {
        this.LJLLILLLL.s4().LIZIZ();
    }

    @Override // X.InterfaceC83624Wrs
    public final void E9() {
        getCameraController().LJJIIJZLJL();
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean H9() {
        return getCameraController().LJIJJ();
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLJIJIL() {
        return getCameraController().LJIIIZ().LLJIJIL();
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLILLIL() {
        LIZJ().LLLLLILLIL();
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLL() {
        LIZLLL().LLLLLLL();
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLZ() {
        LIZLLL().LLLLLLZ();
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLLLLLZZ() {
        return getCameraController().LLLLLLZZ();
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLLLZI() {
        return getCameraController().LLLLZI();
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLZIL() {
        LIZJ().LLLLZIL();
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZ() {
        getMediaController().LLZ();
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZIL() {
        getMediaController().LLZIL();
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLZLLLL() {
        return getMediaController().LLZLLLL();
    }

    @Override // X.InterfaceC83624Wrs
    public final C63824P3c getCameraECInfo() {
        return getCameraController().getCameraECInfo();
    }

    @Override // X.InterfaceC83624Wrs
    public final String getCameraTypeString() {
        return getCameraController().getCameraTypeString();
    }

    @Override // X.InterfaceC83624Wrs
    public final VEDisplaySettings getDisplayingSettings() {
        return getMediaController().O7();
    }

    @Override // X.InterfaceC83624Wrs
    public final long getEndFrameTimeUS() {
        return Math.max(getMediaController().getEndFrameTimeUS(), 0L);
    }

    @Override // X.InterfaceC83624Wrs
    public final VEMapBufferInfo getIntermediatePathFromEffect() {
        return getMediaController().getIntermediatePathFromEffect();
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean getIsExposureSeekBarShowing() {
        return LIZJ().getIsExposureSeekBarShowing();
    }

    @Override // X.InterfaceC83624Wrs
    public final int getLastFlashMode() {
        return getCameraController().getLastFlashMode();
    }

    @Override // X.InterfaceC83624Wrs
    public final int getLastRecordFrameNum() {
        return getMediaController().getLastRecordFrameNum();
    }

    @Override // X.InterfaceC83624Wrs
    public final int getNextFlashMode() {
        return getCameraController().getNextFlashMode();
    }

    @Override // X.InterfaceC83624Wrs
    public final long getSegmentAudioLength() {
        return getMediaController().getSegmentAudioLength();
    }

    @Override // X.InterfaceC83624Wrs
    public final float[] getSuggestVolume() {
        return getMediaController().getSuggestVolume();
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean o9() {
        return getCameraController().LJIIIZ().LJFF();
    }

    @Override // X.InterfaceC83624Wrs
    public final void y9() {
        if (getCameraController().LJJJJI() == 1) {
            getCameraController().LJJJIL(0);
            getCameraController().LJIL(EnumC83975WxX.BACK_PRIMARY);
        } else {
            getCameraController().LJJJIL(1);
            getCameraController().LJIL(EnumC83975WxX.FRONT_PRIMARY);
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final LifecycleOwner getLifecycleOwner() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC83624Wrs
    public final InterfaceC83867Wvn t9() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC83624Wrs
    public final void A9(boolean z) {
        this.LJLLLL.invoke().LIZIZ(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void B9(Cert cert) {
        getCameraController().LJIIIZ().LJIIIZ(cert);
    }

    @Override // X.InterfaceC83624Wrs
    public final void C0(boolean z) {
        getEffectController().C0(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void C9(InterfaceC83974WxW interfaceC83974WxW) {
        getEffectController().C9(interfaceC83974WxW);
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean D7(VEFocusSettings vEFocusSettings) {
        return getCameraController().D7(vEFocusSettings);
    }

    @Override // X.InterfaceC83624Wrs
    public final void F9(IBA iba) {
        getAudioController().LIZJ(iba);
    }

    @Override // X.InterfaceC83624Wrs
    public final void K8(C84046Wyg c84046Wyg) {
        getEffectController().K8(c84046Wyg);
    }

    @Override // X.InterfaceC83624Wrs
    public final void L9(InterfaceC88474Ynu<? super Integer, ? super Integer, ? super String, ? super VERecorder, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJL.remove(callback);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LIZ(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        LIZLLL().LIZ(listener);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LIZIZ(AqS173S0100000_7 aqS173S0100000_7) {
        LIZLLL().LIZIZ(aqS173S0100000_7);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LJJIJLIJ(boolean z) {
        getEffectController().LJJIJLIJ(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LJJJJJ(int i) {
        getCameraController().LJJJJJ(i);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLJJIJIIJIL(boolean z) {
        getCameraController().LLJJIJIIJIL(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLJJJJLIIL(boolean z) {
        return getCameraController().LJIIIZ().LLJJJJLIIL(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLJJL(float f) {
        return getCameraController().LLJJL(f);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLJLJLL(InterfaceC83707WtD listener) {
        o.LJIIIZ(listener, "listener");
        LIZLLL().LLLLLJLJLL(listener);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLIL(HJ0 hj0) {
        LIZLLL().LLLLLLIL(hj0);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLJ(InterfaceC83889Ww9 listener) {
        o.LJIIIZ(listener, "listener");
        LIZLLL().LLLLLLJ(listener);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLLLL(IAF listener) {
        o.LJIIIZ(listener, "listener");
        LIZLLL().LLLLLLLLL(listener);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLLLLL(boolean z) {
        LIZJ().LLLLLLLLLL(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLZ(InterfaceC83996Wxs interfaceC83996Wxs) {
        getCameraController().LLLLLZ(interfaceC83996Wxs);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLZL(int i) {
        getCameraController().LLLLLZL(i);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLZ(InterfaceC83991Wxn zoomListener) {
        o.LJIIIZ(zoomListener, "zoomListener");
        getCameraController().LLLLZ(zoomListener);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLZLL(int i) {
        getCameraController().LLLLZLL(i);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLZLLLI(InterfaceC83889Ww9 listener) {
        o.LJIIIZ(listener, "listener");
        LIZLLL().LLLLZLLLI(listener);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLZ(IAF listener) {
        o.LJIIIZ(listener, "listener");
        LIZLLL().LLLZ(listener);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLZI(InterfaceC88474Ynu<? super Integer, ? super Integer, ? super String, ? super VERecorder, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJL.add(callback);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZILL(InterfaceC83962WxK listener) {
        o.LJIIIZ(listener, "listener");
        getMediaController().LLZILL(listener);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZL(boolean z) {
        getMediaController().LLZL(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZLI(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        getMediaController().LLZLI(interfaceC88472Yns);
    }

    @Override // X.InterfaceC83624Wrs
    public final void a(InterfaceC83962WxK listener) {
        o.LJIIIZ(listener, "listener");
        getMediaController().a(listener);
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean b(boolean z) {
        return getMediaController().b(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean c(String str) {
        return getMediaController().c(str);
    }

    @Override // X.InterfaceC83624Wrs
    public final void enableAudio(boolean z) {
        getMediaController().enableAudio(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void p9(Cert cert) {
        getCameraController().p9(cert);
    }

    @Override // X.InterfaceC83624Wrs
    public final void pauseEffectAudio(boolean z) {
        getEffectController().pauseEffectAudio(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void q9(HJ0 callback) {
        o.LJIIIZ(callback, "callback");
        LIZLLL().q9(callback);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setARCoreParam(boolean z) {
        VEARCoreParam vEARCoreParam = new VEARCoreParam();
        vEARCoreParam.setEnableARCore(z);
        getEffectController().setARCoreParam(vEARCoreParam);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setAudioCaptureDevice(IC8 device) {
        o.LJIIIZ(device, "device");
        getAudioController().LJFF().setAudioDevice(device);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setAudioDevice(boolean z) {
        VERecorder setAudioDeviceSpeaker = this.LJLLL.LJ();
        o.LJIIIZ(setAudioDeviceSpeaker, "$this$setAudioDeviceSpeaker");
        setAudioDeviceSpeaker.LIZIZ.setAudioDevice(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setBodyBeautyLevel(int i) {
        getCameraController().setBodyBeautyLevel(i);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setCameraPreviewSizeInterface(InterfaceC83997Wxt interfaceC83997Wxt) {
        getCameraController().setCameraPreviewSizeInterface(interfaceC83997Wxt);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setCloseCameraListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        getCameraController().LJJIII(listener);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setControllerCallback(InterfaceC83970WxS interfaceC83970WxS) {
        getCameraController().setControllerCallback(interfaceC83970WxS);
        getMediaController().setControllerCallback(interfaceC83970WxS);
        InterfaceC83927Wwl interfaceC83927Wwl = this.LJLJJL;
        if (interfaceC83927Wwl != null) {
            if (interfaceC83927Wwl.LJJIIJ()) {
                getAudioController().setControllerCallback(interfaceC83970WxS);
                return;
            }
            return;
        }
        o.LJIJI("_recorderContext");
        throw null;
    }

    @Override // X.InterfaceC83624Wrs
    public final void setDataSourceVideoCompleteListener(Runnable runnable) {
        this.LJLLILLLL.LIZLLL().LIZLLL(runnable);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setDetectInterval(int i) {
        getEffectController().setDetectInterval(i);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setDeviceRotation(int i) {
        getCameraController().setDeviceRotation(i);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setDuetSupportChangeLayout(boolean z) {
        this.LJLIL.LIZIZ(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setExposureCompensation(int i) {
        getCameraController().setExposureCompensation(i);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setExposureCompensationEnable(boolean z) {
        this.LJLL = z;
    }

    @Override // X.InterfaceC83624Wrs
    public final void setExposureSeekBarProgress(float f) {
        LIZJ().setExposureSeekBarProgress(f);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setFilter(String str) {
        getEffectController().setFilter(str);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setHandDetectLowpower(boolean z) {
        getEffectController().setHandDetectLowpower(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "<set-?>");
        this.LJLJJI = lifecycleOwner;
    }

    @Override // X.InterfaceC83624Wrs
    public final void setMusicPath(String str) {
        getMediaController().setMusicPath(str);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setRecordMaxDuration(long j) {
        getMediaController().setRecordMaxDuration(j);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setRecordMode(EnumC84128X0a mode) {
        o.LJIIIZ(mode, "mode");
        getCameraController().setRecordMode(mode);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setSATZoomListener(InterfaceC83712WtI interfaceC83712WtI) {
        getCameraController().setSATZoomListener(interfaceC83712WtI);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setSensitiveApiCallback(InterfaceC83723WtT interfaceC83723WtT) {
        getCameraController().setSensitiveApiCallback(interfaceC83723WtT);
        getAudioController().setSensitiveApiCallback(interfaceC83723WtT);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setUseAudioGraph(boolean z) {
        getAudioController().LIZIZ(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void t8(Surface surface) {
        getMediaController().t8(surface);
    }

    @Override // X.InterfaceC83624Wrs
    public final void u4(boolean z) {
        getEffectController().u4(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void u9(Cert cert) {
        getMediaController().T8(false, cert);
    }

    @Override // X.InterfaceC83624Wrs
    public final void w4(boolean z) {
        getEffectController().w4(z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void w9(CameraModule cameraModule) {
        getCameraController().LJIIJ(cameraModule);
    }

    @Override // X.InterfaceC83624Wrs
    public final void z9(C83656WsO c83656WsO) {
        getCameraController().LJIJ(c83656WsO);
    }

    @Override // X.InterfaceC83624Wrs
    public final void setAudioDevice(IC8 device) {
        o.LJIIIZ(device, "device");
        getAudioController().setAudioDevice(device);
    }

    @Override // X.InterfaceC83624Wrs
    public final void C7(boolean z, Cert cert) {
        getCameraController().LJIILLIIL(cert, z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void D9(C78862UxG c78862UxG, boolean z) {
        if (this.LJLJLLL != z) {
            this.LJLJLLL = z;
            getMediaController().T8(z, c78862UxG);
        }
    }

    @Override // X.InterfaceC83624Wrs
    public final void K9(C83639Ws7 c83639Ws7, Cert cert) {
        getCameraController().LJFF(c83639Ws7, cert);
    }

    @Override // X.InterfaceC83624Wrs
    public final boolean LLJJLIIIJLLLLLLLZ(float f, float f2) {
        return getCameraController().LLJJLIIIJLLLLLLLZ(f, f2);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLJIL(C83932Wwq c83932Wwq, String workSpacePath) {
        o.LJIIIZ(workSpacePath, "workSpacePath");
        this.LJLLILLLL.s4().LLLLLJIL(c83932Wwq, workSpacePath);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLL(int i, int i2) {
        LIZJ().LLLLLL(i, i2);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLZLLIL(float f, float f2) {
        LIZJ().LLLLZLLIL(f, f2);
    }

    @Override // X.InterfaceC83624Wrs
    public final int LLZLLIL(ActivityC45651qj context, I86 i86) {
        o.LJIIIZ(context, "context");
        return getMediaController().LLZLLIL(context, i86);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZZ(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        getMediaController().LLZZ(interfaceC88472Yns, z);
    }

    @Override // X.InterfaceC83624Wrs
    public final int LLZZLLIL(C29S context, I86 i86) {
        o.LJIIIZ(context, "context");
        return getMediaController().LLZZLLIL(context, i86);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZZZIL(InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        getMediaController().LLZZZIL(interfaceC65784Pro, interfaceC88472Yns);
    }

    @Override // X.InterfaceC83624Wrs
    public final void s9(Cert cert, boolean z) {
        getAudioController().LJI(cert, z);
    }

    @Override // X.InterfaceC83624Wrs
    public final void v9(InterfaceC83927Wwl recorderContext, C83733Wtd c83733Wtd) {
        o.LJIIIZ(recorderContext, "recorderContext");
        this.LJLJJL = recorderContext;
        this.LJLLILLLL.t4().LLLZI(this.LJLJLJ);
    }

    @Override // X.InterfaceC83624Wrs
    public final void G9(int i, int i2, WS2 ws2) {
        getEffectController().ga(i, i2, ws2);
    }

    @Override // X.InterfaceC83624Wrs
    public final void I9(int i, C83639Ws7 c83639Ws7, Cert cert) {
        getCameraController().LJJIJIL(i, c83639Ws7, cert);
    }

    @Override // X.InterfaceC83624Wrs
    public final void J1(String[] strArr, double[] dArr, boolean[] zArr) {
        getEffectController().J1(strArr, dArr, zArr);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZZZZ(String str, double d, AObjectS123S0200000_7 aObjectS123S0200000_7) {
        getMediaController().LLZZZZ(str, d, aObjectS123S0200000_7);
    }

    @Override // X.InterfaceC83624Wrs
    public final void r9(int i, C83660WsS c83660WsS, Cert cert) {
        getCameraController().LJJIJL(i, c83660WsS, cert);
    }

    @Override // X.InterfaceC83624Wrs
    public final void u8(Surface surface, String deviceName, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(surface, "surface");
        o.LJIIIZ(deviceName, "deviceName");
        getMediaController().u8(surface, deviceName, interfaceC88472Yns);
    }

    @Override // X.InterfaceC83624Wrs
    public final void J9(long j, long j2, String str, boolean z) {
        LLZZJLIL(j, j2, str, z, false);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LJJIJL(int i, long j, long j2, String msg) {
        o.LJIIIZ(msg, "msg");
        getEffectController().LJJIJL(i, j, j2, msg);
    }

    @Override // X.InterfaceC83624Wrs
    public final int LLLII(String strImagePath, int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> callback) {
        o.LJIIIZ(strImagePath, "strImagePath");
        o.LJIIIZ(callback, "callback");
        return getMediaController().LLLII(strImagePath, i, i2, callback);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLLLLLZIL(C83817Wuz c83817Wuz, InterfaceC88472Yns interfaceC88472Yns, InterfaceC83737Wth cameraOpenListener, Cert cert) {
        o.LJIIIZ(cameraOpenListener, "cameraOpenListener");
        LIZLLL().LLLLLLIL(new C83875Wvv(this, cameraOpenListener));
        getCameraController().LLLLLLLZIL(c83817Wuz, interfaceC88472Yns, cameraOpenListener, cert);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZZJLIL(long j, long j2, String str, boolean z, boolean z2) {
        getMediaController().LLZZJLIL(j, j2, str, z, z2);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLZLL(double d, boolean z, float f, int i, int i2, AObjectS123S0200000_7 aObjectS123S0200000_7) {
        getMediaController().LLZLL(d, z, f, i, i2, aObjectS123S0200000_7);
    }

    @Override // X.InterfaceC83624Wrs
    public final void LLLZZIL(String strImagePath, int i, int i2, boolean z, Bitmap.CompressFormat format, InterfaceC88472Yns<? super Integer, C76800UCe> callback, boolean z2) {
        o.LJIIIZ(strImagePath, "strImagePath");
        o.LJIIIZ(format, "format");
        o.LJIIIZ(callback, "callback");
        getMediaController().LLLZZIL(strImagePath, i, i2, z, format, callback, z2);
    }

    public C83860Wvg(LifecycleOwner mLifecycleOwner, InterfaceC83725WtV captureSessionService, AObjectS57S0101000_14 aObjectS57S0101000_14, InterfaceC83867Wvn recorder, AObjectS139S0100000_14 aObjectS139S0100000_14, AObjectS139S0100000_14 aObjectS139S0100000_142, AObjectS54S0101000_9 aObjectS54S0101000_9, AObjectS42S0101000_5 aObjectS42S0101000_5) {
        o.LJIIIZ(mLifecycleOwner, "mLifecycleOwner");
        o.LJIIIZ(captureSessionService, "captureSessionService");
        o.LJIIIZ(recorder, "recorder");
        this.LJLLI = mLifecycleOwner;
        this.LJLLILLLL = captureSessionService;
        this.LJLLJ = aObjectS57S0101000_14;
        this.LJLLL = recorder;
        this.LJLLLL = aObjectS139S0100000_14;
        this.LJLLLLLL = aObjectS139S0100000_142;
        this.LJLZ = aObjectS54S0101000_9;
        this.LJZ = aObjectS42S0101000_5;
        this.LJLIL = captureSessionService.LIZLLL();
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 488));
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 487));
        this.LJLJJI = mLifecycleOwner;
        C83877Wvx c83877Wvx = new C83877Wvx();
        this.LJLJJLL = c83877Wvx;
        CopyOnWriteArrayList<InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(c83877Wvx);
        this.LJLJL = copyOnWriteArrayList;
        this.LJLJLJ = new IDqS456S0100000_14(this, 4);
    }
}
